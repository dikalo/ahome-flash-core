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
package com.ait.toolkit.flash.core.client.framework;

import com.ait.toolkit.flash.core.client.display.Sprite;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wraps the native SWF Stage. For internal use only.
 * 
 */
public class Application extends Sprite {

    private static final Application INSTANCE = new Application();

    protected Application() {
        jsObj = Bridge.get().getRoot();
    }

    Application(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Get the unique instance of the top most Sprite object of the underlying
     * swf
     * 
     * @return
     */
    public static Application get() {
        return INSTANCE;
    }
}
