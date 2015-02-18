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
 * The Class StatusEvent.
 */
public class StatusEvent extends Event {

    /** The Constant STATUS. */
    public static String STATUS = "status";

    /**
     * Instantiates a new status event.
     */
    protected StatusEvent() {
    }

    StatusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the code.
     * 
     * @return the code
     */
    public native String getCode() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcode();
    }-*/;

    /**
     * Sets the code.
     * 
     * @param value the new code
     */
    private native void setCode(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcode(value);
    }-*/;

    /**
     * Gets the level.
     * 
     * @return the level
     */
    public native String getLevel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlevel();
    }-*/;

    /**
     * Sets the level.
     * 
     * @param value the new level
     */
    private native void setLevel(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlevel(value);
    }-*/;

    public static StatusEvent cast(Event event) {
        return new StatusEvent(event.getJsObj());
    }
}
