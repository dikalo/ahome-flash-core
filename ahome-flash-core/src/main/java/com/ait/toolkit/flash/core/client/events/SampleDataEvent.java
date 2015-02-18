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

import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SampleDataEvent.
 */
public class SampleDataEvent extends Event {

    /** The Constant SAMPLE_DATA. */
    public static String SAMPLE_DATA = "sampleData";

    /**
     * Instantiates a new sample data event.
     */
    protected SampleDataEvent() {
    }

    SampleDataEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public native ByteArray getData() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getdata();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    private native void setData(ByteArray value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setdata(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public native double getPosition() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param value the new position
     */
    private native void setPosition(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setposition(value);
    }-*/;

    public static SampleDataEvent cast(Event event) {
        return new SampleDataEvent(event.getJsObj());
    }
}
