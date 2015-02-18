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

package com.ait.toolkit.flash.widget.client.swf.utils;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class PlayerVersion.
 */
public class PlayerVersion {

    /** The rev. */
    int major, minor, rev;

    /**
     * Deserialize.
     * 
     * @param o the o
     */
    public native void deserialize(JavaScriptObject o) /*-{
		//$wnd.alert(" major: " + o.major + " minor: " + o.minor + " rev: " + o.rev +  "");
		this.@com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion::setMajor(I)(o.major);
		this.@com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion::setMinor(I)(o.minor);
		this.@com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion::setRev(I)(o.release);

    }-*/;

    /**
     * _deserialize.
     * 
     * @param o the o
     */
    public native void _deserialize(JavaScriptObject o) /*-{
		//$wnd.alert(" major: " + o.major + " minor: " + o.minor + " rev: " + o.rev +  "");
		this.@com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion::setMajor(I)(o.major);
		this.@com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion::setMinor(I)(o.minor);
		this.@com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion::setRev(I)(o.rev);

    }-*/;

    /**
     * Instantiates a new player version.
     * 
     * @param version the version
     */
    public PlayerVersion(int[] version) {
        int l = version.length >= 3 ? 3 : version.length;
        switch (l) {
            case 3:
                rev = version[2];
            case 2:
                minor = version[1];
            case 1:
                major = version[0];
        }
    }

    /**
     * Instantiates a new player version.
     * 
     * @param major the major
     * @param minor the minor
     * @param rev the rev
     */
    public PlayerVersion(int major, int minor, int rev) {
        this(major, minor);
        this.rev = rev;
    }

    /**
     * Instantiates a new player version.
     * 
     * @param major the major
     * @param minor the minor
     */
    public PlayerVersion(int major, int minor) {
        this(major);
        this.minor = minor;
    }

    /**
     * Instantiates a new player version.
     * 
     * @param major the major
     */
    public PlayerVersion(int major) {
        this.major = major;
    }

    /**
     * Instantiates a new player version.
     */
    public PlayerVersion() {
    }

    /**
     * Gets the major.
     * 
     * @return the major
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the major.
     * 
     * @param major the new major
     */
    public void setMajor(int major) {
        this.major = major;
    }

    /**
     * Gets the minor.
     * 
     * @return the minor
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the minor.
     * 
     * @param minor the new minor
     */
    public void setMinor(int minor) {
        this.minor = minor;
    }

    /**
     * Gets the rev.
     * 
     * @return the rev
     */
    public int getRev() {
        return rev;
    }

    /**
     * Sets the rev.
     * 
     * @param rev the new rev
     */
    public void setRev(int rev) {
        this.rev = rev;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return getMajor() + "." + getMinor() + "." + getRev();
    }

    /**
     * Version is valid.
     * 
     * @param fv the fv
     * @return true, if successful
     */
    public boolean versionIsValid(PlayerVersion fv) {
        if (this.major < fv.getMajor())
            return false;
        if (this.major > fv.getMajor())
            return true;
        if (this.minor < fv.getMinor())
            return false;
        if (this.minor > fv.getMinor())
            return true;
        if (this.rev < fv.getRev())
            return false;
        return true;
    }

}
