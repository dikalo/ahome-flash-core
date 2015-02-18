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

package com.ait.toolkit.flash.core.client.events;

import com.ait.toolkit.flash.core.client.display.InteractiveObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ContextMenuEvent.
 */
public class ContextMenuEvent extends Event {

    /** The Constant MENU_ITEM_SELECT. */
    public static String MENU_ITEM_SELECT = "menuItemSelect";

    /** The Constant MENU_SELECT. */
    public static String MENU_SELECT = "menuSelect";

    /**
     * Instantiates a new context menu event.
     */
    protected ContextMenuEvent() {
    }

    ContextMenuEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the context menu owner.
     * 
     * @return the context menu owner
     */
    public native InteractiveObject getContextMenuOwner() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getContextMenuOwner();
		return @com.ait.toolkit.flash.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Checks if is mouse target inaccessible.
     * 
     * @return true, if is mouse target inaccessible
     */
    public native boolean isMouseTargetInaccessible() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisMouseTargetInaccessible();
    }-*/;

    /**
     * Gets the mouse target.
     * 
     * @return the mouse target
     */
    public native InteractiveObject getMouseTarget() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getmouseTarget();
		return @com.ait.toolkit.flash.core.client.display.InteractiveObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static ContextMenuEvent cas(Event event) {
        return new ContextMenuEvent(event.getJsObj());
    }

}
