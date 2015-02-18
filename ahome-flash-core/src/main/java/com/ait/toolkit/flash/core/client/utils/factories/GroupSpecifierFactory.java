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
package com.ait.toolkit.flash.core.client.utils.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating GroupSpecifier objects.
 */
public class GroupSpecifierFactory extends JsObject {

    public static final GroupSpecifierFactory INSTANCE = new GroupSpecifierFactory();

    /**
     * Instantiates a new group specifier factory.
     */
    private GroupSpecifierFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of GroupSpecifierFactory.
     * 
     * @return single instance of GroupSpecifierFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.GroupSpecifierFactory");
    }

    /**
     * Creates the.
     * 
     * @param name the name
     * @return the group specifier
     */
    public final native JavaScriptObject create(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(name);
    }-*/;

    /**
     * Encode bootstrap peer id spec.
     * 
     * @param peerID the peer id
     * @return the string
     */
    public final native String encodeBootstrapPeerIDSpec(String peerID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.encodeBootstrapPeerIDSpec(peerID);
    }-*/;

    /**
     * Encode ip multicast address spec.
     * 
     * @param address the address
     * @return the string
     */
    public final native String encodeIPMulticastAddressSpec(String address)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.encodeIPMulticastAddressSpec(address);
    }-*/;

    /**
     * Encode ip multicast address spec.
     * 
     * @param address the address
     * @param port the port
     * @return the string
     */
    public final native String encodeIPMulticastAddressSpec(String address, Object port)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.encodeIPMulticastAddressSpec(address, port);
    }-*/;

    /**
     * Encode ip multicast address spec.
     * 
     * @param address the address
     * @param port the port
     * @param source the source
     * @return the string
     */
    public final native String encodeIPMulticastAddressSpec(String address, Object port, String source)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.encodeIPMulticastAddressSpec(address, port, source);
    }-*/;

    /**
     * Encode posting authorization.
     * 
     * @param password the password
     * @return the string
     */
    public final native String encodePostingAuthorization(String password)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.encodePostingAuthorization(password);
    }-*/;

    /**
     * Encode publishg authorization.
     * 
     * @param password the password
     * @return the string
     */
    public final native String encodePublishgAuthorization(String password)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.encodePublishgAuthorization(password);
    }-*/;

    /**
     * Checks if is location connection supported.
     * 
     * @return true, if is location connection supported
     */
    public final native boolean isLocationConnectionSupported()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isSupported();
    }-*/;

}
