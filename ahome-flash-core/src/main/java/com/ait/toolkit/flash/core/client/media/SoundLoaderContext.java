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

/**
 * The SoundLoaderContext class provides security checks for files that load
 * sound. SoundLoaderContext objects are passed as an argument to the
 * constructor and the load() method of the Sound class.
 */
public class SoundLoaderContext extends JsObject {

    /**
     * Instantiates a new sound loader context.
     */
    public SoundLoaderContext() {
        jsObj = createNativePeer();
    }

    /**
     * New instance.
     * 
     * @param bufferTime the buffer time
     * @return the sound loader context
     */
    public SoundLoaderContext(double bufferTime) {
        this();
        setBufferTime(bufferTime);
    }

    /**
     * New instance.
     * 
     * @param bufferTime the buffer time
     * @param checkPolicyFile the check policy file
     * @return the sound loader context
     */
    public SoundLoaderContext(double bufferTime, boolean checkPolicyFile) {
        this(bufferTime);
        setCheckPolicyFile(checkPolicyFile);
    }

    /**
     * Gets the number of milliseconds to preload a streaming sound into a
     * buffer before the sound starts to stream.
     * 
     * @return the buffer time
     */
    public native double getBufferTime() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbufferTime();
    }-*/;

    /**
     * Sets the number of milliseconds to preload a streaming sound into a
     * buffer before the sound starts to stream.
     * 
     * @param bufferTime the new buffer time
     */
    public native void setBufferTime(double bufferTime) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbufferTime(bufferTime);
    }-*/;

    /**
     * Specifies whether the application should try to download a URL policy
     * file from the loaded sound's server before beginning to load the sound.
     * 
     * @return true, if successful
     */
    public native boolean checkPolicyFile() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcheckPolicyFile();
    }-*/;

    /**
     * Specifies whether the application should try to download a URL policy
     * file from the loaded sound's server before beginning to load the sound.
     * 
     * @param checkPolicyFile the new check policy file
     */
    public native void setCheckPolicyFile(boolean checkPolicyFile) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcheckPolicyFile(checkPolicyFile);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.media.SoundLoaderContext");
    }
}
