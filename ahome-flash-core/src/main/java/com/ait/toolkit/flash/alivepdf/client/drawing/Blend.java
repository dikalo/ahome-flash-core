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

/**
 * The Enum Blend.
 */
public enum Blend {

    /** The NORMAL. */
    NORMAL("Normal"),
    /** The MULTIPLY. */
    MULTIPLY("Multiply"),
    /** The SCREEN. */
    SCREEN("Screen"),
    /** The OVERLAY. */
    OVERLAY("Overlay"),
    /** The DARKEN. */
    DARKEN("Darken"),
    /** The LIGHTEN. */
    LIGHTEN("Lighten"),
    /** The COLORDODGE. */
    COLORDODGE("ColorDodge"),
    /** The COLORBURN. */
    COLORBURN("ColorBurn"),
    /** The HARDLIGHT. */
    HARDLIGHT("HardLight"),
    /** The SOFTLIGHT. */
    SOFTLIGHT("SoftLight"),

    /** The DIFFERENCE. */
    DIFFERENCE("Difference"),

    /** The EXCLUSION. */
    EXCLUSION("Exclusion"),

    /** The LUMINOSITY. */
    LUMINOSITY("Luminosity"),

    /** The HUE. */
    HUE("Hue"),

    /** The SATURATION. */
    SATURATION("Saturation"),

    /** The COLOR. */
    COLOR("Color");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new blend.
     * 
     * @param reference the reference
     */
    private Blend(String reference) {
        value = reference;
    }

}
