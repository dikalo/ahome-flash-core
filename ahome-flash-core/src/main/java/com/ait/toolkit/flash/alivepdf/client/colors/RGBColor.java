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

package com.ait.toolkit.flash.alivepdf.client.colors;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class RGBColor.
 */
public class RGBColor extends BaseColor {

    /**
     * Instantiates a new rGB color.
     */
    RGBColor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param color
     *            the color
     * @return the rGB color
     */
    public RGBColor(double color) {
        jsObj = AlivePdfFactory.INSTANCE.createRGBColor(color);
    }

    /**
     * Sets the color.
     * 
     * @param value
     *            the new color
     */
    private final native void setColor(double value)/*-{
                                                    var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                                    this.setNumber(value);
                                                    }-*/;

    /**
     * Hex string to rgb color.
     * 
     * @param hex
     *            the hex
     * @return the rGB color
     */
    public static RGBColor hexStringToRGBColor(String hex) {
        return new RGBColor(AlivePdfFactory.INSTANCE.doRGBColorHexStringToRGBColor(hex));
    }

}
