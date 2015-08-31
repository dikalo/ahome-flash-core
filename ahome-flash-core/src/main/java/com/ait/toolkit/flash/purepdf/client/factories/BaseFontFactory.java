package com.ait.toolkit.flash.purepdf.client.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

public class BaseFontFactory extends JsObject {

    public static final BaseFontFactory INSTANCE = new BaseFontFactory();

    protected BaseFontFactory( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    private BaseFontFactory() {
        jsObj = Bridge.createObject( "com.ait.toolkit.flash.purepdf.factories.BaseFontFactory" );
    }

    public final native JavaScriptObject createFont( String name, String encoding, boolean embedded )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createCoreFont(name, encoding, embedded);
    }-*/;

    public final native String getStaticValueAsString( String name )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getStaticValue(name);
    }-*/;

    public final native int getStaticValueAsInt( String name )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getStaticValue(name);
    }-*/;

    public final native boolean getStaticValueAsBoolean( String name )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getStaticValue(name);
    }-*/;

}
