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
 * The Enum ColorCorrection.
 */
public enum ColorCorrection {

    /** The DEFAULT. */
    DEFAULT("default"),

    /** The OFF. */
    OFF("off"),

    /** The ON. */
    ON("on");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new color correction.
     * 
     * @param reference the reference
     */
    private ColorCorrection(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the color correction
     */
    public static native ColorCorrection fromValue(String value) /*-{
		switch (value) {
		case 'default':
			return @com.ait.toolkit.flash.core.client.display.ColorCorrection::DEFAULT;

		case 'off':
			return @com.ait.toolkit.flash.core.client.display.ColorCorrection::OFF;

		case 'on':
			return @com.ait.toolkit.flash.core.client.display.ColorCorrection::ON;

		}
    }-*/;
}
