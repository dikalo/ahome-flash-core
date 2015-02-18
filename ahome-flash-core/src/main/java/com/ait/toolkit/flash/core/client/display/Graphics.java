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
import com.ait.toolkit.flash.core.client.geom.Matrix;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * The Graphics class contains a set of methods that you can use to create a
 * vector shape. Display objects that support drawing include Sprite and Shape
 * objects. Each of these classes includes a graphics property that is a
 * Graphics object. The following are among those helper functions provided for
 * ease of use: drawRect(), drawRoundRect(), drawCircle(), and drawEllipse().
 * <p>
 * You cannot create a Graphics object directly from ActionScript code. If you
 * call new Graphics(), an exception is thrown.
 * <p>
 * The Graphics class is final; it cannot be subclassed.
 */
public final class Graphics extends JsObject {

    /**
     * Instantiates a new graphics.
     */
    private Graphics() {
        jsObj = createNativePeer();
    }

    private Graphics(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the graphics
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.display.Graphics");
    }

    /**
     * Fills a drawing area with a bitmap image.
     * 
     * @param bitmap
     *            the bitmap
     */
    public native void beginBitmapFill(BitmapData bitmap) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginBitmapFill(bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Fills a drawing area with a bitmap image.
     * 
     * @param bitmap
     *            the bitmap
     * @param matrix
     *            the matrix
     */
    public native void beginBitmapFill(BitmapData bitmap, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginBitmapFill(
						bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Fills a drawing area with a bitmap image.
     * 
     * @param bitmap
     *            the bitmap
     * @param matrix
     *            the matrix
     * @param repeat
     *            the repeat
     */
    public native void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginBitmapFill(
						bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						repeat);
    }-*/;

    /**
     * Begin bitmap fill.
     * 
     * @param bitmap
     *            the bitmap
     * @param matrix
     *            the matrix
     * @param repeat
     *            the repeat
     * @param smooth
     *            the smooth
     */
    public native void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginBitmapFill(
						bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						repeat, smooth);
    }-*/;

    /**
     * Begin fill.
     * 
     * @param color
     *            the color
     */
    public native void beginFill(int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.beginFill(color);
    }-*/;

    /**
     * Begin fill.
     * 
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     */
    public native void beginFill(int color, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.beginFill(color, alpha);
    }-*/;

    /**
     * Begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     */
    public native void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.beginGradienFill(type, colors, alphas, ratios);
    }-*/;

    /**
     * Begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     */
    public native void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginGradienFill(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     */
    public void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod) {
        _beginGradienFill(type, colors, alphas, ratios, matrix, spreadMethod.value);
    }

