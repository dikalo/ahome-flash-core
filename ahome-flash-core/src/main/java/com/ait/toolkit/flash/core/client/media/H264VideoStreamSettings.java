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

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The H264VideoStreamSettings class enables specifying video compression
 * settings for each NetStream. Properties will be validated once Camera is
 * attached to NetStream and compression has started.
 * 
 */
public class H264VideoStreamSettings extends VideoStreamSettings {

    public H264VideoStreamSettings() {
        jsObj = createNativePeer();
    }

    protected H264VideoStreamSettings(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Video codec used for compression.
     */
    public native String getCodec()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcodec();
    }-*/;

    /**
     * Level used for H.264/AVC encoding.
     */
    public native String getLevel()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlevel();
    }-*/;

    /**
     * Profile used for H.264/AVC encoding.
     */
    public native String getProfile()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getprofile();
    }-*/;

    /**
     * Set profile and level for video encoding.
     */
    public native void setProfileLevel(String profile, String level)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setProfileLevel(profile, level);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.media.H264VideoStreamSettings");
    }
}
