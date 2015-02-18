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
package com.ait.toolkit.flash.core.client.toplevel;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.display.Stage;
import com.ait.toolkit.flash.core.client.display.Stage3D;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.media.StageVideo;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Core.
 */
class Core extends JsObject {

    static final Core INSTANCE = new Core();

    /**
     * Instantiates a new core.
     */
    private Core() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of Core.
     * 
     * @return single instance of Core
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.core.Core");
    }

    /**
     * Navigate to url.
     * 
     * @param url
     *            the url
     */
    final native void navigateToURL(String url)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.navigateToURL(url);
    }-*/;

    /**
     * Navigate to url.
     * 
     * @param url
     *            the url
     * @param window
     *            the window
     */
    final native void navigateToURL(String url, String window)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.navigateToURL(url, window);
    }-*/;

    final native void xmlIgnoreWhiteSpace(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.xmlIgnoreWhiteSpace(value);
    }-*/;

    final native void xmlIgnoreComments(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.xmlIgnoreComments(value);
    }-*/;

    final native void xmlIgnoreProcessingInstructions(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.xmlIgnoreProcessingInstructions(value);
    }-*/;

    final native Stage3D getStage3DAt(Stage target, int index)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.getStage3DAt(
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						index);
		return @com.ait.toolkit.flash.core.client.display.Stage3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    final native StageVideo getStageVideoAt(Stage target, int index)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.getStageVideosAt(
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						index);
		return @com.ait.toolkit.flash.core.client.media.StageVideo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
