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
 * The IDataInput interface provides a set of methods for reading binary data.
 * This interface is the I/O counterpart to the IDataOutput interface, which
 * writes binary data.
 * <p>
 * All IDataInput and IDataOutput operations are "bigEndian" by default (the
 * most significant byte in the sequence is stored at the lowest or first
 * storage address), and are nonblocking. If insufficient data is available, an
 * EOFError exception is thrown. Use the IDataInput.bytesAvailable property to
 * determine how much data is available to read.
 */
public interface IDataInput {

    /**
     * Gets the bytes available.
     * 
     * @return the bytes available
     */
    public double getBytesAvailable();

    /**
     * Gets the endian.
     * 
     * @return the endian
     */
    public Endian getEndian();

    /**
     * Sets the endian.
     * 
     * @param endian the new endian
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
     * @param objectEncoding the new object encoding
     */
    public void setObjectEncoding(ObjectEncoding objectEncoding);

    /**
     * Read boolean.
     * 
     * @return true, if successful
     */
    public boolean readBoolean();

    /**
     * Read byte.
     * 
     * @return the byte
     */
    public byte readByte();

    /**
     * Read bytes.
     * 
     * @param bytes the bytes
     */
    public void readBytes(ByteArray bytes);

    /**
     * Read bytes.
     * 
     * @param bytes the bytes
     * @param offset the offset
     */
    public void readBytes(ByteArray bytes, double offset);

    /**
     * Read bytes.
     * 
     * @param bytes the bytes
     * @param offset the offset
     * @param length the length
     */
    public void readBytes(ByteArray bytes, double offset, double length);

    /**
     * Read double.
     * 
     * @return the double
     */
    public double readDouble();

    /**
     * Read float.
     * 
     * @return the float
     */
    public float readFloat();

    /**
     * Read int.
     * 
     * @return the int
     */
    public int readInt();

    /**
     * Read multi byte.
     * 
     * @param length the length
     * @param charset the charset
     * @return the string
     */
    public String readMultiByte(double length, String charset);

    /**
     * Read object.
     * 
     * @param <T> the generic type
     * @return the t
     */
    public Object readObject();

    /**
     * Read short.
     * 
     * @return the int
     */
    public int readShort();

    /**
     * Read unsigned byte.
     * 
     * @return the short
     */
    public short readUnsignedByte();

    /**
     * Read unsigned int.
     * 
     * @return the int
     */
    public int readUnsignedInt();

    /**
     * Read unsigned short.
     * 
     * @return the int
     */
    public int readUnsignedShort();

    /**
     * Read utf.
     * 
     * @return the string
     */
    public String readUTF();

    /**
     * Read utf bytes.
     * 
     * @param length the length
     * @return the string
     */
    public String readUTFBytes(double length);
}
