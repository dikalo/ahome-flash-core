package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class ListItem extends Paragraph {

    protected ListItem() {

    }

    protected ListItem( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public ListItem( String text ) {
        jsObj = ElementsFactory.INSTANCE.createListItem( text );
    }

    public ListItem( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createListItem( text, font );
    }

    public static ListItem fromChunk( Chunk chunk ) {
        return new ListItem( ElementsFactory.INSTANCE.createListItemFromChunk( chunk ) );
    }

    public static ListItem fromPhrase( Phrase phrase ) {
        return new ListItem( ElementsFactory.INSTANCE.createListItemFromPhrase( phrase ) );
    }

    public native void setIndentationLeft( double indentation, boolean autoIndent )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setIndentationLeft(indentation, autoIndent);
    }-*/;

}
