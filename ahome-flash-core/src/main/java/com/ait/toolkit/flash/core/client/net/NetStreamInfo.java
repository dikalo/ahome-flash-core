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

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NetStreamInfo class specifies the various Quality of Service (QOS)
 * statistics and other information related to a NetStream object and the
 * underlying streaming buffer for audio, video, and data. A NetStreamInfo
 * object is returned in response to the NetStream.info call, which takes a
 * snapshot of the current QOS state and provides the QOS statistics through the
 * NetStreamInfo properties.
 */
public class NetStreamInfo extends JsObject {

    /**
     * Instantiates a new net stream info.
     */
    protected NetStreamInfo() {

    }

    NetStreamInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the audio buffer byte length.
     * 
     * @return the audio buffer byte length
     */
    public native double getAudioBufferByteLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaudioBufferByteLength();
    }-*/;

    /**
     * Gets the buffer length.
     * 
     * @return the buffer length
     */
    public native double getBufferLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbufferLength();
    }-*/;

    /**
     * Gets the auto byte count.
     * 
     * @return the auto byte count
     */
    public native double getAutoByteCount()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getautoByteCount();
    }-*/;

    /**
     * Gets the audio bytes per second.
     * 
     * @return the audio bytes per second
     */
    public native double getAudioBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaudioBytesPerSecond();
    }-*/;

    /**
     * Gets the audio loss rate.
     * 
     * @return the audio loss rate
     */
    public native double getAudioLossRate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaudioLossRate();
    }-*/;

    /**
     * Gets the byte count.
     * 
     * @return the byte count
     */
    public native double getByteCount()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getByteCount();
    }-*/;

    /**
     * Gets the current bytes per second.
     * 
     * @return the current bytes per second
     */
    public native double getCurrentBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentBytesPerSecond();
    }-*/;

    /**
     * Gets the data buffer length.
     * 
     * @return the data buffer length
     */
    public native double getDataBufferLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdataBufferLength();
    }-*/;

    /**
     * Gets the databyte count.
     * 
     * @return the databyte count
     */
    public native double getDatabyteCount()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdatabyteCount();
    }-*/;

    /**
     * Gets the data bytes per second.
     * 
     * @return the data bytes per second
     */
    public native double getDataBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdataBytesPerSecond();
    }-*/;

    /**
     * Gets the dropped frames.
     * 
     * @return the dropped frames
     */
    public native double getDroppedFrames()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdroppedFrames();
    }-*/;

    /**
     * Checks if is live.
     * 
     * @return true, if is live
     */
    public native boolean isLive()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisLive();
    }-*/;

    /**
     * Gets the max bytes per second.
     * 
     * @return the max bytes per second
     */
    public native double getMaxBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getMaxBytesPerSecond();
    }-*/;

    /**
     * Gets the meta data.
     * 
     * @param <T> the generic type
     * @return the meta data
     */
    public native <T> T getMetaData()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmetaData();
    }-*/;

    /**
     * Gets the play back bytes per second.
     * 
     * @return the play back bytes per second
     */
    public native double getPlayBackBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getplayBackBytesPerSecond();
    }-*/;

    /**
     * Gets the resource name.
     * 
     * @return the resource name
     */
    public native String getResourceName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getresourceName();
    }-*/;

    /**
     * Gets the sRTT.
     * 
     * @return the sRTT
     */
    public native double getSRTT()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsRTT();
    }-*/;

    /**
     * Gets the uri.
     * 
     * @return the uri
     */
    public native String getUri()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geturi();
    }-*/;

    /**
     * Gets the video buffer byte length.
     * 
     * @return the video buffer byte length
     */
    public native double getVideoBufferByteLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoBufferByteLength();
    }-*/;

    /**
     * Gets the video buffer length.
     * 
     * @return the video buffer length
     */
    public native double getVideoBufferLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoBufferLength();
    }-*/;

    /**
     * Gets the video byte count.
     * 
     * @return the video byte count
     */
    public native double getVideoByteCount()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoByteCount();
    }-*/;

    /**
     * Gets the video bytes per second.
     * 
     * @return the video bytes per second
     */
    public native double getVideoBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoBytesPerSecond();
    }-*/;

    /**
     * Gets the video loss rate.
     * 
     * @return the video loss rate
     */
    public native double getVideoLossRate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoLossRate();
    }-*/;

    /**
     * Gets the xmp data.
     * 
     * @param <T> the generic type
     * @return the xmp data
     */
    public native <T> T getXmpData()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getxmpData();
    }-*/;

    /**
     * Gets the string value.
     * 
     * @return the string value
     */
    public native String getStringValue()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.toString();
    }-*/;

}
