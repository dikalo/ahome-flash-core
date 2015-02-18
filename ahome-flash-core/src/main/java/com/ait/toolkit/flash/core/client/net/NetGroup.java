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

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;

/**
 * Instances of the NetGroup class represent membership in an RTMFP group
 */

public class NetGroup extends EventDispatcher {

    /**
     * New instance.
     * 
     * @param connection the connection
     * @param groupSpec the group spec
     * @return the net group
     */
    public NetGroup(NetConnection connection, String groupSpec) {
        jsObj = NetFactory.INSTANCE.createNetGroup(connection, groupSpec);
    }

    /**
     * Gets the estimated member count.
     * 
     * @return the estimated member count
     */
    public native double getEstimatedMemberCount()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getestimatedMemberCount();
    }-*/;

    /**
     * Gets the info.
     * 
     * @return the info
     */
    public native NetGroupInfo getInfo()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getinfo();
		return @com.ait.toolkit.flash.core.client.net.NetGroupInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the local coverage from.
     * 
     * @return the local coverage from
     */
    public native String getLocalCoverageFrom()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlocalCoverageFrom();
    }-*/;

    /**
     * Gets the local coverage to.
     * 
     * @return the local coverage to
     */
    public native String getLocalCoverageTo()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getlocalCoverageTo();
    }-*/;

    /**
     * Gets the neighbor count.
     * 
     * @return the neighbor count
     */
    public native int getNeighborCount()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getneighborCount();
    }-*/;

    /**
     * Gets the receive mode.
     * 
     * @return the receive mode
     */
    public NetGroupReceiveMode getReceiveMode() {
        return NetGroupReceiveMode.fromValue(_getReceiveMode());
    }

    /**
     * _get receive mode.
     * 
     * @return the string
     */
    private native String _getReceiveMode()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getreceiveMode();
    }-*/;

    /**
     * Sets the receive mode.
     * 
     * @param mode the new receive mode
     */
    public void setReceiveMode(NetGroupReceiveMode mode) {
        setReceiveMode(mode.value);
    }

    /**
     * Sets the receive mode.
     * 
     * @param value the new receive mode
     */
    private native void setReceiveMode(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setreceiveMode(value);
    }-*/;

    /**
     * Gets the replication strategy.
     * 
     * @return the replication strategy
     */
    public NetGroupReplicationStrategy getReplicationStrategy() {
        return NetGroupReplicationStrategy.fromValue(_getReplicationStrategy());
    }

    /**
     * _get replication strategy.
     * 
     * @return the string
     */
    private native String _getReplicationStrategy()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getreplicationStrategy();
    }-*/;

    /**
     * Sets the replication strategy.
     * 
     * @param strategy the new replication strategy
     */
    public void setReplicationStrategy(NetGroupReplicationStrategy strategy) {
        setReplicationStrategy(strategy.value);
    }

    /**
     * Sets the replication strategy.
     * 
     * @param value the new replication strategy
     */
    private native void setReplicationStrategy(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setreplicationStrategy(value);
    }-*/;

    /**
     * Adds the have objects.
     * 
     * @param startIndex the start index
     * @param endIndex the end index
     */
    public native void addHaveObjects(int startIndex, int endIndex)/*-{
		peer.addHaveObjects(startIndex, endIndex);
    }-*/;

    /**
     * Adds the member hint.
     * 
     * @param peerID the peer id
     * @return true, if successful
     */
    public native boolean addMemberHint(String peerID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addMemberHint(peerID);
    }-*/;

    /**
     * Adds the neighbor.
     * 
     * @param peerID the peer id
     * @return true, if successful
     */
    public native boolean addNeighbor(String peerID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.addNeighbor(peerID);
    }-*/;

    /**
     * Adds the want objects.
     * 
     * @param startIndex the start index
     * @param endIndex the end index
     */
    public native void addWantObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addWantObjects(startIndex, endIndex);
    }-*/;

    /**
     * Close.
     */
    public native void close()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Convert peer id to group address.
     * 
     * @param peerID the peer id
     * @return the string
     */
    public native String convertPeerIDToGroupAddress(String peerID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.convertPeerIDToGroupAddress(peerID);
    }-*/;

    /**
     * Deny requested object.
     * 
     * @param requestID the request id
     */
    public native void denyRequestedObject(int requestID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.denyRequestedObject(requestID);
    }-*/;

    /**
     * Post.
     * 
     * @param value the value
     * @return the string
     */
    public native String post(Object value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.post(value);
    }-*/;

    /**
     * Removes the have objects.
     * 
     * @param startIndex the start index
     * @param endIndex the end index
     */
    public native void removeHaveObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.removeHaveObjects(startIndex, endIndex);
    }-*/;

    /**
     * Removes the want objects.
     * 
     * @param startIndex the start index
     * @param endIndex the end index
     */
    public native void removeWantObjects(int startIndex, int endIndex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.removeWantObjects(startIndex, endIndex);
    }-*/;

    /**
     * Send to all neighbors.
     * 
     * @param message the message
     * @return the net group send result
     */
    public NetGroupSendResult sendToAllNeighbors(Object message) {
        return NetGroupSendResult.fromValue(_sendToAllNeighbors(message));
    }

    /**
     * _send to all neighbors.
     * 
     * @param message the message
     * @return the string
     */
    private native String _sendToAllNeighbors(Object message)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.sendToAllNeighbors(message);
    }-*/;

    /**
     * Sends a message to the neighbor (or local node) nearest to the specified
     * group address.
     * 
     * @param message the message
     * @param groupAddress the group address
     * @return the net group send result
     */
    public NetGroupSendResult sendToNearest(Object message, String groupAddress) {
        return NetGroupSendResult.fromValue(_sendToNearest(message, groupAddress));
    }

    /**
     * _send to nearest.
     * 
     * @param message the message
     * @param groupAddress the group address
     * @return the string
     */
    private native String _sendToNearest(Object message, String groupAddress)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.sendToNearest(message, groupAddress);
    }-*/;

    /**
     * Sends a message to the neighbor specified by the sendMode parameter.
     * 
     * @param message the message
     * @param mode the mode
     * @return the net group send result
     */
    public NetGroupSendResult sendToNeighbor(Object message, NetGroupSendMode mode) {
        return NetGroupSendResult.fromValue(_sendToNeighbor(message, mode.value));
    }

    private native String _sendToNeighbor(Object message, String sendMode)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.sendToNeighbor(message, sendMode);
    }-*/;

    /**
     * Satisfies the request as received by NetStatusEvent
     * NetGroup.Replication.Request for an object previously advertised with the
     * addHaveObjects() method.
     * 
     * @param requestID the request id
     * @param object the object
     */
    public native void writeRequestObject(int requestID, Object object)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeRequestObject(requestID, object);
    }-*/;

}
