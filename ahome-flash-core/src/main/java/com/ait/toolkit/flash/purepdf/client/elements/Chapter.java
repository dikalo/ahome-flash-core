package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class Chapter extends Section {

    protected Chapter() {

    }

    protected Chapter( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public Chapter( Paragraph paragraph, int number ) {
        jsObj = ElementsFactory.INSTANCE.createChapter( paragraph, number );
    }

    public Chapter( String paragraph, int number ) {
        jsObj = ElementsFactory.INSTANCE.createChapter( paragraph, number );
    }

}
