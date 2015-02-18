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

import com.ait.toolkit.flash.core.client.events.Event;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.events.handlers.HttpStatusHandler;
import com.ait.toolkit.flash.core.client.events.handlers.IOErrorHandler;
import com.ait.toolkit.flash.core.client.events.handlers.ProgressHandler;
import com.ait.toolkit.flash.core.client.system.ApplicationDomain;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The LoaderInfo class provides information about a loaded SWF file or a loaded
 * image file (JPEG, GIF, or PNG). LoaderInfo objects are available for any
 * display object. The information provided includes load progress, the URLs of
 * the loader and loaded content, the number of bytes total for the media, and
 * the nominal height and width of the media.
 */
public class LoaderInfo extends EventDispatcher {

    /**
     * Instantiates a new loader info.
     */
    protected LoaderInfo() {

    }

    protected LoaderInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the action script version.
     * 
     * @return the action script version
     */
    public native int getActionScriptVersion() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getactionScriptVersion();
    }-*/;

    /**
     * Gets the application domain.
     * 
     * @return the application domain
     */
    public native ApplicationDomain getApplicationDomain() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getapplicationDomain();
		return @com.ait.toolkit.flash.core.client.system.ApplicationDomain::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public native DisplayObject getContent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getcontent();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the loader.
     * 
     * @return the loader
     */
    public native Loader getLoader() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getloader();
		return @com.ait.toolkit.flash.core.client.display.Loader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public native int getWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public native int getHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Gets the swf version.
     * 
     * @return the swf version
     */
    public native double getSwfVersion() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getswfVersion();
    }-*/;

    /**
     * Gets the loader url.
     * 
     * @return the loader url
     */
    public native String getLoaderURL() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getloaderURL();
    }-*/;

    /**
     * Gets the frame rate.
     * 
     * @return the frame rate
     */
    public native int getFrameRate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getframeRate();
    }-*/;

    /**
     * Gets the content type.
     * 
     * @return the content type
     */
    public native String getContentType()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcontentType();
    }-*/;

    /**
     * Gets the bytes total.
     * 
     * @return the bytes total
     */
    public native double getBytesTotal()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Gets the bytes loaded.
     * 
     * @return the bytes loaded
     */
    public native double getBytesLoaded() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Gets the bytes.
     * 
     * @return the bytes
     */
    public native ByteArray getBytes() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getbytes();
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the child sandbox bridge.
     * 
     * @param <T> the generic type
     * @return the child sandbox bridge
     */
    public native <T> T getChildSandboxBridge() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getchildSandboxBridge();
    }-*/;

    /**
     * Checks if is uRL inaccessible.
     * 
     * @return true, if is uRL inaccessible
     */
    public native boolean isURLInaccessible() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisURLInaccessible();
    }-*/;

    /**
     * Gets the parameters.
     * 
     * @return the parameters
     */
    public native <T> T getParameters() /*-{
		return peer.getparameters();
    }-*/;

    /**
     * Parent allows child.
     * 
     * @return true, if successful
     */
    public native boolean parentAllowsChild() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getparentAllowsChild();
    }-*/;

    /**
     * Gets the uRL.
     * 
     * @return the uRL
     */
    public native String getUrl() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geturl();
    }-*/;

    /**
     * Same domain.
     * 
     * @return true, if samedomain
     */
    public native boolean sameDomain() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsameDomain();
    }-*/;

    /**
     * Dispatched when data has loaded successfully. In other words, it is
     * dispatched when all the content has been downloaded and the loading has
     * finished. The complete event is always dispatched after the init event.
     * The init event is dispatched when the object is ready to access, though
     * the content may still be downloading.
     * 
     * @param handler
     */
    public void addCompleteHandler(EventHandler handler) {
        this.addEventHandler(Event.COMPLETE, handler);
    }

    /**
     * Dispatched when the properties and methods of a loaded SWF file are
     * accessible and ready for use. The content, however, can still be
     * downloading.
     * 
     * @param handler
     */
    public void addInitHandler(EventHandler handler) {
        this.addEventHandler(Event.INIT, handler);
    }

    /**
     * Dispatched when a load operation starts.
     * 
     * @param handler
     */
    public void addOpenHandler(EventHandler handler) {
        this.addEventHandler(Event.OPEN, handler);
    }

    /**
     * Dispatched by a LoaderInfo object whenever a loaded object is removed by
     * using the unload() method of the Loader object, or when a second load is
     * performed by the same Loader object and the original content is removed
     * prior to the load beginning.
     * 
     * @param handler
     */
    public void addUnloadHandler(EventHandler handler) {
        this.addEventHandler(Event.UNLOAD, handler);
    }

    /**
     * Dispatched when a network request is made over HTTP and an HTTP status
     * code can be detected.
     * 
     * @param handler
     */
    public native void addHttpStatusHandler(HttpStatusHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.HTTPStatusEvent::HTTP_STATUS,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.HTTPStatusEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.HttpStatusHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/HTTPStatusEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when an input or output error occurs that causes a load
     * operation to fail.
     * <p>
     * 
     * Defines the value of the type property of an ioError event object.
     * 
     * @param handler
     */
    public native void addIoErrorHandler(IOErrorHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.IOErrorEvent::IO_ERROR,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.IOErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.IOErrorHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/IOErrorEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when data is received as the download operation progresses.
     * 
     * @param handler
     */
    public native void addProgressHandler(ProgressHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.ProgressEvent::PROGRESS,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.ProgressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.ProgressHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/ProgressEvent;)(eventObject);
						}));
    }-*/;

}
