package com.ait.toolkit.flash.purepdf.client.colors;

import com.ait.toolkit.flash.purepdf.client.factories.ColorsFactory;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfShadingPattern;
import com.google.gwt.core.client.JavaScriptObject;

public class ShadingColor extends RGBColor {

    protected ShadingColor( JavaScriptObject peer ) {
        super( peer );
    }

    public ShadingColor( PdfShadingPattern value ) {
        jsObj = ColorsFactory.INSTANCE.createShadingColor( value );
    }
}
