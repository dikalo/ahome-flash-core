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
package com.ait.toolkit.flash.core.client.events;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Event.
 */
public class Event extends JsObject {

    /**
     * Instantiates a new event.
     */
    protected Event() {

    }

    protected Event(JavaScriptObject obj) {
        jsObj = obj;
    }

    /** The Constant ACTIVATE. */
    public static String ACTIVATE = "activate";

    /** The Constant ADDED. */
    public static String ADDED = "added";

    /** The Constant ADDED_TO_STAGE. */
    public static String ADDED_TO_STAGE = "addedToStage";

    /** The Constant CANCEL. */
    public static String CANCEL = "cancel";

    /** The Constant CHANGE. */
    public static String CHANGE = "change";

    /** The Constant CLEAD. */
    public static String CLEAD = "clear";

    /** The Constant CLOSE. */
    public static String CLOSE = "close";

    /** The Constant COMPLETE. */
    public static String COMPLETE = "complete";

    /** The Constant CONNECT. */
    public static String CONNECT = "connect";

    /** The Constant COPY. */
    public static String COPY = "copy";

    /** The Constant CUT. */
    public static String CUT = "cut";

    /** The Constant DEACTIVATE. */
    public static String DEACTIVATE = "deactivate";

    /** The Constant ENTER_FRAME. */
    public static String ENTER_FRAME = "enterFrame";

    /** The Constant ENTER_FRAME. */
    public static String EXIT_FRAME = "exitFrame";

    /** The Constant FRAME_CONSTRUCTED. */
    public static String FRAME_CONSTRUCTED = "frameConstructed";

    /** The Constant FULLSCREEN. */
    public static String FULLSCREEN = "fullScreen";

    /** The Constant ID3. */
    public static String ID3 = "id3";

    /** The Constant INIT. */
    public static String INIT = "init";

    /** The Constant MOUSE_LEAVE. */
    public static String MOUSE_LEAVE = "mouseLeave";

    /** The Constant NETWORK_CHANGE. */
    public static String NETWORK_CHANGE = "networkChange";

    /** The Constant OPEN. */
    public static String OPEN = "open";

    /** The Constant PASTE. */
    public static String PASTE = "paste";

    /** The Constant REMOVED. */
    public static String REMOVED = "removed";

    /** The Constant REMOVED_FROM_STAGE. */
    public static String REMOVED_FROM_STAGE = "removedFromStage";

    /** The Constant RENDER. */
    public static String RENDER = "render";

    /** The Constant RESIZE. */
    public static String RESIZE = "resize";

    /** The Constant SCROLL. */
    public static String SCROLL = "scroll";

    /** The Constant SELECT. */
    public static String SELECT = "select";

    /** The Constant SELECT_ALL. */
    public static String SELECT_ALL = "selectAll";

    /** The Constant SOUND_COMPLETE. */
    public static String SOUND_COMPLETE = "soundComplete";

    /** The Constant TAB_CHILDREN_CHANGE. */
    public static String TAB_CHILDREN_CHANGE = "tabChildrenChange";

    /** The Constant TAB_ENABLED_CHANGE. */
    public static String TAB_ENABLED_CHANGE = "tabEnabledChange";

    /** The Constant TAB_INDEX_CHANGE. */
    public static String TAB_INDEX_CHANGE = "tabIndexChange";

    /** The Constant UNLOAD. */
    public static String UNLOAD = "unload";

    public static String CONTEXT3D_CREATE = "context3DCreate";

    public native boolean getBubbles() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbubbles();
    }-*/;

    public native boolean isCancelable() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcancelable();
    }-*/;

    public JsObject getCurrentTarget() {
        return JsObject.create(_getCurrentTarget());
    }

    private native <T extends JavaScriptObject> T _getCurrentTarget() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentTarget();
    }-*/;

    public native int getEventPhase() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geteventPhase();
    }-*/;

    public JsObject getTarget() {
        return JsObject.create(_getTarget());
    }

    private native <T extends JavaScriptObject> T _getTarget() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettarget();
    }-*/;

    public native String getEventType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettype();
    }-*/;

    public native Event clone() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		var toReturn = @com.ait.toolkit.flash.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native boolean isDefaultPrevented() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isDefaultPrevented();
    }-*/;

    public native void preventDefault() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.preventDefault();
    }-*/;

    public native void stopImmediatePropagation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stopImmediatePropagation();
    }-*/;

    public native void stopPropagation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stopPropagation();
    }-*/;

}
