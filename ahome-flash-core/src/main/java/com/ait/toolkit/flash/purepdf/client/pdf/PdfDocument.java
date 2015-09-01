package com.ait.toolkit.flash.purepdf.client.pdf;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PdfDocument extends JsObject {

    public PdfDocument( JavaScriptObject obj ) {
        jsObj = obj;
    }

    public final native void addAuthor( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addAuthor(value);
    }-*/;

    public final native void addTitle( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addTitle(value);
    }-*/;

    public final native void addCreator( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addCreator(value);
    }-*/;

    public final native void addSubject( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addSubject(value);
    }-*/;

    public final native void addKeywords( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addKeywords(value);
    }-*/;

    public final native void setViewerPreferences( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setViewerPreferences(value);
    }-*/;

    public final native void open()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.open();
    }-*/;

    public final native void close()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

}
