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
 * The Enum PixelSnapping.
 */
public enum PixelSnapping {

    /** The ALWAYS. */
    ALWAYS("always"),

    /** The AUTO. */
    AUTO("auto"),

    /** The NEVER. */
    NEVER("never");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new pixel snapping.
     * 
     * @param reference the reference
     */
    private PixelSnapping(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the pixel snapping
     */
    public static native PixelSnapping fromValue(String value) /*-{
		switch (value) {

		case 'always':
			return @com.ait.toolkit.flash.core.client.display.PixelSnapping::ALWAYS;

		case 'auto':
			return @com.ait.toolkit.flash.core.client.display.PixelSnapping::AUTO

		case 'never':
			return @com.ait.toolkit.flash.core.client.display.PixelSnapping::NEVER;

		}
    }-*/;

}
