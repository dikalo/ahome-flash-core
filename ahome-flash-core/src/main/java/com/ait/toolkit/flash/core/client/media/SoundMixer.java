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

import com.ait.toolkit.flash.core.client.utils.ByteArray;

/**
 * The SoundMixer class contains static properties and methods for global sound
 * control in the application. The SoundMixer class controls embedded and
 * streaming sounds in the application. it does not control dynamically created
 * sounds (that is, sounds generated in response to a Sound object dispatching a
 * sampleData event)
 */
public final class SoundMixer {

    private SoundMixer() {

    }

    /**
     * Gets the number of seconds to preload an embedded streaming sound into a
     * buffer before it starts to stream.
     * 
     * @return the buffer time
     */
    public static int getBufferTime() {
        return SoundMixerProxy.INSTANCE.getBufferTime();
    }

    /**
     * Sets the number of seconds to preload an embedded streaming sound into a
     * buffer before it starts to stream.
     * 
     * @param value the new buffer time
     */
    public static void setBufferTime(int value) {
        SoundMixerProxy.INSTANCE.setBufferTime(value);
    }

    /**
     * Gets the SoundTransform object that controls global sound properties.
     * 
     * @return the sound transform
     */
    public static SoundTransform getSoundTransform() {
        return SoundMixerProxy.INSTANCE.getSoundTransform();
    }

    /**
     * Sets the SoundTransform object that controls global sound properties.
     * 
     * @param value the new sound transform
     */
    public static void setSoundTransform(SoundTransform value) {
        SoundMixerProxy.INSTANCE.setSoundTransform(value);
    }

    /**
     * Determines whether any sounds are not accessible due to security
     * restrictions.
     * 
     * @return true, if successful
     */
    public static boolean areSoundInaccessible() {
        return SoundMixerProxy.INSTANCE.isAreaSoundsInaccessible();
    }

    /**
     * Takes a snapshot of the current sound wave and places it into the
     * specified ByteArray object.
     * 
     * @param output the output array
     */
    public static void computeSpectrum(ByteArray output) {
        SoundMixerProxy.INSTANCE.computeSpectrum(output);
    }

    /**
     * Takes a snapshot of the current sound wave and places it into the
     * specified ByteArray object.
     * 
     * @param output the output array
     * @param FFTMode, the FFTMode
     */
    public static void computeSpectrum(ByteArray output, boolean FFTMode) {
        SoundMixerProxy.INSTANCE.computeSpectrum(output, FFTMode);
    }

    /**
     * Takes a snapshot of the current sound wave and places it into the
     * specified ByteArray object.
     * 
     * @param output the output array
     * @param FFTMode, the FFTMode
     * @param strechMode, the strechMode
     */
    public static void computeSpectrum(ByteArray output, boolean FFTMode, int strechMode) {
        SoundMixerProxy.INSTANCE.computeSpectrum(output, FFTMode, strechMode);
    }

    /**
     * Stops all sounds currently playing
     */
    public static void stopAll() {
        SoundMixerProxy.INSTANCE.stopAll();
    }

}
