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
package com.ait.toolkit.flash.alivepdf.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating HTTPLink objects.
 */
public class HTTPLinkFactory extends JsObject {

    public static final HTTPLinkFactory INSTANCE = new HTTPLinkFactory();

    /**
     * Instantiates a new hTTP link factory.
     */
    private HTTPLinkFactory() {
        jsObj = Bridge.createObject("com.ekambi.gwt.flex.pdf.links.HTTPLinkFactory");
    }

    /**
     * Creates a new HTTPLink object.
     * 
     * @return the HTTP link
     */
    public final native JavaScriptObject createHTTPLink()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createHTTPLink();
    }-*/;

    /**
     * Creates a new HTTPLink object.
     * 
     * @param url the url
     * @return the HTTP link
     */
    public final native JavaScriptObject createHTTPLink(String url)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createHTTPLink(url);
    }-*/;

}
