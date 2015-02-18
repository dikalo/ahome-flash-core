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

package com.ait.toolkit.flash.alivepdf.client.drawing;

import java.util.ArrayList;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Class DashedLine.
 */
public class DashedLine extends JsObject {

    /**
     * Instantiates a new dashed line.
     */
    DashedLine(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param pDashedPattern the dashed pattern
     * @return the dashed line
     */
    public DashedLine(ArrayList<String> pattern) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : pattern) {
            values.push(s);
        }
        jsObj = AlivePdfFactory.INSTANCE.createDashLine(values);
    }

    public DashedLine(JsArrayString pattern) {
        jsObj = AlivePdfFactory.INSTANCE.createDashLine(pattern);
    }

    /**
     * Gets the pattern.
     * 
     * @return the pattern
     */
    public final native JsArrayString getPattern() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpattern();
    }-*/;

}
