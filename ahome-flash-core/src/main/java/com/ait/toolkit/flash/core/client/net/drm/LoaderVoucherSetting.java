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
package com.ait.toolkit.flash.core.client.net.drm;

/**
 * The Enum LoaderVoucherSetting.
 */
public enum LoaderVoucherSetting {

    /** The ALLO w_ server. */
    ALLOW_SERVER("allowServer"),
    /** The LOCA l_ only. */
    LOCAL_ONLY("localOnly"),
    /** The FORC e_ refresh. */
    FORCE_REFRESH("forceRefresh");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new loader voucher setting.
     * 
     * @param setting the setting
     */
    private LoaderVoucherSetting(String setting) {
        value = setting;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the loader voucher setting
     */
    public static native LoaderVoucherSetting fromValue(String value) /*-{
		switch (value) {
		case 'allowServer':
			return @com.ait.toolkit.flash.core.client.net.drm.LoaderVoucherSetting::ALLOW_SERVER;

		case 'forceRefresh':
			return @com.ait.toolkit.flash.core.client.net.drm.LoaderVoucherSetting::FORCE_REFRESH;

		case 'localOnly':
			return @com.ait.toolkit.flash.core.client.net.drm.LoaderVoucherSetting::LOCAL_ONLY

		}

    }-*/;
}
