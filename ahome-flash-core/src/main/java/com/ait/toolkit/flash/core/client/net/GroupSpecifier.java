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
import com.ait.toolkit.flash.core.client.utils.factories.GroupSpecifierFactory;

/**
 * The GroupSpecifier class is used to construct the opaque groupspec strings
 * that can be passed to NetStream and NetGroup constructors. A groupspec
 * specifies an RTMFP Peer-to-Peer Group, including the capabilities,
 * restrictions, and authorizations of the member using the groupspec.
 * <p>
 * By default, all capabilities are disabled, and peer-to-peer connections are
 * allowed.
 */
public class GroupSpecifier extends JsObject {

    /**
     * Instantiates a new group specifier.
     */
    public GroupSpecifier(String name) {
        jsObj = GroupSpecifierFactory.INSTANCE.create(name);
    }

    /**
     * Specifies whether information about group membership can be exchanged on
     * IP multicast sockets.
     * 
     * @return true, if successful
     */
    public native boolean hasIpMulticastMemberUpdatesEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getipMulticastMemberUpdatesEnabled();
    }-*/;

    /**
     * Specifies whether information about group membership can be exchanged on
     * IP multicast sockets.
     * 
     * @param value the new ip multicast member updates enabled
     */
    public native void setIpMulticastMemberUpdatesEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setipMulticastMemberUpdatesEnabled(value);
    }-*/;

    /**
     * Specifies whether streaming is enabled for the NetGroup.
     * 
     * @return true, if is multicast enabled
     */
    public native boolean isMulticastEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmulticastEnabled();
    }-*/;

    /**
     * Specifies whether streaming is enabled for the NetGroup.
     * 
     * @param value the new multicast enabled
     */
    public native void setMulticastEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmulticastEnabled(value);
    }-*/;

    /**
     * Specifies whether object replication is enabled for the NetGroup.
     * 
     * @return true, if is obejct replication enabled
     */
    public native boolean isObejctReplicationEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectReplicationEnabled();
    }-*/;

    /**
     * Specifies whether object replication is enabled for the NetGroup.
     * 
     * @param value the new object replication enabled
     */
    public native void setObjectReplicationEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setobjectReplicationEnabled(value);
    }-*/;

    /**
     * Specifies whether peer-to-peer connections are disabled for the NetGroup
     * or NetStream.
     * 
     * @return true, if is peer to peer disabled
     */
    public native boolean isPeerToPeerDisabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpeerToPeerDisabled();
    }-*/;

    /**
     * Specifies whether peer-to-peer connections are disabled for the NetGroup
     * or NetStream.
     * 
     * @param value the new peer to peer disabled
     */
    public native void setPeerToPeerDisabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpeerToPeerDisabled(value);
    }-*/;

    /**
     * Specifies whether posting is enabled for the NetGroup.
     * 
     * @return true, if is posting enabled
     */
    public native boolean isPostingEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getpostingEnabled();
    }-*/;

    /**
     * Sets whether posting is enabled for the NetGroup.
     * 
     * @param value the new posting enabled
     */
    public native void setPostingEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setpostingEnabled(value);
    }-*/;

    /**
     * Specifies whether directed routing methods are enabled for the NetGroup.
     * 
     * @return true, if is root enabled
     */
    public native boolean isRootingEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getrootingEnabled();
    }-*/;

    /**
     * Sets whether directed routing methods are enabled for the NetGroup.
     * 
     * @param value the new rooting enabled
     */
    public native void setRootingEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setrootingEnabled(value);
    }-*/;

    /**
     * Specifies whether members of the NetGroup can open a channel to the
     * server.
     * 
     * @return true, if is server channel enabled
     */
    public native boolean isServerChannelEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getserverChannelEnabled();
    }-*/;

    /**
     * Sets whether members of the NetGroup can open a channel to the server.
     * 
     * @param value the new server channel enabled
     */
    public native void setServerChannelEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setServerChannelEnabled(value);
    }-*/;

    /**
     * Causes the associated NetStream or NetGroup to make an initial neighbor
     * connection to the specified peerID.
     * 
     * @param peerID the peer id
     */
    public native void addBootStrapPeer(String peerID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addBootstrapPeer(peerID);
		;
    }-*/;

    /**
     * Causes the associated NetStream or NetGroup to join the specified IP
     * multicast group and listen to the specified UDP port.
     * 
     * @param address the address
     */
    public native void addIPMulticastAddress(String address)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addIPMulticastAddress(address);
    }-*/;

    /**
     * Causes the associated NetStream or NetGroup to join the specified IP
     * multicast group and listen to the specified UDP port.
     * 
     * @param address the address
     * @param port the port
     */
    public native void addIPMulticastAddrees(String address, Object port)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addIPMulticastAddress(address, port)
    }-*/;

    /**
     * Causes the associated NetStream or NetGroup to join the specified IP
     * multicast group and listen to the specified UDP port.
     * 
     * @param address the address
     * @param port the port
     * @param source the source
     */
    public native void addIPMulticastAddrees(String address, Object port, String source)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addIPMulticastAddrees(address, port, source);
    }-*/;

    /**
     * Gets a string that represents passwords for IP multicast publishing and
     * for posting.
     * 
     * @return the authorizations
     */
    public native String getAuthorizations()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.authorizations();
    }-*/;

    /**
     * Encodes and returns a string that represents a bootstrap peerID.
     * 
     * @param peerID the peer id
     * @return the string
     */
    public static String encodeBootstrapPeerIDSpec(String peerID) {
        return GroupSpecifierFactory.INSTANCE.encodeBootstrapPeerIDSpec(peerID);
    }

    /**
     * Encodes and returns a string that represents an IP multicast socket
     * address.
     * 
     * @param address the address
     * @return the string
     */
    public static String encodeIPMulticasAdressSpec(String address) {
        return GroupSpecifierFactory.INSTANCE.encodeIPMulticastAddressSpec(address);
    }

    /**
     * Encodes and returns a string that represents an IP multicast socket
     * address.
     * 
     * @param address the address
     * @param port the port
     * @return the string
     */
    public static String encodeIPMulticasAdressSpec(String address, Object port) {
        return GroupSpecifierFactory.INSTANCE.encodeIPMulticastAddressSpec(address, port);
    }

    /**
     * Encodes and returns a string that represents an IP multicast socket
     * address.
     * 
     * @param address the address
     * @param port the port
     * @param source the source
     * @return the string
     */
    public static String encodeIPMulticasAdressSpec(String address, Object port, String source) {
        return GroupSpecifierFactory.INSTANCE.encodeIPMulticastAddressSpec(address, port, source);
    }

    /**
     * Encodes and returns a string that represents a posting password.
     * 
     * @param password the password
     * @return the string
     */
    public static String encodePostingAuthorization(String password) {
        return GroupSpecifierFactory.INSTANCE.encodePostingAuthorization(password);
    }

    /**
     * Encodes and returns a string that represents a multicast publishing
     * password.
     * 
     * @param password the password
     * @return the string
     */
    public static String encodePublishAuthorization(String password) {
        return GroupSpecifierFactory.INSTANCE.encodePublishgAuthorization(password);
    }

    /**
     * Returns the opaque groupspec string, including authorizations, that can
     * be passed to NetStream and NetGroup constructors.
     * 
     * @return the string
     */
    public native String groupSpecWithAuthorizations()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.groupspecWithAuthorizations()
    }-*/;

    /**
     * Returns the opaque groupspec string, without authorizations, that can be
     * passed to NetStream and NetGroup constructors.
     * 
     * @return the string
     */
    public native String getGroupSpecWithoutAuthorizations()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.groupspecWithoutAuthorizations()
    }-*/;

    /**
     * Adds a strong pseudorandom tag to the groupspec to make it unique.
     */
    public native void makeUnique()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.makeUnique()
    }-*/;

    /**
     * Specifies whether a password is required to post in the NetGroup.
     * 
     * @param password the new posting password
     */
    public native void setPostingPassword(String password)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPostingPassword(password)
    }-*/;

    /**
     * Specifies whether a password is required to post in the NetGroup.
     * 
     * @param passwordn the passwordn
     * @param salt the salt
     */
    public native void setPostingPassword(String passwordn, String salt)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPostingPassword(password, salt)
    }-*/;

    /**
     * Specifies whether a password is required to publish a multicast stream in
     * the NetStream.
     * 
     * @param password the new publish password
     */
    public native void setPublishPassword(String password)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPublishPassword(password)
    }-*/;

    /**
     * Specifies whether a password is required to publish a multicast stream in
     * the NetStream.
     * 
     * @param passwordn the passwordn
     * @param salt the salt
     */
    public native void setPublishPassword(String passwordn, String salt)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPublishPassword(password, salt)
    }-*/;

}
