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

/**
 * the AudioDecoder class enumerates the types of multichannel audio that a
 * system can support.
 * <p>
 * Use one of the constants defined in this class as the parameter to the
 * hasMultiChannelAudio() method of the Capabilities class.
 * 
 * @author Ekambi
 * 
 */
public final class AudioDecoder {

    /**
     * Dolby Digital Audio, which is also known as AC-3
     */
    public static final String DOLBY_DIGITAL = "DolbyDigital";
    /**
     * Dolby Digital Plus Audio, which is also known as Enhanced AC-3 and
     * Enhanced Dolby Digital.
     */
    public static final String DOLBY_DIGITAL_PLUS = "DolbyDigitalPlus";
    /**
     * DTS Audio, which is also known as DTS Coherent Acoustics, DTS Digital
     * Surround, and DTS core.
     */
    public static final String DTS = "DTS";
    /**
     * DTS Express Audio, which is also known as DTS Low Bit Rate (LBR).
     */
    public static final String DTS_EXPRESS = "DTSExpress";
    /**
     * DTS-HD High Resolution Audio, which is also known as DTS-HD HR.
     */
    public static final String DTS_HD_HIGH_RESOLUTION_AUDIO = "DTSHDHighResolutionAudio";
    /**
     * DTS-HD Master Audio, which is also known as DTS-HD MA.
     */
    public static final String DTS_HD_MASTER_AUDIO = "DTSHDHMasterAudio";

    private AudioDecoder() {

    }

}
