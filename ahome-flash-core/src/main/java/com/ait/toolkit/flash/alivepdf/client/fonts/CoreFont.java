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

package com.ait.toolkit.flash.alivepdf.client.fonts;

import com.ait.toolkit.flash.alivepdf.client.core.FontFactory;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CoreFont.
 */
public class CoreFont extends JsObject implements IFont {

    /**
     * Instantiates a new core font.
     */
    CoreFont(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param family the family
     * @return the core font
     */
    public CoreFont(FontFamily family) {
        jsObj = FontFactory.INSTANCE.createFont(family.value);
    }

    /**
     * New instance.
     * 
     * @return the core font
     */
    public CoreFont() {
        jsObj = FontFactory.INSTANCE.createFont();
    }

    @Override
    public JavaScriptObject asIFont() {
        return this.jsObj.cast();
    }
}
