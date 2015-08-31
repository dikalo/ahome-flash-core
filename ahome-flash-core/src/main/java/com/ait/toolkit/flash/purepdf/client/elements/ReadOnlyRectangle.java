package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.flash.purepdf.client.factories.ElementsFactory;
import com.google.gwt.core.client.JavaScriptObject;

public class ReadOnlyRectangle extends RectangleElement {

    protected ReadOnlyRectangle() {

    }

    protected ReadOnlyRectangle( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public ReadOnlyRectangle( double llx, double lly, double urx, double ury ) {
        jsObj = ElementsFactory.INSTANCE.createReadyOnlyRectangle( llx, lly, urx, ury );
    }
}
