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
package com.ait.toolkit.flash.core.client.display;

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.media.SoundTransform;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The SimpleButton class lets you control all instances of button symbols in a
 * SWF file.
 */
public class SimpleButton extends InteractiveObject {

    /**
     * Instantiates a new simple button.
     */
    public SimpleButton() {
        jsObj = createNativePeer();
    }

    /**
     * New istance.
     * 
     * @param upState the up state
     * @return the simple button
     */
    public SimpleButton(DisplayObject upState) {
        this();
        setUpState(upState);
    }

    /**
     * New istance.
     * 
     * @param upState the up state
     * @param overState the over state
     * @return the simple button
     */
    public SimpleButton(DisplayObject upState, DisplayObject overState) {
        this(upState);
        setOverState(overState);
    }

    /**
     * New istance.
     * 
     * @param upState the up state
     * @param overState the over state
     * @param downState the down state
     * @return the simple button
     */
    public SimpleButton(DisplayObject upState, DisplayObject overState, DisplayObject downState) {
        this(upState, overState);
        setDownState(downState);
    }

    /**
     * New istance.
     * 
     * @param upState the up state
     * @param overState the over state
     * @param downState the down state
     * @param hitTestState the hit test state
     * @return the simple button
     */
    public SimpleButton(DisplayObject upState, DisplayObject overState, DisplayObject downState,
                    DisplayObject hitTestState) {
        this(upState, overState, overState);
        setHitTestState(hitTestState);
    }

    /**
     * Gets the down state.
     * 
     * @return the down state
     */
    public native DisplayObject getDownState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getdownState();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the down state.
     * 
     * @param value the new down state
     */
    public native void setDownState(DisplayObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setdownState(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public native boolean isEnabled() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getenabled();
    }-*/;

    /**
     * Sets the enabled.
     * 
     * @param value the new enabled
     */
    public native void setEnabled(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setenabled(value);
    }-*/;

    /**
     * Gets the hit test state.
     * 
     * @return the hit test state
     */
    public native DisplayObject getHitTestState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.gethitTestState();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the hit test state.
     * 
     * @param value the new hit test state
     */
    public native void setHitTestState(DisplayObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.sethitTestState(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the over state.
     * 
     * @return the over state
     */
    public native DisplayObject getOverState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getoverState();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the over state.
     * 
     * @param value the new over state
     */
    public native void setOverState(DisplayObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setoverState(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the sound transfor.
     * 
     * @return the sound transfor
     */
    public native SoundTransform getSoundTransfor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsoundTransform();
		return @com.ait.toolkit.flash.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the sound transform.
     * 
     * @param value the new sound transform
     */
    public native void setSoundTransform(SoundTransform value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsoundTransform(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Checks if is track as menu.
     * 
     * @return true, if is track as menu
     */
    public native boolean isTrackAsMenu() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettrackAsMenu();
    }-*/;

    /**
     * Sets the track as menu.
     * 
     * @param value the new track as menu
     */
    public native void setTrackAsMenu(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settrackAsMenu(value);
    }-*/;

    /**
     * Gets the up state.
     * 
     * @return the up state
     */
    public native DisplayObject getUpState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getupState();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the up state.
     * 
     * @param value the new up state
     */
    public native void setUpState(DisplayObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setupState(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Use hand cursor.
     * 
     * @return true, if successful
     */
    public native boolean useHandCursor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getuseHandCursor();
    }-*/;

    /**
     * Sets the use hand cursor.
     * 
     * @param value the new use hand cursor
     */
    public native void setUseHandCursor(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setuseHandCursor(value);
    }-*/;

    /**
     * New istance.
     * 
     * @return the simple button
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.SimpleButtom");
    }
}
