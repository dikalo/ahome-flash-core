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

package com.ait.toolkit.flash.core.client.printing;

/**
 * This class provides values that are used by the PrintJob.orientation property
 * for the image position of a printed page.
 */
public enum PrintJobOrientation {

    /** The LANDSCAPE. */
    LANDSCAPE("landscape"),
    /** The PORTRAIT. */
    PORTRAIT("portrait");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new prints the job orientation.
     * 
     * @param reference the reference
     */
    private PrintJobOrientation(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the prints the job orientation
     */
    public static native PrintJobOrientation fromValue(String value) /*-{
		switch (value) {
		case 'landscape':
			return @com.ait.toolkit.flash.core.client.printing.PrintJobOrientation::LANDSCAPE;

		case 'portrait':
			return @com.ait.toolkit.flash.core.client.printing.PrintJobOrientation::PORTRAIT;
		}
    }-*/;

}
