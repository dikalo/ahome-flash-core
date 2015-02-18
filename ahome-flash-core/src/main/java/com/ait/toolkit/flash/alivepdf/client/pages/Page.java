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

package com.ait.toolkit.flash.alivepdf.client.pages;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;
import com.ait.toolkit.flash.alivepdf.client.layout.Orientation;
import com.ait.toolkit.flash.alivepdf.client.layout.Size;
import com.ait.toolkit.flash.alivepdf.client.layout.Unit;
import com.ait.toolkit.flash.alivepdf.client.transitions.Dimension;
import com.ait.toolkit.flash.alivepdf.client.transitions.MotionDirection;
import com.ait.toolkit.flash.alivepdf.client.transitions.Transition;
import com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Page.
 */
public class Page extends JsObject {

    /**
     * Instantiates a new page.
     */
    public Page(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @param orientation the orientation
     * @return the page
     */
    public Page(Orientation orientation) {
        jsObj = AlivePdfFactory.INSTANCE.createPage(orientation.value);
    }

    /**
     * New instance.
     * 
     * @param orientation the orientation
     * @param unit the unit
     * @return the page
     */
    public Page(Orientation orientation, Unit unit) {
        this(orientation);
        setUnit(unit);
    }

    /**
     * New instance.
     * 
     * @param orientation the orientation
     * @param unit the unit
     * @param size the size
     * @return the page
     */
    public Page(Orientation orientation, Unit unit, Size size) {
        this(orientation, unit);
        setSize(size);
    }

    /**
     * New instance.
     * 
     * @param orientation the orientation
     * @param unit the unit
     * @param size the size
     * @param Rotation the rotation
     * @return the page
     */
    public Page(Orientation orientation, Unit unit, Size size, double rotation) {
        this(orientation, unit, size);
        setRotation(rotation);
    }

    /**
     * Gets the advance timing.
     * 
     * @return the advance timing
     */
    public native int getAdvanceTiming()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getadvanceTiming();
    }-*/;

    /**
     * Sets the advance timing.
     * 
     * @param newValue the new advance timing
     */
    public native void setAdvanceTiming(int newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setadvanceTiming(newValue);
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    public native Page clonePage() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.clone();
    }-*/;

    /**
     * Gets the orientation.
     * 
     * @return the orientation
     */
    public Orientation getOrientation() {
        return Orientation.fromValue(_getOrientation());
    }

