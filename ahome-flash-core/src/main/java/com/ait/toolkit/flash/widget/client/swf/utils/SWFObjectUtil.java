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

package com.ait.toolkit.flash.widget.client.swf.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ait.toolkit.flash.widget.client.swf.ui.exceptions.GWT2SWFRuntimeException;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class SWFObjectUtil.
 */
@SuppressWarnings("unchecked")
public class SWFObjectUtil {

    /**
     * _get player version.
     * 
     * @return the java script object
     */
    private static native JavaScriptObject _getPlayerVersion() /*-{
		return $wnd.swfobject.getFlashPlayerVersion();
    }-*/;

    /** The Constant forbiddenAttributes. */
    @SuppressWarnings("rawtypes")
    public static final List/* <String> */forbiddenAttributes = new ArrayList/*
                                                                              * <
                                                                              * String
                                                                              * >
                                                                              */();
    static {
        forbiddenAttributes.add("id"); // GWT2SWF generates this automatically
        forbiddenAttributes.add("classid"); // SWFObject publishes this
                                            // automatically for Internet
                                            // Explorer on Windows
        forbiddenAttributes.add("type");// SWFObject publishes this
                                        // automatically for all browsers except
                                        // Internet Explorer on Windows
        forbiddenAttributes.add("codebase");// deprecated
    }

    /** The Constant forbiddenParameters. */
    @SuppressWarnings("rawtypes")
    public static final List/* <String> */forbiddenParameters = new ArrayList/*
                                                                              * <
                                                                              * String
                                                                              * >
                                                                              */();
    static {
        forbiddenParameters.add("movie"); // use the object element's data
                                          // attribute instead, SWFObject
                                          // publishes this automatically for
                                          // Internet Explorer on Windows
    }

    /**
     * Convert hash map to js array.
     * 
     * @param map the map
     * @return the java script object
     */
    public static native JavaScriptObject convertHashMapToJSArray(Map<String, String> map) /*-{
		var jsArray = {};
		if (map != null) {
			iterator = map.@java.util.Map::keySet()().@java.util.Set::iterator()();
			var key, value;
			while (iterator.@java.util.Iterator::hasNext()()) {
				key = iterator.@java.util.Iterator::next()();
				value = map.@java.util.Map::get(Ljava/lang/Object;)(key);
				jsArray[key] = value;
			}
		}
		return jsArray;
    }-*/;

    /** The player version. */
    private static PlayerVersion playerVersion = null;

    /**
     * Gets the player version.
     * 
     * @return the player version
     */
    public static PlayerVersion getPlayerVersion() {
        if (playerVersion == null) {
            JavaScriptObject o = _getPlayerVersion();
            playerVersion = new PlayerVersion();
            playerVersion.deserialize(o);
        }
        return playerVersion;
    }

    /**
     * Checks if is version is valid.
     * 
     * @param neededVersion the needed version
     * @return true, if is version is valid
     */
    public static boolean isVersionIsValid(PlayerVersion neededVersion) {
        return getPlayerVersion().versionIsValid(neededVersion);
    }

    /**
     * Checks if is flash player installed.
     * 
     * @return true, if is flash player installed
     */
    public static boolean isFlashPlayerInstalled() {
        return !SWFObjectUtil.getPlayerVersion().toString().equals("0.0.0");
    }

    /**
     * Valid swf object attribute.
     * 
     * @param name the name
     */
    public static void validSwfObjectAttribute(String name) {
        if (forbiddenAttributes.contains(name.toLowerCase().trim())) {
            throw new GWT2SWFRuntimeException("Forbidden attribute exception. See documentation");
        }
    }

    /**
     * Valid swf object parameter.
     * 
     * @param name the name
     */
    public static void validSwfObjectParameter(String name) {
        if (forbiddenParameters.contains(name.toLowerCase().trim())) {
            throw new GWT2SWFRuntimeException("Forbidden parameter exception. See documentation");
        }
    }

}
