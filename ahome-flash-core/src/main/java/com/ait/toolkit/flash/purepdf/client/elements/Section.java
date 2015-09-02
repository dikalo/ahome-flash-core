package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class Section extends JsObject {

    public static final int NUMBERSTYLE_NONE = -1;
    public static final int NUMBERSTYLE_DOTTED = 0;
    public static final int NUMBERSTYLE_DOTTED_WITHOUT_FINAL_DOT = 1;

    protected Section() {

    }

    protected Section( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Section( Paragraph paragraph, int depth ) {
        jsObj = ElementsFactory.INSTANCE.createSection( paragraph, depth );
    }

    public Section( Paragraph paragraph ) {
        jsObj = ElementsFactory.INSTANCE.createSection( paragraph, 1 );
    }

    public native boolean isChapter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisChapter();
    }-*/;

    public native boolean isContent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getisContent();
    }-*/;

    public native int getNumberStyle()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnumberStyle();
    }-*/;

    public native int setNumberStyle( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.setnumberStyle(value);
    }-*/;

    public native int getIndentationLeft()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindentationLeft();
    }-*/;

    public native void setIndentationLeft( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindentationLeft(value);
    }-*/;

    public native int getIndentationRight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindentationRight();
    }-*/;

    public native void setIndentationRight( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindentationRight(value);
    }-*/;

    public native Paragraph getBookmarkTitle()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getbookmarkTitle();
		if (o) {
			return @com.ait.toolkit.flash.purepdf.client.elements.Paragraph::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;

    public native void setBookmarkTitle( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setbookmarkTitle(value);
    }-*/;

    public native Paragraph getTitle()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.gettitle();
		if (o) {
			return @com.ait.toolkit.flash.purepdf.client.elements.Paragraph::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;

    public native void setTitle( Paragraph value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.settitle(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native boolean add( Section value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native Section addSection( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(value);
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( Paragraph value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer
				.addSection(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( int indentation, Paragraph value, int numberDepth )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(indentation,
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				numberDepth);
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( int indentation, Paragraph value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(indentation,
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( Paragraph value, int numberDepth )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				numberDepth);
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( int indentation, String value, int numberDepth )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(indentation, value, numberDepth);
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( String value, int numberDepth )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(value, numberDepth);
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native Section addSection( int indentation, String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.addSection(indentation, value);
		return @com.ait.toolkit.flash.purepdf.client.elements.Section::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native void newPage()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.newPage();
    }-*/;
}
