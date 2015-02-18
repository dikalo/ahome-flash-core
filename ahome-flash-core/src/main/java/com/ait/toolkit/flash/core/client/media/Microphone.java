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
import com.google.gwt.core.client.JsArrayString;

/**
 * Use the Microphone class to monitor or capture audio from a microphone.
 * <p>
 * To get a reference to a Microphone instance, use the
 * <code>Microphone.get()</code> method or the
 * <code>Microphone.getEnhancedMicrophone()</code> method. An enhanced
 * microphone instance can perform acoustic echo cancellation. Use acoustic echo
 * cancellation to create real-time audio/video applications that don't require
 * headsets.
 * <p>
 * <b>Create a real-time chat application</b>
 * <p>
 * To create a real-time chat application, capture audio and send it to FlashDetect
 * Media Server. Use the NetConnection and NetStream classes to send the audio
 * stream to FlashDetect Media Server. FlashDetect Media Server can broadcast the audio to
 * other clients. To create a chat application that doesn't require headsets,
 * use acoustic echo cancellation. Acoustic echo cancellation prevents the
 * feedback loop that occurs when audio enters a microphone, travels out the
 * speakers, and enters the microphone again. To use acoustic echo cancellation,
 * call the Microphone.getEnhancedMicrophone() method to get a reference to a
 * Microphone instance. Set Microphone.enhancedOptions to an instance of the
 * MicrophoneEnhancedOptions class to configure settings.
 * <p>
 * <b>Play microphone audio locally</b>
 * <p>
 * Call the Microphone setLoopback() method to route the microphone audio
 * directly to the local computer or device audio output. Uncontrolled audio
 * feedback is an inherent danger and is likely to occur whenever the audio
 * output can be picked up by the microphone input. The setUseEchoSuppression()
 * method can reduce, but not eliminate, the risk of feedback amplification.
 * 
 * <p>
 * <b>Capture microphone audio for local recording or processing</b>
 * <p>
 * To capture microphone audio, listen for the sampleData events dispatched by a
 * Microphone instance. The SampleDataEvent object dispatched for peer event
 * contains the audio data.
 * <p>
 * For information about capturing video, see the Camera class.
 * <p>
 * <b>Runtime microphone support</b>
 * <p>
 * The Microphone class is not supported in FlashDetect Player running in a mobile
 * browser.
 * <p>
 * 
 * 
 * <b>Privacy controls</b>
 * <p>
 * 
 * FlashDetect Player displays a Privacy dialog box that lets the user choose whether
 * to allow or deny access to the microphone. Your application window size must
 * be at least 215 x 138 pixels, the minimum size required to display the dialog
 * box, or access is denied automatically.
 * <p>
 * Content running in the AIR application sandbox does not need permission to
 * access the microphone and no dialog is displayed. AIR content running outside
 * the application sandbox does require permission and the Privacy dialog is
 * displayed.
 */
public final class Microphone extends EventDispatcher {

    private static final Microphone MICROPHONE = new Microphone();
    private static Microphone INDEXED_MICROPHONE = null;
    private static Microphone ENHENCED_MICROPHONE = null;

    /**
     * Returns a reference to a Microphone object for capturing audio.
     * 
     * @return the microphone
     */
    public static Microphone get() {
        return MICROPHONE;
    }

    public static Microphone getEnhencedMicrophone() {
        if (ENHENCED_MICROPHONE == null) {
            ENHENCED_MICROPHONE = Microphone.get();
            ENHENCED_MICROPHONE.update(MicrophoneProxy.INSTANCE.createEnhencedMicrophone());
        }
        return ENHENCED_MICROPHONE;
    }

    public static Microphone getEnhencedMicrophone(int index) {
        if (ENHENCED_MICROPHONE == null) {
            ENHENCED_MICROPHONE = Microphone.get(index);
            ENHENCED_MICROPHONE.update(MicrophoneProxy.INSTANCE.createEnhencedMicrophone(index));
        }
        return ENHENCED_MICROPHONE;
    }

    /**
     * Returns a reference to a Microphone object for capturing audio.
     * 
     * @return the microphone
     */
    public static Microphone get(int index) {
        if (INDEXED_MICROPHONE == null) {
            INDEXED_MICROPHONE = new Microphone(index);
        }
        return INDEXED_MICROPHONE;
    }

    /**
     * Instantiates a new microphone.
     */
    private Microphone() {
        jsObj = MicrophoneProxy.INSTANCE.createMicrophone();
    }

    private Microphone(int index) {
        jsObj = MicrophoneProxy.INSTANCE.createMicrophone(index);
    }

    /**
     * An array of strings containing the names of all available sound capture
     * devices.
     * 
     * @return the names
     */
    public static JsArrayString getNames() {
        return MicrophoneProxy.INSTANCE.getMicrophoneNames();
    }

