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
import com.ait.toolkit.flash.widget.client.swf.utils.SWFObjectUtil;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * The Class SWFWidget.
 */
public class SWFWidget extends Widget {

	/** The swf settings. */
	private final SWFSettings swfSettings;

	/** The count. */
	private static int count = 0;

	/** The Constant divPrefix. */
	private final static String divPrefix = "swfDivID_";

	/** The swf div id. */
	private final String swfDivId;

	/** The Constant idPrefix. */
	private final static String idPrefix = "swfID_";

	/** The swf id. */
	private final String swfId;

	/** The src. */
	private final String src;

	// private String width;

	// private String height;

	/** The flash vars. */
	@SuppressWarnings("rawtypes")
	private final Map/* <java.lang.String, java.lang.String> */flashVars = new HashMap/*
																					 * <
																					 * java
																					 * .
																					 * lang
																					 * .
																					 * String
																					 * ,
																					 * java
																					 * .
																					 * lang
																					 * .
																					 * String
																					 * >
																					 */();

	/** The params. */
	@SuppressWarnings("rawtypes")
	private final Map/* <java.lang.String, java.lang.String> */params = new HashMap/*
																				 * <
																				 * java
																				 * .
																				 * lang
																				 * .
																				 * String
																				 * ,
																				 * java
																				 * .
																				 * lang
																				 * .
																				 * String
																				 * >
																				 */();

	/** The attributes. */
	@SuppressWarnings("rawtypes")
	private final Map/* <java.lang.String, java.lang.String> */attributes = new HashMap/*
																					 * <
																					 * java
																					 * .
																					 * lang
																					 * .
																					 * String
																					 * ,
																					 * java
																					 * .
																					 * lang
																					 * .
																					 * String
																					 * >
																					 */();

	/** The is swf injected. */
	private boolean isSWFInjected = false;

	/** The min player version. */
	private PlayerVersion minPlayerVersion = null;

	/**
	 * Inject swf.
	 * 
	 * @param swf
	 *            the swf
	 * @param id
	 *            the id
	 * @param w
	 *            the w
	 * @param h
	 *            the h
	 * @param ver
	 *            the ver
	 * @param flashvars
	 *            the flashvars
	 * @param params
	 *            the params
	 * @param attributes
	 *            the attributes
	 */

	@SuppressWarnings("rawtypes")
	protected native void injectSWF(String swf, String id, String w, String h,
			String ver, Map/*
							 * < String , String >
							 */flashvars, Map/* <String, String> */params,
			Map/* <String, String> */attributes) /*-{

		var _vars = @com.ait.toolkit.flash.widget.client.swf.utils.SWFObjectUtil::convertHashMapToJSArray(Ljava/util/Map;)(flashvars);
		var _params = @com.ait.toolkit.flash.widget.client.swf.utils.SWFObjectUtil::convertHashMapToJSArray(Ljava/util/Map;)(params);
		var _attributes = @com.ait.toolkit.flash.widget.client.swf.utils.SWFObjectUtil::convertHashMapToJSArray(Ljava/util/Map;)(attributes);
		$wnd.swfobject.embedSWF(swf, id, w, h, ver, null, _vars, _params,
				_attributes);

	}-*/;

	/**
	 * Instantiates a new sWF widget.
	 * 
	 * @param src
	 *            the src
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public SWFWidget(String src, int width, int height) {
		this(src, width, height, SWFSettings.getDefaultSWFSettings());
	}

	/**
	 * Instantiates a new sWF widget.
	 * 
	 * @param src
	 *            the src
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public SWFWidget(String src, String width, String height) {
		this(src, width, height, SWFSettings.getDefaultSWFSettings());
	}

	/**
	 * Instantiates a new sWF widget.
	 * 
	 * @param src
	 *            the src
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param settings
	 *            the settings
	 */
	public SWFWidget(String src, int width, int height, SWFSettings settings) {
		this(src, settings);
		setPixelSize(width, height);
	}

	/**
	 * Instantiates a new sWF widget.
	 * 
	 * @param src
	 *            the src
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param settings
	 *            the settings
	 */
	public SWFWidget(String src, String width, String height,
			SWFSettings settings) {
		this(src, settings);
		setSize(width, height);
	}

	/**
	 * Instantiates a new sWF widget.
	 * 
	 * @param src
	 *            the src
	 */
	public SWFWidget(String src) {
		this(src, SWFSettings.getDefaultSWFSettings());
	}

	/**
	 * Instantiates a new sWF widget.
	 * 
	 * @param src
	 *            the src
	 * @param settings
	 *            the settings
	 */
	public SWFWidget(String src, SWFSettings settings) {
		this.src = src;
		swfSettings = settings;
		swfId = idPrefix + count;
		swfDivId = divPrefix + count;
		++count;
		Element element = DOM.createElement("div");
		DOM.setElementProperty(element, "id", swfDivId);
		DOM.setElementAttribute(element, "width", "100%");
		DOM.setElementAttribute(element, "height", "100%");

		// add new div which will be replaced by SWFObject
		setElement(element);

	}

