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
package com.ait.toolkit.flash.core.client.filters;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BitmapFilter class is the base class for all image filter effects.
 * <p>
 * The BevelFilter, BlurFilter, ColorMatrixFilter, ConvolutionFilter,
 * DisplacementMapFilter, DropShadowFilter, GlowFilter, GradientBevelFilter, and
 * GradientGlowFilter classes all extend the BitmapFilter class. You can apply
 * these filter effects to any display object.
 * <p>
 * You should neither directly instantiate nor extend BitmapFilter.
 */
public class BitmapFilter extends JsObject {

    /**
     * Instantiates a new bitmap filter.
     */
    BitmapFilter() {

    }

    public BitmapFilter(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native BitmapFilter clone()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		return @com.ait.toolkit.flash.core.client.filters.BitmapFilter::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
