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

import com.ait.toolkit.flash.core.client.events.Event;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.ait.toolkit.flash.core.client.filters.BitmapFilter;
import com.ait.toolkit.flash.core.client.geom.Point;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.geom.Transform;
import com.ait.toolkit.flash.core.client.geom.Vector3D;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * <p>
 * The DisplayObject class is the base class for all objects that can be placed
 * on the display list. The display list manages all objects displayed in the
 * FlashDetect runtimes. Use the DisplayObjectContainer class to arrange the
 * display objects in the display list. DisplayObjectContainer objects can have
 * child display objects, while other display objects, such as Shape and
 * TextField objects, are "leaf" nodes that have only parents and siblings, no
 * children. The DisplayObject class supports basic functionality like the x and
 * y position of an object, as well as more advanced properties of the object
 * such as its transformation matrix.
 * <p>
 * DisplayObject is an abstract base class; therefore, you cannot call
 * DisplayObject directly. Invoking new DisplayObject() throws an ArgumentError
 * exception.
 * <p>
 * All display objects inherit from the DisplayObject class.
 * <p>
 * The DisplayObject class itself does not include any APIs for rendering
 * content onscreen. For that reason, if you want create a custom subclass of
 * the DisplayObject class, you will want to extend one of its subclasses that
 * do have APIs for rendering content onscreen, such as the Shape, Sprite,
 * Bitmap, SimpleButton, TextField, or MovieClip class.
 * 
 * <p>
 * The DisplayObject class contains several broadcast events. Normally, the
 * target of any particular event is a specific DisplayObject instance. For
 * example, the target of an added event is the specific DisplayObject instance
 * that was added to the display list. Having a single target restricts the
 * placement of event listeners to that target and in some cases the target's
 * ancestors on the display list. With broadcast events, however, the target is
 * not a specific DisplayObject instance, but rather all DisplayObject
 * instances, including those that are not on the display list. peer means that
 * you can add a listener to any DisplayObject instance to listen for broadcast
 * events. In addition to the broadcast events listed in the DisplayObject
 * class's Events table, the DisplayObject class also inherits two broadcast
 * events from the EventDispatcher class: activate and deactivate.
 */
public class DisplayObject extends EventDispatcher implements IBitmapDrawable {

    /**
     * Instantiates a new display object.
     */
    protected DisplayObject() {

    }

    DisplayObject(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Indicates the alpha transparency value of the object specified.
     * 
     * @return the alpha
     */
    public native double getAlpha() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalpha();
    }-*/;

    /**
     * Indicates the alpha transparency value of the object specified.
     * 
     * @param value
     *            the new alpha
     */
    public native void setAlpha(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalpha(value);
    }-*/;

    /**
     * A value from the BlendMode class that specifies which blend mode to use.
     * 
     * @return the blend mode
     */
    public BlendMode getBlendMode() {
        return BlendMode.fromValue(_getBlendMode());
    }

