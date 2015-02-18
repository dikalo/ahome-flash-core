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
package com.ait.toolkit.flash.core.client.events;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The listener interface for receiving flashEvent events. The class that is
 * interested in processing a flashEvent event implements this interface, and
 * the object created with that class is registered with a component using the
 * component's <code>addEventListener<code> method. When
 * the flashEvent event occurs, that object's appropriate
 * method is invoked.
 * 
 * @param <T> the generic type
 */
public abstract class EventListener<T extends Event> {

    /** The jso peer. */
    final JavaScriptObject jsoPeer = createPeer(this);

    /**
     * Creates the peer.
     * 
     * @param listener the listener
     * @return the java script object
     */
    private static native JavaScriptObject createPeer(EventListener<?> listener) /*-{
		return function(e) {
			var eventObject = @com.ait.toolkit.flash.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			listener.@com.ait.toolkit.flash.core.client.events.EventListener::fireOnEvent(Lcom/ait/toolkit/flash/core/client/events/Event;)(eventObject);
		};

    }-*/;

    /**
     * On flash event.
     * 
     * @param event the event
     */
    protected abstract void onEvent(T event);

    // Called from JSNI
    /**
     * Fire on event.
     * 
     * @param event the event
     */
    private final void fireOnEvent(T event) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        if (handler != null) {
            fireOnEventAndCatch(event, handler);
        } else {
            onEvent(event);
        }
    }

    /**
     * Fire on event and catch.
     * 
     * @param event the event
     * @param handler the handler
     */
    private void fireOnEventAndCatch(T event, UncaughtExceptionHandler handler) {
        try {
            onEvent(event);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    /**
     * Gets the jso peer.
     * 
     * @return the jso peer
     */
    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }
}
