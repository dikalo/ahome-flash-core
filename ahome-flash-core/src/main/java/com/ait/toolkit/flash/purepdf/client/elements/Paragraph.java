package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class Paragraph extends Phrase {

    protected Paragraph() {

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

}
