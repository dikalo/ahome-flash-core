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
 * The NetStreamMulticastInfo class specifies various Quality of Service (QoS)
 * statistics related to a NetStream object's underlying RTMFP Peer-to-Peer and
 * IP Multicast stream transport. A NetStreamMulticastInfo object is returned by
 * the NetStream.multicastInfo property.
 * <p>
 * Properties that return numbers represent totals computed from the beginning
 * of the multicast stream. These types of properties include the number of
 * media bytes sent or the number of media fragment messages received.
 * Properties that are rates represent a snapshot of the current rate averaged
 * over a few seconds. These types of properties include the rate at which a
 * local node is receiving data.
 * <p>
 * To see a list of values contained in the NetStreamMulticastInfo object, use
 * the NetStreamMulticastInfo.toString() method.
 */
public class NetStreamMulticastInfo extends JsObject {

    /**
     * Instantiates a new net stream multicast info.
     */
    protected NetStreamMulticastInfo() {

    }

    NetStreamMulticastInfo(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the bytes pushed from peers.
     * 
     * @return the bytes pushed from peers
     */
    public native double getBytesPushedFromPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesPushedFromPeers();
    }-*/;

    /**
     * Gets the bytes pushed to peers.
     * 
     * @return the bytes pushed to peers
     */
    public native double getBytesPushedToPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesPushedToPeers();
    }-*/;

    /**
     * Gets the bytes received form server.
     * 
     * @return the bytes received form server
     */
    public native double getBytesReceivedFormServer()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesReceivedFormServer();
    }-*/;

    /**
     * Gets the bytes received from ip multicast.
     * 
     * @return the bytes received from ip multicast
     */
    public native double getBytesReceivedFromIPMulticast()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesReceivedFromIPMulticast();
    }-*/;

    /**
     * Gets the bytes requested by peers.
     * 
     * @return the bytes requested by peers
     */
    public native double getBytesRequestedByPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesRequestedByPeers();
    }-*/;

    /**
     * Gets the bytes requested from peers.
     * 
     * @return the bytes requested from peers
     */
    public native double getBytesRequestedFromPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesRequestedFromPeers();
    }-*/;

    /**
     * Gets the fragments pushed from peers.
     * 
     * @return the fragments pushed from peers
     */
    public native double getFragmentsPushedFromPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfragmentsPushedFromPeers();
    }-*/;

    /**
     * Gets the fragments pushed to peers.
     * 
     * @return the fragments pushed to peers
     */
    public native double getFragmentsPushedToPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfragmentsPushedToPeers();
    }-*/;

    /**
     * Gets the fragments received from ip multicast.
     * 
     * @return the fragments received from ip multicast
     */
    public native double getFragmentsReceivedFromIPMulticast()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfragmentsReceivedFromIPMulticast();
    }-*/;

    /**
     * Gets the fragments received form server.
     * 
     * @return the fragments received form server
     */
    public native double getFragmentsReceivedFormServer()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfragmentsReceivedFormServer();
    }-*/;

    /**
     * Gets the fragments requested from peers.
     * 
     * @return the fragments requested from peers
     */
    public native double getFragmentsRequestedFromPeers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfragmentsRequestedFromPeers();
    }-*/;

    /**
     * Gets the receive control bytes per second.
     * 
     * @return the receive control bytes per second
     */
    public native double getReceiveControlBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getreceiveControlBytesPerSecond();
    }-*/;

    /**
     * Gets the receive data bytes per second.
     * 
     * @return the receive data bytes per second
     */
    public native double getReceiveDataBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getreceiveDataBytesPerSecond();
    }-*/;

    /**
     * Gets the receive data bytes per second from server.
     * 
     * @return the receive data bytes per second from server
     */
    public native double getReceiveDataBytesPerSecondFromServer()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getreceiveDataBytesPerSecondFromServer();
    }-*/;

    /**
     * Gets the send control bytes per second.
     * 
     * @return the send control bytes per second
     */
    public native double getSendControlBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsendControlBytesPerSecond();
    }-*/;

    /**
     * Gets the send control bytes per second to server.
     * 
     * @return the send control bytes per second to server
     */
    public native double getSendControlBytesPerSecondToServer()/*-{
		return peer.getsendControlBytesPerSecondToServer();
    }-*/;

    /**
     * Gets the send data bytes per second.
     * 
     * @return the send data bytes per second
     */
    public native double getSendDataBytesPerSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsendDataBytesPerSecond();
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
