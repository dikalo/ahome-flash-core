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
package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.toplevel.As3Vector;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NetMonitor class maintains a list of NetStream objects. Use the
 * NetMonitor class to keep track of NetStream objects in use in an application.
 * An instance of this class dispatches a netStreamCreate event whenever a new
 * NetStream object is created.
 * <p>
 * You can use the NetMonitor class to help track video playback and related
 * events without regard to the specific video player being used. This facility
 * can be helpful when implementing media measurement, analytics, and usage
 * tracking libraries.
 * <p>
 * Note: NetStream monitoring is not supported by FlashDetect Player in the browser on
 * Android and Blackberry Tablet OS, or by AIR on iOS.
 */
public class NetMonitor extends EventDispatcher {

    /**
     * Instantiates a new net monitor.
     */
    protected NetMonitor() {

    }

    NetMonitor(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * List streams.
     * 
     * @return the as3 vector
     */
    public native As3Vector listStreams()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.listStreams();
		return @com.ait.toolkit.flash.core.client.toplevel.As3Vector::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
