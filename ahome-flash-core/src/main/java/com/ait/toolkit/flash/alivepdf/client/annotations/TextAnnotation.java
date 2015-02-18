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

package com.ait.toolkit.flash.alivepdf.client.annotations;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;

/**
 * The Class TextAnnotation.
 */
public class TextAnnotation extends Annotation {

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @return the text annotation
     */
    public TextAnnotation(AnnotationType type, String text) {
        jsObj = AlivePdfFactory.INSTANCE.createTextAnnotation(type.value, text);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @return the text annotation
     */
    public TextAnnotation(AnnotationType type, String text, int x) {
        jsObj = AlivePdfFactory.INSTANCE.createTextAnnotation(type.value, text, x);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @param y the y
     * @return the text annotation
     */
    public TextAnnotation(AnnotationType type, String text, int x, int y) {
        jsObj = AlivePdfFactory.INSTANCE.createTextAnnotation(type.value, text, x, y);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @param y the y
     * @param width the width
     * @return the text annotation
     */
    public TextAnnotation(AnnotationType type, String text, int x, int y, int width) {
        jsObj = AlivePdfFactory.INSTANCE.createTextAnnotation(type.value, text, x, y, width);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @param y the y
     * @param width the width
     * @param height the height
     * @return the text annotation
     */
    public TextAnnotation(AnnotationType type, String text, int x, int y, int width, int height) {
        jsObj = AlivePdfFactory.INSTANCE.createTextAnnotation(type.value, text, x, y, width, height);
    }

    /**
     * New instance.
     * 
     * @return the text annotation
     */
    public TextAnnotation() {
        jsObj = AlivePdfFactory.INSTANCE.createTextAnnotation();
    }

    /**
     * Checks if is open.
     * 
     * @return true, if is open
     */
    public native boolean isOpen() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getopen();
    }-*/;

    /**
     * Sets the open.
     * 
     * @param value the new open
     */
    public native void setOpen(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setopen(value);
    }-*/;
}
