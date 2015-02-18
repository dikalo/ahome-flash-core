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

package com.ait.toolkit.flash.core.client.filters;

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.geom.Matrix;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ColorMatrixFilter class lets you apply a 4 x 5 matrix transformation on
 * the RGBA color and alpha values of every pixel in the input image to produce
 * a result with a new set of RGBA color and alpha values. It allows saturation
 * changes, hue rotation, luminance to alpha, and various other effects. You can
 * apply the filter to any display object (that is, objects that inherit from
 * the DisplayObject class), such as MovieClip, SimpleButton, TextField, and
 * Video objects, as well as to BitmapData objects.
 */
public class ColorMatrixFilter extends BitmapFilter {

    /**
     * Instantiates a new color matrix filter.
     */
    public ColorMatrixFilter() {
        jsObj = createNativePeer();
    }

    /**
     * New instance.
     * 
     * @param matrix the matrix
     * @return the color matrix filter
     */
    public ColorMatrixFilter(Matrix matrix) {
        this();
        setMatrix(matrix);
    }

    /**
     * Sets the matrix.An array of 20 items for 4 x 5 color transform.
     * 
     * @param value the new matrix
     */
    public native void setMatrix(Matrix value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setmatrix(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the matrix. An array of 20 items for 4 x 5 color transform.
     * 
     * @return the matrix
     */
    public native Matrix getMatrix()/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getmatrix();
		return @com.ait.toolkit.flash.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.filters.ColorMatrixFilter");
    }

}
