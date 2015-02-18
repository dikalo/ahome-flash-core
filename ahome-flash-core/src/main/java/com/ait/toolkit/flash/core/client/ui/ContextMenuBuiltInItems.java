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
 * The ContextMenuBuiltInItems class describes the items that are built in to a
 * context menu. You can hide these items by using the
 * ContextMenu.hideBuiltInItems() method.
 */
public class ContextMenuBuiltInItems extends JsObject {

    /**
     * New instance.
     * 
     * @return the context menu built in items
     */
    public ContextMenuBuiltInItems() {
        jsObj = Bridge.createObject("flash.ui.ContextMenuBuiltInItems");
    }

    /**
     * Forward and back.
     * 
     * @return true, if successful
     */
    public native boolean forwardAndBack()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getforwardAndBack();
    }-*/;

    /**
     * Sets the forward and back.
     * 
     * @param value the new forward and back
     */
    public native void setForwardAndBack(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setforwardAndBack(value);
    }-*/;

    /**
     * Loop.
     * 
     * @return true, if successful
     */
    public native boolean loop()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getloop();
    }-*/;

    /**
     * Sets the loop.
     * 
     * @param value the new loop
     */
    public native void setLoop(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setloop(value);
    }-*/;

    /**
     * Play.
     * 
     * @return true, if successful
     */
    public native boolean play()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getplay();
    }-*/;

    /**
     * Sets the play.
     * 
     * @param value the new play
     */
    public native void setPlay(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setplay(value);
    }-*/;

    /**
     * Prints the.
     * 
     * @return true, if successful
     */
    public native boolean print()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getprint();
    }-*/;

    /**
     * Sets the prints the.
     * 
     * @param value the new prints the
     */
    public native void setPrint(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setprint(value);
    }-*/;

    /**
     * Qualitiy.
     * 
     * @return true, if successful
     */
    public native boolean qualitiy()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getqualitiy();
    }-*/;

    /**
     * Sets the quality.
     * 
     * @param value the new quality
     */
    public native void setQuality(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setquality(value);
    }-*/;

    /**
     * Rewind.
     * 
     * @return true, if successful
     */
    public native boolean rewind()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrewind();
    }-*/;

    /**
     * Sets the rewind.
     * 
     * @param value the new rewind
     */
    public native void setRewind(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrewind(value);
    }-*/;

    /**
     * Save.
     * 
     * @return true, if successful
     */
    public native boolean save()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsave();
    }-*/;

    /**
     * Sets the save.
     * 
     * @param value the new save
     */
    public native void setSave(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsave(value);
    }-*/;

    /**
     * Zoom.
     * 
     * @return true, if successful
     */
    public native boolean zoom()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getzoom();
    }-*/;

    /**
     * Sets the zoom.
     * 
     * @param value the new zoom
     */
    public native void setZoom(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setzoom(value);
    }-*/;

}
