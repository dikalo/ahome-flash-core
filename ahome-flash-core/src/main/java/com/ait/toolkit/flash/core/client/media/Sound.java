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

import com.ait.toolkit.flash.core.client.events.Event;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.events.handlers.IOErrorHandler;
import com.ait.toolkit.flash.core.client.events.handlers.ProgressHandler;
import com.ait.toolkit.flash.core.client.events.handlers.SampleDataHandler;
import com.ait.toolkit.flash.core.client.net.URLRequest;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.core.client.utils.factories.SoundFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Sound class lets you work with sound in an application. The Sound class
 * lets you create a Sound object, load and play an external MP3 file into that
 * object, close the sound stream, and access data about the sound, such as
 * information about the number of bytes in the stream and ID3 metadata. More
 * detailed control of the sound is performed through the sound source of the
 * SoundChannel or Microphone object for the sound and through the properties in
 * the SoundTransform class that control the output of the sound to the
 * computer's speakers.
 * <p>
 * In FlashDetect Player 10 and later and AIR 1.5 and later, you can also use
 * peer class to work with sound that is generated dynamically. In peer case,
 * the Sound object uses the function you assign to a sampleData event handler
 * to poll for sound data. The sound is played as it is retrieved from a
 * ByteArray object that you populate with sound data. You can use
 * Sound.extract() to extract sound data from a Sound object, after which you
 * can manipulate it before writing it back to the stream for playback.
 * <p>
 * To control sounds that are embedded in a SWF file, use the properties in the
 * SoundMixer class.
 * <p>
 * When you use peer class, consider the following security model:<br/>
 * 
 * <ul>
 * <li>Loading and playing a sound is not allowed if the calling file is in a
 * network sandbox and the sound file to be loaded is local.</li>
 * <li>By default, loading and playing a sound is not allowed if the calling
 * file is local and tries to load and play a remote sound. A user must grant
 * explicit permission to allow peer type of access.</li>
 * <li>Certain operations dealing with sound are restricted. The data in a
 * loaded sound cannot be accessed by a file in a different domain unless you
 * implement a cross-domain policy file. Sound-related APIs that fall under peer
 * restriction are Sound.id3, SoundMixer.computeSpectrum(),
 * SoundMixer.bufferTime, and the SoundTransform class.</li>
 * </ul>
 * <p>
 * However, in Adobe AIR, content in the application security sandbox (content
 * installed with the AIR application) are not restricted by these security
 * limitations.
 * 
 * <p>
 * For more information related to security, see the FlashDetect Player
 * Developer Center Topic: Security.
 */
public class Sound extends EventDispatcher {

    /**
     * Instantiates a new sound.
     */
    public Sound() {
        jsObj = SoundFactory.get().createSound();
    }

    Sound(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param urlRequest
     *            the url request
     * @return the sound
     */
    public Sound(URLRequest urlRequest) {
        jsObj = SoundFactory.get().createSound(urlRequest);
    }

    /**
     * New instance.
     * 
     * @param urlRequest
     *            the url request
     * @param loaderContext
     *            the loader context
     * @return the sound
     */
    public Sound(URLRequest urlRequest, SoundLoaderContext loaderContext) {
        jsObj = SoundFactory.get().createSound(urlRequest, loaderContext);
    }

    /**
     * Returns the currently available number of bytes in this sound object.
     * 
     * @return the bytes loaded
     */
    public native double getBytesLoaded() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesLoaded();
    }-*/;

