package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.core.client.net.URLRequest;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class Anchor extends Phrase {

    protected Anchor() {

    }

    protected Anchor( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Anchor( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createAnchor( text, font );
    }

    public Anchor( String text ) {
        jsObj = ElementsFactory.INSTANCE.createAnchor( text );
    }

    public static Anchor fromChunk( Chunk chunk ) {
        return new Anchor( ElementsFactory.INSTANCE.anchorFromChunk( chunk ) );
    }

    public static Anchor fromPhrase( Phrase phrase ) {
        return new Anchor( ElementsFactory.INSTANCE.anchorFromPhrase( phrase ) );
    }

    public native void setName( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setname(value);
    }-*/;

    public native String getName()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getname();
    }-*/;

    public native void setReference( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setreference(value);
    }-*/;

    public native String getReference()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getreference();
    }-*/;

    public native URLRequest getUrl()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.geturl();
		if (o) {
			return @com.ait.toolkit.flash.core.client.net.URLRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;

}
