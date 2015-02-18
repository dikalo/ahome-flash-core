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

package com.ait.toolkit.flash.alivepdf.client.display;

/**
 * The Enum PageMode.
 */
public enum PageMode {

    /** The US e_ none. */
    USE_NONE("UseNone"),
    /** The US e_ outlines. */
    USE_OUTLINES("UseOutLines"),
    /** The US e_ thumbs. */
    USE_THUMBS("UseThumbs"),
    /** The FULLSCREEN. */
    FULLSCREEN("FullScreen"),
    /** The US e_ oc. */
    USE_OC("UseOC"),
    /** The US e_ attachments. */
    USE_ATTACHMENTS("UseAttachments");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new page mode.
     * 
     * @param reference the reference
     */
    private PageMode(String reference) {
        value = reference;
    }

    /**
     * Creates the peer.
     * 
     * @param reference the reference
     * @return the string
     */
    private static native String createPeer(String reference) /*-{
		return $wnd.runtime.org.alivepdf.display.PageMode[reference];
    }-*/;

    /**
     * From value.
     * 
     * @param value the value
     * @return the page mode
     */
    public static native PageMode fromValue(String value) /*-{
		switch (value) {
		case 'UseNone':
			return @com.ait.toolkit.flash.alivepdf.client.display.PageMode::USE_NONE;
		case 'UseOutLines':
			return @com.ait.toolkit.flash.alivepdf.client.display.PageMode::USE_OUTLINES;
		case 'useThumbs':
			return @com.ait.toolkit.flash.alivepdf.client.display.PageMode::USE_THUMBS;
		case 'FullScreen':
			return @com.ait.toolkit.flash.alivepdf.client.display.PageMode::FULLSCREEN;
		case 'UseOc':
			return @com.ait.toolkit.flash.alivepdf.client.display.PageMode::USE_OC;
		case 'UseAttachments':
			return @com.ait.toolkit.flash.alivepdf.client.display.PageMode::USE_ATTACHMENTS;
		}
    }-*/;

}