    /**
     * Returns the total number of bytes in this sound object.
     * 
     * @return the bytes total
     */
    public native double getBytesTotal() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesTotal();
    }-*/;

    /**
     * Provides access to the metadata that is part of an MP3 file.
     * 
     * @return the i d3
     */
    public native ID3Info getID3() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getid3();
		return @com.ait.toolkit.flash.core.client.media.ID3Info::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the buffering state of external MP3 files.
     * 
     * @return true, if is buffering
     */
    public native boolean isBuffering() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisBuffering();
    }-*/;

    /**
     * Indicates if the Sound.url property has been truncated.
     * 
     * @return true, if is buffering
     */
    public native boolean isURLInaccessible() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisURLInaccessible();
    }-*/;

    /**
     * The length of the current sound in milliseconds.
     * 
     * @return the length
     */
    public native double getLength() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * The URL from which this sound was loaded.
     * 
     * @return the uRL
     */
    public native String getURL() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geturl();
    }-*/;

    /**
     * Closes the stream, causing any download of data to cease.
     */
    public native void close() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Extracts raw sound data from a Sound object.
     * 
     * @param target
     *            the target
     * @param length
     *            the length
     */
    public native double extract(ByteArray target, int length) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.extract(
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						length);
    }-*/;

    /**
     * Extracts raw sound data from a Sound object.
     * 
     * @param target
     *            the target
     * @param length
     *            the length
     * @param startPosition
     *            the start position
     * @return
     */
    public native double extract(ByteArray target, int length, int startPosition) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.extract(
						target.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						length, startPosition);
    }-*/;

    /**
     * Initiates loading of an external MP3 file from the specified URL.
     * 
     * @param stream
     *            the stream
     */
    public native void load(URLRequest stream) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.load(stream.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Initiates loading of an external MP3 file from the specified URL.
     * 
     * @param stream
     *            the stream
     * @param context
     *            the context
     */
    public native void load(URLRequest stream, SoundLoaderContext context) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.load(
						stream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						context.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * load MP3 sound data from a ByteArray object into a Sound object.
     */
    public native void loadCompressedDataFromByteArray(ByteArray bytes, int bytesLength) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadCompressedDataFromByteArray(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						bytesLength);
    }-*/;

    /**
     * load PCM 32-bit floating point sound data from a ByteArray object into a
     * Sound object.
     */
    public native void loadPCMFromByteArray(ByteArray bytes, int samples) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadPCMFromByteArray(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						samples);
    }-*/;

    /**
     * load PCM 32-bit floating point sound data from a ByteArray object into a
     * Sound object.
     */
    public native void loadPCMFromByteArray(ByteArray bytes, int samples, String format) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadPCMFromByteArray(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						samples, format);
    }-*/;

    /**
     * load PCM 32-bit floating point sound data from a ByteArray object into a
     * Sound object.
     */
    public native void loadPCMFromByteArray(ByteArray bytes, int samples, String format, boolean stereo) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadPCMFromByteArray(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						samples, format, stereo);
    }-*/;

    /**
     * load PCM 32-bit floating point sound data from a ByteArray object into a
     * Sound object.
     */
    public native void loadPCMFromByteArray(ByteArray bytes, int samples, String format, boolean stereo,
                    double sampleRate) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.loadPCMFromByteArray(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						samples, format, stereo, sampleRate);
    }-*/;

    /**
     * Generates a new SoundChannel object to play back the sound.
     * 
     * @return the sound channel
     */
    public native SoundChannel play() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.play();
		return @com.ait.toolkit.flash.core.client.media.SoundChannel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Generates a new SoundChannel object to play back the sound.
     * 
     * @param startTime
     *            the start time
     * @return the sound channel
     */
    public native SoundChannel play(double startTime) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.play(startTime);
		return @com.ait.toolkit.flash.core.client.media.SoundChannel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Generates a new SoundChannel object to play back the sound.
     * 
     * @param startTime
     *            the start time
     * @param loops
     *            the loops
     * @return the sound channel
     */
    public native SoundChannel play(double startTime, int loops) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.play(startTime, loops);
		return @com.ait.toolkit.flash.core.client.media.SoundChannel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Generates a new SoundChannel object to play back the sound.
     * 
     * @param startTime
     *            the start time
     * @param loops
     *            the loops
     * @param sndTransform
     *            the snd transform
     * @return the sound channel
     */
    public native SoundChannel play(double startTime, int loops, SoundTransform sndTransform) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.play(
						startTime,
						loops,
						sndTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.media.SoundChannel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    // TODO implement loadPCMFromByteArra

    /**
     * Dispatched when data has loaded successfully.
     */
    public void addCompleteHandler(EventHandler handler) {
        addEventHandler(Event.COMPLETE, handler);
    }

    /**
     * Dispatched by a Sound object when ID3 data is available for an MP3 sound.
     */
    public void addId3Handler(EventHandler handler) {
        addEventHandler(Event.ID3, handler);
    }

    /**
     * Dispatched when a load operation starts.
     */
    public void addOpenHandler(EventHandler handler) {
        addEventHandler(Event.OPEN, handler);
    }

    /**
     * Dispatched when an input/output error occurs that causes a load operation
     * to fail.
     */
    public native void addIOErrorHandler(IOErrorHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.IOErrorEvent::IO_ERROR,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.IOErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.IOErrorHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/IOErrorEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when data is received as a load operation progresses.
     */
    public native void addProgressHandler(ProgressHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.ProgressEvent::PROGRESS,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.ProgressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.ProgressHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/ProgressEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when the runtime requests new audio data.
     */
    public native void addSampleDataHandler(SampleDataHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.SampleDataEvent::SAMPLE_DATA,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.SampleDataEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.SampleDataHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/SampleDataEvent;)(eventObject);
						}));
    }-*/;

}
