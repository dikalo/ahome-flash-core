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
 * The Class VideoEvent.
 */
public class VideoEvent extends Event {

    /** The Constant RENDER_STATE. */
    public static String RENDER_STATE = "renderState";

    /**
     * Instantiates a new video event.
     */
    protected VideoEvent() {
    }

    VideoEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public native String getStatus() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstatus();
    }-*/;

    /**
     * Gets the color space.
     * 
     * @return the color space
     */
    public native String getColorSpace()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcolorSpace();
    }-*/;

    public static VideoEvent cast(Event event) {
        return new VideoEvent(event.getJsObj());
    }

}
