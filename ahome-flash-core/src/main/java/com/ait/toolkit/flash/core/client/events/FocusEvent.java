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

import com.ait.toolkit.flash.core.client.display.InteractiveObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class FocusEvent.
 * 
 */
public class FocusEvent extends Event {

    /** The Constant FOCUS_IN. */
    public static String FOCUS_IN = "focusIn";

    /** The Constant FOCUS_OUT. */
    public static String FOCUS_OUT = "focusOut";

    /** The Constant KEY_FOCUS_CHANGE. */
    public static String KEY_FOCUS_CHANGE = "keyFocusChange";

    /** The Constant MOUSE_FOCUS_CHANGE. */
    public static String MOUSE_FOCUS_CHANGE = "mouseFocusChange";

    /**
     * Instantiates a new focus event.
     */
    protected FocusEvent() {
    }

    FocusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is related object inaccessible.
     * 
     * @return true, if is related object inaccessible
     */
    public native boolean isRelatedObjectInaccessible() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisRelatedObjectInaccessible();
    }-*/;

    /**
     * Sets the checks if is related object inaccessible.
     * 
     * @param value the new checks if is related object inaccessible
     */
    private native void setIsRelatedObjectInaccessible(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setisRelatedObjectInaccessible(value);
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
     * Sets the key code.
     * 
     * @param value the new key code
     */
    private native void setKeyCode(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setkeyCode(value);
    }-*/;

    /**
     * Gets the related object.
     * 
     * @return the related object
     */
    public native InteractiveObject getRelatedObject() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getrelatedObject();
		return @com.ait.toolkit.flash.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Checks if is shit key.
     * 
     * @return true, if is shit key
     */
    public native boolean isShitKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getshiftKey();
    }-*/;

    /**
     * Shift key.
     * 
     * @param value the value
     */
    public native void shiftKey(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setshiftKey(value);
    }-*/;

    public static FocusEvent cast(Event event) {
        return new FocusEvent(event.getJsObj());
    }

}
