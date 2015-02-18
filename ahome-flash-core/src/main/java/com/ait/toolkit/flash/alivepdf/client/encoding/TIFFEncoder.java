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

package com.ait.toolkit.flash.alivepdf.client.encoding;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.display.BitmapData;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class TIFFEncoder.
 */
public class TIFFEncoder extends JsObject {

    /**
     * Instantiates a new tIFF encoder.
     */
    TIFFEncoder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the tIFF encoder
     */
    private static TIFFEncoder create() {
        return new TIFFEncoder(Bridge.createObject("org.alivepdf.encoding.TIFFEncoder"));
    }

    /**
     * Encode.
     * 
     * @param image the image
     * @return the byte array
     */
    public static ByteArray encode(BitmapData image) {
        return create()._encode(image);
    }

    /**
     * _encode.
     * 
     * @param image the image
     * @return the byte array
     */
    private final native ByteArray _encode(BitmapData image)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.encode(image.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
