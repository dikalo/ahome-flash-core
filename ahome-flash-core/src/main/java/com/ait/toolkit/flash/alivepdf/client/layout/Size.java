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

package com.ait.toolkit.flash.alivepdf.client.layout;

import com.ait.toolkit.flash.alivepdf.client.core.SizeFactory;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Size.
 */
public class Size extends JsObject {

    /**
     * Instantiates a new size.
     */
    Size(JavaScriptObject obj) {
        jsObj = obj;
    }

    /** The Constant A3. */
    public static final Size A3 = new Size(SizeFactory.INSTANCE.getA3());

    /** The Constant A4. */
    public static final Size A4 = new Size(SizeFactory.INSTANCE.getA4());

    /** The Constant A5. */
    public static final Size A5 = new Size(SizeFactory.INSTANCE.getA5());

    /** The Constant LETTER. */
    public static final Size LETTER = new Size(SizeFactory.INSTANCE.getLetter());

    /** The Constant LEGAL. */
    public static final Size LEGAL = new Size(SizeFactory.INSTANCE.getLegal());

    /** The Constant TABLOID. */
    public static final Size TABLOID = new Size(SizeFactory.INSTANCE.getTabloid());

}
