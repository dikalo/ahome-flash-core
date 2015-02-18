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
package com.ait.toolkit.flash.core.client.utils;

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.utils.factories.TimerFactory;

/**
 * The Timer class is the interface to timers, which let you run code on a
 * specified time sequence. Use the start() method to start a timer. Add an
 * event listener for the timer event to set up code to be run on the timer
 * interval.
 * <p>
 * You can create Timer objects to run once or repeat at specified intervals to
 * execute code on a schedule. Depending on the SWF file's framerate or the
 * runtime environment (available memory and other factors), the runtime may
 * dispatch events at slightly offset intervals. For example, if a SWF file is
 * set to play at 10 frames per second (fps), which is 100 millisecond
 * intervals, but your timer is set to fire an event at 80 milliseconds, the
 * event will be dispatched close to the 100 millisecond interval.
 * Memory-intensive scripts may also offset the events.
 */
public class Timer extends EventDispatcher {

    /**
     * New instance.
     * 
     * @return the timer
     */
    public Timer() {
        jsObj = TimerFactory.INSTANCE.createTimer();

    }

    /**
     * New instance.
     * 
     * @param delay the delay
     * @return the timer
     */
    public Timer(int delay) {
        jsObj = TimerFactory.INSTANCE.createTimer(delay);
    }

    /**
     * New instance.
     * 
     * @param delay the delay
     * @param repeatCount the repeat count
     * @return the timer
     */
    public Timer(int delay, int repeatCount) {
        jsObj = TimerFactory.INSTANCE.createTimer(delay, repeatCount);
    }

    /**
     * Gets the current count.
     * 
     * @return the current count
     */
    public native int getCurrentCount() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcurrentCount();
    }-*/;

    /**
     * Gets the delay.
     * 
     * @return the delay
     */
    public native int getDelay() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdelay();
    }-*/;

    /**
     * Sets the delay.
     * 
     * @param delay the new delay
     */
    public native void setDelay(int delay) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdelay(delay);
    }-*/;

    /**
     * Gets the repeat count.
     * 
     * @return the repeat count
     */
    public native int getRepeatCount() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrepeatCount();
    }-*/;

    /**
     * Sets the repeat count.
     * 
     * @param repeatCount the new repeat count
     */
    public native void setRepeatCount(int repeatCount) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrepeatCount(repeatCount);
    }-*/;

    /**
     * Checks if is running.
     * 
     * @return true, if is running
     */
    public native boolean isRunning() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrunning();
    }-*/;

    /**
     * Reset.
     */
    public native void reset() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.reset();
    }-*/;

    /**
     * Start.
     */
    public native void start() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.start();
    }-*/;

    /**
     * Stop.
     */
    public native void stop() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stop();
    }-*/;

}
