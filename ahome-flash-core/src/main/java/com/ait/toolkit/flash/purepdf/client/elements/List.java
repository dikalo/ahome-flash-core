package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class List extends JsObject {

    public static final boolean ALPHABETICAL = true;
    public static final boolean LOWERCASE = true;
    public static final boolean NUMERICAL = true;
    public static final boolean ORDERED = true;
    public static final boolean UNORDERED = false;
    public static final boolean UPPERCASE = false;

    protected List() {

    }

    protected List( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public List( boolean numbered, int symbolIndent ) {
        jsObj = ElementsFactory.INSTANCE.createList( numbered, symbolIndent );
    }

    public List( boolean numbered ) {
        this( numbered, 0 );
    }

    public native void add( List value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void add( ListItem value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void add( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value);
    }-*/;

    public native void setAlignIndent( boolean value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalignindent(value);
    }-*/;

    public native boolean isAlignIndent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalignindent();
    }-*/;

    public native void setAutoIndent( boolean value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setautoindent(value);
    }-*/;

    public native boolean isAutoIndent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getautoindent();
    }-*/;

    public native void setFirst( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfirst(value);
    }-*/;

    public native int getFirst()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfirst();
    }-*/;

    public native void setIndentationLeft( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindentationLeft(value);
    }-*/;

    public native double getIndentationLeft()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindentationLeft();
    }-*/;

    public native void setIndentationRight( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindentationRight(value);
    }-*/;

    public native double getIndentationRight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getindentationRight();
    }-*/;

    public native void setLettered( boolean value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlettered(value);
    }-*/;

    public native boolean isLettered()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlettered();
    }-*/;

    public native void setLowerCase( boolean value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setlowercase(value);
    }-*/;

    public native boolean isLowerCase()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlowercase();
    }-*/;

    public native void setNumbered( boolean value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setnumbered(value);
    }-*/;

    public native boolean isNumbered()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnumbered();
    }-*/;

    public native void setPostSymbol( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpostSymbol(value);
    }-*/;

    public native String getPostSymbol()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpostSymbol();
    }-*/;

    public native void setPreSymbol( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpreSymbol(value);
    }-*/;

    public native String getPreSymbol()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpreSymbol();
    }-*/;

    public native void setSymbol( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setsymbol(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native Chunk getSymbol()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getsymbol();
		if (o) {
			return @com.ait.toolkit.flash.purepdf.client.elements.Chunk::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;

    public native void setSymbolIndent( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsymbolIndent(value);
    }-*/;

    public native double getSymbolIndent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsymbolIndent();
    }-*/;

}
