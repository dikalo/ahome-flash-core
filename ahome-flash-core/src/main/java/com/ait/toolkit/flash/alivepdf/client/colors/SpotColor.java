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

package com.ait.toolkit.flash.alivepdf.client.colors;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;

/**
 * The Class SpotColor.
 */
public class SpotColor extends BaseColor {

    /**
     * Instantiates a new spot color.
     */
    protected SpotColor() {

    }

    /**
     * New instance.
     * 
     * @param name the name
     * @param color the color
     * @return the spot color
     */
    public SpotColor(String name, CMYKColor color) {
        jsObj = AlivePdfFactory.INSTANCE.createSpotColor(name, color);
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    private final native void setName(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setname(value);
    }-*/;

    /**
     * Sets the color.
     * 
     * @param color the new color
     */
    private final native void setColor(CMYKColor color)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setcolor(color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
