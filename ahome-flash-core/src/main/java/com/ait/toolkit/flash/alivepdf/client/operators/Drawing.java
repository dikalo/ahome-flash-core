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
package com.ait.toolkit.flash.alivepdf.client.operators;

/**
 * The Enum Drawing.
 */
public enum Drawing {

    /** The STROKE. */
    STROKE("S"),
    /** The CLOS e_ an d_ stroke. */
    CLOSE_AND_STROKE("s"),
    /** The CLOS e_ an d_ fil l_ an d_ stroketline. */
    CLOSE_AND_FILL_AND_STROKETLINE("b"),
    /** The FIL l_ an d_ stroke. */
    FILL_AND_STROKE("B"),
    /** The FILL. */
    FILL("f");

    /** The value. */
    public final String value;

    private Drawing(String drawing) {
        this.value = drawing;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the drawing
     */
    public static native Drawing fromValue(String value) /*-{
		switch (value) {
		case 'S':
			return @com.ait.toolkit.flash.alivepdf.client.operators.Drawing::STROKE;
		case 's':
			return @com.ait.toolkit.flash.alivepdf.client.operators.Drawing::CLOSE_AND_STROKE
		case 'b':
			return @com.ait.toolkit.flash.alivepdf.client.operators.Drawing::CLOSE_AND_FILL_AND_STROKETLINE;
		case 'B':
			return @com.ait.toolkit.flash.alivepdf.client.operators.Drawing::FILL_AND_STROKE;
		case 'f':
			return @com.ait.toolkit.flash.alivepdf.client.operators.Drawing::FILL;
		}
    }-*/;

}
