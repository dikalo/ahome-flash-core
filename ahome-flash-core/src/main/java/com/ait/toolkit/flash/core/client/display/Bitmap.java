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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Bitmap class represents display objects that represent bitmap images.
 * These can be images that you load with the flash.display.Loader class, or
 * they can be images that you create with the Bitmap() constructor.
 * <p>
 * The Bitmap() constructor allows you to create a Bitmap object that contains a
 * reference to a BitmapData object. After you create a Bitmap object, use the
 * addChild() or addChildAt() method of the parent DisplayObjectContainer
 * instance to place the bitmap on the display list.
 * <p>
 * A Bitmap object can share its BitmapData reference among several Bitmap
 * objects, independent of translation or rotation properties. Because you can
 * create multiple Bitmap objects that reference the same BitmapData object,
 * multiple display objects can use the same complex BitmapData object without
 * incurring the memory overhead of a BitmapData object for each display object
 * instance.
 */
public class Bitmap extends DisplayObject {

    /**
     * Instantiates a new bitmap.
     */
    public Bitmap() {
        jsObj = createNativePeer();
    }

    public Bitmap(BitmapData data) {
        setBitmapData(data);
    }

    Bitmap(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Bitmap(BitmapData data, String pixedlSnapping) {
        this(data);
        setPixelSnapping(pixedlSnapping);
    }

    public Bitmap(BitmapData data, String pixedlSnapping, boolean smoothing) {
        this(data, pixedlSnapping);
        setSmoothing(smoothing);
    }

    /**
     * The BitmapData object being referenced.
     * 
     * @return the bitmap data
     */
    public native BitmapData getBitmapData() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getbitmapData();
		return @com.ait.toolkit.flash.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets The BitmapData object being referenced.
     * 
     * @param value
     *            the new bitmap data
     */
    public native void setBitmapData(BitmapData value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setbitmapData(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Controls whether or not the Bitmap object is snapped to the nearest
     * pixel.
     * 
     * @return the pixel snapping
     */
    public native String getPixelSnapping() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpixelSnapping();
    }-*/;

    /**
     * Controls whether or not the Bitmap object is snapped to the nearest
     * pixel.
     * 
     * @param value
     *            the new pixel snapping
     */
    public native void setPixelSnapping(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpixelSnapping(value);
    }-*/;

    /**
     * Controls whether or not the bitmap is smoothed when scaled.
     * 
     * @return the string
     */
    public native String isSmoothing() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsmoothing();
    }-*/;

    /**
     * Controls whether or not the bitmap is smoothed when scaled.
     * 
     * @param value
     *            the value
     * @return the string
     */
    public native String setSmoothing(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsmoothing(value);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Bitmap");
    }

    public static Bitmap from(DisplayObject peer) {
        return new Bitmap(peer.getJsObj());
    }
}
