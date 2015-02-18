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

package com.ait.toolkit.flash.core.client.geom;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ColorTransform class lets you adjust the color values in a display
 * object. The color adjustment or color transformation can be applied to all
 * four channels: red, green, blue, and alpha transparency.
 */
public class ColorTransform extends JsObject {

    /**
     * Instantiates a new color transform.
     */
    public ColorTransform() {
        jsObj = createNativePeer();
    }

    ColorTransform(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @return the color transform
     */
    public ColorTransform(double redMultiplier) {
        this();
        setRedMultiplier(redMultiplier);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier) {
        this(redMultiplier);
        setGreenMultiplier(greenMultiplier);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier) {
        this(redMultiplier, greenMultiplier);
        setBlueMultiplier(blueMultiplier);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @param alphaMutiplier the alpha mutiplier
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMutiplier) {
        this(redMultiplier, greenMultiplier, blueMultiplier);
        setAlphaMultiplier(alphaMutiplier);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @param alphaMutiplier the alpha mutiplier
     * @param redOffset the red offset
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMutiplier,
                    double redOffset) {
        this(redMultiplier, greenMultiplier, blueMultiplier, alphaMutiplier);
        setRedOffset(redOffset);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @param alphaMutiplier the alpha mutiplier
     * @param redOffset the red offset
     * @param greeOffset the gree offset
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMutiplier,
                    double redOffset, double greeOffset) {
        this(redMultiplier, greenMultiplier, blueMultiplier, alphaMutiplier, redOffset);
        setGreenOffset(greeOffset);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @param alphaMutiplier the alpha mutiplier
     * @param redOffset the red offset
     * @param greeOffset the gree offset
     * @param blueOffset the blue offset
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMutiplier,
                    double redOffset, double greenOffset, double blueOffset) {
        this(redMultiplier, greenMultiplier, blueMultiplier, alphaMutiplier, redOffset, greenOffset);
        setBlueOffset(blueOffset);
    }

    /**
     * New instance.
     * 
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @param alphaMutiplier the alpha mutiplier
     * @param redOffset the red offset
     * @param greeOffset the gree offset
     * @param blueOffset the blue offset
     * @param alphaOffset the alpha offset
     * @return the color transform
     */
    public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMutiplier,
                    double redOffset, double greenOffset, double blueOffset, double alphaOffset) {
        this(redMultiplier, greenMultiplier, blueMultiplier, alphaMutiplier, redOffset, greenOffset, blueOffset);
        setAlphaOffset(alphaOffset);
    }

    /**
     * Gets the alpha multiplier.
     * 
     * @return the alpha multiplier
     */
    public native double getAlphaMultiplier() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalphaMultiplier();
    }-*/;

    /**
     * Sets the alpha multiplier.
     * 
     * @param value the new alpha multiplier
     */
    public native void setAlphaMultiplier(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalphaMultiplier(value);
    }-*/;

    /**
     * Gets the alpha offset.
     * 
     * @return the alpha offset
     */
    public native double getAlphaOffset() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalphaOffset();
    }-*/;

    /**
     * Sets the alpha offset.
     * 
     * @param value the new alpha offset
     */
    public native void setAlphaOffset(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalphaOffset(value);
    }-*/;

    /**
     * Gets the blue multiplier.
     * 
     * @return the blue multiplier
     */
    public native double getBlueMultiplier() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblueMultiplier();
    }-*/;

    /**
     * Sets the blue multiplier.
     * 
     * @param value the new blue multiplier
     */
    public native void setBlueMultiplier(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblueMultiplier(value);
    }-*/;

    /**
     * Gets the blue offset.
     * 
     * @return the blue offset
     */
    public native double getBlueOffset() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblueOffset();
    }-*/;

    /**
     * Sets the blue offset.
     * 
     * @param value the new blue offset
     */
    public native void setBlueOffset(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblueOffset(value);
    }-*/;

    /**
     * Gets the color.The RGB color value for a ColorTransform object.
     * 
     * @return the color
     */
    public native double getColor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * Sets the color.The RGB color value for a ColorTransform object.
     * 
     * @param value the new color
     */
    public native void setColor(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * Gets the green multiplier.A decimal value that is multiplied with the
     * green channel value.
     * 
     * @return the green multiplier
     */
    public native double getGreenMultiplier() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgreenMultiplier();
    }-*/;

    /**
     * Sets the green multiplier.A number from -255 to 255 that is added to the
     * green channel value after it has been multiplied by the greenMultiplier
     * value.
     * 
     * 
     * @param value the new green multiplier.A decimal value that is multiplied
     *            with the green channel value.
     */
    public native void setGreenMultiplier(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setgreenMultiplier(value);
    }-*/;

    /**
     * Gets the green offset.A number from -255 to 255 that is added to the
     * green channel value after it has been multiplied by the greenMultiplier
     * value.
     * 
     * 
     * @return the green offset
     */
    public native double getGreenOffset() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgreenOffset();
    }-*/;

    /**
     * Sets the green offset.
     * 
     * @param value the new green offset
     */
    public native void setGreenOffset(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setgreenOffset(value);
    }-*/;

    /**
     * Gets the red multiplier.A decimal value that is multiplied with the red
     * channel value.
     * 
     * @return the red multiplier
     */
    public native double getRedMultiplier() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getredMultiplier();
    }-*/;

    /**
     * Sets the red multiplier.A decimal value that is multiplied with the red
     * channel value.
     * 
     * @param value the new red multiplier
     */
    public native void setRedMultiplier(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setredMultiplier(value);
    }-*/;

    /**
     * Gets the red offset.A number from -255 to 255 that is added to the red
     * channel value after it has been multiplied by the redMultiplier value.
     * 
     * 
     * @return the red offset
     */
    public native double getRedOffset() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getredOffset();
    }-*/;

    /**
     * Sets the red offset.A number from -255 to 255 that is added to the red
     * channel value after it has been multiplied by the redMultiplier value.
     * 
     * 
     * @param value the new red offset
     */
    public native void setRedOffset(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setredOffset(value);
    }-*/;

    /**
     * Concatenates the ColorTranform object specified by the second parameter
     * with the current ColorTransform object and sets the current object as the
     * result, which is an additive combination of the two color
     * transformations.
     * 
     * @param second the second
     */
    public native void concat(ColorTransform second) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.concat(second.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.ColorTransform");
    }
}
