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
 * The Class PressAndTapGestureEvent.
 */
public class PressAndTapGestureEvent extends GestureEvent {

    /** The Constant GESTURE_PRESS_AND_TAP. */
    public static String GESTURE_PRESS_AND_TAP = "gesturePressAndTap";

    /**
     * Instantiates a new press and tap gesture event.
     */
    protected PressAndTapGestureEvent() {

    }

    PressAndTapGestureEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the tap local x.
     * 
     * @return the tap local x
     */
    public native double getTapLocalX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettapLocalX();
    }-*/;

    /**
     * Sets the tap local x.
     * 
     * @param value the new tap local x
     */
    public native void setTapLocalX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settapLocalX(value);
    }-*/;

    /**
     * Gets the tap local y.
     * 
     * @return the tap local y
     */
    public native double getTapLocalY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettapLocalY();
    }-*/;

    /**
     * Sets the tap local y.
     * 
     * @param value the new tap local y
     */
    public native void setTapLocalY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settapLocalY(value);
    }-*/;

    /**
     * Gets the tap stage x.
     * 
     * @return the tap stage x
     */
    public native double getTapStageX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettapStageX();
    }-*/;

    /**
     * Gets the tap stage y.
     * 
     * @return the tap stage y
     */
    public native double getTapStageY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettapStageY();
    }-*/;

    public static PressAndTapGestureEvent cast(Event event) {
        return new PressAndTapGestureEvent(event.getJsObj());
    }

}
