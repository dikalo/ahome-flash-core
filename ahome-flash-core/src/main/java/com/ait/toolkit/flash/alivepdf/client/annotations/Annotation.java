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

package com.ait.toolkit.flash.alivepdf.client.annotations;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;

/**
 * The Class Annotation.
 */
public class Annotation extends JsObject {

	protected Annotation() {

	}

	/**
	 * New instance.
	 * 
	 * @param type
	 *            the type
	 * @param text
	 *            the text
	 * @return the annotation
	 */
	public Annotation(AnnotationType type, String text) {
		jsObj = AlivePdfFactory.INSTANCE.createAnnotation(type.value, text);
	}

	/**
	 * New instance.
	 * 
	 * @param type
	 *            the type
	 * @param text
	 *            the text
	 * @param x
	 *            the x
	 * @return the annotation
	 */
	public Annotation(AnnotationType type, String text, double x) {
		jsObj = AlivePdfFactory.INSTANCE.createAnnotation(type.value, text, x);
	}

	/**
	 * New instance.
	 * 
	 * @param type
	 *            the type
	 * @param text
	 *            the text
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @return the annotation
	 */
	public Annotation(AnnotationType type, String text, double x, double y) {
		jsObj = AlivePdfFactory.INSTANCE.createAnnotation(type.value, text, x,
				y);
	}

	/**
	 * New instance.
	 * 
	 * @param type
	 *            the type
	 * @param text
	 *            the text
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @return the annotation
	 */
	public Annotation(AnnotationType type, String text, double x, double y,
			double width) {
		jsObj = AlivePdfFactory.INSTANCE.createAnnotation(type.value, text, x,
				y, width);
	}

	/**
	 * New instance.
	 * 
	 * @param type
	 *            the type
	 * @param text
	 *            the text
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @return the annotation
	 */
	public Annotation(AnnotationType type, String text, double x, double y,
			double width, double height) {
		jsObj = AlivePdfFactory.INSTANCE.createAnnotation(type.value, text, x,
				y, width, height);
	}

	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public native String getText()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettext();
	}-*/;

	/**
	 * Sets the text.
	 * 
	 * @param value
	 *            the new text
	 */
	public native void setText(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settext(value);
	}-*/;

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public native int getWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
	}-*/;

	/**
	 * Sets the width.
	 * 
	 * @param value
	 *            the new width
	 */
	public native void setWidth(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setwidth(value);
	}-*/;

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public native int getHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
	}-*/;

	/**
	 * Sets the height.
	 * 
	 * @param value
	 *            the new height
	 */
	public native void setHeight(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setheight(value);
	}-*/;

	/**
	 * Gets the x.
	 * 
	 * @return the x
	 */
	public native int getX()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getx();
	}-*/;

	/**
	 * Sets the x.
	 * 
	 * @param value
	 *            the new x
	 */
	public native void setX(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setx(value);
	}-*/;

	/**
	 * Gets the y.
	 * 
	 * @return the y
	 */
	public native int getY()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
	}-*/;

	/**
	 * Sets the y.
	 * 
	 * @param value
	 *            the new y
	 */
	public native void setY(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(value);
	}-*/;

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public AnnotationType getType() {
		return AnnotationType.fromValue(_getType());
	}

	/**
	 * _get type.
	 * 
	 * @return the string
	 */
	private native String _getType()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettype();
	}-*/;

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(AnnotationType type) {
		setType(type.value);
	}

	/**
	 * Sets the type.
	 * 
	 * @param value
	 *            the new type
	 */
	private native void setType(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settype(value);
	}-*/;

}
