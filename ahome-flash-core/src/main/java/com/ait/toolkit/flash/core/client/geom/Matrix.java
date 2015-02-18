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
 * The Matrix class represents a transformation matrix that determines how to
 * map points from one coordinate space to another. You can perform various
 * graphical transformations on a display object by setting the properties of a
 * Matrix object, applying that Matrix object to the matrix property of a
 * Transform object, and then applying that Transform object as the transform
 * property of the display object. These transformation functions include
 * translation (x and y repositioning), rotation, scaling, and skewing.
 */
public class Matrix extends JsObject {

    public Matrix() {
        jsObj = createNativePeer();
        setA(1);
        setB(0);
        setC(0);
        setD(1);
        setTx(0);
        setTy(0);
    }

    protected Matrix(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the a.The value that affects the positioning of pixels along the x
     * axis when scaling or rotating an image.
     * 
     * @return the a
     */
    public native double getA() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geta();
    }-*/;

    /**
     * Sets the a.The value that affects the positioning of pixels along the x
     * axis when scaling or rotating an image.
     * 
     * @param a the new a
     */
    public native void setA(double a) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.seta(a);
    }-*/;

    /**
     * Gets the b.Sets the b.The value that affects the positioning of pixels
     * along the y axis when rotating or skewing an image.
     * 
     * @return the b
     */
    public native double getB() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getb();
    }-*/;

    /**
     * Sets the b.The value that affects the positioning of pixels along the y
     * axis when rotating or skewing an image.
     * 
     * @param b the new b
     */
    public native void setB(double b) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setb(b);
    }-*/;

    /**
     * The value that affects the positioning of pixels along the x axis when
     * rotating or skewing an image.
     * 
     * @return the c
     */
    public native double getC() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getc();
    }-*/;

    /**
     * Sets the c.The value that affects the positioning of pixels along the x
     * axis when rotating or skewing an image.
     * 
     * @param c the new c
     */
    public native void setC(double c) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setc(c);
    }-*/;

    /**
     * Gets the d.The value that affects the positioning of pixels along the y
     * axis when scaling or rotating an image.
     * 
     * @return the d
     */
    public native double getD() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getd();
    }-*/;

    /**
     * Sets the d.The value that affects the positioning of pixels along the y
     * axis when scaling or rotating an image.
     * 
     * @param d the new d
     */
    public native void setD(double d) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setd(d);
    }-*/;

    /**
     * Gets the tx.The distance by which to translate each point along the x
     * axis.
     * 
     * @return the tx
     */
    public native double getTx() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettx();
    }-*/;

    /**
     * Sets the tx.The distance by which to translate each point along the x
     * axis.
     * 
     * @param tx the new tx
     */
    public native void setTx(double tx) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settx(tx);
    }-*/;

    /**
     * Gets the ty.The distance by which to translate each point along the y
     * axis.
     * 
     * @return the ty
     */
    public native double getTy() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getty();
    }-*/;

    /**
     * Sets the ty.The distance by which to translate each point along the y
     * axis.
     * 
     * @param ty the new ty
     */
    public native void setTy(double ty) /*-{
		peer.setty(ty);
    }-*/;

    /**
     * Returns a new Matrix object that is a clone of this matrix, with an exact
     * copy of the contained object.
     */
    public native Matrix clone() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		return @com.ait.toolkit.flash.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Concatenates a matrix with the current matrix, effectively combining the
     * geometric effects of the two.
     * 
     * @param m the m
     */
    public native void concat(Matrix m) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.concat(m.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies a Vector3D object into specific column of the calling Matrix3D
     * object.
     * 
     * @param m the m
     */
    public native void copyColumnFrom(int column, Matrix3D m) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyColumnFrom(m.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies specific column of the calling Matrix object into the Vector3D
     * object.
     * 
     * @param m the m
     */
    public native void copyColumnTo(int column, Matrix3D m) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyColumnTo(m.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies all of the matrix data from the source Point object into the
     * calling Matrix object.
     * 
     * @param m the m
     */
    public native void copyFrom(Matrix m) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyFrom(m.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies a Vector3D object into specific row of the calling Matrix object.
     * 
     * @param m the m
     */
    public native void copyRowFrom(int row, Matrix3D m) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.copyRowFrom(row,
				m.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies specific row of the calling Matrix object into the Vector3D
     * object.
     * 
     * @param m the m
     */
    public native void copyRowTo(int row, Matrix3D m) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.copyRowTo(row,
				m.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Includes parameters for scaling, rotation, and translation.
     * 
     * @param scaleX the scale x
     * @param scaleY the scale y
     */
    public native void createBox(double scaleX, double scaleY) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createBox(scaleX, scaleY);
    }-*/;

    /**
     * Includes parameters for scaling, rotation, and translation.
     * 
     * @param scaleX the scale x
     * @param scaleY the scale y
     * @param rotation the rotation
     */
    public native void createBox(double scaleX, double scaleY, double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createBox(scaleX, scaleY, rotation);
    }-*/;

    /**
     * Includes parameters for scaling, rotation, and translation.
     * 
     * @param scaleX the scale x
     * @param scaleY the scale y
     * @param rotation the rotation
     * @param tx the tx
     * @param ty the ty
     */
    public native void createBox(double scaleX, double scaleY, double rotation, double tx, double ty) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createBox(scaleX, scaleY, rotation, tx, ty);
    }-*/;

    /**
     * Includes parameters for scaling, rotation, and translation.
     * 
     * @param width the width
     * @param height the height
     */
    public native void createGradientBox(double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createGradientBox(width, height);
    }-*/;

    /**
     * Includes parameters for scaling, rotation, and translation.
     * 
     * @param width the width
     * @param height the height
     * @param rotation the rotation
     */
    public native void createGradientBox(double width, double height, double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createGradientBox(width, height, rotation);
    }-*/;

    /**
     * Creates the specific style of matrix expected by the beginGradientFill()
     * and lineGradientStyle() methods of the Graphics class.
     * 
     * @param width the width
     * @param height the height
     * @param rotation the rotation
     * @param tx the tx
     * @param ty the ty
     */
    public native void createGradientBox(double width, double height, double rotation, double tx, double ty) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createGradientBox(width, height, rotation, tx, ty);
    }-*/;

    /**
     * Given a point in the pretransform coordinate space, returns the
     * coordinates of that point after the transformation occurs.
     * 
     * @param point the point
     * @return the point
     */
    public native Point deltaTransformPoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.deltaTransformPoint(point.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets each matrix property to a value that causes a null transformation.
     */
    public native void identity() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.identity();
    }-*/;

    /**
     * Performs the opposite transformation of the original matrix.
     */
    public native void invert() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.invert();
    }-*/;

    /**
     * Applies a rotation transformation to the Matrix object.
     * 
     * @param angle the angle
     */
    public native void rotate(double angle) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.rotate(angle);
    }-*/;

    /**
     * Applies a scaling transformation to the matrix.
     * 
     * @param sx the sx
     * @param sy the sy
     */
    public native void scale(double sx, double sy) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.scale(sx, sy);
    }-*/;

    /**
     * Sets the members of Matrix to the specified values
     */
    public native void setTo(double aa, double ba, double ca, double da, double txa, double tya) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTo(aa, ba, ca, da, txa, tya);
    }-*/;

    /**
     * Returns the result of applying the geometric transformation represented
     * by the Matrix object to the specified point.
     * 
     * 
     * @param point the point
     * @return the point
     */
    public native Point transformPoint(Point point) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.transformPoint(poin.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Translates the matrix along the x and y axes, as specified by the dx and
     * dy parameters.
     * 
     * @param dx the dx
     * @param dy the dy
     */
    public native void translate(double dx, double dy) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.translate(dx, dy);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.Matrix");
    }
}
