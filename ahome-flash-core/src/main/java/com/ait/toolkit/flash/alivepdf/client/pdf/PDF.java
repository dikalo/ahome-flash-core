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

package com.ait.toolkit.flash.alivepdf.client.pdf;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.flash.alivepdf.client.annotations.Annotation;
import com.ait.toolkit.flash.alivepdf.client.codabar.CodaBar;
import com.ait.toolkit.flash.alivepdf.client.colors.RGBColor;
import com.ait.toolkit.flash.alivepdf.client.core.PDFFactory;
import com.ait.toolkit.flash.alivepdf.client.drawing.Blend;
import com.ait.toolkit.flash.alivepdf.client.drawing.Caps;
import com.ait.toolkit.flash.alivepdf.client.drawing.DashedLine;
import com.ait.toolkit.flash.alivepdf.client.drawing.Joint;
import com.ait.toolkit.flash.alivepdf.client.fonts.IFont;
import com.ait.toolkit.flash.alivepdf.client.grid.Grid;
import com.ait.toolkit.flash.alivepdf.client.images.ColorSpace;
import com.ait.toolkit.flash.alivepdf.client.images.ImageFormat;
import com.ait.toolkit.flash.alivepdf.client.layout.Align;
import com.ait.toolkit.flash.alivepdf.client.layout.Layout;
import com.ait.toolkit.flash.alivepdf.client.layout.Mode;
import com.ait.toolkit.flash.alivepdf.client.layout.Orientation;
import com.ait.toolkit.flash.alivepdf.client.layout.Position;
import com.ait.toolkit.flash.alivepdf.client.layout.Resize;
import com.ait.toolkit.flash.alivepdf.client.layout.Size;
import com.ait.toolkit.flash.alivepdf.client.layout.Unit;
import com.ait.toolkit.flash.alivepdf.client.links.Highlight;
import com.ait.toolkit.flash.alivepdf.client.links.ILink;
import com.ait.toolkit.flash.alivepdf.client.links.InternalLink;
import com.ait.toolkit.flash.alivepdf.client.pages.Page;
import com.ait.toolkit.flash.alivepdf.client.saving.Download;
import com.ait.toolkit.flash.alivepdf.client.saving.Method;
import com.ait.toolkit.flash.alivepdf.client.transitions.Dimension;
import com.ait.toolkit.flash.alivepdf.client.transitions.MotionDirection;
import com.ait.toolkit.flash.alivepdf.client.transitions.Transition;
import com.ait.toolkit.flash.alivepdf.client.transitions.TransitionDirection;
import com.ait.toolkit.flash.alivepdf.client.viewing.CenterWindow;
import com.ait.toolkit.flash.alivepdf.client.viewing.FitWindow;
import com.ait.toolkit.flash.alivepdf.client.viewing.MenuBar;
import com.ait.toolkit.flash.alivepdf.client.viewing.Title;
import com.ait.toolkit.flash.alivepdf.client.viewing.ToolBar;
import com.ait.toolkit.flash.alivepdf.client.viewing.WindowUI;
import com.ait.toolkit.flash.core.client.display.BitmapData;
import com.ait.toolkit.flash.core.client.display.BlendMode;
import com.ait.toolkit.flash.core.client.display.DisplayObject;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.geom.Matrix;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The PDF class represents a PDF document.
 * 
 * 
 * 
 * @example This example shows how to create a PDF document : <div
 *          class="listing">
 * 
 *          <pre>
 * 
 * var myPDF:PDF = new PDF( Orientation.LANDSCAPE, Unit.MM, Size.A4 );
 * </pre>
 * 
 *          </div>
 * 
 *          This example shows how to listen for events during PDF creation :
 *          <div class="listing">
 * 
 *          <pre>
 * 
 * myPDF.addEventListener(ProcessingEvent.STARTED, generationStarted);
 * myPDF.addEventListener(ProcessingEvent.PAGE_TREE, pageTreeGeneration);
 * myPDF.addEventListener(ProcessingEvent.RESOURCES, resourcesEmbedding);
 * myPDF.addEventListener(ProcessingEvent.COMPLETE, generationComplete);
 * </pre>
 * 
 *          </div>
 * 
 *          This example shows how to listen for an event when a page is added
 *          to the PDF : <div class="listing">
 * 
 *          <pre>
 * 
 * myPDF.addEventListener(PageEvent.ADDED, pageAdded);
 * </pre>
 * 
 *          </div>
 */

public class PDF extends EventDispatcher {

	/**
	 * Instantiates a new pDF.
	 */
	PDF(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * New instance.
	 * 
	 * @return the pDF
	 */
	public PDF() {
		jsObj = PDFFactory.INSTANCE.newInstance(Orientation.LANDSCAPE.value);
	}

	/**
	 * New instance.
	 * 
	 * @param orientation
	 *            the orientation
	 * @return the pDF
	 */
	public PDF(Orientation orientation) {
		jsObj = PDFFactory.INSTANCE.newInstance(orientation.value);
	}

	/**
	 * New instance.
	 * 
	 * @param orientation
	 *            the orientation
	 * @param unit
	 *            the unit
	 * @return the pDF
	 */
	public PDF(Orientation orientation, Unit unit) {
		jsObj = PDFFactory.INSTANCE.newInstance(orientation.value, unit.value);
	}

	/**
	 * New instance.
	 * 
	 * @param orientation
	 *            the orientation
	 * @param unit
	 *            the unit
	 * @param autoBreak
	 *            the auto break
	 * @return the pDF
	 */
	public PDF(Orientation orientation, Unit unit, boolean autoBreak) {
		jsObj = PDFFactory.INSTANCE.newInstance(orientation.value, unit.value,
				autoBreak);
	}

	/**
	 * New instance.
	 * 
	 * @param orientation
	 *            the orientation
	 * @param unit
	 *            the unit
	 * @param autoBreak
	 *            the auto break
	 * @param pageSize
	 *            the page size
	 * @return the pDF
	 */
	public PDF(Orientation orientation, Unit unit, boolean autoBreak,
			Size pageSize) {
		jsObj = PDFFactory.INSTANCE.newInstance(orientation.value, unit.value,
				autoBreak, pageSize);
	}

	/**
	 * New instance.
	 * 
	 * @param orientation
	 *            the orientation
	 * @param unit
	 *            the unit
	 * @param autoBreak
	 *            the auto break
	 * @param pageSize
	 *            the page size
	 * @param rotation
	 *            the rotation
	 * @return the pDF
	 */
	public PDF(Orientation orientation, Unit unit, boolean autoBreak,
			Size pageSize, int rotation) {
		jsObj = PDFFactory.INSTANCE.newInstance(orientation.value, unit.value,
				autoBreak, pageSize, rotation);
	}

	/**
	 * Sets the margins.
	 * 
	 * @param left
	 *            the left
	 * @param top
	 *            the top
	 */
	public final native void setMargins(double left, double top) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMargins(left, top);
	}-*/;

