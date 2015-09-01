package com.ait.toolkit.flash.purepdf.client.fonts;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.colors.RGBColor;
import com.ait.toolkit.flash.purepdf.client.factories.FontsResource;
import com.google.gwt.core.client.JavaScriptObject;

public class Font extends JsObject {

    protected Font( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Font( int familly, int size, int style, RGBColor color, BaseFont baseFont ) {
        jsObj = FontsResource.INSTANCE.createFont( familly, size, style, color, baseFont );
    }

    public Font() {
        jsObj = FontsResource.INSTANCE.createFont();
    }

    public final native Font difference( Font value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer
				.difference(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		if (o) {
			@com.ait.toolkit.flash.purepdf.client.fonts.Font::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;

    public static Font fromBaseFont( BaseFont bf, int size, int style, RGBColor color ) {
        return new Font( FontsResource.INSTANCE.fontFromBaseFont( bf, size, style, color ) );
    }
}
