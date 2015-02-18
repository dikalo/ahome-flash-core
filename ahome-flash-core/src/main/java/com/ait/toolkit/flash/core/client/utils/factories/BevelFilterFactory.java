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
import com.ait.toolkit.flash.core.client.filters.BitmapFilterQuality;
import com.ait.toolkit.flash.core.client.filters.BitmapFilterType;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating JavaScriptObject objects.
 */
public class BevelFilterFactory extends JsObject {

    private static final BevelFilterFactory INSTANCE = new BevelFilterFactory();

    public static BevelFilterFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new bevel filter factory.
     */
    private BevelFilterFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of BevelFilterFactory.
     * 
     * @return single instance of BevelFilterFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.BevelFilterFactory");
    }

    /**
     * Creates the.
     * 
     * @return the bevel filter
     */
    public final native JavaScriptObject create()/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create();
    }-*/;

    /**
     * Creates the.
     * 
     * @param distance the distance
     * @return the bevel filter
     */
    public final native JavaScriptObject create(double distance)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance);
    }-*/;

    /**
     * Creates the.
     * 
     * @param distance the distance
     * @param angle the angle
     * @return the bevel filter
     */
    public final native JavaScriptObject create(double distance, double angle)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle);
    }-*/;

    /**
     * Creates the.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @return the bevel filter
     */
    public final native JavaScriptObject create(double distance, double angle, double highlightColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor);
    }-*/;

    /**
     * Creates the.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @return the bevel filter
     */
    public final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha);
    }-*/;

    /**
     * Creates the.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @return the bevel filter
     */
    public final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor);
    }-*/;

    /**
     * Creates the.
     * 
     * @param distance the distance
     * @param angle the angle
     * @param highlightColor the highlight color
     * @param highlightAlpha the highlight alpha
     * @param shadowColor the shadow color
     * @param shadowAlpha the shadow alpha
     * @return the bevel filter
     */
    public final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha);
    }-*/;

    /**
     * Creates the.
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
    public final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha, double blurX)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha, blurX);
    }-*/;

    /**
     * Creates the.
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
    public final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha, double blurX, double blurY)/*-{
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha, blurX, blurY);
    }-*/;

    /**
     * Creates the.
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
    public final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha, double blurX, double blurY,
                    double strength)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha, blurX, blurY, strength);
    }-*/;

    /**
     * Creates the.
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
    public final JavaScriptObject create(double distance, double angle, double highlightColor, double highlightAlpha,
                    double shadowColor, double shadowAlpha, double blurX, double blurY, double strength,
                    BitmapFilterQuality quality) {
        return _create(distance, angle, highlightColor, highlightAlpha, shadowColor, shadowAlpha, blurX, blurY,
                        strength, quality.value);

    }

    /**
     * _create.
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
    private final native JavaScriptObject _create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha, double blurX, double blurY,
                    double strength, int quality)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha, blurX, blurY, strength);
    }-*/;

    /**
     * Creates the.
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
    public final JavaScriptObject create(double distance, double angle, double highlightColor, double highlightAlpha,
                    double shadowColor, double shadowAlpha, double blurX, double blurY, double strength,
                    BitmapFilterQuality quality, BitmapFilterType type) {

        return create(distance, angle, highlightColor, highlightAlpha, shadowColor, shadowAlpha, blurX, blurY,
                        strength, quality.value, type.value);

    }

    /**
     * Creates the.
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
    private final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha, double blurX, double blurY,
                    double strength, int quality, String type)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha, blurX, blurY, strength, quality);
    }-*/;

    /**
     * Creates the.
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
    public final JavaScriptObject create(double distance, double angle, double highlightColor, double highlightAlpha,
                    double shadowColor, double shadowAlpha, double blurX, double blurY, double strength,
                    BitmapFilterQuality quality, BitmapFilterType type, boolean knockout) {
        return create(distance, angle, highlightColor, highlightAlpha, shadowColor, shadowAlpha, blurX, blurY,
                        strength, quality.value, type.value, knockout);

    }

    /**
     * Creates the.
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
    private final native JavaScriptObject create(double distance, double angle, double highlightColor,
                    double highlightAlpha, double shadowColor, double shadowAlpha, double blurX, double blurY,
                    double strength, int quality, String type, boolean knockout)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.create(distance, angle, highlightColor, highlightAlpha,
				shadowColor, shadowAlpha, blurX, blurY, strength, quality,
				knockout);
    }-*/;

}
