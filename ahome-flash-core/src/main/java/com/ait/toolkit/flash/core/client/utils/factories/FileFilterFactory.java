/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.flash.core.client.utils.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating FileFilter objects.
 */
public class FileFilterFactory extends JsObject {

    private static final FileFilterFactory INSTANCE = new FileFilterFactory();

    public static FileFilterFactory get() {
        return INSTANCE;
    }

    /**
     * Instantiates a new file filter factory.
     */
    private FileFilterFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of FileFilterFactory.
     * 
     * @return single instance of FileFilterFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.FileFilterFactory");
    }

    /**
     * Creates a new FileFilter object.
     * 
     * @param description the description
     * @param extension the extension
     * @return the file filter
     */
    public final native JavaScriptObject createFileFilter(String description, String extension)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createFileFilter(description, extension);
    }-*/;

    /**
     * Creates a new FileFilter object.
     * 
     * @param description the description
     * @param extension the extension
     * @param macType the mac type
     * @return the file filter
     */
    public final native JavaScriptObject createFileFilter(String description, String extension, String macType)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createFileFilter(description, extension, macType);
    }-*/;

}
