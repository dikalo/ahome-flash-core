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
import com.ait.toolkit.flash.core.client.utils.factories.FileFilterFactory;

/**
 * The FileFilter class is used to indicate what files on the user's system are
 * shown in the file-browsing dialog box that is displayed when the
 * FileReference.browse() method, the FileReferenceList.browse() method is
 * called or a browse method of a File, FileReference, or FileReferenceList
 * object is called. FileFilter instances are passed as a value for the optional
 * typeFilter parameter to the method. If you use a FileFilter instance,
 * extensions and file types that aren't specified in the FileFilter instance
 * are filtered out; that is, they are not available to the user for selection.
 * If no FileFilter object is passed to the method, all files are shown in the
 * dialog box.
 */
public final class FileFilter extends JsObject {

    /**
     * New instance.
     * 
     * @param description
     *            the description
     * @param extension
     *            the extension
     * @return the file filter
     */
    public FileFilter(String description, String extension) {
        jsObj = FileFilterFactory.get().createFileFilter(description, extension);
    }

    /**
     * New instance.
     * 
     * @param description
     *            the description
     * @param extension
     *            the extension
     * @param macType
     *            the mac type
     * @return the file filter
     */
    public FileFilter(String description, String extension, String macType) {
        jsObj = FileFilterFactory.get().createFileFilter(description, extension, macType);
    }

    /**
     * The description string for the filter.
     * 
     * @return the description
     */
    public final native String getDescription()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdescription();
    }-*/;

    /**
     * The description string for the filter.
     * 
     * @param description
     *            the new description
     */
    public final native void setDescription(String description)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setdescription(description);
    }-*/;

    /**
     * A list of file extensions.
     * 
     * @return the extension
     */
    public final native String getExtension()/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getextension();
    }-*/;

    /**
     * A list of file extensions.
     * 
     * @param extension
     *            the new extension
     */
    public final native void setExtension(String extension)/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setextension(extension);
    }-*/;

    /**
     * A list of Macintosh file types.
     * 
     * @return the mac type
     */
    public final native String getMacType()/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getmacType();
    }-*/;

    /**
     * A list of Macintosh file types.
     * 
     * @param macType
     *            the new mac type
     */
    public final native void setMacType(String macType)/*-{
		var peer = peer.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setmacType(macType);
    }-*/;

}
