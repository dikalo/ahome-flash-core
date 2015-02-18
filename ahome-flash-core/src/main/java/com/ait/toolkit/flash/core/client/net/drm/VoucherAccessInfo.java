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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A VoucherAccessInfo object presents the information that is required to
 * successfully retrieve and consume a voucher, such as the type of
 * authentication and the content domain of the media rights server.
 */
public class VoucherAccessInfo extends JsObject {

    /**
     * Instantiates a new voucher access info.
     */
    protected VoucherAccessInfo() {

    }

    VoucherAccessInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the type of authentication required to obtain a voucher for the
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
     * Get A user-friendly string that you can use to refer to the specified
     * VoucherAccessInfo object in the user interface.
     * 
     * @return the display name
     */
    public final native String getDisplayName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdisplayName();
    }-*/;

    /**
     * Gets the content domain of the media rights server to which the user must
     * be authenticated to obtain the voucher for the associated content.
     * 
     * @return the domain
     */
    public final native String getDomain()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdomain();
    }-*/;

}
