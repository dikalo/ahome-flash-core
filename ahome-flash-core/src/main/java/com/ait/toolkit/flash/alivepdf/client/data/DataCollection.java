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
package com.ait.toolkit.flash.alivepdf.client.data;

import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class DataCollection extends JsObject {

    public DataCollection() {
        jsObj = Bridge.createObject("mx.collections.ArrayCollection");
    }

    DataCollection(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the array collection
     */
    @Deprecated
    public static DataCollection newInstance() {
        return new DataCollection(Bridge.createObject("mx.collections.ArrayCollection"));
    }

    /**
     * New instance.
     * 
     * @param src
     *            the src
     * @return the array collection
     */
    public static DataCollection newInstance(As3Array src) {
        DataCollection arr = new DataCollection();
        arr.setSource(src);
        return arr;
    }

    /**
     * Sets the source.
     * 
     * @param src
     *            the new source
     */
    public final native void setSource(As3Array src)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsource(src.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native void addItem(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addItem(value);
    }-*/;

    public final native void addItem(JsObject value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addItem(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * To array.
     * 
     * @return the as3 array
     */
    public final native As3Array toArray()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.toArray();
		return @com.ait.toolkit.flash.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static DataCollection fromJsArray(JsArray<? extends JavaScriptObject> array) {
        DataCollection collection = DataCollection.newInstance();
        for (int i = 0; i < array.length(); i++) {
            collection.addItem(array.get(i));
        }
        return collection;
    }

    public static DataCollection fromList(List<? extends JsObject> elements) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (JsObject proxy : elements) {
            peers.push(proxy.getJsObj());
        }
        return fromJsArray(peers);
    }

}
