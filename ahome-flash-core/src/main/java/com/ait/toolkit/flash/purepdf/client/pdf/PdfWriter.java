package com.ait.toolkit.flash.purepdf.client.pdf;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.purepdf.client.elements.RectangleElement;
import com.ait.toolkit.flash.purepdf.client.factories.PdfFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class PdfWriter extends JsObject {

    public PdfWriter( JavaScriptObject obj ) {
        jsObj = obj;
    }

    public static PdfWriter create( ByteArray output, RectangleElement pageSize ) {
        return new PdfWriter( PdfFactory.INSTANCE.createPdfWriter( output, pageSize ) );
    }

    public final native PdfDocument getPdfDocument()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getpdfDocument();
		if (o) {
			return @com.ait.toolkit.flash.purepdf.client.pdf.PdfDocument::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
    }-*/;

}
