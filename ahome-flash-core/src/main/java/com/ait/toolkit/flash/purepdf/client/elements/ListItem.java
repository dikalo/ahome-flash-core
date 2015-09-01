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
        jsObj = ElementsFactory.INSTANCE.createParagraph( text );
    }

    public ListItem( String text, Font font ) {
        jsObj = ElementsFactory.INSTANCE.createParagraph( text, font );
    }

}
