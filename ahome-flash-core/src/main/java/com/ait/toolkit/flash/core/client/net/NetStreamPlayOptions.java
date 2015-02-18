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
package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.framework.Bridge;

/**
 * The NetStreamPlayOptions class specifies the various options that can be
 * passed to the NetStream.play2() method. You pass a NetStreamPlayOptions
 * object to play2(), and the properties of the class specify the various
 * options. The primary use case for peer class is to implement transitions
 * between streams dynamically, either to switch to streams of different bit
 * rates and sizes or to swap to different content in a playlist.
 */
public class NetStreamPlayOptions extends EventDispatcher {

    /**
     * New instance.
     * 
     * @return the net stream play options
     */
    public NetStreamPlayOptions() {
        jsObj = Bridge.createObject("flash.net.NetStreamPlayOptions");
    }

    /**
     * Gets the len.
     * 
     * @return the len
     */
    public native double getLen()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlen();
    }-*/;

    /**
     * Sets the len.
     * 
     * @param value the new len
     */
    public native void setLen(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlen(value);
    }-*/;

    /**
     * Gets the offset.
     * 
     * @return the offset
     */
    public native double getOffset()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getoffset();
    }-*/;

    /**
     * Sets the offset.
     * 
     * @param value the new offset
     */
    public native void setOffset(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setoffset(value);
    }-*/;

    /**
     * Gets the old stream name.
     * 
     * @return the old stream name
     */
    public native String getOldStreamName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getoldStreamName();
    }-*/;

    /**
     * Sets the old steam name.
     * 
     * @param value the new old steam name
     */
    public native void setOldStreamName(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setoldStreamName(value);
    }-*/;

    /**
     * Gets the start.
     * 
     * @return the start
     */
    public native double getStart()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstart();
    }-*/;

    /**
     * Sets the start.
     * 
     * @param value the new start
     */
    public native void setStart(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setstart(value);
    }-*/;

    /**
     * Gets the stream name.
     * 
     * @return the stream name
     */
    public native String getStreamName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getstreamName();
    }-*/;

    /**
     * Sets the steam name.
     * 
     * @param value the new steam name
     */
    public native void setStreamName(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setstreamName(value);
    }-*/;

    /**
     * Gets the transition.
     * 
     * @return the transition
     */
    public NetStreamPlayTransitions getTransition() {
        return NetStreamPlayTransitions.fromValue(_getTransition());
    }

    /**
     * _get transition.
     * 
     * @return the string
     */
    private native String _getTransition()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettransition();
    }-*/;

    /**
     * Sets the transition.
     * 
     * @param transition the new transition
     */
    public void setTransition(NetStreamPlayTransitions transition) {
        setTransition(transition.value);
    }

    /**
     * Sets the transition.
     * 
     * @param value the new transition
     */
    private native void setTransition(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settransition(value);
    }-*/;

}