    /**
     * _get orientation.
     * 
     * @return the string
     */
    private native String _getOrientation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getOrientation();
    }-*/;

    /**
     * Sets the unit.
     * 
     * @param unit the new unit
     */
    public void setUnit(Unit unit) {
        _setUnit(unit.value);
    }

    /**
     * _set unit.
     * 
     * @param unit the unit
     */
    private native void _setUnit(String unit) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnit(unit);
    }-*/;

    /**
     * Rotate.
     * 
     * @param rotation the rotation
     */
    public native void rotate(double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.rotate(rotation);
    }-*/;

    /**
     * Resize.
     * 
     * @param width the width
     * @param height the height
     * @param rotation the rotation
     */
    public native void resize(double width, double height, double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resize(width, height, rotation);
    }-*/;

    /**
     * Adds the transition.
     * 
     * @param transition the transition
     */
    public void addTransition(Transition transition) {
        _addTransition(transition.value);
    }

    /**
     * _add transition.
     * 
     * @param style the style
     */
    private native void _addTransition(String style) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addTransition(style);
    }-*/;

    /**
     * Adds the transition.
     * 
     * @param transition the transition
     * @param duration the duration
     */
    public void addTransition(Transition transition, double duration) {
        _addTransition(transition.value, duration);
    }

    /**
     * _add transition.
     * 
     * @param style the style
     * @param duration the duration
     */
    private native void _addTransition(String style, double duration) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addTransition(style, duration);
    }-*/;

    /**
     * Adds the transition.
     * 
     * @param transition the transition
     * @param duration the duration
     * @param dimension the dimension
     */
    public void addTransition(Transition transition, double duration, Dimension dimension) {
        _addTransition(transition.value, duration, dimension.value);
    }

    /**
     * _add transition.
     * 
     * @param style the style
     * @param duration the duration
     * @param dimension the dimension
     */
    private native void _addTransition(String style, double duration, String dimension) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addTransition(style, duration, dimension);
    }-*/;

    /**
     * Adds the transition.
     * 
     * @param transition the transition
     * @param duration the duration
     * @param dimension the dimension
     * @param motionDirection the motion direction
     */
    public void addTransition(Transition transition, double duration, Dimension dimension,
                    MotionDirection motionDirection) {
        _addTransition(transition.value, duration, dimension.value, motionDirection.value);
    }

    /**
     * _add transition.
     * 
     * @param style the style
     * @param duration the duration
     * @param dimension the dimension
     * @param motionDirection the motion direction
     */
    private native void _addTransition(String style, double duration, String dimension, String motionDirection) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addTransition(style, duration, dimension, motionDirection);
    }-*/;

    /**
     * Adds the transition.
     * 
     * @param transition the transition
     * @param duration the duration
     * @param dimension the dimension
     * @param motionDirection the motion direction
     * @param transitionDirection the transition direction
     */
    public void addTransition(Transition transition, double duration, Dimension dimension,
                    MotionDirection motionDirection, TransitionDirection transitionDirection) {
        _addTransition(transition.value, duration, dimension.value, motionDirection.value, transitionDirection.value);
    }

    /**
     * _add transition.
     * 
     * @param style the style
     * @param duration the duration
     * @param dimension the dimension
     * @param motionDirection the motion direction
     * @param transitionDirection the transition direction
     */
    private native void _addTransition(String style, double duration, String dimension, String motionDirection,
                    int transitionDirection) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addTransition(style, duration, dimension, motionDirection,
				transitionDirection);
    }-*/;

    /**
     * Sets the width.
     * 
     * @param newValue the new width
     */
    public native void setWidth(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setwidth(newValue);
    }-*/;

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public native double getWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwidth();
    }-*/;

    /**
     * Sets the height.
     * 
     * @param newValue the new height
     */
    public native void setHeight(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setheight(newValue);
    }-*/;

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public native double getHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    /**
     * Sets the w pt.
     * 
     * @param newValue the new w pt
     */
    public native void setWPt(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setwPt(newValue);
    }-*/;

    /**
     * Gets the w pt.
     * 
     * @return the w pt
     */
    public native double getWPt()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwPt();
    }-*/;

    /**
     * Sets the h pt.
     * 
     * @param value the new h pt
     */
    public native void setHPt(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sethPt();
    }-*/;

    /**
     * Gets the h pt.
     * 
     * @return the h pt
     */
    public native double getHPt()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gethPt();
    }-*/;

    /**
     * Sets the w.
     * 
     * @param newValue the new w
     */
    public native void setW(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setw(newValue);
    }-*/;

    /**
     * Gets the w.
     * 
     * @return the w
     */
    public native double getW()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getw();
    }-*/;

    /**
     * Sets the h.
     * 
     * @param newValue the new h
     */
    public native void setH(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.seth(newValue);
    }-*/;

    /**
     * Gets the h.
     * 
     * @return the h
     */
    public native double getH()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geth();
    }-*/;

    /**
     * Sets the size.
     * 
     * @param newValue the new size
     */
    public native void setSize(Size newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsize(newValue.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the size.
     * 
     * @return the size
     */
    public native Size getSize()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getsize();
		return @com.ait.toolkit.flash.alivepdf.client.layout.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the rotation.
     * 
     * @param newValue the new rotation
     */
    public native void setRotation(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrotation(newValue);
    }-*/;

    /**
     * Gets the rotation.
     * 
     * @return the rotation
     */
    public native double getRotation()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrotation();
    }-*/;

    /**
     * Sets the number.
     * 
     * @param newValue the new number
     */
    public native void setNumber(int newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setnumber(newValue);
    }-*/;

    /**
     * Gets the number.
     * 
     * @return the number
     */
    public native Size getNumber()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnumber();
    }-*/;

    /**
     * Sets the content.
     * 
     * @param newValue the new content
     */
    public native void setContent(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcontent(newValue);
    }-*/;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public native String getContent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcontent();
    }-*/;

    /**
     * Sets the transitions.
     * 
     * @param transition the new transitions
     */
    public void setTransitions(Transition transition) {
        _setTransitions(transition.value);
    }

    /**
     * _set transitions.
     * 
     * @param newValue the new value
     */
    private native void _setTransitions(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settransitions(newValue);
    }-*/;

    /**
     * Gets the transitions.
     * 
     * @return the transitions
     */
    public Transition getTransitions() {
        return Transition.fromValue(_getTransitions());
    }

    /**
     * _get transitions.
     * 
     * @return the string
     */
    private native String _getTransitions()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettransitions();
    }-*/;

    /**
     * Sets the annotations.
     * 
     * @param newValue the new annotations
     */
    public native void setAnnotations(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setannotations(newValue);
    }-*/;

    /**
     * Gets the annotations.
     * 
     * @return the annotations
     */
    public native String getAnnotations()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getannotations();
    }-*/;

    /**
     * Sets the orientation.
     * 
     * @param orientatrion the new orientation
     */
    private void setOrientation(Orientation orientatrion) {
        _setOrientation(orientatrion.value);
    }

    /**
     * _set orientation.
     * 
     * @param value the value
     */
    private native void _setOrientation(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setorientation(value);
    }-*/;

}
