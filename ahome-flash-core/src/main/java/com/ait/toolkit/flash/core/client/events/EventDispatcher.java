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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.events.handlers.ErrorHandler;
import com.ait.toolkit.flash.core.client.events.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The EventDispatcher class is the base class for all classes that dispatch events. The EventDispatcher class implements the IEventDispatcher interface and is the base class for
 * the DisplayObject class. The EventDispatcher class allows any object on the display list to be an event target and as such, to use the methods of the IEventDispatcher interface.
 * <p>
 * Event targets are an important part of the FlashDetect Player and Adobe AIR event model. The event target serves as the focal point for how events flow through the display list
 * hierarchy. When an event such as a mouse click or a keypress occurs, FlashDetect Player or the AIR application dispatches an event object into the event flow from the root of
 * the display list. The event object then makes its way through the display list until it reaches the event target, at which point it begins its return trip through the display
 * list. This round-trip journey to the event target is conceptually divided into three phases: the capture phase comprises the journey from the root to the last node before the
 * event target's node, the target phase comprises only the event target node, and the bubbling phase comprises any subsequent nodes encountered on the return trip to the root of
 * the display list.
 * <p>
 * In general, the easiest way for a user-defined class to gain event dispatching capabilities is to extend EventDispatcher. If this is impossible (that is, if the class is already
 * extending another class), you can instead implement the IEventDispatcher interface, create an EventDispatcher member, and write simple hooks to route calls into the aggregated
 * EventDispatcher.
 */
public class EventDispatcher extends JsObject {

	/**
	 * Instantiates a new event dispatcher.
	 */
	protected EventDispatcher() {

	}

	/**
	 * Adds the event listener.
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 * @param priority
	 *            the priority
	 */
	private native void addEventListener(String type, JavaScriptObject listener, int priority) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addEventListener(type, listener, false, priority);
	}-*/;

	/**
	 * Adds the event listener.
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 * @param priority
	 *            the priority
	 * @param useWeakReference
	 *            the use weak reference
	 */
	private native void addEventListener(String type, JavaScriptObject listener, int priority, boolean useWeakReference) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addEventListener(type, listener, false, priority, useWeakReference);
	}-*/;

	/**
	 * Dispatch event.
	 * 
	 * @param event
	 *            the event
	 * @return true, if successful
	 */
	public native boolean dispatchEvent(Event event) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.dispatchEvent(event.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Checks for event listener.
	 * 
	 * @param type
	 *            the type
	 * @return true, if successful
	 */
	public native boolean hasEventListener(String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasEventListener(type);
	}-*/;

	/**
	 * Removes the event listener.
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 */
	private native void removeEventListener(String type, JavaScriptObject listener) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeEventListener(type, listener);
	}-*/;

	/**
	 * Removes the event listener.
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 */
	public void removeEventListener(String type, EventListener<?> listener) {
		this.removeEventListener(type, listener.jsoPeer);
	}

	/**
	 * Will trigger.
	 * 
	 * @param type
	 *            the type
	 * @return true, if successful
	 */
	public native boolean willTrigger(String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.willTrigger(type);
	}-*/;

	/**
	 * Adds the event listener.
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 */
	private native void addEventListener(String type, JavaScriptObject listener) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addEventListener(type, listener);
	}-*/;

	/**
	 * Adds the event listener. use addEventHandler instead
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 */
	@Deprecated
	public void addEventListener(String type, EventListener<?> listener) {
		addEventListener(type, listener.jsoPeer);
	}

	public native CallbackRegistration addEventHandler(String type, EventHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(event) {
			var eventObject = @com.ait.toolkit.flash.core.client.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
			handler.@com.ait.toolkit.flash.core.client.events.handlers.EventHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/Event;)(eventObject);
		};
		peer.addEventListener(type, fn);
		return @com.ait.toolkit.flash.core.client.events.CallbackRegistration::new(Lcom/ait/toolkit/flash/core/client/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,type,fn);
	}-*/;

	public native void addNativeErrorHandler(String event, ErrorHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						event,
						$entry(function(e) {
							var eventObject = @com.ait.toolkit.flash.core.client.events.ErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.flash.core.client.events.handlers.ErrorHandler::onEvent(Lcom/ait/toolkit/flash/core/client/events/ErrorEvent;)(eventObject);
						}));
	}-*/;

}
