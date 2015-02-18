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
package com.ait.toolkit.flash.core.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;

/**
 * The ContextMenuClipboardItems class lets you enable or disable the commands
 * in the clipboard context menu. Enable or disable the context menu clipboard
 * commands using the clipboardItems property of the ContextMenu object. The
 * clipboardItems property is an instance of peer ContextMenuClipboardItems
 * class. The clipboard context menu is shown in a context menu when the
 * clipboardMenu property of the context menu is true, unless the context menu
 * is for a TextField object. TextField objects control the display of the
 * context menu and the state of its clipboard items automatically.
 */
public class ContextMenuClipboardItems extends JsObject {

    /**
     * New instance.
     * 
     * @return the context menu clipboard items
     */
    public ContextMenuClipboardItems() {
        jsObj = Bridge.createObject("flash.ui.ContextMenuClipboardItems");
    }

    /**
     * Clear.
     * 
     * @return true, if successful
     */
    public native boolean clear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getclear();
    }-*/;

    /**
     * Sets the clear.
     * 
     * @param value the new clear
     */
    public native void setClear(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setclear(value);
    }-*/;

    /**
     * Copy.
     * 
     * @return true, if successful
     */
    public native boolean copy()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcopy();
    }-*/;

    /**
     * Sets the copy.
     * 
     * @param value the new copy
     */
    public native void setCopy(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcopy(value);
    }-*/;

    /**
     * Cut.
     * 
     * @return true, if successful
     */
    public native boolean cut()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcut();
    }-*/;

    /**
     * Sets the cut.
     * 
     * @param value the new cut
     */
    public native void setCut(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcut(value);
    }-*/;

    /**
     * Paste.
     * 
     * @return true, if successful
     */
    public native boolean paste()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpaste();
    }-*/;

    /**
     * Sets the paste.
     * 
     * @param value the new paste
     */
    public native void setPaste(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpaste(value);
    }-*/;

    /**
     * Select all.
     * 
     * @return true, if successful
     */
    public native boolean selectAll()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getselectAll();
    }-*/;

    /**
     * Sets the select all.
     * 
     * @param value the new select all
     */
    public native void setSelectAll(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setselectAll(value);
    }-*/;

}
