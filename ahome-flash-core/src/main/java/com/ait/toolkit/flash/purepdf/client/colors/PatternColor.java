package com.ait.toolkit.flash.purepdf.client.colors;

import com.ait.toolkit.flash.purepdf.client.factories.ColorsFactory;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfPatternPainter;
import com.google.gwt.core.client.JavaScriptObject;

public class PatternColor extends RGBColor {

    protected PatternColor( JavaScriptObject peer ) {
        super( peer );
    }

    public PatternColor( PdfPatternPainter patternPainter ) {
        jsObj = ColorsFactory.INSTANCE.createPatternColor( patternPainter );
    }
}
