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
package com.ait.toolkit.flash.core.client.assetloader;

import com.ait.toolkit.flash.core.client.assetloader.handlers.BinaryFileLoadHandler;
import com.ait.toolkit.flash.core.client.assetloader.handlers.ImageFileLoadHandler;
import com.ait.toolkit.flash.core.client.assetloader.handlers.LoadDoneHandler;
import com.ait.toolkit.flash.core.client.assetloader.handlers.TextFileLoadHandler;
import com.ait.toolkit.flash.core.client.assetloader.handlers.XmlFileLoadHandler;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.EventListener;
import com.ait.toolkit.flash.core.client.utils.factories.ObjectFactory;

/**
 * AssetLoader is designed to allow you to easily bulk load assets from external
 * files. In particular, it easily and conveniently supplies you with a single
 * reference to your external asset. Clearing that reference generally will
 * release the asset from memory (see note below). This tidies up the mess of
 * event listeners and object references often associated with the FlashDetect
 * Loader that can make bulk loading of external assets and clearing of those
 * assets tedious.
 * <p>
 * 
 * <p>
 * 
 * Note: FlashDetect DisplayObject assets can be unusually stubborn to unload,
 * particularly if the asset is a MovieClip that has children that are playing
 * or if there are hard EventListeners attached to it. You should stop all
 * MovieClips and remove all EventListeners on an asset before clearing the
 * reference. As of FlashDetect Player 10 you can dispose of stubborn
 * DisplayObject assets using the FlashDetect Player 10 unloadAndStop() method
 * on the asset's FlashDetect Loader, which can be accessed through
 * loaderInfo.loader, like so,
 * <code>displayObjectAsset.loaderInfo.loader.unloadAndStop();</code>
 * <p>
 * 
 * To get the progress of the AssetLoader while loading assets use,
 * 
 * <pre>
 *  import com.ait.toolkit.flash.core.client.assetloader.events.ProgressEvent;
 *  AssetLoader.addEventListener(AssetLoader.PROGRESS, progressListener);
 * </pre>
 * 
 * You can also get the progress by querying the AssetLoader directly,
 * 
 * <pre>
 * double percentDone = AssetLoader.getPercentDone();
 * </pre>
 * 
 * Zip file functionality utilizes FZip package by Claus Wahlers and Max
 * Herkender. Zip files to be read might first need to be prepared using
 * assetLoader/deng/tools/python/fzip-prepare.py
 * <p>
 * 
 * Note: You might need to set permissions for local file access from the
 * FlashDetect Global Security Settings panel, see,
 * http://www.macromedia.com/support/documentation/en/flashplayer/help/ and
 * select "Global Security Settings Panel"
 * 
 * @author Ekambi
 * 
 */
public class AssetLoader extends EventDispatcher {

	public static final String WARNING_CANT_RECOGNIZE_FILE_TYPE = "LDR00";
	public static final String WARNING_CANT_RECOGNIZE_LOADER_TYPE = "LDR01";
	public static final String WARNING_FILE_NOT_FOUND = "LDR02";
	public static final String WARNING_FILE_CANT_LOAD = "LDR03";
	public static final String WARNING_CLASS_NOT_FOUND = "LDR04";
	public static final String WARNING_SECURITY_BREACH = "LDR05";
	public static final String WARNING_PARSE_ERROR = "LDR06";
	public static final String WARNING_LOAD_TIMEOUT = "LDR07";
	public static final String INFO_LOADER_ISSUE = "LDR08";
	public static final String INFO_FILE_CLOSED = "LDR09";
	public static final String DEBUG_FILE_REQUESTED = "LDR10";
	public static final String DEBUG_FILE_LOADED = "LDR11";
	public static final String DEBUG_BATCH_COMPLETE = "LDR12";

	private static final AssetLoader INSTANCE = new AssetLoader();

	// internal loader types
	public static final String SWF = "swf"; // .swf Small Web Format/FlashDetect

	public static final String IMAGE = "image"; // .bmp Bitmap image file format
												// .png Portable Network
												// Graphics
												// .jpg, .jpeg Joint
												// Photographic Experts Group
												// .gif Graphics Interchange
												// Format

