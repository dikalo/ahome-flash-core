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
 * The Enum TransitionDirection.
 */
public enum TransitionDirection {

    /** The LEF t_ t o_ right. */
    LEFT_TO_RIGHT(0),
    /** The BOTTO m_ t o_ top. */
    BOTTOM_TO_TOP(90),
    /** The RIGH t_ t o_ left. */
    RIGHT_TO_LEFT(180),
    /** The TO p_ t o_ bottom. */
    TOP_TO_BOTTOM(270),
    /** The TO p_ lef t_ t o_ botto m_ right. */
    TOP_LEFT_TO_BOTTOM_RIGHT(315);

    /** The value. */
    public final int value;

    /**
     * Instantiates a new transition direction.
     * 
     * @param reference the reference
     */
    private TransitionDirection(int reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the transition direction
     */
    public static native TransitionDirection fromValue(String value) /*-{
		switch (value) {
		case 0:
			return @com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection::LEFT_TO_RIGHT;
		case 90:
			return @com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection::LEFT_TO_RIGHT;
		case 270:
			return @com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection::TOP_TO_BOTTOM;
		case 180:
			return @com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection::RIGHT_TO_LEFT;
		case 315:
			return @com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection::TOP_LEFT_TO_BOTTOM_RIGHT;
		}
    }-*/;

}