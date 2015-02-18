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
 * The Enum StageQuality.
 */
public enum StageQuality {

    /** The BEST. */
    BEST("best"),
    /** The HIGH. */
    HIGH("high"),
    /** The LOW. */
    LOW("low"),
    /** The MEDIUM. */
    MEDIUM("medium");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new stage quality.
     * 
     * @param reference the reference
     */
    private StageQuality(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the stage quality
     */
    public static native StageQuality fromValue(String value) /*-{
		switch (value) {

		case 'best':
			return @com.ait.toolkit.flash.core.client.display.StageQuality::BEST;

		case 'high':
			return @com.ait.toolkit.flash.core.client.display.StageQuality::HIGH;

		case 'low':
			return @com.ait.toolkit.flash.core.client.display.StageQuality::LOW;

		case 'medium':
			return @com.ait.toolkit.flash.core.client.display.StageQuality::MEDIUM;
		}
    }-*/;
}
