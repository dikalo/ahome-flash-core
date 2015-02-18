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
package com.ait.toolkit.flash.core.client.utils;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Dictionary class lets you create a dynamic collection of properties,
 * which uses strict equality (===) for key comparison. When an object is used
 * as a key, the object's identity is used to look up the object, and not the
 * value returned from calling toString() on it.
 */
public class Dictionary extends JsObject {

    /**
     * New instance.
     * 
     * @return the dictionary
     */
    public Dictionary() {
        jsObj = Bridge.createObject("flash.utils.Dictionary");
    }

    Dictionary(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Adds the.
     * 
     * @param key the key
     * @param value the value
     */
    public native void add(Object key, Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer[key] = value;
    }-*/;

    /**
     * Gets the.
     * 
     * @param <T> the generic type
     * @param key the key
     * @return the t
     */
    public native <T> T get(Object key)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer[key];
    }-*/;

    /**
     * Delete.
     * 
     * @param key the key
     */
    public native void delete(Object key)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete (peer[key]);
    }-*/;

}
