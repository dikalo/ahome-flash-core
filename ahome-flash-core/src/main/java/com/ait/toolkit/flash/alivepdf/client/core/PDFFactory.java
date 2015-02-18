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

import com.ait.toolkit.flash.alivepdf.client.layout.Size;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating PDF objects.
 */
public class PDFFactory extends JsObject {

    public static final PDFFactory INSTANCE = new PDFFactory();

    /**
     * Instantiates a new pDF factory.
     */
    private PDFFactory() {
        jsObj = Bridge.createObject("com.ekambi.gwt.flex.pdf.PDFFactory");
    }

    /**
     * New instance.
     * 
     * @param orientation
     *            the orientation
     * @return the pDF
     */
    public final native JavaScriptObject newInstance(String orientation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPDF(orientation);
    }-*/;

    /**
     * New instance.
     * 
     * @param orientation
     *            the orientation
     * @param unit
     *            the unit
     * @return the pDF
     */
    public final native JavaScriptObject newInstance(String orientation, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPDF(orientation, unit);
    }-*/;

    /**
     * New instance.
     * 
     * @param orientation
     *            the orientation
     * @param unit
     *            the unit
     * @param autoBreak
     *            the auto break
     * @return the pDF
     */
    public final native JavaScriptObject newInstance(String orientation, String unit, boolean autoBreak)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPDF(orientation, unit, autoBreak);
    }-*/;

    /**
     * New instance.
     * 
     * @param orientation
     *            the orientation
     * @param unit
     *            the unit
     * @param autoBreak
     *            the auto break
     * @param pageSize
     *            the page size
     * @return the pDF
     */
    public final native JavaScriptObject newInstance(String orientation, String unit, boolean autoBreak, Size pageSize)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createPDF(
						orientation,
						unit,
						autoBreak,
						pageSize.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * New instance.
     * 
     * @param orientation
     *            the orientation
     * @param unit
     *            the unit
     * @param autoBreak
     *            the auto break
     * @param pageSize
     *            the page size
     * @param rotation
     *            the rotation
     * @return the pDF
     */
    public final native JavaScriptObject newInstance(String orientation, String unit, boolean autoBreak, Size pageSize,
                    int rotation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createPDF(
						orientation,
						unit,
						autoBreak,
						pageSize.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						rotation);
    }-*/;

}
