package com.ait.toolkit.flash.purepdf.client.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfPatternPainter;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfShadingPattern;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfSpotColor;
import com.google.gwt.core.client.JavaScriptObject;

public class ColorsFactory extends JsObject {

    public static final ColorsFactory INSTANCE = new ColorsFactory();

    protected ColorsFactory( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    private ColorsFactory() {
        jsObj = Bridge.createObject( "com.ait.toolkit.flash.purepdf.factories.ColorFactory" );
    }

    public final native JavaScriptObject createRGBColor( int red, int green, int blue, int alpha )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRGBColor(red, green, blue, alpha);
    }-*/;

    public final native JavaScriptObject createGrayColor( int gray )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createGrayColor(gray);
    }-*/;

    public final native JavaScriptObject createPatternColor( PdfPatternPainter patternPainter )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createPatternColor(patternPainter.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createShadingColor( PdfShadingPattern value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createShadingColor(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createSpotColor( PdfSpotColor value, int tint )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createSpotColor(
						value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						tint);
    }-*/;

}
