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

package com.ait.toolkit.flash.core.client.desktop;

/**
 * The Enum ClipboardTransferMode.
 */
public enum ClipboardTransferMode {

    /** The CLON e_ only. */
    CLONE_ONLY("cloneOnly"),
    /** The CLON e_ preferred. */
    CLONE_PREFERRED("clonePreferred"),
    /** The ORIGINA l_ only. */
    ORIGINAL_ONLY("originalOnly"),
    /** The ORIGINA l_ preferred. */
    ORIGINAL_PREFERRED("originalPreferred");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new clipboard transfer mode.
     * 
     * @param transferMode the transfer mode
     */
    private ClipboardTransferMode(String transferMode) {
        value = transferMode;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the clipboard transfer mode
     */
    public static native ClipboardTransferMode fromValue(String value) /*-{
		switch (value) {
		case 'cloneOnly':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardTransferMode::CLONE_ONLY;

		case 'clonePreferred':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardTransferMode::CLONE_PREFERRED;

		case 'originalOnly':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardTransferMode::ORIGINAL_ONLY;

		case 'originalPreferred':
			return @com.ait.toolkit.flash.core.client.desktop.ClipboardTransferMode::ORIGINAL_PREFERRED;

		}
    }-*/;
}
