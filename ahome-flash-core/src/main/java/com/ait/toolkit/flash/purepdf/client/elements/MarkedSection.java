package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class MarkedSection extends MarkedObject {

    protected MarkedSection() {

    }

    protected MarkedSection( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public MarkedSection( Section section ) {
        jsObj = ElementsFactory.INSTANCE.createMarkedSection( section );
    }

    public native void add( MarkedSection value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void add( List value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void add( Section value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void add( Paragraph value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void newPage()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.newPage();
    }-*/;

    public native MarkedSection addSection()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addSection();
		return this;
    }-*/;

    public native MarkedSection addSection( int numberDepth )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addSection(numberDepth);
		return this;
    }-*/;

    public native MarkedSection addSection( int numberDepth, int indentation )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addSection(numberDepth, indentation);
		return this;
    }-*/;

}
