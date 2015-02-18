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

package com.ait.toolkit.flash.core.client.net;

/**
 * The Enum URLLoaderDataFormat.
 */
public enum URLLoaderDataFormat {

    /** The BINARY. */
    BINARY("binary"),

    /** The TEXT. */
    TEXT("text"),

    /** The VARIABLES. */
    VARIABLES("variables");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new uRL loader data format.
     * 
     * @param format the format
     */
    private URLLoaderDataFormat(String format) {
        value = format;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the uRL loader data format
     */
    public static native URLLoaderDataFormat fromValue(String value) /*-{
		switch (value) {
		case 'binary':
			return @com.ait.toolkit.flash.core.client.net.URLLoaderDataFormat::BINARY;
		case 'text':
			return @com.ait.toolkit.flash.core.client.net.URLLoaderDataFormat::TEXT;
		case 'variables':
			return @com.ait.toolkit.flash.core.client.net.URLLoaderDataFormat::VARIABLES;
		}
    }-*/;
}
