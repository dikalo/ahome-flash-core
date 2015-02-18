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
 * The Class HTTPStatusEvent.
 */
public class HTTPStatusEvent extends Event {

    /** The Constant HTTP_STATUS. */
    public static String HTTP_STATUS = "httpStatus";

    /**
     * Instantiates a new hTTP status event.
     */
    protected HTTPStatusEvent() {
    }

    HTTPStatusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the response url.
     * 
     * @return the response url
     */
    public native String getResponseURL() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getresponseURL();
    }-*/;

    /**
     * Sets the response url.
     * 
     * @param responseURL the new response url
     */
    public native void setResponseURL(String responseURL) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setresponseURL(responseURL);
    }-*/;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public native int getStatus() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstatus();
    }-*/;

    public static HTTPStatusEvent cast(Event event) {
        return new HTTPStatusEvent(event.getJsObj());
    }
}
