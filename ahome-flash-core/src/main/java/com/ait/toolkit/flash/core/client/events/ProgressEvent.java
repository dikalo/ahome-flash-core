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
 * The Class ProgressEvent.
 */
public class ProgressEvent extends Event {

    /** The Constant PROGRESS. */
    public static String PROGRESS = "progress";

    /** The Constant SOCKET_DATA. */
    public static String SOCKET_DATA = "socketData";

    /**
     * Instantiates a new progress event.
     */
    protected ProgressEvent() {
    }

    protected ProgressEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the bytes loaded.
     * 
     * @return the bytes loaded
     */
    public native double getBytesLoaded() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Sets the bytes loaded.
     * 
     * @param value the new bytes loaded
     */
    private native void setBytesLoaded(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbytesLoaded(value);
    }-*/;

    /**
     * Gets the bytes total.
     * 
     * @return the bytes total
     */
    public native int getBytesTotal() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Sets the bytes total.
     * 
     * @param value the new bytes total
     */
    public native void setBytesTotal(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbytesTotal(value);
    }-*/;

    public static ProgressEvent cast(Event event) {
        return new ProgressEvent(event.getJsObj());
    }
}
