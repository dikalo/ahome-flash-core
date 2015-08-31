package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class RectangleElement extends JsObject {

    protected RectangleElement() {

    }

    protected RectangleElement( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public RectangleElement( double llx, double lly, double urx, double ury ) {
        jsObj = ElementsFactory.INSTANCE.createRectangleElement( llx, lly, urx, ury );
    }
}
