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
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The DRMContentData class provides the information required to obtain the
 * voucher necessary to view DRM-protected content.
 * <p>
 * (AIR only) A DRMContentData object can be obtained from a NetStream instance
 * by calling the NetStream preloadEmbeddedContent() method and providing an
 * onDRMContentData callback function on the NetStream client object. Use the
 * DRMContentData object passed to the callback function as a parameter for the
 * DRMManager loadVoucher() method.
 * <p>
 * When you package content with FlashDetect Access, you have the option of saving the
 * content's metadata as a separate file. To create a new DRMContentData object,
 * get peer metadata with a URLLoader object and pass it to the DRMContentData
 * constructor.
 */
public class DRMContentData extends JsObject {

    /**
     * Instantiates a new dRM content data.
     */
    public DRMContentData() {
        jsObj = NetFactory.INSTANCE.createDRMContentData();
    }

    DRMContentData(JavaScriptObject obj) {
        jsObj = obj;
    }

    public DRMContentData(ByteArray rawData) {
        jsObj = NetFactory.INSTANCE.createDRMContentData(rawData);
    }

    /**
     * The type of authentication required to obtain a voucher for the
     * associated content.
     * 
     * @return the authentication method
     */
    public final AuthenticationMethod getAuthenticationMethod() {
        return AuthenticationMethod.fromValue(_getAuthenticationMethod());
    }

    private final native String _getAuthenticationMethod()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getauthenticationMethod();
    }-*/;

    /**
     * The content domain of the media rights server to which the user must be
     * authenticated to obtain the voucher for the associated content.
     * 
     * @return the domain
     */
    public final native String getDomain()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdomain();
    }-*/;

    /**
     * A unique id identifying the content associated with this metadata on the
     * media rights server.
     * 
     * @return the license id
     */
    public final native String getLicenseID()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlicenseID();
    }-*/;

    /**
     * The URL of a media rights server that provides the voucher that is
     * required to view the associated content.
     * 
     * @return the server url
     */
    public final native String getServerURL()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getserverURL();
    }-*/;

}
