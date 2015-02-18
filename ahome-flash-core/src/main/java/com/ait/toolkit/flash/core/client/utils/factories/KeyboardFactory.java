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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Keyboard objects.
 */
public class KeyboardFactory extends JsObject {

    private static final KeyboardFactory INSTANCE = new KeyboardFactory();

    public static KeyboardFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new keyboard factory.
     */
    private KeyboardFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of KeyboardFactory.
     * 
     * @return single instance of KeyboardFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.gwt.flash.factories.KeyboardFactory");
    }

    /**
     * Checks if is caps lock activated.
     * 
     * @return true, if is caps lock activated
     */
    public final native boolean isCapsLockActivated()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isCapsLockActivated();
    }-*/;

    /**
     * Checks for virtual key board.
     * 
     * @return true, if successful
     */
    public final native boolean hasVirtualKeyBoard()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.hasVirtualKeyBoard();
    }-*/;

    /**
     * Checks if is numlock activated.
     * 
     * @return true, if is numlock activated
     */
    public final native boolean isNumlockActivated()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isNumlockActivated();
    }-*/;

    /**
     * Gets the physical keyboard type.
     * 
     * @return the physical keyboard type
     */
    public final native String getPhysicalKeyboardType()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getPhysicalKeyboardType();
    }-*/;

    /**
     * Checks if is accessible.
     * 
     * @return true, if is accessible
     */
    public final native boolean isAccessible()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isAccessible();
    }-*/;

}
