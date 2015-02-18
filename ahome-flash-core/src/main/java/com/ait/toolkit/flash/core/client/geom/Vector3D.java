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
 * The Vector3D class represents a point or a location in the three-dimensional
 * space using the Cartesian coordinates x, y, and z. As in a two-dimensional
 * space, the x property represents the horizontal axis and the y property
 * represents the vertical axis. In three-dimensional space, the z property
 * represents depth. The value of the x property increases as the object moves
 * to the right. The value of the y property increases as the object moves down.
 * The z property increases as the object moves farther from the point of view.
 * Using perspective projection and scaling, the object is seen to be bigger
 * when near and smaller when farther away from the screen. As in a right-handed
 * three-dimensional coordinate system, the positive z-axis points away from the
 * viewer and the value of the z property increases as the object moves away
 * from the viewer's eye. The origin point (0,0,0) of the global space is the
 * upper-left corner of the stage.
 */
public class Vector3D extends JsObject {

    /** The Constant X_AXIS. */
    public static Vector3D X_AXIS = new Vector3D(1, 0, 0);
    public static Vector3D Y_AXIS = new Vector3D(0, 1, 0);
    public static Vector3D Z_AXIS = new Vector3D(0, 0, 1);
    private static final Vector3D v = new Vector3D();

    /**
     * Instantiates a new vector3 d.
     */
    public Vector3D() {
        jsObj = createNativePeer();
    }

    Vector3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Vector3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    /**
     * The length, magnitude, of the current Vector3D object from the origin
     * (0,0,0) to the object's x, y, and z coordinates.
     * 
     * @return the length
     */
    public native double getLength() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Gets the square of the length of the current Vector3D object, calculated
     * using the x, y, and z properties.
     * 
     * @return the length squared
     */
    public native double getLengthSquared() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlengthSquared();
    }-*/;

    /**
     * Gets the w.
     * 
     * @return the w
     */
    public native double getW() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getw();
    }-*/;

    /**
     * Sets the w.
     * 
     * @param value the new w
     */
    public native void setW(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setw(value);
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
     * @param value the new x
     */
    public native void setX(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(value);
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
     * @param value the new y
     */
    public native void setY(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(value);
    }-*/;

    /**
     * Gets the z.
     * 
     * @return the z
     */
    public native double getZ() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getz();
    }-*/;

    /**
     * Sets the z.
     * 
     * @param value the new z
     */
    public native void setZ(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setz(value);
    }-*/;

    /**
     * Adds the value of the x, y, and z elements of the current Vector3D object
     * to the values of the x, y, and z elements of another Vector3D object.
     * 
     * @param value the value
     * @return the vector3 d
     */
    public native Vector3D add(Vector3D value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the distance between two Vector3D objects.
     * 
     * @param a the a
     * @param b the b
     * @return the angle between
     */
    public static double getAngleBetween(Vector3D a, Vector3D b) {
        return v._getAngleBetween(a, b);
    }

    /**
     * _get angle between.
     * 
     * @param a the a
     * @param b the b
     * @return the double
     */
    private native double _getAngleBetween(Vector3D a, Vector3D b) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.angleBetween(a, b);
    }-*/;

    /**
     * Returns a new Vector3D object that is an exact copy of the current
     * Vector3D object.
     */
    public native Vector3D clone() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		return @com.ait.toolkit.flash.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a new Vector3D object that is perpendicular (at a right angle) to
     * the current Vector3D and another Vector3D object.
     * 
     * @param a the a
     * @param d the d
     * @return the vector3 d
     */
    public native Vector3D crossProduct(Vector3D a, Vector3D d) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.crossProduct(
				a.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				b.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Decrements the value of the x, y, and z elements of the current Vector3D
     * object by the values of the x, y, and z elements of specified Vector3D
     * object.
     * 
     * @param a the a
     */
    public native void decrementBy(Vector3D v) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.decrementBy(v.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns the distance between two Vector3D objects.
     * 
     * @param a the a
     * @param b the b
     * @return the double
     */
    public static double distance(Vector3D a, Vector3D b) {
        return v._getDistance(a, b);
    }

    private native double _getDistance(Vector3D a, Vector3D b) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.distance(
				a.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				b.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * If the current Vector3D object and the one specified as the parameter are
     * unit vertices, this method returns the cosine of the angle between the
     * two vertices.
     * 
     * @param a the a
     * @return the double
     */
    public native double dotProduct(Vector3D v) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.dotProduct(v.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Determines whether two Vector3D objects are equal by comparing the x, y,
     * and z elements of the current Vector3D object with a specified Vector3D
     * object.
     * 
     * @param toCompare the to compare
     * @return true, if successful
     */
    public native boolean equals(Vector3D toCompare) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.equals(toCompare.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Determines whether two Vector3D objects are equal by comparing the x, y,
     * and z elements of the current Vector3D object with a specified Vector3D
     * object.
     * 
     * @param toCompare the to compare
     * @param allFour the all four
     * @return true, if successful
     */
    public native boolean equals(Vector3D toCompare, boolean allFour) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.equals(
						toComparev.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						allFour);
    }-*/;

    /**
     * Increments the value of the x, y, and z elements of the current Vector3D
     * object by the values of the x, y, and z elements of a specified Vector3D
     * object.
     * 
     * @param a the a
     */
    public native void incrementBy(Vector3D a) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.incrementBy(a);
    }-*/;

    /**
     * Compares the elements of the current Vector3D object with the elements of
     * a specified Vector3D object to determine whether they are nearly equal.
     * 
     * @param toCompare the to compare
     * @param tolerance the tolerance
     * @return true, if successful
     */
    public native boolean nearEquals(Vector3D toCompare, double tolerance) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.nearEquals(
						toCompare.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						tolerance);
    }-*/;

    /**
     * Compares the elements of the current Vector3D object with the elements of
     * a specified Vector3D object to determine whether they are nearly equal.
     * 
     * @param toCompare the to compare
     * @param tolerance the tolerance
     * @param allFour the all four
     * @return true, if successful
     */
    public native boolean nearEquals(Vector3D toCompare, double tolerance, boolean allFour) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.nearEquals(
						toCompare.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						tolerance, allFour);
    }-*/;

    /**
     * Sets the current Vector3D object to its inverse.
     */
    public native void negate() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.negate();
    }-*/;

    /**
     * Converts a Vector3D object to a unit vector by dividing the first three
     * elements (x, y, z) by the length of the vector.
     * 
     * @return the double
     */
    public native double normalize() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.normalize();
    }-*/;

    /**
     * Divides the value of the x, y, and z properties of the current Vector3D
     * object by the value of its w property.
     */
    public native void project() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.project();
    }-*/;

    /**
     * Sets the members of Vector3D to the specified values
     * 
     * @param s the s
     */
    public native void scaleBy(double scale) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.scaleBy(scale);
    }-*/;

    /**
     * Subtracts the value of the x, y, and z elements of the current Vector3D
     * object from the values of the x, y, and z elements of another Vector3D
     * object.
     * 
     * @param a the a
     * @return the vector3 d
     */
    public native Vector3D substract(Vector3D v) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.substract(v.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Vector3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Creates the.
     * 
     * @return the vector3 d
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.Vector3D");
    }

}
