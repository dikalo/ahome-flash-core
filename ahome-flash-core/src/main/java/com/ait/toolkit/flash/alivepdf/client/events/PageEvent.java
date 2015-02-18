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

package com.ait.toolkit.flash.alivepdf.client.events;

import com.ait.toolkit.flash.alivepdf.client.pages.Page;
import com.ait.toolkit.flash.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PageEvent.
 */
public class PageEvent extends Event {

    /** The Constant ADDED. */
    public static final String ADDED = "added";

    /**
     * Instantiates a new page event.
     */
    PageEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the page.
     * 
     * @return the page
     */
    public final native Page getPage()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getpage();
		return @com.ait.toolkit.flash.alivepdf.client.pages.Page::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public static PageEvent cast(Event event) {
        return new PageEvent(event.getJsObj());
    }

}
