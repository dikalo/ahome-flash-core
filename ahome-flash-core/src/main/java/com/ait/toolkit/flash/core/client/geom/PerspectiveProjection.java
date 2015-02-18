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
 * The PerspectiveProjection class provides an easy way to assign or modify the
 * perspective transformations of a display object and all of its children. For
 * more complex or custom perspective transformations, use the Matrix3D class.
 * While the PerspectiveProjection class provides basic three-dimensional
 * presentation properties, the Matrix3D class provides more detailed control
 * over the three-dimensional presentation of display objects.
 * <p>
 * Projection is a way of representing a three-dimensional object in a
 * two-dimensional space, like a cube projected onto a computer screen.
 * Perspective projection uses a viewing frustum (a rectangular pyramid) to
 * model and project a three-dimensional world and its objects on the screen.
 * The viewing frustum becomes increasingly wider as it moves further from the
 * origin of the viewpoint. The origin of the viewpoint could be a camera or the
 * eyes of an observer facing the screen. The projected perspective produces the
 * illusion of three dimensions with depth and distance, where the objects
 * closer to the screen appear larger than the objects farther from the screen.
 */
public class PerspectiveProjection extends JsObject {

    /**
     * Instantiates a new perspective projection.
     */
    public PerspectiveProjection() {
        jsObj = createNativePeer();
    }

    PerspectiveProjection(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the field of view.Specifies an angle, as a degree between 0 and 180,
     * for the field of view in three dimensions.
     * 
     * @return the field of view
     */
    public native double getFieldOfView() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfieldOfView();
    }-*/;

    /**
     * Sets the field of view.Specifies an angle, as a degree between 0 and 180,
     * for the field of view in three dimensions.
     * 
     * @param value the new field of view
     */
    public native void setFieldOfView(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfieldOfView(value);
    }-*/;

    /**
     * Gets the focal length.The distance between the eye or the viewpoint's
     * origin (0,0,0) and the display object located in the z axis
     * 
     * @return the focal length
     */
    public native double getFocalLength() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfocalLength();
    }-*/;

    /**
     * Sets the focal length.The distance between the eye or the viewpoint's
     * origin (0,0,0) and the display object located in the z axis
     * 
     * @param value the new focal length
     */
    public native void setFocalLength(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfocalLength(value);
    }-*/;

    /**
     * Gets the projection center.A two-dimensional point representing the
     * center of the projection, the vanishing point for the display object.
     * 
     * @return the projection center
     */
    public native Point getProjectionCenter() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.setprojectionCenter();
		return @com.ait.toolkit.flash.core.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the projection center.A two-dimensional point representing the
     * center of the projection, the vanishing point for the display object.
     * 
     * @param value the new projection center
     */
    public native void setProjectionCenter(Point value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setprojectionCenter(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns the underlying Matrix3D object of the display object.
     * 
     * @return the matrix3 d
     */
    public native Matrix3D toMatrix3D() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.toMatrix3D();
		return @com.ait.toolkit.flash.core.client.geom.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.PerspectiveProjection");
    }
}
