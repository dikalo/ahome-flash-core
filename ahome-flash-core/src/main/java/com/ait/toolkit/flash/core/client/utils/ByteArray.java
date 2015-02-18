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
package com.ait.toolkit.flash.core.client.utils;

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.net.ObjectEncoding;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ByteArray class provides methods and properties to optimize reading,
 * writing, and working with binary data.
 */
public class ByteArray extends IoClass {

    /**
     * New instance.
     * 
     * @return the byte array
     */
    public ByteArray() {
        jsObj = Bridge.createObject("flash.utils.ByteArray");
    }

    ByteArray(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the default object encoding.
     * 
     * @return the default object encoding
     */
    public static ObjectEncoding getDefaultObjectEncoding() {
        return ObjectEncoding.fromValue(NetFactory.INSTANCE.getByteArrayDefaultObjectEncoding());
    }

    /**
     * Sets the default object encoding.
     * 
     * @param objectEncoding
     *            the new default object encoding
     */
    public static void setDefaultObjectEncoding(ObjectEncoding objectEncoding) {
        NetFactory.INSTANCE.setByteArrayDefaultObjectEncoding(objectEncoding.value);
    }

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native double getLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Sets the length.
     * 
     * @param length
     *            the new length
     */
    public native void setLength(double length)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlength(length);
    }-*/;

    /**
     * Gets the position.
     * 
     * @return the position
     */
    public native double getPosition()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * Sets the position.
     * 
     * @param position
     *            the new position
     */
    public native void setPosition(double position)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setposition(position);
    }-*/;

    /**
     * Clear.
     */
    public native void clear() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Compress.
     * 
     * @param algorithm
     *            the algorithm
     */
    public void compress(CompressionAlgorithm algorithm) {
        _compress(algorithm.value);
    }

    private native void _compress(String algorithm) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.compress(algorithm);
    }-*/;

    /**
     * Deflate.
     */
    public native void deflate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.deflate();
    }-*/;

    /**
     * Inflate.
     */
    public native void inflate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.inflate();
    }-*/;

    /**
     * Uncompress.
     * 
     * @param algorithm
     *            the algorithm
     */
    public void uncompress(CompressionAlgorithm algorithm) {
        _uncompress(algorithm.value);
    }

    private native void _uncompress(String algorithm) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.uncompress(algorithm);
    }-*/;

}
