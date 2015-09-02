package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class Phrase extends JsObject {

    public static final int DEFAULT_LEADING = 16;

    protected Phrase() {

    }

    protected Phrase( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Phrase( String text, Font font, int leading ) {
        jsObj = ElementsFactory.INSTANCE.createPhrase( text, font, leading );
    }

    public Phrase( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createPhrase( text, font );
    }

    public Phrase( String text ) {
        jsObj = ElementsFactory.INSTANCE.createPhrase( text );
    }

    public static Phrase fromChunk( Chunk chunk ) {
        return new Phrase( ElementsFactory.INSTANCE.phraseFromChunk( chunk ) );
    }

    public native void add( Phrase value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void addChunk( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addChunk(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void add( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
