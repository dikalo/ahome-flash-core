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

import com.ait.toolkit.flash.core.client.display3D.Context3D;
import com.ait.toolkit.flash.core.client.events.ErrorEvent;
import com.ait.toolkit.flash.core.client.events.Event;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.handlers.ErrorHandler;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>
 * The Stage3D class provides a display area and a programmable rendering
 * context for drawing 2D and 3D graphics. Stage3D provides a high-performance
 * rendering surface for content rendered using the Context3D class. peer
 * surface uses the graphics processing unit (GPU) when possible. The runtime
 * stage provides a fixed number of Stage3D objects. The number of instances
 * varies by the type of device. Desktop computers typically provide four
 * Stage3D instances.
 * </p>
 * 
 * <p>
 * Content drawn to the Stage3D viewport is composited with other visible
 * graphics objects in a predefined order. The most distant are all StageVideo
 * surfaces. Stage3D comes next, with traditional FlashDetect display object content
 * being rendered last, on top of all others. StageVideo and Stage3D layers are
 * rendered with no transparency; thus a viewport completely obscures any other
 * Stage3D or StageVideo viewports positioned underneath it. Display list
 * content is rendered with transparency.
 * </p>
 * 
 * <p>
 * <b>Note:</b> You can use the visible property of a Stage3D object to remove
 * it from the display temporarily, such as when playing a video using the
 * StageVideo class.
 * <p>
 * 
 * A Stage3D object is retrieved from the Player stage using its stage3Ds
 * member. Use the Stage3D instance to request an associated rendering context
 * and to position the display on the runtime stage.
 * 
 */
public class Stage3D extends EventDispatcher {

    public Stage3D() {
        jsObj = createNativePeer();
    }

    Stage3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The Context3D object associated with peer Stage3D instance.
     * 
     * @return
     */
    public native Context3D getContext3D()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getcontext3D();
		return @com.ait.toolkit.flash.core.client.display3D.Context3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Specifies whether peer Stage3D object is visible.
     * 
     * @return
     */
    public native boolean isVisible()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvisible();
    }-*/;

    public native void setVisible(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setvisible(value);
    }-*/;

    /**
     * The horizontal coordinate of the Stage3D display on the stage, in pixels.
     * 
     * @return
     */
    public native double getX()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
    }-*/;

    public native void setX(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(value);
    }-*/;

    /**
     * The vertical coordinate of the Stage3D display on the stage, in pixels.
     * 
     * @return
     */
    public native double getY()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
    }-*/;

    public native void setY(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(value);
    }-*/;

    public native void requestContext3D()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.requestContext3D();
    }-*/;

    /**
     * Request the creation of a Context3D object for peer Stage3D instance.
     * 
     * @param context3DRenderMode
     */
    public native void requestContext3D(String context3DRenderMode)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.requestContext3D(context3DRenderMode);
    }-*/;

    /**
     * Dispatched when a rendering context is created.
     * 
     * @param handler
     */
    public void addContext3dCreateHandler(EventHandler handler) {
        addEventHandler(Event.CONTEXT3D_CREATE, handler);
    }

    /**
     * Dispatched when a request for a rendering context fails.
     * 
     * @param handler
     */
    public void addErrorHandler(ErrorHandler handler) {
        addNativeErrorHandler(ErrorEvent.ERROR, handler);
    }

    /**
     * New instance.
     * 
     * @return the sprite
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Stage3D");
    }

}
