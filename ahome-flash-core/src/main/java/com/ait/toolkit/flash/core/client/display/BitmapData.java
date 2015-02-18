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
import com.ait.toolkit.flash.core.client.filters.BitmapFilter;
import com.ait.toolkit.flash.core.client.geom.ColorTransform;
import com.ait.toolkit.flash.core.client.geom.Matrix;
import com.ait.toolkit.flash.core.client.geom.Point;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.toplevel.NumberVector;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.core.client.utils.factories.BitmapDataFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BitmapData class lets you work with the data (pixels) of a Bitmap object
 * . You can use the methods of the BitmapData class to create arbitrarily sized
 * transparent or opaque bitmap images and manipulate them in various ways at
 * runtime. You can also access the BitmapData for a bitmap image that you load
 * with the flash.display.Loader class. peer class lets you separate bitmap
 * rendering operations from the internal display updating routines of
 * FlashDetect Player. By manipulating a BitmapData object directly, you can
 * create complex images without incurring the per-frame overhead of constantly
 * redrawing the content from vector data.
 * <p>
 * The methods of the BitmapData class support effects that are not available
 * through the filters available to non-bitmap display objects.
 * <p>
 * A BitmapData object contains an array of pixel data. peer data can represent
 * either a fully opaque bitmap or a transparent bitmap that contains alpha
 * channel data. Either type of BitmapData object is stored as a buffer of
 * 32-bit integers. Each 32-bit integer determines the properties of a single
 * pixel in the bitmap.
 * 
 * <p>
 * Each 32-bit integer is a combination of four 8-bit channel values (from 0 to
 * 255) that describe the alpha transparency and the red, green, and blue (ARGB)
 * values of the pixel. (For ARGB values, the most significant byte represents
 * the alpha channel value, followed by red, green, and blue.)
 */
public class BitmapData extends JsObject implements IBitmapDrawable {

    protected BitmapData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @return the bitmap data
     */
    public BitmapData(int width, int height) {
        jsObj = BitmapDataFactory.get().createBitmapData(width, height);
    };

    /**
     * New instance.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @param transparent
     *            the transparent
     * @return the bitmap data
     */
    public BitmapData(int width, int height, boolean transparent) {
        jsObj = BitmapDataFactory.get().createBitmapData(width, height, transparent);
    }

    /**
     * New instance.
     * 
     * @param width
     *            the width
     * @param height
     *            the height
     * @param transparent
     *            the transparent
     * @param fillColor
     *            the fill color
     * @return the bitmap data
     */
    public BitmapData(int width, int height, boolean transparent, int fillColor) {
        jsObj = BitmapDataFactory.get().createBitmapData(width, height, transparent, fillColor);
    }

