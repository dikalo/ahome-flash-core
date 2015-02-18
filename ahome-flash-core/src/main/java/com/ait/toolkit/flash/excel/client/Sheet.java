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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class Sheet.
 */
public class Sheet extends JsObject {

	/**
	 * Instantiates a new sheet.
	 */
	Sheet(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * New instance.
	 * 
	 * @return the sheet
	 */
	public Sheet() {
		jsObj = Bridge.createObject("com.as3xls.xls.Sheet");
	}

	/**
	 * Resize.
	 * 
	 * @param rows
	 *            the rows
	 * @param cols
	 *            the cols
	 */
	public native void resize(int rows, int cols) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resize(rows, cols);
	}-*/;

	/**
	 * Gets the cell.
	 * 
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @return the cell
	 */
	public native Cell getCell(int row, int col) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCell(row, col);
		return @com.ait.toolkit.flash.excel.client.Cell::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Sets the cell.
	 * 
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @param value
	 *            the value
	 */
	public native void setCell(int row, int col, Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setCell(row, col, value);
	}-*/;

	/**
	 * Gets the values.
	 * 
	 * @param <T>
	 *            the generic type
	 * @return the values
	 */
	public native <T> T getValues() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvalues();
	}-*/;

	/**
	 * Gets the formats.
	 * 
	 * @return the formats
	 */
	public native JsArrayString getFormats()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getformats();
	}-*/;

	/**
	 * Sets the formats.
	 * 
	 * @param formats
	 *            the new formats
	 */
	public native void setFormats(JsArrayString formats)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setformats(formats);
	}-*/;

	/**
	 * Gets the x formats.
	 * 
	 * @return the x formats
	 */
	public native JsArrayString getXFormats()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getxFormats();
	}-*/;

	/**
	 * Sets the x formats.
	 * 
	 * @param formats
	 *            the new x formats
	 */
	public native void setXFormats(JsArrayString formats)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setxFormats(formats);
	}-*/;

	/**
	 * Gets the rows.
	 * 
	 * @return the rows
	 */
	public native int getRows()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrows();
	}-*/;

	/**
	 * Gets the cols.
	 * 
	 * @return the cols
	 */
	public native int getCols()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcols();
	}-*/;

	/**
	 * Gets the header.
	 * 
	 * @return the header
	 */
	public native String getHeader()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheader();
	}-*/;

	/**
	 * Sets the header.
	 * 
	 * @param newValue
	 *            the new header
	 */
	public native void setHeader(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setheader(newValue);
	}-*/;

	/**
	 * Gets the footer.
	 * 
	 * @return the footer
	 */
	public native String getFooter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfooter();
	}-*/;

	/**
	 * Sets the footer.
	 * 
	 * @param newValue
	 *            the new footer
	 */
	public native void setFooter(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfooter(newValue);
	}-*/;

	/**
	 * Gets the date mode.
	 * 
	 * @return the date mode
	 */
	public native int getDateMode()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdateMode();
	}-*/;

	/**
	 * Sets the date mode.
	 * 
	 * @param newValue
	 *            the new date mode
	 */
	public native void setDateMode(int newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdateMode(newValue);
	}-*/;

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public native String getName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getname();
	}-*/;

	/**
	 * Sets the name.
	 * 
	 * @param newValue
	 *            the new name
	 */
	public native void setName(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setname(newValue);
	}-*/;

}
