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

class MicrophoneProxy extends JsObject {
    public static final MicrophoneProxy INSTANCE = new MicrophoneProxy();

    private MicrophoneProxy() {
        jsObj = createNativePeer();
    }

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.emitrom.flash4j.libs.factories.MicrophoneProxy");
    }

    native JavaScriptObject createMicrophone()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createMicrophone();
    }-*/;

    native JavaScriptObject createMicrophone(int index)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createMicrophone(index);
    }-*/;

    native JavaScriptObject createEnhencedMicrophone()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createEnhencedMicrophone();
    }-*/;

    native JavaScriptObject createEnhencedMicrophone(int index)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createEnhencedMicrophone(index);
    }-*/;

    native boolean isMicrophoneSupported()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isMicrophoneSupported();
    }-*/;

    native JsArrayString getMicrophoneNames()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getMicrophoneNames();
    }-*/;

}
