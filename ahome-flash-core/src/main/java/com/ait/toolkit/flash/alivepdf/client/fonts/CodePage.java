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

package com.ait.toolkit.flash.alivepdf.client.fonts;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CodePage.
 */
public class CodePage extends JsObject {

    private static final CodePage INSTANCE = new CodePage(Bridge.createObject("org.alivepdf.fonts.CodePage"));;

    /** The Constant CP1253. */
    public static final ByteArray CP1253 = create().getCP1253();

    /** The Constant CP1250. */
    public static final ByteArray CP1250 = create().getCP1250();

    /** The Constant CP1257. */
    public static final ByteArray CP1257 = create().getCP1257();

    /** The Constant CP1254. */
    public static final ByteArray CP1254 = create().getCP1254();

    /** The Constant KOIR. */
    public static final ByteArray KOIR = create().getKOIR();

    /** The Constant CP1252. */
    public static final ByteArray CP1252 = create().getCP1252();

    /** The Constant CP1251. */
    public static final ByteArray CP1251 = create().getCP1251();

    /** The Constant CP1255. */
    public static final ByteArray CP1255 = create().getCP1255();

    /** The Constant KOI8U. */
    public static final ByteArray KOI8U = create().getKOI8U();

    /** The Constant CP1258. */
    public static final ByteArray CP1258 = create().getCP1258();

    /**
     * Instantiates a new code page.
     */
    CodePage(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the code page
     */
    private static CodePage create() {
        return INSTANCE;
    }

    /**
     * Gets the c p1253.
     * 
     * @return the c p1253
     */
    private final native ByteArray getCP1253()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1253();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1250.
     * 
     * @return the c p1250
     */
    private final native ByteArray getCP1250()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1250();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1257.
     * 
     * @return the c p1257
     */
    private final native ByteArray getCP1257()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1257();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1254.
     * 
     * @return the c p1254
     */
    private final native ByteArray getCP1254()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1254();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the kOIR.
     * 
     * @return the kOIR
     */
    private final native ByteArray getKOIR()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getKOIR();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1252.
     * 
     * @return the c p1252
     */
    private final native ByteArray getCP1252()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1252();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1251.
     * 
     * @return the c p1251
     */
    private final native ByteArray getCP1251()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1251();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1255.
     * 
     * @return the c p1255
     */
    private final native ByteArray getCP1255()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1255();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the kO i8 u.
     * 
     * @return the kO i8 u
     */
    private final native ByteArray getKOI8U()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getKOI8U();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the c p1258.
     * 
     * @return the c p1258
     */
    private final native ByteArray getCP1258()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCP1258();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
