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

import com.ait.toolkit.flash.alivepdf.client.core.GridColumnFactory;
import com.ait.toolkit.flash.alivepdf.client.layout.Align;
import com.ait.toolkit.core.client.JsObject;

/**
 * The Class GridColumn.
 */
public class GridColumn extends JsObject {

    /**
     * New instance.
     * 
     * @param headerText
     *            the header text
     * @param dataField
     *            the data field
     * @return the grid column
     */
    public GridColumn(String headerText, String dataField) {
        jsObj = GridColumnFactory.INSTANCE.create(headerText, dataField);
    }

    /**
     * New instance.
     * 
     * @param headerText
     *            the header text
     * @param dataField
     *            the data field
     * @param width
     *            the width
     * @return the grid column
     */
    public GridColumn(String headerText, String dataField, double width) {
        jsObj = GridColumnFactory.INSTANCE.create(headerText, dataField, width);
    }

    /**
     * New instance.
     * 
     * @param headerText
     *            the header text
     * @param dataField
     *            the data field
     * @param width
     *            the width
     * @param headerAlign
     *            the header align
     * @return the grid column
     */
    public GridColumn(String headerText, String dataField, double width, Align headerAlign) {
        jsObj = GridColumnFactory.INSTANCE.create(headerText, dataField, width, headerAlign.value);
    }

    /**
     * New instance.
     * 
     * @param headerText
     *            the header text
     * @param dataField
     *            the data field
     * @param width
     *            the width
     * @param headerAlign
     *            the header align
     * @param cellAlign
     *            the cell align
     * @return the grid column
     */
    public GridColumn(String headerText, String dataField, double width, Align headerAlign, Align cellAlign) {
        jsObj = GridColumnFactory.INSTANCE.create(headerText, dataField, width, headerAlign.value, cellAlign.value);
    }

    /**
     * Gets the header text.
     * 
     * @return the header text
     */
    public native String getHeaderText()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheaderText();
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
     * Gets the cell align.
     * 
     * @return the cell align
     */
    public native String getCellAlign()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcellAlign();
    }-*/;

    /**
     * Gets the header align.
     * 
     * @return the header align
     */
    public native String getHeaderAlign()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheaderAlign();
    }-*/;

    /**
     * Gets the data field.
     * 
     * @return the data field
     */
    public native String getDataField()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdataField();
    }-*/;

}