	/**
	 * Sets the margins.
	 * 
	 * @param left
	 *            the left
	 * @param top
	 *            the top
	 * @param right
	 *            the right
	 */
	public final native void setMargins(double left, double top, double right) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMargins(left, top, right);
	}-*/;

	/**
	 * Sets the margins.
	 * 
	 * @param left
	 *            the left
	 * @param top
	 *            the top
	 * @param right
	 *            the right
	 * @param bottom
	 *            the bottom
	 */
	public final native void setMargins(double left, double top, double right,
			double bottom) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setMargins(left, top, right, bottom);
	}-*/;

	/**
	 * Reset margins.
	 */
	public final native void resetMargins() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resetMargins();
	}-*/;

	/**
	 * Gets the margins.
	 * 
	 * @return the margins
	 */
	public final native Rectangle getMargins() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getMargins();
		return @com.ait.toolkit.flash.core.client.geom.Rectangle::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Sets the left margin.
	 * 
	 * @param left
	 *            the new left margin
	 */
	public final native void setLeftMargin(double left) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLeftMargin(left);
	}-*/;

	/**
	 * Sets the top margin.
	 * 
	 * @param top
	 *            the new top margin
	 */
	public final native void setTopMargin(double top) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTopMargin(top);
	}-*/;

	/**
	 * Sets the bottom margin.
	 * 
	 * @param bottom
	 *            the new bottom margin
	 */
	public final native void setBottomMargin(double bottom) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBottomMargin(bottom);
	}-*/;

	/**
	 * Sets the right margin.
	 * 
	 * @param right
	 *            the new right margin
	 */
	public final native void setRightMargin(double right) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setRightMargin(right);
	}-*/;

	/**
	 * Sets the auto page break.
	 * 
	 * @param auto
	 *            the auto
	 * @param margin
	 *            the margin
	 */
	public final native void setAutoPageBreak(boolean auto, double margin) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAutoPageBreak(auto, margin);
	}-*/;

	/**
	 * Sets the display mode.
	 * 
	 * @param zoom
	 *            the new display mode
	 */
	public final native void setDisplayMode(String zoom) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDisplayMode(zoom);
	}-*/;

	/**
	 * Sets the display mode.
	 * 
	 * @param zoom
	 *            the zoom
	 * @param layout
	 *            the layout
	 */
	public final void setDisplayMode(String zoom, Layout layout) {
		_setDisplayMode(zoom, layout.value);
	}

	/**
	 * _set display mode.
	 * 
	 * @param zoom
	 *            the zoom
	 * @param layout
	 *            the layout
	 */
	private final native void _setDisplayMode(String zoom, String layout) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDisplayMode(zoom, layout);
	}-*/;

	/**
	 * Sets the display mode.
	 * 
	 * @param zoom
	 *            the zoom
	 * @param layout
	 *            the layout
	 * @param mode
	 *            the mode
	 */
	public final void setDisplayMode(String zoom, Layout layout, Mode mode) {
		_setDisplayMode(zoom, layout.value, mode.value);
	}

	/**
	 * _set display mode.
	 * 
	 * @param zoom
	 *            the zoom
	 * @param layout
	 *            the layout
	 * @param mode
	 *            the mode
	 */
	private final native void _setDisplayMode(String zoom, String layout,
			String mode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDisplayMode(zoom, layout, mode);
	}-*/;

	/**
	 * Sets the display mode.
	 * 
	 * @param zoom
	 *            the zoom
	 * @param layout
	 *            the layout
	 * @param mode
	 *            the mode
	 * @param zoomValue
	 *            the zoom value
	 */
	public final void setDisplayMode(String zoom, Layout layout, Mode mode,
			double zoomValue) {
		_setDisplayMode(zoom, layout.value, mode.value, zoomValue);
	}

	/**
	 * _set display mode.
	 * 
	 * @param zoom
	 *            the zoom
	 * @param layout
	 *            the layout
	 * @param mode
	 *            the mode
	 * @param zoomValue
	 *            the zoom value
	 */
	private final native void _setDisplayMode(String zoom, String layout,
			String mode, double zoomValue) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDisplayMode(zoom, layout, mode, zoomValue);
	}-*/;

	/**
	 * Sets the advance timing.
	 * 
	 * @param timing
	 *            the new advance timing
	 */
	public final native void setAdvanceTiming(int timing) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAdvanceTiming(timing);
	}-*/;

	/**
	 * Sets the title.
	 * 
	 * @param title
	 *            the new title
	 */
	public final native void setTitle(String title) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTitle(title);
	}-*/;

	/**
	 * Sets the subject.
	 * 
	 * @param subject
	 *            the new subject
	 */
	public final native void setSubject(String subject) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSubject(title);
	}-*/;

	/**
	 * Sets the author.
	 * 
	 * @param value
	 *            the new author
	 */
	public final native void setAuthor(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAuthor(value);
	}-*/;

	/**
	 * Sets the key words.
	 * 
	 * @param value
	 *            the new key words
	 */
	public final native void setKeyWords(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setKeyWords(value);
	}-*/;

	/**
	 * Sets the creator.
	 * 
	 * @param value
	 *            the new creator
	 */
	public final native void setCreator(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setCreator(value);
	}-*/;

	/**
	 * Sets the alias nb pages.
	 * 
	 * @param value
	 *            the new alias nb pages
	 */
	public final native void setAliasNbPages(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAliasNbPages(value);
	}-*/;

	/**
	 * Rotate page.
	 * 
	 * @param number
	 *            the number
	 * @param rotation
	 *            the rotation
	 */
	public final native void rotatePage(int number, double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.rotatePage(number, rotatePage);
	}-*/;

	/**
	 * Adds the page.
	 * 
	 * @param page
	 *            the page
	 * @return the page
	 */
	public final native Page addPage(Page page) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.addPage(page);
		return @com.ait.toolkit.flash.alivepdf.client.pages.Page::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Adds the page.
	 * 
	 * @return the page
	 */
	public final native Page addPage() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.addPage();
		return @com.ait.toolkit.flash.alivepdf.client.pages.Page::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Gets the page.
	 * 
	 * @param index
	 *            the index
	 * @return the page
	 */
	public final native Page getPage(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getPage(index);
		return @com.ait.toolkit.flash.alivepdf.client.pages.Page::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	public final List<Page> getPages() {
		List<Page> pages = new ArrayList<Page>();
		JavaScriptObject peers = _getPages();
		int length = JsoHelper.getJavaScriptObjectAs3ArraySize(peers);
		for (int i = 0; i < length; i++) {
			pages.add(new Page(JsoHelper.getValueFromJavaScriptObjectArray(
					peers, i)));
		}
		return pages;
	}

	private final native JavaScriptObject _getPages() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getPages();
	}-*/;

	/**
	 * Goto page.
	 * 
	 * @param index
	 *            the index
	 */
	public final native void gotoPage(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.gotoPage(index);
	}-*/;

	/**
	 * Removes the page.
	 * 
	 * @param index
	 *            the index
	 */
	public final native void removePage(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.removePage(index);
	}-*/;

	/**
	 * Removes the all pages.
	 */
	public final native void removeAllPages() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.removeAllPages();
	}-*/;

	/**
	 * Gets the current page.
	 * 
	 * @return the current page
	 */
	public final native Page getCurrentPage() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCurrentPage();
		return @com.ait.toolkit.flash.alivepdf.client.pages.Page::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Gets the total pages.
	 * 
	 * @return the total pages
	 */
	public final native int getTotalPages() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettotalPages();
	}-*/;

	/**
	 * New line.
	 * 
	 * @param value
	 *            the value
	 */
	public final native void newLine(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.newLine(value);
	}-*/;

	/**
	 * Gets the x.
	 * 
	 * @return the x
	 */
	public final native double getX() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getX();
	}-*/;

	/**
	 * Sets the x.
	 * 
	 * @param x
	 *            the new x
	 */
	public final native void setX(double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setX(x);
	}-*/;

	/**
	 * Gets the y.
	 * 
	 * @return the y
	 */
	public final native double getY() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getY();
	}-*/;

	/**
	 * Sets the y.
	 * 
	 * @param y
	 *            the new y
	 */
	public final native void setY(double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setY(y);
	}-*/;

	/**
	 * Sets the xy.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void setXY(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setXY(x, y);
	}-*/;

	/**
	 * Gets the default size.
	 * 
	 * @return the default size
	 */
	public final native Size getDefaultSize() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getDefaultSize();
		return @com.ait.toolkit.flash.alivepdf.client.layout.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Gets the default orientation.
	 * 
	 * @return the default orientation
	 */
	public final Orientation getDefaultOrientation() {
		return Orientation.fromValue(_getDefaultOrientation());
	}

	/**
	 * _get default orientation.
	 * 
	 * @return the string
	 */
	private final native String _getDefaultOrientation() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getDefaultOrientation();
	}-*/;

	/**
	 * Gets the default unit.
	 * 
	 * @return the default unit
	 */
	public final Unit getDefaultUnit() {
		return Unit.fromValue(_getDefaultUnit());
	}

	/**
	 * _get default unit.
	 * 
	 * @return the string
	 */
	private final native String _getDefaultUnit() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getDefaultUnit();
	}-*/;

	/**
	 * Skew.
	 * 
	 * @param ax
	 *            the ax
	 * @param ay
	 *            the ay
	 */

	public final native void skew(double ax, double ay) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.skew(ax, ay);
	}-*/;

	/**
	 * Skew.
	 * 
	 * @param ax
	 *            the ax
	 * @param ay
	 *            the ay
	 * @param x
	 *            the x
	 */
	public final native void skew(double ax, double ay, double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.skew(ax, ay, x);
	}-*/;

	/**
	 * Skew.
	 * 
	 * @param ax
	 *            the ax
	 * @param ay
	 *            the ay
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void skew(double ax, double ay, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.skew(ax, ay, x, y);
	}-*/;

	/**
	 * Rotate.
	 * 
	 * @param angle
	 *            the angle
	 */
	public final native void rotate(double angle) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.rotate(angle);
	}-*/;

	/**
	 * Rotate.
	 * 
	 * @param angle
	 *            the angle
	 * @param x
	 *            the x
	 */
	public final native void rotate(double angle, double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.rotate(angle, x);
	}-*/;

	/**
	 * Rotate.
	 * 
	 * @param angle
	 *            the angle
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void rotate(double angle, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.rotate(angle, x, y);
	}-*/;

	/**
	 * Header.
	 */

	public final native void header() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.header();
	}-*/;

	/**
	 * Header.
	 * 
	 * @param headerText
	 *            the header text
	 */
	public final native void header(String headerText) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.header(headerText);
	}-*/;

	/**
	 * Footer.
	 */
	public final native void footer() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.footer();
	}-*/;

	/**
	 * Footer.
	 * 
	 * @param footerText
	 *            the footer text
	 */
	public final native void footer(String footerText) /*-{
		this.footer(headerText);
	}-*/;

	/**
	 * Footer.
	 * 
	 * @param footerText
	 *            the footer text
	 * @param showPageNumber
	 *            the show page number
	 */
	public final native void footer(String footerText, boolean showPageNumber) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.footer(headerText, showPageNumber);
	}-*/;

	/**
	 * Footer.
	 * 
	 * @param footerText
	 *            the footer text
	 * @param showPageNumber
	 *            the show page number
	 * @param position
	 *            the position
	 */
	public final native void footer(String footerText, boolean showPageNumber,
			String position) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.footer(headerText, showPageNumber, position);
	}-*/;

	/**
	 * Sets the alpha.
	 * 
	 * @param alpha
	 *            the new alpha
	 */

	public final native void setAlpha(double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAlpha(alpha);
	}-*/;

	/**
	 * Sets the alpha.
	 * 
	 * @param alpha
	 *            the alpha
	 * @param blendMode
	 *            the blend mode
	 */
	public final void setAlpha(double alpha, Blend blendMode) {
		_setAlpha(alpha, blendMode.value);
	}

	/**
	 * _set alpha.
	 * 
	 * @param alpha
	 *            the alpha
	 * @param blendMode
	 *            the blend mode
	 */
	private final native void _setAlpha(double alpha, String blendMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAlpha(alpha, blendMode);
	}-*/;

	/**
	 * Move to.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void moveTo(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.moveTo(x, y);
	}-*/;

	/**
	 * Line to.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void lineTo(double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineTo(x, y);
	}-*/;

	/**
	 * End.
	 */
	public final native void end() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.end();
	}-*/;

	/**
	 * End.
	 * 
	 * @param closePath
	 *            the close path
	 */
	public final native void end(boolean closePath) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.end(closePath);
	}-*/;

	/**
	 * Draw line.
	 * 
	 * @param x1
	 *            the x1
	 * @param y1
	 *            the y1
	 * @param x2
	 *            the x2
	 * @param y2
	 *            the y2
	 */
	public final native void drawLine(double x1, double y1, double x2, double y2) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawLine(x1, y1, x2, y2);
	}-*/;

	/**
	 * Curve to.
	 * 
	 * @param controlX1
	 *            the control x1
	 * @param controlY1
	 *            the control y1
	 * @param controlX2
	 *            the control x2
	 * @param controlY2
	 *            the control y2
	 * @param finalX3
	 *            the final x3
	 * @param finalY3
	 *            the final y3
	 */
	public final native void curveTo(double controlX1, double controlY1,
			double controlX2, double controlY2, double finalX3, double finalY3) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.curveTo(controlX1, controlY1, controlX2, controlY2, finalX3,
				finalY3);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 */
	public final native void lineStyle(RGBColor color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.lineStyle(color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 */
	public final native void lineStyle(RGBColor color, double thickness) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickness);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 */
	public final native void lineStyle(RGBColor color, double thickness,
			double flatness) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickness, flatness);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 */
	public final native void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickness, flatness, alpha);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 */
	public final native void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickness, flatness, alpha, rule);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 */
	public final void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, Blend blendMode) {
		_lineStyle(color, thickness, flatness, alpha, rule, blendMode.value);
	}

	/**
	 * _line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 */
	private final native void _lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, String blendMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(color, thickness, flatness, alpha, rule, blendMode);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 */
	public final void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, Blend blendMode,
			DashedLine style) {
		_lineStyle(color, thickness, flatness, alpha, rule, blendMode.value,
				style);
	}

	/**
	 * _line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 */
	private final native void _lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, String blendMode,
			DashedLine style) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(color, thickness, flatness, alpha, rule, blendMode,
				style);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 * @param caps
	 *            the caps
	 */
	public final void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, Blend blendMode,
			DashedLine style, Caps caps) {
		_lineStyle(color, thickness, flatness, alpha, rule, blendMode.value,
				style, caps.value);
	}

	/**
	 * _line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 * @param caps
	 *            the caps
	 */
	private final native void _lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, String blendMode,
			DashedLine style, String caps) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(color, thickness, flatness, alpha, rule, blendMode,
				style, caps);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 * @param caps
	 *            the caps
	 * @param joints
	 *            the joints
	 */
	public final void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, Blend blendMode,
			DashedLine style, Caps caps, Joint joints) {
		_lineStyle(color, thickness, flatness, alpha, rule, blendMode.value,
				style, caps.value, joints.value);
	}

	/**
	 * _line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 * @param caps
	 *            the caps
	 * @param joints
	 *            the joints
	 */
	private final native void _lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, String blendMode,
			DashedLine style, String caps, String joints) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(color, thickness, flatness, alpha, rule, blendMode,
				style, caps, joints);
	}-*/;

	/**
	 * Line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 * @param caps
	 *            the caps
	 * @param joints
	 *            the joints
	 * @param miterLimit
	 *            the miter limit
	 */
	public final void lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, Blend blendMode,
			DashedLine style, Caps caps, Joint joints, double miterLimit) {
		_lineStyle(color, thickness, flatness, alpha, rule, blendMode.value,
				style, caps.value, joints.value, miterLimit);
	}

	/**
	 * _line style.
	 * 
	 * @param color
	 *            the color
	 * @param thickness
	 *            the thickness
	 * @param flatness
	 *            the flatness
	 * @param alpha
	 *            the alpha
	 * @param rule
	 *            the rule
	 * @param blendMode
	 *            the blend mode
	 * @param style
	 *            the style
	 * @param caps
	 *            the caps
	 * @param joints
	 *            the joints
	 * @param miterLimit
	 *            the miter limit
	 */
	private final native void _lineStyle(RGBColor color, double thickness,
			double flatness, double alpha, String rule, String blendMode,
			DashedLine style, String caps, String joints, double miterLimit) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.lineStyle(color, thickness, flatness, alpha, rule, blendMode,
				style, caps, joints, miterLimit);
	}-*/;

	/**
	 * Beginn fill.
	 * 
	 * @param color
	 *            the color
	 */
	public final native void beginnFill(RGBColor color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginnFill(color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Beginn fill.
	 * 
	 * @param color
	 *            the color
	 * @param tint
	 *            the tint
	 */
	public final native void beginnFill(RGBColor color, double tint) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginnFill(
						color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						tint);
	}-*/;

	/**
	 * Beginn bitmap fill.
	 * 
	 * @param bitmap
	 *            the bitmap
	 */
	public final native void beginBitmapFill(BitmapData bitmap) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.beginBitmapFill(bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Beginn bitmap fill.
	 * 
	 * @param bitmap
	 *            the bitmap
	 * @param matrix
	 *            the matrix
	 */
	public final native void beginBitmapFill(BitmapData bitmap, Matrix matrix) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.beginBitmapFill(
				bitmap.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * End fill.
	 */
	public final native void endFill() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.endFill();
	}-*/;

	/**
	 * Draw rect.
	 * 
	 * @param rectangle
	 *            the rectangle
	 */
	public final native void drawRect(Rectangle rectangle) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawRect(rectangle.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Save graphics state.
	 */
	public final native void saveGraphicsState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.saveGraphicsState();
	}-*/;

	/**
	 * Restore graphics state.
	 */
	public final native void restoreGraphicsState() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.restoreGraphicsState();
	}-*/;

	/**
	 * Draw round rect.
	 * 
	 * @param rectangle
	 *            the rectangle
	 * @param ellipseWidth
	 *            the ellipse width
	 */
	public final native void drawRoundRect(Rectangle rectangle,
			double ellipseWidth) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawRoundRect(
				rectangle.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				ellipseWidth);
	}-*/;

	/**
	 * Draw round rect complex.
	 * 
	 * @param rectangle
	 *            the rectangle
	 * @param topLeftEllipseWidth
	 *            the top left ellipse width
	 * @param topRightEllipseWidth
	 *            the top right ellipse width
	 * @param bottomLeftEllipseWidth
	 *            the bottom left ellipse width
	 * @param bottomRightEllipseWidth
	 *            the bottom right ellipse width
	 */
	public final native void drawRoundRectComplex(Rectangle rectangle,
			double topLeftEllipseWidth, double topRightEllipseWidth,
			double bottomLeftEllipseWidth, double bottomRightEllipseWidth) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawRoundRectComplex(
				rectangle.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				topLeftEllipseWidth, topRightEllipseWidth,
				bottomLeftEllipseWidth, bottomRightEllipseWidth);
	}-*/;

	/**
	 * Draw ellipse.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param radiusX
	 *            the radius x
	 * @param radiusY
	 *            the radius y
	 */
	public final native void drawEllipse(double x, double y, double radiusX,
			double radiusY) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawEllipse(x, y, radiusX, radiusY);
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
	public final native void drawCircle(double x, double y, double radius) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawCircle(x, y, radius);
	}-*/;

	/**
	 * Draw polygone.
	 * 
	 * @param points
	 *            the points
	 */
	public final native void drawPolygone(double[] points) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawPolygone(points);
	}-*/;

	/**
	 * Draw sector.
	 * 
	 * @param xCenter
	 *            the x center
	 * @param yCenter
	 *            the y center
	 * @param radius
	 *            the radius
	 * @param a
	 *            the a
	 * @param b
	 *            the b
	 */
	public final native void drawSector(double xCenter, double yCenter,
			double radius, double a, double b) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawSector(xCenter, yCenter, radius, a, b);
	}-*/;

	/**
	 * Draw sector.
	 * 
	 * @param xCenter
	 *            the x center
	 * @param yCenter
	 *            the y center
	 * @param radius
	 *            the radius
	 * @param a
	 *            the a
	 * @param b
	 *            the b
	 * @param style
	 *            the style
	 */
	public final native void drawSector(double xCenter, double yCenter,
			double radius, double a, double b, String style) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawSector(xCenter, yCenter, radius, a, b, style);
	}-*/;

	/**
	 * Draw sector.
	 * 
	 * @param xCenter
	 *            the x center
	 * @param yCenter
	 *            the y center
	 * @param radius
	 *            the radius
	 * @param a
	 *            the a
	 * @param b
	 *            the b
	 * @param style
	 *            the style
	 * @param clockWise
	 *            the clock wise
	 */
	public final native void drawSector(double xCenter, double yCenter,
			double radius, double a, double b, String style, boolean clockWise) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawSector(xCenter, yCenter, radius, a, b, style, clockWise);
	}-*/;

	/**
	 * Draw sector.
	 * 
	 * @param xCenter
	 *            the x center
	 * @param yCenter
	 *            the y center
	 * @param radius
	 *            the radius
	 * @param a
	 *            the a
	 * @param b
	 *            the b
	 * @param style
	 *            the style
	 * @param clockWise
	 *            the clock wise
	 * @param alignOrigin
	 *            the align origin
	 */
	public final native void drawSector(double xCenter, double yCenter,
			double radius, double a, double b, String style, boolean clockWise,
			double alignOrigin) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.drawSector(xCenter, yCenter, radius, a, b, style, clockWise,
				alignOrigin);
	}-*/;

	/**
	 * Adds the coda bar.
	 * 
	 * @param codaBar
	 *            the coda bar
	 */
	public final native void addCodaBar(CodaBar codaBar) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addCodaBar(codaBar.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Sets the visible.
	 * 
	 * @param visible
	 *            the new visible
	 */

	public final native void setVisible(String visible) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setVisible(visible);
	}-*/;

	/**
	 * Adds the annotation.
	 * 
	 * @param annotation
	 *            the annotation
	 */

	public final native void addAnnotation(Annotation annotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addAnnotation(annotation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Adds the bookmark.
	 * 
	 * @param text
	 *            the text
	 */
	public final native void addBookmark(String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBookmark(text);
	}-*/;

	/**
	 * Adds the bookmark.
	 * 
	 * @param text
	 *            the text
	 * @param level
	 *            the level
	 */
	public final native void addBookmark(String text, int level) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBookmark(text, level);
	}-*/;

	/**
	 * Adds the bookmark.
	 * 
	 * @param text
	 *            the text
	 * @param level
	 *            the level
	 * @param y
	 *            the y
	 */
	public final native void addBookmark(String text, int level, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBookmark(text, level, y);
	}-*/;

	/**
	 * Adds the bookmark.
	 * 
	 * @param text
	 *            the text
	 * @param level
	 *            the level
	 * @param y
	 *            the y
	 * @param color
	 *            the color
	 */
	public final native void addBookmark(String text, int level, double y,
			RGBColor color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBookmark(text, level, y,
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Adds the link.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param link
	 *            the link
	 */
	public final native void addLink(double x, double y, double width,
			double height, ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addLink(x, y, width, height, link
				.@com.ait.toolkit.flash.alivepdf.client.links.ILink::asILink());
	}-*/;

	/**
	 * Adds the link.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param link
	 *            the link
	 * @param highliht
	 *            the highliht
	 */
	public final void addLink(double x, double y, double width, double height,
			ILink link, Highlight highliht) {
		_addLink(x, y, width, height, link, highliht.value);
	}

	/**
	 * _add link.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param link
	 *            the link
	 * @param highliht
	 *            the highliht
	 */
	private final native void _addLink(double x, double y, double width,
			double height, ILink link, String highliht) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addLink(
						x,
						y,
						width,
						height,
						link.@com.ait.toolkit.flash.alivepdf.client.links.ILink::asILink()(),
						highliht);
	}-*/;

	/**
	 * Gets the current internal link.
	 * 
	 * @return the current internal link
	 */
	public final native InternalLink getCurrentInternalLink() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getCurrentInternalLink();
		return @com.ait.toolkit.flash.alivepdf.client.links.InternalLink::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Adds the transition.
	 * 
	 * @param style
	 *            the style
	 */
	public final void addTransition(Transition style) {
		_addTransition(style.value);
	}

	/**
	 * _add transition.
	 * 
	 * @param style
	 *            the style
	 */
	private final native void _addTransition(String style) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addTransition(style);
	}-*/;

	/**
	 * Adds the transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 */
	public final void addTransition(Transition style, double duration) {
		_addTransition(style.value, duration);
	}

	/**
	 * _add transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 */
	private final native void _addTransition(String style, double duration) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addTransition(style, duration);
	}-*/;

	/**
	 * Adds the transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 * @param dimension
	 *            the dimension
	 */
	public final void addTransition(Transition style, double duration,
			Dimension dimension) {
		_addTransition(style.value, duration, dimension.value);
	}

	/**
	 * _add transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 * @param dimension
	 *            the dimension
	 */
	private final native void _addTransition(String style, double duration,
			String dimension) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addTransition(style, duration, dimension);
	}-*/;

	/**
	 * Adds the transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 * @param dimension
	 *            the dimension
	 * @param motionDirection
	 *            the motion direction
	 */
	public final void addTransition(Transition style, double duration,
			Dimension dimension, MotionDirection motionDirection) {
		_addTransition(style.value, duration, dimension.value,
				motionDirection.value);
	}

	/**
	 * _add transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 * @param dimension
	 *            the dimension
	 * @param motionDirection
	 *            the motion direction
	 */
	private final native void _addTransition(String style, double duration,
			String dimension, String motionDirection) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addTransition(style, duration, dimension, motionDirection);
	}-*/;

	/**
	 * Adds the transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 * @param dimension
	 *            the dimension
	 * @param motionDirection
	 *            the motion direction
	 * @param transitionDirection
	 *            the transition direction
	 */
	public final void addTransition(Transition style, double duration,
			Dimension dimension, MotionDirection motionDirection,
			TransitionDirection transitionDirection) {
		_addTransition(style.value, duration, dimension.value,
				motionDirection.value, transitionDirection.value);
	}

	/**
	 * _add transition.
	 * 
	 * @param style
	 *            the style
	 * @param duration
	 *            the duration
	 * @param dimension
	 *            the dimension
	 * @param motionDirection
	 *            the motion direction
	 * @param transitionDirection
	 *            the transition direction
	 */
	private final native void _addTransition(String style, double duration,
			String dimension, String motionDirection, int transitionDirection) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addTransition(style, duration, dimension, motionDirection,
				transitionDirection);
	}-*/;

	/**
	 * Sets the default viewer preferences.
	 */
	public final native void setDefaultViewerPreferences() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences();
	}-*/;

	/**
	 * Sets the default preference.
	 * 
	 * @param toolbar
	 *            the new default preference
	 */
	public final void setDefaultPreference(ToolBar toolbar) {
		_setViewerPreferences(toolbar.value);
	}

	/**
	 * _set viewer preferences.
	 * 
	 * @param toolbar
	 *            the toolbar
	 */
	private final native void _setViewerPreferences(String toolbar) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(toolbar);
	}-*/;

	/**
	 * Sets the default preference.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 */
	public final void setDefaultPreference(ToolBar toolbar, MenuBar menubar) {
		_setViewerPreferences(toolbar.value, menubar.value);
	}

	/**
	 * _set viewer preferences.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 */
	private final native void _setViewerPreferences(String toolbar,
			String menubar) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(toolbar, menubar);
	}-*/;

	/**
	 * Sets the default preference.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 */
	public final void setDefaultPreference(ToolBar toolbar, MenuBar menubar,
			WindowUI windowUI) {
		_setViewerPreferences(toolbar.value, menubar.value, windowUI.value);
	}

	/**
	 * _set viewer preferences.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 */
	private final native void _setViewerPreferences(String toolbar,
			String menubar, String windowUI) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(toolbar, menubar, windowUI);
	}-*/;

	/**
	 * Sets the default preference.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 * @param fitWindow
	 *            the fit window
	 */
	public final void setDefaultPreference(ToolBar toolbar, MenuBar menubar,
			WindowUI windowUI, FitWindow fitWindow) {
		_setViewerPreferences(toolbar.value, menubar.value, windowUI.value,
				fitWindow.value);
	}

	/**
	 * _set viewer preferences.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 * @param fitWindow
	 *            the fit window
	 */
	private final native void _setViewerPreferences(String toolbar,
			String menubar, String windowUI, String fitWindow) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(toolbar, menubar, windowUI, fitWindow);
	}-*/;

	/**
	 * Sets the default preference.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 * @param fitWindow
	 *            the fit window
	 * @param centerWindow
	 *            the center window
	 */
	public final void setDefaultPreference(ToolBar toolbar, MenuBar menubar,
			WindowUI windowUI, FitWindow fitWindow, CenterWindow centerWindow) {
		_setViewerPreferences(toolbar.value, menubar.value, windowUI.value,
				fitWindow.value, centerWindow.value);
	}

	/**
	 * _set viewer preferences.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 * @param fitWindow
	 *            the fit window
	 * @param centeredWindow
	 *            the centered window
	 */
	private final native void _setViewerPreferences(String toolbar,
			String menubar, String windowUI, String fitWindow,
			String centeredWindow) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(toolbar, menubar, windowUI, fitWindow,
				centeredWindow);
	}-*/;

	/**
	 * Sets the default preference.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 * @param fitWindow
	 *            the fit window
	 * @param centerWindow
	 *            the center window
	 * @param displayTitle
	 *            the display title
	 */
	public final void setDefaultPreference(ToolBar toolbar, MenuBar menubar,
			WindowUI windowUI, FitWindow fitWindow, CenterWindow centerWindow,
			Title displayTitle) {
		_setViewerPreferences(toolbar.value, menubar.value, windowUI.value,
				fitWindow.value, centerWindow.value, displayTitle.value);
	}

	/**
	 * _set viewer preferences.
	 * 
	 * @param toolbar
	 *            the toolbar
	 * @param menubar
	 *            the menubar
	 * @param windowUI
	 *            the window ui
	 * @param fitWindow
	 *            the fit window
	 * @param centeredWindow
	 *            the centered window
	 * @param displayTitle
	 *            the display title
	 */
	private final native void _setViewerPreferences(String toolbar,
			String menubar, String windowUI, String fitWindow,
			String centeredWindow, String displayTitle) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(toolbar, menubar, windowUI, fitWindow,
				centeredWindow, displayTitle);
	}-*/;

	/**
	 * Sets the starting page.
	 * 
	 * @param index
	 *            the new starting page
	 */
	public final native void setStartingPage(int index) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setStartingPage(index);
	}-*/;

	/**
	 * Font API
	 */

	/*
	 * public final native IFont addFont(IFont font) /*-{ this.addFont(font); }-
	 */;

	/**
	 * Sets the font.
	 * 
	 * @param font
	 *            the new font
	 */
	public final native void setFont(IFont font) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setFont(font.@com.ait.toolkit.flash.alivepdf.client.fonts.IFont::asIFont()());
	}-*/;

	/**
	 * Sets the font.
	 * 
	 * @param font
	 *            the font
	 * @param size
	 *            the size
	 */
	public final native void setFont(IFont font, int size) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setFont(
						font.@com.ait.toolkit.flash.alivepdf.client.fonts.IFont::asIFont()(),
						size);
	}-*/;

	/**
	 * Sets the font.
	 * 
	 * @param font
	 *            the font
	 * @param size
	 *            the size
	 * @param underlined
	 *            the underlined
	 */
	public final native void setFont(IFont font, int size, boolean underlined) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setFont(
						font.@com.ait.toolkit.flash.alivepdf.client.fonts.IFont::asIFont()(),
						size, underlined);
	}-*/;

	/**
	 * Sets the font size.
	 * 
	 * @param size
	 *            the new font size
	 */
	public final native void setFontSize(int size) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setFontSize(size);
	}-*/;

	/**
	 * Removes the font.
	 * 
	 * @param font
	 *            the font
	 */
	public final native void removeFont(IFont font) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.removeFont(font.@com.ait.toolkit.flash.alivepdf.client.fonts.IFont::asIFont()());
	}-*/;

	/**
	 * Gets the total fonts.
	 * 
	 * @return the total fonts
	 */
	public final native int getTotalFonts() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.totalFonts;
	}-*/;

	/**
	 * Adds the text.
	 * 
	 * @param text
	 *            the text
	 */

	public final void addText(String text) {
		this.addText(text, 10, 10);
	}

	/**
	 * Adds the text.
	 * 
	 * @param text
	 *            the text
	 * @param x
	 *            the x
	 */
	public final native void addText(String text, double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addText(text, x);
	}-*/;

	/**
	 * Adds the text.
	 * 
	 * @param text
	 *            the text
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void addText(String text, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addText(text, x, y);
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the new text style
	 */
	public final native void setTextStyle(RGBColor color) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.textStyle(color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the color
	 * @param alpha
	 *            the alpha
	 */
	public final native void setTextStyle(RGBColor color, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.textStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				alpha);
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the color
	 * @param alpha
	 *            the alpha
	 * @param rendering
	 *            the rendering
	 */
	public final native void setTextStyle(RGBColor color, double alpha,
			int rendering) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.textStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				alpha, rendering);
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the color
	 * @param alpha
	 *            the alpha
	 * @param rendering
	 *            the rendering
	 * @param wordSpace
	 *            the word space
	 */
	public final native void setTextStyle(RGBColor color, double alpha,
			int rendering, double wordSpace) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.textStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				alpha, rendering, wordSpace);
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the color
	 * @param alpha
	 *            the alpha
	 * @param rendering
	 *            the rendering
	 * @param wordSpace
	 *            the word space
	 * @param characterSpace
	 *            the character space
	 */
	public final native void setTextStyle(RGBColor color, double alpha,
			int rendering, double wordSpace, double characterSpace) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.textStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				alpha, rendering, wordSpace, characterSpace);
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the color
	 * @param alpha
	 *            the alpha
	 * @param rendering
	 *            the rendering
	 * @param wordSpace
	 *            the word space
	 * @param characterSpace
	 *            the character space
	 * @param scale
	 *            the scale
	 */
	public final native void setTextStyle(RGBColor color, double alpha,
			int rendering, double wordSpace, double characterSpace, double scale) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.textStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				alpha, rendering, wordSpace, characterSpace, scale);
	}-*/;

	/**
	 * Sets the text style.
	 * 
	 * @param color
	 *            the color
	 * @param alpha
	 *            the alpha
	 * @param rendering
	 *            the rendering
	 * @param wordSpace
	 *            the word space
	 * @param characterSpace
	 *            the character space
	 * @param scale
	 *            the scale
	 * @param leading
	 *            the leading
	 */
	public final native void setTextStyle(RGBColor color, double alpha,
			int rendering, double wordSpace, double characterSpace,
			double scale, double leading) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.textStyle(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				alpha, rendering, wordSpace, characterSpace, scale, leading);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 */
	public final native void addCell(double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final native void addCell(double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 */
	public final native void addCell(double width, double height, String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height, text);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 */
	public final native void addCell(double width, double height, String text,
			double border) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height, text, border);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 */
	public final native void addCell(double width, double height, String text,
			double border, double ln) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height, text, border, ln);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	public final void addCell(double width, double height, String text,
			double border, double ln, Align align) {
		_addCell(width, height, text, border, ln, align.value);
	}

	/**
	 * _add cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	private final native void _addCell(double width, double height,
			String text, double border, double ln, String align) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height, text, border, ln, align);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	public final void addCell(double width, double height, String text,
			double border, double ln, Align align, double fill) {
		_addCell(width, height, text, border, ln, align.value, fill);
	}

	/**
	 * _add cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	private final native void _addCell(double width, double height,
			String text, double border, double ln, String align, double fill) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height, text, border, ln, align, fill);
	}-*/;

	/**
	 * Adds the cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	public final void addCell(double width, double height, String text,
			double border, double ln, Align align, double fill, ILink link) {
		_addCell(width, height, text, border, ln, align.value, fill, link);
	}

	/**
	 * _add cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	private final native void _addCell(double width, double height,
			String text, double border, double ln, String align, double fill,
			ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCell(width, height, text, border, ln, align, fill, link);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 */
	public final native void addCellFitScale(double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final native void addCellFitScale(double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width, height);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 */
	public final native void addCellFitScale(double width, double height,
			String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width, height, text);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 */
	public final native void addCellFitScale(double width, double height,
			String text, double border) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width, height, text, border);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 */
	public final native void addCellFitScale(double width, double height,
			String text, double border, double ln) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width, height, text, border, ln);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	public final void addCellFitScale(double width, double height, String text,
			double border, double ln, Align align) {
		_addCellFitScale(width, height, text, border, ln, align.value);
	}

	/**
	 * _add cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	private final native void _addCellFitScale(double width, double height,
			String text, double border, double ln, String align) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width, height, text, border, ln, align);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	public final void addCellFitScale(double width, double height, String text,
			double border, double ln, Align align, double fill) {
		_addCellFitScale(width, height, text, border, ln, align.value, fill);
	}

	/**
	 * _add cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	private final native void _addCellFitScale(double width, double height,
			String text, double border, double ln, String align, double fill) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScale(width, height, text, border, ln, align, fill);
	}-*/;

	/**
	 * Adds the cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	public final void addCellFitScale(double width, double height, String text,
			double border, double ln, Align align, double fill, ILink link) {
		_addCellFitScale(width, height, text, border, ln, align.value, fill,
				link);
	}

	/**
	 * _add cell fit scale.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	private final native void _addCellFitScale(double width, double height,
			String text, double border, double ln, String align, double fill,
			ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addCellFitScale(width, height, text, border, ln, align, fill,
						link);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 */
	public final native void addCellFitScaleForce(double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final native void addCellFitScaleForce(double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width, height);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 */
	public final native void addCellFitScaleForce(double width, double height,
			String text) /*-{
		this.addCellFitScaleForce(width, height, text);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 */
	public final native void addCellFitScaleForce(double width, double height,
			String text, double border) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width, height, text, border);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 */
	public final native void addCellFitScaleForce(double width, double height,
			String text, double border, double ln) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width, height, text, border, ln);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	public final void addCellFitScaleForce(double width, double height,
			String text, double border, double ln, Align align) {
		_addCellFitScaleForce(width, height, text, border, ln, align.value);
	}

	/**
	 * _add cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	private final native void _addCellFitScaleForce(double width,
			double height, String text, double border, double ln, String align) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width, height, text, border, ln, align);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	public final void addCellFitScaleForce(double width, double height,
			String text, double border, double ln, Align align, double fill) {
		_addCellFitScaleForce(width, height, text, border, ln, align.value,
				fill);
	}

	/**
	 * _add cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	private final native void _addCellFitScaleForce(double width,
			double height, String text, double border, double ln, String align,
			double fill) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width, height, text, border, ln, align, fill);
	}-*/;

	/**
	 * Adds the cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	public final void addCellFitScaleForce(double width, double height,
			String text, double border, double ln, Align align, double fill,
			ILink link) {
		_addCellFitScaleForce(width, height, text, border, ln, align.value,
				fill, link);
	}

	/**
	 * _add cell fit scale force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	private final native void _addCellFitScaleForce(double width,
			double height, String text, double border, double ln, String align,
			double fill, ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitScaleForce(width, height, text, border, ln, align, fill,
				link);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 */
	public final native void addCellFitSpace(double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final native void addCellFitSpace(double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width, height);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 */
	public final native void addCellFitSpace(double width, double height,
			String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width, height, text);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 */
	public final native void addCellFitSpace(double width, double height,
			String text, double border) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width, height, text, border);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 */
	public final native void addCellFitSpace(double width, double height,
			String text, double border, double ln) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width, height, text, border, ln);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	public final void addCellFitSpace(double width, double height, String text,
			double border, double ln, Align align) {
		_addCellFitSpace(width, height, text, border, ln, align.value);
	}

	/**
	 * _add cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	private final native void _addCellFitSpace(double width, double height,
			String text, double border, double ln, String align) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width, height, text, border, ln, align);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	public final void addCellFitSpace(double width, double height, String text,
			double border, double ln, Align align, double fill) {
		_addCellFitSpace(width, height, text, border, ln, align.value, fill);
	}

	/**
	 * _add cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	private final native void _addCellFitSpace(double width, double height,
			String text, double border, double ln, String align, double fill) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpace(width, height, text, border, ln, align, fill);
	}-*/;

	/**
	 * Adds the cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	public final void addCellFitSpace(double width, double height, String text,
			double border, double ln, Align align, double fill, ILink link) {
		_addCellFitSpace(width, height, text, border, ln, align.value, fill,
				link);
	}

	/**
	 * _add cell fit space.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	private final native void _addCellFitSpace(double width, double height,
			String text, double border, double ln, String align, double fill,
			ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addCellFitSpace(width, height, text, border, ln, align, fill,
						link);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 */
	public final native void addCellFitSpaceForce(double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final native void addCellFitSpaceForce(double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 */
	public final native void addCellFitSpaceForce(double width, double height,
			String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height, text);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 */
	public final native void addCellFitSpaceForce(double width, double height,
			String text, double border) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height, text, border);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 */
	public final native void addCellFitSpaceForce(double width, double height,
			String text, double border, double ln) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height, text, border, ln);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	public final void addCellFitSpaceForce(double width, double height,
			String text, double border, double ln, Align align) {
		_addCellFitSpaceForce(width, height, text, border, ln, align.value);
	}

	/**
	 * _add cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 */
	private final native void _addCellFitSpaceForce(double width,
			double height, String text, double border, double ln, String align) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height, text, border, ln, align);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	public final void addCellFitSpaceForce(double width, double height,
			String text, double border, double ln, Align align, double fill) {
		_addCellFitSpaceForce(width, height, text, border, ln, align.value,
				fill);
	}

	/**
	 * _add cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 */
	private final native void _addCellFitSpaceForce(double width,
			double height, String text, double border, double ln, String align,
			double fill) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height, text, border, ln, align, fill);
	}-*/;

	/**
	 * Adds the cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	public final void addCellFitSpaceForce(double width, double height,
			String text, double border, double ln, Align align, double fill,
			ILink link) {
		_addCellFitSpaceForce(width, height, text, border, ln, align.value,
				fill, link);
	}

	/**
	 * _add cell fit space force.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param ln
	 *            the ln
	 * @param align
	 *            the align
	 * @param fill
	 *            the fill
	 * @param link
	 *            the link
	 */
	private final native void _addCellFitSpaceForce(double width,
			double height, String text, double border, double ln, String align,
			double fill, ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCellFitSpaceForce(width, height, text, border, ln, align, fill,
				link);
	}-*/;

	/**
	 * Adds the multi cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 */
	public final native void addMultiCell(double width, double height,
			String text) /*-{
		this.addMultiCell(width, height, text);
	}-*/;

	/**
	 * Adds the multi cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 */
	public final native void addMultiCell(double width, double height,
			String text, double border) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addMultiCell(width, height, text, border);
	}-*/;

	/**
	 * Adds the cell multi crll.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param align
	 *            the align
	 */
	public final void addCellMultiCrll(double width, double height,
			String text, double border, Align align) {
		_addMultiCell(width, height, text, border, align.value);
	}

	/**
	 * _add multi cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param align
	 *            the align
	 */
	private final native void _addMultiCell(double width, double height,
			String text, double border, String align) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addMultiCell(width, height, text, border, align);
	}-*/;

	/**
	 * Adds the cell multi crll.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param align
	 *            the align
	 * @param filled
	 *            the filled
	 */
	public final void addCellMultiCrll(double width, double height,
			String text, double border, Align align, int filled) {
		_addMultiCell(width, height, text, border, align.value, filled);
	}

	/**
	 * _add multi cell.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param text
	 *            the text
	 * @param border
	 *            the border
	 * @param align
	 *            the align
	 * @param filled
	 *            the filled
	 */
	private final native void _addMultiCell(double width, double height,
			String text, double border, String align, int filled) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addMultiCell(width, height, text, border, align, filled);
	}-*/;

	/**
	 * Write text.
	 * 
	 * @param text
	 *            the text
	 */
	public final void writeText(String text) {
		this.writeText(10, text);
	}

	/**
	 * Write text.
	 * 
	 * @param lineHeight
	 *            the line height
	 * @param text
	 *            the text
	 */
	public final native void writeText(double lineHeight, String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeText(lineHeight, text);
	}-*/;

	/**
	 * Write text.
	 * 
	 * @param lineHeight
	 *            the line height
	 * @param text
	 *            the text
	 * @param link
	 *            the link
	 */
	public final native void writeText(double lineHeight, String text,
			ILink link) /*-{
		this.writeText(linHeight, text, link);
	}-*/;

	/**
	 * Write flash html text.
	 * 
	 * @param text
	 *            the text
	 */
	public final void writeFlashHtmlText(String text) {
		this.writeFlashHtmlText(10, text);
	}

	/**
	 * Write flash html text.
	 * 
	 * @param lineHeight
	 *            the line height
	 * @param text
	 *            the text
	 */
	public final native void writeFlashHtmlText(double lineHeight, String text) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeFlashHtmlText(lineHeight, text);
	}-*/;

	/**
	 * Write flash html text.
	 * 
	 * @param lineHeight
	 *            the line height
	 * @param text
	 *            the text
	 * @param link
	 *            the link
	 */
	public final native void writeFlashHtmlText(double lineHeight, String text,
			ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeFlashHtmlText(lineHeight, text, link);
	}-*/;

	/**
	 * Adds the grid.
	 * 
	 * @param grid
	 *            the grid
	 */

	public final void addGrid(Grid grid) {
		addGrid(grid, 10, 10);
	}

	/**
	 * Adds the grid.
	 * 
	 * @param grid
	 *            the grid
	 * @param x
	 *            the x
	 */
	public final native void addGrid(Grid grid, int x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addGrid(
						grid.@com.ait.toolkit.flash.alivepdf.client.grid.Grid::getJsObj()(),
						x);
	}-*/;

	/**
	 * Adds the grid.
	 * 
	 * @param grid
	 *            the grid
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void addGrid(Grid grid, int x, int y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addGrid(
						grid.@com.ait.toolkit.flash.alivepdf.client.grid.Grid::getJsObj()(),
						x, y);
	}-*/;

	/**
	 * Adds the grid.
	 * 
	 * @param grid
	 *            the grid
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param repeatHeader
	 *            the repeat header
	 */
	public final native void addGrid(Grid grid, int x, int y,
			boolean repeatHeader) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addGrid(
						grid.@com.ait.toolkit.flash.alivepdf.client.grid.Grid::getJsObj()(),
						x, y, repeatHeader);
	}-*/;

	/**
	 * Sets the grid position on next pages.
	 * 
	 * @param xvalue
	 *            the new grid position on next pages
	 */
	public final native void setGridPositionOnNextPages(double xvalue) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setGridPositionOnNextPages(xvalue);
	}-*/;

	/**
	 * Sets the grid position on next pages.
	 * 
	 * @param xvalue
	 *            the xvalue
	 * @param yvalue
	 *            the yvalue
	 */
	public final native void setGridPositionOnNextPages(double xvalue,
			double yvalue) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setGridPositionOnNextPages(xvalue, yvalue);
	}-*/;

	/**
	 * Save.
	 * 
	 * @return the byte array
	 */

	public final ByteArray save() {
		return this.save(Method.LOCAL);
	}

	/**
	 * Save.
	 * 
	 * @param method
	 *            the method
	 * @return the byte array
	 */
	public final ByteArray save(Method method) {
		return _save(method.value);
	}

	/**
	 * _save.
	 * 
	 * @param method
	 *            the method
	 * @return the byte array
	 */
	private final native ByteArray _save(String method) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.save(method);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @return the byte array
	 */
	public final ByteArray save(Method method, String url) {
		return _save(method.value, url);
	}

	/**
	 * _save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @return the byte array
	 */
	private final native ByteArray _save(String method, String url) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.save(method, url);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @param downloadMethod
	 *            the download method
	 * @return the byte array
	 */
	public final ByteArray save(Method method, String url,
			Download downloadMethod) {
		return _save(method.value, url, downloadMethod.value);
	}

	/**
	 * _save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @param downloadMethod
	 *            the download method
	 * @return the byte array
	 */
	private final native ByteArray _save(String method, String url,
			String downloadMethod) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.save(method, url, downloadMethod);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @param downloadMethod
	 *            the download method
	 * @param fileName
	 *            the file name
	 * @return the byte array
	 */
	public final ByteArray save(Method method, String url,
			Download downloadMethod, String fileName) {
		return _save(method.value, url, downloadMethod.value, fileName);
	}

	/**
	 * _save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @param downloadMethod
	 *            the download method
	 * @param fileName
	 *            the file name
	 * @return the byte array
	 */
	private final native ByteArray _save(String method, String url,
			String downloadMethod, String fileName) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.save(method, url, downloadMethod, fileName);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @param downloadMethod
	 *            the download method
	 * @param fileName
	 *            the file name
	 * @param frame
	 *            the frame
	 * @return the byte array
	 */
	public final ByteArray save(Method method, String url,
			Download downloadMethod, String fileName, String frame) {
		return _save(method.value, url, downloadMethod.value, fileName, frame);
	}

	/**
	 * _save.
	 * 
	 * @param method
	 *            the method
	 * @param url
	 *            the url
	 * @param downloadMethod
	 *            the download method
	 * @param fileName
	 *            the file name
	 * @param frame
	 *            the frame
	 * @return the byte array
	 */
	private final native ByteArray _save(String method, String url,
			String downloadMethod, String fileName, String frame) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.save(method, url, downloadMethod, fileName, frame);
		return @com.ait.toolkit.flash.core.client.utils.ByteArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Adds the java script.
	 * 
	 * @param script
	 *            the script
	 */
	public final native void addJavaScript(String script) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addJavaScript(script);
	}-*/;

	/**
	 * Adds the eps image.
	 * 
	 * @param stream
	 *            the stream
	 */
	public final native void addEPSImage(ByteArray stream) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEPSImage(stream.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Adds the eps image.
	 * 
	 * @param stream
	 *            the stream
	 * @param x
	 *            the x
	 */
	public final native void addEPSImage(ByteArray stream, double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addEPSImage(
				stream.@com.ait.toolkit.core.client.JsObject::getJsObj()(), x);
	}-*/;

	/**
	 * Adds the eps image.
	 * 
	 * @param stream
	 *            the stream
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void addEPSImage(ByteArray stream, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addEPSImage(
				stream.@com.ait.toolkit.core.client.JsObject::getJsObj()(), x,
				y);
	}-*/;

	/**
	 * Adds the eps image.
	 * 
	 * @param stream
	 *            the stream
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param w
	 *            the w
	 */
	public final native void addEPSImage(ByteArray stream, double x, double y,
			double w) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addEPSImage(
				stream.@com.ait.toolkit.core.client.JsObject::getJsObj()(), x,
				y, w);
	}-*/;

	/**
	 * Adds the eps image.
	 * 
	 * @param stream
	 *            the stream
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param w
	 *            the w
	 * @param h
	 *            the h
	 */
	public final native void addEPSImage(ByteArray stream, double x, double y,
			double w, double h) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addEPSImage(
				stream.@com.ait.toolkit.core.client.JsObject::getJsObj()(), x,
				y, w, h);
	}-*/;

	/**
	 * Adds the eps image.
	 * 
	 * @param stream
	 *            the stream
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param w
	 *            the w
	 * @param h
	 *            the h
	 * @param useBoundingBox
	 *            the use bounding box
	 */
	public final native void addEPSImage(ByteArray stream, double x, double y,
			double w, double h, boolean useBoundingBox) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addEPSImage(
				stream.@com.ait.toolkit.core.client.JsObject::getJsObj()(), x,
				y, w, h, useBoundingBox);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 */

	public final void addImageStream(ByteArray imageBytes, ColorSpace colorSpace) {
		_addImageStream(imageBytes, colorSpace.value);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addImageStream(
				imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				colorSpace);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize) {
		_addImageStream(imageBytes, colorSpace.value, resize);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()());
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x) {
		_addImageStream(imageBytes, colorSpace.value, resize, x);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y);
	}

	public final void addImageStream(ByteArray imageBytes, double x) {
		this.addImageStream(imageBytes, ColorSpace.DEVICE_RGB, new Resize(
				Mode.FIT_TO_PAGE, Position.LEFT), x);
	}

	public final void addImageStream(ByteArray imageBytes, double x, double y) {
		this.addImageStream(imageBytes, ColorSpace.DEVICE_RGB, new Resize(
				Mode.FIT_TO_PAGE, Position.LEFT), x, y);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x, y);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y,
			double width) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y, width);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y,
			double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x, y, width);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y,
			double width, double height) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y, width,
				height);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y,
			double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x, y, width, height);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y,
			double width, double height, double rotation) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y, width,
				height, rotation);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y,
			double width, double height, double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x, y, width, height, rotation);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y,
			double width, double height, double rotation, double alpha) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y, width,
				height, rotation, alpha);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y,
			double width, double height, double rotation, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x, y, width, height, rotation, alpha);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param blendMode
	 *            the blend mode
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y,
			double width, double height, double rotation, double alpha,
			BlendMode blendMode) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y, width,
				height, rotation, alpha, blendMode.value);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param blendMode
	 *            the blend mode
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y,
			double width, double height, double rotation, double alpha,
			String blendMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x, y, width, height, rotation, alpha, blendMode);
	}-*/;

	/**
	 * Adds the image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resize
	 *            the resize
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param blendMode
	 *            the blend mode
	 * @param link
	 *            the link
	 */
	public final void addImageStream(ByteArray imageBytes,
			ColorSpace colorSpace, Resize resize, double x, double y,
			double width, double height, double rotation, double alpha,
			BlendMode blendMode, ILink link) {
		_addImageStream(imageBytes, colorSpace.value, resize, x, y, width,
				height, rotation, alpha, blendMode.value, link);
	}

	/**
	 * _add image stream.
	 * 
	 * @param imageBytes
	 *            the image bytes
	 * @param colorSpace
	 *            the color space
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param blendMode
	 *            the blend mode
	 * @param link
	 *            the link
	 */
	private final native void _addImageStream(ByteArray imageBytes,
			String colorSpace, Resize resizeMode, double x, double y,
			double width, double height, double rotation, double alpha,
			String blendMode, ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImageStream(
						imageBytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						colorSpace,
						resizeMode.@com.ait.toolkit.flash.alivepdf.client.layout.Resize::getJsObj()(),
						x,
						y,
						width,
						height,
						rotation,
						alpha,
						blendMode,
						link.@com.ait.toolkit.flash.alivepdf.client.links.ILink::asILink()());
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 */
	public final native void addImage(DisplayObject displayObject) /*-{
		this.addImage(displayObject);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode) /*-{
		this.addImage(displayObject, resizeMode);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x) /*-{
		this.addImage(displayObject, resizeMode, x);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 */
	public final native void addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 */
	public final void addImage(DisplayObject displayObject, Resize resizeMode,
			double x, double y, double width, double height, double rotation,
			double alpha, boolean keepTransformation, ImageFormat imageFormat) {
		_addImage(displayObject, resizeMode, x, y, width, height, rotation,
				alpha, keepTransformation, imageFormat.value);
	}

	/**
	 * _add image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 */
	private final native void _addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 * @param quality
	 *            the quality
	 */
	public final void addImage(DisplayObject displayObject, Resize resizeMode,
			double x, double y, double width, double height, double rotation,
			double alpha, boolean keepTransformation, ImageFormat imageFormat,
			double quality) {
		_addImage(displayObject, resizeMode, x, y, width, height, rotation,
				alpha, keepTransformation, imageFormat.value, quality);
	}

	/**
	 * _add image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 * @param quality
	 *            the quality
	 */
	private final native void _addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat, double quality) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat, quality);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 * @param quality
	 *            the quality
	 * @param blendMode
	 *            the blend mode
	 */
	public final void addImage(DisplayObject displayObject, Resize resizeMode,
			double x, double y, double width, double height, double rotation,
			double alpha, boolean keepTransformation, ImageFormat imageFormat,
			double quality, Blend blendMode) {
		_addImage(displayObject, resizeMode, x, y, width, height, rotation,
				alpha, keepTransformation, imageFormat.value, quality,
				blendMode.value);
	}

	/**
	 * _add image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 * @param quality
	 *            the quality
	 * @param blendMode
	 *            the blend mode
	 */
	private final native void _addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat, double quality, String blendMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat, quality, blendMode);
	}-*/;

	/**
	 * Adds the image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 * @param quality
	 *            the quality
	 * @param blendMode
	 *            the blend mode
	 * @param link
	 *            the link
	 */
	public final void addImage(DisplayObject displayObject, Resize resizeMode,
			double x, double y, double width, double height, double rotation,
			double alpha, boolean keepTransformation, ImageFormat imageFormat,
			double quality, Blend blendMode, ILink link) {
		_addImage(displayObject, resizeMode, x, y, width, height, rotation,
				alpha, keepTransformation, imageFormat.value, quality,
				blendMode.value, link);
	}

	/**
	 * _add image.
	 * 
	 * @param displayObject
	 *            the display object
	 * @param resizeMode
	 *            the resize mode
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param rotation
	 *            the rotation
	 * @param alpha
	 *            the alpha
	 * @param keepTransformation
	 *            the keep transformation
	 * @param imageFormat
	 *            the image format
	 * @param quality
	 *            the quality
	 * @param blendMode
	 *            the blend mode
	 * @param link
	 *            the link
	 */
	private final native void _addImage(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat, double quality, String blendMode, ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addImage(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x,
						y,
						width,
						height,
						rotation,
						alpha,
						keepTransformation,
						imageFormat,
						quality,
						blendMode,
						link.@com.ait.toolkit.flash.alivepdf.client.links.ILink::asILink()());
	}-*/;

	public final void addDisplayObject(DisplayObject displayObject) {
		_addDisplayObject(displayObject);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode) {
		_addDisplayObject(displayObject, resizeMode);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x) {
		_addDisplayObject(displayObject, resizeMode, x);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y) {
		_addDisplayObject(displayObject, resizeMode, x, y);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width) {
		_addDisplayObject(displayObject, resizeMode, x, y, width);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation, alpha);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation, alpha, keepTransformation);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			ImageFormat imageFormat) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation, alpha, keepTransformation, imageFormat.value);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			ImageFormat imageFormat, double quality) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation, alpha, keepTransformation, imageFormat.value, quality);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			ImageFormat imageFormat, double quality, Blend blendMode) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation, alpha, keepTransformation, imageFormat.value,
				quality, blendMode.value);
	}

	public final void addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			ImageFormat imageFormat, double quality, Blend blendMode, ILink link) {
		_addDisplayObject(displayObject, resizeMode, x, y, width, height,
				rotation, alpha, keepTransformation, imageFormat.value,
				quality, blendMode.value, link);
	}

	private final native void _addDisplayObject(DisplayObject displayObject) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat, double quality) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat, quality);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat, double quality, String blendMode) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat, quality, blendMode);
	}-*/;

	private final native void _addDisplayObject(DisplayObject displayObject,
			Resize resizeMode, double x, double y, double width, double height,
			double rotation, double alpha, boolean keepTransformation,
			String imageFormat, double quality, String blendMode, ILink link) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addDisplayObject(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x,
						y,
						width,
						height,
						rotation,
						alpha,
						keepTransformation,
						imageFormat,
						quality,
						blendMode,
						link.@com.ait.toolkit.flash.alivepdf.client.links.ILink::asILink()());
	}-*/;

	public final native void addBitmapData(BitmapData data)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(data.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBitmapData(
				data.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize,
			double x)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBitmapData(
				data.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				x);
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize,
			double x, double y)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBitmapData(
				data.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				x, y);
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize,
			double x, double y, double width)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width);
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize,
			double x, double y, double width, double height)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height);
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize,
			double x, double y, double width, double height, double rotation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation);
	}-*/;

	public final native void addBitmapData(BitmapData data, Resize resize,
			double x, double y, double width, double height, double rotation,
			double alpha)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha);
	}-*/;

	public final void addBitmapData(BitmapData data, Resize resize, double x,
			double y, double width, double height, double rotation,
			double alpha, BlendMode blendMode) {
		this._addBitmapData(data, resize, x, y, width, height, rotation, alpha,
				blendMode.value);
	}

	private final native void _addBitmapData(BitmapData data, Resize resize,
			double x, double y, double width, double height, double rotation,
			double alpha, String blendMode)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(
						displayObject.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x, y, width, height, rotation, alpha,
						keepTransformation, imageFormat, quality, blendMode);
	}-*/;

	public final void addBitmapData(BitmapData data, Resize resize, double x,
			double y, double width, double height, double rotation,
			double alpha, BlendMode blendMode, ILink link) {
		this._addBitmapData(data, resize, x, y, width, height, rotation, alpha,
				blendMode.value, link);
	}

	private final native void _addBitmapData(BitmapData data, Resize resize,
			double x, double y, double width, double height, double rotation,
			double alpha, String blendMode, ILink link)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addBitmapData(
						data.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						resizeMode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						x,
						y,
						width,
						height,
						rotation,
						alpha,
						keepTransformation,
						imageFormat,
						quality,
						blendMode,
						link.@com.ait.toolkit.flash.alivepdf.client.links.ILink::asILink()());
	}-*/;

}
