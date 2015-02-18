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
 * The Class DataEvent.
 */
public class DataEvent extends TextEvent {

    /** The Constant DATA. */
    public static String DATA = "data";

    /** The Constant UPLOAD_COMPLETE_DATA. */
    public static String UPLOAD_COMPLETE_DATA = "uploadCompleteData";

    /**
     * Instantiates a new data event.
     */
    protected DataEvent() {
    }

    protected DataEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public native String getData() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    public native void setData(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdata(value);
    }-*/;

    public static DataEvent cast(Event event) {
        return new DataEvent(event.getJsObj());
    }

}
