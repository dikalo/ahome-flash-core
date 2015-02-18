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

package com.ait.toolkit.flash.alivepdf.client.saving;

/**
 * The Enum Method.
 */
public enum Method {

    /** The LOCAL. */
    LOCAL("local"),
    /** The REMOTE. */
    REMOTE("remote"),
    /** The BAS e_64. */
    BASE_64("base64");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new method.
     * 
     * @param reference the reference
     */
    private Method(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the method
     */
    public static native Method fromValue(String value) /*-{
		switch (value) {
		case 'local':
			return @com.ait.toolkit.flash.alivepdf.client.saving.Method::LOCAL;
		case 'remote':
			return @com.ait.toolkit.flash.alivepdf.client.saving.Method::REMOTE;
		case 'base64':
			return @com.ait.toolkit.flash.alivepdf.client.saving.Method::BASE_64;
		}
    }-*/;

}
