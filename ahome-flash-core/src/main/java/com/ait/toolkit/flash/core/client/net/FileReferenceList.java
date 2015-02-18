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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The FileReferenceList class provides a means to let users select one or more
 * files for uploading. A FileReferenceList object represents a group of one or
 * more local files on the user's disk as an array of FileReference objects. For
 * detailed information and important considerations about FileReference objects
 * and the FileReference class, which you use with FileReferenceList, see the
 * FileReference class.
 * <p>
 * The FileReferenceList class includes a <code>browse()</code> method and a
 * fileList property for working with multiple files. While a call to
 * <code>FileReferenceList.browse()</code> is executing, SWF file playback
 * pauses in stand-alone and external versions of FlashDetect Player and in AIR for
 * Linux and Mac OS X 10.1 and earlier.
 */
public class FileReferenceList extends EventDispatcher {

    /**
     * Instantiates a new file reference list.
     */
    public FileReferenceList() {
        jsObj = Bridge.createObject("flash.net.FileReferenceList");
    }

    FileReferenceList(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the file list. An array of FileReference objects.
     * 
     * @return the file list
     */

    public List<FileReference> getFileList() {
        List<FileReference> list = new ArrayList<FileReference>();
        JsArray<JavaScriptObject> nativePeers = _getFileList();
        for (int i = 0; i < nativePeers.length(); i++) {
            list.add(new FileReference(nativePeers.get(i)));
        }
        return list;
    }

    private native JsArray<JavaScriptObject> _getFileList() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getfileList();
    }-*/;

    /**
     * Displays a file-browsing dialog box that lets the user select a file to
     * upload.
     * 
     * @return true, if successful
     */
    public native boolean browse() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.browse();
    }-*/;

    /**
     * Displays a file-browsing dialog box that lets the user select a file to
     * upload.
     * 
     * @return true, if successful
     */
    public boolean browse(List<FileFilter> filters) {
        JsArray<JavaScriptObject> nativePeers = JsArray.createArray().cast();
        for (FileFilter filter : filters) {
            nativePeers.push(filter.getJsObj());
        }
        return _browse(nativePeers);
    }

    /**
     * Displays a file-browsing dialog box that lets the user select a file to
     * upload.
     * 
     * @return true, if successful
     */
    public boolean browse(FileFilter... filters) {
        JsArray<JavaScriptObject> nativePeers = JsArray.createArray().cast();
        for (FileFilter filter : filters) {
            nativePeers.push(filter.getJsObj());
        }
        return _browse(nativePeers);
    }

    private native boolean _browse(JavaScriptObject filters) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.browse(filters);
    }-*/;

}
