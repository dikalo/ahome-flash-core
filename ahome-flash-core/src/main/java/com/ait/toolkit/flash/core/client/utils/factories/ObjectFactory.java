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
package com.ait.toolkit.flash.core.client.utils.factories;

// import com.emitrom.gwt4.flash.core.client.flash.assetloader.AssetLoader;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating AS3Array objects.
 */
public class ObjectFactory extends JsObject {

    public static final ObjectFactory INSTANCE = new ObjectFactory();

    /**
     * Instantiates a new a s3 array factory.
     */
    private ObjectFactory() {
        jsObj = createNativePeer();
    }

    public final native JavaScriptObject createXML(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createXML(value);
    }-*/;

    public final native JavaScriptObject createAssetLoader()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createAssetLoader();
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.gwt4.flash.factories.ObjectFactory");
    }

}
