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
 * The Class ActivityEvent.
 */
public class ActivityEvent extends Event {

    /** The Constant ACTIVITY. */
    public static String ACTIVITY = "activity";

    /**
     * Instantiates a new activity event.
     */
    protected ActivityEvent() {
    }

    ActivityEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Checks if is activating.
     * 
     * @return true, if is activating
     */
    public native boolean isActivating() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getactivating();

    }-*/;

    /**
     * Sets the activating.
     * 
     * @param activating the new activating
     */
    public native void setActivating(boolean activating) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setactivating(activating);
    }-*/;

    public static ActivityEvent cast(Event event) {
        return new ActivityEvent(event.getJsObj());
    }

}
