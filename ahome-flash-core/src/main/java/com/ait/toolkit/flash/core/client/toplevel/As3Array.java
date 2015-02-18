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
package com.ait.toolkit.flash.core.client.toplevel;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.utils.factories.AS3ArrayFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class As3Array.
 */
public class As3Array extends JsObject {

    /** The Constant CASEINSENSITIVE. */
    public static final int CASEINSENSITIVE = 1;

    /** The Constant DESCENDING. */
    public static final int DESCENDING = 2;

    /** The Constant NUMERIC. */
    public static final int NUMERIC = 16;

    /** The Constant RETURNINDEXEDARRAY. */
    public static final int RETURNINDEXEDARRAY = 8;

    /** The Constant UNIQUESORT. */
    public static final int UNIQUESORT = 4;

    /**
     * Instantiates a new as3 array.
     */
    private As3Array() {

    }

    private As3Array(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param size
     *            the size
     * @return the as3 array
     */
    public static As3Array newInstance(int size) {
        return AS3ArrayFactory.get().create(size);
    }

    public static As3Array createEmpty() {
        return newInstance(0);
    }

    /**
     * Push.
     * 
     * @param value
     *            the value
     */
    public final native void push(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.push(value);
    }-*/;

    public void push(JsObject value) {
        push(value.getJsObj());
    }

    /**
     * Push.
     * 
     * @param values
     *            the values
     */
    public final native void push(Object... values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.push.apply(values);
    }-*/;

    /**
     * Pop.
     * 
     * @param <T>
     *            the generic type
     * @return the t
     */
    public final native <T> T pop()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.pop();
    }-*/;

    /**
     * Shift.
     * 
     * @return the object
     */
    public final native Object shift()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.shift();
    }-*/;

    /**
     * Gets the.
     * 
     * @param index
     *            the index
     * @return the object
     */
    public final native Object get(int index)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer[index];
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public final native int getLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Join.
     * 
     * @return the string
     */
    public final String join() {
        return join(",");
    }

    /**
     * Join.
     * 
     * @param separator
     *            the separator
     * @return the string
     */
    public final native String join(Object separator) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.join(separator);
    }-*/;

}
