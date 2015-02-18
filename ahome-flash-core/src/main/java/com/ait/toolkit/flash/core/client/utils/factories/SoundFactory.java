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
package com.ait.toolkit.flash.core.client.utils.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.media.SoundLoaderContext;
import com.ait.toolkit.flash.core.client.net.URLRequest;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Sound objects.
 */
public class SoundFactory extends JsObject {

    private static final SoundFactory INSTANCE = new SoundFactory();

    public static SoundFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new sound factory.
     */
    private SoundFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of SoundFactory.
     * 
     * @return single instance of SoundFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.SoundFactory");
    }

    /**
     * Creates a new Sound object.
     * 
     * @return the sound
     */
    public final native JavaScriptObject createSound()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createSound();
    }-*/;

    /**
     * Creates a new Sound object.
     * 
     * @param urlRequest the url request
     * @return the sound
     */
    public final native JavaScriptObject createSound(URLRequest urlRequest)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createSound(urlRequest.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Sound object.
     * 
     * @param urlRequest the url request
     * @param loaderContext the loader context
     * @return the sound
     */
    public final native JavaScriptObject createSound(URLRequest urlRequest, SoundLoaderContext loaderContext)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createSound(
						urlRequest.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						loaderContext.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
