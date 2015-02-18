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

import com.ait.toolkit.flash.core.client.events.DRMAuthenticationCompleteEvent;
import com.ait.toolkit.flash.core.client.events.DRMAuthenticationErrorEvent;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.handlers.DRMErrorHandler;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;

/**
 * The DRMManager manages the retrieval and storage of the vouchers needed to
 * view DRM-protected content. With the static <code>DRMManager.get()</code>
 * method, you can access the existing DRMManager object to perform the
 * following DRM-management tasks:
 * <ul>
 * <li>Preload vouchers from a media rights server, using a DRMContentData
 * object.</li>
 * <li>Query the local cache for an individual voucher, using a DRMContentData
 * object.</li>
 * <li>Reset all vouchers (AIR only) No method is provided for enumerating all
 * the vouchers in the local cache.</li>
 * </ul>
 * 
 * <p>
 * 
 * Do not create an instance of the DRMManager class. Use the static
 * <code>DRMManager.get()</code> to access the existing DRMManager object.
 */
public class DRMManager extends EventDispatcher {

    private static final DRMManager INSTANCE = new DRMManager();

    /**
     * Returns an instance of the singleton DRMManager object.
     * 
     * @return
     */
    public static DRMManager get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new dRM manager.
     */
    private DRMManager() {
        jsObj = NetFactory.INSTANCE.getDRMManager();
    }

    /**
     * The isSupported property is set to true if the DRMManager class is
     * supported on the current platform, otherwise it is set to false.
     * 
     * @return true, if is supported
     */
    public static boolean isSupported() {
        return NetFactory.INSTANCE.isDRMManagerSupported();
    }

    /**
     * Authenticates a user.
     * 
     * @param serverURL the server url
     * @param domain the domain
     * @param userName the user name
     * @param password the password
     */
    public final native void authenticate(String serverURL, String domain, String userName, String password)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.authenticate(serverURL, domain, userName, password);
    }-*/;

    /**
     * Loads a voucher from a media rights server or the local voucher cache.
     * 
     * @param drmContentData the drm content data
     * @param setting the setting
     */
    public final native void loadVoucher(DRMContentData drmContentData, String setting)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadVoucher(
						drmContentData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						setting);
    }-*/;

    /**
     * Gets a preview voucher from the license server, which you can use to let
     * a user verify that they can play content on particular computer.
     */
    public final native void loadPreviewVoucher(DRMContentData drmContentData)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadPreviewVoucher(drmContentData.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the authentication token to use for communication with the specified
     * server and domain.
     * 
     * @param serverURL the server url
     * @param domain the domain
     * @param token the token
     */
    public final native void setAuthenticationToken(String serverURL, String domain, ByteArray token)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAuthenticationToken(serverURL, domain, token);
    }-*/;

    /**
     * The DRMManager dispatches a DRMAuthenticationCompleteEvent object when
     * the user is authenticated by the media rights server after a call to the
     * authenticate() method.
     * 
     * @param handler
     */
    public void addAuthenticationCompleteHandler(EventHandler handler) {
        this.addEventHandler(DRMAuthenticationCompleteEvent.AUTHENTICATION_COMPLETE, handler);
    }

    /**
     * The DRMManager dispatches a DRMAuthenticationErrorEvent object when the
     * user is not authenticated by the media rights server after a call to the
     * authenticate() method.
     * 
     * @param handler
     */
    public void addAuthenticationErrorHandler(EventHandler handler) {
        this.addEventHandler(DRMAuthenticationErrorEvent.AUTHENTICATION_ERROR, handler);
    }

    /**
     * The DRMManager dispatches a DRMErrorEvent object when a requested voucher
     * cannot be obtained from the media rights server.
     * <p>
     * <b>Note:</b> When an attempt to load a voucher from the local voucher
     * cache (using the localOnly as the source parameter) fails, a
     * DRMErrorEvent object is not dispatched. Instead, a DRMStatusEvent object
     * with a voucher property set to null is dispatched.
     * 
     * @param handler
     */
    public native void addDRMErrorHandler(DRMErrorHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.DRMErrorEvent::DRM_ERROR,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.DRMErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.DRMErrorHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/DRMErrorEvent;)(eventObject);
						}));
    }-*/;

}
