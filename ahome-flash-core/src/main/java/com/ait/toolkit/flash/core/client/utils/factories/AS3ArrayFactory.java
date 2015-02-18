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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.toplevel.As3Array;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating AS3Array objects.
 */
public class AS3ArrayFactory extends JsObject {

    private static final AS3ArrayFactory INSTANCE = new AS3ArrayFactory();

    public static AS3ArrayFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new a s3 array factory.
     */
    private AS3ArrayFactory() {
        jsObj = createNativePeer();
    }

    public final native As3Array create()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.create();
		return @com.ait.toolkit.flash.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public final native As3Array create(int size)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.create();
		return @com.ait.toolkit.flash.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the single instance of AS3ArrayFactory.
     * 
     * @return single instance of AS3ArrayFactory
     */
    private static JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.maps.factories.AS3ArrayFactory");
    }
}
