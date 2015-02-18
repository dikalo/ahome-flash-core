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
 * The SoundTransform class contains properties for volume and panning.
 */
public final class SoundTransform extends JsObject {

    public SoundTransform() {
        jsObj = createNativePeer();
    }

    SoundTransform(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param volume the volume
     * @return the sound transform
     */
    public SoundTransform(double volume) {
        setVolume(volume);
    }

    /**
     * New instance.
     * 
     * @param volume the volume
     * @param panning the panning
     * @return the sound transform
     */
    public SoundTransform(double volume, double panning) {
        this(volume);
        setPan(panning);
    }

    /**
     * Gets a value, from 0 (none) to 1 (all), specifying how much of the left
     * input is played in the left speaker.
     * 
     * @return the left to left
     */
    public native double getLeftToLeft() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getleftToLeft();
    }-*/;

    /**
     * Sets a value, from 0 (none) to 1 (all), specifying how much of the left
     * input is played in the left speaker.
     * 
     * @param leftToLeft the new left to left
     */
    public native void setLeftToLeft(double leftToLeft) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setleftToLeft(leftToLeft);
    }-*/;

    /**
     * Gets a value, from 0 (none) to 1 (all), specifying how much of the left
     * input is played in the right speaker.
     * 
     * @return the left to right
     */
    public native double getLeftToRight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getleftToRight();
    }-*/;

    /**
     * Sets a value, from 0 (none) to 1 (all), specifying how much of the left
     * input is played in the right speaker.
     * 
     * @param leftToRight the new left to right
     */
    public native void setLeftToRight(double leftToRight) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setleftToRight(leftToRight);
    }-*/;

    /**
     * Gets tThe left-to-right panning of the sound, ranging from -1 (full pan
     * left) to 1 (full pan right).
     * 
     * @return the pan
     */
    public native double getPan() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpan();
    }-*/;

    /**
     * Sets the left-to-right panning of the sound, ranging from -1 (full pan
     * left) to 1 (full pan right).
     * 
     * @param value the new pan
     */
    public native void setPan(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpan(value);
    }-*/;

    /**
     * Gets a value, from 0 (none) to 1 (all), specifying how much of the right
     * input is played in the left speaker.
     * 
     * @return the right to left
     */
    public native double getRightToLeft() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrightToLeft();
    }-*/;

    /**
     * Sets a value, from 0 (none) to 1 (all), specifying how much of the right
     * input is played in the left speaker.
     * 
     * @param rightToLeft the new right to left
     */
    public native void setRightToLeft(double rightToLeft) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setrightToLeft(rightToLeft);
    }-*/;

    /**
     * Gets a value, from 0 (none) to 1 (all), specifying how much of the right
     * input is played in the right speaker.
     * 
     * @return the right to right
     */
    public native double getRightToRight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrightToRight();
    }-*/;

    /**
     * Sets a value, from 0 (none) to 1 (all), specifying how much of the right
     * input is played in the right speaker.
     * 
     * @param rightToRight the new right to right
     */
    public native void setRightToRight(double rightToRight) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setrightToRight(rightToRight);
    }-*/;

    /**
     * Gets the volume, ranging from 0 (silent) to 1 (full volume).
     * 
     * @return the volume
     */
    public native double getVolume() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvolume();
    }-*/;

    /**
     * Sets the volume, ranging from 0 (silent) to 1 (full volume).
     * 
     * @param volume the new volume
     */
    public native void setVolume(double volume) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setvolume(volume);
    }-*/;

    /**
     * New instance.
     * 
     * @return the sound transform
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.media.SoundTransform");
    }
}
