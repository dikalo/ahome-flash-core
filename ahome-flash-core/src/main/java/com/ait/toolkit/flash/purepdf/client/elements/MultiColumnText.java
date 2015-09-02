package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfContentByte;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfDocument;
import com.google.gwt.core.client.JavaScriptObject;

public class MultiColumnText extends JsObject implements IElement {

    public static final int AUTOMATIC = 1;

    public MultiColumnText() {
        jsObj = ElementsFactory.INSTANCE.createMultiColumnText();
    }

    protected MultiColumnText( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public native void add( MultiColumnText value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void addChunk( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addChunk(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void add( IElement element ) {
        this.add( element.asElement() );
    }

    public native void addPhrase( Phrase value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addPhrase(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void addRegularColumns( double left, double right, double gutterWidth, double numColumns )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addRegularColumns(left, right, gutterWidth, numColumns);
    }-*/;

    public native double getColumnBottom()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getColumnBottom();
    }-*/;

    public native void nextColumn()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.nextColumn();
    }-*/;

    public native void resetCurrentColumn()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resetCurrentColumn();
    }-*/;

    public native void shiftCurrentColumn()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.shiftCurrentColumn();
    }-*/;

    public native void useColumnParam( MultiColumnText value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.useColumnParam(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void write( PdfContentByte content, PdfDocument document, double documentY )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.write(content.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				document.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				documentY);
    }-*/;

    public native void addSimpleColumn( double left, double right )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addSimpleColumn(left, right);
    }-*/;

    @Override
    public JavaScriptObject asElement() {
        return this.getJsObj();
    }

    private native void add( JavaScriptObject value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value);
    }-*/;

}
