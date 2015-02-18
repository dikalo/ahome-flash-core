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
import com.ait.toolkit.flash.core.client.utils.ByteArray;

/**
 * The Class ExcelFile.
 */
public class ExcelFile extends JsObject {

	/**
	 * New instance.
	 * 
	 * @return the excel file
	 */
	public ExcelFile() {
		jsObj = Bridge.createObject("com.as3xls.xls.ExcelFile");
	}

	/**
	 * Adds the sheet.
	 * 
	 * @param s
	 *            the s
	 */
	public native void addSheet(Sheet sheet) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsheets().addItem(
				sheet.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Gets the sheet at.
	 * 
	 * @param index
	 *            the index
	 * @return the sheet at
	 */
	public native Sheet getSheetAt(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsheets().getItemAt(index);
	}-*/;

	/**
	 * Gets the main sheet.
	 * 
	 * @return the main sheet
	 */
	public Sheet getMainSheet() {
		return getSheetAt(0);
	}

	/**
	 * Gets the sheet count.
	 * 
	 * @return the sheet count
	 */
	public native int getSheetCount() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsheets().getLenght();
	}-*/;

	/**
	 * Save to byte array.
	 * 
	 * @return the byte array
	 */
	public native ByteArray saveToByteArray() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.saveToByteArray();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Load from byte array.
	 * 
	 * @param xls
	 *            the xls
	 */
	public native void loadFromByteArray(ByteArray xls) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadFromByteArray(xls.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

}
