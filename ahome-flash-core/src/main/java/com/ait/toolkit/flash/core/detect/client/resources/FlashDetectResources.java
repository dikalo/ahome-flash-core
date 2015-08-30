package com.ait.toolkit.flash.core.detect.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface FlashDetectResources extends ClientBundle {
    public static final FlashDetectResources INSTANCE = GWT.create( FlashDetectResources.class );

    @Source( "Detect_min.js" )
    TextResource js();
}
