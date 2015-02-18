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
package com.ait.toolkit.flash.core.client.toplevel;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.display.Stage;
import com.ait.toolkit.flash.core.client.display.Stage3D;
import com.ait.toolkit.flash.core.client.media.StageVideo;
import com.ait.toolkit.flash.core.detect.client.FlashDetect;

public class Flash extends JsObject {

    static final Flash INSTANCE = new Flash();
    public static final String FLASH_NOT_INSTALLED = "Flash seems not be installed";

    public static Flash get() {
        return INSTANCE;
    }

    /**
     * Opens or replaces a window in the application that contains the
     * FlashDetect Player container (usually a browser).
     * 
     * @param url
     *            the url
     */
    public void navigateToURL(String url) {
        Core.INSTANCE.navigateToURL(url);
    }

    /**
     * NOpens or replaces a window in the application that contains the
     * FlashDetect Player container (usually a browser).
     * 
     * @param url
     *            the url
     * @param window
     *            the window
     */
    public void navigateToURL(String url, String window) {
        Core.INSTANCE.navigateToURL(url, window);
    }

    public void xmlIgnoreWhiteSpace(boolean value) {
        Core.INSTANCE.xmlIgnoreWhiteSpace(value);
    }

    public void xmlIgnoreComments(boolean value) {
        Core.INSTANCE.xmlIgnoreComments(value);
    }

    public void xmlIgnoreProcessingInstructions(boolean value) {
        Core.INSTANCE.xmlIgnoreProcessingInstructions(value);
    }

    public static final boolean isInstalled() {
        return FlashDetect.isInstalled();
    }

    public static final String getRawVersion() {
        return FlashDetect.getRawVersion();
    }

    public static final double getMinorVersion() {
        return FlashDetect.getMinorVersion();
    }

    public static final double getMajorVersion() {
        return FlashDetect.getMajorVersion();
    }

    public static final double getRevision() {
        return FlashDetect.getRevision();
    }

    public static final String getRevisionString() {
        return FlashDetect.getRevisionStr();
    }

    public static final boolean isMajorAtLeast(double version) {
        return FlashDetect.getMajorVersion() <= version;
    }

    public static final boolean isMinorAtLeast(double version) {
        return FlashDetect.getMinorVersion() <= version;
    }

    public static final boolean isRevisionAtLeast(double version) {
        return FlashDetect.getRevision() <= version;
    }

    public static Stage3D getStage3D(Stage target, int index) {
        return Core.INSTANCE.getStage3DAt(target, index);
    }

    public static StageVideo getStageVideo(Stage target, int index) {
        return Core.INSTANCE.getStageVideoAt(target, index);
    }

}
