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

package com.ait.toolkit.flash.core.client.media;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ID3Info class contains properties that reflect ID3 metadata. You can get
 * additional metadata for MP3 files by accessing the id3 property of the Sound
 * class; for example, mySound.id3.TIME. For more information, see the entry for
 * Sound.id3 and the ID3 tag definitions at http://www.id3.org.
 */
public final class ID3Info extends JsObject {

    protected ID3Info(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The name of the album; corresponds to the ID3 2.0 tag TALB.
     * 
     * @return the album
     */
    public final native String getAlbum() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getalbum();
    }-*/;

    /**
     * The name of the album; corresponds to the ID3 2.0 tag TALB.
     * 
     * @param album the new album
     */
    public final native void setAlbum(String album) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setalbum(album);
    }-*/;

    /**
     * The name of the artist; corresponds to the ID3 2.0 tag TPE1.
     * 
     * @return the artist
     */
    public final native String getArtist() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getartist();
    }-*/;

    /**
     * The name of the artist; corresponds to the ID3 2.0 tag TPE1.
     * 
     * @param artist the new artist
     */
    public final native void setArtist(String artist) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setartist(artist);
    }-*/;

    /**
     * A comment about the recording; corresponds to the ID3 2.0 tag COMM.
     * 
     * @return the comment
     */
    public final native String getComment() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getcomment();
    }-*/;

    /**
     * A comment about the recording; corresponds to the ID3 2.0 tag COMM.
     * 
     * @param comment the new comment
     */
    public final native void setComment(String comment) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setcomment(comment);
    }-*/;

    /**
     * Gets the genre of the song; corresponds to the ID3 2.0 tag TCON.
     * 
     * @return the genre
     */
    public final native String getGenre() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getgenre();
    }-*/;

    /**
     * Sets the genre of the song; corresponds to the ID3 2.0 tag TCON.
     * 
     * @param genre the new genre
     */
    public final native void setGenre(String genre) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setgenre(genre);
    }-*/;

    /**
     * Gets the name of the song; corresponds to the ID3 2.0 tag TIT2.
     * 
     * @return the song name
     */
    public final native String getSongName() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getsongName();
    }-*/;

    /**
     * Sets the name of the song; corresponds to the ID3 2.0 tag TIT2.
     * 
     * @param songName the new song name
     */
    public final native void setSongName(String songName) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setsongName(songName);
    }-*/;

    /**
     * Gets the track number; corresponds to the ID3 2.0 tag TRCK.
     * 
     * @return the track
     */
    public final native String getTrack() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.gettrack();
    }-*/;

    /**
     * Sets the track number; corresponds to the ID3 2.0 tag TRCK.
     * 
     * @param track the new track
     */
    public final native void setTrack(String track) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.settrack(track);
    }-*/;

    /**
     * Gets the year of the recording; corresponds to the ID3 2.0 tag TYER.
     * 
     * @return the year
     */
    public final native String getYear() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getyear();
    }-*/;

    /**
     * SetstThe year of the recording; corresponds to the ID3 2.0 tag TYER.
     * 
     * @param year the new year
     */
    public final native void setYear(String year) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setyear(year);
    }-*/;

}
