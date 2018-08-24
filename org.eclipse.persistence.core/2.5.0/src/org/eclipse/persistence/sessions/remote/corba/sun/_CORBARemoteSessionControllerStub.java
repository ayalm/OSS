/*******************************************************************************
 * Copyright (c) 1998, 2013 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/  
package org.eclipse.persistence.sessions.remote.corba.sun;


/**
* INTERNAL:
* org/eclipse/persistence/remote/corba/sun/_CORBARemoteSessionControllerStub.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from CorbaRemoteSessionControllerSun.idl
* Monday, November 19, 2001 1:51:44 o'clock PM EST
*/
public class _CORBARemoteSessionControllerStub extends org.omg.CORBA.portable.ObjectImpl implements org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionController {
    // Constructors
    // NOTE:  If the default constructor is used, the
    //        object is useless until _set_delegate (...)
    //        is called.
    public _CORBARemoteSessionControllerStub() {
        super();
    }

    public _CORBARemoteSessionControllerStub(org.omg.CORBA.portable.Delegate delegate) {
        super();
        _set_delegate(delegate);
    }

    public org.eclipse.persistence.internal.sessions.remote.Transporter getLogin() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("getLogin", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return getLogin();
        } finally {
            _releaseReply(_in);
        }
    }
    // getLogin

    public org.eclipse.persistence.internal.sessions.remote.Transporter getDefaultReadOnlyClasses() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("getDefaultReadOnlyClasses", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return getDefaultReadOnlyClasses();
        } finally {
            _releaseReply(_in);
        }
    }
    // getDefaultReadOnlyClasses

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorCurrentIndex(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorCurrentIndex", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorCurrentIndex(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorCurrentIndex

    public org.eclipse.persistence.internal.sessions.remote.Transporter commitRootUnitOfWork(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("commitRootUnitOfWork", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return commitRootUnitOfWork(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // commitRootUnitOfWork

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorAbsolute(org.eclipse.persistence.internal.sessions.remote.Transporter arg0, int arg1) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorAbsolute", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _out.write_long(arg1);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorAbsolute(arg0, arg1);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorAbsolute

    public org.eclipse.persistence.internal.sessions.remote.Transporter cursoredStreamNextPage(org.eclipse.persistence.internal.sessions.remote.Transporter arg0, int arg1) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("cursoredStreamNextPage", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _out.write_long(arg1);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return cursoredStreamNextPage(arg0, arg1);
        } finally {
            _releaseReply(_in);
        }
    }
    // cursoredStreamNextPage

    public org.eclipse.persistence.internal.sessions.remote.Transporter executeQuery(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("executeQuery", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return executeQuery(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // executeQuery

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorFirst(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorFirst", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorFirst(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorFirst

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorAfterLast(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorAfterLast", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorAfterLast(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorAfterLast

    public org.eclipse.persistence.internal.sessions.remote.Transporter cursoredStreamClose(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("cursoredStreamClose", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return cursoredStreamClose(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // cursoredStreamClose

    public org.eclipse.persistence.internal.sessions.remote.Transporter getSequenceNumberNamed(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("getSequenceNumberNamed", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return getSequenceNumberNamed(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // getSequenceNumberNamed

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorClose(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorClose", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorClose(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorClose

    public org.eclipse.persistence.internal.sessions.remote.Transporter processCommand(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("processCommand", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return processCommand(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // processCommand

    public org.eclipse.persistence.internal.sessions.remote.Transporter cursorSelectObjects(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("cursorSelectObjects", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return cursorSelectObjects(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // cursorSelectObjects

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorLast(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorLast", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorLast(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorLast

    public org.eclipse.persistence.internal.sessions.remote.Transporter executeNamedQuery(org.eclipse.persistence.internal.sessions.remote.Transporter arg0, org.eclipse.persistence.internal.sessions.remote.Transporter arg1, org.eclipse.persistence.internal.sessions.remote.Transporter arg2) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("executeNamedQuery", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg1);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg2);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return executeNamedQuery(arg0, arg1, arg2);
        } finally {
            _releaseReply(_in);
        }
    }
    // executeNamedQuery

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorBeforeFirst(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorBeforeFirst", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorBeforeFirst(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorBeforeFirst

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorIsBeforeFirst(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorIsBeforeFirst", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorIsBeforeFirst(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorIsBeforeFirst

    public org.eclipse.persistence.internal.sessions.remote.Transporter beginTransaction() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("beginTransaction", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return beginTransaction();
        } finally {
            _releaseReply(_in);
        }
    }
    // beginTransaction
    
    public org.eclipse.persistence.internal.sessions.remote.Transporter beginEarlyTransaction() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("beginEarlyTransaction", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return beginTransaction();
        } finally {
            _releaseReply(_in);
        }
    }
    // beginEarlyTransaction

    public org.eclipse.persistence.internal.sessions.remote.Transporter initializeIdentityMapsOnServerSession() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("initializeIdentityMapsOnServerSession", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return initializeIdentityMapsOnServerSession();
        } finally {
            _releaseReply(_in);
        }
    }
    // initializeIdentityMapsOnServerSession

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorIsLast(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorIsLast", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorIsLast(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorIsLast

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorSize(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorSize", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorSize(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorSize

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorIsFirst(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorIsFirst", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorIsFirst(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorIsFirst

    public org.eclipse.persistence.internal.sessions.remote.Transporter getDescriptor(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("getDescriptor", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return getDescriptor(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // getDescriptor
    
    public org.eclipse.persistence.internal.sessions.remote.Transporter getDescriptorForAlias(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("getDescriptorForAlias", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return getDescriptor(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // getDescriptorForAlias

    public org.eclipse.persistence.internal.sessions.remote.Transporter cursoredStreamSize(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("cursoredStreamSize", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return cursoredStreamSize(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // cursoredStreamSize

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorRelative(org.eclipse.persistence.internal.sessions.remote.Transporter arg0, int arg1) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorRelative", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _out.write_long(arg1);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorRelative(arg0, arg1);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorRelative

    public org.eclipse.persistence.internal.sessions.remote.Transporter commitTransaction() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("commitTransaction", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return commitTransaction();
        } finally {
            _releaseReply(_in);
        }
    }
    // commitTransaction

    public org.eclipse.persistence.internal.sessions.remote.Transporter rollbackTransaction() {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("rollbackTransaction", true);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return rollbackTransaction();
        } finally {
            _releaseReply(_in);
        }
    }
    // rollbackTransaction

    public org.eclipse.persistence.internal.sessions.remote.Transporter instantiateRemoteValueHolderOnServer(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("instantiateRemoteValueHolderOnServer", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return instantiateRemoteValueHolderOnServer(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // instantiateRemoteValueHolderOnServer

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorNextObject(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorNextObject", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorNextObject(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorNextObject

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorPreviousObject(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorPreviousObject", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorPreviousObject(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorPreviousObject

    public org.eclipse.persistence.internal.sessions.remote.Transporter scrollableCursorIsAfterLast(org.eclipse.persistence.internal.sessions.remote.Transporter arg0) {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request("scrollableCursorIsAfterLast", true);
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(_out, arg0);
            _in = _invoke(_out);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream();
            String _id = _ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return scrollableCursorIsAfterLast(arg0);
        } finally {
            _releaseReply(_in);
        }
    }
    // scrollableCursorIsAfterLast

    // Type-specific CORBA::Object operations
    private static String[] __ids = { "IDL:org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController:1.0" };

    public String[] _ids() {
        return __ids.clone();
    }

    private void readObject(java.io.ObjectInputStream s) {
        try {
            String str = s.readUTF();
            org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init().string_to_object(str);
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate();
            _set_delegate(delegate);
        } catch (java.io.IOException e) {
        }
    }

    private void writeObject(java.io.ObjectOutputStream s) {
        try {
            String str = org.omg.CORBA.ORB.init().object_to_string(this);
            s.writeUTF(str);
        } catch (java.io.IOException e) {
        }
    }
}// class _CORBARemoteSessionControllerStub
