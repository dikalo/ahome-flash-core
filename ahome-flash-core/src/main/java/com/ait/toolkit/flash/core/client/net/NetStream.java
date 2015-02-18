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
import com.ait.toolkit.flash.core.client.media.Camera;
import com.ait.toolkit.flash.core.client.media.Microphone;
import com.ait.toolkit.flash.core.client.media.SoundTransform;
import com.ait.toolkit.flash.core.client.toplevel.As3Array;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NetStream class opens a one-way streaming channel over a NetConnection.
 */
public class NetStream extends EventDispatcher {

    protected NetStream(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param connection
     *            the connection
     * @return the net stream
     */
    public NetStream(NetConnection connection) {
        jsObj = NetFactory.INSTANCE.createNetStream(connection);
    }

    /**
     * New instance.
     * 
     * @param connection
     *            the connection
     * @param peerID
     *            the peer id
     * @return the net stream
     */
    public NetStream(NetConnection connection, String peerID) {
        jsObj = NetFactory.INSTANCE.createNetStream(connection, peerID);
    }

    /**
     * Checks if is audio reliable.
     * 
     * @return true, if is audio reliable
     */
    public native boolean isAudioReliable()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getaudioReliable();
    }-*/;

    /**
     * Sets the audio reliable.
     * 
     * @param value
     *            the new audio reliable
     */
    public native void setAudioReliable(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setaudioReliable(value);
    }-*/;

    /**
     * Checks for audio sample access.
     * 
     * @return true, if successful
     */
    public native boolean hasAudioSampleAccess()/*-{
		return peer.getAudioSampleAccess();
    }-*/;

    /**
     * Sets the audio sample access.
     * 
     * @param value
     *            the new audio sample access
     */
    public native void setAudioSampleAccess(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setaudioSampleAccess(value);
    }-*/;

