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

import com.ait.toolkit.flash.core.client.events.Event;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.events.handlers.FullScreenHandler;
import com.ait.toolkit.flash.core.client.events.handlers.StageVideoAvailabilityHandler;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.media.StageVideo;
import com.ait.toolkit.flash.core.client.toplevel.Flash;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Stage class represents the main drawing area. For SWF content running in
 * the browser (in FlashDetect Player), the Stage represents the entire area
 * where FlashDetect content is shown. For content running in AIR on desktop
 * operating systems, each NativeWindow object has a corresponding Stage object.
 * <p>
 * The Stage object is not globally accessible. You need to access it through
 * the stage property of a DisplayObject instance.
 * <p>
 * The Stage class has several ancestor classes : DisplayObjectContainer,
 * InteractiveObject, DisplayObject, and EventDispatcher from which it inherits
 * properties and methods. Many of these properties and methods are either
 * inapplicable to Stage objects, or require security checks when called on a
 * Stage object. The properties and methods that require security checks are
 * documented as part of the Stage class.
 */
public class Stage extends DisplayObjectContainer {

    /**
     * Instantiates a new stage.
     */
    protected Stage() {
    }

    protected Stage(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the color correction.
     * 
     * @return the color correction
     */
    public ColorCorrection getColorCorrection() {
        return ColorCorrection.fromValue(_getColorCorrection());
    }

    /**
     * _get color correction.
     * 
     * @return the string
     */
    private native String _getColorCorrection() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getColorCorrection();
    }-*/;

    /**
     * Sets the color correction.
     * 
     * @param colorCorrection
     *            the new color correction
     */
    public void setColorCorrection(ColorCorrection colorCorrection) {
        _setColorCorrection(colorCorrection.value);
    }

