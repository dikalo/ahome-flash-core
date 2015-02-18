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
 * The Enum NetStreamPlayTransitions.
 */
public enum NetStreamPlayTransitions {

    /** The APPEND. */
    APPEND("append"),
    /** The APPEN d_ an d_ wait. */
    APPEND_AND_WAIT("appendAndWait"),
    /** The RESET. */
    RESET("reset"),
    /** The RESUME. */
    RESUME("resume"),
    /** The STOP. */
    STOP("stop"),
    /** The SWAP. */
    SWAP("swap"),

    /** The SWITCH. */
    SWITCH("switch");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new net stream play transitions.
     * 
     * @param transition the transition
     */
    private NetStreamPlayTransitions(String transition) {
        value = transition;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the net stream play transitions
     */
    public static native NetStreamPlayTransitions fromValue(String value) /*-{
		switch (value) {
		case 'append':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::APPEND;

		case 'appendAndWait':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::APPEND_AND_WAIT;

		case 'reset':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::RESET;

		case 'stop':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::STOP;

		case 'resume':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::RESUME;

		case 'swap':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::SWAP;

		case 'switch':
			return @com.ait.toolkit.flash.core.client.net.NetStreamPlayTransitions::SWITCH;

		}
    }-*/;
}
