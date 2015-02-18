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
package com.ait.toolkit.flash.core.client.utils.useragent;

import com.google.gwt.user.client.Window;

/**
 * The Class UserAgent.
 */
public class UserAgent {

    /** The Constant INTERNET_EXPLORER. */
    private static final String INTERNET_EXPLORER = "msie";

    /** The Constant SAFARI. */
    private static final String SAFARI = "safari";

    /** The Constant FIREFOX. */
    private static final String FIREFOX = "firefox";

    /** The Constant CHROME. */
    private static final String CHROME = "chrome";

    /** The Constant OPERA. */
    private static final String OPERA = "opera";

    /** The Constant AdobeAIR. */
    private static final String AdobeAIR = "adobeair";

    /**
     * Instantiates a new user agent.
     */
    private UserAgent() {

    }

    /**
     * Gets the navigator.
     * 
     * @return the navigator
     */
    public static String getNavigator() {
        return Window.Navigator.getUserAgent().toLowerCase();
    }

    /**
     * Checks if is iE.
     * 
     * @return true, if is iE
     */
    public static boolean isIE() {
        return (getNavigator().indexOf(INTERNET_EXPLORER) >= 0);
    }

    /**
     * Checks if is safari.
     * 
     * @return true, if is safari
     */
    public static boolean isSafari() {
        return (getNavigator().indexOf(SAFARI) >= 0 && getNavigator().indexOf(CHROME) < 0);
    }

    /**
     * Checks if is fire fox.
     * 
     * @return true, if is fire fox
     */
    public static boolean isFireFox() {
        return (getNavigator().indexOf(FIREFOX) >= 0);
    }

    /**
     * Checks if is chrome.
     * 
     * @return true, if is chrome
     */
    public static boolean isChrome() {
        return (getNavigator().indexOf(CHROME) >= 0 && getNavigator().indexOf(SAFARI) >= 0);
    }

    /**
     * Checks if is opera.
     * 
     * @return true, if is opera
     */
    public static boolean isOpera() {
        return (getNavigator().indexOf(OPERA) >= 0);
    }

    /**
     * Checks if is adobe air.
     * 
     * @return true, if is adobe air
     */
    public static boolean isAdobeAIR() {
        return (getNavigator().indexOf(AdobeAIR) >= 0);
    }

}
