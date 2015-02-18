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

import com.ait.toolkit.flash.core.client.events.Event;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.handlers.ActivityHandler;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.events.handlers.StatusHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Use the Camera class to capture video from the client system or device
 * camera. Use the Video class to monitor the video locally. Use the
 * NetConnection and NetStream classes to transmit the video to FlashDetect Media
 * Server. FlashDetect Media Server can send the video stream to other servers and
 * broadcast it to other clients running FlashDetect Player or AIR. A Camera instance
 * captures video in landscape aspect ratio. On devices that can change the
 * screen orientation, such as mobile phones, a Video object attached to the
 * camera will only show upright video in a landscape-aspect orientation. Thus,
 * mobile apps should use a landscape orientation when displaying video and
 * should not auto-rotate.
 * <p>
 * On iOS, the video from the front camera is mirrored. On Android, it is not.
 * <p>
 * On mobile devices with an autofocus camera, autofocus is enabled
 * automatically. If the camera does not support continuous autofocus, and many
 * mobile device cameras do not, then the camera is focused when the Camera
 * object is attached to a video stream and whenever the setMode() method is
 * called. On desktop computers, autofocus behavior is dependent on the camera
 * driver and settings.
 * <p>
 * In an AIR application on Android and iOS, the camera does not capture video
 * while an AIR app is not the active, foreground application. In addition,
 * streaming connections can be lost when the application is in the background.
 * On iOS, the camera video cannot be displayed when an application uses the GPU
 * rendering mode. The camera video can still be streamed to a server.
 */
public class Camera extends EventDispatcher {

    private static Camera SIMPLE_INSTANCE = new Camera();
    private static Camera NAMED_INSTANCE = null;

    public static Camera get() {
        return SIMPLE_INSTANCE;
    }

    public static Camera get(String name) {
        if (NAMED_INSTANCE == null) {
            NAMED_INSTANCE = new Camera(name);
        }
        return NAMED_INSTANCE;
    }

    /**
     * Instantiates a new camera.
     */
    private Camera() {
        jsObj = CameraProxy.INSTANCE.createCamera();
    }

    private Camera(String name) {
        jsObj = CameraProxy.INSTANCE.createCamera(name);
    }

    Camera(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the amount of motion the camera is detecting.
     * 
     * @return the activity level
     */
    public native double getActivityLevel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getactivityLevel();
    }-*/;

