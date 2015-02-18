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

import com.ait.toolkit.flash.core.client.display.DisplayObject;
import com.ait.toolkit.flash.core.client.display.InteractiveObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The TextField class is used to create display objects for text display and
 * input. You can give a text field an instance name in the Property inspector
 * and use the methods and properties of the TextField class to manipulate it
 * with ActionScript. TextField instance names are displayed in the Movie
 * Explorer and in the Insert Target Path dialog box in the Actions panel. To
 * create a text field dynamically, use the TextField() constructor.
 * <p>
 * The methods of the TextField class let you set, select, and manipulate text
 * in a dynamic or input text field that you create during authoring or at
 * runtime.
 * <p>
 * The TextFormat class lets you set character and paragraph formatting for
 * TextField objects. You can apply Cascading Style Sheets (CSS) styles to text
 * fields by using the TextField.styleSheet property and the StyleSheet class.
 * You can use CSS to style built-in HTML tags, define new formatting tags, or
 * apply styles. You can assign HTML formatted text, which optionally uses CSS
 * styles, directly to a text field. HTML text that you assign to a text field
 * can contain embedded media (movie clips, SWF files, GIF files, PNG files, and
 * JPEG files). The text wraps around the embedded media in the same way that a
 * web browser wraps text around media embedded in an HTML document.
 * <p>
 * FlashDetect Player supports a subset of HTML tags that you can use to format
 * text. See the list of supported HTML tags in the description of the htmlText
 * property.
 */
public class TextField extends InteractiveObject {

    /**
     * New instance.
     * 
     * @return the text field
     */
    public TextField() {
        jsObj = Bridge.createObject("flash.text.TextField");
    }

    protected TextField(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Always show selection.
     * 
     * @param value
     *            the value
     */
    public native void setAlwaysShowSelection(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalwaysShowSelection(value);
    }-*/;

    /**
     * Checks if is always showing selection.
     * 
     * @return true, if is always showing selection
     */
    public native boolean isAlwaysShowingSelection() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalwaysShowSelection();
    }-*/;

