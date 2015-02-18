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
package com.ait.toolkit.flash.core.client.utils.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.core.client.net.NetConnection;
import com.ait.toolkit.flash.core.client.net.URLRequest;
import com.ait.toolkit.flash.core.client.utils.ByteArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A factory for creating Net objects.
 */
public class NetFactory extends JsObject {

    public static final NetFactory INSTANCE = new NetFactory();

    /**
     * Instantiates a new net factory.
     */
    private NetFactory() {
        jsObj = createNativePeer();
    }

    /**
     * Gets the single instance of NetFactory.
     * 
     * @return single instance of NetFactory
     */
    private JavaScriptObject createNativePeer() {
        return Bridge.createObject("com.ekambi.gwt.flash.factories.NetFactory");
    }

    /**
     * Gets the default object encoding.
     * 
     * @return the default object encoding
     */
    public final native int getDefaultObjectEncoding()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getDefaultObjectEncoding();
    }-*/;

    /**
     * Sets the default object encoding.
     * 
     * @param value the new default object encoding
     */
    public final native void setDefaultObjectEncoding(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDefaultObjectEncoding(value);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param connection the connection
     * @param groupSpec the group spec
     * @return the net group
     */
    public final native JavaScriptObject createNetGroup(NetConnection connection, String groupSpec)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createNetGroup(
						connection.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						groupSpec);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param connection the connection
     * @return the net stream
     */
    public final native JavaScriptObject createNetStream(NetConnection connection)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createNetStream(connection.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param connection the connection
     * @param peerID the peer id
     * @return the net stream
     */
    public final native JavaScriptObject createNetStream(NetConnection connection, String peerID)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createNetStream(
						connection.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						peerID);
    }-*/;

    /**
     * Reset drm vouchers.
     */
    public final native void resetDRMVouchers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resetDRMVouchers();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param result the result
     * @param status the status
     * @return the responder
     */
    public final native JavaScriptObject createResponder(JavaScriptObject result, JavaScriptObject status)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.createResponder(result, status);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @return the shared object
     */
    public final native JavaScriptObject createLocalSharedObject(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createLocalSharedObject(name);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @param localPath the local path
     * @return the shared object
     */
    public final native JavaScriptObject createLocalSharedObject(String name, String localPath)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createLocalSharedObject(name, localPath);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @param localPath the local path
     * @param secure the secure
     * @return the shared object
     */
    public final native JavaScriptObject createLocalSharedObject(String name, String localPath, boolean secure)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createLocalSharedObject(name, localPath, secure);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @return the shared object
     */
    public final native JavaScriptObject createRemoteSharedObject(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRemoteSharedObject(name);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @param remotePath the remote path
     * @return the shared object
     */
    public final native JavaScriptObject createRemoteSharedObject(String name, String remotePath)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRemoteSharedObject(name, remotePath);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @param remotePath the remote path
     * @param persistence the persistence
     * @return the shared object
     */
    public final native JavaScriptObject createRemoteSharedObject(String name, String remotePath, Object persistence)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRemoteSharedObject(name, remotePath, persistence);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @param remotePath the remote path
     * @param persistence the persistence
     * @param secure the secure
     * @return the shared object
     */
    public final native JavaScriptObject createRemoteSharedObject(String name, String remotePath, Object persistence,
                    boolean secure)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRemoteSharedObject(name, remotePath, persistence,
				secure);
    }-*/;

    /**
     * Gets the shared object defaul encoding.
     * 
     * @return the shared object defaul encoding
     */
    public final native int getSharedObjectDefaulEncoding()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getSharedObjectDefaulEncoding();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the socket
     */
    public final native JavaScriptObject createSocket()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createSocket();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param host the host
     * @return the socket
     */
    public final native JavaScriptObject createSocket(String host)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createSocket(host);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param host the host
     * @param port the port
     * @return the socket
     */
    public final native JavaScriptObject createSocket(String host, int port)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createSocket(host, port);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the URL loader
     */
    public final native JavaScriptObject createURLLoader()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLLoader();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param urlRequest the url request
     * @return the URL loader
     */
    public final native JavaScriptObject createURLLoader(URLRequest urlRequest)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createURLLoader(urlRequest.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the URL request
     */
    public final native JavaScriptObject createURLRequest()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLRequest();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param url the url
     * @return the URL request
     */
    public final native JavaScriptObject createURLRequest(String url)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLRequest(url);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the URL request header
     */
    public final native JavaScriptObject createURLRequestHeader()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLRequestHeader();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @return the URL request header
     */
    public final native JavaScriptObject createURLRequestHeader(String name)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLRequestHeader(name);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param name the name
     * @param value the value
     * @return the URL request header
     */
    public final native JavaScriptObject createURLRequestHeader(String name, String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLRequestHeader(name, value);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the URL variables
     */
    public final native JavaScriptObject createURLVariables()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLVariables();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param source the source
     * @return the URL variables
     */
    public final native JavaScriptObject createURLVariables(String source)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createURLVariables(source);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the XML socket
     */
    public final native JavaScriptObject createXMLSocket()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createXMLSocket();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param host the host
     * @return the XML socket
     */
    public final native JavaScriptObject createXMLSocket(String host)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createXMLSocket(host);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param host the host
     * @param port the port
     * @return the XML socket
     */
    public final native JavaScriptObject createXMLSocket(String host, int port)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createXMLSocket(host, port);
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the DRM content data
     */
    public final native JavaScriptObject createDRMContentData()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createDRMContentData();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param rawData the raw data
     * @return the DRM content data
     */
    public final native JavaScriptObject createDRMContentData(ByteArray rawData)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createDRMContentData(rawData.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Gets the dRM manager.
     * 
     * @return the dRM manager
     */
    public final native JavaScriptObject getDRMManager()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getDRMManager();
    }-*/;

    /**
     * Checks if is dRM manager supported.
     * 
     * @return true, if is dRM manager supported
     */
    public final native boolean isDRMManagerSupported()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isDRMManagerSupported();
    }-*/;

    /**
     * Checks if is prints the job supported.
     * 
     * @return true, if is prints the job supported
     */
    public final native boolean isPrintJobSupported()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isPrintJobSupported();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @return the prints the job options
     */
    public final native JavaScriptObject createPrintJobOptions()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPrintJobOptions();
    }-*/;

    /**
     * Creates a new Net object.
     * 
     * @param printAsBitmap the print as bitmap
     * @return the prints the job options
     */
    public final native JavaScriptObject createPrintJobOptions(boolean printAsBitmap)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPrintJobOptions(printAsBitmap);
    }-*/;

    /**
     * Gets the default object encoding.
     * 
     * @return the default object encoding
     */
    public final native int getByteArrayDefaultObjectEncoding()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getByteArrayDefaultObjectEncoding();
    }-*/;

    /**
     * Gets the default object encoding.
     * 
     * @return the default object encoding
     */
    public final native void setByteArrayDefaultObjectEncoding(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setByteArrayDefaultObjectEncoding(value);
    }-*/;

}
