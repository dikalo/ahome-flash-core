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

package com.ait.toolkit.flash.widget.client.swf.ui;

import java.util.HashMap;
import java.util.Map;

import com.ait.toolkit.flash.widget.client.swf.utils.PlayerVersion;

// http://www.adobe.com/cfusion/knowledgebase/index.cfm?id=tn_12701
/**
 * The Class SWFParams.
 */
public class SWFParams {
    // swf, id, w, h, ver, c, useExpressInstall, quality, xiRedirectUrl,
    // redirectUrl, detectKey
    /** The Constant DEFAULT_BGCOLOR. */
    public static final String DEFAULT_BGCOLOR = "ffffff";

    /** The Constant DEFAULT_INNER_DIV_TEXT_FOR_FLASH_PLAYER_NOT_FOUND. */
    public static final String DEFAULT_INNER_DIV_TEXT_FOR_FLASH_PLAYER_NOT_FOUND = "Here should be a swf movieclip. "
                    + "You probably don't have FlashPlayer installed or have a version lower than $flashPlayer.version.";

    /** The inner text div for flash player not found. */
    private String innerTextDivForFlashPlayerNotFound = DEFAULT_INNER_DIV_TEXT_FOR_FLASH_PLAYER_NOT_FOUND;

    /** The src. */
    String src;

    /** The width. */
    String width;

    /** The height. */
    String height;

    /** The version. */
    PlayerVersion version = new PlayerVersion(7, 0, 14); // = "7.0.14";

    /** The bgcolor. */
    String bgcolor = DEFAULT_BGCOLOR;

    /** The vars. */
    @SuppressWarnings("rawtypes")
    Map vars = new HashMap();

    /** The params. */
    @SuppressWarnings("rawtypes")
    Map params = new HashMap();

    /** The quality. */
    String quality;

    /** The detect key. */
    String xiRedirectUrl, redirectUrl, detectKey;

    /**
     * Instantiates a new sWF params.
     */
    public SWFParams() {
    }

    /**
     * Instantiates a new sWF params.
     * 
     * @param src the src
     * @param width the width
     * @param height the height
     */
    public SWFParams(String src, int width, int height) {
        this(src, width, height, DEFAULT_BGCOLOR);
    }

    /**
     * Instantiates a new sWF params.
     * 
     * @param src the src
     * @param width the width
     * @param height the height
     */
    public SWFParams(String src, Integer width, Integer height) {
        this(src, width.intValue(), height.intValue(), DEFAULT_BGCOLOR);
    }

    /**
     * Instantiates a new sWF params.
     * 
     * @param src the src
     * @param width the width
     * @param height the height
     */
    public SWFParams(String src, String width, String height) {
        this(src, width, height, DEFAULT_BGCOLOR);
    }

    /**
     * Instantiates a new sWF params.
     * 
     * @param src the src
     * @param width the width
     * @param height the height
     * @param bgcolor the bgcolor
     */
    public SWFParams(String src, int width, int height, String bgcolor) {
        super();
        setSrc(src);
        setPixelSize(width, height);
        setBgcolor(bgcolor);
    }

    /**
     * Instantiates a new sWF params.
     * 
     * @param src the src
     * @param width the width
     * @param height the height
     * @param bgcolor the bgcolor
     */
    public SWFParams(String src, Integer width, Integer height, String bgcolor) {
        this(src, width.intValue(), height.intValue(), bgcolor);
    }

    /**
     * Instantiates a new sWF params.
     * 
     * @param src the src
     * @param width the width
     * @param height the height
     * @param bgcolor the bgcolor
     */
    public SWFParams(String src, String width, String height, String bgcolor) {
        super();
        setSrc(src);
        setWidth(width);
        setHeight(height);
        setBgcolor(bgcolor);
    }

    /**
     * Gets the bgcolor.
     * 
     * @return the bgcolor
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the bgcolor.
     * 
     * @param bgcolor the new bgcolor
     */
    public void setBgcolor(String bgcolor) {
        if (bgcolor == null)
            throw new NullPointerException();
        this.bgcolor = bgcolor;
    }

