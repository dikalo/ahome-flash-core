package com.ait.toolkit.flash.purepdf.client.fonts;

import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.purepdf.client.factories.FontsResource;

public final class FontsResourceFactory {

    private FontsResourceFactory() {

    }

    public static void registerCourierFont() {
        FontsResource.INSTANCE.registerCourierFont();
    }

    public static void registerCourierBoldFont() {
        FontsResource.INSTANCE.registerCourierBoldFont();
    }

    public static void registerCourierBoldObliqueFont() {
        FontsResource.INSTANCE.registerCourierBoldObliqueFont();
    }

    public static void registerCourierObliqueFont() {
        FontsResource.INSTANCE.registerCourierObliqueFont();
    }

    public static void registerHelveticaFont() {
        FontsResource.INSTANCE.registerHelveticaFont();
    }

    public static void registerHelveticaBoldFont() {
        FontsResource.INSTANCE.registerHelveticaBoldFont();
    }

    public static void registerHelveticaBoldObliqueFont() {
        FontsResource.INSTANCE.registerHelveticaBoldObliqueFont();
    }

    public static void registerHelveticaObliqueFont() {
        FontsResource.INSTANCE.registerHelveticaObliqueFont();
    }

    public static void registerSymbolFont() {
        FontsResource.INSTANCE.registerSymbolFont();
    }

    public static void registerTimesBoldFont() {
        FontsResource.INSTANCE.registerTimesBoldFont();
    }

    public static void registerTimesBoldItalicFont() {
        FontsResource.INSTANCE.registerTimesBoldItalicFont();
    }

    public static void registerTimesItalicFont() {
        FontsResource.INSTANCE.registerTimesItalicFont();
    }

    public static void registerTimesRomanFont() {
        FontsResource.INSTANCE.registerTimesRomanFont();
    }

    public static void registerZapfDingBatsFont() {
        FontsResource.INSTANCE.registerZapfDingBatsFont();
    }

    public static void registerFont( String name, ByteArray data ) {
        FontsResource.INSTANCE.registerFont( name, data );
    }

}