    /**
     * _set color correction.
     * 
     * @param colorCorrection
     *            the color correction
     */
    private native void _setColorCorrection(String colorCorrection) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcolorCorrection(colorCorrection);
    }-*/;

    /**
     * Gets the color correction support.
     * 
     * @return the color correction support
     */
    public ColorCorrectionSupport getColorCorrectionSupport() {
        return ColorCorrectionSupport.fromValue(_getColorCorrectionSupport());
    }

    /**
     * _get color correction support.
     * 
     * @return the string
     */
    private native String _getColorCorrectionSupport() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcolorCorrectionSupport();
    }-*/;

    /**
     * Gets the device orientation.
     * 
     * @return the device orientation
     */
    public native String getDeviceOrientation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdeviceOrientation();
    }-*/;

    /**
     * Gets the display state.
     * 
     * @return the display state
     */
    public StageDisplayState getDisplayState() {
        return StageDisplayState.fromValue(_getDisplayState());
    }

    /**
     * _get display state.
     * 
     * @return the string
     */
    private native String _getDisplayState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdisplayState();
    }-*/;

    /**
     * Sets the display state.
     * 
     * @param displayState
     *            the new display state
     */
    public void setDisplayState(StageDisplayState displayState) {
        _setDisplayState(displayState.value);
    }

    /**
     * _set display state.
     * 
     * @param displayState
     *            the display state
     */
    private native void _setDisplayState(String displayState) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdisplayState(displayState);
    }-*/;

    /**
     * Gets the quality.
     * 
     * @return the quality
     */
    public StageQuality getQuality() {
        return StageQuality.fromValue(_getQuality());
    }

    /**
     * _get quality.
     * 
     * @return the string
     */
    private native String _getQuality() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getquality();
    }-*/;

    /**
     * Sets the quality.
     * 
     * @param quality
     *            the new quality
     */
    public void setQuality(StageQuality quality) {
        _setQuality(quality.value);
    }

    /**
     * _set quality.
     * 
     * @param quality
     *            the quality
     */
    private native void _setQuality(String quality) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setquality(quality);
    }-*/;

    /**
     * Gets the align.
     * 
     * @return the align
     */
    public StageAlign getAlign() {
        return StageAlign.fromValue(_getAlign());
    }

    /**
     * _get align.
     * 
     * @return the string
     */
    private native String _getAlign() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalign();
    }-*/;

    /**
     * Sets the align.
     * 
     * @param align
     *            the new align
     */
    public void setAlign(StageAlign align) {
        _setAlign(align.value);
    }

    /**
     * _set align.
     * 
     * @param value
     *            the value
     */
    private native void _setAlign(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalign(value);
    }-*/;

    /**
     * Specifies whether this stage allows the use of the full screen mode
     */
    public native boolean allowFullScreen() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getallowFullScreen();
    }-*/;

    /**
     * Specifies whether this stage allows the use of the full screen with text
     * input mode
     */
    public native boolean allowFullScreenInteractive() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getallowFullScreenInteractive();
    }-*/;

    /**
     * Gets the focus.
     * 
     * @return the focus
     */
    public native InteractiveObject getFocus() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getfocus();
		return @com.ait.toolkit.flash.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the focus.
     * 
     * @param value
     *            the new focus
     */
    public native void setFocus(InteractiveObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setfocus(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the frame rate.
     * 
     * @return the frame rate
     */
    public native double getFrameRate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getframeRate();
    }-*/;

    /**
     * Sets the frame rate.
     * 
     * @param value
     *            the new frame rate
     */
    public native void setFrameRate(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setframeRate(value);
    }-*/;

    /**
     * Gets the full screen height.
     * 
     * @return the full screen height
     */
    public native int getFullScreenHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfullScreenHeight();
    }-*/;

    /**
     * Gets the full screen source rect.
     * 
     * @return the full screen source rect
     */
    public native Rectangle getFullScreenSourceRect() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getfullScreenSourceRect();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the full screen source rect.
     * 
     * @param value
     *            the new full screen source rect
     */
    public native void setFullScreenSourceRect(Rectangle value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setfullScreenSourceRect(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the full screen width.
     * 
     * @return the full screen width
     */
    public native int getFullScreenWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfullScreenWidth();
    }-*/;

    /**
     * Gets the scale mode.
     * 
     * @return the scale mode
     */
    public StageScaleMode getScaleMode() {
        return StageScaleMode.fromValue(_getScaleMode());
    }

    /**
     * _get scale mode.
     * 
     * @return the string
     */
    private native String _getScaleMode() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscaleMode();
    }-*/;

    /**
     * Sets the scale mode.
     * 
     * @param mode
     *            the new scale mode
     */
    public void setScaleMode(StageScaleMode mode) {
        _setScaleMode(mode.value);
    };

    /**
     * _set scale mode.
     * 
     * @param mode
     *            the mode
     */
    private native void _setScaleMode(String mode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscaleMode(mode);
    }-*/;

    /**
     * Show defaul context menu.
     * 
     * @return true, if successful
     */
    public native boolean showDefaultContextMenu() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getshowDefaultContextMenu();
    }-*/;

    /**
     * Sets the show defaul context menu.
     * 
     * @param value
     *            the new show defaul context menu
     */
    public native void setShowDefaultContextMenu(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setshowDefaultContextMenu(value);
    }-*/;

    /**
     * Stage focus rect.
     * 
     * @return true, if successful
     */
    public native boolean stageFocusRect() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageFocusRect();
    }-*/;

    /**
     * Sets the stage focus rect.
     * 
     * @param value
     *            the new stage focus rect
     */
    public native void setStageFocusRect(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setstageFocusRect(value);
    }-*/;

    /**
     * Gets the stage height.
     * 
     * @return the stage height
     */
    public native int getStageHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageHeight();
    }-*/;

    /**
     * Sets the stage height.
     * 
     * @param value
     *            the new stage height
     */
    public native void setStageHeight(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setstageHeight(value);
    }-*/;

    /**
     * Gets the stage width.
     * 
     * @return the stage width
     */
    public native int getStageWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstageWidth();
    }-*/;

    /**
     * Sets the stage width.
     * 
     * @param value
     *            the new stage width
     */
    public native void setStageWidth(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setstageWidth(value);
    }-*/;

    /**
     * Supports orientation change.
     * 
     * @return true, if successful
     */
    public native boolean supportsOrientationChange() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsupportsOrientationChange();
    }-*/;

    /**
     * Checks if is wmode gpu.
     * 
     * @return true, if is wmode gpu
     */
    public native boolean isWmodeGPU() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwmodeGPU;
    }-*/;

    /**
     * Invalidate.
     */
    public native void invalidate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.invalidate();
    }-*/;

    /**
     * Checks if is focus inaccessible.
     * 
     * @return true, if is focus inaccessible
     */
    public native boolean isFocusInaccessible() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfocusInaccessible();
    }-*/;

    public Stage3D getStage3D(int index) {
        return Flash.getStage3D(this, index);
    }

    public StageVideo getStageVideo(int index) {
        return Flash.getStageVideo(this, index);
    }

    /**
     * Dispatched when the Stage object enters, or leaves, full-screen mode. A
     * change in full-screen mode can be initiated through ActionScript, or the
     * user invoking a keyboard shortcut, or if the current focus leaves the
     * full-screen window.
     * 
     * @param handler
     */
    public native void addFullScreenHandler(FullScreenHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventlistener(
						@com.ait.toolkit.flash.core.client.events.FullScreenEvent::FULL_SCREEN,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.FullScreenEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.FullScreenHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/FullScreenEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched by the Stage object when the pointer moves out of the stage
     * area. If the mouse button is pressed, the event is not dispatched.
     * 
     * @param handler
     */
    public void addMouseLeaveHandler(EventHandler handler) {
        this.addEventHandler(Event.MOUSE_LEAVE, handler);
    }

    /**
     * Dispatched when the scaleMode property of the Stage object is set to
     * StageScaleMode.NO_SCALE and the SWF file is resized.
     * 
     * @param handler
     */
    public void addResizeHandler(EventHandler handler) {
        this.addEventHandler(Event.RESIZE, handler);
    }

    /**
     * Dispatched by the Stage object when the state of the stageVideos property
     * changes.
     * 
     * @param handler
     */
    public native void addStageVideoAvailabilityHandler(StageVideoAvailabilityHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventlistener(
						@com.ait.toolkit.flash.core.client.events.StageVideoAvailabilityEvent::STAGE_VIDEO_AVAILABILITY,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.StageVideoAvailabilityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.StageVideoAvailabilityHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/StageVideoAvailabilityEvent;)(eventObject);
						}));
    }-*/;

}
