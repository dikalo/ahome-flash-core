/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
/*
 * Copyright 2010 Alain Ekambi
 */
package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The SharedObject class is used to read and store limited amounts of data on a
 * user's computer or on a server. Shared objects offer real-time data sharing
 * between multiple client SWF files and objects that are persistent on the
 * local computer or remote server. Local shared objects are similar to browser
 * cookies and remote shared objects are similar to real-time data transfer
 * devices. To use remote shared objects, you need Adobe FlashDetect Media Server.
 */
public class SharedObject extends EventDispatcher {

    SharedObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the local.
     * 
     * @param name the name
     * @return the local
     */
    public static SharedObject getLocal(String name) {
        return new SharedObject(NetFactory.INSTANCE.createLocalSharedObject(name));
    }

    /**
     * Gets the local.
     * 
     * @param name the name
     * @param localPath the local path
     * @return the local
     */
    public static SharedObject getLocal(String name, String localPath) {
        return new SharedObject(NetFactory.INSTANCE.createLocalSharedObject(name, localPath));
    }

    /**
     * Gets the local.
     * 
     * @param name the name
     * @param localPath the local path
     * @param secure the secure
     * @return the local
     */
    public static SharedObject getLocal(String name, String localPath, boolean secure) {
        return new SharedObject(NetFactory.INSTANCE.createLocalSharedObject(name, localPath, secure));
    }

    /**
     * Gets the remote.
     * 
     * @param name the name
     * @return the remote
     */
    public static SharedObject getRemote(String name) {
        return new SharedObject(NetFactory.INSTANCE.createRemoteSharedObject(name));
    }

    /**
     * Gets the remote.
     * 
     * @param name the name
     * @param remotePath the remote path
     * @return the remote
     */
    public static SharedObject getRemote(String name, String remotePath) {
        return new SharedObject(NetFactory.INSTANCE.createRemoteSharedObject(name, remotePath));
    }

    /**
     * Gets the remote.
     * 
     * @param name the name
     * @param remotePath the remote path
     * @param persistence the persistence
     * @return the remote
     */
    public static SharedObject getRemote(String name, String remotePath, Object persistence) {
        return new SharedObject(NetFactory.INSTANCE.createRemoteSharedObject(name, remotePath, persistence));
    }

    /**
     * Gets the remote.
     * 
     * @param name the name
     * @param remotePath the remote path
     * @param persistence the persistence
     * @param secure the secure
     * @return the remote
     */
    public static SharedObject getRemote(String name, String remotePath, Object persistence, boolean secure) {
        return new SharedObject(NetFactory.INSTANCE.createRemoteSharedObject(name, remotePath, persistence, secure));
    }

    /**
     * Gets the client.
     * 
     * @param <T> the generic type
     * @return the client
     */
    public native <T> T getClient()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getclient();
    }-*/;

    /**
     * Sets the client.
     * 
     * @param value the new client
     */
    public native void setClient(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setclient(value);
    }-*/;

    /**
     * Gets the default object encoding.
     * 
     * @return the default object encoding
     */
    public static ObjectEncoding getDefaultObjectEncoding() {
        return ObjectEncoding.fromValue(NetFactory.INSTANCE.getSharedObjectDefaulEncoding());
    }

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @return the data
     */
    public native <T> T getData()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the fps.
     * 
     * @param value the new fps
     */
    public native void setFps(double value)/*-{
		return new SharedObject
		peer.setfps(value);
    }-*/;

    /**
     * Gets the object encoding.
     * 
     * @return the object encoding
     */
    public ObjectEncoding getObjectEncoding() {
        return ObjectEncoding.fromValue(_getObjectEncoding());
    }

    /**
     * _get object encoding.
     * 
     * @return the int
     */
    private native int _getObjectEncoding() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectEncoding();
    }-*/;

    /**
     * Sets the object encoding.
     * 
     * @param encoding the new object encoding
     */
    public void setObjectEncoding(ObjectEncoding encoding) {
        setObjectEncoding(encoding.value);
    }

    /**
     * Sets the object encoding.
     * 
     * @param value the new object encoding
     */
    private native void setObjectEncoding(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setobjectEncoding(value);
    }-*/;

    /**
     * Gets the size.
     * 
     * @return the size
     */
    public native int getSize()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsize();
    }-*/;

    /**
     * Clear.
     */
    public native void clear() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Close.
     */
    public native void close() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Connect.
     * 
     * @param connectionString the connection string
     */
    public native void connect(String connectionString) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.connect(connectionString);
    }-*/;

    /**
     * Connect.
     * 
     * @param connectionString the connection string
     * @param param the param
     */
    public native void connect(String connectionString, String param) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.connect(connectionString, param);
    }-*/;

    /**
     * Flush.
     * 
     * @return the shared object flush status
     */
    /** Immediately writes a locally persistent shared object to a local file. */
    public SharedObjectFlushStatus flush() {
        return SharedObjectFlushStatus.fromValue(_flush());
    }

    /**
     * _flush.
     * 
     * @return the string
     */
    private native String _flush() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.flush();
    }-*/;

    /**
     * Flush.
     * 
     * @param minDiscSpace the min disc space
     * @return the shared object flush status
     */
    public SharedObjectFlushStatus flush(int minDiscSpace) {
        return SharedObjectFlushStatus.fromValue(_flush(minDiscSpace));
    }

    /**
     * _flush.
     * 
     * @param minDiscSpace the min disc space
     * @return the string
     */
    private native String _flush(int minDiscSpace) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.flush(minDiscSpace);
    }-*/;

    /**
     * Send.
     * 
     * @param arguments the arguments
     */
    public native void send(String... arguments) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.send(arguments);
    }-*/;

    /**
     * Sets the dirty.
     * 
     * @param propertyName the new dirty
     */
    public native void setDirty(String propertyName) /*-{
		return new SharedObject
		peer.setDirty(propertyName);
    }-*/;

    /**
     * Sets the property.
     * 
     * @param propertyName the property name
     * @param value the value
     */
    public native void setProperty(String propertyName, Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setProperty(propertyName, value);
    }-*/;

}
