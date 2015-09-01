package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class Chunk extends JsObject {

    protected Chunk() {

    }

    protected Chunk( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Chunk( String text, Font font, int leading ) {
        jsObj = ElementsFactory.INSTANCE.createPhrase( text, font, leading );
    }

    public Chunk( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createPhrase( text, font );
    }

    public Chunk( String text ) {
        jsObj = ElementsFactory.INSTANCE.createPhrase( text );
    }

    public native void add( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
