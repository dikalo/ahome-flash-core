package com.ait.toolkit.flash.purepdf.client.colors;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ColorsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class RGBColor extends JsObject {

    public static final RGBColor BLACK = new RGBColor( 0, 0, 0 );
    public static final RGBColor BLUE = new RGBColor( 0, 0, 255 );
    public static final RGBColor CYAN = new RGBColor( 0, 255, 255 );
    public static final RGBColor DARK_GRAY = new RGBColor( 64, 64, 64 );
    public static final RGBColor GRAY = new RGBColor( 128, 128, 128 );
    public static final RGBColor GREEN = new RGBColor( 0, 255, 0 );
    public static final RGBColor LIGHT_GRAY = new RGBColor( 192, 192, 192 );
    public static final RGBColor MAGENTA = new RGBColor( 255, 0, 255 );
    public static final RGBColor ORANGE = new RGBColor( 255, 200, 0 );
    public static final RGBColor PINK = new RGBColor( 255, 175, 175 );
    public static final RGBColor RED = new RGBColor( 255, 0, 0 );
    public static final RGBColor WHITE = new RGBColor( 255, 255, 255 );
    public static final RGBColor YELLOW = new RGBColor( 255, 255, 0 );

    protected RGBColor() {

    }

    protected RGBColor( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public RGBColor( int red, int green, int blue ) {
        jsObj = ColorsFactory.INSTANCE.createRGBColor( red, green, blue, 255 );
    }

    public RGBColor( int red, int green, int blue, int alpha ) {
        jsObj = ColorsFactory.INSTANCE.createRGBColor( red, green, blue, alpha );
    }

    public final native RGBColor darker()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.darker();
		return @com.ait.toolkit.flash.purepdf.client.colors.RGBColor::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;
}