    private native String _getBlendMode() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblendMode();
    }-*/;

    /**
     * Sets A value from the BlendMode class that specifies which blend mode to
     * use.
     * 
     * @param mode
     *            the new blend mode
     */
    public void setBlendMode(BlendMode mode) {
        _setBlendMode(mode.value);
    }

    /**
     * _set blend mode.
     * 
     * @param value
     *            the value
     */
    private native void _setBlendMode(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblendMode(value);
    }-*/;

    /**
     * Sets a shader that is used for blending the foreground and background.
     * 
     * @param value
     *            the value
     * @return the shader
     */
    public native Shader setBlenShader(Shader value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.setblendShader(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.display.Shader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * If set to true, FlashDetect runtimes cache an internal bitmap
     * representation of the display object.
     * 
     * @return true, if is cache as bitmap
     */
    public native boolean isCacheAsBitmap() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcacheAsBitmap();
    }-*/;

    /**
     * Sets the cache as bitmap.
     * 
     * @param cache
     *            the new cache as bitmap
     */
    public native void setCacheAsBitmap(boolean cache) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcacheAsBitmap(cache);
    }-*/;

    /**
     * An indexed array that contains each filter object currently associated
     * with the display object.
     * 
     * @return the filters
     */
    public List<BitmapFilter> getFilters() {
        List<BitmapFilter> list = new ArrayList<BitmapFilter>();
        JsArray<JavaScriptObject> nativeFilters = _getFilters();
        for (int i = 0; i < nativeFilters.length(); i++) {
            list.add(new BitmapFilter(nativeFilters.get(i)));
        }
        return list;
    }

    private native JsArray<JavaScriptObject> _getFilters() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfilters();
    }-*/;

    /**
     * An indexed array that contains each filter object currently associated
     * with the display object.
     * 
     * @param values
     *            the new filters
     */
    public void setFilters(BitmapFilter... filters) {
        JsArray<JavaScriptObject> nativeFilters = JsArray.createArray().cast();
        for (BitmapFilter bitmalFilter : filters) {
            nativeFilters.push(bitmalFilter.getJsObj());
        }
        _setFilters(nativeFilters);
    }

    /**
     * An indexed array that contains each filter object currently associated
     * with the display object.
     * 
     * @param values
     *            the new filters
     */
    public void setFilters(List<BitmapFilter> filters) {
        JsArray<JavaScriptObject> nativeFilters = JsArray.createArray().cast();
        for (BitmapFilter bitmalFilter : filters) {
            nativeFilters.push(bitmalFilter.getJsObj());
        }
        _setFilters(nativeFilters);
    }

    private native void _setFilters(JavaScriptObject values) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfilters(values);
    }-*/;

    /**
     * Indicates the height of the display object, in pixels.
     * 
     * @return the height
     */
    public native double getHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Indicates the height of the display object, in pixels.
     * 
     * @param value
     *            the new height
     */
    public native void setHeight(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setheight(value);
    }-*/;

    /**
     * Set the width and height if this DisplayObject
     * 
     * @param size
     */
    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    /**
     * Returns a LoaderInfo object containing information about loading the file
     * to which this display object belongs.
     * 
     * @return the loader info
     */
    public native LoaderInfo getLoaderInfo() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getloaderInfo();
		return @com.ait.toolkit.flash.core.client.display.LoaderInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The calling display object is masked by the specified mask object.
     * 
     * @return the mask
     */
    public native DisplayObject getMask() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getmask();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The calling display object is masked by the specified mask object.
     * 
     * @param value
     *            the new mask
     */
    public native void setMask(DisplayObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setmask(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Indicates the x coordinate of the mouse or user input device position, in
     * pixels.
     * 
     * @return the mouse x
     */
    public native double getMouseX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmouseX();
    }-*/;

    /**
     * Indicates the y coordinate of the mouse or user input device position, in
     * pixels.
     * 
     * @return the mouse y
     */
    public native double getMouseY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmouseY();
    }-*/;

    /**
     * Indicates the instance name of the DisplayObject.
     * 
     * @return the name
     */
    public native String getName() /*-{
		return peer.getname();
    }-*/;

    /**
     * Indicates the instance name of the DisplayObject.
     * 
     * @param name
     *            the new name
     */
    public native void setName(String name) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setname(name);
    }-*/;

    /**
     * Specifies whether the display object is opaque with a certain background
     * color.
     * 
     * @param <T>
     *            the generic type
     * @return the opaque background
     */
    public native <T extends JavaScriptObject> T getOpaqueBackground() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getopaqueBackground();
    }-*/;

    /**
     * Specifies whether the display object is opaque with a certain background
     * color.
     * 
     * @param value
     *            the new opaque background
     */
    public native void setOpaqueBackground(JavaScriptObject value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setopaqueBackground(value);
    }-*/;

    /**
     * Indicates the DisplayObjectContainer object that contains this display
     * object.
     * 
     * @return the parent
     */
    public native DisplayObjectContainer getParent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getparent();
		return @com.ait.toolkit.flash.core.client.display.DisplayObjectContainer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * 
     * For a display object in a loaded SWF file, the root property is the
     * top-most display object in the portion of the display list's tree
     * structure represented by that SWF file.
     * 
     * @return the root
     */
    public native DisplayObject getRoot() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getroot();
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Indicates the rotation of the DisplayObject instance, in degrees, from
     * its original orientation.
     * 
     * @return the rotation
     */
    public native double getRotation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrotation();
    }-*/;

    /**
     * Indicates the rotation of the DisplayObject instance, in degrees, from
     * its original orientation.
     * 
     * @param value
     *            the new rotation
     */
    public native void setRotation(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrotation(value);
    }-*/;

    /**
     * Indicates the x-axis rotation of the DisplayObject instance, in degrees,
     * from its original orientation relative to the 3D parent container.
     * 
     * @return the rotation x
     */
    public native double getRotationX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrotationX();
    }-*/;

    /**
     * Indicates the x-axis rotation of the DisplayObject instance, in degrees,
     * from its original orientation relative to the 3D parent container.
     * 
     * @param value
     *            the new rotation x
     */
    public native void setRotationX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrotationX(value);
    }-*/;

    /**
     * Indicates the y-axis rotation of the DisplayObject instance, in degrees,
     * from its original orientation relative to the 3D parent container.
     * 
     * @return the rotation y
     */
    public native double getRotationY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrotationY();
    }-*/;

    /**
     * Indicates the y-axis rotation of the DisplayObject instance, in degrees,
     * from its original orientation relative to the 3D parent container.
     * 
     * @param value
     *            the new rotation y
     */
    public native void setRotationY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrotationY(value);
    }-*/;

    /**
     * Indicates the z-axis rotation of the DisplayObject instance, in degrees,
     * from its original orientation relative to the 3D parent container.
     * 
     * @return the rotation z
     */
    public native double getRotationZ() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrotationZ();
    }-*/;

    /**
     * Indicates the z-axis rotation of the DisplayObject instance, in degrees,
     * from its original orientation relative to the 3D parent container.
     * 
     * @param value
     *            the new rotation z
     */
    public native void setRotationZ(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrotationZ(value);
    }-*/;

    /**
     * The current scaling grid that is in effect.
     * 
     * @return the scale9 grid
     */
    public native Rectangle getScale9Grid() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getscale9Grid();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The current scaling grid that is in effect.
     * 
     * @param value
     *            the new scale9 grid
     */
    public native void setScale9Grid(Rectangle value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setscale9Grid(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Indicates the horizontal scale (percentage) of the object as applied from
     * the registration point.;
     * 
     * @return the scale x
     */
    public native double getScaleX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscaleX();
    }-*/;

    /**
     * Indicates the horizontal scale (percentage) of the object as applied from
     * the registration point.
     * 
     * @param value
     *            the new scale x
     */
    public native void setScaleX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscaleX(value);
    }-*/;

    /**
     * Indicates the vertical scale (percentage) of an object as applied from
     * the registration point of the object.
     * 
     * @return the scale y
     */
    public native double getScaleY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscaleY();
    }-*/;

    /**
     * Indicates the vertical scale (percentage) of an object as applied from
     * the registration point of the object.
     * 
     * @param value
     *            the new scale y
     */
    public native void setScaleY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscaleY(value);
    }-*/;

    /**
     * Indicates the depth scale (percentage) of an object as applied from the
     * registration point of the object.
     * 
     * @return the scale z
     */
    public native double getScaleZ() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscaleZ();
    }-*/;

    /**
     * Indicates the depth scale (percentage) of an object as applied from the
     * registration point of the object.
     * 
     * @param value
     *            the new scale z
     */
    public native void setScaleZ(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscaleZ(value);
    }-*/;

    /**
     * The scroll rectangle bounds of the display object.
     * 
     * @return the scoll rect
     */
    public native Rectangle getScollRect() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getscrollRect();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The scroll rectangle bounds of the display object.
     * 
     * @param value
     *            the new scoll rect
     */
    public native void setScollRect(Rectangle value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setscrollRect(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * The Stage of the display object.
     * 
     * @return the stage
     */
    public native Stage getStage() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getstage();
		return @com.ait.toolkit.flash.core.client.display.Stage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * An object with properties pertaining to a display object's matrix, color
     * transform, and pixel bounds.
     * 
     * @return the transform
     */
    public native Transform getTransform() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.gettransform();
		return @com.ait.toolkit.flash.core.client.geom.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * An object with properties pertaining to a display object's matrix, color
     * transform, and pixel bounds.
     * 
     * @param value
     *            the new transform
     */
    public native void setTransform(Transform value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.settransform(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Whether or not the display object is visible.
     * 
     * @return true, if is visible
     */
    public native boolean isVisible() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getvisible();
    }-*/;

    /**
     * Whether or not the display object is visible.
     * 
     * @param value
     *            the new visible
     */
    public native void setVisible(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setvisible(value);
    }-*/;

    /**
     * Indicates the width of the display object, in pixels.
     * 
     * @return the width
     */
    public native double getWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Indicates the width of the display object, in pixels.
     * 
     * @param value
     *            the new width
     */
    public native void setWidth(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setwidth(value);
    }-*/;

    public void setSize(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    /**
     * Indicates the x coordinate of the DisplayObject instance relative to the
     * local coordinates of the parent DisplayObjectContainer.
     * 
     * @return the x
     */
    public native double getX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Indicates the x coordinate of the DisplayObject instance relative to the
     * local coordinates of the parent DisplayObjectContainer.
     * 
     * @param value
     *            the new x
     */
    public native void setX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(value);
    }-*/;

    /**
     * Set the x and y position
     * 
     * @param xy
     */
    public void setXY(double xy) {
        setX(xy);
        setY(xy);
    }

    /**
     * Set the x and y position
     * 
     * @param xy
     */
    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * Indicates the y coordinate of the DisplayObject instance relative to the
     * local coordinates of the parent DisplayObjectContainer.
     * 
     * @return the y
     */
    public native double getY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Indicates the y coordinate of the DisplayObject instance relative to the
     * local coordinates of the parent DisplayObjectContainer.
     * 
     * @param value
     *            the new y
     */
    public native void setY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(value);
    }-*/;

    /**
     * Indicates the z coordinate position along the z-axis of the DisplayObject
     * instance relative to the 3D parent container.
     * 
     * @return the z
     */
    public native double getZ() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getz();
    }-*/;

    /**
     * Indicates the z coordinate position along the z-axis of the DisplayObject
     * instance relative to the 3D parent container.
     * 
     * @param value
     *            the new z
     */
    public native void setZ(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setz(value);
    }-*/;

    /**
     * Returns a rectangle that defines the area of the display object relative
     * to the coordinate system of the targetCoordinateSpace object.
     * 
     * @param targetCoordinateSpace
     *            the target coordinate space
     * @return the bounds
     */
    public native Rectangle getBounds(DisplayObject targetCoordinateSpace) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.getBounds(targetCoordinateSpace.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a rectangle that defines the boundary of the display object,
     * based on the coordinate system defined by the targetCoordinateSpace
     * parameter, excluding any strokes on shapes.
     * 
     * @param targetCoordinateSpace
     *            the target coordinate space
     * @return the rect
     */
    public native Rectangle getRect(DisplayObject targetCoordinateSpace) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.getRect(targetCoordinateSpace.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Converts the point object from the Stage (global) coordinates to the
     * display object's (local) coordinates.
     * 
     * @param p
     *            the p
     * @return the point
     */
    public native Point globalToLocal(Point p) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.globalToLocal(p.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Converts a two-dimensional point from the Stage (global) coordinates to a
     * three-dimensional display object's (local) coordinates.
     * 
     * @param p
     *            the p
     * @return the vector3 d
     */
    public native Vector3D globalToLocal3D(Point p) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.globalToLocal3D(p.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Evaluates the bounding box of the display object to see if it overlaps or
     * intersects with the bounding box of the obj display object.
     * 
     * @param obj
     *            the obj
     * @return true, if successful
     */
    public native boolean hitTestObject(DisplayObject obj) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.hitTestObject(obj.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Evaluates the display object to see if it overlaps or intersects with the
     * point specified by the x and y parameters
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public native boolean hitTestPoint(int x, int y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.hitTestPoint(x, y);
    }-*/;

    /**
     * Evaluates the display object to see if it overlaps or intersects with the
     * point specified by the x and y parameters
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param shapeFlag
     *            the shape flag
     * @return true, if successful
     */
    public native boolean hitTestPoint(int x, int y, boolean shapeFlag) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.hitTestPoint(x, y, shapeFlag);
    }-*/;

    /**
     * Converts a three-dimensional point of the three-dimensional display
     * object's (local) coordinates to a two-dimensional point in the Stage
     * (global) coordinates.
     * 
     * @param point3D
     *            the point3 d
     * @return the point
     */
    public native Point local3DToGlobal(Vector3D point3D) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.local3DToGlobal(point3D.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Converts the point object from the display object's (local) coordinates
     * to the Stage (global) coordinates.
     * 
     * @param point
     *            the point
     * @return the point
     */
    public native Point localToGlobal(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.localToGlobal(point.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Dispatched when a display object is added to the display list. The
     * following methods trigger this event: DisplayObjectContainer.addChild(),
     * DisplayObjectContainer.addChildAt().
     * 
     * @param handler
     */
    public void addAddedHandler(EventHandler handler) {
        this.addEventHandler(Event.ADDED, handler);
    }

    /**
     * Dispatched when a display object is added to the display list. The
     * following methods trigger this event: DisplayObjectContainer.addChild(),
     * DisplayObjectContainer.addChildAt().
     * 
     * @param handler
     */
    public void addAddedToStageHandler(EventHandler handler) {
        this.addEventHandler(Event.ADDED_TO_STAGE, handler);
    }

    /**
     * [broadcast event] Dispatched when the playhead is entering a new frame.
     * If the playhead is not moving, or if there is only one frame, this event
     * is dispatched continuously in conjunction with the frame rate. This event
     * is a broadcast event, which means that it is dispatched by all display
     * objects with a listener registered for this event.
     * <p>
     * <b>Note: </b> This event has neither a "capture phase" nor a
     * "bubble phase", which means that event listeners must be added directly
     * to any potential targets, whether the target is on the display list or
     * not.
     * 
     * @param handler
     */
    public void addEnterFrameHandler(EventHandler handler) {
        this.addEventHandler(Event.ENTER_FRAME, handler);
    }

    /**
     * [broadcast event] Dispatched when the playhead is entering a new frame.
     * If the playhead is not moving, or if there is only one frame, this event
     * is dispatched continuously in conjunction with the frame rate. This event
     * is a broadcast event, which means that it is dispatched by all display
     * objects with a listener registered for this event.
     * <p>
     * <b>Note: </b> This event has neither a "capture phase" nor a
     * "bubble phase", which means that event listeners must be added directly
     * to any potential targets, whether the target is on the display list or
     * not.
     * 
     * @param handler
     */
    public void addExitFrameHandler(EventHandler handler) {
        this.addEventHandler(Event.EXIT_FRAME, handler);
    }

    /**
     * [broadcast event] Dispatched after the constructors of frame display
     * objects have run but before frame scripts have run. If the playhead is
     * not moving, or if there is only one frame, this event is dispatched
     * continuously in conjunction with the frame rate. This event is a
     * broadcast event, which means that it is dispatched by all display objects
     * with a listener registered for this event.
     * <p>
     * <b>Note: </b> This event has neither a "capture phase" nor a
     * "bubble phase", which means that event listeners must be added directly
     * to any potential targets, whether the target is on the display list or
     * not.
     * 
     * @param handler
     */
    public void addFrameConstructedHandler(EventHandler handler) {
        this.addEventHandler(Event.FRAME_CONSTRUCTED, handler);
    }

    /**
     * Dispatched when a display object is about to be removed from the display
     * list. Two methods of the DisplayObjectContainer class generate this
     * event: removeChild() and removeChildAt().
     * <p>
     * The following methods of a DisplayObjectContainer object also generate
     * this event if an object must be removed to make room for the new object:
     * addChild(), addChildAt(), and setChildIndex().
     * 
     * @param handler
     */
    public void addRemovedHandler(EventHandler handler) {
        this.addEventHandler(Event.REMOVED, handler);
    }

    /**
     * Dispatched when a display object is about to be removed from the display
     * list. Two methods of the DisplayObjectContainer class generate this
     * event: removeChild() and removeChildAt().
     * <p>
     * The following methods of a DisplayObjectContainer object also generate
     * this event if an object must be removed to make room for the new object:
     * addChild(), addChildAt(), and setChildIndex().
     * 
     * @param handler
     */
    public void addRemovedFromStageHandler(EventHandler handler) {
        this.addEventHandler(Event.REMOVED_FROM_STAGE, handler);
    }

    /**
     * Dispatched when the display list is about to be updated and rendered.
     * This event provides the last opportunity for objects listening for this
     * event to make changes before the display list is rendered. You must call
     * the invalidate() method of the Stage object each time you want a render
     * event to be dispatched. Render events are dispatched to an object only if
     * there is mutual trust between it and the object that called
     * Stage.invalidate(). This event is a broadcast event, which means that it
     * is dispatched by all display objects with a listener registered for this
     * event.
     * 
     * @param handler
     */
    public void addRenderHandler(EventHandler handler) {
        this.addEventHandler(Event.RENDER, handler);
    }

    @Override
    public JavaScriptObject asIBitmapDrawable() {
        return this.getJsObj().cast();
    }

}
