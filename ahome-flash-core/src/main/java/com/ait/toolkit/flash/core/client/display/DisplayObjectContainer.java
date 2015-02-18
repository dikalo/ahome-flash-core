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

import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.geom.Point;
import com.ait.toolkit.flash.core.client.text.TextSnapshot;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The DisplayObjectContainer class is the base class for all objects that can
 * serve as display object containers on the display list. The display list
 * manages all objects displayed in the FlashDetect runtimes. Use the
 * DisplayObjectContainer class to arrange the display objects in the display
 * list. Each DisplayObjectContainer object has its own child list for
 * organizing the z-order of the objects. The z-order is the front-to-back order
 * that determines which object is drawn in front, which is behind, and so on.
 * <p>
 * DisplayObject is an abstract base class; therefore, you cannot call
 * DisplayObject directly. Invoking new DisplayObject() throws an ArgumentError
 * exception.
 * <p>
 * The DisplayObjectContainer class is an abstract base class for all objects
 * that can contain child objects. It cannot be instantiated directly; calling
 * the new DisplayObjectContainer() constructor throws an ArgumentError
 * exception.
 */
public class DisplayObjectContainer extends InteractiveObject {

    /**
     * Instantiates a new display object container.
     */
    protected DisplayObjectContainer() {
        jsObj = createNativePeer();
    }

    protected DisplayObjectContainer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the display object container
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.DisplayObjectContainer");
    }

    /**
     * Determines whether or not the children of the object are mouse, or user
     * input device, enabled.
     * 
     * @return true, if successful
     */
    public native boolean hasMouseChildren() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmouseChildren();
    }-*/;

    /**
     * Determines whether or not the children of the object are mouse, or user
     * input device, enabled.
     * 
     * @param value the new mouse children
     */
    public native void setMouseChildren(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmouseChildren(value);
    }-*/;

    /**
     * Returns the number of children of this object.
     * 
     * @return the num children
     */
    public native int getNumChildren() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnumChildren();
    }-*/;

    /**
     * Determines whether the children of the object are tab enabled.
     * 
     * @return true, if successful
     */
    public native boolean hasTabChildren() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettabChildren();
    }-*/;

    /**
     * Determines whether the children of the object are tab enabled.
     * 
     * @param value the new tab children
     */
    public native void setTabChildren(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settabChildren(value);
    }-*/;

    /**
     * Adds a child DisplayObject instance to this DisplayObjectContainer
     * instance.
     * 
     * @param child the child
     * @return the display object
     */
    public native DisplayObject addChild(DisplayObject child) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.addChild(child.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Adds a child DisplayObject instance to this DisplayObjectContainer
     * instance.
     * 
     * @param child the child
     * @param index the index
     * @return the display object
     */
    public native DisplayObject addChildAt(DisplayObject child, int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.addChildAt(
						child.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						index);
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Indicates whether the security restrictions would cause any display
     * objects to be omitted from the list returned by calling the
     * DisplayObjectContainer.getObjectsUnderPoint() method with the specified
     * point point.
     * 
     * @param point the point
     * @return true, if successful
     */
    public native boolean areInaccessibleObjectsUnderPoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.areInaccessibleObjectsUnderPoint(point.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Determines whether the specified display object is a child of the
     * DisplayObjectContainer instance or the instance itself.
     * 
     * @param chlid the chlid
     * @return true, if successful
     */
    public native boolean contains(DisplayObject chlid) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.contains(child.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns the child display object instance that exists at the specified
     * index.
     * 
     * @param index the index
     * @return the child at
     */
    public native DisplayObject getChildAt(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getChildAt(index);
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the child by name.
     * 
     * @param name the name
     * @return the child by name
     */
    public native DisplayObject getChildByName(String name) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getChildByName(name);
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the index position of a child DisplayObject instance.
     * 
     * @param child the child
     * @return the child index
     */
    public native int getChildIndex(DisplayObject child) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.getChildIndex(child.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns an array of objects that lie under the specified point and are
     * children (or grandchildren, and so on) of this DisplayObjectContainer
     * instance.
     * 
     * @param point the point
     * @return the objects under point
     */
    private native JsArray<JavaScriptObject> getObjectsUnderPoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getObjectsUnderPoint(point);
    }-*/;

    /**
     * Removes the specified child DisplayObject instance from the child list of
     * the DisplayObjectContainer instance.
     * 
     * @param child the child
     * @return the display object
     */
    public native DisplayObject removeChild(DisplayObject child) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.removeChild(child.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes the child at.
     * 
     * @param index the index
     * @return the display object
     */
    public native DisplayObject removeChildAt(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.removeChildAt(index);
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Changes the position of an existing child in the display object
     * container.
     * 
     * @param child the child
     * @param index the index
     */
    public native void setChildIndex(DisplayObject child, int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setChildIndex(child, index);
    }-*/;

    /**
     * Swaps the z-order (front-to-back order) of the two specified child
     * objects.
     * 
     * @param child1 the child1
     * @param child2 the child2
     */
    public native void swapChildren(DisplayObject child1, DisplayObject child2) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.swapChildren(
						child1.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						child2.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Swap children at.
     * 
     * @param index1 the index1
     * @param index2 the index2
     */
    public native void swapChildrenAt(int index1, int index2) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.swapChildrenAt(index1, index2);
    }-*/;

    /**
     * Returns a TextSnapshot object for this DisplayObjectContainer instance.
     * 
     * @return the text snapshot
     */
    public native TextSnapshot getTextSnapshot() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.gettextSnapshot();
		return @com.ait.toolkit.flash.core.client.text.TextSnapshot::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
