package com.ait.toolkit.flash.purepdf.client.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.purepdf.client.colors.RGBColor;
import com.ait.toolkit.flash.purepdf.client.fonts.BaseFont;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfPatternPainter;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfShadingPattern;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfSpotColor;
import com.google.gwt.core.client.JavaScriptObject;

public class FontsResource extends JsObject {

    public static final FontsResource INSTANCE = new FontsResource();

    protected FontsResource( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    private FontsResource() {
        jsObj = Bridge.createObject( "com.ait.toolkit.flash.purepdf.factories.FontsResource" );
    }

    public final native JavaScriptObject createFont( int familly, int size, int style, RGBColor color, BaseFont baseFont )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createFont(familly, size, stye,
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				baseFont.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createFont();
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

    public final native JavaScriptObject fontFromBaseFont( BaseFont bf, int size, int style, RGBColor color )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.fontFromBaseFont(
				bf.@com.ait.toolkit.core.client.JsObject::getJsObj()(), size,
				style,
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native void registerCourierFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerCourierFont();
    }-*/;

    public final native void registerCourierBoldFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerCourierBoldFont();
    }-*/;

    public final native void registerCourierBoldObliqueFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerCourierBoldObliqueFont();
    }-*/;

    public final native void registerCourierObliqueFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerCourierObliqueFont();
    }-*/;

    public final native void registerHelveticaFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerHelveticaFont();
    }-*/;

    public final native void registerHelveticaBoldFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerHelveticaBoldFont();
    }-*/;

    public final native void registerHelveticaBoldObliqueFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerHelveticaBoldObliqueFont();
    }-*/;

    public final native void registerHelveticaObliqueFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerHelveticaObliqueFont();
    }-*/;

    public final native void registerSymbolFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerSymbolFont();
    }-*/;

    public final native void registerTimesBoldFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerTimesBoldFont();
    }-*/;

    public final native void registerTimesBoldItalicFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerTimesBoldItalicFont();
    }-*/;

    public final native void registerTimesItalicFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerTimesItalicFont();
    }-*/;

    public final native void registerTimesRomanFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerTimesRomanFont();
    }-*/;

    public final native void registerZapfDingBatsFont()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerZapfDingBatsFont();
    }-*/;

    public final native void registerFont( String name, ByteArray data )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.registerFont(name,
				data.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
