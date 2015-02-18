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
package com.ait.toolkit.flash.alivepdf.client.images;

/**
 * The Enum ColorSpace.
 */
public enum ColorSpace {

    /** The DEVIC e_ rgb. */
    DEVICE_RGB("DeviceRGB"),
    /** The DEVIC e_ gray. */
    DEVICE_GRAY("DeviceGray"),
    /** The DEVIC e_ cmyk. */
    DEVICE_CMYK("DeviceCMYK"),
    /** The INDEXED. */
    INDEXED("indexed");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new color space.
     * 
     * @param reference the reference
     */
    private ColorSpace(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the color space
     */
    public static native ColorSpace fromValue(String value) /*-{
		switch (value) {
		case 'DeviceRGB':
			return @com.ait.toolkit.flash.alivepdf.client.images.ColorSpace::DEVICE_RGB;
		case 'DeviceGray':
			return @com.ait.toolkit.flash.alivepdf.client.images.ColorSpace::DEVICE_GRAY;
		case 'DeviceCMYK':
			return @com.ait.toolkit.flash.alivepdf.client.images.ColorSpace::DEVICE_CMYK;
		case 'indexed':
			return @com.ait.toolkit.flash.alivepdf.client.images.ColorSpace::INDEXED;
		}
    }-*/;
}
