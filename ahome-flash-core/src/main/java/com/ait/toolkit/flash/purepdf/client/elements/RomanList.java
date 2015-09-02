package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class RomanList extends List {

    protected RomanList() {

    }

    protected RomanList( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public RomanList( int symbolIndent ) {
        jsObj = ElementsFactory.INSTANCE.createRomanList( symbolIndent );
    }

}
