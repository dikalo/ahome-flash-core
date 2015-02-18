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

import com.ait.toolkit.flash.core.client.utils.factories.BevelFilterFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BevelFilter class lets you add a bevel effect to display objects. A bevel
 * effect gives objects such as buttons a three-dimensional look. You can
 * customize the look of the bevel with different highlight and shadow colors,
 * the amount of blur on the bevel, the angle of the bevel, the placement of the
 * bevel, and a knockout effect. You can apply the filter to any display object
 * (that is, objects that inherit from the DisplayObject class), such as
 * MovieClip, SimpleButton, TextField, and Video objects, as well as to
 * BitmapData objects..
 */
public class BevelFilter extends BitmapFilter {

    /**
     * Instantiates a new bevel filter.
     */
    public BevelFilter() {
        jsObj = BevelFilterFactory.get().create();
    }

    public BevelFilter(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @return the bevel filter
     */
    public BevelFilter(double distance) {
        jsObj = BevelFilterFactory.get().create(distance);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle) {
        jsObj = BevelFilterFactory.get().create(distance, angle);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @param blurX the blur x
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha, double blurX) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha, blurX);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @param blurX the blur x
     * @param blurY the blur y
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha, double blurX, double blurY) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha, blurX, blurY);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @param blurX the blur x
     * @param blurY the blur y
     * @param strength the strength
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha, double blurX, double blurY, double strength) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha, blurX, blurY, strength);
    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @param blurX the blur x
     * @param blurY the blur y
     * @param strength the strength
     * @param quality the quality
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha, double blurX, double blurY, double strength, BitmapFilterQuality quality) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha, blurX, blurY, strength, quality);

    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @param blurX the blur x
     * @param blurY the blur y
     * @param strength the strength
     * @param quality the quality
     * @param type the type
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha, double blurX, double blurY, double strength, BitmapFilterQuality quality,
                    BitmapFilterType type) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha, blurX, blurY, strength, quality, type);

    }

    /**
     * New instance.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @param blurX the blur x
     * @param blurY the blur y
     * @param strength the strength
     * @param quality the quality
     * @param type the type
     * @param knockout the knockout
     * @return the bevel filter
     */
    public BevelFilter(double distance, double angle, double highlightColor, double highlightAlpha, double shadowColor,
                    double shadowAlpha, double blurX, double blurY, double strength, BitmapFilterQuality quality,
                    BitmapFilterType type, boolean knockout) {
        jsObj = BevelFilterFactory.get().create(distance, angle, highlightColor, highlightAlpha, shadowColor,
                        shadowAlpha, blurX, blurY, strength, quality, type, knockout);

    }

    /**
     * Gets the blur x.
     * 
     * @return the blur x
     */
    public native double getBlurX()/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblurX();
    }-*/;

    /**
     * Sets the blur x.
     * 
     * @param value the new blur x
     */
    public native void setBlurX(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblurX(value);
    }-*/;

    /**
     * Gets the blur y.
     * 
     * @return the blur y
     */
    public native double getBlurY()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblurY();
    }-*/;

    /**
     * Sets the blur y.
     * 
     * @param value the new blur y
     */
    public native void setBlurY(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblurY(value);
    }-*/;

    /**
     * Gets the distance.
     * 
     * @return the distance
     */
    public native double getDistance()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdistance();
    }-*/;

    /**
     * Sets the distance.
     * 
     * @param value the new distance
     */
    public native void setDistance(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdistance(value);
    }-*/;

    /**
     * Sets the highlight alpha.
     * 
     * @param value the new highlight alpha
     */
    public native void setHighlightAlpha(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sethighlightAlpha(value);
    }-*/;

    /**
     * Gets the highlight alpha.
     * 
     * @return the highlight alpha
     */
    public native double getHighlightAlpha()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gethighlightAlpha();
    }-*/;

    /**
     * Sets the highlight color.
     * 
     * @param value the new highlight color
     */
    public native void setHighlightColor(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sethighlightColor(value);
    }-*/;

    /**
     * Gets the highlight color.
     * 
     * @return the highlight color
     */
    public native double getHighlightColor()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gethighlightColor();
    }-*/;

    /**
     * Sets the knockout.
     * 
     * @param value the new knockout
     */
    public native void setKnockout(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setknockout(value);
    }-*/;

    /**
     * Checks if is knockout.
     * 
     * @return true, if is knockout
     */
    public native boolean isKnockout()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getknockout();
    }-*/;

    /**
     * Sets the quality.
     * 
     * @param quality the new quality
     */
    public void setQuality(BitmapFilterQuality quality) {
        _setQuality(quality.value);
    }

    /**
     * _set quality.
     * 
     * @param value the value
     */
    private native void _setQuality(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setquality(value);
    }-*/;

    /**
     * Gets the quality.
     * 
     * @return the quality
     */
    public BitmapFilterQuality getQuality() {
        return BitmapFilterQuality.fromValue(_getQuality());
    }

    /**
     * _get quality.
     * 
     * @return the int
     */
    private native int _getQuality()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getquality();
    }-*/;

    /**
     * Gets the shadow alpha.
     * 
     * @return the shadow alpha
     */
    public native double getShadowAlpha()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getshadowAlpha();
    }-*/;

    /**
     * Sets the shadow alpha.
     * 
     * @param value the new shadow alpha
     */
    public native void setShadowAlpha(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setshadowAlpha(value);
    }-*/;

    /**
     * Sets the shadow color.
     * 
     * @param value the new shadow color
     */
    public native void setShadowColor(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setshadowColor(value);
    }-*/;

    /**
     * Gets the shadow color.
     * 
     * @return the shadow color
     */
    public native int getShadowColor()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getshadowColor();
    }-*/;

    /**
     * Sets the type.
     * 
     * @param type the new type
     */
    public void setType(BitmapFilterType type) {
        _setType(type.value);
    }

    /**
     * _set type.
     * 
     * @param value the value
     */
    private native void _setType(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setType(value);
    }-*/;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public BitmapFilterType getType() {
        return BitmapFilterType.fromValue(_getType());
    }

    /**
     * _get type.
     * 
     * @return the string
     */
    private native String _getType()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettype();
    }-*/;

}
