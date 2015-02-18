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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class As3Vector.
 */
public class As3Vector extends JsObject {

    /**
     * Instantiates a new as3 vector.
     */
    protected As3Vector() {

    }

    private As3Vector(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the.
     * 
     * @param <T> the generic type
     * @param index the index
     * @return the t
     */
    public native <T> T get(int index)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer[index];
    }-*/;

    /**
     * Concat.
     * 
     * @param args the args
     * @return the as3 vector
     */
    public native As3Vector concat(Object... args)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.concat.apply(args);
    }-*/;

    /**
     * Checks if is fixed.
     * 
     * @return true, if is fixed
     */
    public native boolean isFixed()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfixed();
    }-*/;

    /**
     * Sets the fixed.
     * 
     * @param value the new fixed
     */
    public native void setFixed(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfixed(value);
    }-*/;

    /**
     * Sets the length.
     * 
     * @param value the new length
     */
    public native void setLength(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlength(value);
    }-*/;

    /**
     * Push.
     * 
     * @param value the value
     */
    public native void push(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.push(value);
    }-*/;

    /**
     * Push.
     * 
     * @param values the values
     */
    public native void push(Object... values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.push.apply(values);
    }-*/;

    /**
     * Pop.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public native <T> T pop()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.pop();
    }-*/;

    /**
     * Shift.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public native <T> T shift()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.shift();
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native int getLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Join.
     * 
     * @return the string
     */
    public String join() {
        return join(",");
    }

    /**
     * Join.
     * 
     * @param separator the separator
     * @return the string
     */
    public native String join(Object separator) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.join(separator);
    }-*/;

    /**
     * Slice.
     * 
     * @return the as3 vector
     */
    public native As3Vector slice()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer = peer.slice();
		return this;
    }-*/;

    /**
     * Slice.
     * 
     * @param startIndex the start index
     * @return the as3 vector
     */
    public native As3Vector slice(int startIndex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer = peer.slice(startIndex);
		return this;
    }-*/;

    /**
     * Slice.
     * 
     * @param startIndex the start index
     * @param endIndex the end index
     * @return the as3 vector
     */
    public native As3Vector slice(int startIndex, int endIndex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer = peer.slice(startIndex, endIndex);
		return this;
    }-*/;

    /**
     * Sort.
     * 
     * @param behavior the behavior
     * @return the as3 vector
     */
    public native As3Vector sort(Object behavior)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer = peer.sort(behavior);
		return this;
    }-*/;

    /**
     * Splice.
     * 
     * @param startIndex the start index
     * @param endIndex the end index
     * @param items the items
     * @return the as3 vector
     */
    public native As3Vector splice(int startIndex, int endIndex, Object... items)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer = peer.splice(startIndex, endIndex, items);
		return this;
    }-*/;

    /**
     * To locale string.
     * 
     * @return the string
     */
    public native String toLocaleString()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.toLocaleString();
    }-*/;

    /**
     * Unshift.
     * 
     * @param args the args
     * @return the int
     */
    public native int unshift(Object... args)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.unshift(args);
    }-*/;

}