	public static final String SOUND = "sound"; // .aif, .aiff Audio Interchange
												// File Format
												// .mp3 MPEG-1 Audio Layer 3
												// .wav Waveform audio format

	public static final String ZIP = "zip"; // .zip "zip" (meaning "speed") data
											// compression and archive format

	public static final String DATA = "data"; // .html Hypertext Markup Language
												// .txt, .text Text (ASCI) data

	public static final String XML = "xml"; // .xml Extensible Markup Language

	public static final String BINARY = "binary"; // .bin Binary

	public static final String VARIABLES = "variables"; // .var, .vars Url
														// variables

	AssetLoader() {
		jsObj = ObjectFactory.INSTANCE.createAssetLoader();
	}

	public static void loadXMLFile(String url, XmlFileLoadHandler handler) {
		get()._loadFile(url, handler);
	}

	public static void loadTextFile(String url, TextFileLoadHandler handler) {
		get()._loadFile(url, handler);
	}

	public static void loadImageFile(String url, ImageFileLoadHandler handler) {
		get()._loadFile(url, handler);
	}

	public static void loadFile(String url, BinaryFileLoadHandler handler) {
		get()._loadFile(url, handler);
	}

	public static void whenDone(LoadDoneHandler handler) {
		get()._whenDone(handler);
	}

	public static void removeListener(String type, EventListener<?> listener) {
		get().removeEventListener(type, listener);
	}

	public static boolean hasListener(String type) {
		return get().hasEventListener(type);
	}

	public static void setTimeToRetry(int value) {
		get()._setTimeToRetry(value);
	}

	public static int getTimeToRetry() {
		return get()._getTimeToRetry();
	}

	public static double getPercentDone() {
		return get()._getPercentDone();
	}

	public static boolean isIdle() {
		return get()._getIdle();
	}

	private static AssetLoader get() {
		return INSTANCE;
	}

	private final native void _loadFile(String fileUrl,
			TextFileLoadHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadFile(
						fileUrl,
						function(content) {
							return handler.@com.ait.toolkit.flash.core.client.assetloader.handlers.TextFileLoadHandler::onLoad(Ljava/lang/String;)(content);
						});
	}-*/;

	private final native void _loadFile(String fileUrl,
			ImageFileLoadHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadFile(
						fileUrl,
						function(content) {
							var bitmap = @com.ait.toolkit.flash.core.client.display.Bitmap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(content);
							return handler.@com.ait.toolkit.flash.core.client.assetloader.handlers.ImageFileLoadHandler::onLoad(Lcom/ait/toolkit/flash/core/client/display/Bitmap;)(bitmap);
						});
	}-*/;

	private final native void _loadFile(String xmlFilePath,
			XmlFileLoadHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadFile(
						xmlFilePath,
						function(xml) {
							var xmlObject = @com.ait.toolkit.flash.core.client.toplevel.XML::new(Lcom/google/gwt/core/client/JavaScriptObject;)(xml);
							return handler.@com.ait.toolkit.flash.core.client.assetloader.handlers.XmlFileLoadHandler::onLoad(Lcom/ait/toolkit/flash/core/client/toplevel/XML;)(xmlObject);
						});
	}-*/;

	private final native void _loadFile(String filePath,
			BinaryFileLoadHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadFile(
						filePath,
						function(content) {
							var bytes = @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(content);
							return handler.@com.ait.toolkit.flash.core.client.assetloader.handlers.BinaryFileLoadHandler::onLoad(Lcom/ait/toolkit/flash/core/client/utils/ByteArray;)(bytes);
						});
	}-*/;

	private final native void _whenDone(LoadDoneHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.whenDone(function(e) {
					var eventObject = @com.ait.toolkit.flash.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.ait.toolkit.flash.core.client.assetloader.handlers.LoadDoneHandler::onLoadDone(Lcom/ait/toolkit/flash/core/client/events/Event;)(eventObject);
				});
	}-*/;

	private final native int _getTimeToRetry()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettimeToRetry();
	}-*/;

	private final native void _setTimeToRetry(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settimeToRetry(value);
	}-*/;

	private final native double _getPercentDone()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpercentDone();
	}-*/;

	private final native boolean _getIdle()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getidle();
	}-*/;

}
