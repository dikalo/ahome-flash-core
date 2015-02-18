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
package com.ait.toolkit.flash.core.client.toplevel;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class As3Date.
 */
public class Date extends JsObject {

    /**
     * Instantiates a new date.
     */
    public Date() {
        jsObj = createNativePeer();
    }

    Date(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * New instance.
     * 
     * @return the date
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("Date");

    }

    public Date(int day) {
        this();
        setDate(day);
    }

    /**
     * New instance.
     * 
     * @param year
     *            the year
     * @param month
     *            the month
     * @param day
     *            the day
     * @return the date
     */
    public Date(int year, int month, int day) {
        this();
        setFullYear(year);
        setMonth(month);
        setDate(day);
    }

    /**
     * Gets the date.
     * 
     * @return the date
     */
    public final native int getDate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdate();
    }-*/;

    /**
     * Sets the date.
     * 
     * @param value
     *            the new date
     */
    public final native void setDate(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdate(value);
    }-*/;

    /**
     * Gets the date utc.
     * 
     * @return the date utc
     */
    public final native int getDateUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getDateUTC();
    }-*/;

    /**
     * Sets the date utc.
     * 
     * @param value
     *            the new date utc
     */
    public final native void setDateUTC(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdateUTC(value);
    }-*/;

    /**
     * Gets the day.
     * 
     * @return the day
     */
    public final native int getDay()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getday();
    }-*/;

    /**
     * Gets the day utc.
     * 
     * @return the day utc
     */
    public final native void getDayUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.getdayUTC();
    }-*/;

    /**
     * Gets the full year.
     * 
     * @return the full year
     */
    public final native int getFullYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfullYear();
    }-*/;

    /**
     * Sets the full year.
     * 
     * @param value
     *            the new full year
     */
    public final native void setFullYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfullYear(value);
    }-*/;

    /**
     * Gets the full year utc.
     * 
     * @return the full year utc
     */
    public final native int getFullYearUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfullYearUTC();
    }-*/;

    /**
     * Sets the full year utc.
     * 
     * @param value
     *            the new full year utc
     */
    public final native void setFullYearUTC(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setfullYearUTC(value);
    }-*/;

    /**
     * Gets the hours.
     * 
     * @return the hours
     */
    public final native int getHours()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gethours();
    }-*/;

    /**
     * Sets the hours.
     * 
     * @param value
     *            the new hours
     */
    public final native void setHours(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.sethours(value);
    }-*/;

    /**
     * Gets the hours utc.
     * 
     * @return the hours utc
     */
    public final native int getHoursUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gethoursUTC();
    }-*/;

    /**
     * Sets the hours utc.
     * 
     * @param value
     *            the new hours utc
     */
    public final native void setHoursUTC(int value)/*-{
		peer.sethoursUTC(value);
    }-*/;

    /**
     * Gets the milliseconds.
     * 
     * @return the milliseconds
     */
    public final native int getMilliseconds()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmilliseconds();
    }-*/;

    /**
     * Sets the milliseconds.
     * 
     * @param value
     *            the new milliseconds
     */
    public final native void setMilliseconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmilliseconds(value);
    }-*/;

    /**
     * Gets the milliseconds utc.
     * 
     * @return the milliseconds utc
     */
    public final native int getMillisecondsUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmillisecondsUTC();
    }-*/;

    /**
     * Sets the milliseconds utc.
     * 
     * @param value
     *            the new milliseconds utc
     */
    public final native void setMillisecondsUTC(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmillisecondsUTC(value);
    }-*/;

    /**
     * Gets the minutes.
     * 
     * @return the minutes
     */
    public final native int getMinutes()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getminutes();
    }-*/;

    /**
     * Sets the minutes.
     * 
     * @param value
     *            the new minutes
     */
    public final native void setMinutes(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setminutes(value);
    }-*/;

    /**
     * Gets the minutes utc.
     * 
     * @return the minutes utc
     */
    public final native int getMinutesUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getminutesUTC();
    }-*/;

    /**
     * Sets the minutes utc.
     * 
     * @param value
     *            the new minutes utc
     */
    public final native void setMinutesUTC(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setminutesUTC(value);
    }-*/;

    /**
     * Gets the month.
     * 
     * @return the month
     */
    public final native int getMonth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmonth();
    }-*/;

    /**
     * Sets the month.
     * 
     * @param value
     *            the new month
     */
    public final native void setMonth(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmonth(value);
    }-*/;

    /**
     * Gets the month utc.
     * 
     * @return the month utc
     */
    public final native int getMonthUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmonthUTC();
    }-*/;

    /**
     * Sets the month utc.
     * 
     * @param value
     *            the new month utc
     */
    public final native void setMonthUTC(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmonthUTC(value);
    }-*/;

    /**
     * Gets the seconds.
     * 
     * @return the seconds
     */
    public final native int getSeconds()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getseconds();
    }-*/;

    /**
     * Sets the seconds.
     * 
     * @param value
     *            the new seconds
     */
    public final native void setSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setseconds(value);
    }-*/;

    /**
     * Gets the seconds utc.
     * 
     * @return the seconds utc
     */
    public final native int getSecondsUTC()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsecondsUTC();
    }-*/;

    /**
     * Sets the seconds utc.
     * 
     * @param value
     *            the new seconds utc
     */
    public final native void setSecondsUTC(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsecondsUTC(value);
    }-*/;

    /**
     * Gets the time.
     * 
     * @return the time
     */
    public final native int getTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettime();
    }-*/;

    /**
     * Sets the time.
     * 
     * @param value
     *            the new time
     */
    public final native void setTime(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settime(value);
    }-*/;

    /**
     * Gets the time zone offset.
     * 
     * @return the time zone offset
     */
    public final native int getTimeZoneOffset()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettimeZoneOffset();
    }-*/;

    /**
     * Sets the time zone offset.
     * 
     * @param value
     *            the new time zone offset
     */
    public final native void setTimeZoneOffset(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settimeZoneOffset(value);
    }-*/;

    /**
     * Parses the.
     * 
     * @param date
     *            the date
     * @return the int
     */
    public static int parse(String date) {
        return new Date()._parse(date);
    }

    /**
     * _parse.
     * 
     * @param date
     *            the date
     * @return the int
     */
    private final native int _parse(String date)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.parse(date);
    }-*/;

}
