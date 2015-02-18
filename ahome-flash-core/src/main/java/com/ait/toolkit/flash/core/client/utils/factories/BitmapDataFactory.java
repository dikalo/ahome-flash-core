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
package com.ait.toolkit.flash.core.client.utils.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating BitmapData objects.
 */
public class BitmapDataFactory extends JsObject {

    private static final BitmapDataFactory INSTANCE = new BitmapDataFactory();

    public static BitmapDataFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new bitmap data factory.
     */
    private BitmapDataFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of BitmapDataFactory.
     * 
     * @return single instance of BitmapDataFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.BitmapDataFactory");
    }

    /**
     * Creates a new BitmapData object.
     * 
     * @param width the width
     * @param height the height
     * @return the bitmap data
     */
    public final native JavaScriptObject createBitmapData(int width, int height)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createBitmapData(width, height);
    }-*/;

    /**
     * Creates a new BitmapData object.
     * 
     * @param width the width
     * @param height the height
     * @param transparent the transparent
     * @return the bitmap data
     */
    public final native JavaScriptObject createBitmapData(int width, int height, boolean transparent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createBitmapData(width, height, transparent);
    }-*/;

    /**
     * Creates a new BitmapData object.
     * 
     * @param width the width
     * @param height the height
     * @param transparent the transparent
     * @param fillColor the fill color
     * @return the bitmap data
     */
    public final native JavaScriptObject createBitmapData(int width, int height, boolean transparent, int fillColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createBitmapData(width, height, transparent, fillColor);
    }-*/;

}
