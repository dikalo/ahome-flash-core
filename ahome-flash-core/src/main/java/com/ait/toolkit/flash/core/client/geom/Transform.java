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
import com.ait.toolkit.flash.core.client.display.DisplayObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Transform class provides access to color adjustment properties and two-
 * or three-dimensional transformation objects that can be applied to a display
 * object. During the transformation, the color or the orientation and position
 * of a display object is adjusted (offset) from the current values or
 * coordinates to new values or coordinates. The Transform class also collects
 * data about color and two-dimensional matrix transformations that are applied
 * to a display object and all of its parent objects. You can access these
 * combined transformations through the concatenatedColorTransform and
 * concatenatedMatrix properties. To apply color transformations: create a
 * ColorTransform object, set the color adjustments using the object's methods
 * and properties, and then assign the colorTransformation property of the
 * transform property of the display object to the new ColorTransformation
 * object.
 * <p>
 * To apply two-dimensional transformations: create a Matrix object, set the
 * matrix's two-dimensional transformation, and then assign the transform.matrix
 * property of the display object to the new Matrix object.
 * <p>
 * To apply three-dimensional transformations: start with a three-dimensional
 * display object. A three-dimensional display object has a z property value
 * other than zero. You do not need to create the Matrix3D object. For all
 * three-dimensional objects, a Matrix3D object is created automatically when
 * you assign a z value to a display object. You can access the display object's
 * Matrix3D object through the display object's transform property. Using the
 * methods of the Matrix3D class, you can add to or modify the existing
 * transformation settings. Also, you can create a custom Matrix3D object, set
 * the custom Matrix3D object's transformation elements, and then assign the new
 * Matrix3D object to the display object using the transform.matrix property.
 * <p>
 * To modify a perspective projection of the stage or root object: use the
 * transform.matrix property of the root display object to gain access to the
 * PerspectiveProjection object. Or, apply different perspective projection
 * properties to a display object by setting the perspective projection
 * properties of the display object's parent. The child display object inherits
 * the new properties. Specifically, create a PerspectiveProjection object and
 * set its properties, then assign the PerspectiveProjection object to the
 * perspectiveProjection property of the parent display object's transform
 * property. The specified projection transformation then applies to all the
 * display object's three-dimensional children.
 * <p>
 * Since both PerspectiveProjection and Matrix3D objects perform perspective
 * transformations, do not assign both to a display object at the same time. Use
 * the PerspectiveProjection object for focal length and projection center
 * changes. For more control over the perspective transformation, create a
 * perspective projection Matrix3D object.
 */
public class Transform extends JsObject {

    /**
     * Instantiates a new transform.
     */
    private Transform() {

    }

    Transform(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets a ColorTransform object containing values that universally adjust
     * the colors in the display object.
     * 
     * @return the color transform
     */
    public native ColorTransform getColorTransform() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getcolorTransform();
		return @com.ait.toolkit.flash.core.client.geom.ColorTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets a ColorTransform object containing values that universally adjust
     * the colors in the display object.
     * 
     * @param value the new color transform
     */
    public native void setColorTransform(ColorTransform value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setcolorTransform(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the concatenated color transform.
     * 
     * @return the concatenated color transform
     */
    public native ColorTransform getConcatenatedColorTransform() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getconcatenatedColorTransform();
		return @com.ait.toolkit.flash.core.client.geom.ColorTransform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * A Matrix object representing the combined transformation matrixes of the
     * display object and all of its parent objects, back to the root level.
     * 
     * @return the concatenated matrix
     */
    public native Matrix getConcatenatedMatrix() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getconcatenatedMatrix();
		return @com.ait.toolkit.flash.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * A Matrix object containing values that alter the scaling, rotation, and
     * translation of the display object.
     * 
     * @return the matrix
     */
    public native Matrix getMatrix() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getmatrix();
		return @com.ait.toolkit.flash.core.client.geom.Matrix::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * A Matrix object containing values that alter the scaling, rotation, and
     * translation of the display object.
     * 
     * @param value the new matrix
     */
    public native void setMatrix(Matrix value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setmatrix(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Provides access to the Matrix3D object of a three-dimensional display
     * object.
     * 
     * @return the matrix3 d
     */
    public native Matrix3D getMatrix3D() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getmatrix3D();
		return @com.ait.toolkit.flash.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides access to the Matrix3D object of a three-dimensional display
     * object.
     * 
     * @param value the new matrix3 d
     */
    public native void setMatrix3D(Matrix3D value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setmatrix3D(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Provides access to the PerspectiveProjection object of a
     * three-dimensional display object.
     * 
     * @return the perpective projection
     */
    public native PerspectiveProjection getPerpectiveProjection() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getperspectiveProjection();
		return @com.ait.toolkit.flash.core.client.geom.PerspectiveProjection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides access to the PerspectiveProjection object of a
     * three-dimensional display object.
     * 
     * @param value the new perpective projection
     */
    public native void setPerpectiveProjection(PerspectiveProjection value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setperspectiveProjection(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the pixel bounds.
     * 
     * @return the pixel bounds
     */
    public native Rectangle getPixelBounds() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getpixelBounds();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns a Matrix3D object, which can transform the space of a specified
     * display object in relation to the current display object's space.
     * 
     * @param relativeTo the relative to
     * @return the relative matrix3 d
     */
    public native Matrix3D getRelativeMatrix3D(DisplayObject relativeTo) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.getrelativeMatrix3D(relativeTo.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
