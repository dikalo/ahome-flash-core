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
 * The Enum StageAlign.
 */
public enum StageAlign {

    /** The BOTTOM. */
    BOTTOM("B"),
    /** The BOTTO m_ left. */
    BOTTOM_LEFT("BL"),
    /** The BOTTO m_ right. */
    BOTTOM_RIGHT("BR"),
    /** The LEFT. */
    LEFT("L"),
    /** The RIGHT. */
    RIGHT("R"),
    /** The TOP. */
    TOP("T"),
    /** The TO p_ left. */
    TOP_LEFT("TL"),
    /** The TO p_ right. */
    TOP_RIGHT("TR");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new stage align.
     * 
     * @param reference
     *            the reference
     */
    private StageAlign(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value
     *            the value
     * @return the stage align
     */
    public static native StageAlign fromValue(String value) /*-{
		switch (value) {

		case 'B':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::BOTTOM;

		case 'BL':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::BOTTOM_LEFT;

		case 'BR':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::BOTTOM_RIGHT;

		case 'L':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::LEFT;

		case 'T':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::TOP;

		case 'TL':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::TOP_LEFT;

		case 'TR':
			return @com.ait.toolkit.flash.core.client.display.StageAlign::TOP_RIGHT;

		}
    }-*/;

}
