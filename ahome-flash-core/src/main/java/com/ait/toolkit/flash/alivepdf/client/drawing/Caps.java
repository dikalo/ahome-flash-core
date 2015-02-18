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

package com.ait.toolkit.flash.alivepdf.client.drawing;

/**
 * The Enum Caps.
 */
public enum Caps {

    /** The NONE. */
    NONE("0 J"),
    /** The ROUND. */
    ROUND("1 J"),
    /** The SQUARE. */
    SQUARE("2 J");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new caps.
     * 
     * @param reference the reference
     */
    private Caps(String reference) {
        value = reference;
    }

}
