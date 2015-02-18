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

package com.ait.toolkit.flash.excel.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;

/**
 * The Class Formatter.
 */
public class Formatter extends JsObject {

	private static final Formatter INSTANCE = new Formatter();

	private static Formatter getInstance() {
		return INSTANCE;
	}

	/**
	 * Gets the single instance of Formatter.
	 * 
	 * @return single instance of Formatter
	 */
	private Formatter() {
		jsObj = Bridge.createObject("com.as3xls.xls.Formatter");
	}

	/**
	 * Checks if is date.
	 * 
	 * @param fmt
	 *            the fmt
	 * @return true, if is date
	 */
	public static boolean isDate(String fmt) {
		return getInstance()._isDate(fmt);
	}

	/**
	 * _is date.
	 * 
	 * @param fmt
	 *            the fmt
	 * @return true, if successful
	 */
	private final native boolean _isDate(String fmt) /*-{
		return peer.isDate(fmt);
	}-*/;

	/**
	 * Format.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param value
	 *            the value
	 * @param fmt
	 *            the fmt
	 * @return the t
	 */
	public static <T> T format(Object value, String fmt) {
		return getInstance()._format(value, fmt);
	}

	/**
	 * _format.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param value
	 *            the value
	 * @param fmt
	 *            the fmt
	 * @return the t
	 */
	private final native <T> T _format(Object value, String fmt) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.format(value, fmt);
	}-*/;

	/**
	 * Format.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param value
	 *            the value
	 * @param fmt
	 *            the fmt
	 * @param base
	 *            the base
	 * @return the t
	 */
	public static <T> T format(Object value, String fmt, int base) {
		return getInstance()._format(value, fmt, base);
	}

	/**
	 * _format.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param value
	 *            the value
	 * @param fmt
	 *            the fmt
	 * @param base
	 *            the base
	 * @return the t
	 */
	private final native <T> T _format(Object value, String fmt, int base) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.format(value, fmt, base);
	}-*/;

}
