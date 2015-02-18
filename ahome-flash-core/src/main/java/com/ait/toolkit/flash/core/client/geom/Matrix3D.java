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
 * The Matrix3D class represents a transformation matrix that determines the
 * position and orientation of a three-dimensional (3D) display object. The
 * matrix can perform transformation functions including translation
 * (repositioning along the x, y, and z axes), rotation, and scaling (resizing).
 * The Matrix3D class can also perform perspective projection, which maps points
 * from the 3D coordinate space to a two-dimensional (2D) view.
 * <p>
 * A single matrix can combine multiple transformations and apply them at once
 * to a 3D display object. For example, a matrix can be applied to 3D
 * coordinates to perform a rotation followed by a translation.
 * <p>
 * When you explicitly set the z property or any of the rotation or scaling
 * properties of a display object, a corresponding Matrix3D object is
 * automatically created.
 * 
 * You can access a 3D display object's Matrix3D object through the
 * transform.matrix3d property. 2D objects do not have a Matrix3D object.
 * <p>
 * The value of the z property of a 2D object is zero and the value of its
 * matrix3D property is null.
 * <p>
 * <b>Note:</b> If the same Matrix3D object is assigned to two different display
 * objects, a runtime error is thrown.
 */

// TODO finish this
public class Matrix3D extends JsObject {

    /**
     * Instantiates a new matrix3 d.
     */
    public Matrix3D() {
        jsObj = createNativePeer();
    }

    Matrix3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates the.
     * 
     * @return the matrix3 d
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.geom.Matrix3D");
    }

    /**
     * Gets the a.
     * 
     * @return the a
     */
    public native double getA() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geta();
    }-*/;

}
