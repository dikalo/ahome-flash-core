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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Size objects.
 */
public class SizeFactory extends JsObject {

    public static final SizeFactory INSTANCE = new SizeFactory();

    /**
     * Instantiates a new size factory.
     */
    private SizeFactory() {
        jsObj = Bridge.createObject("com.ekambi.gwt.flex.pdf.size.SizeFactory");
    }

    /**
     * Gets the a3.
     * 
     * @return the a3
     */
    public final native JavaScriptObject getA3()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getA3();
    }-*/;

    /**
     * Gets the a4.
     * 
     * @return the a4
     */
    public final native JavaScriptObject getA4()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getA4();
    }-*/;

    /**
     * Gets the a5.
     * 
     * @return the a5
     */
    public final native JavaScriptObject getA5()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getA5();
    }-*/;

    /**
     * Gets the legal.
     * 
     * @return the legal
     */
    public final native JavaScriptObject getLegal()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLegal();
    }-*/;

    /**
     * Gets the letter.
     * 
     * @return the letter
     */
    public final native JavaScriptObject getLetter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLetter();
    }-*/;

    /**
     * Gets the tabloid.
     * 
     * @return the tabloid
     */
    public final native JavaScriptObject getTabloid()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getTabloid();
    }-*/;

    /**
     * Creates a new Size object.
     * 
     * @return the resize
     */
    public final native JavaScriptObject createResize()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createResize();
    }-*/;

    /**
     * Creates a new Size object.
     * 
     * @param mode the mode
     * @return the resize
     */
    public final native JavaScriptObject createResize(String mode)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createResize(mode);
    }-*/;

    /**
     * Creates a new Size object.
     * 
     * @param mode the mode
     * @param position the position
     * @return the resize
     */
    public final native JavaScriptObject createResize(String mode, String position)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createResize(mode, position);
    }-*/;

}
