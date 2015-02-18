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
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.media.SoundTransform;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Sprite class is a basic display list building block: a display list node
 * that can display graphics and can also contain children.
 * <p>
 * A Sprite object is similar to a movie clip, but does not have a timeline.
 * Sprite is an appropriate base class for objects that do not require
 * timelines. For example, Sprite would be a logical base class for user
 * interface (UI) components that typically do not use the timeline.
 * <p>
 * The Sprite class is new in ActionScript 3.0. It provides an alternative to
 * the functionality of the MovieClip class, which retains all the functionality
 * of previous ActionScript releases to provide backward compatibility.
 */
public class Sprite extends DisplayObjectContainer {

    /**
     * Instantiates a new sprite.
     */
    public Sprite() {
        jsObj = createNativePeer();
    }

    protected Sprite(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * New instance.
     * 
     * @return the sprite
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Sprite");
    }

    /**
     * Checks if is button mode.
     * 
     * @return true, if is button mode
     */
    public native boolean isButtonMode() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbuttonMode();
    }-*/;

    /**
     * Sets the button mode.
     * 
     * @param mode the new button mode
     */
    public native void setButtonMode(boolean mode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbuttonMode(mode);
    }-*/;

    /**
     * Gets the drop target.
     * 
     * @return the drop target
     */
    public native DisplayObject getDropTarget() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getdropTarget();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the graphics.
     * 
     * @return the graphics
     */
    public native Graphics getGraphics() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getgraphics();
		return @com.ait.toolkit.flash.core.client.display.Graphics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the hit area.
     * 
     * @param area the new hit area
     */
    public native void setHitArea(Sprite area) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.sethitArea(area.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the hit area.
     * 
     * @return the hit area
     */
    public native Sprite getHitArea() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.gethitArea();
		return @com.ait.toolkit.flash.core.client.display.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
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
     * Gets the sound transform.
     * 
     * @return the sound transform
     */
    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsoundTransform();
		return @com.ait.toolkit.flash.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Use handcursor.
     * 
     * @return true, if successful
     */
    public native boolean useHandcursor() /*-{
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
     * Start drag.
     */
    public native void startDrag() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startDrag();
    }-*/;

    /**
     * Start drag.
     * 
     * @param lockCenter the lock center
     */
    public native void startDrag(boolean lockCenter) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startDrag(lockCenter);
    }-*/;

    /**
     * Start drag.
     * 
     * @param lockCenter the lock center
     * @param bounds the bounds
     */
    public native void startDrag(boolean lockCenter, Rectangle bounds) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.startDrag(
						lockCenter,
						bounds.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Start touch drag.
     * 
     * @param touchPointID the touch point id
     */
    public native void startTouchDrag(int touchPointID) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startTouchDrag(touchPointID);
    }-*/;

    /**
     * Start touch drag.
     * 
     * @param touchPointID the touch point id
     * @param lockCenter the lock center
     */
    public native void startTouchDrag(int touchPointID, boolean lockCenter) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startTouchDrag(touchPointID, lockCenter);
    }-*/;

    /**
     * Start touch drag.
     * 
     * @param touchPointID the touch point id
     * @param lockCenter the lock center
     * @param bounds the bounds
     */
    public native void startTouchDrag(int touchPointID, boolean lockCenter, Rectangle bounds) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.startTouchDrag(
						touchPointID,
						lockCenter,
						bounds.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Stop drag.
     */
    public native void stopDrag() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stopDrag();
    }-*/;

    /**
     * Stop touch drag.
     * 
     * @param touchPointID the touch point id
     */
    public native void stopTouchDrag(int touchPointID) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stopTouchDrag(touchPointID);
    }-*/;
}
