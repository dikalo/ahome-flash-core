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

package com.ait.toolkit.flash.core.client.geom;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Rectangle object is an area defined by its position, as indicated by its
 * top-left corner point (x, y) and by its width and its height. The x, y,
 * width, and height properties of the Rectangle class are independent of each
 * other; changing the value of one property has no effect on the others.
 * However, the right and bottom properties are integrally related to those four
 * properties. For example, if you change the value of the right property, the
 * value of the width property changes; if you change the bottom property, the
 * value of the height property changes.
 */
public class Rectangle extends JsObject {

    /**
     * Instantiates a new rectangle.
     */
    public Rectangle() {
        jsObj = createNativePeer();
        setX(0);
        setY(0);
        setWidth(0);
        setHeight(0);

    }

    Rectangle(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the bottom. The sum of the y and height properties.
     * 
     * @return the bottom
     */
    public native double getBottom() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbottom();
    }-*/;

    /**
     * Sets the bottom. The sum of the y and height properties.
     * 
     * @param bottom
     *            the new bottom
     */
    public native void setBottom(double bottom) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbottom(bottom);
    }-*/;

    /**
     * The location of the Rectangle object's bottom-right corner, determined by
     * the values of the right and bottom properties.
     * 
     * @return the bottom right
     */
    public native Point getBottomRight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getbottomRight();
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The location of the Rectangle object's bottom-right corner, determined by
     * the values of the right and bottom properties.
     * 
     * @param bottomRight
     *            the new bottom right
     */
    public native void setBottomRight(Point bottomRight) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbottomRight(bottomRight);
    }-*/;

    /**
     * Gets the height of the rectangle, in pixels.
     * 
     * @return the height
     */
    public native double getHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Sets the height of the rectangle, in pixels.
     * 
     * @param height
     *            the new height
     */
    public native void setHeight(double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setheight(height);
    }-*/;

    /**
     * Gets The x coordinate of the top-left corner of the rectangle.
     * 
     * @return the left
     */
    public native double getLeft() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getleft();
    }-*/;

    /**
     * Sets The x coordinate of the top-left corner of the rectangle.
     * 
     * @param left
     *            the new left
     */
    public native void setLeft(double left) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lsetleft(left);
    }-*/;

    /**
     * Gets the sum of the x and width properties.
     * 
     * @return the right
     */
    public native double getRight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getright();
    }-*/;

    /**
     * Sets the sum of the x and width properties.
     * 
     * @param right
     *            the new right
     */
    public native void setRight(double right) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setright(right);
    }-*/;

    /**
     * The size of the Rectangle object, expressed as a Point object with the
     * values of the width and height properties.
     * 
     * @return the size
     */
    public native Point getSize() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsize();
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the size of the Rectangle object, expressed as a Point object with
     * the values of the width and height properties.
     * 
     * @param size
     *            the new size
     */
    public native void setSize(Point size) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsize(size.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the y coordinate of the top-left corner of the rectangle.
     * 
     * @return the top
     */
    public native double getTop() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettop();
    }-*/;

    /**
     * Sets the y coordinate of the top-left corner of the rectangle.
     * 
     * @param top
     *            the new top
     */
    public native void setTop(double top) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settop(top);
    }-*/;

    /**
     * Gets the location of the Rectangle object's top-left corner, determined
     * by the x and y coordinates of the point.
     * 
     * @return the top left
     */
    public native Point getTopLeft() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettopLeft();
    }-*/;

    /**
     * Sets the location of the Rectangle object's top-left corner, determined
     * by the x and y coordinates of the point.
     * 
     * @param topLeft
     *            the new top left
     */
    public native void setTopLeft(Point topLeft) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settopLeft(topLeft);
    }-*/;

    /**
     * Gets the width of the rectangle, in pixels.
     * 
     * @return the width
     */
    public native double getWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Sets the width of the rectangle, in pixels.
     * 
     * @param width
     *            the new width
     */
    public native void setWidth(double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setwidth(width);
    }-*/;

    /**
     * Gets the x coordinate of the top-left corner of the rectangle.
     * 
     * @return the x
     */
    public native double getX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x coordinate of the top-left corner of the rectangle.
     * 
     * @param x
     *            the new x
     */
    public native void setX(double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(x);
    }-*/;

    /**
     * Gets the y coordinate of the top-left corner of the rectangle.
     * 
     * @return the y
     */
    public native double getY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Sets the y coordinate of the top-left corner of the rectangle.
     * 
     * @param y
     *            the new y
     */
    public native void setY(double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(y);
    }-*/;

    /**
     * Returns a new Rectangle object with the same values for the x, y, width,
     * and height properties as the original Rectangle object.
     */
    public native Rectangle clone() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Determines whether the specified point is contained within the
     * rectangular region defined by this Rectangle object.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public native boolean contains(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.contains(x, y);
    }-*/;

    /**
     * Determines whether the specified point is contained within the
     * rectangular region defined by this Rectangle object.
     * 
     * @param point
     *            the point
     * @return true, if successful
     */
    public native boolean containsPoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.containsPoint(point.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Determines whether the Rectangle object specified by the rect parameter
     * is contained within this Rectangle object.
     * 
     * @param rect
     *            the rect
     * @return true, if successful
     */
    public native boolean containsRectangle(Rectangle rect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.containsRectangle(rect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies all of rectangle data from the source Rectangle object into the
     * calling Rectangle object.
     * 
     * @param sourceRect
     *            , the sourceRectangle
     */
    public native void copyFrom(Rectangle sourceRect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyFrom(sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Determines whether the object specified in the toCompare parameter is
     * equal to this Rectangle object.
     * 
     * @param toCompare
     *            the to compare
     * @return true, if successful
     */
    public native boolean equals(Rectangle toCompare) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.equals(toCompare.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Increases the size of the Rectangle object by the specified amounts, in
     * pixels.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void inflate(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.inflate(x, y);
    }-*/;

    /**
     * Increases the size of the Rectangle object.
     * 
     * @param point
     *            the point
     */
    public native void inflatePoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.inflatePoint(point.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * If the Rectangle object specified in the toIntersect parameter intersects
     * with this Rectangle object, returns the area of intersection as a
     * Rectangle object.
     * 
     * @param toIntersect
     *            the to intersect
     * @return the rectangle
     */
    public native Rectangle intersection(Rectangle toIntersect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.intersection(toIntersect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Determines whether the object specified in the toIntersect parameter
     * intersects with this Rectangle object.
     * 
     * @param toIntersect
     *            the to intersect
     * @return true, if successful
     */
    public native boolean intersects(Rectangle toIntersect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.intersects(toIntersect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Determines whether or not this Rectangle object is empty.
     * 
     * @return true, if is empty
     */
    public native boolean isEmpty() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isEmpty();
    }-*/;

    /**
     * Adjusts the location of the Rectangle object, as determined by its
     * top-left corner, by the specified amounts.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public native boolean offset(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.offset(x, y);
    }-*/;

    /**
     * Adjusts the location of the Rectangle object using a Point object as a
     * parameter.
     * 
     * @param point
     *            the point
     * @return true, if successful
     */
    public native boolean offsetPoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.offsetPoint(point.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets all of the Rectangle object's properties to 0.
     */
    public native void setEmpty() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setEmpty();
    }-*/;

    /**
     * Sets the members of Rectangle to the specified values
     */
    public native void setTo(double x, double y, double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTo(x, y, width, height);
    }-*/;

    /**
     * Adds two rectangles together to create a new Rectangle object, by filling
     * in the horizontal and vertical space between the two rectangles.
     * 
     * @param toUnion
     *            the to union
     * @return the rectangle
     */
    public native Rectangle union(Rectangle toUnion) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.union(toUnion.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.Rectangle");
    }
}
