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
package com.ait.toolkit.flash.core.client.text;

/**
 * The Enum TextFieldAutoSize.
 */
public enum TextFieldAutoSize {

    /** The CENTER. */
    CENTER("center"),

    /** The LEFT. */
    LEFT("left"),

    /** The COLORSPACE_4_2_0. */
    NONE("none"),

    /** The RIGHT. */
    RIGHT("right");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new text field auto size.
     * 
     * @param reference the reference
     */
    private TextFieldAutoSize(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the text field auto size
     */
    public static native TextFieldAutoSize fromValue(String value) /*-{
		switch (value) {
		case 'center':
			return @com.ait.toolkit.flash.core.client.text.TextFieldAutoSize::CENTER;

		case 'left':
			return @com.ait.toolkit.flash.core.client.text.TextFieldAutoSize::LEFT;

		case 'none':
			return @com.ait.toolkit.flash.core.client.text.TextFieldAutoSize::NONE;

		case 'right':
			return @com.ait.toolkit.flash.core.client.text.TextFieldAutoSize::RIGHT;

		}
    }-*/;
}
