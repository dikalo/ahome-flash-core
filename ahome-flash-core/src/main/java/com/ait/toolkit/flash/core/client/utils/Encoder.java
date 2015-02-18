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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.display.BitmapData;
import com.ait.toolkit.flash.core.client.framework.Bridge;

public class Encoder extends JsObject {

    private static final Encoder INSTANCE = new Encoder();

    public static Encoder get() {
        return INSTANCE;
    }

    private Encoder() {
        jsObj = Bridge.createObject("com.emitrom.flash4j.encoding.Encoder");
    }

    public native ByteArray encodePNG(BitmapData img) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.encodePNG(img.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native ByteArray encodeJPG(BitmapData img) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.encodeJPG(img.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
