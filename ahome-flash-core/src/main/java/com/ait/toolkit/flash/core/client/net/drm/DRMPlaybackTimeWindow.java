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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.toplevel.Date;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DRMPlaybackTimeWindow class represents the period of time during which a
 * DRM voucher is valid.
 * <p>
 * The startDate and endDate properties are null until the first time that the
 * user views the content.
 */
public class DRMPlaybackTimeWindow extends JsObject {

    /**
     * Instantiates a new dRM playback time window.
     */
    protected DRMPlaybackTimeWindow() {

    }

    DRMPlaybackTimeWindow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the end date for the period of time during which a DRM voucher is
     * valid (the playback window).
     * 
     * @return the end date
     */
    public final native Date getEndDate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getendDate();
		return @com.ait.toolkit.flash.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the period of time during which a DRM voucher is valid (the playback
     * window), in seconds.
     * 
     * @return the period
     */
    public final native int getPeriod()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getperiod();
    }-*/;

    /**
     * The start date for the period of time during which a DRM voucher is valid
     * (the playback window).
     * 
     * @return the start date
     */
    public final native Date getStartDate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getstartDate();
		return @com.ait.toolkit.flash.core.client.toplevel.Date::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;
}
