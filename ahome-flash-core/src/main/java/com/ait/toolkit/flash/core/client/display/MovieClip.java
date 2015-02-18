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

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The MovieClip class inherits from the following classes: Sprite,
 * DisplayObjectContainer, InteractiveObject, DisplayObject, and
 * EventDispatcher.
 * <p>
 * Unlike the Sprite object, a MovieClip object has a timeline.
 * <p>
 * >In FlashDetect Professional, the methods for the MovieClip class provide the same
 * functionality as actions that target movie clips. Some additional methods do
 * not have equivalent actions in the Actions toolbox in the Actions panel in
 * the FlashDetect authoring tool.
 * <p>
 * Children instances placed on the Stage in FlashDetect Professional cannot be
 * accessed by code from within the constructor of a parent instance since they
 * have not been created at that point in code execution. Before accessing the
 * child, the parent must instead either create the child instance by code or
 * delay access to a callback function that listens for the child to dispatch
 * its Event.ADDED_TO_STAGE event.
 * <p>
 * If you modify any of the following properties of a MovieClip object that
 * contains a motion tween, the playhead is stopped in that MovieClip object:
 * alpha, blendMode, filters, height, opaqueBackground, rotation, scaleX,
 * scaleY, scale9Grid, scrollRect, transform, visible, width, x, or y. However,
 * it does not stop the playhead in any child MovieClip objects of that
 * MovieClip object.
 * <p>
 * <b>Note:</b>FlashDetect Lite 4 supports the MovieClip.opaqueBackground property
 * only if FEATURE_BITMAPCACHE is defined. The default configuration of FlashDetect
 * Lite 4 does not define FEATURE_BITMAPCACHE. To enable the
 * MovieClip.opaqueBackground property for a suitable device, define
 * FEATURE_BITMAPCACHE in your project.
 */
public class MovieClip extends Sprite {

    /**
     * Instantiates a new movie clip.
     */
    public MovieClip() {
        jsObj = createNativePeer();
    }

    protected MovieClip(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Specifies the number of the frame in which the playhead is located in the
     * timeline of the MovieClip instance.
     * 
     * @return the current frame
     */
    public native int getCurrentFrame() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentFrame();
    }-*/;

    /**
     * Gets The label at the current frame in the timeline of the MovieClip
     * instance.
     * 
     * @return the current frame label
     */
    public native String getCurrentFrameLabel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentFrameLabel();
    }-*/;

    /**
     * Gets the current label.
     * 
     * @return the current label
     */
    public native String getCurrentLabel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentLabel();
    }-*/;

    /**
     * Returns an array of FrameLabel objects from the current scene. MovieClip
     * instance.
     * 
     * @return the current labels
     */
    public List<FrameLabel> getCurrentLabels() {
        List<FrameLabel> frameLabels = new ArrayList<FrameLabel>();
        JsArray<JavaScriptObject> nativePeers = _getCurrentLabels();
        for (int i = 0; i < nativePeers.length(); i++) {
            frameLabels.add(new FrameLabel(nativePeers.get(i)));
        }
        return frameLabels;
    }

    /**
     * Gets the current scene.
     * 
     * @return the current scene
     */
    public native Scene getCurrentScene() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getcurrentScene();
		return @com.ait.toolkit.flash.core.client.display.Scene::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public native boolean isEnabled() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getenabled();
    }-*/;

    /**
     * Sets the enabled.
     * 
     * @param value the new enabled
     */
    public native void setEnabled(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setenabled(value);
    }-*/;

    /**
     * Gets the frames loaded.
     * 
     * @return the frames loaded
     */
    public native int getFramesLoaded() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getframesLoaded();
    }-*/;

    /**
     * Gets the scenes.
     * 
     * @return the scenes
     */

    public List<Scene> getScenes() {
        List<Scene> scenes = new ArrayList<Scene>();
        JsArray<JavaScriptObject> nativePeers = _getScenes();
        for (int i = 0; i < nativePeers.length(); i++) {
            scenes.add(new Scene(nativePeers.get(i)));
        }
        return scenes;
    }

    /**
     * Gets the total frames.
     * 
     * @return the total frames
     */
    public native int getTotalFrames() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettotalFrames();
    }-*/;

    /**
     * Checks if is track as menu.
     * 
     * @return true, if is track as menu
     */
    public native boolean isTrackAsMenu() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettrackAsMenu();
    }-*/;

    /**
     * Sets the track as menu.
     * 
     * @param value the new track as menu
     */
    public native void setTrackAsMenu(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settrackAsMenu(value);
    }-*/;

    /**
     * Goto and play.
     * 
     * @param frame the frame
     */
    public native void gotoAndPlay(JavaScriptObject frame) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.gotoAndPlay(frame);
    }-*/;

    /**
     * Goto and play.
     * 
     * @param frame the frame
     * @param scene the scene
     */
    public native void gotoAndPlay(JavaScriptObject frame, String scene) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.gotoAndPlay(
						frame,
						scene.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Goto and stop.
     * 
     * @param frame the frame
     */
    public native void gotoAndStop(JavaScriptObject frame) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.gotoAndPStop(frame);
    }-*/;

    /**
     * Goto and stop.
     * 
     * @param frame the frame
     * @param scene the scene
     */
    public native void gotoAndStop(JavaScriptObject frame, String scene) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.gotoAndStop(frame, scene);
    }-*/;

    /**
     * Next frame.
     */
    public native void nextFrame() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.nextFrame();
    }-*/;

    /**
     * Next scene.
     */
    public native void nextScene() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.nextScene();
    }-*/;

    /**
     * Prev frame.
     */
    public native void prevFrame() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.prevFrame();
    }-*/;

    /**
     * Play.
     */
    public native void play() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play();
    }-*/;

    /**
     * Stop.
     */
    public native void stop() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stop();
    }-*/;

    /**
     * New instance.
     * 
     * @return the movie clip
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.MovieClip");
    }

    private native JsArray<JavaScriptObject> _getCurrentLabels() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentLabels();
    }-*/;

    private native JsArray<JavaScriptObject> _getScenes() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscenes();
    }-*/;

}
