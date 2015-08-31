package com.ait.toolkit.flash.purepdf.client.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.ait.toolkit.flash.purepdf.client.elements.RectangleElement;
import com.google.gwt.core.client.JavaScriptObject;

public class PdfFactory extends JsObject {

    public static final PdfFactory INSTANCE = new PdfFactory();

    protected PdfFactory( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    private PdfFactory() {
        jsObj = Bridge.createObject( "com.ait.toolkit.flash.purepdf.factories.pdf.PdfFactory" );
    }

    public final native JavaScriptObject createPdfWriter( ByteArray output, RectangleElement pageSize )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPdfWriter(
				output.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				pageSize.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
