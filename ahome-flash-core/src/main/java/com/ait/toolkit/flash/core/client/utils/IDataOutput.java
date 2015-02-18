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

import com.ait.toolkit.flash.core.client.net.ObjectEncoding;

/**
 * The IDataOutput interface provides a set of methods for writing binary data.
 * This interface is the I/O counterpart to the IDataInput interface, which
 * reads binary data.
 * <p>
 * The IDataOutput interface is implemented by the FileStream, Socket and
 * ByteArray classes. All IDataInput and IDataOutput operations are "bigEndian"
 * by default (the most significant byte in the sequence is stored at the lowest
 * or first storage address), and are nonblocking.
 */
public interface IDataOutput {

    /**
     * Gets the endian.
     * 
     * @return the endian
     */
    public Endian getEndian();

    /**
     * Sets the endian.
     * 
     * @param endian
     *            the new endian
     */
    public void setEndian(Endian endian);

    /**
     * Gets the object encoding.
     * 
     * @return the object encoding
     */
    public ObjectEncoding getObjectEncoding();

    /**
     * Sets the object encoding.
     * 
     * @param objectEncoding
     *            the new object encoding
     */
    public void setObjectEncoding(ObjectEncoding objectEncoding);

    /**
     * Write boolean.
     * 
     * @param value
     *            the value
     */
    public void writeBoolean(boolean value);

    /**
     * Write byte.
     * 
     * @param value
     *            the value
     */
    public void writeByte(byte value);

    /**
     * Write bytes.
     * 
     * @param bytes
     *            the bytes
     */
    public void writeBytes(ByteArray bytes);

    /**
     * Write bytes.
     * 
     * @param bytes
     *            the bytes
     * @param offset
     *            the offset
     */
    public void writeBytes(ByteArray bytes, int offset);

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
    public void writeBytes(ByteArray bytes, int offset, int length);

    /**
     * Write double.
     * 
     * @param value
     *            the value
     */
    public void writeDouble(double value);

    /**
     * Write float.
     * 
     * @param value
     *            the value
     */
    public void writeFloat(float value);

    /**
     * Write int.
     * 
     * @param value
     *            the value
     */
    public void writeInt(int value);

    /**
     * Write multi byte.
     * 
     * @param value
     *            the value
     * @param charset
     *            the charset
     */
    public void writeMultiByte(String value, String charset);

    /**
     * Write object.
     * 
     * @param value
     *            the value
     */
    public void writeObject(Object value);

    /**
     * Write short.
     * 
     * @param value
     *            the value
     */
    public void writeShort(short value);

    /**
     * Write unsigned byte.
     * 
     * @param value
     *            the value
     */
    public void writeUnsignedByte(short value);

    /**
     * Write unsigned int.
     * 
     * @param value
     *            the value
     */
    public void writeUnsignedInt(double value);

    /**
     * Write unsigned short.
     * 
     * @param value
     *            the value
     */
    public void writeUnsignedShort(int value);

    /**
     * Write utf.
     * 
     * @param value
     *            the value
     */
    public void writeUTF(String value);

    /**
     * Write utf bytes.
     * 
     * @param value
     *            the value
     */
    public void writeUTFBytes(String value);
}
