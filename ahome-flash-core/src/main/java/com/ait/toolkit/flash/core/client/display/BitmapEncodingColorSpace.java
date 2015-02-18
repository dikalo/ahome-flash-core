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
 * The Enum BitmapEncodingColorSpace.
 */
public enum BitmapEncodingColorSpace {

    /** The COLORSPACE_4_2_0. */
    COLORSPACE_4_2_0("4:2:0"),

    /** The COLORSPACE_4_2_2. */
    COLORSPACE_4_2_2("4:2:2"),

    /** The COLORSPACE_4_4_4. */
    COLORSPACE_4_4_4("4:4:4"),

    COLORSPACE_AUTO("auto");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new caps style.
     * 
     * @param openMode the open mode
     */
    private BitmapEncodingColorSpace(String openMode) {
        value = openMode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the caps style
     */
    public static native BitmapEncodingColorSpace fromValue(String value) /*-{
		switch (value) {
		case '4:2:0':
			return @com.ait.toolkit.flash.core.client.display.BitmapEncodingColorSpace::COLORSPACE_4_2_0;

		case '4:2:2':
			return @com.ait.toolkit.flash.core.client.display.BitmapEncodingColorSpace::COLORSPACE_4_2_2;

		case '4:4:4':
			return @com.ait.toolkit.flash.core.client.display.BitmapEncodingColorSpace::COLORSPACE_4_4_4;

		case 'auto':
			return @com.ait.toolkit.flash.core.client.display.BitmapEncodingColorSpace::COLORSPACE_AUTO;
		}
    }-*/;

}
