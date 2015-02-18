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

/**
 * The JPEGXREncoderOptions class defines a compression algorithm for the
 * flash.display.BitmapData.encode() method.
 * 
 * @author Ekambi
 * 
 */
public class JPEGXREncoderOptions extends BitmapEncoderOptions {

    public JPEGXREncoderOptions() {
        jsObj = Bridge.createObject("flash.display.JPEGXREncoderOptions");
    }

    public JPEGXREncoderOptions(int quantization) {
        this();
        setQuantization(quantization);
    }

    public JPEGXREncoderOptions(int quantization, BitmapEncodingColorSpace colorSpace) {
        this(quantization);
        setColorSpace(colorSpace);
    }

    public JPEGXREncoderOptions(int quantization, BitmapEncodingColorSpace colorSpace, int timeFlexBits) {
        this(quantization, colorSpace);
        setTrimFlexBits(timeFlexBits);
    }

    /**
     * Specifies the amount of lossy in the compression.
     * 
     * @return
     */
    public native int getQuantization()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getquantization();
    }-*/;

    /**
     * Specifies the amount of lossy in the compression.
     */
    public native void setQuantization(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setquantization(value);
    }-*/;

    /**
     * Determines the amount of extra entropy data that is cut after
     * quantization.
     * 
     * @return
     */
    public native int getTrimFlexBits()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettrimFlexBits();
    }-*/;

    /**
     * Determines the amount of extra entropy data that is cut after
     * quantization.
     */
    public native void setTrimFlexBits(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settrimFlexBits(value);
    }-*/;

    /**
     * Specifies how color channels are sampled.
     * 
     * @return
     */

    public BitmapEncodingColorSpace getColorSpace() {
        return BitmapEncodingColorSpace.fromValue(_getColorSpace());
    }

    private native String _getColorSpace()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcolorSpace();
    }-*/;

    /**
     * Specifies how color channels are sampled.
     */
    public void setColorSpace(BitmapEncodingColorSpace colorSpace) {
        _setColorSpace(colorSpace.value);
    }

    private native void _setColorSpace(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcolorSpace(value);
    }-*/;

}
