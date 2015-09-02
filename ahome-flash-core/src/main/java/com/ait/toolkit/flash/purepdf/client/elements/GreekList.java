package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class GreekList extends List {

    protected GreekList() {

    }

    protected GreekList( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public GreekList( int symbolIndent ) {
        jsObj = ElementsFactory.INSTANCE.createGreekList( symbolIndent );
    }

}
