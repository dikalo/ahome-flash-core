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

package com.ait.toolkit.flash.core.client.desktop;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Clipboard class provides a container for transferring data and objects
 * through the clipboard. The operating system clipboard can be accessed through
 * the static generalClipboard property.
 * <p>
 * A Clipboard object can contain the same information in more than one format.
 * By supplying information in multiple formats, you increase the chances that
 * another application will be able to use that information. Add data to a
 * Clipboard object with the setData() or setDataHandler() method.
 * </p>
 * 
 */
public final class Clipboard extends JsObject {

    private static final Clipboard INSTANCE = new Clipboard();

    private static Clipboard get() {
        return INSTANCE;
    }

    private Clipboard() {
        createNativePeer();
    }

    private Clipboard(JavaScriptObject peer) {
        jsObj = peer;
    }

    /**
     * gets the general clipboard.
     * 
     * @return the clipboard
     */
    private final native Clipboard getGeneralClipboard() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getgeneralClipboard();
		var toRetrn = @com.ait.toolkit.flash.core.client.desktop.Clipboard::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Gets the formats.
     * 
     * @return the formats
     */
    private native JsArrayString getFormats() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getformats();
    }-*/;

    /**
     * Supports file promise.
     * 
     * @return true, if successful
     */
    public static boolean supportsFilePromise() {
        return get()._supportsFilePromise();
    }

    /**
     * _supports file promise.
     * 
     * @return true, if successful
     */
    private final native boolean _supportsFilePromise() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsupportsFilePromise();
    }-*/;

    /**
     * Clear.
     */
    public final native void clear() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Clear data.
     * 
     * @param format the format
     */
    public final void clearData(ClipboardFormats format) {
        _clearData(format.value);
    }

    private final native void _clearData(String format) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clearData(format);
    }-*/;

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @param format the format
     * @return the data
     */
    public final <T> T getData(ClipboardFormats format) {
        return this.<T> _getData(format.value, ClipboardTransferMode.ORIGINAL_PREFERRED.value);
    }

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @param format the format
     * @param transferMode the transfer mode
     * @return the data
     */
    public final <T> T getData(ClipboardFormats format, ClipboardTransferMode transferMode) {
        return this.<T> _getData(format.value, transferMode.value);
    }

    /**
     * Gets the data.
     * 
     * @param <T> the generic type
     * @param format the format
     * @param transferMode the transfer mode
     * @return the data
     */
    public final <T> T getData(String format, ClipboardTransferMode transferMode) {
        return this.<T> _getData(format, transferMode.value);
    }

    /**
     * _get data.
     * 
     * @param <T> the generic type
     * @param format the format
     * @param transferMode the transfer mode
     * @return the t
     */
    private native <T> T _getData(String format, String transferMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getData(format, transferMode);
    }-*/;

    /**
     * Checks for format.
     * 
     * @param format the format
     * @return true, if successful
     */
    public final boolean hasFormat(ClipboardFormats format) {
        return this.hasFormat(format.value);
    }

    /**
     * Checks for format.
     * 
     * @param format the format
     * @return true, if successful
     */
    public final native boolean hasFormat(String format) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.hasFormat(format);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param format the format
     * @param data the data
     * @return true, if successful
     */
    public final boolean setData(ClipboardFormats format, Object data) {
        return this.setData(format.value, data);
    }

    /**
     * Sets the data.
     * 
     * @param format the format
     * @param data the data
     * @return true, if successful
     */
    public final native boolean setData(String format, Object data) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peers.setData(format, data);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param format the format
     * @param data the data
     * @param serializable the serializable
     * @return true, if successful
     */
    public final boolean setData(ClipboardFormats format, Object data, boolean serializable) {
        return this.setData(format.value, data, serializable);
    }

    /**
     * Sets the data.
     * 
     * @param format the format
     * @param data the data
     * @param serializable the serializable
     * @return true, if successful
     */
    public final native boolean setData(String format, Object data, boolean serializable) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setData(format, data, serializable);
    }-*/;

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @return true, if successful
     */
    public final boolean setDataHandler(ClipboardFormats format, ClipboardDataHandler handler) {
        return this.setDataHandler(format.value, createNativeDataHandler(handler));
    }

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @return true, if successful
     */
    public final boolean setDataHandler(String format, ClipboardDataHandler handler) {
        return this.setDataHandler(format, createNativeDataHandler(handler));
    }

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @return true, if successful
     */
    public final boolean setDataHandler(ClipboardFormats format, JavaScriptObject handler) {
        return this.setDataHandler(format.value, handler);
    }

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @return true, if successful
     */
    public final native boolean setDataHandler(String format, JavaScriptObject handler) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setDataHandler(format, handler);
    }-*/;

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @param serializable the serializable
     * @return true, if successful
     */
    public final boolean setDataHandler(ClipboardFormats format, ClipboardDataHandler handler, boolean serializable) {
        return this.setDataHandler(format.value, createNativeDataHandler(handler), serializable);
    }

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @param serializable the serializable
     * @return true, if successful
     */
    public final boolean setDataHandler(String format, ClipboardDataHandler handler, boolean serializable) {
        return this.setDataHandler(format, createNativeDataHandler(handler), serializable);
    }

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @param serializable the serializable
     * @return true, if successful
     */
    public final boolean setDataHandler(ClipboardFormats format, JavaScriptObject handler, boolean serializable) {
        return this.setDataHandler(format.value, handler, serializable);
    }

    /**
     * Sets the data handler.
     * 
     * @param format the format
     * @param handler the handler
     * @param serializable the serializable
     * @return true, if successful
     */
    public final native boolean setDataHandler(String format, JavaScriptObject handler, boolean serializable) /*-{
		return this.setDataHandler(format, handler, serializable);
    }-*/;

    /**
     * Creates the native data handler.
     * 
     * @param handler the handler
     * @return the java script object
     */
    private native JavaScriptObject createNativeDataHandler(ClipboardDataHandler handler) /*-{
		return function() {
			return handler.@com.ait.toolkit.flash.core.client.desktop.ClipboardDataHandler::getData()();
		}
    }-*/;

    private void createNativePeer() {
        jsObj = Bridge.createObject("flash.desktop.Clipboard");
    }

    private void updateWith(JavaScriptObject obj) {
        jsObj = obj;
    }
}
