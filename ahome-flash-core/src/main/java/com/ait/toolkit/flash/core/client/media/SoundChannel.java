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

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The SoundChannel class controls a sound in an application. Every sound is
 * assigned to a sound channel, and the application can have multiple sound
 * channels that are mixed together. The SoundChannel class contains a stop()
 * method, properties for monitoring the amplitude (volume) of the channel, and
 * a property for assigning a SoundTransform object to the channel.
 */
public final class SoundChannel extends EventDispatcher {

    /**
     * Instantiates a new sound channel.
     */
    private SoundChannel() {
    }

    SoundChannel(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the current amplitude (volume) of the left channel, from 0 (silent)
     * to 1 (full amplitude).
     * 
     * @return the left peak
     */
    public native double getLeftPeak() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getleftPeak();
    }-*/;

    /**
     * When the sound is playing, the position property indicates in
     * milliseconds the current point that is being played in the sound file.
     * 
     * @return the position
     */
    public native double getPosition() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getposition();
    }-*/;

    /**
     * The current amplitude (volume) of the right channel, from 0 (silent) to 1
     * (full amplitude).
     * 
     * @return the right peak
     */
    public native double getRightPeak() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrightPeak();
    }-*/;

    /**
     * The SoundTransform object assigned to the sound channel.
     * 
     * @return the sound transform
     */
    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsoundTransform();
		return @com.ait.toolkit.flash.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The SoundTransform object assigned to the sound channel.
     * 
     * @return the sound transform
     */
    public native void setSoundTransform(SoundTransform value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsoundTransform(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Stops the sound playing in the channel.
     */
    public native void stop() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stop();
    }-*/;
}
