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

/**
 * The Enum FontFamily.
 */
public enum FontFamily {

    /** The ARIAL. */
    ARIAL("arial"),
    /** The COURIER. */
    COURIER("Courier"),
    /** The COURIE r_ bold. */
    COURIER_BOLD("Courier-Bold"),
    /** The COURIE r_ oblique. */
    COURIER_OBLIQUE("Courier-Oblique"),
    /** The COURIE r_ boldoblique. */
    COURIER_BOLDOBLIQUE("Courier-Bold-Oblique"),
    /** The HELVETICA. */
    HELVETICA("Helvetica"),
    /** The HELVETIC a_ bold. */
    HELVETICA_BOLD("Helvetica-Bold"),

    /** The HELVETIC a_ oblique. */
    HELVETICA_OBLIQUE("Helvetica-Oblique"),

    /** The HELVETIC a_ boldoblique. */
    HELVETICA_BOLDOBLIQUE("Helvetica-BoldOblique"),

    /** The TIMES. */
    TIMES("Times"),

    /** The TIME s_ bold. */
    TIMES_BOLD("Times-Bold"),

    /** The TIME s_ italic. */
    TIMES_ITALIC("Times-Italic"),

    /** The TIME s_ bolditalic. */
    TIMES_BOLDITALIC("Times-BoldItalic"),

    /** The SYMBOL. */
    SYMBOL("Symbol"),

    /** The ZAPFDINGBATS. */
    ZAPFDINGBATS("ZapfDingbats");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new font family.
     * 
     * @param reference the reference
     */
    private FontFamily(String reference) {
        value = reference;
    }

}