    /**
     * Gets the antialias type.
     * 
     * @return the antialias type
     */
    public native String getAntialiasType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getantiAliasType();
    }-*/;

    /**
     * Sets the antialias type.
     * 
     * @param value
     *            the new antialias type
     */
    public native void setAntialiasType(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setantiAliasType(value);
    }-*/;

    /**
     * Gets the auto size.
     * 
     * @return the auto size
     */
    public TextFieldAutoSize getAutoSize() {
        return TextFieldAutoSize.fromValue(_getAutoSize());
    }

    /**
     * _get auto size.
     * 
     * @return the string
     */
    private native String _getAutoSize() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getautoSize();
    }-*/;

    /**
     * Sets the auto size.
     * 
     * @param size
     *            the new auto size
     */
    public void setAutoSize(TextFieldAutoSize size) {
        _setAutoSize(size.value);
    }

    /**
     * _set auto size.
     * 
     * @param value
     *            the value
     */
    private native void _setAutoSize(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setautoSize(value);
    }-*/;

    /**
     * Checks for background.
     * 
     * @return true, if successful
     */
    public native boolean hasBackground() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbackground();
    }-*/;

    /**
     * Sets the background.
     * 
     * @param value
     *            the new background
     */
    public native void setBackground(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbackground(value);
    }-*/;

    /**
     * Gets the background color.
     * 
     * @return the background color
     */
    public native int getBackgroundColor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbackgroundColor();
    }-*/;

    /**
     * Sets the background color.
     * 
     * @param value
     *            the new background color
     */
    public native void setBackgroundColor(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbackgroundColor(value);
    }-*/;

    /**
     * Checks for border.
     * 
     * @return true, if successful
     */
    public native boolean hasBorder() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborder();
    }-*/;

    /**
     * Sets the border.
     * 
     * @param value
     *            the new border
     */
    public native void setBorder(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborder(value);
    }-*/;

    /**
     * Gets the border color.
     * 
     * @return the border color
     */
    public native int getBorderColor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborderColor();
    }-*/;

    /**
     * Sets the border color.
     * 
     * @param value
     *            the new border color
     */
    public native void setBorderColor(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderColor(value);
    }-*/;

    /**
     * Gets the bottom scroll v.
     * 
     * @return the bottom scroll v
     */
    public native int getBottomScrollV() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbottomScrollV();
    }-*/;

    /**
     * Gets the caret index.
     * 
     * @return the caret index
     */
    public native int getCaretIndex() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcaretIndex();
    }-*/;

    /**
     * Gets the default text format.
     * 
     * @return the default text format
     */
    public native TextFormat getDefaultTextFormat() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getdefaultTextFormat();
		return @com.ait.toolkit.flash.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the default text format.
     * 
     * @param value
     *            the new default text format
     */
    public native void setDefaultTextFormat(TextFormat value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setdefaultTextFormat(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Checks if is displayed as password.
     * 
     * @return true, if is displayed as password
     */
    public native boolean isDisplayedAsPassword() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdisplayAsPassowrd();
    }-*/;

    /**
     * Display as password.
     * 
     * @param value
     *            the value
     */
    public native void displayAsPassword(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdisplayAsPassowrd(value);
    }-*/;

    /**
     * Checks if is using embed fonts.
     * 
     * @return true, if is using embed fonts
     */
    public native boolean isUsingEmbedFonts() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getembedFonts();
    }-*/;

    /**
     * Sets the use embed fonts.
     * 
     * @param value
     *            the new use embed fonts
     */
    public native void setUseEmbedFonts(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setembedFonts(value);
    }-*/;

    /**
     * Checks for condense white.
     * 
     * @return true, if successful
     */
    public native boolean hasCondenseWhite() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcondenseWhite();
    }-*/;

    /**
     * Condense white.
     * 
     * @param value
     *            the value
     */
    public native void condenseWhite(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcondenseWhite(value);
    }-*/;

    /**
     * Gets the grid fit type.
     * 
     * @return the grid fit type
     */
    public native String getGridFitType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgridFitType();
    }-*/;

    /**
     * Sets the grid fit type.
     * 
     * @param value
     *            the new grid fit type
     */
    public native void setGridFitType(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setgridFitType(value);
    }-*/;

    /**
     * Gets the hTML text.
     * 
     * @return the hTML text
     */
    public native String getHTMLText() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gethtmlText;
    }-*/;

    /**
     * Sets the hTML text.
     * 
     * @param value
     *            the new hTML text
     */
    public native void setHTMLText(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sethtmlText(value);
    }-*/;

    /**
     * Gets the length.
     * 
     * @return the length
     */
    public native int getLength() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlength();
    }-*/;

    /**
     * Gets the max chars.
     * 
     * @return the max chars
     */
    public native String getMaxChars() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmaxChars();
    }-*/;

    /**
     * Sets the max chars.
     * 
     * @param value
     *            the new max chars
     */
    public native void setMaxChars(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmaxChars(value);
    }-*/;

    /**
     * Gets the max scroll v.
     * 
     * @return the max scroll v
     */
    public native int getMaxScrollV() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmaxScrollV();
    }-*/;

    /**
     * Gets the max scroll h.
     * 
     * @return the max scroll h
     */
    public native int getMaxScrollH() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmaxScrollH();
    }-*/;

    /**
     * Checks for mouse wheel enabled.
     * 
     * @return true, if successful
     */
    public native boolean hasMouseWheelEnabled() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmouseWheelEnabled();
    }-*/;

    /**
     * Mouse wheel enabled.
     * 
     * @param value
     *            the value
     */
    public native void mouseWheelEnabled(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmouseWheelEnabled(value);
    }-*/;

    /**
     * Checks if is multiline.
     * 
     * @return true, if is multiline
     */
    public native boolean isMultiline() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmultiline();
    }-*/;

    /**
     * Multiline.
     * 
     * @param value
     *            the value
     */
    public native void multiline(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmultiline(value);
    }-*/;

    /**
     * Gets the num lines.
     * 
     * @return the num lines
     */
    public native int getNumLines() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnumLines();
    }-*/;

    /**
     * Gets the restrict.
     * 
     * @return the restrict
     */
    public native String getRestrict() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrestrict();
    }-*/;

    /**
     * Restrict.
     * 
     * @param value
     *            the value
     */
    public native void restrict(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrestrict(value);
    }-*/;

    /**
     * Gets the scroll h.
     * 
     * @return the scroll h
     */
    public native int getScrollH() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscrollH();
    }-*/;

    /**
     * Sets the scroll h.
     * 
     * @param value
     *            the new scroll h
     */
    public native void setScrollH(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscrollH(value);
    }-*/;

    /**
     * Gets the scroll v.
     * 
     * @return the scroll v
     */
    public native int getScrollV() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getscrollV();
    }-*/;

    /**
     * Sets the scroll v.
     * 
     * @param value
     *            the new scroll v
     */
    public native void setScrollV(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setscrollV(value);
    }-*/;

    /**
     * Checks if is selectable.
     * 
     * @return true, if is selectable
     */
    public native boolean isSelectable() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getselectable();
    }-*/;

    /**
     * Sets the selectable.
     * 
     * @param value
     *            the new selectable
     */
    public native void setSelectable(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setselectable(value);
    }-*/;

    /**
     * Gets the selection begin index.
     * 
     * @return the selection begin index
     */
    public native void getSelectionBeginIndex() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getselectionBeginIndex();
    }-*/;

    /**
     * Gets the selection end index.
     * 
     * @return the selection end index
     */
    public native void getSelectionEndIndex() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getselectionEndIndex();
    }-*/;

    /**
     * Gets the sharpness.
     * 
     * @return the sharpness
     */
    public native double getSharpness() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsharpness();
    }-*/;

    /**
     * Sets the sharpness.
     * 
     * @param value
     *            the new sharpness
     */
    public native void setSharpness(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsharpness(value);
    }-*/;

    /**
     * Gets the text.
     * 
     * @return the text
     */
    public native String getText() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettext();
    }-*/;

    /**
     * Sets the text.
     * 
     * @param value
     *            the new text
     */
    public native void setText(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settext(value);
    }-*/;

    /**
     * Gets the text color.
     * 
     * @return the text color
     */
    public native int getTextColor() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettextColor();
    }-*/;

    /**
     * Sets the text color.
     * 
     * @param value
     *            the new text color
     */
    public native void setTextColor(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settextColor(value);
    }-*/;

    /**
     * Gets the text height.
     * 
     * @return the text height
     */
    public native double getTextHeight() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettextHeight();
    }-*/;

    /**
     * Gets the text width.
     * 
     * @return the text width
     */
    public native double getTextWidth() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettextWidth();
    }-*/;

    /**
     * Gets the thickness.
     * 
     * @return the thickness
     */
    public native double getThickness() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getthickness();
    }-*/;

    /**
     * Sets the thickness.
     * 
     * @param value
     *            the new thickness
     */
    public native void setThickness(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setthickness(value);
    }-*/;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public native String getType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettype();
    }-*/;

    /**
     * Sets the type.
     * 
     * @param value
     *            the new type
     */
    public native void setType(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settype(value);
    }-*/;

    /**
     * Use rich text clipboard.
     * 
     * @return true, if successful
     */
    public native boolean useRichTextClipboard() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getuseRichTextClipboard();
    }-*/;

    /**
     * Sets the use rich text clipboard.
     * 
     * @param value
     *            the new use rich text clipboard
     */
    public native void setUseRichTextClipboard(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setuseRichTextClipboard(value);
    }-*/;

    /**
     * Checks if is word wrap.
     * 
     * @return true, if is word wrap
     */
    public native boolean isWordWrap() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getwordWrap();
    }-*/;

    /**
     * Sets the word wrap.
     * 
     * @param value
     *            the new word wrap
     */
    public native void setWordWrap(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setwordWrap(value);
    }-*/;

    /**
     * Append text.
     * 
     * @param newText
     *            the new text
     */
    public native void appendText(String newText) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.appendText(newText);
    }-*/;

    /**
     * Gets the char boundaries.
     * 
     * @param charIndex
     *            the char index
     * @return the char boundaries
     */
    public native Rectangle getCharBoundaries(int charIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCharBoundaries(charIndex);
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the char index at point.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the char index at point
     */
    public native int getCharIndexAtPoint(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getCharIndexAtPoint(x, y);
    }-*/;

    /**
     * Gets the first char in paragraph.
     * 
     * @param charIndex
     *            the char index
     * @return the first char in paragraph
     */
    public native int getFirstCharInParagraph(int charIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getFirstCharInParagraph(charIndex);
    }-*/;

    /**
     * Gets the image reference.
     * 
     * @param id
     *            the id
     * @return the image reference
     */
    public native DisplayObject getImageReference(String id) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getImageReference(id);
		return @com.ait.toolkit.flash.core.client.display.DisplayObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the line index at point.
     * 
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the line index at point
     */
    public native int getLineIndexAtPoint(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLineIndexAtPoint(x, y);
    }-*/;

    /**
     * Gets the line index of char.
     * 
     * @param charIndex
     *            the char index
     * @return the line index of char
     */
    public native int getLineIndexOfChar(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLineIndexOfChar(value);
    }-*/;

    /**
     * Gets the line length.
     * 
     * @param lineIndex
     *            the line index
     * @return the line length
     */
    public native int getLineLength(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLineLength(value);
    }-*/;

    /**
     * Gets the line metrics.
     * 
     * @param lineIndex
     *            the line index
     * @return the line metrics
     */
    public native TextLineMetrics getLineMetrics(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getLineMetrics(value);
		return @com.ait.toolkit.flash.core.client.text.TextLineMetrics::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the line offset.
     * 
     * @param lineIndex
     *            the line index
     * @return the line offset
     */
    public native int getLineOffset(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLineOffset(value);
    }-*/;

    /**
     * Gets the line text.
     * 
     * @param lineIndex
     *            the line index
     * @return the line text
     */
    public native int getLineText(int lineText) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getLineText(lineText);
    }-*/;

    /**
     * Gets the paragraph length.
     * 
     * @param charIndex
     *            the char index
     * @return the paragraph length
     */
    public native int getParagraphLength(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getParagraphLength(value);
    }-*/;

    /**
     * Gets the text format.
     * 
     * @return the text format
     */
    public native TextFormat getTextFormat() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getTextFormat();
		return @com.ait.toolkit.flash.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(oj);
    }-*/;

    /**
     * Gets the text format.
     * 
     * @param beginIndex
     *            the begin index
     * @return the text format
     */
    public native TextFormat getTextFormat(int beginIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getTextFormat(beginIndex);
		return @com.ait.toolkit.flash.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the text format.
     * 
     * @param beginIndex
     *            the begin index
     * @param endIndex
     *            the end index
     * @return the text format
     */
    public native TextFormat getTextFormat(int beginIndex, int endIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getTextFormat(beginIndex, endIndex);
		return @com.ait.toolkit.flash.core.client.text.TextFormat::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Checks if is font compatible.
     * 
     * @param fontName
     *            the font name
     * @param fontStyle
     *            the font style
     * @return true, if is font compatible
     */
    public native boolean isFontCompatible(String fontName, String fontStyle) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isFontCompatible(fontName, fontStyle);
    }-*/;

    /**
     * Replace selected text.
     * 
     * @param newText
     *            the new text
     */
    public native void replaceSelectedText(String newText) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.replaceSelectedText(newText);
    }-*/;

    /**
     * Replace text.
     * 
     * @param beginIndex
     *            the begin index
     * @param endIndex
     *            the end index
     * @param newText
     *            the new text
     */
    public native void replaceText(int beginIndex, int endIndex, String newText) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.replaceText(beginIndex, endIndex, newText);
    }-*/;

    /**
     * Sets the selection.
     * 
     * @param beginIndex
     *            the begin index
     * @param endIndex
     *            the end index
     */
    public native void setSelection(int beginIndex, int endIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSelection(beginIndex, endIndex);
    }-*/;

    /**
     * Sets the text format.
     * 
     * @param format
     *            the new text format
     */
    public native void setTextFormat(TextFormat format) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTextFormat(format.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the text format.
     * 
     * @param format
     *            the format
     * @param beginIndex
     *            the begin index
     */
    public native void setTextFormat(TextFormat format, int beginIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTextFormat(
						format.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						beginIndex);
    }-*/;

    /**
     * Sets the text format.
     * 
     * @param format
     *            the format
     * @param beginIndex
     *            the begin index
     * @param endIndex
     *            the end index
     */
    public native void setTextFormat(TextFormat format, int beginIndex, int endIndex) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTextFormat(
						format.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						beginIndex, endIndex);
    }-*/;

}
