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
package com.ait.toolkit.flash.alivepdf.client.core;

import com.ait.toolkit.flash.alivepdf.client.colors.RGBColor;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Grid objects.
 */
public class GridFactory extends JsObject {

    public static final GridFactory INSTANCE = new GridFactory();

    /**
     * Instantiates a new grid factory.
     */
    private GridFactory() {
        jsObj = Bridge.createObject("com.ekambi.gwt.flex.pdf.grid.GridFactory");
    }

    /**
     * Creates a new Grid object.
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
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Grid object.
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
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Grid object.
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
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor);
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
     * @return the grid
     */
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor, alternativeCellColor);
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
     * @param borderColor
     *            the border color
     * @return the grid
     */
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor, RGBColor borderColor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor,
						alternativeCellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderColor.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
     * @param borderColor
     *            the border color
     * @param borderAlpha
     *            the border alpha
     * @return the grid
     */
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor, RGBColor borderColor, double borderAlpha)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor,
						alternativeCellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderAlpha);
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
     * @param borderColor
     *            the border color
     * @param borderAlpha
     *            the border alpha
     * @param headerHeight
     *            the header height
     * @return the grid
     */
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor, RGBColor borderColor, double borderAlpha, int headerHeight)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor,
						alternativeCellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderAlpha, headerHeight);
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
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
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor, RGBColor borderColor, double borderAlpha, int headerHeight,
                    int rowHeight)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor,
						alternativeCellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderAlpha, headerHeight, rowHeight);
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
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
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor, RGBColor borderColor, double borderAlpha, int headerHeight,
                    int rowHeight, String joints)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor,
						alternativeCellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderAlpha, headerHeight, rowHeight, joints);
    }-*/;

    /**
     * Creates a new Grid object.
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
     * @param alternativeCellColor
     *            the alternative cell color
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
    public final native JavaScriptObject createGrid(JavaScriptObject data, double width, double height,
                    RGBColor headerColor, RGBColor cellColor, boolean useAlternateRowColor,
                    RGBColor alternativeCellColor, RGBColor borderColor, double borderAlpha, int headerHeight,
                    int rowHeight, String joints, JavaScriptObject columns)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createGrid(
						data,
						width,
						height,
						headerColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						cellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						useAlternateRowColor,
						alternativeCellColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderColor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						borderAlpha, headerHeight, rowHeight, joints, columns);
    }-*/;

}
