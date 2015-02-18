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
import com.ait.toolkit.flash.core.client.toplevel.NumberVector;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating AS3Array objects.
 */
public class As3VectorFactory extends JsObject {

    public static final As3VectorFactory INSTANCE = new As3VectorFactory();

    public static As3VectorFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new a s3 array factory.
     */
    private As3VectorFactory() {
        jsObj = createNativePeer();
    }

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.gwt4.flex.VectorFactory");
    }

    public final native NumberVector createVectorOfNumber()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.createVectorOfNumber();
		return @com.ait.toolkit.flash.core.client.toplevel.NumberVector::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
