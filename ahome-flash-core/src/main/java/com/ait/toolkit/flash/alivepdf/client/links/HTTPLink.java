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

package com.ait.toolkit.flash.alivepdf.client.links;

import com.ait.toolkit.flash.alivepdf.client.core.HTTPLinkFactory;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class HTTPLink.
 */
public class HTTPLink extends JsObject implements ILink {

    /**
     * Instantiates a new hTTP link.
     */
    HTTPLink(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the hTTP link
     */
    public HTTPLink() {
        jsObj = HTTPLinkFactory.INSTANCE.createHTTPLink();
    }

    /**
     * New instance.
     * 
     * @param url the url
     * @return the hTTP link
     */
    public HTTPLink(String url) {
        jsObj = HTTPLinkFactory.INSTANCE.createHTTPLink(url);
    }

    /**
     * Gets the link.
     * 
     * @return the link
     */
    public final native String getLink() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlink();
    }-*/;

    @Override
    public JavaScriptObject asILink() {
        return this.jsObj.cast();
    }

}
