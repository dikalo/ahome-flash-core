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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.ait.toolkit.flash.core.client.net;

import com.ait.toolkit.flash.core.client.utils.IoClass;
import com.ait.toolkit.flash.core.client.utils.factories.NetFactory;

/**
 * The Socket class enables code to establish Transport Control Protocol (TCP)
 * socket connections for sending and receiving binary data. The Socket class is
 * useful for working with servers that use binary protocols.
 * <p>
 * To use the methods of the Socket class, first use the constructor, new
 * Socket, to create a Socket object.
 * <p>
 * A socket transmits and receives data asynchronously.
 * <p>
 * On some operating systems, flush() is called automatically between execution
 * frames, but on other operating systems, such as Windows, the data is never
 * sent unless you call flush() explicitly. To ensure your application behaves
 * reliably across all operating systems, it is a good practice to call the
 * flush() method after writing each message (or related group of data) to the
 * socket.
 * <p>
 * In Adobe AIR, Socket objects are also created when a listening ServerSocket
 * receives a connection from an external process. The Socket representing the
 * connection is dispatched in a ServerSocketConnectEvent. Your application is
 * responsible for maintaining a reference to this Socket object. If you don't,
 * the Socket object is eligible for garbage collection and may be destroyed by
 * the runtime without warning.
 * <p>
 * SWF content running in the local-with-filesystem security sandbox cannot use
 * sockets.
 * <p>
 * Socket policy files on the target host specify the hosts from which SWF files
 * can make socket connections, and the ports to which those connections can be
 * made. The security requirements with regard to socket policy files have
 * become more stringent in the last several releases of FlashDetect Player. In all
 * versions of FlashDetect Player, Adobe recommends the use of a socket policy file;
 * in some circumstances, a socket policy file is required. Therefore, if you
 * are using Socket objects, make sure that the target host provides a socket
 * policy file if necessary.
 * 
 */
public class Socket extends IoClass {

    /**
     * New instance.
     * 
     * @return the socket
     */
    public Socket() {
        jsObj = NetFactory.INSTANCE.createSocket();
    }

    /**
     * New instance.
     * 
     * @param host the host
     * @return the socket
     */
    public Socket(String host) {
        jsObj = NetFactory.INSTANCE.createSocket(host);
    }

    /**
     * New instance.
     * 
     * @param host the host
     * @param port the port
     * @return the socket
     */
    public Socket(String host, int port) {
        jsObj = NetFactory.INSTANCE.createSocket(host, port);
    }

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
     * Sets the time out.
     * 
     * @param value the new time out
     */
    public native void setTimeOut(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settimeout(value);
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
     * Flush.
     */
    public native void flush() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.flush();
    }-*/;

}