    /**
     * Gets the amount of sound the microphone is detecting.
     * 
     * @return the activity level
     */
    public native double getActivityLevel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getactivityLevel();
    }-*/;

    /**
     * The codec to use for compressing audio.
     * 
     * @return the codec
     */
    public SoundCodec getCodec() {
        return SoundCodec.fromValue(_getCodec());
    }

    private native String _getCodec() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcodec();
    }-*/;

    /**
     * Sets the codec to use for compressing audio.
     * 
     * @param codec the new codec
     */
    public void setCodec(SoundCodec codec) {
        _setCodec(codec.value);
    }

    /**
     * _set codec.
     * 
     * @param codec the codec
     */
    private native void _setCodec(String codec) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcodec(codec);
    }-*/;

    /**
     * The encoded speech quality when using the Speex codec.
     * 
     * @return the encode quality
     */
    public native int getEncodeQuality() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getencodeQuality();
    }-*/;

    /**
     * The encoded speech quality when using the Speex codec.
     * 
     * @param encodeQuality the new encode quality
     */
    public native void setEncodeQuality(int encodeQuality) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setEncodeQuality(encodeQuality);
    }-*/;

    /**
     * Enable Speex voice activity detection.
     * 
     */
    public native boolean enableVAD() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.enableVAD();
    }-*/;

    /**
     * Enable Speex voice activity detection.
     */
    public native void setEnableVAD(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setEnableVAD(value);
    }-*/;

    /**
     * The encoded speech quality when using the Speex codec.
     * 
     * @return the encode quality
     */
    public native MicrophoneEnhancedOptions getEnhencedOptions() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getencodeQuality();
		return @com.ait.toolkit.flash.core.client.media.MicrophoneEnhancedOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The encoded speech quality when using the Speex codec.
     * 
     * @param encodeQuality the new encode quality
     */
    public native void setEnhencedOptions(MicrophoneEnhancedOptions value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setEnhencedOptions(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Number of Speex speech frames transmitted in a packet (message).
     * 
     * @return the frames per packet
     */
    public native int getframesPerPacket() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getframesPerPacket();
    }-*/;

    /**
     * Number of Speex speech frames transmitted in a packet (message)
     * 
     * @param framesPerPacket the new frames per packet
     */
    public native void setFramesPerPacket(int framesPerPacket) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setframesPerPacket(framesPerPacket);
    }-*/;

    /**
     * The amount by which the microphone boosts the signal.
     * 
     * @return the gain
     */
    public native double getGain() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgain();
    }-*/;

    /**
     * The amount by which the microphone boosts the signal.
     * 
     * @param gain the new gain
     */
    public native void setGain(double gain) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setGain(gain);
    }-*/;

    /**
     * The index of the microphone, as reflected in the array returned by
     * Microphone.names.
     * 
     * @return the index
     */
    public native int getIndex() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindex();
    }-*/;

    /**
     * The isSupported property is set to true if the Microphone class is
     * supported on the current platform, otherwise it is set to false.
     * 
     * @return
     */
    public static boolean isSupported() {
        return CameraProxy.INSTANCE.isCameraSupported();
    }

    /**
     * Specifies whether the user has denied access to the microphone (true) or
     * allowed access (false).
     * 
     * @return true, if is muted
     */
    public native boolean isMuted() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmuted();
    }-*/;

    /**
     * The name of the current sound capture device, as returned by the sound
     * capture hardware.
     * 
     * @return the name
     */
    public native String getName() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * Maximum attenuation of the noise in dB (negative number) used for Speex
     * encoder.
     * 
     * @return the rate
     */
    public native int getNoiseSuppressionLevel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnoiseSuppressionLevel();
    }-*/;

    /**
     * Maximum attenuation of the noise in dB (negative number) used for Speex
     * encoder.
     * 
     * @param rate the new rate
     */
    public native void setNoiseSuppressionLevel(int rate) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setnoiseSuppressionLevel(rate);
    }-*/;

    /**
     * The rate at which the microphone is capturing sound, in kHz
     * 
     * @return the rate
     */
    public native int getRate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrate();
    }-*/;

    /**
     * The rate at which the microphone is capturing sound, in kHz.
     * 
     * @param rate the new rate
     */
    public native void setRate(int rate) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrate(rate);
    }-*/;

    /**
     * The amount of sound required to activate the microphone and dispatch the
     * activity event.
     * 
     * @return the silence level
     */
    public native double getSilenceLevel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsilenceLevel();
    }-*/;

    /**
     * The number of milliseconds between the time the microphone stops
     * detecting sound and the time the activity event is dispatched.
     * 
     * @return the silence timeout
     */
    public native int getSilenceTimeout() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsilenceTimeout();
    }-*/;

    /**
     * Controls the sound of this microphone object when it is in loopback mode.
     * 
     * @return the sound transform
     */
    public native SoundTransform getSoundTransform() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsoundTransform();
		return @com.ait.toolkit.flash.core.client.media.SoundTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Controls the sound of this microphone object when it is in loopback mode.
     * 
     * @param soundTransform the new soundtransform
     */
    public native void setSoundtransform(SoundTransform soundTransform) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setSoundTransform(soundTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Routes audio captured by a microphone to the local speakers.
     * 
     * @param compress the new loopback
     */
    public native void setLoopback(boolean state) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLoopback(state);
    }-*/;

    /**
     * Routes audio captured by a microphone to the local speakers.
     * 
     * @param compress the new loopback
     */
    public native void setLoopback() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLoopback();
    }-*/;

    /**
     * Sets the minimum input level that should be considered sound and
     * (optionally) the amount of silent time signifying that silence has
     * actually begun.
     */
    public native void setSilenceLevel(double silenceLevel) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSilenceLevel(silenceLevel);
    }-*/;

    /**
     * Sets the minimum input level that should be considered sound and
     * (optionally) the amount of silent time signifying that silence has
     * actually begun.
     */
    public native void setSilenceLevel(double silenceLevel, int timeOut) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSilenceLevel(silenceLevel, timeOut);
    }-*/;

    /**
     * Set to true if echo suppression is enabled; false otherwise.
     * 
     * @param useEchoSuppression the new use echo suppression
     */
    public native void setUseEchoSuppression(boolean useEchoSuppression) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUseEchoSuppression(useEchoSuppression);
    }-*/;

    private void update(JavaScriptObject obj) {
        jsObj = obj;
    }

}
