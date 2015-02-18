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

package com.ait.toolkit.flash.core.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class NetStatusEvent.
 */
public class NetStatusEvent extends Event {

    /** The Constant NET_STATUS. */
    public static final String NET_STATUS = "netStatus";

    /**
     * Instantiates a new net status event.
     */
    protected NetStatusEvent() {

    }

    NetStatusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the info.
     * 
     * @param <T> the generic type
     * @return the info
     */
    public native <T> T getInfo() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getinfo();
    }-*/;

    public static NetStatusEvent cast(Event event) {
        return new NetStatusEvent(event.getJsObj());
    }

}
