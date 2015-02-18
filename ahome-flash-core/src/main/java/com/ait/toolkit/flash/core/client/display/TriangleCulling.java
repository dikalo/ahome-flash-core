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

package com.ait.toolkit.flash.core.client.display;

/**
 * The Enum TriangleCulling.
 */
public enum TriangleCulling {

    /** The POSITIVE. */
    POSITIVE("positive"),
    /** The COLORSPACE_4_2_0. */
    NONE("none"),
    /** The NEGATIVE. */
    NEGATIVE("negative");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new triangle culling.
     * 
     * @param reference the reference
     */
    private TriangleCulling(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the triangle culling
     */
    public static native TriangleCulling fromValue(String value) /*-{
		switch (value) {

		case 'positive':
			return @com.ait.toolkit.flash.core.client.display.TriangleCulling::POSITIVE;

		case 'none':
			return @com.ait.toolkit.flash.core.client.display.TriangleCulling::NONE;

		case 'negative':
			return @com.ait.toolkit.flash.core.client.display.TriangleCulling::NEGATIVE;

		}
    }-*/;

}
