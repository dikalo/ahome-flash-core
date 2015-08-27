package com.ait.toolkit.flash.core.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface FlashCoreResources extends ClientBundle {

    public static FlashCoreResources INSTANCE = GWT.create( FlashCoreResources.class );

    @Source( "FaBridge.js" )
    public TextResource faBridge();

    @Source( "swfobject-2.0.js" )
    public TextResource swfObject();
}
