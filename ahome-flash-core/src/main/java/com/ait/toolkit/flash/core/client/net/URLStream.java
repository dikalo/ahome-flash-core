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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.IoClass;

/**
 * The URLStream class provides low-level access to downloading URLs. Data is
 * made available to application code immediately as it is downloaded, instead
 * of waiting until the entire file is complete as with URLLoader. The URLStream
 * class also lets you close a stream before it finishes downloading. The
 * contents of the downloaded file are made available as raw binary data.
 * <p>
 * The read operations in URLStream are nonblocking. This means that you must
 * use the bytesAvailable property to determine whether sufficient data is
 * available before reading it. An EOFError exception is thrown if insufficient
 * data is available.
 * <p>
 * All binary data is encoded by default in big-endian format, with the most
 * significant byte first.
 * <p>
 * The security rules that apply to URL downloading with the URLStream class are
 * identical to the rules applied to URLLoader objects. Policy files may be
 * downloaded as needed. Local file security rules are enforced, and security
 * warnings are raised as needed.
 */
public class URLStream extends IoClass {

    /**
     * Instantiates a new uRL stream.
     */
    public URLStream() {
        jsObj = Bridge.createObject("flash.net.URLStream");
    }

    /**
     * Checks if is connected.
     * 
     * @return true, if is connected
     */
    public native boolean isConnected() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getconnected();
    }-*/;

    /**
     * Close.
     */
    public native void close() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Load.
     * 
     * @param request the request
     */
    public native void load(URLRequest request) /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.load(request.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
