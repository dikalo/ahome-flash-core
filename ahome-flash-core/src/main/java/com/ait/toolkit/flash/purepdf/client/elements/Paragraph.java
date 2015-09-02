package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class Paragraph extends Phrase {

    protected Paragraph() {

    }

    public static Paragraph fromPhrase( Phrase phrase ) {
        return new Paragraph( ElementsFactory.INSTANCE.createParagraphFromPhrase( phrase ) );
    }

    public static Paragraph fromChunk( Chunk chunk ) {
        return new Paragraph( ElementsFactory.INSTANCE.createParagraphFromChunk( chunk ) );
    }

    protected Paragraph( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Paragraph( String text ) {
        jsObj = ElementsFactory.INSTANCE.createParagraph( text );
    }

    public Paragraph( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createParagraph( text, font );
    }

    public native void setAlignment( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalignment(value);
    }-*/;

    public native void setAlignment( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAlignment(value);
    }-*/;

    public native void setLeading( double fixedLeading, double multipleLeading )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLeading(fixedLeading, multipleLeading);
    }-*/;

    public native double getAlignment()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalignment();
    }-*/;

    public native void setExtraParagraphSpace( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setextraParagraphSpace(value);
    }-*/;

    public native double getExtraParagraphSpace()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getextraParagraphSpace();
    }-*/;

    public native void setFirstLineIndent( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfirstLineIndent(value);
    }-*/;

    public native double getFirstLineIndent()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getfirstLineIndent();
    }-*/;

    public native void setIndentationLeft( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindentationLeft(value);
    }-*/;

    public native double getIndentationLeft()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getindentationLeft();
    }-*/;

    public native void setIndentationRight( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setindentationRight(value);
    }-*/;

    public native double getIndentationRight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getindentationRight();
    }-*/;

    public native void setKeepTogether( boolean value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setkeeptogether(value);
    }-*/;

    public native double isKeepTogether()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getkeeptogether();
    }-*/;

    public native void setSpacingAfter( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setspacingAfter(value);
    }-*/;

    public native double getSpacingAfter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getspacingAfter();
    }-*/;

    public native void setSpacingBefore( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setspacingBefore(value);
    }-*/;

    public native double getSpacingBefore()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getspacingBefore();
    }-*/;

}
