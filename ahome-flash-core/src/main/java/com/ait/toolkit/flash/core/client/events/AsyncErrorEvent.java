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
 * The Class AsyncErrorEvent.
 */
public class AsyncErrorEvent extends ErrorEvent {

    /** The Constant ASYNC_ERROR. */
    public static final String ASYNC_ERROR = "asyncError";

    /**
     * Instantiates a new async error event.
     */
    protected AsyncErrorEvent() {
    }

    AsyncErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static AsyncErrorEvent cast(Event event) {
        return new AsyncErrorEvent(event.getJsObj());
    }

}
