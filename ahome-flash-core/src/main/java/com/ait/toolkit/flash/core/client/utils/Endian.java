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
package com.ait.toolkit.flash.core.client.utils;

/**
 * The Enum Endian.
 */
public enum Endian {

    /** The BI g_ endian. */
    BIG_ENDIAN("bigEndian"),
    /** The LITTL e_ endian. */
    LITTLE_ENDIAN("littleEndian");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new endian.
     * 
     * @param value the value
     */
    private Endian(String value) {
        this.value = value;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the endian
     */
    public static native Endian fromValue(String value) /*-{
		switch (value) {

		case 'bigEndian':
			return @com.ait.toolkit.flash.core.client.utils.Endian::BIG_ENDIAN;

		case 'littleEndian':
			return @com.ait.toolkit.flash.core.client.utils.Endian::LITTLE_ENDIAN;
		}
    }-*/;
}
