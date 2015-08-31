package com.ait.toolkit.flash.purepdf.client.fonts;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.BaseFontFactory;
import com.ait.toolkit.flash.purepdf.client.pdf.PdfStream;
import com.google.gwt.core.client.JavaScriptObject;

public class BaseFont extends JsObject {

    public static final String ADOBE_CNS1_UCS2 = BaseFontFactory.INSTANCE.getStaticValueAsString( "AdobeCNS1_UCS2" );
    public static final String ADOBE_GB1_UCS2 = BaseFontFactory.INSTANCE.getStaticValueAsString( "AdobeGB1_UCS2" );
    public static final String ADOBE_JAPAN1_UCS2 = BaseFontFactory.INSTANCE.getStaticValueAsString( "AdobeJapan1_UCS2" );
    public static final String ADOBE_KOREA_UCS2 = BaseFontFactory.INSTANCE.getStaticValueAsString( "AdobeKorea1_UCS2" );
    public static final int ASCENT = BaseFontFactory.INSTANCE.getStaticValueAsInt( "ASCENT" );
    public static final int AWT_ASCENT = BaseFontFactory.INSTANCE.getStaticValueAsInt( "AWT_ASCENT" );
    public static final int AWT_DESCENT = BaseFontFactory.INSTANCE.getStaticValueAsInt( "AWT_DESCENT" );
    public static final int AWT_LEADING = BaseFontFactory.INSTANCE.getStaticValueAsInt( "AWT_LEADING" );
    public static final int AWT_MAX_ADVANCE = BaseFontFactory.INSTANCE.getStaticValueAsInt( "AWT_MAXADVANCE" );
    public static final int BBOXLLX = BaseFontFactory.INSTANCE.getStaticValueAsInt( "BBOXLLX" );
    public static final int BBOXLLY = BaseFontFactory.INSTANCE.getStaticValueAsInt( "BBOXLLY" );
    public static final int BBOXURX = BaseFontFactory.INSTANCE.getStaticValueAsInt( "BBOXURX" );
    public static final boolean CACHED = BaseFontFactory.INSTANCE.getStaticValueAsBoolean( "CACHED" );
    public static final int CID_NEWLINE = BaseFontFactory.INSTANCE.getStaticValueAsInt( "CID_NEWLINE" );
    public static final String COURIER = BaseFontFactory.INSTANCE.getStaticValueAsString( "COURIER" );
    public static final String COURIER_BOLD = BaseFontFactory.INSTANCE.getStaticValueAsString( "COURIER_BOLD" );
    public static final String COURIER_BOLDOBLIQUE = BaseFontFactory.INSTANCE.getStaticValueAsString( "COURIER_BOLDOBLIQUE" );
    public static final String COURIER_OBLIQUE = BaseFontFactory.INSTANCE.getStaticValueAsString( "COURIER_OBLIQUE" );
    public static final String CP1250 = BaseFontFactory.INSTANCE.getStaticValueAsString( "CP1250" );
    public static final String CP1252 = BaseFontFactory.INSTANCE.getStaticValueAsString( "CP1252" );
    public static final String CP1257 = BaseFontFactory.INSTANCE.getStaticValueAsString( "CP1257" );
    public static final int DESCENT = BaseFontFactory.INSTANCE.getStaticValueAsInt( "DESCENT" );
    public static final boolean EMBEDDED = BaseFontFactory.INSTANCE.getStaticValueAsBoolean( "EMBEDDED" );
    public static final int FONT_TYPE_CJK = BaseFontFactory.INSTANCE.getStaticValueAsInt( "FONT_TYPE_CJK" );
    public static final int FONT_TYPE_DOCUMENT = BaseFontFactory.INSTANCE.getStaticValueAsInt( "FONT_TYPE_DOCUMENT" );
    public static final int FONT_TYPE_T1 = BaseFontFactory.INSTANCE.getStaticValueAsInt( "FONT_TYPE_T1" );
    public static final int FONT_TYPE_T3 = BaseFontFactory.INSTANCE.getStaticValueAsInt( "FONT_TYPE_T3" );
    public static final int FONT_TYPE_TT = BaseFontFactory.INSTANCE.getStaticValueAsInt( "FONT_TYPE_TT" );
    public static final int FONT_TYPE_TTUNI = BaseFontFactory.INSTANCE.getStaticValueAsInt( "FONT_TYPE_TTUNI" );
    public static final String HELVETICA = BaseFontFactory.INSTANCE.getStaticValueAsString( "HELVETICA" );
    public static final String HELVETICA_BOLD = BaseFontFactory.INSTANCE.getStaticValueAsString( "HELVETICA_BOLD" );
    public static final String HELVETICA_BOLDOBLIQUE = BaseFontFactory.INSTANCE.getStaticValueAsString( "HELVETICA_BOLDOBLIQUE" );
    public static final String HELVETICA_OBLIQUE = BaseFontFactory.INSTANCE.getStaticValueAsString( "HELVETICA_OBLIQUE" );
    public static final String IDENTITY_H = BaseFontFactory.INSTANCE.getStaticValueAsString( "IDENTITY_H" );
    public static final String IDENTITY_V = BaseFontFactory.INSTANCE.getStaticValueAsString( "IDENTITY_V" );
    public static final int ITALICANGLE = BaseFontFactory.INSTANCE.getStaticValueAsInt( "ITALICANGLE" );
    public static final String MACROMAN = BaseFontFactory.INSTANCE.getStaticValueAsString( "MACROMAN" );
    public static final boolean NOT_CACHED = BaseFontFactory.INSTANCE.getStaticValueAsBoolean( "NOT_CACHED" );
    public static final boolean NOT_EMBEDDED = BaseFontFactory.INSTANCE.getStaticValueAsBoolean( "NOT_EMBEDDED" );
    public static final int STRIKETHROUGH_POSITION = BaseFontFactory.INSTANCE.getStaticValueAsInt( "STRIKETHROUGH_POSITION" );
    public static final int STRIKETHROUGH_THICKNESS = BaseFontFactory.INSTANCE.getStaticValueAsInt( "STRIKETHROUGH_THICKNESS" );
    public static final int SUBSCRIPT_OFFSET = BaseFontFactory.INSTANCE.getStaticValueAsInt( "SUBSCRIPT_OFFSET" );
    public static final int SUBSCRIPT_SIZE = BaseFontFactory.INSTANCE.getStaticValueAsInt( "SUBSCRIPT_SIZE" );
    public static final String SYMBOL = BaseFontFactory.INSTANCE.getStaticValueAsString( "SYMBOL" );
    public static final String TIMES_BOLD = BaseFontFactory.INSTANCE.getStaticValueAsString( "TIMES_BOLD" );
    public static final String TIMES_BOLDITALIC = BaseFontFactory.INSTANCE.getStaticValueAsString( "TIMES_BOLDITALIC" );
    public static final String TIMES_ITALIC = BaseFontFactory.INSTANCE.getStaticValueAsString( "TIMES_ITALIC" );
    public static final String TIMES_ROMAN = BaseFontFactory.INSTANCE.getStaticValueAsString( "TIMES_ROMAN" );
    public static final int UNDERLINE_POSITION = BaseFontFactory.INSTANCE.getStaticValueAsInt( "UNDERLINE_POSITION" );
    public static final int UNDERLINE_THICKNESS = BaseFontFactory.INSTANCE.getStaticValueAsInt( "UNDERLINE_THICKNESS" );
    public static final String ZAPFDINGBATS = BaseFontFactory.INSTANCE.getStaticValueAsString( "ZAPFDINGBATS" );

    protected BaseFont( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    public static BaseFont createFont( String name, String encoding, boolean embedded ) {
        return new BaseFont( BaseFontFactory.INSTANCE.createFont( name, encoding, embedded ) );
    }

    public final native PdfStream getFullFontStream()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getFullFontStream(name);
		if (o) {
			return @com.ait.toolkit.flash.purepdf.client.pdf.PdfStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;
}
