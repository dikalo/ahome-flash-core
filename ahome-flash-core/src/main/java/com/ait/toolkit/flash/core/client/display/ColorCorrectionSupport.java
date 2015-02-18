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
 * The Enum ColorCorrectionSupport.
 */
public enum ColorCorrectionSupport {

    /** The DEFAUL t_ off. */
    DEFAULT_OFF("defaultOff"),

    /** The DEFAUL t_ on. */
    DEFAULT_ON("defaultOn"),

    /** The UNSUPPORTED. */
    UNSUPPORTED("unsupported");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new color correction support.
     * 
     * @param reference the reference
     */
    private ColorCorrectionSupport(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the color correction support
     */
    public static native ColorCorrectionSupport fromValue(String value) /*-{
		switch (value) {
		case 'defaultOff':
			return @com.ait.toolkit.flash.core.client.display.ColorCorrectionSupport::DEFAULT_OFF;

		case 'defaultOn':
			return @com.ait.toolkit.flash.core.client.display.ColorCorrectionSupport::DEFAULT_ON;

		case 'unsupported':
			return @com.ait.toolkit.flash.core.client.display.ColorCorrectionSupport::UNSUPPORTED;

		}
    }-*/;
}
