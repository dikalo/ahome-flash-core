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
 * The Class TransformGestureEvent.
 */
public class TransformGestureEvent extends GestureEvent {

    /** The Constant GESTURE_PAN. */
    public static String GESTURE_PAN = "gesturePan";

    /** The Constant GESTURE_ROTATE. */
    public static String GESTURE_ROTATE = "gestureRotate";

    /** The Constant GESTURE_SWIPE. */
    public static String GESTURE_SWIPE = "gestureSwipe";

    /** The Constant GESTURE_ZOOM. */
    public static String GESTURE_ZOOM = "gestureZoom";

    /**
     * Instantiates a new transform gesture event.
     */
    protected TransformGestureEvent() {

    }

    TransformGestureEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the offest x.
     * 
     * @return the offest x
     */
    public native double getOffestX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getoffsetX();
    }-*/;

    /**
     * Sets the offset x.
     * 
     * @param value the new offset x
     */
    private native void setOffsetX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setoffsetX(value);
    }-*/;

    /**
     * Gets the offest y.
     * 
     * @return the offest y
     */
    public native double getOffestY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getoffsetY();
    }-*/;

    /**
     * Sets the offset y.
     * 
     * @param value the new offset y
     */
    private native void setOffsetY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setoffsetY(value);
    }-*/;

    /**
     * Gets the scale x.
     * 
     * @return the scale x
     */
    public native double getScaleX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscaleX();
    }-*/;

    /**
     * Sets the scale x.
     * 
     * @param value the new scale x
     */
    private native void setScaleX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscaleX(value);
    }-*/;

    /**
     * Gets the scale y.
     * 
     * @return the scale y
     */
    public native double getScaleY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscaleY();
    }-*/;

    /**
     * Sets the scale y.
     * 
     * @param value the new scale y
     */
    private native void setScaleY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscaleY(value);
    }-*/;

    /**
     * Gets the rotation.
     * 
     * @return the rotation
     */
    public native double getRotation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrotation();
    }-*/;

    /**
     * Sets the rotation.
     * 
     * @param value the new rotation
     */
    private native void setRotation(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrotation(value);
    }-*/;

    public static TransformGestureEvent cast(Event event) {
        return new TransformGestureEvent(event.getJsObj());
    }

}
