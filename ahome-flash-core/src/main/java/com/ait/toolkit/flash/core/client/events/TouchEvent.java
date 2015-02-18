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
 * The Class TouchEvent.
 */
public class TouchEvent extends Event {

    /** The Constant TOUCH_BEGIN. */
    public static String TOUCH_BEGIN = "touchBegin";

    /** The Constant TOUCH_END. */
    public static String TOUCH_END = "touchEnd";

    /** The Constant TOUCH_MOVE. */
    public static String TOUCH_MOVE = "touchMove";

    /** The Constant TOUCH_OUT. */
    public static String TOUCH_OUT = "touchOut";

    /** The Constant TOUCH_OVER. */
    public static String TOUCH_OVER = "touchOver";

    /** The Constant TOUCH_ROLL_OUT. */
    public static String TOUCH_ROLL_OUT = "touchRollOut";

    /** The Constant TOUCH_ROLL_OVER. */
    public static String TOUCH_ROLL_OVER = "touchRollOver";

    /** The Constant TOUCH_TAP. */
    public static String TOUCH_TAP = "touchTap";

    /**
     * Instantiates a new touch event.
     */
    protected TouchEvent() {

    }

    TouchEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getText();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value the new text
     */
    private native void setText(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settext(value);
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
     * Gets the stage x.
     * 
     * @return the stage x
     */
    public native double getStageX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageX();
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
     * Sets the related object.
     * 
     * @param value the new related object
     */
    private native void setRelatedObject(InteractiveObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setrelatedObject(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the touch point id.
     * 
     * @return the touch point id
     */
    public native double getTouchPointID() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettouchPointID();
    }-*/;

    /**
     * Sets the touch point id.
     * 
     * @param value the new touch point id
     */
    private native void setTouchPointID(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settouchPointID(value);
    }-*/;

    /**
     * Checks if is primary touch point.
     * 
     * @return true, if is primary touch point
     */
    public native boolean isPrimaryTouchPoint() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisPrimaryTouchPoint();
    }-*/;

    /**
     * Sets the checks if is primary touch point.
     * 
     * @param value the new checks if is primary touch point
     */
    private native void setIsPrimaryTouchPoint(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setisPrimaryTouchPoint(value);
    }-*/;

    /**
     * Gets the pressure.
     * 
     * @return the pressure
     */
    public native double getPressure() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpressure();
    }-*/;

    /**
     * Sets the pressure.
     * 
     * @param value the new pressure
     */
    private native void setPressure(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpressure(value);
    }-*/;

    /**
     * Gets the size x.
     * 
     * @return the size x
     */
    public native double getSizeX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsizeX();
    }-*/;

    /**
     * Sets the size x.
     * 
     * @param value the new size x
     */
    private native void setSizeX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsizeX(value);
    }-*/;

    /**
     * Gets the size y.
     * 
     * @return the size y
     */
    public native double getSizeY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsizeY();
    }-*/;

    /**
     * Sets the size y.
     * 
     * @param value the new size y
     */
    private native void setSizeY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsizeY(value);
    }-*/;

    public static TouchEvent cast(Event event) {
        return new TouchEvent(event.getJsObj());
    }

}