    /**
     * The maximum amount of bandwidth the current outgoing video feed can use,
     * in bytes.
     * 
     * @return the band width
     */
    public native int getBandWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbandwidth();
    }-*/;

    /**
     * The rate at which the camera is capturing data, in frames per second.
     * 
     * @return the current fps
     */
    public native double getCurrentFPS() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentFPS();
    }-*/;

    /**
     * The maximum rate at which the camera can capture data, in frames per
     * second.
     * 
     * @return the fPS
     */
    public native double getFps() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfps();
    }-*/;

    /**
     * The current capture height, in pixels.
     * 
     * @return the height
     */
    public native double getHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * A zero-based index that specifies the position of the camera in the
     * Camera.names array, which lists all available cameras.
     * 
     * @return the index
     */
    public native int getIndex() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindex();
    }-*/;

    /**
     * The isSupported property is set to true if the Camera class is supported
     * on the current platform, otherwise it is set to false.
     * 
     * @return true, if is supported
     */
    public static boolean isSupported() {
        return CameraProxy.INSTANCE.isCameraSupported();
    }

    /**
     * The number of video frames transmitted in full (called keyframes) instead
     * of being interpolated by the video compression algorithm.
     * 
     * @return the key frame interval
     */
    public native int getKeyFrameInterval() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getkeyFrameInterval;
    }-*/;

    /**
     * Indicates whether a local view of what the camera is capturing is
     * compressed and decompressed (true), as it would be for live transmission
     * using FlashDetect Media Server, or uncompressed (false).
     * 
     * @return true, if is loop back
     */
    public native boolean isLoopBack() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getloopback();
    }-*/;

    /**
     * The number of milliseconds between the time the camera stops detecting
     * motion and the time the activity event is invoked.
     * 
     * @return the motion level
     */
    public native int getMotionLevel() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmotionLevel();
    }-*/;

    /**
     * The number of milliseconds between the time the camera stops detecting
     * motion and the time the activity event is invoked.
     * 
     * @return the motion timeout
     */
    public native int getMotionTimeout() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmotionTimeout();
    }-*/;

    /**
     * A Boolean value indicating whether the user has denied access to the
     * camera (true) or allowed access (false) in the FlashDetect Player Privacy
     * dialog box.
     * 
     * @return true, if is muted
     */
    public native boolean isMuted() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmuted();
    }-*/;

    /**
     * The name of the current camera, as returned by the camera hardware.
     * 
     */
    public native String getName() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getname();
    }-*/;

    /**
     * Gets An array of strings containing the names of all available cameras.
     * 
     * @return the names
     */
    public static JsArrayString getNames() {
        return CameraProxy.INSTANCE.getCameraNames();
    }

    /**
     * The required level of picture quality, as determined by the amount of
     * compression being applied to each video frame.
     * 
     * @return the quality
     */
    public native int getQuality() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getquality();
    }-*/;

    /**
     * The current capture width, in pixels.
     * 
     * @return the width
     */
    public native int getWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Specifies which video frames are transmitted in full (called keyframes)
     * instead of being interpolated by the video compression algorithm.
     * 
     * @param keyFrameInterval the new key frame interval
     */
    public native void setKeyFrameInterval(int keyFrameInterval) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setKeyFrameInterval(keyFrameInterval);
    }-*/;

    /**
     * Specifies whether to use a compressed video stream for a local view of
     * the camera.
     */
    public native void setLoopback() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLoopback();
    }-*/;

    /**
     * Specifies whether to use a compressed video stream for a local view of
     * the camera.
     * 
     * @param compress the new loopback
     */
    public native void setLoopback(boolean compress) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLoopback(compress);
    }-*/;

    /**
     * Sets the camera capture mode to the native mode that best meets the
     * specified requirements.
     * 
     * @param width the width
     * @param height the height
     * @param fps the fps
     */
    public native void setMode(int width, int height, double fps) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMode(width, height, fps);
    }-*/;

    /**
     * Sets the camera capture mode to the native mode that best meets the
     * specified requirements.
     * 
     * @param width the width
     * @param height the height
     * @param fps the fps
     * @param favorArea the favor area
     */
    public native void setMode(int width, int height, double fps, boolean favorArea) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMode(width, height, fps, favorArea);
    }-*/;

    /**
     * Specifies how much motion is required to dispatch the activity event.
     * 
     * @param motionLevel the new motion level
     */
    public native void setMotionLevel(int motionLevel) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMotionLevel(motionLevel);
    }-*/;

    /**
     * Specifies how much motion is required to dispatch the activity event.
     * 
     * @param motionLevel the motion level
     * @param timeout the timeout
     */
    public native void setMotionLevel(int motionLevel, int timeout) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMotionLevel(motionLevel, timeout);
    }-*/;

    /**
     * Sets the maximum amount of bandwidth per second or the required picture
     * quality of the current outgoing video feed
     * 
     * @param bandwith the bandwith
     * @param quality the quality
     */
    public native void setQuality(int bandwith, int quality) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setQuality(bandwith, quality);
    }-*/;

    /**
     * Dispatched just after a new image is processed by the camera.
     * 
     * @param handler
     */
    public void addVideoFrameHandler(EventHandler handler) {
        addEventHandler(Event.RENDER, handler);
    }

    /**
     * Dispatched when a camera reports its status. Before accessing a camera,
     * the runtime displays a Privacy dialog box to let users allow or deny
     * access to their camera. If the value of the code property is
     * "Camera.Muted", the user has refused to allow the SWF file access to the
     * user's camera. If the value of the code property is "Camera.Unmuted", the
     * user has allowed the SWF file access to the user's camera.
     * 
     * @param handler
     */
    public native void addStatusHandler(StatusHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.StatusEvent::STATUS,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.StatusEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.StatusHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/StatusEvent;)(eventObject);
						}));
    }-*/;

    /**
     * Dispatched when a camera begins or ends a session. Call
     * Camera.setMotionLevel() to specify the amount of motion required to
     * trigger an activity event with an activating value of true, or the time
     * without activity that must elapse before triggering an activity event
     * with an activating value of false.
     * 
     * @param handler
     */
    public native void addActivityHandler(ActivityHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.flash.core.client.events.ActivityEvent::ACTIVITY,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.ActivityHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/ActivityEvent;)(eventObject);
						}));
    }-*/;

}
