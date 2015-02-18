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

package com.ait.toolkit.flash.alivepdf.client.transitions;

/**
 * The Enum Transition.
 */
public enum Transition {

    /** The SPLIT. */
    SPLIT("Split"),
    /** The BLINDS. */
    BLINDS("Blinds"),
    /** The BOX. */
    BOX("Box"),
    /** The WIPE. */
    WIPE("Wipe"),
    /** The DISSOLVE. */
    DISSOLVE("Dissolve"),
    /** The GLITTER. */
    GLITTER("Glitter"),
    /** The FLY. */
    FLY("Ffy"),
    /** The PUSH. */
    PUSH("Push"),
    /** The COVER. */
    COVER("Cover"),
    /** The UNCOVER. */
    UNCOVER("Uncover"),
    /** The FADE. */
    FADE("Fade"),
    /** The NONE. */
    NONE("None");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new transition.
     * 
     * @param reference the reference
     */
    private Transition(String reference) {
        value = createPeer(reference);
    }

    /**
     * Creates the peer.
     * 
     * @param reference the reference
     * @return the string
     */
    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.org.alivepdf.transitions.Transition[reference];
    }-*/;

    /**
     * From value.
     * 
     * @param value the value
     * @return the transition
     */
    public static native Transition fromValue(String value) /*-{
		switch (value) {
		case 'Split':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::SPLIT;
		case 'Blinds':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::BLINDS;
		case 'Box':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::BOX;
		case 'Wipe':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::WIPE;
		case 'Dissolve':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::DISSOLVE;
		case 'Glitter':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::GLITTER;
		case 'Fly':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::FLY;
		case 'push':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::PUSH;
		case 'Cover':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::COVER;
		case 'Uncover':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::UNCOVER;
		case 'fade':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::FADE;
		case 'none':
			return @com.ait.toolkit.flash.alivepdf.client.transitions.Transition::NONE;
		}
    }-*/;

}
