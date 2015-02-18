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
 * The Point object represents a location in a two-dimensional coordinate
 * system, where x represents the horizontal axis and y represents the vertical
 * axis.
 */
public class Point extends JsObject {

    private static final Point p = new Point();

    /**
     * Instantiates a new point.
     */
    public Point() {
        jsObj = createNativePeer();
    }

    Point(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the point
     */
    public Point(double x, double y) {
        this();
        setY(y);
        setX(x);

    }

    /**
     * Returns the distance between pt1 and pt2.
     * 
     * @param pt1
     *            the pt1
     * @param pt2
     *            the pt2
     * @return the double
     */
    public static double distance(Point pt1, Point pt2) {
        return p._distance(pt1, pt2);
    }

    /**
     * _distance.
     * 
     * @param pt1
     *            the pt1
     * @param pt2
     *            the pt2
     * @return the double
     */
    private native double _distance(Point pt1, Point pt2) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.distance(pt1, pt2);
    }-*/;

    /**
     * Determines a point between two specified points.
     * 
     * @param pt1
     *            the pt1
     * @param pt2
     *            the pt2
     * @param f
     *            the f
     * @return the point
     */
    public static Point interpolate(Point pt1, Point pt2, double f) {
        return p._interpolate(pt1, pt2, f);
    }

    /**
     * _interpolate.
     * 
     * @param pt1
     *            the pt1
     * @param pt2
     *            the pt2
     * @param f
     *            the f
     * @return the point
     */
    private native Point _interpolate(Point pt1, Point pt2, double f) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.interpolate(
				pt1.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				pt2.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				f);

		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Converts a pair of polar coordinates to a Cartesian point coordinate.
     * 
     * @param len
     *            the len
     * @param angle
     *            the angle
     * @return the point
     */
    public static Point polar(double len, double angle) {
        return p._polar(len, angle);
    }

    /**
     * _polar.
     * 
     * @param len
     *            the len
     * @param angle
     *            the angle
     * @return the point
     */
    private native Point _polar(double len, double angle) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.polar(len, angle);
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the x.
     * 
     * @return the x
     */
    public native double getX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
    }-*/;

    /**
     * Sets the x.
     * 
     * @param x
     *            the new x
     */
    public native void setX(double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(x);
    }-*/;

    /**
     * Gets the y.
     * 
     * @return the y
     */
    public native double getY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Sets the y.
     * 
     * @param y
     *            the new y
     */
    public native void setY(double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(y);
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native double getLength() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * 
     * 
     * @param v
     *            the v
     * @return the point
     */
    public native Point add(Point v) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.add(v.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates a copy of this Point object.
     */
    public native Point clone() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Determines whether two points are equal.
     * 
     * @param toCompare
     *            the to compare
     * @return true, if successful
     */
    public native boolean equals(Point toCompare) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.equals(toCompare.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies all of the point data from the source Point object into the
     * calling Point object.
     * 
     * @param toCompare
     *            the to compare
     * @return true, if successful
     */
    public native void copyFrom(Point source) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyFrom(source.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Scales the line segment between (0,0) and the current point to a set
     * length.
     * 
     * @param thickness
     *            the thickness
     */
    public native void normalize(double thickness) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.normalize(thickness);
    }-*/;

    /**
     * Offsets the Point object by the specified amount.
     * 
     * @param dx
     *            the dx
     * @param dy
     *            the dy
     */
    public native void offset(double dx, double dy) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.offset(dx, dy);
    }-*/;

    /**
     * Sets the members of Point to the specified values
     * 
     * @param dx
     *            the dx
     * @param dy
     *            the dy
     */
    public native void setTo(double xa, double ya) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTo(xa, ya);
    }-*/;

    /**
     * Subtracts the coordinates of another point from the coordinates of this
     * point to create a new point.
     * 
     * @param v
     *            the v
     * @return the point
     */
    public native Point substract(Point p) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.substract(p.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.Point");
    }
}