	/**
	 * Inits the empty inner div.
	 */
	private void initEmptyInnerDiv() {
		String notifyText = swfSettings.getInnerDivTextForFlashPlayerNotFound()
				.replaceAll("\\$\\{flashPlayer.version\\}",
						getSwfSettings().getMinPlayerVersion().toString());
		getElement().setInnerHTML(
				"<div id='" + swfId + "' style='width:100%;height:100%;'>"
						+ notifyText + "</div>");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.user.client.ui.Widget#onLoad()
	 */
	protected void onLoad() {
		if (!isSWFInjected) {
			initEmptyInnerDiv();
			onBeforeSWFInjection();
			injectSWF(getSrc(), getSwfId(), getWidth(), getHeight(),
					swfSettings.getMinPlayerVersion().toString(),
					getFlashVars(), getParams(), getAttributes());
			isSWFInjected = true;
			onAfterSWFInjection();
		}
		super.onLoad();
	}

	/**
	 * On after swf injection.
	 */
	protected void onAfterSWFInjection() {

	}

	/**
	 * On before swf injection.
	 */
	protected void onBeforeSWFInjection() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.user.client.ui.Widget#onUnload()
	 */
	protected void onUnload() {
		// GWT.log("onUnload", null);
		getElement().removeChild(DOM.getFirstChild(getElement()));
		isSWFInjected = false;
		super.onUnload();
	}

	/**
	 * Show.
	 */
	public void show() {
		setVisible(true);
	}

	/**
	 * Hide.
	 */
	public void hide() {
		setVisible(false);

	}

	/**
	 * Gets the swf div id.
	 * 
	 * @return the swf div id
	 */
	protected String getSwfDivId() {
		return swfDivId;
	}

	/**
	 * Gets the swf id.
	 * 
	 * @return the swf id
	 */
	protected String getSwfId() {
		return swfId;
	}

	/**
	 * Gets the swf settings.
	 * 
	 * @return the swf settings
	 */
	public SWFSettings getSwfSettings() {
		return swfSettings;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.user.client.ui.UIObject#setHeight(java.lang.String)
	 */
	public void setHeight(String height) {
		height = height.trim().toLowerCase();
		super.setHeight(height); // Width validation
		GWT.log(getHeight() + " =? " + height, null);
		if (getHeight().equals(height)) {
			if (isSWFInjected) {
				Element elem = DOM.getFirstChild(getElement());
				DOM.setElementAttribute(elem, "height", height);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.user.client.ui.UIObject#setPixelSize(int, int)
	 */
	public void setPixelSize(int width, int height) {
		super.setPixelSize(width, height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.user.client.ui.UIObject#setWidth(java.lang.String)
	 */
	public void setWidth(String width) {
		width = width.trim().toLowerCase();
		super.setWidth(width); // Width validation

		if (getWidth().equals(width)) {
			// throw new RuntimeException("CSS widths should not be negative");

			if (isSWFInjected) {
				Element elem = DOM.getFirstChild(getElement());
				DOM.setElementAttribute(elem, "width", width);
			}
		}
	}

	/**
	 * Gets the params.
	 * 
	 * @return the params
	 */
	@SuppressWarnings("rawtypes")
	public Map/* <java.lang.String, java.lang.String> */getParams() {
		return params;
	}

	/**
	 * Adds the param.
	 * 
	 * @param paramName
	 *            the param name
	 * @param paramValue
	 *            the param value
	 */
	@SuppressWarnings("unchecked")
	public void addParam(String paramName, String paramValue) {
		SWFObjectUtil.validSwfObjectParameter(paramName);
		getParams().put(paramName, paramValue);
	}

	/**
	 * Gets the param.
	 * 
	 * @param paramName
	 *            the param name
	 * @return the param
	 */
	public String getParam(String paramName) {
		return (String) getParams().get(paramName);
	}

	/**
	 * Gets the flash vars.
	 * 
	 * @return the flash vars
	 */
	@SuppressWarnings("rawtypes")
	public Map/* <java.lang.String, java.lang.String> */getFlashVars() {
		return flashVars;
	}

	/**
	 * Adds the flash var.
	 * 
	 * @param varName
	 *            the var name
	 * @param varValue
	 *            the var value
	 */
	@SuppressWarnings("unchecked")
	public void addFlashVar(String varName, String varValue) {
		getFlashVars().put(varName, varValue);
	}

	/**
	 * Gets the flash var.
	 * 
	 * @param varName
	 *            the var name
	 * @return the flash var
	 */
	public String getFlashVar(String varName) {
		return (String) getFlashVars().get(varName);
	}

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	@SuppressWarnings("rawtypes")
	public Map/* <java.lang.String, java.lang.String> */getAttributes() {
		return attributes;
	}

	/**
	 * Adds the attribute.
	 * 
	 * @param attributeName
	 *            the attribute name
	 * @param attributeValue
	 *            the attribute value
	 */
	@SuppressWarnings("unchecked")
	public void addAttribute(String attributeName, String attributeValue) {
		SWFObjectUtil.validSwfObjectAttribute(attributeName);
		getAttributes().put(attributeName, attributeValue);
	}

	/**
	 * Gets the attribute.
	 * 
	 * @param attributeName
	 *            the attribute name
	 * @return the attribute
	 */
	public String getAttribute(String attributeName) {
		return (String) attributes.get(attributeName);
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
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public String getWidth() {
		return DOM.getStyleAttribute(getElement(), "width");
	}

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public String getHeight() {
		return DOM.getStyleAttribute(getElement(), "height");
	}

	/**
	 * Gets the min player version.
	 * 
	 * @return the min player version
	 */
	public PlayerVersion getMinPlayerVersion() {
		return minPlayerVersion == null ? getSwfSettings()
				.getMinPlayerVersion() : minPlayerVersion;
	}

	/**
	 * Sets the min player version.
	 * 
	 * @param playerVersion
	 *            the new min player version
	 */
	public void setMinPlayerVersion(PlayerVersion playerVersion) {
		this.minPlayerVersion = playerVersion;
	}

}
