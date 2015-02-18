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
 * The Class TextEvent.
 */
public class TextEvent extends Event {

    /** The Constant LINK. */
    public static String LINK = "link";

    /** The Constant TEXT_INPUT. */
    public static String TEXT_INPUT = "textInput";

    /**
     * Instantiates a new text event.
     */
    protected TextEvent() {
    }

    protected TextEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettext();
    }-*/;

    public static TextEvent cast(Event event) {
        return new TextEvent(event.getJsObj());
    }

}
