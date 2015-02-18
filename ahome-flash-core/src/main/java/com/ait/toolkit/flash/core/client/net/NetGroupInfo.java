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
package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NetGroupInfo class specifies various Quality of Service (QoS) statistics
 * related to a NetGroup object's underlying RTMFP Peer-to-Peer data transport.
 * The NetGroup.info property returns a NetGroupInfo object which is a snapshot
 * of the current QoS state.
 */
public class NetGroupInfo extends JsObject {

    /**
     * Instantiates a new net group info.
     */
    protected NetGroupInfo() {

    }

    NetGroupInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the object replication receive bytes per second.
     * 
     * @return the object replication receive bytes per second
     */
    public native double getObjectReplicationReceiveBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectReplicationReceiveBytesPerSecond();
    }-*/;

    /**
     * Gets the object replication send bytes per second.
     * 
     * @return the object replication send bytes per second
     */
    public native double getObjectReplicationSendBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectReplicationSendBytesPerSecond();
    }-*/;

    /**
     * Gets the posting receive control bytes per second.
     * 
     * @return the posting receive control bytes per second
     */
    public native double getPostingReceiveControlBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpostingReceiveControlBytesPerSecond();
    }-*/;

    /**
     * Gets the posting receive data bytes per second.
     * 
     * @return the posting receive data bytes per second
     */
    public native double getPostingReceiveDataBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpostingReceiveDataBytesPerSecond();
    }-*/;

    /**
     * Gets the posting send control bytes per second.
     * 
     * @return the posting send control bytes per second
     */
    public native double getPostingSendControlBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpostingSendControlBytesPerSecond();
    }-*/;

    /**
     * Gets the posting send data bytes per second.
     * 
     * @return the posting send data bytes per second
     */
    public native double getPostingSendDataBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpostingSendDataBytesPerSecond();
    }-*/;

    /**
     * Gets the routing send bytes per second.
     * 
     * @return the routing send bytes per second
     */
    public native double getRoutingSendBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getroutingSendBytesPerSecond();
    }-*/;

    /**
     * Gets the routing receive bytes per second.
     * 
     * @return the routing receive bytes per second
     */
    public native double getRoutingReceiveBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getroutingReceiveBytesPerSecond();
    }-*/;

    /**
     * Gets the string value.
     * 
     * @return the string value
     */
    public native String getStringValue()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.toString();
    }-*/;

}
