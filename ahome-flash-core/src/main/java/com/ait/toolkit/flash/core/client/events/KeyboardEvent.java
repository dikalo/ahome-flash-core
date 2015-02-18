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

import com.ait.toolkit.flash.core.client.ui.KeyLocation;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class KeyboardEvent.
 */

public class KeyboardEvent extends Event {

    /** The Constant KEY_DOWN. */
    public static String KEY_DOWN = "keyDown";

    /** The Constant KEY_UP. */
    public static String KEY_UP = "keyUp";

    /**
     * Instantiates a new keyboard event.
     */
    protected KeyboardEvent() {
    }

    KeyboardEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

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
     * Gets the char code.
     * 
     * @return the char code
     */
    public native int getCharCode() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcharCode();
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
     * Gets the key code.
     * 
     * @return the key code
     */
    public native int getKeyCode() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getkeyCode();
    }-*/;

    /**
     * Gets the key location.
     * 
     * @return the key location
     */
    public KeyLocation getKeyLocation() {
        return KeyLocation.fromValue(_getKeyLocation());
    }

    /**
     * _get key location.
     * 
     * @return the int
     */
    private native int _getKeyLocation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getkeyLocation();
    }-*/;

    /**
     * Checks if is shift key.
     * 
     * @return true, if is shift key
     */
    public native boolean isShiftKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsShiftKey();
    }-*/;

    /**
     * Update after event.
     */
    public native void updateAfterEvent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    public static KeyboardEvent cast(Event event) {
        return new KeyboardEvent(event.getJsObj());
    }
}
