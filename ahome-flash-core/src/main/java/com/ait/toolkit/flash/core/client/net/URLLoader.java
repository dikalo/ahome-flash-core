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

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;

/**
 * The URLLoader class downloads data from a URL as text, binary data, or
 * URL-encoded variables. It is useful for downloading text files, XML, or other
 * information to be used in a dynamic, data-driven application. A URLLoader
 * object downloads all of the data from a URL before making it available to
 * code in the applications. It sends out notifications about the progress of
 * the download, which you can monitor through the bytesLoaded and bytesTotal
 * properties, as well as through dispatched events.
 * <p>
 * When loading very large video files, such as FLV's, out-of-memory errors may
 * occur.
 */
public class URLLoader extends EventDispatcher {

    /**
     * New instance.
     * 
     * @return the uRL loader
     */
    public URLLoader() {
        jsObj = NetFactory.INSTANCE.createURLLoader();
    }

    /**
     * New instance.
     * 
     * @param request the request
     * @return the uRL loader
     */
    public URLLoader(URLRequest request) {
        jsObj = NetFactory.INSTANCE.createURLLoader(request);
    }

    /**
     * Gets the bytes loaded.
     * 
     * @return the bytes loaded
     */
    public native int getBytesLoaded() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Gets the bytes total.
     * 
     * @return the bytes total
     */
    public native int getBytesTotal() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @return the data
     */
    public native <T> T getData() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdata();
    }-*/;

    /**
     * Gets the data format.
     * 
     * @return the data format
     */
    public URLLoaderDataFormat getDataFormat() {
        return URLLoaderDataFormat.fromValue(_getDataFormat());
    }

    /**
     * _get data format.
     * 
     * @return the string
     */
    private native String _getDataFormat() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdataFormat();
    }-*/;

    /**
     * Sets the data format.
     * 
     * @param dataFormat the new data format
     */
    public void setDataFormat(URLLoaderDataFormat dataFormat) {
        _setDataFormat(dataFormat.value);
    }

    /**
     * _set data format.
     * 
     * @param value the value
     */
    private native void _setDataFormat(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdataFormat(value);
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
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.load(request.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