    /**
     * Gets the height of the bitmap image in pixels.
     * 
     * @return the height
     */
    public native int getHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Gets the width of the bitmap image in pixels
     * 
     * @return the width
     */
    public native int getWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Gets the rectangle that defines the size and location of the bitmap
     * image.
     * 
     * @return the rect
     */
    public native Rectangle getRect()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getrect();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Defines whether the bitmap image supports per-pixel transparency.
     * 
     * @return true, if is transparent
     */
    public native boolean isTransparent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettransparent();
    }-*/;

    /**
     * Takes a source image and a filter object and generates the filtered
     * image.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param filter
     *            the filter
     */
    public native void applyFilter(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapFilter filter) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.applyFilter(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						filter.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns a new BitmapData object that is a clone of the original instance
     * with an exact copy of the contained bitmap.
     */
    public native BitmapData clone() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.clone();
		return @com.ait.toolkit.flash.core.client.display.BitmapData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Adjusts the color values in a specified area of a bitmap image by using a
     * ColorTransform object.
     * 
     * @param rect
     *            the rect
     * @param colorTransform
     *            the color transform
     */
    public native void colorTransform(Rectangle rect, ColorTransform colorTransform) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.colorTransform(
						rect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Compares two BitmapData objects.
     * 
     * @param <T>
     *            the generic type
     * @param otherBitmapData
     *            the other bitmap data
     * @return the t
     */
    public native <T extends JavaScriptObject> T compare(BitmapData otherBitmapData) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.compare(otherBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Transfers data from one channel of another BitmapData object or the
     * current BitmapData object into a channel of the current BitmapData
     * object.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param sourceChannel
     *            the source channel
     * @param destChannel
     *            the dest channel
     */
    public native void copyChannel(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    int sourceChannel, int destChannel) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyChannel(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceChannel, destChannel);
    }-*/;

    /**
     * Provides a fast routine to perform pixel manipulation between images with
     * no stretching, rotation, or color effects.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     */
    public native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Provides a fast routine to perform pixel manipulation between images with
     * no stretching, rotation, or color effects.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param alphaBitmapData
     *            the alpha bitmap data
     */
    public native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapData alphaBitmapData) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						alphaBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Provides a fast routine to perform pixel manipulation between images with
     * no stretching, rotation, or color effects.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param alphaBitmapData
     *            the alpha bitmap data
     * @param alphaPoint
     *            the alpha point
     */
    public native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapData alphaBitmapData, Point alphaPoint) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						alphaBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						alphaPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * 
     * Provides a fast routine to perform pixel manipulation between images with
     * no stretching, rotation, or color effects.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param alphaBitmapData
     *            the alpha bitmap data
     * @param alphaPoint
     *            the alpha point
     * @param mergeAlpha
     *            the merge alpha
     */
    public native void copyPixels(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint,
                    BitmapData alphaBitmapData, Point alphaPoint, boolean mergeAlpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.copyPixels(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						alphaBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						alphaPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						mergeAlpha);
    }-*/;

    /**
     * Frees memory that is used to store the BitmapData object. Dispose.
     */
    public native void dispose() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.dispose();
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     *            the source
     */
    public void draw(IBitmapDrawable source) {
        _draw(source.asIBitmapDrawable());
    }

    private native void _draw(JavaScriptObject source) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.draw(source);
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     *            the source
     * @param matrix
     *            the matrix
     */
    public void draw(IBitmapDrawable source, Matrix matrix) {
        _draw(source.asIBitmapDrawable(), matrix);
    }

    private native void _draw(JavaScriptObject source, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.draw(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draw.
     * 
     * @param source
     *            the source
     * @param matrix
     *            the matrix
     * @param colorTransform
     *            the color transform
     */
    public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform) {
        _draw(source.asIBitmapDrawable(), matrix, colorTransform);
    }

    private native void _draw(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.draw(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draw.
     * 
     * @param source
     *            the source
     * @param matrix
     *            the matrix
     * @param colorTransform
     *            the color transform
     * @param blendMode
     *            the blend mode
     */
    public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, BlendMode blendMode) {
        _draw(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value);
    }

    private native void _draw(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform, String blendMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.draw(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode);
    }-*/;

    /**
     * Draw.
     * 
     * @param source
     *            the source
     * @param matrix
     *            the matrix
     * @param colorTransform
     *            the color transform
     * @param blendMode
     *            the blend mode
     * @param clipRect
     *            the clip rect
     */
    public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, BlendMode blendMode,
                    Rectangle clipRect) {
        _draw(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value, clipRect);
    }

    private native void _draw(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform, String blendMode,
                    Rectangle clipRect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.draw(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode,
						clipRect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draw.
     * 
     * @param source
     *            the source
     * @param matrix
     *            the matrix
     * @param colorTransform
     *            the color transform
     * @param blendMode
     *            the blend mode
     * @param clipRect
     *            the clip rect
     * @param smoothing
     *            the smoothing
     */
    public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, BlendMode blendMode,
                    Rectangle clipRect, boolean smoothing) {
        _draw(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value, clipRect, smoothing);
    }

    private native void _draw(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform, String blendMode,
                    Rectangle clipRect, boolean smoothing) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.draw(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode,
						clipRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						smoothing);
    }-*/;

    /**
     * Fills a rectangular area of pixels with a specified ARGB color.
     * 
     * @param rect
     *            the rect
     * @param color
     *            the color
     */
    public native void fillRect(Rectangle rect, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.fillRect(
						rect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						color);
    }-*/;

    /**
     * Performs a flood fill operation on an image starting at an (x, y)
     * coordinate and filling with a certain color.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param color
     *            the color
     */
    public native void floodFill(int x, int y, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.floodFill(x, y, color);
    }-*/;

    /**
     * Determines the destination rectangle that the applyFilter() method call
     * affects, given a BitmapData object, a source rectangle, and a filter
     * object.
     * 
     * @param sourceRect
     *            the source rect
     * @param filer
     *            the filer
     * @return the rectangle
     */
    public native Rectangle generateFilterRect(Rectangle sourceRect, BitmapFilter filter) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.generateFilterRect(
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						filter.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the color bounds rect.
     * 
     * @param mask
     *            the mask
     * @param color
     *            the color
     * @return the color bounds rect
     */
    public native Rectangle getColorBoundsRect(int mask, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getColorBoundsRect(mask, color);
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the color bounds rect.
     * 
     * @param mask
     *            the mask
     * @param color
     *            the color
     * @param findColor
     *            the find color
     * @return the color bounds rect
     */
    public native Rectangle getColorBoundsRect(int mask, int color, boolean findColor) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getColorBoundsRect(mask, color, findColor);
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the pixel.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the pixel
     */
    public native int getPixel(int x, int y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getPixel(x, y);
    }-*/;

    /**
     * Gets the pixel32.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the pixel32
     */
    public native int getPixel32(int x, int y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getPixel32(x, y);
    }-*/;

    /**
     * Gets the pixels.
     * 
     * @param rect
     *            the rect
     * @return the pixels
     */
    public native ByteArray getPixels(Rectangle rect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getPixels(rect);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the vector.
     * 
     * @param rect
     *            the rect
     * @return the vector
     */
    public native NumberVector getVector(Rectangle rect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getVector(rect);
		return @com.ait.toolkit.flash.core.client.toplevel.NumberVector::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Histogram.
     * 
     * @return the js array
     */
    public native <T> T histogram() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.histogram();
    }-*/;

    /**
     * Histogram.
     * 
     * @param hRect
     *            the h rect
     * @return the js array
     */
    public native <T> T histogram(Rectangle hRect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.histogram(hRect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Hit test.
     * 
     * @param firstPoint
     *            the first point
     * @param firstAlphaThreshold
     *            the first alpha threshold
     * @param secondObject
     *            the second object
     * @return true, if successful
     */
    public native boolean hitTest(Point firstPoint, int firstAlphaThreshold, JsObject secondObject)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.hitTest(
						firstPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						firstAlphaThreshold,
						secondObject.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Hit test.
     * 
     * @param firstPoint
     *            the first point
     * @param firstAlphaThreshold
     *            the first alpha threshold
     * @param secondObject
     *            the second object
     * @param seconBitMapData
     *            the secon bit map data
     * @return true, if successful
     */
    public native boolean hitTest(Point firstPoint, int firstAlphaThreshold, JsObject secondObject,
                    Point seconBitMapData) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.hitTest(
						firstPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						firstAlphaThreshold,
						secondObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						secondBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Hit test.
     * 
     * @param firstPoint
     *            the first point
     * @param firstAlphaThreshold
     *            the first alpha threshold
     * @param secondObject
     *            the second object
     * @param seconBitMapData
     *            the secon bit map data
     * @param secondAlphaThreshold
     *            the second alpha threshold
     * @return true, if successful
     */
    public native boolean hitTest(Point firstPoint, int firstAlphaThreshold, JsObject secondObject,
                    Point seconBitMapData, int secondAlphaThreshold) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.hitTest(
						firstPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						firstAlphaThreshold,
						secondObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						secondBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						secondAlphaThreshold);
    }-*/;

    /**
     * Locks an image so that any objects that reference the BitmapData object,
     * such as Bitmap objects, are not updated when this BitmapData object
     * changes.
     */
    public native void lock() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lock();
    }-*/;

    /**
     * Merge.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param redMultiplier
     *            the red multiplier
     * @param greenMultiplier
     *            the green multiplier
     * @param blueMultiplier
     *            the blue multiplier
     * @param alphaMultipler
     *            the alpha multipler
     */
    public native void merge(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int redMultiplier,
                    int greenMultiplier, int blueMultiplier, int alphaMultipler) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.merge(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						redMultiplier, greenMultiplier, blueMultiplier,
						alphaMultiplier);
    }-*/;

    /**
     * Fills an image with pixels representing random noise.
     * 
     * @param randomSeed
     *            the random seed
     */
    public native void noise(int randomSeed) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.noise(randomSeed);
    }-*/;

    /**
     * Fills an image with pixels representing random noise.
     * 
     * @param randomSeed
     *            the random seed
     * @param low
     *            the low
     * @param high
     *            the high
     */
    public native void noise(int randomSeed, int low, int high) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.noise(randomSeed, low, high);
    }-*/;

    /**
     * Fills an image with pixels representing random noise.
     * 
     * @param randomSeed
     *            the random seed
     * @param low
     *            the low
     * @param high
     *            the high
     * @param channelOptions
     *            the channel options
     */
    public native void noise(int randomSeed, int low, int high, int channelOptions) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.noise(randomSeed, low, high, channelOptions);
    }-*/;

    /**
     * Noise.
     * 
     * @param randomSeed
     *            the random seed
     * @param low
     *            the low
     * @param high
     *            the high
     * @param channelOptions
     *            the channel options
     * @param grayScale
     *            the gray scale
     */
    public native void noise(int randomSeed, int low, int high, int channelOptions, boolean grayScale) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.noise(randomSeed, low, high, channelOptions, grayScale);
    }-*/;

    /**
     * Palette map.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     */
    public native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Palette map.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param redArray
     *            the red array
     */
    public native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()().redArray);
    }-*/;

    /**
     * Palette map.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param redArray
     *            the red array
     * @param greenArray
     *            the green array
     */
    public native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray,
                    int[] greenArray) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()().redArray,
						greenArray);
    }-*/;

    /**
     * Palette map.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param redArray
     *            the red array
     * @param greenArray
     *            the green array
     * @param blueArray
     *            the blue array
     */
    public native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray,
                    int[] greenArray, int[] blueArray) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()().redArray,
						greenArray, blueArray);
    }-*/;

    /**
     * Palette map.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param redArray
     *            the red array
     * @param greenArray
     *            the green array
     * @param blueArray
     *            the blue array
     * @param alphaArray
     *            the alpha array
     */
    public native void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray,
                    int[] greenArray, int[] blueArray, int[] alphaArray) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.paletteMap(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()().redArray,
						greenArray, blueArray, alphaArray);
    }-*/;

    /**
     * Perlin noise.
     * 
     * @param baseX
     *            the base x
     * @param baseY
     *            the base y
     * @param numOctaves
     *            the num octaves
     * @param randomSeed
     *            the random seed
     * @param stitch
     *            the stitch
     * @param fractalNoise
     *            the fractal noise
     */
    public native void perlinNoise(int baseX, int baseY, int numOctaves, int randomSeed, boolean stitch,
                    boolean fractalNoise) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise);
    }-*/;

    /**
     * Perlin noise.
     * 
     * @param baseX
     *            the base x
     * @param baseY
     *            the base y
     * @param numOctaves
     *            the num octaves
     * @param randomSeed
     *            the random seed
     * @param stitch
     *            the stitch
     * @param fractalNoise
     *            the fractal noise
     * @param channelOptions
     *            the channel options
     */
    public native void perlinNoise(int baseX, int baseY, int numOctaves, int randomSeed, boolean stitch,
                    boolean fractalNoise, int channelOptions) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise, channelOptions);
    }-*/;

    /**
     * Perlin noise.
     * 
     * @param baseX
     *            the base x
     * @param baseY
     *            the base y
     * @param numOctaves
     *            the num octaves
     * @param randomSeed
     *            the random seed
     * @param stitch
     *            the stitch
     * @param fractalNoise
     *            the fractal noise
     * @param channelOptions
     *            the channel options
     * @param grayScale
     *            the gray scale
     */
    public native void perlinNoise(int baseX, int baseY, int numOctaves, int randomSeed, boolean stitch,
                    boolean fractalNoise, int channelOptions, boolean grayScale) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch,
				fractalNoise, channelOptions, grayScale);
    }-*/;

    /**
     * Pixel dissolve.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @return the int
     */
    public native int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Pixel dissolve.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param randomSeed
     *            the random seed
     * @return the int
     */
    public native int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int randomSeed) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						randomSeed);
    }-*/;

    /**
     * Pixel dissolve.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param randomSeed
     *            the random seed
     * @param numPixels
     *            the num pixels
     * @return the int
     */
    public native int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int randomSeed,
                    int numPixels) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						randomSeed, numPixels);
    }-*/;

    /**
     * Pixel dissolve.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param randomSeed
     *            the random seed
     * @param numPixels
     *            the num pixels
     * @param fillColor
     *            the fill color
     * @return the int
     */
    public native int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int randomSeed,
                    int numPixels, int fillColor) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.pixelDissolve(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						randomSeed, numPixels, fillColor);
    }-*/;

    /**
     * Scroll.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public native void scroll(int x, int y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.scroll(x, y);
    }-*/;

    /**
     * Sets the pixel.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param color
     *            the color
     */
    public native void setPixel(int x, int y, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPixel(x, y, color);
    }-*/;

    /**
     * Sets the pixel32.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @param color
     *            the color
     */
    public native void setPixel32(int x, int y, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPixel32(x, y, color);
    }-*/;

    /**
     * Sets the pixels.
     * 
     * @param rect
     *            the rect
     * @param inputByteArray
     *            the input byte array
     */
    public native void setPixels(Rectangle rect, ByteArray inputByteArray) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setPixels(
						rect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						inputByteArray.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Threshold.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param operator
     *            the operator
     * @param threshold
     *            the threshold
     * @return the int
     */
    public native int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operator,
                    byte threshold) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						operator, threshold);
    }-*/;

    /**
     * Threshold.
     * 
     * @param sourceBitmapData
     *            the source bitmap data
     * @param sourceRect
     *            the source rect
     * @param destPoint
     *            the dest point
     * @param operator
     *            the operator
     * @param threshold
     *            the threshold
     * @param color
     *            the color
     * @return the int
     */
    public native int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operator,
                    byte threshold, int color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						operator, threshold, color);
    }-*/;

    public native int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operator,
                    byte threshold, int color, int mask) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						operator, threshold, color, mask);
    }-*/;

    public native int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operator,
                    byte threshold, int color, int mask, boolean copySource) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.threshold(
						sourceBitmapData.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						destPoint.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						operator, threshold, color, mask, copySource);
    }-*/;

    /**
     * Unlock.
     */
    public native void unlock() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.unlock();
    }-*/;

    /**
     * Unlock.
     * 
     * @param changeRect
     *            the change rect
     */
    public native void unlock(Rectangle changeRect) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.unlock(changeRect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source) {
        _drawWithQuality(source.asIBitmapDrawable());
    }

    private native void _drawWithQuality(JavaScriptObject source)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawWithQuality(source);
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source, Matrix matrix) {
        _drawWithQuality(source.asIBitmapDrawable(), matrix);
    }

    private native void _drawWithQuality(JavaScriptObject source, Matrix matrix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawWithQuality(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform) {
        _drawWithQuality(source.asIBitmapDrawable(), matrix, colorTransform);
    }

    private native void _drawWithQuality(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawWithQuality(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode) {
        _drawWithQuality(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value);
    }

    private native void _drawWithQuality(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawWithQuality(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode);
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode, Rectangle clipRect) {
        _drawWithQuality(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value, clipRect);
    }

    private native void _drawWithQuality(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawWithQuality(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode,
						clipRect.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode, Rectangle clipRect, boolean smoothing) {
        _drawWithQuality(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value, clipRect, smoothing);
    }

    private native void _drawWithQuality(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect, boolean smoothing)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawWithQuality(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode,
						clipRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						smoothing);
    }-*/;

    /**
     * Draws the source display object onto the bitmap image, using the
     * FlashDetect runtime vector renderer.
     * 
     * @param source
     */
    public void drawWithQuality(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform,
                    BlendMode blendMode, Rectangle clipRect, boolean smoothing, StageQuality quality) {
        _drawWithQuality(source.asIBitmapDrawable(), matrix, colorTransform, blendMode.value, clipRect, smoothing,
                        quality.value);
    }

    private native void _drawWithQuality(JavaScriptObject source, Matrix matrix, ColorTransform colorTransform,
                    String blendMode, Rectangle clipRect, boolean smoothing, String quality)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawWithQuality(
						source,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorTransform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						blendMode,
						clipRect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						smoothing, quality);
    }-*/;

    /**
     * Compresses this BitmapData object using the selected compressor algorithm
     * and returns a new ByteArray object.
     * 
     * @param rect
     * @param compressor
     * @return
     */
    public native ByteArray encode(Rectangle rect, BitmapEncoderOptions compressor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.encode(
						rect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						compressor.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Compresses this BitmapData object using the selected compressor algorithm
     * and returns a new ByteArray object.
     * 
     * @param rect
     * @param compressor
     * @param byteArray
     * @return
     */
    public native ByteArray encode(Rectangle rect, BitmapEncoderOptions compressor, ByteArray byteArray)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer
				.encode(
						rect.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						compressor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						byteArray.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * As i bitmap drawable.
     * 
     * @return the i bitmap drawable
     */
    public JavaScriptObject asIBitmapDrawable() {
        return this.getJsObj().cast();
    }
}
