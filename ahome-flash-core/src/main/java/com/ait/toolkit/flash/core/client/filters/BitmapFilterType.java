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

package com.ait.toolkit.flash.core.client.filters;

/**
 * The Enum BitmapFilterType.
 */
public enum BitmapFilterType {

    /** The FULL. */
    FULL("full"),
    /** The INNER. */
    INNER("inner"),
    /** The OUTER. */
    OUTER("outer");

    /** The value. */
    public String value;

    /**
     * Instantiates a new bitmap filter type.
     * 
     * @param mode the mode
     */
    private BitmapFilterType(String mode) {
        this.value = mode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the bitmap filter type
     */
    public static native BitmapFilterType fromValue(String value) /*-{
		switch (value) {
		case 'full':
			return @com.ait.toolkit.flash.core.client.filters.BitmapFilterType::FULL;

		case 'inner':
			return @com.ait.toolkit.flash.core.client.filters.BitmapFilterType::INNER;

		case 'outer':
			return @com.ait.toolkit.flash.core.client.filters.BitmapFilterType::OUTER;

		}
    }-*/;

}
