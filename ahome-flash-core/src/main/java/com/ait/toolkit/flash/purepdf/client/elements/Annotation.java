package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class Annotation extends JsObject {

    protected Annotation() {

    }

    protected Annotation( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static Annotation createNamed( int named ) {
        return new Annotation( ElementsFactory.INSTANCE.createNamedAnnotation( named ) );
    }

    public static Annotation createString( String title, String content ) {
        return new Annotation( ElementsFactory.INSTANCE.createStringAnnotation( title, content ) );
    }

    public static Annotation createUrl( String url ) {
        return new Annotation( ElementsFactory.INSTANCE.createUrlAnnotation( url ) );
    }

    public static Annotation createScreen( String moviePath, String mimeType, boolean showOnDisplay ) {
        return new Annotation( ElementsFactory.INSTANCE.createScreenAnnotation( moviePath, mimeType, showOnDisplay ) );
    }

    public native void setDimensions( double llx, double lly, double urx, double ury )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDimensions(llx, ly, urx, ury);
    }-*/;

}
