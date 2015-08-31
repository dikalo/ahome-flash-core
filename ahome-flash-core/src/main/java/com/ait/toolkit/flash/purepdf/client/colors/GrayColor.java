package com.ait.toolkit.flash.purepdf.client.colors;

import com.ait.toolkit.flash.purepdf.client.factories.ColorsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class GrayColor extends RGBColor {

    public static final RGBColor GRAYBLACK = new GrayColor( 0 );
    public static final RGBColor GRAYWHITE = new GrayColor( 1 );

    protected GrayColor( JavaScriptObject peer ) {
        super( peer );
    }

    public GrayColor( int gray ) {
        jsObj = ColorsFactory.INSTANCE.createGrayColor( gray );
    }

}
