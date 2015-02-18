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
 * The Enum SoundCodec.
 */
public enum SoundCodec {

    /** The NELLYMOSER. */
    NELLYMOSER("NellyMoser"), PCMA("pcma"), PCMU("pcmu"),
    /** The SPEEX. */
    SPEEX("Speex");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new sound codec.
     * 
     * @param codec the codec
     */
    private SoundCodec(String codec) {
        value = codec;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the sound codec
     */
    public static native SoundCodec fromValue(String value) /*-{
		switch (value) {
		case 'NellyMoser':
			return @com.ait.toolkit.flash.core.client.media.SoundCodec::NELLYMOSER;
		case 'Speex':
			return @com.ait.toolkit.flash.core.client.media.SoundCodec::SPEEX;
		case 'pcma':
			return @com.ait.toolkit.flash.core.client.media.SoundCodec::PCMA;
		case 'pcmu':
			return @com.ait.toolkit.flash.core.client.media.SoundCodec::PCMU;
		}
    }-*/;

}
