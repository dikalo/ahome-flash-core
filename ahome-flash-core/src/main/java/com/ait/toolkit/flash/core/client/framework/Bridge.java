/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ait.toolkit.flash.core.client.framework;

import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * Represents the bridge between GWT and the Flash word.
 */
public class Bridge extends JavaScriptObject {

    private static String bridgeName;

    protected Bridge() {}

    public static void setBridgeName( String name ) {
        bridgeName = name;
    }

    /**
     * Gets the bridge instance
     */
    public static native Bridge get()/*-{
                                     var bridgeName = @com.ait.toolkit.flash.core.client.framework.Bridge::bridgeName;
                                     //$wnd.console.log(bridgeName);
                                     return $wnd.FABridge[bridgeName] ? $wnd.FABridge[bridgeName]
                                     : $wnd.FABridge["Flash4j"];
                                     }-*/;

    public static native Bridge get( String bridgeName )/*-{
                                                        @com.ait.toolkit.flash.core.client.framework.Bridge::bridgeName = bridgeName;
                                                        return $wnd.FABridge[bridgeName];
                                                        }-*/;

    private final native JavaScriptObject create( String id ) /*-{
                                                              //preventing from calling the constructor of DisplayObjectContainer
                                                              //since it's an Abstract class
                                                              if (id != "flash.display.DisplayObjectContainer") {
                                                              try {
                                                              var obj = this.create(id);
                                                              return obj;
                                                              } catch (e) {
                                                              $wnd.console.log(e.message);
                                                              }
                                                              }
                                                              return null;
                                                              }-*/;

    public final native void addEventHandler( String id, String type, EventHandler handler )/*-{
                                                                                            this
                                                                                            .addEventListener(
                                                                                            id,
                                                                                            type,
                                                                                            function(event) {
                                                                                            var eventObject = @com.ait.toolkit.flash.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
                                                                                            handler.@com.ait.toolkit.flash.core.client.events.handlers.EventHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/Event;)(eventObject);
                                                                                            });
                                                                                            }-*/;

    private final native JavaScriptObject create( String id, JsArrayString args ) /*-{
                                                                                  return this.create(id, args);
                                                                                  }-*/;

    private final native JavaScriptObject create( String id, JsArray<JavaScriptObject> args ) /*-{
                                                                                              return this.create(id, args);
                                                                                              }-*/;

    /**
     * gets the class reference of the object with the given id
     * 
     * @param id
     *            the id
     * @return the java script object
     */
    public final native JavaScriptObject classRef( String id ) /*-{
                                                               return this.classRef(id);
                                                               }-*/;

    /**
     * Gets the root of the flash application
     * 
     * @return the root
     */
    public final native JavaScriptObject getRoot() /*-{
                                                   return this.root();
                                                   }-*/;

    /**
     * Creates a flash object with the given id
     * 
     * @param <T>
     *            the generic type
     * @param id
     *            the id
     * @return the t
     */
    public static <T extends JavaScriptObject> T createObject( String id ) {
        return get().create( id ).cast();
    }

    /**
     * Debug.
     * 
     * @param id
     *            the id
     * @return the string
     */
    public final native String debug( String id )/*-{
                                                 $wnd.console.log('creating :  ' + id);
                                                 var o = this.create(id);
                                                 $wnd.console.log(o);
                                                 for ( var v in o) {
                                                 $wnd.console.log('- : ' + v);
                                                 }
                                                 }-*/;

}
