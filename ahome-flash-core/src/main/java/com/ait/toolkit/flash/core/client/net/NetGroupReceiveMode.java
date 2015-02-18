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
 * The Enum NetGroupReceiveMode.
 */
public enum NetGroupReceiveMode {

    /** The EXACT. */
    EXACT("exact"),
    /** The NEAREST. */
    NEAREST("nearest");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new net group receive mode.
     * 
     * @param mode the mode
     */
    private NetGroupReceiveMode(String mode) {
        value = mode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the net group receive mode
     */
    public static native NetGroupReceiveMode fromValue(String value) /*-{
		switch (value) {
		case 'exact':
			return @com.ait.toolkit.flash.core.client.net.NetGroupReceiveMode::EXACT;
		case 'nearest':
			return @com.ait.toolkit.flash.core.client.net.NetGroupReceiveMode::NEAREST;
		}
    }-*/;
}
