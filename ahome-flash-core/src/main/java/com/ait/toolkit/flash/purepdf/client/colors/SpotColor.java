package com.ait.toolkit.flash.purepdf.client.colors;

import com.ait.toolkit.flash.purepdf.client.factories.ColorsFactory;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfSpotColor;
import com.google.gwt.core.client.JavaScriptObject;

public class SpotColor extends RGBColor {

    protected SpotColor( JavaScriptObject peer ) {
        super( peer );
    }

    public SpotColor( PdfSpotColor value, int tint ) {
        jsObj = ColorsFactory.INSTANCE.createSpotColor( value, tint );
    }
}
