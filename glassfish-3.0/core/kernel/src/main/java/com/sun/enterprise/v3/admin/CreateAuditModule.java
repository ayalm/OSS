/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2009 Sun Microsystems, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 *
 * Contributor(s):
 *
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.sun.enterprise.v3.admin;

import org.jvnet.hk2.config.types.Property;
import java.util.List;

import org.glassfish.api.admin.AdminCommand;
import org.glassfish.api.admin.AdminCommandContext;
import org.glassfish.api.I18n;
import org.glassfish.api.Param;
import org.glassfish.api.ActionReport;
import org.jvnet.hk2.annotations.Service;
import org.jvnet.hk2.annotations.Scoped;
import org.jvnet.hk2.annotations.Inject;
import org.jvnet.hk2.component.PerLookup;
import org.jvnet.hk2.config.ConfigSupport;
import org.jvnet.hk2.config.SingleConfigCode;
import org.jvnet.hk2.config.TransactionFailure;
import com.sun.enterprise.config.serverbeans.Configs;
import com.sun.enterprise.config.serverbeans.SecurityService;
import com.sun.enterprise.config.serverbeans.AuditModule;
import com.sun.enterprise.config.serverbeans.Config;
import com.sun.enterprise.util.LocalStringManagerImpl;

import java.beans.PropertyVetoException;

/**
 * Create Audit Module Command
 *
 * Usage: create-audit-module --classname classnme [--terse=false] 
 *        [--echo=false] [--interactive=true] [--host localhost] 
 *        [--port 4848|4849] [--secure | -s] [--user admin_user] 
 *        [--passwordfile file_name] [--property (name=value)
 *        [:name=value]*] [--target target(Default server)] audit_module_name
 *  
 * domain.xml element example
 * <audit-module classname="com.foo.security.Audit" name="AM">
 *     <property name="auditOn" value="false"/>
 * </audit-module>
 *
 * @author Nandini Ektare
 */

@Service(name="create-audit-module")
@Scoped(PerLookup.class)
@I18n("create.audit.module")
public class CreateAuditModule implements AdminCommand {
    
    final private static LocalStringManagerImpl localStrings = 
        new LocalStringManagerImpl(CreateAuditModule.class);    

    @Param(name="classname")
    String className;

    @Param(name="auditmodulename", primary=true)
    String auditModuleName;
    
    @Param(optional=true, name="property", separator=':')
    java.util.Properties properties;   
    
    @Param(optional=true)
    String target;

    @Inject
    Configs configs;

    /**
     * Executes the command with the command parameters passed as Properties
     * where the keys are paramter names and the values the parameter values
     *
     * @param context information
     */
    public void execute(AdminCommandContext context) {
        final ActionReport report = context.getActionReport();

        List <Config> configList = configs.getConfig();
        Config config = configList.get(0);
        SecurityService securityService = config.getSecurityService();
        
        // check if there exists an audit module by the specified name
        // if so return failure.
        List<AuditModule> ams = securityService.getAuditModule();
        for (AuditModule am : ams) {
            if (am.getName().equals(auditModuleName)) {
                report.setMessage(localStrings.getLocalString(
                    "create.audit.module.duplicatefound", 
                    "AuditModule named {0} exists. " +
                    "Cannot add duplicate AuditModule.", auditModuleName));
                report.setActionExitCode(ActionReport.ExitCode.FAILURE);
                return;
            }
        }
        
        // No duplicate audit modules found. So add one.
        try {
            ConfigSupport.apply(new SingleConfigCode<SecurityService>() {

                public Object run(SecurityService param) 
                throws PropertyVetoException, TransactionFailure {
                AuditModule newAuditModule = param.createChild(AuditModule.class);
                    populateAuditModuleElement(newAuditModule);                    
                    param.getAuditModule().add(newAuditModule);
                    return newAuditModule;
                }
            }, securityService);

        } catch(TransactionFailure e) {
            report.setMessage(localStrings.getLocalString("create.audit.module.fail", 
                    "Creation of AuditModule {0} failed", auditModuleName));
            report.setActionExitCode(ActionReport.ExitCode.FAILURE);
            report.setFailureCause(e);
            return;
        }
        report.setActionExitCode(ActionReport.ExitCode.SUCCESS);
        report.setMessage(localStrings.getLocalString("create.audit.module.success",
            "Creation of AuditModule {0} completed successfully", auditModuleName));        
    }       
    
    private void populateAuditModuleElement(AuditModule newAuditModule) 
    throws PropertyVetoException, TransactionFailure {
        newAuditModule.setName(auditModuleName);
        newAuditModule.setClassname(className);
        if (properties != null) {
            for (Object propname: properties.keySet()) {
                Property newprop = newAuditModule.createChild(Property.class);
                newprop.setName((String) propname);
                newprop.setValue(properties.getProperty((String) propname));            
                newAuditModule.getProperty().add(newprop);    
            }
        }
    }    
}