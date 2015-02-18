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

package com.ait.toolkit.flash.core.client.text;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * The Class TextFormat.
 */
public class TextFormat extends JsObject {

    /**
     * Creates the.
     * 
     * @return the text format
     */
    public TextFormat() {
        jsObj = Bridge.createObject("flash.text.TextFormat");
    }

    TextFormat(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the align.
     * 
     * @return the align
     */
    public native String getAlign() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalign();
    }-*/;

    /**
     * Sets the align.
     * 
     * @param value the new align
     */
    public native void setAlign(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalign(value);
    }-*/;

    /**
     * Gets the block indent.
     * 
     * @param <T> the generic type
     * @return the block indent
     */
    public native <T> T getBlockIndent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getblockIndent();
    }-*/;

    /**
     * Sets the block indent.
     * 
     * @param value the new block indent
     */
    public native void setBlockIndent(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setblockIndent(value);
    }-*/;

    /**
     * Gets the bold.
     * 
     * @param <T> the generic type
     * @return the bold
     */
    public native <T> T getBold() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbold();
    }-*/;

    /**
     * Sets the bold.
     * 
     * @param value the new bold
     */
    public native void setBold(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbold(value);
    }-*/;

    /**
     * Gets the bullet.
     * 
     * @param <T> the generic type
     * @return the bullet
     */
    public native <T> T getBullet() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbullet();
    }-*/;

    /**
     * Sets the bullet.
     * 
     * @param value the new bullet
     */
    public native void setBullet(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbullet(value);
    }-*/;

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public native Object getColor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcolor();
    }-*/;

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public native void setColor(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcolor(value);
    }-*/;

    /**
     * Gets the font.
     * 
     * @return the font
     */
    public native String getFont() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfont();
    }-*/;

    /**
     * Sets the font.
     * 
     * @param value the new font
     */
    public native void setFont(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfont(value);
    }-*/;

    /**
     * Gets the indent.
     * 
     * @return the indent
     */
    public native Object getIndent() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindent();
    }-*/;

    /**
     * Sets the indent.
     * 
     * @param value the new indent
     */
    public native void setIndent(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindent(value);
    }-*/;

    /**
     * Gets the italic.
     * 
     * @return the italic
     */
    public native Object getItalic() /*-{
		return peer.getitalic();
    }-*/;

    /**
     * Sets the italic.
     * 
     * @param value the new italic
     */
    public native void setItalic(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setitalic(value);
    }-*/;

    /**
     * Gets the kerning.
     * 
     * @return the kerning
     */
    public native Object getKerning() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getkerning();
    }-*/;

    /**
     * Sets the kerning.
     * 
     * @param value the new kerning
     */
    public native void setKerning(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setkerning(value);
    }-*/;

    /**
     * Gets the left margin.
     * 
     * @return the left margin
     */
    public native Object getLeftMargin() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getleftMargin();
    }-*/;

    /**
     * Sets the left margin.
     * 
     * @param value the new left margin
     */
    public native void setLeftMargin(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setleftMargin(value);
    }-*/;

    /**
     * Gets the letter spacing.
     * 
     * @return the letter spacing
     */
    public native Object getLetterSpacing() /*-{
		return peer.getletterSpacing();
    }-*/;

    /**
     * Sets the letter spacing.
     * 
     * @param value the new letter spacing
     */
    public native void setLetterSpacing(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setletterSpacing(value);
    }-*/;

    /**
     * Gets the rightargin.
     * 
     * @return the rightargin
     */
    public native Object getRightargin() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrightMargin();
    }-*/;

    /**
     * Sets the right margin.
     * 
     * @param value the new right margin
     */
    public native void setRightMargin(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrightMargin(value);
    }-*/;

    /**
     * Gets the size.
     * 
     * @return the size
     */
    public native Object getSize() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsize();
    }-*/;

    /**
     * Sets the size.
     * 
     * @param value the new size
     */
    public native void setSize(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsize(value);
    }-*/;

    /**
     * Gets the tab stops.
     * 
     * @return the tab stops
     */
    public native JsArrayInteger getTabStops() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettabStops();
    }-*/;

    /**
     * Sets the tab stops.
     * 
     * @param value the new tab stops
     */
    public native void setTabStops(JsArrayInteger value) /*-{
		peer.settabStops(value);
    }-*/;

    /**
     * Gets the target.
     * 
     * @return the target
     */
    public native String getTarget() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettarget();
    }-*/;

    /**
     * Sets the target.
     * 
     * @param value the new target
     */
    public native void setTarget(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settarget(value);
    }-*/;

    /**
     * Gets the underline.
     * 
     * @return the underline
     */
    public native String getUnderline() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getunderline();
    }-*/;

    /**
     * Sets the underline.
     * 
     * @param value the new underline
     */
    public native void setUnderline(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setunderline(value);
    }-*/;

    /**
     * Gets the uRL.
     * 
     * @return the uRL
     */
    public native String getURL() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geturl();
    }-*/;

    /**
     * Sets the uRL.
     * 
     * @param value the new uRL
     */
    public native void setURL(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.seturl(value);
    }-*/;

}
