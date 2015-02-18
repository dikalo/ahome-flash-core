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

import com.ait.toolkit.flash.core.client.display.DisplayObject;
import com.ait.toolkit.flash.core.client.net.NetStream;
import com.ait.toolkit.flash.core.client.utils.factories.VideoFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Video class displays live or recorded video in an application without
 * embedding the video in your SWF file. peer class creates a Video object that
 * plays either of the following kinds of video: recorded video files stored on
 * a server or locally, or live video captured by the user. A Video object is a
 * display object on the application's display list and represents the visual
 * space in which the video runs in a user interface.
 * <p>
 * When used with FlashDetect Media Server, the Video object allows you to send live
 * video captured by a user to the server and then broadcast it from the server
 * to other users. Using these features, you can develop media applications such
 * as a simple video player, a video player with multipoint publishing from one
 * server to another, or a video sharing application for a user community.
 * <p>
 * FlashDetect Player 9 and later supports publishing and playback of FLV files
 * encoded with either the Sorenson Spark or On2 VP6 codec and also supports an
 * alpha channel. The On2 VP6 video codec uses less bandwidth than older
 * technologies and offers additional deblocking and deringing filters. See the
 * flash.net.NetStream class for more information about video playback and
 * supported formats.
 * <p>
 * FlashDetect Player 9.0.115.0 and later supports mipmapping to optimize runtime
 * rendering quality and performance. For video playback, FlashDetect Player uses
 * mipmapping optimization if you set the Video object's smoothing property to
 * true.
 * <p>
 * As with other display objects on the display list, you can control various
 * properties of Video objects. For example, you can move the Video object
 * around on the Stage by using its x and y properties, you can change its size
 * using its height and width properties, and so on.
 * <p>
 * To play a video stream, use <code>attachCamera()</code> or
 * <code>attachNetStream()</code> to attach the video to the Video object. Then,
 * add the Video object to the display list using <code>addChild()</code>.
 */
public class Video extends DisplayObject {

    /**
     * Instantiates a new video.
     */
    public Video() {
        jsObj = createNativePeer();
    }

    public Video(int width) {
        jsObj = VideoFactory.get().createVideo(width);
    }

    public Video(int width, int height) {
        jsObj = VideoFactory.get().createVideo(width, height);
    }

    Video(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates the type of filter applied to decoded video as part of
     * post-processing.
     * 
     * @return the deblocking
     */
    public native int getDeblocking()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdeblocking();
    }-*/;

    /**
     * Indicates the type of filter applied to decoded video as part of
     * post-processing.
     * 
     * @param value the new deblocking
     */
    public native void setDeblocking(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdeblocking(value);
    }-*/;

    /**
     * Specifies whether the video should be smoothed (interpolated) when it is
     * scaled.
     * 
     * @return true, if is smoothing
     */
    public native boolean isSmoothing()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getsmoothing();
    }-*/;

    /**
     * Specifies whether the video should be smoothed (interpolated) when it is
     * scaled.
     * 
     * @param value the new smoothing
     */
    public native void setSmoothing(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsmoothing(value);
    }-*/;

    /**
     * An integer specifying the height of the video stream, in pixels.
     * 
     * @return the video height
     */
    public native int getVideoHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoHeight();
    }-*/;

    /**
     * An integer specifying the width of the video stream, in pixels.
     * 
     * @return the video width
     */
    public native int getVideoWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvideoWidth();
    }-*/;

    /**
     * Specifies a video stream from a camera to be displayed within the
     * boundaries of the Video object in the application.
     * 
     * @param camera the camera
     */
    public native void attachCamera(Camera camera)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.attachCamera(camera.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Specifies a video stream to be displayed within the boundaries of the
     * Video object in the application.
     * 
     * @param netStream the net stream
     */
    public native void attachNetStream(NetStream netStream)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.attachNetStream(netStream.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Clears the image currently displayed in the Video object (not the video
     * stream).
     */
    public native void clear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * New instance.
     * 
     * @return the video
     */
    private JavaScriptObject createNativePeer() {
        return VideoFactory.get().createVideo();
    }

}
