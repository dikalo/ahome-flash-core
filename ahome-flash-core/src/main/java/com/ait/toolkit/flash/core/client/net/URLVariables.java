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

package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;

/**
 * The URLVariables class allows you to transfer variables between an
 * application and a server. Use URLVariables objects with methods of the
 * URLLoader class, with the data property of the URLRequest class, and with
 * flash.net package functions.
 */
public class URLVariables extends JsObject {

    /**
     * New instance.
     * 
     * @return the uRL variables
     */
    public URLVariables() {
        jsObj = NetFactory.INSTANCE.createURLVariables();
    }

    /**
     * New instance.
     * 
     * @param source the source
     * @return the uRL variables
     */
    public URLVariables(String source) {
        jsObj = NetFactory.INSTANCE.createURLVariables(source);
    }

    /**
     * Decode.
     * 
     * @param value the value
     */
    public native void decode(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.decode(value);
    }-*/;

    /**
     * Gets the string value.
     * 
     * @return the string value
     */
    public native String getStringValue()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.toString();
    }-*/;

}
