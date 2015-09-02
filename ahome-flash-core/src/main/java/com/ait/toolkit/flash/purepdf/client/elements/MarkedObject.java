package com.ait.toolkit.flash.purepdf.client.elements;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class MarkedObject extends JsObject implements IElement {

    protected MarkedObject() {

    }

    protected MarkedObject( JavaScriptObject peer ) {
        jsObj = peer;
    }

    @Override
    public JavaScriptObject asElement() {
        return this.getJsObj();
    }

}
