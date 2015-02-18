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
package com.ait.toolkit.flash.core.client.display;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The Scene class includes properties for identifying the name, labels, and
 * number of frames in a scene. A Scene object instance is created in FlashDetect
 * Professional, not by writing ActionScript code. The MovieClip class includes
 * a currentScene property, which is a Scene object that identifies the scene in
 * which the playhead is located in the timeline of the MovieClip instance. The
 * scenes property of the MovieClip class is an array of Scene objects. Also,
 * the gotoAndPlay() and gotoAndStop() methods of the MovieClip class use Scene
 * objects as parameters.
 */
public class Scene extends JsObject {

    /**
     * Instantiates a new scene.
     */
    Scene() {
    }

    Scene(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Returns an array of FrameLabel objects from the current scene. MovieClip
     * instance.
     * 
     * @return the current labels
     */
    public List<FrameLabel> getCurrentLabels() {
        List<FrameLabel> frameLabels = new ArrayList<FrameLabel>();
        JsArray<JavaScriptObject> nativePeers = _getLabels();
        for (int i = 0; i < nativePeers.length(); i++) {
            frameLabels.add(new FrameLabel(nativePeers.get(i)));
        }
        return frameLabels;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public native String getName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return this.getname();
    }-*/;

    /**
     * Gets the num frames.
     * 
     * @return the num frames
     */
    public native int getNumFrames()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return this.getnumFrames();
    }-*/;

    private native JsArray<JavaScriptObject> _getLabels() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlabels();
    }-*/;

}
