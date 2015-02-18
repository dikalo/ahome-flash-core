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

import com.ait.toolkit.flash.core.client.utils.factories.As3VectorFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class NumberVector extends As3Vector {

    protected NumberVector() {

    }

    @SuppressWarnings("unused")
    private NumberVector(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static NumberVector newInstance() {
        return As3VectorFactory.get().createVectorOfNumber();
    }
}
