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
import com.ait.toolkit.flash.core.client.net.ObjectEncoding;

public class IoClass extends EventDispatcher implements IDataInput, IDataOutput {

    /**
     * Gets the bytes available.
     * 
     * @return the bytes available
     */
    public native double getBytesAvailable()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getbytesAvailable();
    }-*/;

    /**
     * Gets the endian.
     * 
     * @return the endian
     */
    public Endian getEndian() {
        return Endian.fromValue(_getEndian());
    }

    /**
     * _get endian.
     * 
     * @return the string
     */
    private native String _getEndian() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getendian();
    }-*/;

    /**
     * Sets the endian.
     * 
     * @param endian
     *            the new endian
     */
    public void setEndian(Endian endian) {
        _setEndian(endian.value);
    }

    /**
     * _set endian.
     * 
     * @param endian
     *            the endian
     */
    private native void _setEndian(String endian) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setendian(endian);
    }-*/;

    /**
     * Gets the object encoding.
     * 
     * @return the object encoding
     */
    public ObjectEncoding getObjectEncoding() {
        return ObjectEncoding.fromValue(_getObjectEncoding());
    }

    /**
     * _get object encoding.
     * 
     * @return the int
     */
    private native int _getObjectEncoding() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getobjectEncoding();
    }-*/;

    /**
     * Sets the object encoding.
     * 
     * @param objectEncoding
     *            the new object encoding
     */
    public void setObjectEncoding(ObjectEncoding objectEncoding) {
        _setObjectEncoding(objectEncoding.value);
    }

    /**
     * _set object encoding.
     * 
     * @param objectEncoding
     *            the object encoding
     */
    private native void _setObjectEncoding(int objectEncoding) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setobjectEncoding(objectEncoding);
    }-*/;

    /**
     * Read boolean.
     * 
     * @return true, if successful
     */
    public native boolean readBoolean() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readBoolean();
    }-*/;

    /**
     * Read byte.
     * 
     * @return the byte
     */
    public native byte readByte() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readByte();
    }-*/;

    /**
     * Read bytes.
     * 
     * @param bytes
     *            the bytes
     */
    public native void readBytes(ByteArray bytes) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.readBytes(bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Read bytes.
     * 
     * @param bytes
     *            the bytes
     * @param offset
     *            the offset
     */
    public native void readBytes(ByteArray bytes, double offset) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.readBytes(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset);
    }-*/;

    /**
     * Read bytes.
     * 
     * @param bytes
     *            the bytes
     * @param offset
     *            the offset
     * @param length
     *            the length
     */
    public native void readBytes(ByteArray bytes, double offset, double length) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.readBytes(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset, length);
    }-*/;

    /**
     * Read double.
     * 
     * @return the double
     */
    public native double readDouble() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readDouble();
    }-*/;

    /**
     * Read float.
     * 
     * @return the float
     */
    public native float readFloat() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readFloat();
    }-*/;

    /**
     * Read int.
     * 
     * @return the int
     */
    public native int readInt() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readInt();
    }-*/;

    /**
     * Read multi byte.
     * 
     * @param length
     *            the length
     * @param charset
     *            the charset
     * @return the string
     */
    public native String readMultiByte(double length, String charset) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readMultiByte(length, charset);
    }-*/;

    /**
     * Read object.
     * 
     * @param <T>
     *            the generic type
     * @return the t
     */
    public native Object readObject() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readObject();
    }-*/;

    /**
     * Read short.
     * 
     * @return the int
     */
    public native int readShort() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readShort();
    }-*/;

    /**
     * Read unsigned byte.
     * 
     * @return the short
     */
    public native short readUnsignedByte() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readUnsignedByte();
    }-*/;

    /**
     * Read unsigned int.
     * 
     * @return the int
     */
    public native int readUnsignedInt() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readUnsignedInt();
    }-*/;

    /**
     * Read unsigned short.
     * 
     * @return the int
     */
    public native int readUnsignedShort() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readUnsignedShort();
    }-*/;

    /**
     * Read utf.
     * 
     * @return the string
     */
    public native String readUTF() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readUTF();
    }-*/;

    /**
     * Read utf bytes.
     * 
     * @param length
     *            the length
     * @return the string
     */
    public native String readUTFBytes(double length) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.readUTFBytes(length);
    }-*/;

    /**
     * Write boolean.
     * 
     * @param value
     *            the value
     */
    public native void writeBoolean(boolean value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeBoolean(value);
    }-*/;

    /**
     * Write byte.
     * 
     * @param value
     *            the value
     */
    public native void writeByte(byte value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeByte(value);
    }-*/;

    /**
     * Write bytes.
     * 
     * @param bytes
     *            the bytes
     */
    public native void writeBytes(ByteArray bytes) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.writeBytes(bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Write bytes.
     * 
     * @param bytes
     *            the bytes
     * @param offset
     *            the offset
     */
    public native void writeBytes(ByteArray bytes, int offset) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.writeBytes(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset);
    }-*/;

    /**
     * Write bytes.
     * 
     * @param bytes
     *            the bytes
     * @param offset
     *            the offset
     * @param length
     *            the length
     */
    public native void writeBytes(ByteArray bytes, int offset, int length) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.writeBytes(
						bytes.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset, length);
    }-*/;

    /**
     * Write double.
     * 
     * @param value
     *            the value
     */
    public native void writeDouble(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeDouble(value);
    }-*/;

    /**
     * Write float.
     * 
     * @param value
     *            the value
     */
    public native void writeFloat(float value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeFloat(value);
    }-*/;

    /**
     * Write int.
     * 
     * @param value
     *            the value
     */
    public native void writeInt(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeInt(value);
    }-*/;

    /**
     * Write multi byte.
     * 
     * @param value
     *            the value
     * @param charset
     *            the charset
     */
    public native void writeMultiByte(String value, String charset) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeMultiByte(value, charset);
    }-*/;

    /**
     * Write object.
     * 
     * @param value
     *            the value
     */
    public native void writeObject(Object value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeObject(value);
    }-*/;

    /**
     * Write short.
     * 
     * @param value
     *            the value
     */
    public native void writeShort(short value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeShort(value);
    }-*/;

    /**
     * Write unsigned byte.
     * 
     * @param value
     *            the value
     */
    public native void writeUnsignedByte(short value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeUnsignedByte(value);
    }-*/;

    /**
     * Write unsigned int.
     * 
     * @param value
     *            the value
     */
    public native void writeUnsignedInt(double value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeUnsignedInt(value);
    }-*/;

    /**
     * Write unsigned short.
     * 
     * @param value
     *            the value
     */
    public native void writeUnsignedShort(int value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeUnsignedShort(value);
    }-*/;

    /**
     * Write utf.
     * 
     * @param value
     *            the value
     */
    public native void writeUTF(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeUTF(value);
    }-*/;

    /**
     * Write utf bytes.
     * 
     * @param value
     *            the value
     */
    public native void writeUTFBytes(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.writeUTFBytes(value);
    }-*/;
}