    /**
     * _begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     */
    private native void _beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginGradienFill(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						spreadMethod);
    }-*/;

    /**
     * Begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     */
    public void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod, InterpolationMethod interpolationMethod) {
        _beginGradienFill(type, colors, alphas, ratios, matrix, spreadMethod.value, interpolationMethod.value);
    }

    /**
     * _begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     */
    private native void _beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod, String interpolationMethod) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginGradienFill(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						spreadMethod, interpolationMethod);
    }-*/;

    /**
     * Begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     * @param focalPointRatio
     *            the focal point ratio
     */
    public void beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod, InterpolationMethod interpolationMethod,
                    double focalPointRatio) {
        _beginGradienFill(type, colors, alphas, ratios, matrix, spreadMethod.value, interpolationMethod.value,
                        focalPointRatio);
    }

    /**
     * _begin gradien fill.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     * @param focalPointRatio
     *            the focal point ratio
     */
    private native void _beginGradienFill(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod, String interpolationMethod,
                    double focalPointRatio) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginGradienFill(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						spreadMethod, interpolationMethod, focalPointRatio);
    }-*/;

    /**
     * Begin shader fill.
     * 
     * @param shader
     *            the shader
     */
    public native void beginShaderFill(Shader shader) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginShaderFill(shader.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Begin shader fill.
     * 
     * @param shader
     *            the shader
     * @param matrix
     *            the matrix
     */
    public native void beginShaderFill(Shader shader, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginShaderFill(
						shader,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Clear.
     */
    public native void clear() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Copy from.
     * 
     * @param sourceGraphics
     *            the source graphics
     */
    public native void copyFrom(Graphics sourceGraphics) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyFrom(sourceGraphicsv.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Curve to.
     * 
     * @param controlX
     *            the control x
     * @param controlY
     *            the control y
     * @param anchorX
     *            the anchor x
     * @param anchorY
     *            the anchor y
     */
    public native void curveTo(double controlX, double controlY, double anchorX, double anchorY) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.curveTo(controlX, controlY, anchorX, anchorY);
    }-*/;

    /**
     * Draw circle.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param radius
     *            the radius
     */
    public native void drawCircle(double x, double y, double radius) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawCircle(x, y, radius);
    }-*/;

    /**
     * Draw ellipse.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public native void drawEllipse(double x, double y, double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawEllipse(x, y, width, height);
    }-*/;

    /**
     * Draw rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public native void drawRect(double x, double y, double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawRect(x, y, width, height);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param width
     *            the width
     * @param height
     *            the height
     * @param ellipseWidth
     *            the ellipse width
     */
    public native void drawRoundRect(double x, double y, double width, double height, double ellipseWidth) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawRect(x, y, width, height, ellipseWidth);
    }-*/;

    /**
     * Draw round rect.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param width
     *            the width
     * @param height
     *            the height
     * @param ellipseWidth
     *            the ellipse width
     * @param ellipseHeight
     *            the ellipse height
     */
    public native void drawRoundRect(double x, double y, double width, double height, double ellipseWidth,
                    double ellipseHeight) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawRoundRect(x, y, width, height, ellipseWidth, ellipseHeight);
    }-*/;

    /**
     * Draw round rect complex.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param width
     *            the width
     * @param height
     *            the height
     * @param topLeftRadius
     *            the top left radius
     * @param topRightRadius
     *            the top right radius
     * @param bottomLeftRadius
     *            the bottom left radius
     * @param bottomRightRadius
     *            the bottom right radius
     */
    public native void drawRoundRectComplex(double x, double y, double width, double height, double topLeftRadius,
                    double topRightRadius, double bottomLeftRadius, double bottomRightRadius) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawRoundRectComplex(x, y, width, height, topLeftRadius,
				topRightRadius, bottomLeftRadius, bottomRightRadius);
    }-*/;

    /**
     * Draw triangles.
     * 
     * @param commands
     *            the commands
     * @param data
     *            the data
     */
    private native void drawTriangles(JsArrayNumber commands, JsArrayInteger data) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawTriangles(commands, data);
    }-*/;

    /**
     * Draw triangles.
     * 
     * @param commands
     *            the commands
     * @param data
     *            the data
     * @param uvtData
     *            the uvt data
     */
    private native void drawTriangles(JsArrayNumber commands, JsArrayInteger data, JsArrayNumber uvtData) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawTriangles(commands, data, uvtData);
    }-*/;

    /**
     * Draw triangles.
     * 
     * @param commands
     *            the commands
     * @param data
     *            the data
     * @param uvtData
     *            the uvt data
     * @param culling
     *            the culling
     */
    private native void drawTriangles(JsArrayNumber commands, JsArrayInteger data, JsArrayNumber uvtData, String culling) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawTriangles(commands, data, uvtData);
    }-*/;

    /**
     * End fill.
     */
    public native void endFill() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.endFill();
    }-*/;

    /**
     * Line bitmap style.
     * 
     * @param bitmap
     *            the bitmap
     */
    public native void lineBitmapStyle(BitmapData bitmap) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineBitmapStyle(bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Line bitmap style.
     * 
     * @param bitmap
     *            the bitmap
     * @param matrix
     *            the matrix
     */
    public native void lineBitmapStyle(BitmapData bitmap, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineBitmapStyle(
						bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Line bitmap style.
     * 
     * @param bitmap
     *            the bitmap
     * @param matrix
     *            the matrix
     * @param repeat
     *            the repeat
     */
    public native void lineBitmapStyle(BitmapData bitmap, Matrix matrix, boolean repeat) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineBitmapStyle(
						bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						repeat);
    }-*/;

    /**
     * Line bitmap style.
     * 
     * @param bitmap
     *            the bitmap
     * @param matrix
     *            the matrix
     * @param repeat
     *            the repeat
     * @param smooth
     *            the smooth
     */
    public native void lineBitmapStyle(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineBitmapStyle(
						bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						repeat, smooth);
    }-*/;

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     */
    public native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineGradienStyle(type, colors, alphas, ratios);
    }-*/;

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     */
    public native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineGradienStyle(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     */
    public void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod) {
        this.lineGradienStyle(type, colors, alphas, ratios, matrix, spreadMethod.value);
    }

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     */
    private native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineGradienStyle(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						spreadMethod);
    }-*/;

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     */
    public void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod, InterpolationMethod interpolationMethod) {
        this.lineGradienStyle(type, colors, alphas, ratios, matrix, spreadMethod.value, interpolationMethod.value);
    }

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     */
    private native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod, String interpolationMethod) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineGradienStyle(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						spreadMethod, interpolationMethod);
    }-*/;

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     * @param focalPointRatio
     *            the focal point ratio
     */
    public void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas, JsArrayInteger ratios,
                    Matrix matrix, SpreadMethod spreadMethod, InterpolationMethod interpolationMethod,
                    double focalPointRatio) {
        this.lineGradienStyle(type, colors, alphas, ratios, matrix, spreadMethod.value, interpolationMethod.value,
                        focalPointRatio);
    }

    /**
     * Line gradien style.
     * 
     * @param type
     *            the type
     * @param colors
     *            the colors
     * @param alphas
     *            the alphas
     * @param ratios
     *            the ratios
     * @param matrix
     *            the matrix
     * @param spreadMethod
     *            the spread method
     * @param interpolationMethod
     *            the interpolation method
     * @param focalPointRatio
     *            the focal point ratio
     */
    private native void lineGradienStyle(String type, JsArrayString colors, JsArrayInteger alphas,
                    JsArrayInteger ratios, Matrix matrix, String spreadMethod, String interpolationMethod,
                    double focalPointRatio) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineGradienStyle(
						type,
						colors,
						alphas,
						ratios,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						spreadMethod, interpolationMethod, focalPointRatio);
    }-*/;

    /**
     * Line shader style.
     * 
     * @param shader
     *            the shader
     */
    public native void lineShaderStyle(Shader shader) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineShaderStyle(shader.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Line shader style.
     * 
     * @param shader
     *            the shader
     * @param matrix
     *            the matrix
     */
    public native void lineShaderStyle(Shader shader, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineShaderStyle(
						shader.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Line style.
     */
    public native void lineStyle() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle();
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     */
    public native void lineStyle(double thickness) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     */
    public native void lineStyle(double thickness, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     */
    public native void lineStyle(double thickness, int color, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     */
    public native void lineStyle(double thickness, int color, double alpha, boolean pixelHinting) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     */
    public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, LineScaleMode scaleMode) {
        _lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value);
    }

    /**
     * _line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     */
    private native void _lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     * @param caps
     *            the caps
     */
    public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, LineScaleMode scaleMode,
                    CapsStyle caps) {
        _lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value, caps.value);
    }

    /**
     * _line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     * @param caps
     *            the caps
     */
    private native void _lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode,
                    String caps) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     * @param caps
     *            the caps
     * @param joints
     *            the joints
     */
    public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, LineScaleMode scaleMode,
                    CapsStyle caps, JointStyle joints) {
        _lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value, caps.value, joints.value);
    }

    /**
     * _line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     * @param caps
     *            the caps
     * @param joints
     *            the joints
     */
    private native void _lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode,
                    String caps, String joints) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps,
				joints);
    }-*/;

    /**
     * Line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     * @param caps
     *            the caps
     * @param joints
     *            the joints
     * @param miterLimit
     *            the miter limit
     */
    public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, LineScaleMode scaleMode,
                    CapsStyle caps, JointStyle joints, double miterLimit) {
        _lineStyle(thickness, color, alpha, pixelHinting, scaleMode.value, caps.value, joints.value, miterLimit);
    }

    /**
     * _line style.
     * 
     * @param thickness
     *            the thickness
     * @param color
     *            the color
     * @param alpha
     *            the alpha
     * @param pixelHinting
     *            the pixel hinting
     * @param scaleMode
     *            the scale mode
     * @param caps
     *            the caps
     * @param joints
     *            the joints
     * @param miterLimit
     *            the miter limit
     */
    private native void _lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode,
                    String caps, String joints, double miterLimit) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps,
				joints, miterLimit);
    }-*/;

    /**
     * Line to.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void lineTo(double x, double y) /*-{
		peer.lineTo(x, y);
    }-*/;

    /**
     * Move to.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void moveTo(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.moveTo(x, y);
    }-*/;

}