    /**
     * Gets the back buffer length.
     * 
     * @return the back buffer length
     */
    public native double getBackBufferLength()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbackBufferLength();
    }-*/;

    /**
     * Gets the buffer lengt.
     * 
     * @return the buffer lengt
     */
    public native double getBufferLengt()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbufferLengt();
    }-*/;

    /**
     * Gets the buffer time.
     * 
     * @return the buffer time
     */
    public native double getBufferTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbufferTime();
    }-*/;

    /**
     * Sets the buffer time.
     * 
     * @param value
     *            the new buffer time
     */
    public native void setBufferTime(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBufferTime(value);
    }-*/;

    /**
     * Gets the buffer time max.
     * 
     * @return the buffer time max
     */
    public native double getBufferTimeMax()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbufferTimeMax();
    }-*/;

    /**
     * Sets the buffer time max.
     * 
     * @param value
     *            the new buffer time max
     */
    public native void setBufferTimeMax(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbufferTimeMax(value);
    }-*/;

    /**
     * Gets the bytes loaded.
     * 
     * @return the bytes loaded
     */
    public native int getBytesLoaded()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Gets the bytes total.
     * 
     * @return the bytes total
     */
    public native int getBytesTotal()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Specifies whether the application tries to download a cross-domain policy
     * file from the loaded video file's server before beginning to load the
     * video file.
     * 
     * @return true, if is check policy file
     */
    public native boolean hasCheckPolicyFile()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcheckPolicyFile();
    }-*/;

    /**
     * Specifies whether the application tries to download a cross-domain policy
     * file from the loaded video file's server before beginning to load the
     * video file.
     * 
     * @param value
     *            the new check policy file
     */
    public native void setCheckPolicyFile(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcheckPolicyFile(value);
    }-*/;

    /**
     * Gets the client.
     * 
     * @param <T>
     *            the generic type
     * @return the client
     */
    public native <T> T getClient()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getclient();
    }-*/;

    /**
     * Sets the client.
     * 
     * @param value
     *            the new client
     */
    public native void setClient(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setclient(value);
    }-*/;

    /**
     * Gets the current fps.
     * 
     * @return the current fps
     */
    public native double getCurrentFPS()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentFPS();
    }-*/;

    /**
     * Checks if is data reliable.
     * 
     * @return true, if is data reliable
     */
    public native boolean isDataReliable()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdataReliable();
    }-*/;

    /**
     * Sets the data reliable.
     * 
     * @param value
     *            the new data reliable
     */
    public native void setDataReliable(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdataReliable(value);
    }-*/;

    /**
     * Gets the far id.
     * 
     * @return the far id
     */
    public native String getFarID()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfarID();
    }-*/;

    /**
     * Gets the far nonce.
     * 
     * @return the far nonce
     */
    public native String getFarNonce()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfarNonce();
    }-*/;

    /**
     * Checks if is in buffer seek.
     * 
     * @return true, if is in buffer seek
     */
    public native boolean isInBufferSeek()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getinBufferSeek();
    }-*/;

    /**
     * Sets the in buffer seek.
     * 
     * @param value
     *            the new in buffer seek
     */
    public native void setInBufferSeek(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setinBufferSeek(value);
    }-*/;

    /**
     * Gets the info.
     * 
     * @return the info
     */
    public native NetStreamInfo getInfo()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getinfo();
		return @com.ait.toolkit.flash.core.client.net.NetStreamInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the live delay.
     * 
     * @return the live delay
     */
    public native double getLiveDelay()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getliveDelay();
    }-*/;

    /**
     * Gets the max pause buffer time.
     * 
     * @return the max pause buffer time
     */
    public native double getMaxPauseBufferTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmaxPauseBufferTime();
    }-*/;

    /**
     * Sets the max pause buffer time.
     * 
     * @param value
     *            the new max pause buffer time
     */
    public native void setMaxPauseBufferTime(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmaxPauseBufferTime(value);
    }-*/;

    /**
     * Checks for multicast availibility send to all.
     * 
     * @return true, if successful
     */
    public native boolean hasMulticastAvailibilitySendToAll()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastAvailibilitySendToAll();
    }-*/;

    /**
     * Sets the multicast availibility send to all.
     * 
     * @param value
     *            the new multicast availibility send to all
     */
    public native void setMulticastAvailibilitySendToAll(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastAvailibilitySendToAll(value);
    }-*/;

    /**
     * Gets the multicast availibility update period.
     * 
     * @return the multicast availibility update period
     */
    public native double getMulticastAvailibilityUpdatePeriod()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastAvailibilityUpdatePeriod();
    }-*/;

    /**
     * Sets the multicast availibility update period.
     * 
     * @param value
     *            the new multicast availibility update period
     */
    public native void setMulticastAvailibilityUpdatePeriod(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastAvailibilityUpdatePeriod(value);
    }-*/;

    /**
     * Gets the multicast fetch period.
     * 
     * @return the multicast fetch period
     */
    public native double getMulticastFetchPeriod()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastFetchPeriod();
    }-*/;

    /**
     * Sets the multicast fetch period.
     * 
     * @param value
     *            the new multicast fetch period
     */
    public native void setMulticastFetchPeriod(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastFetchPeriod(value);
    }-*/;

    /**
     * Gets the multicast info.
     * 
     * @return the multicast info
     */
    public native NetStreamMulticastInfo getMulticastInfo()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastInfo();
		return @com.ait.toolkit.flash.core.client.net.NetStreamMulticastInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the multicast push neighbor limit.
     * 
     * @return the multicast push neighbor limit
     */
    public native double getMulticastPushNeighborLimit()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastPushNeighborLimit();
    }-*/;

    /**
     * Sets the multicast push neighbor limit.
     * 
     * @param value
     *            the new multicast push neighbor limit
     */
    public native void setMulticastPushNeighborLimit(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastPushNeighborLimit(value);
    }-*/;

    /**
     * Gets the multicast relay margin duration.
     * 
     * @return the multicast relay margin duration
     */
    public native double getMulticastRelayMarginDuration()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastRelayMarginDuration();
    }-*/;

    /**
     * Sets the multicast relay margin duration.
     * 
     * @param value
     *            the new multicast relay margin duration
     */
    public native void setMulticastRelayMarginDuration(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastRelayMarginDuration(value);
    }-*/;

    /**
     * Gets the multicast window duration.
     * 
     * @return the multicast window duration
     */
    public native double getMulticastWindowDuration()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastWindowDuration();
    }-*/;

    /**
     * Sets the multicast window duration.
     * 
     * @param value
     *            the new multicast window duration
     */
    public native void setMulticastWindowDuration(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastWindowDuration(value);
    }-*/;

    /**
     * Gets the near nonce.
     * 
     * @return the near nonce
     */
    public native String getNearNonce()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnearNonce();
    }-*/;

    /**
     * Gets the object encoding.
     * 
     * @return the object encoding
     */
    public native int getObjectEncoding()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectEncoding();
    }-*/;

    /**
     * Gets the peer streams.
     * 
     * @return the peer streams
     */
    public native As3Array getPeerStreams()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getpeerStreams();
		return @com.ait.toolkit.flash.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the sound transform.
     * 
     * @return the sound transform
     */
    public native SoundTransform getSoundTransform()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsoundTransform();
		return @com.ait.toolkit.flash.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the sound transform.
     * 
     * @param value
     *            the new sound transform
     */
    public native void setSoundTransform(SoundTransform value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsoundTransform(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the time.
     * 
     * @return the time
     */
    public native double getTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettime();
    }-*/;

    /**
     * Specifies whether to use hardware accelerated decoding on the stream.
     * 
     * @return
     */
    public native boolean useHardwareDecoder()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getuseHardwareDecoder();
    }-*/;

    /**
     * Specifies whether to use hardware accelerated decoding on the stream.
     * 
     * @return
     */
    public native void setUseHardwareDecoder(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setuseHardwareDecoder(value);
    }-*/;

    /**
     * Minimize latency for live un-buffered streaming (bufferTime = 0). Instead
     * of conservative push-based catchup mechanism, audio messages are placed
     * in an adaptive jitter buffer. When audio is needed by speaker device,
     * messages are popped from jitter buffer, decoded, and played back. Speex
     * and G.711 always use this pull-based approach, regardless of this
     * settings (useJitterBuffer returns true for Speex/G.711). When enabled in
     * un-buffered mode, all the codecs use jitter buffer, such as Speex, G.711,
     * Nellymoser, MP3 and AAC. This property has no effect in buffered mode
     * (bufferTime > 0), and thus useJitterBuffer returns false.
     * 
     * @return
     */
    public native boolean useJitterBuffer()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getuseJitterBuffer();
    }-*/;

    /**
     * Minimize latency for live un-buffered streaming (bufferTime = 0). Instead
     * of conservative push-based catchup mechanism, audio messages are placed
     * in an adaptive jitter buffer. When audio is needed by speaker device,
     * messages are popped from jitter buffer, decoded, and played back. Speex
     * and G.711 always use this pull-based approach, regardless of this
     * settings (useJitterBuffer returns true for Speex/G.711). When enabled in
     * un-buffered mode, all the codecs use jitter buffer, such as Speex, G.711,
     * Nellymoser, MP3 and AAC. This property has no effect in buffered mode
     * (bufferTime > 0), and thus useJitterBuffer returns false.
     */
    public native void setUseJitterBuffer(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setuseJitterBuffer(value);
    }-*/;

    /**
     * Checks if is video reliable.
     * 
     * @return true, if is video reliable
     */
    public native boolean isVideoReliable()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoReliable();
    }-*/;

    /**
     * Sets the video reliable.
     * 
     * @param value
     *            the new video reliable
     */
    public native void setVideoReliable(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setvideoReliable(value);
    }-*/;

    /**
     * Checks for video sample access.
     * 
     * @return true, if successful
     */
    public native boolean hasVideoSampleAccess()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoSampleAccess();
    }-*/;

    /**
     * Sets the video sample acess.
     * 
     * @param value
     *            the new video sample acess
     */
    public native void setVideoSampleAcess(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setvideoSampleAcess(value);
    }-*/;

    /**
     * Append bytes.
     * 
     * @param value
     *            the value
     */
    public native void appendBytes(ByteArray value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.appendBytes(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Append bytes action.
     * 
     * @param action
     *            the action
     */
    public void appendBytesAction(NetStreamAppendBytesAction action) {
        appendBytesAction(action.value);
    }

    /**
     * Append bytes action.
     * 
     * @param netStreamAppenBytesAction
     *            the net stream appen bytes action
     */
    private native void appendBytesAction(String netStreamAppenBytesAction)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.appendBytesAction(netStreamAppenBytesAction);
    }-*/;

    /**
     * Attach.
     * 
     * @param connection
     *            the connection
     */
    public native void attach(NetConnection connection)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.attach(connection.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Attach audio.
     * 
     * @param microphone
     *            the microphone
     */
    public native void attachAudio(Microphone microphone)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.attachAudio(microphone.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Attach camera.
     * 
     * @param camera
     *            the camera
     */
    public native void attachCamera(Camera camera)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.attachCamera(camera.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Attach camera.
     * 
     * @param camera
     *            the camera
     * @param snapshotMilliseconds
     *            the snapshot milliseconds
     */
    public native void attachCamera(Camera camera, int snapshotMilliseconds)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.attachCamera(
						camera.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						snapshotMilliseconds);
    }-*/;

    /**
     * Close.
     */
    public native void close()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Pause.
     */
    public native void pause()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.pause();
    }-*/;

    /**
     * On peer connect.
     * 
     * @param subscriber
     *            the subscriber
     * @return true, if successful
     */
    public native boolean onPeerConnect(NetStream subscriber)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.onPeerConnect(subscriber.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Play.
     * 
     * @param arguments
     *            the arguments
     */
    public native void play(Object... arguments)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play.apply(arguments);
    }-*/;

    /**
     * Play2.
     * 
     * @param param
     *            the param
     */
    public native void play2(NetStreamPlayOptions param)/*-{
		peer.play2(param);
    }-*/;

    /**
     * Preload embedded data.
     * 
     * @param param
     *            the param
     */
    public native void preloadEmbeddedData(NetStreamPlayOptions param)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.preloadEmbeddedData(param.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Publish.
     */
    public native void publish()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.publish();
    }-*/;

    /**
     * Publish.
     * 
     * @param name
     *            the name
     */
    public native void publish(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.publish(name);
    }-*/;

    /**
     * Publish.
     * 
     * @param name
     *            the name
     * @param type
     *            the type
     */
    public native void publish(String name, String type)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.publish(name, type);
    }-*/;

    /**
     * Receive audio.
     * 
     * @param flag
     *            the flag
     */
    public native void receiveAudio(boolean flag)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.receiveAudio(flag);
    }-*/;

    /**
     * Receive video.
     * 
     * @param flag
     *            the flag
     */
    public native void receiveVideo(boolean flag)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.receiveVideo(flag);
    }-*/;

    /**
     * Receive video fps.
     * 
     * @param fps
     *            the fps
     */
    public native void receiveVideoFPS(double fps)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.receiveVideoFPS = fps;
    }-*/;

    /**
     * Reset drm vouchers.
     */
    public static void resetDRMVouchers() {
        NetFactory.INSTANCE.resetDRMVouchers();
    }

    /**
     * Resume.
     */
    public native void resume()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resume();
    }-*/;

    /**
     * Seek.
     * 
     * @param offset
     *            the offset
     */
    public native void seek(double offset)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.seek(offset);
    }-*/;

    /**
     * Send.
     * 
     * @param handlerName
     *            the handler name
     * @param args
     *            the args
     */
    public native void send(String handlerName, Object... args)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.send.apply(handlerName, args);
    }-*/;

    /**
     * Sets the drm authentication credentials.
     * 
     * @param userName
     *            the user name
     * @param password
     *            the password
     * @param type
     *            the type
     */
    public native void setDRMAuthenticationCredentials(String userName, String password, String type)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDRMAuthenticationCredentials(userName, password, type);
    }-*/;

    /**
     * Step.
     * 
     * @param frames
     *            the frames
     */
    public native void step(int frames)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.step(frames);
    }-*/;

    /**
     * Toggle pause.
     */
    public native void togglePause()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.togglePause();
    }-*/;

}
