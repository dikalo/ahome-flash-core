package com.ait.toolkit.flash.purepdf.client.fonts;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.BaseFontFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class BaseFont extends JsObject {

    public static final String ADOBE_CNS1_UCS2 = BaseFontFactory.INSTANCE.getStaticValueAsString( "AdobeCNS1_UCS2" );

    protected BaseFont( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    public static BaseFont createFont( String name, String encoding, boolean embedded ) {
        return new BaseFont( BaseFontFactory.INSTANCE.createFont( name, encoding, embedded ) );
    }
}
