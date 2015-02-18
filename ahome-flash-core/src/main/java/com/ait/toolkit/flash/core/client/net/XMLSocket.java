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
 * The XMLSocket class implements client sockets that let the FlashDetect Player or
 * AIR application communicate with a server computer identified by an IP
 * address or domain name. The XMLSocket class is useful for client-server
 * applications that require low latency, such as real-time chat systems. A
 * traditional HTTP-based chat solution frequently polls the server and
 * downloads new messages using an HTTP request. In contrast, an XMLSocket chat
 * solution maintains an open connection to the server, which lets the server
 * immediately send incoming messages without a request from the client. To use
 * the XMLSocket class, the server computer must run a daemon that understands
 * the protocol used by the XMLSocket class.
 */
public class XMLSocket extends EventDispatcher {

    /**
     * New instance.
     * 
     * @return the xML socket
     */
    public XMLSocket() {
        jsObj = NetFactory.INSTANCE.createXMLSocket();
    }

    /**
     * New instance.
     * 
     * @param host the host
     * @return the xML socket
     */
    public XMLSocket(String host) {
        jsObj = NetFactory.INSTANCE.createXMLSocket(host);
    }

    /**
     * New instance.
     * 
     * @param host the host
     * @param port the port
     * @return the xML socket
     */
    public XMLSocket(String host, int port) {
        jsObj = NetFactory.INSTANCE.createXMLSocket(host, port);
    }

    /**
     * Checks if is connected.
     * 
     * @return true, if is connected
     */
    public native boolean isConnected() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getconnected();
    }-*/;

    /**
     * Gets the timeout.
     * 
     * @return the timeout
     */
    public native int getTimeout() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettimeout();
    }-*/;

    /**
     * Close.
     */
    public native void close() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
    }-*/;

    /**
     * Connect.
     * 
     * @param host the host
     * @param port the port
     */
    public native void connect(String host, int port) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.connect(host, port);
    }-*/;

    /**
     * Send.
     * 
     * @param value the value
     */
    public native void send(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.send(value);
    }-*/;
}