    /**
     * Gets the detect key.
     * 
     * @return the detect key
     */
    public String getDetectKey() {
        return detectKey;
    }

    /**
     * Sets the detect key.
     * 
     * @param detectKey the new detect key
     */
    public void setDetectKey(String detectKey) {
        this.detectKey = detectKey;
    }

    /**
     * Gets the height.
     * 
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Gets the params.
     * 
     * @return the params
     */
    @SuppressWarnings("rawtypes")
    public Map getParams() {
        return params;
    }

    /**
     * Sets the params.
     * 
     * @param params the new params
     */
    @SuppressWarnings("rawtypes")
    public void setParams(Map params) {
        this.params = params;
    }

    /**
     * Gets the quality.
     * 
     * @return the quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Sets the quality.
     * 
     * @param quality the new quality
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * Gets the redirect url.
     * 
     * @return the redirect url
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the redirect url.
     * 
     * @param redirectUrl the new redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * Gets the src.
     * 
     * @return the src
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the src.
     * 
     * @param src the new src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * Gets the vars.
     * 
     * @return the vars
     */
    @SuppressWarnings("rawtypes")
    public Map getVars() {
        return (vars == null) ? vars = new HashMap() : vars;
    }

    /**
     * Sets the vars.
     * 
     * @param vars the new vars
     */
    public void setVars(@SuppressWarnings("rawtypes") Map vars) {
        this.vars = vars;
    }

    /**
     * Adds the var.
     * 
     * @param key the key
     * @param value the value
     */
    @SuppressWarnings("unchecked")
    public void addVar(String key, String value) {
        getVars().put(key, value);
    }

    /**
     * Gets the version.
     * 
     * @return the version
     */
    public PlayerVersion getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * 
     * @param version the new version
     */
    public void setVersion(PlayerVersion version) {
        this.version = version;
    }

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * Gets the xi redirect url.
     * 
     * @return the xi redirect url
     */
    public String getXiRedirectUrl() {
        return xiRedirectUrl;
    }

    /**
     * Sets the xi redirect url.
     * 
     * @param xiRedirectUrl the new xi redirect url
     */
    public void setXiRedirectUrl(String xiRedirectUrl) {
        this.xiRedirectUrl = xiRedirectUrl;
    }

    /**
     * Sets the height.
     * 
     * @param height the new height
     */
    public void setHeight(String height) {
        if (!(parseLength(height.trim().toLowerCase()) >= 0))
            throw new RuntimeException("CSS heights should not be negative");
        this.height = height;
    }

    /**
     * Sets the pixel size.
     * 
     * @param width the width
     * @param height the height
     */
    public void setPixelSize(int width, int height) {
        if (width >= 0) {
            setWidth(width + "px");
        }
        if (height >= 0) {
            setHeight(height + "px");
        }
    }

    /**
     * Sets the size.
     * 
     * @param width the width
     * @param height the height
     */
    public void setSize(String width, String height) {
        setWidth(width);
        setHeight(height);
    }

    /**
     * Sets the width.
     * 
     * @param width the new width
     */
    public void setWidth(String width) {
        if (!(parseLength(width.trim().toLowerCase()) >= 0))
            throw new RuntimeException("CSS widths should not be negative");
        this.width = width;
    }

    /**
     * Gets the inner text div for flash player not found.
     * 
     * @return the inner text div for flash player not found
     */
    public String getInnerTextDivForFlashPlayerNotFound() {
        return innerTextDivForFlashPlayerNotFound;
    }

    /**
     * Sets the inner text div for flash player not found.
     * 
     * @param innerTextDivForFlashPlayerNotFound the new inner text div for
     *            flash player not found
     */
    public void setInnerTextDivForFlashPlayerNotFound(String innerTextDivForFlashPlayerNotFound) {
        this.innerTextDivForFlashPlayerNotFound = innerTextDivForFlashPlayerNotFound;
    }

    /**
     * Parses the length.
     * 
     * @param s the s
     * @return the double
     */
    private native double parseLength(String s) /*-{
		return parseFloat(s);
    }-*/;
}
