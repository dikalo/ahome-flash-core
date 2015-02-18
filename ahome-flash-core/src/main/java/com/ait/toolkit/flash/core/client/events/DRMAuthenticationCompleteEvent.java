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

package com.ait.toolkit.flash.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DRMAuthenticationCompleteEvent.
 */
public class DRMAuthenticationCompleteEvent extends Event {

    /** The Constant AUTHENTICATION_COMPLETE. */
    public static String AUTHENTICATION_COMPLETE = "authenticationComplete";

    /**
     * Instantiates a new dRM authentication complete event.
     */
    protected DRMAuthenticationCompleteEvent() {
    }

    DRMAuthenticationCompleteEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the domain.
     * 
     * @return the domain
     */
    public native String getDomain() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdomain();

    }-*/;

    /**
     * Sets the domain.
     * 
     * @param value the new domain
     */
    private native void setDomain(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdomain(value);
    }-*/;

    /**
     * Gets the server url.
     * 
     * @return the server url
     */
    public native String getServerURL() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getserverURL();
    }-*/;

    /**
     * Sets the server url.
     * 
     * @param value the new server url
     */
    private native void setServerURL(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setserverURL(value);
    }-*/;

    /**
     * Gets the token.
     * 
     * @return the token
     */
    public native String getToken() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettoken();
    }-*/;

    /**
     * Sets the token.
     * 
     * @param value the new token
     */
    private native void setToken(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settoken(value);
    }-*/;

    public static DRMAuthenticationCompleteEvent cast(Event event) {
        return new DRMAuthenticationCompleteEvent(event.getJsObj());
    }

}
