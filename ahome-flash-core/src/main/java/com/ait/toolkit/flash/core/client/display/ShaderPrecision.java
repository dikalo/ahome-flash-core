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
 * The Enum ShaderPrecision.
 */
public enum ShaderPrecision {

    /** The FAST. */
    FAST("FAST"),

    /** The FULL. */
    FULL("FULL");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new shader precision.
     * 
     * @param precision the precision
     */
    private ShaderPrecision(String precision) {
        value = precision;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the shader precision
     */
    public static native ShaderPrecision fromValue(String value) /*-{
		switch (value) {

		case 'fast':
			return @com.ait.toolkit.flash.core.client.display.ShaderPrecision::FAST;

		case 'full':
			return @com.ait.toolkit.flash.core.client.display.ShaderPrecision::FAST;

		}
    }-*/;
}
