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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.ait.toolkit.flash.core.client.printing;

import com.ait.toolkit.flash.core.client.display.Sprite;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;

/**
 * The PrintJob class lets you create content and print it to one or more pages.
 * This class lets you render content that is visible, dynamic or offscreen to
 * the user, prompt users with a single Print dialog box, and print an unscaled
 * document with proportions that map to the proportions of the content. This
 * capability is especially useful for rendering and printing dynamic content,
 * such as database content and dynamic text.
 */
public class PrintJob extends EventDispatcher {

    /**
     * New instance.
     * 
     * @return the prints the job
     */
    public PrintJob() {
        jsObj = Bridge.createObject("flash.printing.PrintJob");
    }

    /**
     * Checks if is supported.
     * 
     * @return true, if is supported
     */
    public static boolean isSupported() {
        return NetFactory.INSTANCE.isPrintJobSupported();
    }

    /**
     * Gets the orientation.
     * 
     * @return the orientation
     */
    public PrintJobOrientation getOrientation() {
        return PrintJobOrientation.fromValue(_getOrientation());
    }

    /**
     * _get orientation.
     * 
     * @return the string
     */
    private native String _getOrientation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getorientation();
    }-*/;

    /**
     * Sets the orientation.
     * 
     * @param orientation
     *            the new orientation
     */
    public void setOrientation(PrintJobOrientation orientation) {
        _setOrientation(orientation.value);
    }

    /**
     * _set orientation.
     * 
     * @param value
     *            the value
     */
    private native void _setOrientation(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setorientation(value);
    }-*/;

    /**
     * Gets the page height.
     * 
     * @return the page height
     */
    public native int getPageHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpageHeight();
    }-*/;

    /**
     * Gets the page width.
     * 
     * @return the page width
     */
    public native int getPageWidth() /*-{
		return peer.getpageWidth();
    }-*/;

    /**
     * Gets the paper height.
     * 
     * @return the paper height
     */
    public native int getPaperHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpaperHeight();
    }-*/;

    /**
     * Gets the paper width.
     * 
     * @return the paper width
     */
    public native int getPaperWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpaperWidth();
    }-*/;

    /**
     * Adds the page.
     * 
     * @param sprite
     *            the sprite
     */
    public native void addPage(Sprite sprite) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addPage(sprite.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Adds the page.
     * 
     * @param sprite
     *            the sprite
     * @param printArea
     *            the print area
     */
    public native void addPage(Sprite sprite, Rectangle printArea) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addPage(
						sprite.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						printArea.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Adds the page.
     * 
     * @param sprite
     *            the sprite
     * @param printArea
     *            the print area
     * @param options
     *            the options
     */
    public native void addPage(Sprite sprite, Rectangle printArea, PrintJobOptions options) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addPage(
						sprite.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						printArea.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Adds the page.
     * 
     * @param sprite
     *            the sprite
     * @param printArea
     *            the print area
     * @param options
     *            the options
     * @param frameNum
     *            the frame num
     */
    public native void addPage(Sprite sprite, Rectangle printArea, PrintJobOptions options, int frameNum) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addPage(
						sprite.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						printArea.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						options.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						frameNum);
    }-*/;

    /**
     * Send.
     */
    public native void send() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.send();
    }-*/;

    /**
     * Show page setup dialog.
     * 
     * @return true, if successful
     */
    public native boolean showPageSetupDialog() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.showPageSetupDialog();
    }-*/;

    /**
     * Start.
     * 
     * @return true, if successful
     */
    public native boolean start() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.start();
    }-*/;

}
