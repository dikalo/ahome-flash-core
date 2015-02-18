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
 * The Enum BlendMode.
 */
public enum BlendMode {

    /** The ADD. */
    ADD("add"),
    /** The ALPHA. */
    ALPHA("alpha"),
    /** The DARKEN. */
    DARKEN("darken"),
    /** The DIFFERENCE. */
    DIFFERENCE("difference"),
    /** The ERASE. */
    ERASE("erase"),
    /** The HARDLIGHT. */
    HARDLIGHT("hardlight"),
    /** The INVERT. */
    INVERT("invert"),
    /** The LAYER. */
    LAYER("layer"),
    /** The LIGHTEN. */
    LIGHTEN("lighten"),
    /** The MULTIPLY. */
    MULTIPLY("multiply"),
    /** The NORMAL. */
    NORMAL("normal"),

    /** The OVERLAY. */
    OVERLAY("overlay"),

    /** The SCREEN. */
    SCREEN("screen"),

    /** The SHADER. */
    SHADER("shader"),

    /** The SUBTRACT. */
    SUBTRACT("substract");

    /** The value. */
    public String value;

    /**
     * Instantiates a new blend mode.
     * 
     * @param mode the mode
     */
    private BlendMode(String mode) {
        this.value = mode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the blend mode
     */
    public static native BlendMode fromValue(String value) /*-{
		switch (value) {
		case 'add':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::ADD;

		case 'alpha':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::ALPHA;

		case 'darken':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::DARKEN;

		case 'difference':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::DIFFERENCE;

		case 'erase':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::ERASE;

		case 'hardlight':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::HARDLIGHT;

		case 'invert':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::INVERT;

		case 'layer':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::LAYER;

		case 'lighten':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::LIGHTEN;

		case 'multiply':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::MULTIPLY;

		case 'normal':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::NORMAL;

		case 'overlay':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::OVERLAY;

		case 'screen':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::SCREEN;

		case 'shader':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::SHADER;

		case 'subtract':
			return @com.ait.toolkit.flash.core.client.display.BlendMode::SUBTRACT;

		}
    }-*/;

}
