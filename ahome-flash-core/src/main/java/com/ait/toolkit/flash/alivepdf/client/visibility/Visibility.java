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

package com.ait.toolkit.flash.alivepdf.client.visibility;

/**
 * The Enum Visibility.
 */
public enum Visibility {

    /** The SCREEN. */
    SCREEN("screen"),
    /** The ALL. */
    ALL("all"),
    /** The PRINT. */
    PRINT("print");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new visibility.
     * 
     * @param reference the reference
     */
    private Visibility(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the visibility
     */
    public static native Visibility fromValue(String value) /*-{
		switch (value) {
		case 'screen':
			return @com.ait.toolkit.flash.alivepdf.client.visibility.Visibility::SCREEN;
		case 'all':
			return @com.ait.toolkit.flash.alivepdf.client.visibility.Visibility::ALL;
		case 'print':
			return @com.ait.toolkit.flash.alivepdf.client.visibility.Visibility::PRINT;
		}
    }-*/;

}
