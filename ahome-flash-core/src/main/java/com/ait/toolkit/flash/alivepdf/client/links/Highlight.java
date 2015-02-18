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

package com.ait.toolkit.flash.alivepdf.client.links;

/**
 * The Enum Highlight.
 */
public enum Highlight {

    /** The NONE. */
    NONE("N"),
    /** The INVERT. */
    INVERT("I"),
    /** The OUTLINE. */
    OUTLINE("O"),
    /** The PUSH. */
    PUSH("P");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new highlight.
     * 
     * @param reference the reference
     */
    private Highlight(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the highlight
     */
    public static native Highlight fromValue(String value) /*-{
		switch (value) {
		case 'N':
			return @com.ait.toolkit.flash.alivepdf.client.links.Highlight::NONE;
		case 'I':
			return @com.ait.toolkit.flash.alivepdf.client.links.Highlight::INVERT;
		case 'O':
			return @com.ait.toolkit.flash.alivepdf.client.links.Highlight::OUTLINE;
		case 'P':
			return @com.ait.toolkit.flash.alivepdf.client.links.Highlight::PUSH;
		}
    }-*/;

}
