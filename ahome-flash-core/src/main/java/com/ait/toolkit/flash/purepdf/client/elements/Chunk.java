package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.colors.RGBColor;
import com.ait.toolkit.flash.purepdf.client.elements.images.ImageElement;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfAction;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfAnnotation;
import com.google.gwt.core.client.JavaScriptObject;

public class Chunk extends JsObject implements IElement {

    public static final Chunk NEW_LINE = new Chunk( "\n", new Font() );

    protected Chunk() {

    }

    protected Chunk( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static Chunk fromImage( ImageElement imageElement, double offsetX, double offsetY ) {
        return new Chunk( ElementsFactory.INSTANCE.createChunkFromImage( imageElement, offsetX, offsetY ) );
    }

    public Chunk( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createChunk( text, font );
    }

    public Chunk( String text ) {
        jsObj = ElementsFactory.INSTANCE.createChunk( text );
    }

    public native double getHorizontalScalling()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getHorizontalScalling();
    }-*/;

    public native ImageElement getImage()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getImage();
		return @com.ait.toolkit.flash.purepdf.client.elements.images.ImageElement::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native double getTextRise()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getTextRise();
    }-*/;

    public native double getWidthPoint()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getWidthPoint();
    }-*/;

    public native Chunk setAction( PdfAction action )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setAction(action.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Chunk setAnchor( String url )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAnchor(url);
		return this;
    }-*/;

    public native Chunk setAnnotation( PdfAnnotation value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setAnchor(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Chunk setBackground( RGBColor value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setBackground(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Chunk setBackground( RGBColor value, double extraLeft )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBackground(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				extraLeft);
		return this;
    }-*/;

    public native Chunk setBackground( RGBColor value, double extraLeft, double extraBottom )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBackground(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				extraLeft, extraBottom);
		return this;
    }-*/;

    public native Chunk setBackground( RGBColor value, double extraLeft, double extraBottom, double extraRight )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBackground(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				extraLeft, extraBottom, extraRight);
		return this;
    }-*/;

    public native Chunk setBackground( RGBColor value, double extraLeft, double extraBottom, double extraRight, double extraTop )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBackground(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				extraLeft, extraBottom, extraRight, extraTop);
		return this;
    }-*/;

    public native Chunk setGenericTag( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setGenericTag(value);
		return this;
    }-*/;

    public native Chunk setHorizontalScalling( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setHorizontalScalling(value);
		return this;
    }-*/;

    public native Chunk setLocalDestination( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLocalDestination(value);
		return this;
    }-*/;

    public native Chunk setLocalGoTo( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLocalGoTo(value);
		return this;
    }-*/;

    public native Chunk setNewPage()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setNewPage();
		return this;
    }-*/;

    public native Chunk setSkew( double alpha, double beta )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSkew(alpha, beta);
		return this;
    }-*/;

    public native Chunk setTextRenderMode( int mode, double strokeWidth, RGBColor color )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTextRenderMode(mode, strokeWidth,
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Chunk setTextRise( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTextRise(value);
		return this;
    }-*/;

    public native Chunk setUnderline()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnderline();
		return this;
    }-*/;

    public native Chunk setUnderline( RGBColor color )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setUnderline(color.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
    }-*/;

    public native Chunk setUnderline( RGBColor color, double thickNess )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnderline(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickNess);
		return this;
    }-*/;

    public native Chunk setUnderline( RGBColor color, double thickNess, double thinkNessMul )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnderline(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickNess, thickNessMul);
		return this;
    }-*/;

    public native Chunk setUnderline( RGBColor color, double thickNess, double thinkNessMul, double yPosition )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnderline(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickNess, thickNessMul, yPosition);
		return this;
    }-*/;

    public native Chunk setUnderline( RGBColor color, double thickNess, double thinkNessMul, double yPosition, double yPositionMul )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnderline(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickNess, thickNessMul, yPosition, yPositionMul);
		return this;
    }-*/;

    public native Chunk setUnderline( RGBColor color, double thickNess, double thinkNessMul, double yPosition, double yPositionMul, int cap )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setUnderline(
				color.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				thickNess, thickNessMul, yPosition, yPositionMul, cap);
		return this;
    }-*/;

    @Override
    public JavaScriptObject asElement() {
        return this.getJsObj();
    }

}
