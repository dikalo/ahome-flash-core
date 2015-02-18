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

/**
 * The Enum Orientation3D.
 */
public enum Orientation3D {

    /** The AXI s_ angle. */
    AXIS_ANGLE("axisAngle"),

    /** The EULE r_ angles. */
    EULER_ANGLES("eulerAngles"),

    /** The QUATERNION. */
    QUATERNION("quaternion");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new orientation3 d.
     * 
     * @param reference the reference
     */
    private Orientation3D(String reference) {
        value = reference;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the orientation3 d
     */
    public static native Orientation3D fromValue(String value) /*-{
		switch (value) {

		case 'axisAngle':
			return @com.ait.toolkit.flash.core.client.geom.Orientation3D::AXIS_ANGLE;

		case 'eulerAngles':
			return @com.ait.toolkit.flash.core.client.geom.Orientation3D::EULER_ANGLES

		case 'quaternion':
			return @com.ait.toolkit.flash.core.client.geom.Orientation3D::QUATERNION;

		}
    }-*/;

}
