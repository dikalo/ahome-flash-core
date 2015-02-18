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

package com.ait.toolkit.flash.alivepdf.client.layout;

/**
 * The Enum Layout.
 */
public enum Layout {

    /** The SINGL e_ page. */
    SINGLE_PAGE("SinglePage"),
    /** The ON e_ column. */
    ONE_COLUMN("OneColumn"),
    /** The TW o_ colum n_ left. */
    TWO_COLUMN_LEFT("TwoColumnLeft"),
    /** The TW o_ colum n_ right. */
    TWO_COLUMN_RIGHT("TwoColumnRight"),
    /** The TW o_ pag e_ left. */
    TWO_PAGE_LEFT("TwoPageLeft"),
    /** The TW o_ pag e_ right. */
    TWO_PAGE_RIGHT("TwoPageRight");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new layout.
     * 
     * @param reference the reference
     */
    private Layout(String reference) {
        value = reference;
    }

}
