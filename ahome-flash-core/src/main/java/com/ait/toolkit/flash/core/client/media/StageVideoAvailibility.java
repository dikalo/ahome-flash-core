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

package com.ait.toolkit.flash.core.client.media;

/**
 * The Enum StageVideoAvailibility.
 */
public enum StageVideoAvailibility {

    /** The AVAILABLE. */
    AVAILABLE("available"),
    /** The UNAVAILABLE. */
    UNAVAILABLE("unavailable");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new stage video availibility.
     * 
     * @param reference the reference
     */
    private StageVideoAvailibility(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the stage video availibility
     */
    public static native StageVideoAvailibility fromValue(String value) /*-{
		switch (value) {
		case 'available':
			return @com.ait.toolkit.flash.core.client.media.StageVideoAvailibility::AVAILABLE;

		case 'unavailable':
			return @com.ait.toolkit.flash.core.client.media.StageVideoAvailibility::UNAVAILABLE
		}
    }-*/;

}
