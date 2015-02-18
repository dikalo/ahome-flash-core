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

package com.ait.toolkit.flash.core.client.display;

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class is used to create lightweight shapes using the ActionScript
 * drawing application program interface (API). The Shape class includes a
 * graphics property, which lets you access methods from the Graphics class.
 * <p>
 * The Sprite class also includes a graphicsproperty, and it includes other
 * features not available to the Shape class. For example, a Sprite object is a
 * display object container, whereas a Shape object is not (and cannot contain
 * child display objects). For this reason, Shape objects consume less memory
 * than Sprite objects that contain the same graphics. However, a Sprite object
 * supports user input events, while a Shape object does not.
 */
public class Shape extends DisplayObject {

    /**
     * Instantiates a new shape.
     */
    public Shape() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the graphics.
     * 
     * @return the graphics
     */
    public native Graphics getGraphics() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getgraphics();
		return @com.ait.toolkit.flash.core.client.display.Graphics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * New instance.
     * 
     * @return the shape
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Shape");
    }

}
