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

package com.ait.toolkit.flash.alivepdf.client.viewing;

/**
 * The Enum ToolBar.
 */
public enum ToolBar {

    /** The SHOW. */
    SHOW("true"),
    /** The HIDE. */
    HIDE("false");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new tool bar.
     * 
     * @param reference the reference
     */
    private ToolBar(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the tool bar
     */
    public static native ToolBar fromValue(String value) /*-{
		switch (value) {
		case 'true':
			return @com.ait.toolkit.flash.alivepdf.client.viewing.ToolBar::SHOW;
		case 'false':
			return @com.ait.toolkit.flash.alivepdf.client.viewing.ToolBar::HIDE;
		}
    }-*/;
}
