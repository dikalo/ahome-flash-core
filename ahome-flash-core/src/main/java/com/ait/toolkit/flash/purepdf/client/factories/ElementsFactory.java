package com.ait.toolkit.flash.purepdf.client.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class ElementsFactory extends JsObject {

    public static final ElementsFactory INSTANCE = new ElementsFactory();

    protected ElementsFactory( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    private ElementsFactory() {
        jsObj = Bridge.createObject( "com.ait.toolkit.flash.purepdf.factories.elements.ElementsFactory" );
    }

    public final native JavaScriptObject createRectangleElement( double llx, double lly, double urx, double ury )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRectangleElement(llx, lly, urx, ury);
    }-*/;

    public final native JavaScriptObject createReadyOnlyRectangle( double llx, double lly, double urx, double ury )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createReadyOnlyRectangle(llx, lly, urx, ury);
    }-*/;

    public final native JavaScriptObject createParagraph( String text, Font font )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createParagraph(text,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createParagraph( String text )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createParagraph(text);
    }-*/;

}
