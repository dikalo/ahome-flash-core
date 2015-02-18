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
package com.ait.toolkit.flash.alivepdf.client.grid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.flash.alivepdf.client.colors.RGBColor;
import com.ait.toolkit.flash.alivepdf.client.core.GridFactory;
import com.ait.toolkit.flash.alivepdf.client.data.DataCollection;
import com.ait.toolkit.flash.alivepdf.client.drawing.Joint;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Grid.
 */
public class Grid extends JsObject {

	Grid(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @return the grid
	 */
	private Grid(JavaScriptObject data, double width, double height,
			RGBColor headerColor) {
		jsObj = GridFactory.INSTANCE.createGrid(data, width, height,
				headerColor);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @return the grid
	 */
	private Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor, useAlternateRowColor);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor, useAlternateRowColor,
				alternateCellColor);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor,
			RGBColor borderColor) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor,
			RGBColor borderColor, double borderAlpha) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @param headerHeight
	 *            the header height
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor,
			RGBColor borderColor, double borderAlpha, int headerHeight) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha, headerHeight);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @param headerHeight
	 *            the header height
	 * @param rowHeight
	 *            the row height
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor,
			RGBColor borderColor, double borderAlpha, int headerHeight,
			int rowHeight) {
		jsObj = GridFactory.INSTANCE.createGrid(data.toArray().getJsObj(),
				width, height, headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha, headerHeight,
				rowHeight);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @param headerHeight
	 *            the header height
	 * @param rowHeight
	 *            the row height
	 * @param joints
	 *            the joints
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor,
			RGBColor borderColor, double borderAlpha, int headerHeight,
			int rowHeight, Joint joints) {
		jsObj = _newInstance(data.toArray().getJsObj(), width, height,
				headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha, headerHeight,
				rowHeight, joints.value);
	}

	/**
	 * _new instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @param headerHeight
	 *            the header height
	 * @param rowHeight
	 *            the row height
	 * @param joints
	 *            the joints
	 * @return the grid
	 */
	private static JavaScriptObject _newInstance(JavaScriptObject data,
			double width, double height, RGBColor headerColor,
			RGBColor cellColor, boolean useAlternateRowColor,
			RGBColor alternateCellColor, RGBColor borderColor,
			double borderAlpha, int headerHeight, int rowHeight, String joints) {
		return GridFactory.INSTANCE.createGrid(data, width, height,
				headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha, headerHeight,
				rowHeight, joints);
	}

	/**
	 * New instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @param headerHeight
	 *            the header height
	 * @param rowHeight
	 *            the row height
	 * @param joints
	 *            the joints
	 * @param columns
	 *            the columns
	 * @return the grid
	 */
	public Grid(DataCollection data, double width, double height,
			RGBColor headerColor, RGBColor cellColor,
			boolean useAlternateRowColor, RGBColor alternateCellColor,
			RGBColor borderColor, double borderAlpha, int headerHeight,
			int rowHeight, Joint joints, JavaScriptObject columns) {
		jsObj = _newInstance(data.toArray().getJsObj(), width, height,
				headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha, headerHeight,
				rowHeight, joints.value, columns);
	}

	/**
	 * _new instance.
	 * 
	 * @param data
	 *            the data
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param headerColor
	 *            the header color
	 * @param cellColor
	 *            the cell color
	 * @param useAlternateRowColor
	 *            the use alternate row color
	 * @param alternateCellColor
	 *            the alternate cell color
	 * @param borderColor
	 *            the border color
	 * @param borderAlpha
	 *            the border alpha
	 * @param headerHeight
	 *            the header height
	 * @param rowHeight
	 *            the row height
	 * @param joints
	 *            the joints
	 * @param columns
	 *            the columns
	 * @return the grid
	 */
	private static JavaScriptObject _newInstance(JavaScriptObject data,
			double width, double height, RGBColor headerColor,
			RGBColor cellColor, boolean useAlternateRowColor,
			RGBColor alternateCellColor, RGBColor borderColor,
			double borderAlpha, int headerHeight, int rowHeight, String joints,
			JavaScriptObject columns) {
		return GridFactory.INSTANCE.createGrid(data, width, height,
				headerColor, cellColor, useAlternateRowColor,
				alternateCellColor, borderColor, borderAlpha, headerHeight,
				rowHeight, joints, columns);
	}

	/**
	 * Export to byte array.
	 * 
	 * @return the byte array
	 */
	public native ByteArray exportToByteArray()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.exportToByteArray();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Export to byte array.
	 * 
	 * @param type
	 *            the type
	 * @return the byte array
	 */
	public native ByteArray exportToByteArray(String type)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.exportToByteArray(type);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Generate columns.
	 */
	public native void generateColumns() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.generateColumns();
	}-*/;

	/**
	 * Generate columns.
	 * 
	 * @param force
	 *            the force
	 */
	public native void generateColumns(boolean force) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.generateColumns(force);
	}-*/;

	/**
	 * Generate columns.
	 * 
	 * @param force
	 *            the force
	 * @param headerAlign
	 *            the header align
	 */
	public native void generateColumns(boolean force, String headerAlign) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.generateColumns(force, headerAlign);
	}-*/;

	/**
	 * Generate columns.
	 * 
	 * @param force
	 *            the force
	 * @param headerAlign
	 *            the header align
	 * @param cellAlign
	 *            the cell align
	 */
	public native void generateColumns(boolean force, String headerAlign,
			String cellAlign) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.generateColumns(force, headerAlign, cellAlign);
	}-*/;

	/**
	 * Generate cells.
	 */
	public native void generateCells() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.generateCells();
	}-*/;

	/**
	 * Gets the columns.
	 * 
	 * @param <T>
	 *            the generic type
	 * @return the columns
	 */
	private native <T extends JavaScriptObject> T getColumns() /*-{
		return this.getcolumns();
	}-*/;

	/**
	 * Sets the columns.
	 * 
	 * @param newValue
	 *            the new columns
	 */
	public void setColumns(List<GridColumn> columns) {
		_setColumns(DataCollection.fromList(columns).toArray().getJsObj());
	}

	public void setColums(GridColumn... cols) {
		setColumns(Arrays.asList(cols));
	}

	/**
	 * Sets the columns.
	 * 
	 * @param newValue
	 *            the new columns
	 */
	private native void _setColumns(JavaScriptObject newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcolumns(newValue);
	}-*/;

	public List<GridCell> getCells() {
		List<GridCell> cells = new ArrayList<GridCell>();
		JavaScriptObject peers = _getCells();
		int lenght = JsoHelper.getJavaScriptObjectAs3ArraySize(peers);
		for (int i = 0; i < lenght; i++) {
			cells.add(new GridCell(JsoHelper.getValueFromJavaScriptObjectArray(
					peers, i)));
		}
		return cells;
	}

	/**
	 * Gets the cells.
	 * 
	 * @return the cells
	 */
	private native JavaScriptObject _getCells()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcells();
	}-*/;

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public native double getWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
	}-*/;

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public native double getHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getHeight();
	}-*/;

	/**
	 * Gets the row height.
	 * 
	 * @return the row height
	 */
	public native double getRowHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrowHeight();
	}-*/;

	/**
	 * Gets the header height.
	 * 
	 * @return the header height
	 */
	public native double getHeaderHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheaderHeight();
	}-*/;

	/**
	 * Gets the x.
	 * 
	 * @return the x
	 */
	public native double getX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
	}-*/;

	/**
	 * Sets the x.
	 * 
	 * @param newValue
	 *            the new x
	 */
	public native void setX(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(newValue);
	}-*/;

	/**
	 * Gets the y.
	 * 
	 * @return the y
	 */
	public native double getY()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
	}-*/;

	/**
	 * Sets the y.
	 * 
	 * @param newValue
	 *            the new y
	 */
	public native void setY(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(newValue);
	}-*/;

	/**
	 * Gets the joints.
	 * 
	 * @return the joints
	 */
	public native String getJoints() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.joints;
	}-*/;

	/**
	 * Gets the use alternate row color.
	 * 
	 * @return the use alternate row color
	 */
	public native boolean useAlternateRowColor()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getuseAlternateRowColor();
	}-*/;

}
