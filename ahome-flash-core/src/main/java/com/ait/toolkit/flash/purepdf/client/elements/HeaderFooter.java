package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class HeaderFooter extends RectangleElement {

    protected HeaderFooter() {

    }

    protected HeaderFooter( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public HeaderFooter( Phrase before ) {
        jsObj = ElementsFactory.INSTANCE.createHeaderFooter( before );
    }

    public HeaderFooter( Phrase before, Phrase after ) {
        jsObj = ElementsFactory.INSTANCE.createHeaderFooter( before, after );
    }

    public HeaderFooter( Phrase before, Phrase after, boolean numbered ) {
        jsObj = ElementsFactory.INSTANCE.createHeaderFooter( before, after, numbered );
    }

    public native void setAlignment( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalignment(value);
    }-*/;

    public native int getAlignment()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalignment();
    }-*/;

    public native Paragraph getParagraph()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getparagraph();
		return @com.ait.toolkit.flash.purepdf.client.elements.Paragraph::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

}
