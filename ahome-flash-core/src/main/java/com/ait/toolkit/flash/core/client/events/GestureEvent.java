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
 * The Class GestureEvent.
 */
public class GestureEvent extends Event {

    /**
     * Instantiates a new gesture event.
     */
    protected GestureEvent() {

    }

    GestureEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /** The Constant GESTURE_TWO_FINGER_TAP. */
    public static String GESTURE_TWO_FINGER_TAP = "gestureTwoFingerTap";

    /**
     * Update after event.
     */
    public native void updateAfterEvent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    /**
     * Checks if is alt key.
     * 
     * @return true, if is alt key
     */
    public native boolean isAltKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaltKey();
    }-*/;

    /**
     * Checks if is command key.
     * 
     * @return true, if is command key
     */
    public native boolean isCommandKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcommandKey();
    }-*/;

    /**
     * Checks if is control key.
     * 
     * @return true, if is control key
     */
    public native boolean isControlKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcontrolKey();
    }-*/;

    /**
     * Checks if is ctrl key.
     * 
     * @return true, if is ctrl key
     */
    public native boolean isCtrlKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getctrlKey();
    }-*/;

    /**
     * Checks if is shift key.
     * 
     * @return true, if is shift key
     */
    public native boolean isShiftKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getshiftKey();
    }-*/;

    /**
     * Gets the phase.
     * 
     * @return the phase
     */
    public GesturePhase getPhase() {
        return GesturePhase.fromValue(_getPhase());
    }

    private native String _getPhase() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getphase();
    }-*/;

    /**
     * Sets the phase.
     * 
     * @param value the new phase
     */

    public void setPhase(GesturePhase phase) {
        _setPhase(phase.value);
    }

    private native void _setPhase(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setphase(value);
    }-*/;

    /**
     * Gets the local x.
     * 
     * @return the local x
     */
    public native double getLocalX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlocalX();
    }-*/;

    /**
     * Sets the local x.
     * 
     * @param value the new local x
     */
    private native void setLocalX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlocalX(value);
    }-*/;

    /**
     * Gets the local y.
     * 
     * @return the local y
     */
    public native double getLocalY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlocalY();
    }-*/;

    /**
     * Sets the local y.
     * 
     * @param value the new local y
     */
    private native void setLocalY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlocalY(value);
    }-*/;

    /**
     * Gets the stage x.
     * 
     * @return the stage x
     */
    public native double getStageX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageX();
    }-*/;

    /**
     * Sets the stage x.
     * 
     * @param value the new stage x
     */
    private native void setStageX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getstageX(value);
    }-*/;

    /**
     * Gets the stage y.
     * 
     * @return the stage y
     */
    public native double getStageY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageY();
    }-*/;

    /**
     * Sets the stage y.
     * 
     * @param value the new stage y
     */
    public native void setStageY(double value) /*-{
		peer.setstageY(value);
    }-*/;

    public static GestureEvent cast(Event event) {
        return new GestureEvent(event.getJsObj());
    }
}
