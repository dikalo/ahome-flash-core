/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.flash.core.detect.client;

/**
 * A class designed to simplify the process of detecting if the Adobe
 * FlashDetect Player is installed in a Web Browser.
 * 
 */
public class FlashDetect {

    private FlashDetect() {}

    public static native boolean isInstalled()/*-{
		return $wnd.FlashDetect.installed;
    }-*/;

    public static native String getRawVersion()/*-{
		return $wnd.FlashDetect.raw;
    }-*/;

    public static native double getMajorVersion()/*-{
		return $wnd.FlashDetect.major;
    }-*/;

    public static native double getMinorVersion()/*-{
		return $wnd.FlashDetect.minor;
    }-*/;

    public static native double getRevision()/*-{
		return $wnd.FlashDetect.revision;
    }-*/;

    public static native String getRevisionStr()/*-{
		return $wnd.FlashDetect.revisionStr;
    }-*/;

    public static native boolean isVersionAtLeast( double version )/*-{
		return $wnd.FlashDetect.versionAtLeast(version);
    }-*/;

    public static native boolean isMajorAtLeast( double version )/*-{
		return $wnd.FlashDetect.majorAtLeast(version);
    }-*/;

    public static native boolean isMinorAtLeast( double version )/*-{
		return $wnd.FlashDetect.minorAtLeast(version);
    }-*/;

    public static native boolean isRevisionAtLeast( double version )/*-{
		return $wnd.FlashDetect.revisionAtLeast(version);
    }-*/;

}
