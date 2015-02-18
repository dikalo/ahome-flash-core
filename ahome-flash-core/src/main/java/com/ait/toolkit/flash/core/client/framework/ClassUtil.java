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
 * The Class ClassUtil.
 */
public class ClassUtil extends JavaScriptObject {

    /**
     * Instantiates a new class util.
     */
    protected ClassUtil() {

    }

    /**
     * Gets the single instance of ClassUtil.
     * 
     * @return single instance of ClassUtil
     */
    public static ClassUtil getInstance() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.ClassUtil");
    }

    /**
     * Gets the class.
     * 
     * @param <T>
     *            the generic type
     * @param obj
     *            the obj
     * @return the class
     */
    public final native <T extends JavaScriptObject> T getClass(JavaScriptObject obj)/*-{
		return this.getClass(obj);
    }-*/;

    /**
     * Creates the class factory.
     * 
     * @return the class factory
     */
    public final native ClassFactory createClassFactory()/*-{
		return this.createClassFactory();
    }-*/;

    /**
     * Creates the class factory.
     * 
     * @param obj
     *            the obj
     * @return the class factory
     */
    public final native ClassFactory createClassFactory(JavaScriptObject obj)/*-{
		return this.createClassFactory(obj);
    }-*/;

}
