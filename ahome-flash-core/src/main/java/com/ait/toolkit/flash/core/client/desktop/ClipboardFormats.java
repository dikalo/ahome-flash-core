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

package com.ait.toolkit.flash.core.client.desktop;

/**
 * The Enum ClipboardFormats.
 */
public enum ClipboardFormats {

    /** The HTM l_ format. */
    HTML_FORMAT("air:html"),
    /** The TEX t_ format. */
    TEXT_FORMAT("air:text"),
    /** The RIC h_ tex t_ format. */
    RICH_TEXT_FORMAT("air:rtf");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new clipboard formats.
     * 
     * @param format the format
     */
    private ClipboardFormats(String format) {
        value = format;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the clipboard formats
     */
    public static native ClipboardFormats fromValue(String value) /*-{
		switch (value) {
		case 'air:html':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardFormats::HTML_FORMAT;

		case 'air:text':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardFormats::TEXT_FORMAT;

		case 'air:rtf':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardFormats::RICH_TEXT_FORMAT;

		}
    }-*/;

}
