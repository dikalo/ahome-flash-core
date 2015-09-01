package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class ChapterAutoNumber extends Chapter {

    protected ChapterAutoNumber() {

    }

    protected ChapterAutoNumber( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public ChapterAutoNumber( Paragraph paragraph ) {
        jsObj = ElementsFactory.INSTANCE.createChapterAutoNumber( paragraph );
    }

    public ChapterAutoNumber( String paragraph ) {
        jsObj = ElementsFactory.INSTANCE.createChapterAutoNumber( paragraph );
    }

    public native void setAutomaticNumber( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setAutomaticNumber(value);
    }-*/;

}
