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

package com.ait.toolkit.flash.alivepdf.client.events;

import com.ait.toolkit.flash.core.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class CharacterEvent.
 */
public class CharacterEvent extends Event {

    /** The Constant CHARACTER_MISSING. */
    public static final String CHARACTER_MISSING = "missingCharacter";

    /**
     * Instantiates a new character event.
     */
    CharacterEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the missing character.
     * 
     * @return the missing character
     */
    public final native String getMissingCharacter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmissingCharacter();
    }-*/;

    /**
     * Gets the font name.
     * 
     * @return the font name
     */
    public final native String getFontName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfontName();
    }-*/;

    public static CharacterEvent cast(Event event) {
        return new CharacterEvent(event.getJsObj());
    }

}
