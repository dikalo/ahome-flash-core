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
package com.ait.toolkit.flash.core.client.framework;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Class objects.
 */
public class ClassFactory extends JavaScriptObject {

    /**
     * Instantiates a new class factory.
     */
    protected ClassFactory() {

    }

    /**
     * Creates the.
     * 
     * @return the class factory
     */
    public static ClassFactory create() {
        return ClassUtil.getInstance().createClassFactory();
    }

    /**
     * Creates the.
     * 
     * @param obj the obj
     * @return the class factory
     */
    public static ClassFactory create(JavaScriptObject obj) {
        return ClassUtil.getInstance().createClassFactory(obj);
    }

    /**
     * New instance.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public final native <T extends JavaScriptObject> T newInstance()/*-{
		return this.newInstance();
    }-*/;

    /**
     * Sets the properties.
     * 
     * @param obj the new properties
     */
    public final native void setProperties(JavaScriptObject obj)/*-{
		this.setProperties(obj);
    }-*/;

}
