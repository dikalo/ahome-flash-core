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
 * The Class MovieAnnotation.
 */
public class MovieAnnotation extends Annotation {

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @return the movie annotation
     */
    public MovieAnnotation(AnnotationType type, String text) {
        jsObj = AlivePdfFactory.INSTANCE.createMovieAnnotation(type.value, text);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @return the movie annotation
     */
    public MovieAnnotation(AnnotationType type, String text, int x) {
        jsObj = AlivePdfFactory.INSTANCE.createMovieAnnotation(type.value, text, x);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @param y the y
     * @return the movie annotation
     */
    public MovieAnnotation(AnnotationType type, String text, int x, int y) {
        jsObj = AlivePdfFactory.INSTANCE.createMovieAnnotation(type.value, text, x, y);
    }

    /**
     * New instance.
     * 
     * @param type the type
     * @param text the text
     * @param x the x
     * @param y the y
     * @param width the width
     * @return the movie annotation
     */
    public MovieAnnotation(AnnotationType type, String text, int x, int y, int width) {
        jsObj = AlivePdfFactory.INSTANCE.createMovieAnnotation(type.value, text, x, y, width);
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
     * @return the movie annotation
     */
    public MovieAnnotation(AnnotationType type, String text, int x, int y, int width, int height) {
        jsObj = AlivePdfFactory.INSTANCE.createMovieAnnotation(type.value, text, x, y, width);
    }

    /**
     * New instance.
     * 
     * @return the movie annotation
     */
    public MovieAnnotation() {
        jsObj = AlivePdfFactory.INSTANCE.createMovieAnnotation();
    }

}
