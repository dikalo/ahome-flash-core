package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.colors.RGBColor;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class RectangleElement extends JsObject implements IElement {

    public static final int BOTTOM = 2;
    public static final int LEFT = 4;
    public static final int NO_BORDER = 0;
    public static final int RIGHT = 8;
    public static final int TOP = 1;
    public static final int ALL = TOP | BOTTOM | LEFT | RIGHT;
    public static final int BOX = TOP + BOTTOM + LEFT + RIGHT;
    public static final int UNDEFINED = -1;

    protected RectangleElement() {

    }

    protected RectangleElement( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public RectangleElement( double llx, double lly, double urx, double ury ) {
        jsObj = ElementsFactory.INSTANCE.createRectangleElement( llx, lly, urx, ury );
    }

    public native RGBColor getBackgroundColor()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getbackgroundColor();
		return @com.ait.toolkit.flash.purepdf.client.colors.RGBColor::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native void setBackgroundColor( RGBColor value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setbackgroundColor(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native int getBorder()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborder();
    }-*/;

    public native void setBorder( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborder(value);
    }-*/;

    public native RGBColor getBorderColorBottom()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getborderColorBottom();
		return @com.ait.toolkit.flash.purepdf.client.colors.RGBColor::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native void setBorderColorBottom( RGBColor value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setborderColorBottom(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native RGBColor getBorderColorTop()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getborderColorTop();
		return @com.ait.toolkit.flash.purepdf.client.colors.RGBColor::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native void setBorderColorTop( RGBColor value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setborderColorTop(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native RGBColor getBorderColorLeft()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getborderColorLeft();
		return @com.ait.toolkit.flash.purepdf.client.colors.RGBColor::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native void setBorderColorLeft( RGBColor value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setborderColorLeft(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native RGBColor getBorderColorRight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.getborderColorRight();
		return @com.ait.toolkit.flash.purepdf.client.colors.RGBColor::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native void setBorderColorRight( RGBColor value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setborderColorRight(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setBorderSides( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderSides(value);
    }-*/;

    public native void setBorderWidth( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderWidth(value);
    }-*/;

    public native double getBorderWidth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborderWidth();
    }-*/;

    public native void setBorderWidthBottom( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderWidthBottom(value);
    }-*/;

    public native double getBorderWidthBottom()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborderWidthBottom();
    }-*/;

    public native void setBorderWidthRight( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderWidthRight(value);
    }-*/;

    public native double getBorderWidthRight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborderWidthRight();
    }-*/;

    public native void setBorderWidthLeft( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderWidthLeft(value);
    }-*/;

    public native double getBorderWidthLeft()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborderWidthLeft();
    }-*/;

    public native void setBorderWidthTop( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setborderWidthTop(value);
    }-*/;

    public native double getBorderWidthTop()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getborderWidthTop();
    }-*/;

    public native void setGrayFill( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setgrayFill(value);
    }-*/;

    public native double getGrayFill()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgrayFill();
    }-*/;

    public native double getHeight()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getheight();
    }-*/;

    public native void disableBorderSide()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.disableBorderSide();
    }-*/;

    public native void enableBorderSide()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.enableBorderSide();
    }-*/;

    public native void setBottom( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBottom(value);
    }-*/;

    public native void setLeft( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setLeft(value);
    }-*/;

    public native void setTop( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTop(value);
    }-*/;

    public native void setRight( double value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setRight(value);
    }-*/;

    public native RectangleElement rotate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.rotate();
		return @com.ait.toolkit.flash.purepdf.client.elements.RectangleElement::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native RectangleElement rotate( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.rotate(value);
		return @com.ait.toolkit.flash.purepdf.client.elements.RectangleElement::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public native RectangleElement rectangle( double top, double bottom )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.rectangle(top, bottom);
		return @com.ait.toolkit.flash.purepdf.client.elements.RectangleElement::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    @Override
    public JavaScriptObject asElement() {
        return this.getJsObj();
    }
}
