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
 * The Class AccelerometerEvent.
 */
public class AccelerometerEvent extends Event {

    /** The Constant UPDATE. */
    public static String UPDATE = "update";

    /**
     * Instantiates a new accelerometer event.
     */
    protected AccelerometerEvent() {
    }

    AccelerometerEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the acceleration x.
     * 
     * @return the acceleration x
     */
    public native double getAccelerationX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaccelerationX();
    }-*/;

    /**
     * Sets the acceleration x.
     * 
     * @param value the new acceleration x
     */
    public native void setAccelerationX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setaccelerationX(value);
    }-*/;

    /**
     * Gets the acceleration y.
     * 
     * @return the acceleration y
     */
    public native double getAccelerationY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaccelerationY();
    }-*/;

    /**
     * Sets the acceleration y.
     * 
     * @param value the new acceleration y
     */
    public native void setAccelerationY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setaccelerationY(value);
    }-*/;

    /**
     * Gets the acceleration z.
     * 
     * @return the acceleration z
     */
    public native double getAccelerationZ() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaccelerationZ();
    }-*/;

    /**
     * Sets the acceleration z.
     * 
     * @param value the new acceleration z
     */
    public native void setAccelerationZ(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setaccelerationZ(value);
    }-*/;

    /**
     * Gets the time stamp.
     * 
     * @return the time stamp
     */
    public native double getTimeStamp() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettimeStamp();
    }-*/;

    /**
     * Sets the time stamp.
     * 
     * @param value the new time stamp
     */
    public native void setTimeStamp(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settimeStamp(value);
    }-*/;

    public static AccelerometerEvent cast(Event event) {
        return new AccelerometerEvent(event.getJsObj());
    }

}
