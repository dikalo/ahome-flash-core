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
package com.ait.toolkit.flash.core.client.media;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

class CameraProxy extends JsObject {
    public static final CameraProxy INSTANCE = new CameraProxy();

    private CameraProxy() {
        jsObj = createNativePeer();
    }

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.flash4j.libs.factories.CameraProxy");
    }

    native JavaScriptObject createCamera()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createCamera();
    }-*/;

    native JavaScriptObject createCamera(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createCamera(name);
    }-*/;

    native boolean isCameraSupported()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isCameraSupported();
    }-*/;

    native JsArrayString getCameraNames()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getCameraNames();
    }-*/;

}
