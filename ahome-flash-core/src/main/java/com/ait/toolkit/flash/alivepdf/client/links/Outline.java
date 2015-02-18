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

package com.ait.toolkit.flash.alivepdf.client.links;

import com.ait.toolkit.flash.alivepdf.client.core.AlivePdfFactory;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class Outline.
 */
public class Outline extends JsObject {

    /**
     * Instantiates a new outline.
     */
    Outline(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the outline
     */
    public Outline() {
        jsObj = Bridge.createObject("org.alivepdf.links.Outline");
    }

    /**
     * New instance.
     * 
     * @param text the text
     * @param level the level
     * @param pages the pages
     * @param y the y
     * @param redMultiplier the red multiplier
     * @param greenMultiplier the green multiplier
     * @param blueMultiplier the blue multiplier
     * @return the outline
     */
    public Outline(String text, int level, int pages, double y, double redMultiplier, double greenMultiplier,
                    double blueMultiplier) {
        jsObj = AlivePdfFactory.INSTANCE.createOutline(text, level, pages, y, redMultiplier, greenMultiplier,
                        blueMultiplier);

    }

    /**
     * Gets the pages.
     * 
     * @return the pages
     */
    public final native int getPages()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpages();
    }-*/;

    /**
     * Sets the pages.
     * 
     * @param newValue the new pages
     */
    public final native void setPages(int newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpages(newValue);
    }-*/;

    /**
     * Gets the y.
     * 
     * @return the y
     */
    public final native int getY()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gety();
    }-*/;

    /**
     * Sets the y.
     * 
     * @param newValue the new y
     */
    public final native void setY(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sety(newValue);
    }-*/;

    /**
     * Gets the parent.
     * 
     * @return the parent
     */
    public final native String getParent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getparent();
    }-*/;

    /**
     * Sets the parent.
     * 
     * @param newValue the new parent
     */
    public final native void setParent(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setparent(newValue);
    }-*/;

    /**
     * Gets the level.
     * 
     * @return the level
     */
    public final native int getLevel()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlevel();
    }-*/;

    /**
     * Sets the level.
     * 
     * @param newValue the new level
     */
    public final native void setLevel(int newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlevel(newValue);
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public final native String getText()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param newValue the new text
     */
    public final native void setText(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settext(newValue);
    }-*/;

    /**
     * Gets the next.
     * 
     * @return the next
     */
    public final native String getNext()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnext();
    }-*/;

    /**
     * Sets the next.
     * 
     * @param newValue the new next
     */
    public final native void setNext(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setnext(newValue);
    }-*/;

    /**
     * Gets the first.
     * 
     * @return the first
     */
    public final native String getFirst()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfirst();
    }-*/;

    /**
     * Sets the first.
     * 
     * @param newValue the new first
     */
    public final native void setFirst(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfirst(newValue);
    }-*/;

    /**
     * Gets the prev.
     * 
     * @return the prev
     */
    public final native String getPrev()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getprev();
    }-*/;

    /**
     * Sets the prev.
     * 
     * @param newValue the new prev
     */
    public final native void setPrev(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setprev(newValue);
    }-*/;

    /**
     * Gets the last.
     * 
     * @return the last
     */
    public final native String getLast()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlast();
    }-*/;

    /**
     * Sets the last.
     * 
     * @param newValue the new last
     */
    public final native void setLast(String newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlast(newValue);
    }-*/;

    /**
     * Gets the red multiplier.
     * 
     * @return the red multiplier
     */
    public final native double getRedMultiplier()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getredMultiplier();
    }-*/;

    /**
     * Sets the red multiplier.
     * 
     * @param newValue the new red multiplier
     */
    public final native void setRedMultiplier(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setredMultiplier(newValue);
    }-*/;

    /**
     * Gets the green multiplier.
     * 
     * @return the green multiplier
     */
    public final native double getGreenMultiplier()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgreenMultiplier();
    }-*/;

    /**
     * Sets the green multiplier.
     * 
     * @param newValue the new green multiplier
     */
    public final native void setGreenMultiplier(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setgreenMultiplier(newValue);
    }-*/;

    /**
     * Gets the blue multiplier.
     * 
     * @return the blue multiplier
     */
    public final native double getBlueMultiplier()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblueMultiplier();
    }-*/;

    /**
     * Sets the blue multiplier.
     * 
     * @param newValue the new blue multiplier
     */
    public final native void setBlueMultiplier(double newValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblueMultiplier(newValue);
    }-*/;

}
