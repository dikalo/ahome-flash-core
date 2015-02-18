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

package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.factories.GroupSpecifierFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The LocalConnection class lets you create a LocalConnection object that can
 * invoke a method in another LocalConnection object
 */
public class LocalConnection extends EventDispatcher {

    /**
     * Instantiates a new local connection.
     */
    public LocalConnection() {
        jsObj = createNativePeer();
    }

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.net.LocalConnection");
    }

    /**
     * Specifies one or more domains that can send LocalConnection calls to this
     * LocalConnection instance.
     * 
     * @param domain the domain
     */
    public native void allowDomain(String... domain) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.allowDomain.apply(domain);
    }-*/;

    /**
     * Specifies one or more domains that can send LocalConnection calls to this
     * LocalConnection object.
     * 
     * @param inSecureDomain the in secure domain
     */
    public native void allowInSecureDomain(String... inSecureDomain) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.allowInsecureDomain.apply(inSecureDomain);
    }-*/;

    /**
     * Closes (disconnects) a LocalConnection object.
     */
    public native void close() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Prepares a LocalConnection object to receive commands that are sent from
     * a send() command (from the sending LocalConnection object).
     * 
     * @param connectionName the connection name
     */
    public native void connect(String connectionName) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.connect(connectionName);
    }-*/;

    /**
     * Invokes the method named methodName on a connection that was opened with
     * the connect(connectionName) method (in the receiving LocalConnection
     * object).
     * 
     * @param connectionName the connection name
     * @param methodName the method name
     * @param arguments the arguments
     */
    public native void send(String connectionName, String methodName, String... arguments) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.send.apply(connectionName, methodName, arguments);
    }-*/;

    /**
     * Indicates the object on which callback methods are invoked.
     * 
     * @param <T> the generic type
     * @return the client
     */
    public native <T> T getClient() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getclient();
    }-*/;

    /**
     * Sets the object on which callback methods are invoked.
     * 
     * @param value the new client
     */
    public native void setClient(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setclient(value);
    }-*/;

    /**
     * A string representing the domain of the location of the current file.
     * 
     * @return the domain
     */
    public native String getDomain() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdomain();
    }-*/;

    public native boolean isPerUser() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisPerUser();
    }-*/;

    /**
     * Sets the checks if is per user.
     * 
     * @param value the new checks if is per user
     */
    public native void setIsPerUser(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setisPerUser(value);
    }-*/;

    /**
     * The isSupported property is set to true if the LocalConnection class is
     * supported on the current platform, otherwise it is set to false
     * 
     * @return true, if is supported
     */
    public static boolean isSupported() {
        return GroupSpecifierFactory.INSTANCE.isLocationConnectionSupported();
    }
}
