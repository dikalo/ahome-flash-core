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
package com.ait.toolkit.flash.core.client.display;

import com.ait.toolkit.flash.core.client.framework.Bridge;

/**
 * The PNGEncoderOptions class defines a compression algorithm for the
 * flash.display.BitmapData.encode() method.
 * 
 * @author Ekambi
 * 
 */
public class PNGEncoderOptions extends BitmapEncoderOptions {

    public PNGEncoderOptions() {
        jsObj = Bridge.createObject("flash.display.PNGGEncoderOptions");
    }

    public PNGEncoderOptions(boolean fastCompression) {
        this();
        setFastCompression(fastCompression);
    }

    /**
     * Chooses compression speed over file size.
     * 
     * @return
     */
    public native boolean hasFastCompression()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfastCompression();
    }-*/;

    /**
     * Chooses compression speed over file size.
     * 
     * @param value
     */
    public native void setFastCompression(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfastCompression(value);
    }-*/;

}
