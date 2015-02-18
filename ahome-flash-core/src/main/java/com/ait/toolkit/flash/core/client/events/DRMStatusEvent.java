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

package com.ait.toolkit.flash.core.client.events;

import java.util.Date;

import com.ait.toolkit.flash.core.client.net.drm.DRMContentData;
import com.ait.toolkit.flash.core.client.net.drm.DRMVoucher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class DRMStatusEvent.
 */
public class DRMStatusEvent extends Event {

    /** The Constant DRM_STATUS. */
    public static String DRM_STATUS = "drmStatus";

    /**
     * Instantiates a new dRM status event.
     */
    protected DRMStatusEvent() {

    }

    DRMStatusEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the content data.
     * 
     * @return the content data
     */
    public native DRMContentData getContentData() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getcontentData();
		return @com.ait.toolkit.flash.core.client.net.drm.DRMContentData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the content data.
     * 
     * @param value the new content data
     */
    private native void setContentData(DRMContentData value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setcontentData(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the detail.
     * 
     * @return the detail
     */
    public native String getDetail() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdetail();
    }-*/;

    /**
     * Gets the checks if is anonymous.
     * 
     * @return the checks if is anonymous
     */
    public native boolean isAnonymous() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisAnonymous();
    }-*/;

    /**
     * Gets the checks if is available offline.
     * 
     * @return the checks if is available offline
     */
    public native boolean isAvailableOffline() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisAvailableOffline();
    }-*/;

    /**
     * Gets the checks if is local.
     * 
     * @return the checks if is local
     */
    public native boolean isLocal() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisLocal();
    }-*/;

    /**
     * Gets the offline lease period.
     * 
     * @return the offline lease period
     */
    public native int getOfflineLeasePeriod() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getofflineLeasePeriod();
    }-*/;

    /**
     * Gets the policies.
     * 
     * @param <T> the generic type
     * @return the policies
     */
    public native <T> T getPolicies() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpolicies();
    }-*/;

    /**
     * Gets the voucher.
     * 
     * @return the voucher
     */
    public native DRMVoucher getVoucher() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getvoucher();
		return @com.ait.toolkit.flash.core.client.net.drm.DRMVoucher::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the voucher end date.
     * 
     * @return the voucher end date
     */
    public native Date getVoucherEndDate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvoucherEndDate();
    }-*/;

    public static DRMStatusEvent cast(Event event) {
        return new DRMStatusEvent(event.getJsObj());
    }

}
