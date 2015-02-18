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
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.toplevel.As3Array;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The NetConnection class creates a two-way connection between a client and a
 * server. The client can be a FlashDetect Player or AIR application. The server can
 * be a web server, FlashDetect Media Server, an application server running FlashDetect
 * Remoting, or the Adobe Stratus service. Call NetConnection.connect() to
 * establish the connection. Use the NetStream class to send streams of media
 * and data over the connection.
 */
public class NetConnection extends EventDispatcher {

    /**
     * Instantiates a new net connection.
     */
    public NetConnection() {
        jsObj = createNativePeer();
    }

    /**
     * New instance.
     * 
     * @return the net connection
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("flash.net.NetConnection");
    }

    /**
     * Gets the object on which callback methods are invoked.
     * 
     * @param <T> the generic type
     * @return the client
     */
    public native <T> T getClient() /*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getclient();
    }-*/;

    /**
     * Sets the object on which callback methods are invoked.
     * 
     * @param client the new client
     */
    public native void setClient(Object client) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setclient(client);
    }-*/;

    /**
     * Indicates whether the application is connected to a server through a
     * persistent RTMP connection (true) or not (false).
     * 
     * @return the boolean
     */
    public native Boolean isConnected() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getconnected();
    }-*/;

    /**
     * The proxy type used to make a successful connection to FlashDetect Media
     * Server.
     * 
     * @return the connected proxy type
     */
    public native String getConnectedProxyType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getconnectedProxyType();
    }-*/;

    /**
     * Gets the default object encoding for NetConnection objects.
     * 
     * @return the default object encoding
     */
    public static int getDefaultObjectEncoding() {
        return NetFactory.INSTANCE.getDefaultObjectEncoding();
    }

    /**
     * Sets the default object encoding for NetConnection objects.
     * 
     * @param value the new default object encoding
     */
    public static void setDefaultObjectEncoding(int value) {
        NetFactory.INSTANCE.setDefaultObjectEncoding(value);
    }

    /**
     * The identifier of the FlashDetect Media Server instance to which this FlashDetect
     * Player or Adobe AIR instance is connected.
     * 
     * @return the far id
     */
    public native String getFarID() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfarID();
    }-*/;

    /**
     * A value chosen substantially by FlashDetect Media Server, unique to this
     * connection.
     * 
     * @return the far nonce
     */
    public native String getFarNonce() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfarNonce();
    }-*/;

    /**
     * Gets the max peer connections.
     * 
     * @return the max peer connections
     */
    public native int getMaxPeerConnections() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmaxPeerConnections();
    }-*/;

    /**
     * Sets the max peer connections.
     * 
     * @param value the new max peer connections
     */
    public native void setMaxPeerConnections(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmaxPeerConnections(value);
    }-*/;

    /**
     * The identifier of this FlashDetect Player or Adobe AIR instance for this
     * NetConnection instance.
     * 
     * @return the near id
     */
    public native String getNearID() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnearID();
    }-*/;

    /**
     * A value chosen substantially by this FlashDetect Player or Adobe AIR instance,
     * unique to this connection.
     * 
     * @return the near nonce
     */
    public native String getNearNonce() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getnearNonce();
    }-*/;

    /**
     * The object encoding for this NetConnection instance.
     * 
     * @return the object encoding
     */
    public native int getObjectEncoding() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectEncoding();
    }-*/;

    /**
     * Sets the object encoding for this NetConnection instance.
     * 
     * @param value the new object encoding
     */
    public native void setObjectEncoding(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setobjectEncoding(value);
    }-*/;

    /**
     * The protocol used to establish the connection.
     * 
     * @return the protocol
     */
    public native String getProtocol() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getprotocol();
    }-*/;

    /**
     * Determines which fallback methods are tried if an initial connection
     * attempt to FlashDetect Media Server fails.
     * 
     * @return the proxy type
     */
    public native String getProxyType() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getproxyType();
    }-*/;

    /**
     * Determines which fallback methods are tried if an initial connection
     * attempt to FlashDetect Media Server fails.
     * 
     * @param value the new proxy type
     */
    public native void setProxyType(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setproxyType(value);
    }-*/;

    /**
     * An object that holds all of the peer subscriber NetStream objects that
     * are not associated with publishing NetStream objects
     * 
     * @return the unconnected stream
     */
    public native As3Array getUnconnectedStream() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getunconnectedPeerStream();
		return @com.ait.toolkit.flash.core.client.toplevel.As3Array::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The URI passed to the NetConnection.connect() method.
     * 
     * @return the uRI
     */
    public native String getURI() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.geturi();
    }-*/;

    /**
     * Indicates whether a secure connection was made using native Transport
     * Layer Security (TLS) rather than HTTPS.
     * 
     * @return true, if is using tls
     */
    public native boolean isUsingTLS() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getusingTLS();
    }-*/;

    /**
     * Adds a context header to the Action Message Format (AMF) packet
     * structure.
     * 
     * @param operation the operation
     */
    public native void addHeader(String operation) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addHeader(operation);
    }-*/;

    /**
     * Adds a context header to the Action Message Format (AMF) packet
     * structure.
     * 
     * @param operation the operation
     * @param mustUnderstand the must understand
     */
    public native void addHeader(String operation, boolean mustUnderstand) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addHeader(operation, mustUnderstand);
    }-*/;

    /**
     * Adds the header.
     * 
     * @param operation the operation
     * @param mustUnderstand the must understand
     * @param param the param
     */
    public native void addHeader(String operation, boolean mustUnderstand, Object param) /*-{
		peer.addHeader(operation, mustUnderstand, param);
    }-*/;

    /**
     * Calls a command or method on FlashDetect Media Server or on an application
     * server running FlashDetect Remoting.
     * 
     * @param command the command
     * @param responder the responder
     * @param arguments the arguments
     */
    public native void call(String command, Responder responder, String... arguments) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.call
				.apply(
						command,
						responder.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						arguments);
    }-*/;

    /**
     * Closes the connection that was opened locally or to the server and
     * dispatches a netStatus event with a code property of
     * NetConnection.Connect.Closed.
     */
    public native void close() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.close();
    }-*/;

    /**
     * Creates a two-way connection to an application on FlashDetect Media Server or
     * to FlashDetect Remoting, or creates a two-way network endpoint for RTMFP
     * peer-to-peer group communication.
     * 
     * @param comment the comment
     * @param arguments the arguments
     */
    public native void connect(String comment, String... arguments) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.connent.apply(comment, arguments);
    }-*/;

}
