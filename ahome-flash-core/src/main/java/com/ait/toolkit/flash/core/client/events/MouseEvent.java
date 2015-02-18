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
 * The Class MouseEvent.
 */
public class MouseEvent extends Event {

    /** The Constant CLICK. */
    public static String CLICK = "click";

    /** The Constant CONTEXT_MENU */
    public static String CONTEXT_MENU = "contextMenu";

    /** The Constant DOUBLE_CLICK. */
    public static String DOUBLE_CLICK = "doubleClick";

    /** The Constant MIDDLE_CLICK */
    public static String MIDDLE_CLICK = "middleClick";

    /** The Constant MIDDLE_MOUSE_DOWN */
    public static String MIDDLE_MOUSE_DOWN = "middleMouseDown";

    /** The Constant MIDDLE_MOUSE_DOWN */
    public static String MIDDLE_MOUSE_UP = "middleMouseUp";

    /** The Constant MOUSE_DOWN. */
    public static String MOUSE_DOWN = "mouseDown";

    /** The Constant MOUSE_MOVE. */
    public static String MOUSE_MOVE = "mouseMove";

    /** The Constant MOUSE_OUT. */
    public static String MOUSE_OUT = "mouseOut";

    /** The Constant MOUSE_OVER. */
    public static String MOUSE_OVER = "mouseOver";

    /** The Constant MOUSE_UP. */
    public static String MOUSE_UP = "mouseUp";

    /** The Constant MOUSE_WHEEL. */
    public static String MOUSE_WHEEL = "mouseWheel";

    /** The Constant RELASE_OUTSIDE. */
    public static String RELASE_OUTSIDE = "releaseOutSide";

    /** The Constant RIGHT_CLICK. */
    public static String RIGHT_CLICK = "rightClick";

    /** The Constant RIGHT_MOUSE_DOWN. */
    public static String RIGHT_MOUSE_DOWN = "rightMouseDown";

    /** The Constant RIGHT_MOUSE_UP. */
    public static String RIGHT_MOUSE_UP = "rightMouseUp";

    /** The Constant ROLL_OUT. */
    public static String ROLL_OUT = "rollOut";

    /** The Constant ROLL_OVER. */
    public static String ROLL_OVER = "rollOver";

    /**
     * Instantiates a new mouse event.
     */
    protected MouseEvent() {
    }

    MouseEvent(JavaScriptObject obj) {
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
     * Checks if is button down.
     * 
     * @return true, if is button down
     */
    public native boolean isButtonDown() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbuttonDown();
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
     * Gets the delta.
     * 
     * @return the delta
     */
    public native int getDelta() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdelta();
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
     * Gets the local y.
     * 
     * @return the local y
     */
    public native double getLocalY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlocalY();
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
     * Checks if is shift key.
     * 
     * @return true, if is shift key
     */
    public native boolean isShiftKey() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getshiftKey();
    }-*/;

    /**
     * Gets the stage x.
     * 
     * @return the stage x
     */
    public native double getStageX() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageX();
    }-*/;

    /**
     * Gets the stage y.
     * 
     * @return the stage y
     */
    public native double getStageY() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageY();
    }-*/;

    /**
     * Update after event.
     */
    public native void updateAfterEvent() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.updateAfterEvent();
    }-*/;

    public static MouseEvent cast(Event event) {
        return new MouseEvent(event.getJsObj());
    }
}
