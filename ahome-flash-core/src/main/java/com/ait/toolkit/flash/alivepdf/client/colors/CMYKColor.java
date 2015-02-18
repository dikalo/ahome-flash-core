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

package com.ait.toolkit.flash.alivepdf.client.colors;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CMYKColor.
 */
public class CMYKColor extends BaseColor {

    /**
     * New instance.
     * 
     * @param cyan the cyan
     * @param magenta the magenta
     * @param yellow the yellow
     * @param black the black
     * @return the cMYK color
     */
    public CMYKColor(double cyan, double magenta, double yellow, double black) {
        jsObj = AlivePdfFactory.INSTANCE.createCMYKColor(cyan, magenta, yellow, black);
    }

    public CMYKColor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the cyan.
     * 
     * @return the cyan
     */
    public final native double getCyan()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcyan();
    }-*/;

    /**
     * Sets the cyan.
     * 
     * @param newValue the new cyan
     */
    public final native void setCyan(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcyan(newValue);
    }-*/;

    /**
     * Gets the magenta.
     * 
     * @return the magenta
     */
    public final native double getMagenta()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmagenta();
    }-*/;

    /**
     * Sets the magenta.
     * 
     * @param newValue the new magenta
     */
    public final native void setMagenta(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmagenta(newValue);
    }-*/;

    /**
     * Gets the yellow.
     * 
     * @return the yellow
     */
    public final native double getYellow()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getYellow();
    }-*/;

    /**
     * Sets the yellow.
     * 
     * @param newValue the new yellow
     */
    public final native void setYellow(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setyellow(newValue);
    }-*/;

    /**
     * Gets the black.
     * 
     * @return the black
     */
    public final native double getBlack()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblack();
    }-*/;

    /**
     * Sets the black.
     * 
     * @param newValue the new black
     */
    public final native void setBlack(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblack(newValue);
    }-*/;

}
