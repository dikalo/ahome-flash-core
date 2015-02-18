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

package com.ait.toolkit.flash.alivepdf.client.saving;

/**
 * The Enum Download.
 */
public enum Download {

    /** The ATTACHMENT. */
    ATTACHMENT("attachement"),
    /** The INLINE. */
    INLINE("inline");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new download.
     * 
     * @param reference the reference
     */
    private Download(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the download
     */
    public static native Download fromValue(String value) /*-{
		switch (value) {
		case 'attachement':
			return @com.ait.toolkit.flash.alivepdf.client.saving.Download::ATTACHMENT;
		case 'inline':
			return @com.ait.toolkit.flash.alivepdf.client.saving.Download::INLINE;
		}
    }-*/;

}
