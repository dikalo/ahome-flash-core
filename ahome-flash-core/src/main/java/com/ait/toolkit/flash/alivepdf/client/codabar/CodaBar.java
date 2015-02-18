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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.ait.toolkit.flash.alivepdf.client.codabar;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.utils.Dictionary;

/**
 * The Class CodaBar.
 */
public class CodaBar extends JsObject {

    /**
     * New instance.
     * 
     * @param x the x
     * @param y the y
     * @param code the code
     * @return the coda bar
     */
    public CodaBar(double x, double y, String code) {
        jsObj = AlivePdfFactory.INSTANCE.createCodaBar(x, y, code);
    }

    /**
     * New instance.
     * 
     * @param x the x
     * @param y the y
     * @param code the code
     * @param start the start
     * @return the coda bar
     */
    public CodaBar(double x, double y, String code, String start) {
        jsObj = AlivePdfFactory.INSTANCE.createCodaBar(x, y, code, start);
    }

    /**
     * New instance.
     * 
     * @param x the x
     * @param y the y
     * @param code the code
     * @param start the start
     * @param end the end
     * @return the coda bar
     */
    public CodaBar(double x, double y, String code, String start, String end) {
        jsObj = AlivePdfFactory.INSTANCE.createCodaBar(x, y, code, start, end);
    }

    /**
     * New instance.
     * 
     * @param x the x
     * @param y the y
     * @param code the code
     * @param start the start
     * @param end the end
     * @param baseWidth the base width
     * @return the coda bar
     */
    public CodaBar(double x, double y, String code, String start, String end, double baseWidth) {
        jsObj = AlivePdfFactory.INSTANCE.createCodaBar(x, y, code, start, end, baseWidth);
    }

    /**
     * New instance.
     * 
     * @param x the x
     * @param y the y
     * @param code the code
     * @param start the start
     * @param end the end
     * @param baseWidth the base width
     * @param height the height
     * @return the coda bar
     */
    public CodaBar(double x, double y, String code, String start, String end, double baseWidth, double height) {
        jsObj = AlivePdfFactory.INSTANCE.createCodaBar(x, y, code, start, end, baseWidth, height);
    }

    /**
     * Gets the bar char.
     * 
     * @return the bar char
     */
    public native Dictionary getBarChar()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getbarChar();
		return @com.ait.toolkit.flash.core.client.utils.Dictionary::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the bar char.
     * 
     * @param value the new bar char
     */
    public native void setBarChar(Dictionary value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setbarChar(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public native double getHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Sets the height.
     * 
     * @param value the new height
     */
    public native void setHeight(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setheight(value);
    }-*/;

    /**
     * Gets the base width.
     * 
     * @return the base width
     */
    public native double getBaseWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbaseWidth();
    }-*/;

    /**
     * Sets the base width.
     * 
     * @param value the new base width
     */
    public native void setBaseWidth(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbaseWidth(value);
    }-*/;

    /**
     * Gets the end.
     * 
     * @return the end
     */
    public native String getEnd()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getend();
    }-*/;

    /**
     * Sets the end.
     * 
     * @param value the new end
     */
    public native void setEnd(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setend(value);
    }-*/;

    /**
     * Gets the start.
     * 
     * @return the start
     */
    public native String getStart()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstart();
    }-*/;

    /**
     * Sets the start.
     * 
     * @param value the new start
     */
    public native void setStart(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setstart(value);
    }-*/;

    /**
     * Gets the code.
     * 
     * @return the code
     */
    public native String getCode()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcode();
    }-*/;

    /**
     * Sets the code.
     * 
     * @param value the new code
     */
    public native void setCode(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcode(value);
    }-*/;

    /**
     * Gets the x.
     * 
     * @return the x
     */
    public native double getX()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x.
     * 
     * @param value the new x
     */
    public native void setX(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(value);
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
     * @param value the new y
     */
    public native void setY(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(value);
    }-*/;

}
