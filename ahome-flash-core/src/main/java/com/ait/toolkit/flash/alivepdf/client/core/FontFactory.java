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
 * A factory for creating Font objects.
 */
public class FontFactory extends JsObject {

    public static final FontFactory INSTANCE = new FontFactory();

    /**
     * Instantiates a new font factory.
     */
    private FontFactory() {
        jsObj = Bridge.createObject("com.ekambi.gwt.flex.pdf.fonts.FontFactory");
    }

    /**
     * Creates a new Font object.
     * 
     * @return the core font
     */
    public final native JavaScriptObject createFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createCoreFont();
    }-*/;

    /**
     * Creates a new Font object.
     * 
     * @param name the name
     * @return the core font
     */
    public final native JavaScriptObject createFont(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createCoreFont(name);
    }-*/;

}
