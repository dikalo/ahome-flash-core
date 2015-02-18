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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Shader instance represents a Pixel Bender shader kernel in ActionScript. To
 * use a shader in your application, you create a Shader instance for it. You
 * then use that Shader instance in the appropriate way according to the effect
 * you want to create. For example, to use the shader as a filter, you assign
 * the Shader instance to the shader property of a ShaderFilter object. A shader
 * defines a function that executes on all the pixels in an image, one pixel at
 * a time. The result of each call to the function is the output color at that
 * pixel coordinate in the image.
 * <p>
 * A shader can specify one or more input images, which are images whose content
 * can be used in determining the output of the function. A shader can also
 * specify one or more parameters, which are input values that can be used in
 * calculating the function output. In a single shader execution, the input and
 * parameter values are constant. The only thing that varies is the coordinate
 * of the pixel whose color is the function result. Shader function calls for
 * multiple output pixel coordinates execute in parallel to improve shader
 * execution performance.
 */
public class Shader extends JsObject {

    /**
     * Instantiates a new shader.
     */
    public Shader() {
        jsObj = createNativePeer();
    }

    public Shader(ByteArray byteCode) {
        this();
        setByteCode(byteCode);
    }

    Shader(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the byte code.
     * 
     * @param code the new byte code
     */
    public native void setByteCode(ByteArray code) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setbyteCode(code.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public native ShaderData getData() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getdata();
		return @com.ait.toolkit.flash.core.client.display.ShaderData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the data.
     * 
     * @param value the new data
     */
    public native void setData(ShaderData value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setdata(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the precision hint.
     * 
     * @return the precision hint
     */
    public ShaderPrecision getPrecisionHint() {
        return ShaderPrecision.fromValue(_getPrecisionHint());
    }

    /**
     * _get precision hint.
     * 
     * @return the string
     */
    private native String _getPrecisionHint() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getprecisionHint();
    }-*/;

    /**
     * Sets the precision hint.
     * 
     * @param value the new precision hint
     */
    public void setPrecisionHint(ShaderPrecision value) {
        _setPrecisionHint(value.value);
    }

    /**
     * _set precision hint.
     * 
     * @param value the value
     */
    private native void _setPrecisionHint(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setprecisionHint(value);
    }-*/;

    /**
     * New instance.
     * 
     * @return the shader
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Shader");
    }

}
