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

package com.ait.toolkit.flash.core.client.ui;

/**
 * The Enum KeyLocation.
 */
public enum KeyLocation {

    /** The STANDARD. */
    STANDARD(0),
    /** The LEFT. */
    LEFT(1),
    /** The RIGHT. */
    RIGHT(2),
    /** The NU m_ pad. */
    NUM_PAD(3);

    /** The value. */
    public final int value;

    /**
     * Instantiates a new key location.
     * 
     * @param value the value
     */
    private KeyLocation(int value) {
        this.value = value;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the key location
     */
    public static native KeyLocation fromValue(int value) /*-{
		switch (value) {
		case 0:
			return @com.ait.toolkit.flash.core.client.ui.KeyLocation::STANDARD;
		case 1:
			return @com.ait.toolkit.flash.core.client.ui.KeyLocation::LEFT;
		case 2:
			return @com.ait.toolkit.flash.core.client.ui.KeyLocation::RIGHT;
		case 3:
			return @com.ait.toolkit.flash.core.client.ui.KeyLocation::NUM_PAD;
		}

    }-*/;
}
