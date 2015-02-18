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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The Class URLRequest.
 */
public class URLRequest extends JsObject {

	URLRequest(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * New instance.
	 * 
	 * @return the uRL request
	 */
	public URLRequest() {
		jsObj = NetFactory.INSTANCE.createURLRequest();
	}

	/**
	 * New instance.
	 * 
	 * @param url
	 *            the url
	 * @return the uRL request
	 */
	public URLRequest(String url) {
		jsObj = NetFactory.INSTANCE.createURLRequest(url);
	}

	/**
	 * Gets the content type.
	 * 
	 * @return the content type
	 */
	public native String getContentType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcontentType();
	}-*/;

	/**
	 * Sets the content type.
	 * 
	 * @param contentType
	 *            the new content type
	 */
	public native void setContentType(String contentType) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcontentType(contentType);
	}-*/;

	/**
	 * Gets the data.
	 * 
	 * @param <T>
	 *            the generic type
	 * @return the data
	 */
	public native <T> T getData()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdata();
	}-*/;

	/**
	 * Sets the data.
	 * 
	 * @param value
	 *            the new data
	 */
	public native void setData(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdata(value);
	}-*/;

	/**
	 * Gets the digest.
	 * 
	 * @return the digest
	 */
	public native String getDigest()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdigest();
	}-*/;

	/**
	 * Sets the digest.
	 * 
	 * @param digest
	 *            the new digest
	 */
	public native void setDigest(String digest)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdigest(digest);
	}-*/;

	/**
	 * Gets the follow redirects.
	 * 
	 * @return the follow redirects
	 */
	public native boolean followRedirects()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfollowRedirects();
	}-*/;

	/**
	 * Sets the follow redirects.
	 * 
	 * @param followRedirects
	 *            the new follow redirects
	 */
	public native void setFollowRedirects(boolean followRedirects)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfollowRedirects(followRedirects);
	}-*/;

	/**
	 * Gets the method.
	 * 
	 * @return the method
	 */
	public URLRequestMethod getMethod() {
		return URLRequestMethod.fromValue(_getMethod());
	}

	/**
	 * _get method.
	 * 
	 * @return the string
	 */
	private native String _getMethod()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getMethod();
	}-*/;

	/**
	 * Sets the method.
	 * 
	 * @param method
	 *            the new method
	 */
	public void setMethod(URLRequestMethod method) {
		setMethod(method.value);
	}

	/**
	 * Sets the method.
	 * 
	 * @param method
	 *            the new method
	 */
	private native void setMethod(String method)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMethod(method);
	}-*/;

	/**
	 * Gets the request headers.
	 * 
	 * @return the request headers
	 */
	public List<URLRequestHeader> getRequestHeaders() {
		List<URLRequestHeader> list = new ArrayList<URLRequestHeader>();
		JavaScriptObject nativePeers = _getRequestHeaders();
		int size = JsoHelper.getJavaScriptObjectAs3ArraySize(nativePeers);
		for (int i = 0; i < size; i++) {
			list.add(new URLRequestHeader(JsoHelper
					.getValueFromJavaScriptObjectArray(nativePeers, i)));
		}
		return list;
	}

	private native JavaScriptObject _getRequestHeaders() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.requestHeaders();
	}-*/;

	/**
	 * Sets the request headers.
	 * 
	 * @param requestHeaders
	 *            the new request headers
	 */
	public void setRequestHeaders(URLRequestHeader... headers) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (URLRequestHeader header : headers) {
			values.push(header.getJsObj());
		}
		_setRequestHeaders(values);
	}

	private native void _setRequestHeaders(JavaScriptObject requestHeaders)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrequestHeaders(requestHeaders);
	}-*/;

	/**
	 * Gets the url.
	 * 
	 * @return the url
	 */
	public native String getUrl() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geturl();
	}-*/;

	/**
	 * Sets the url.
	 * 
	 * @param url
	 *            the new url
	 */
	public native void setUrl(String url)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.seturl(url);
	}-*/;

}
