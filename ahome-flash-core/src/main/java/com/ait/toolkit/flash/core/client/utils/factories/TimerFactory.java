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
 * A factory for creating Timer objects.
 */
public class TimerFactory extends JsObject {

    public static final TimerFactory INSTANCE = new TimerFactory();

    /**
     * Instantiates a new timer factory.
     */
    private TimerFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of TimerFactory.
     * 
     * @return single instance of TimerFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.TimerFactory");
    }

    /**
     * Creates a new Timer object.
     * 
     * @return the timer
     */
    public final JavaScriptObject createTimer() {
        return createTimer(0);
    }

    /**
     * Creates a new Timer object.
     * 
     * @param delay the delay
     * @return the timer
     */
    public final native JavaScriptObject createTimer(int delay)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createTimer(delay);
    }-*/;

    /**
     * Creates a new Timer object.
     * 
     * @param delay the delay
     * @param repeatCount the repeat count
     * @return the timer
     */
    public final native JavaScriptObject createTimer(int delay, int repeatCount)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createTimer(delay, repeatCount);
    }-*/;

}
