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
package com.ait.toolkit.flash.widget.client.loader;

import com.ait.toolkit.flash.widget.client.SwfLoadHandler;
import com.ait.toolkit.flash.widget.client.swf.ui.SWFABridgeWidget;
import com.google.gwt.user.client.ui.Widget;

/**
 * GWT based SWF widget for ahomé-flash
 */
public class SwfLoaderImpl implements SwfLoader {

	private String path;

	public SwfLoaderImpl(String path) {
		this.path = path;
	}

	@Override
	public Widget load(int width, int height, String bridgeName, boolean transparent, SwfLoadHandler handler) {
		return create(width, height, bridgeName, transparent, handler);
	}

	public Widget load(String width, String height, String bridgeName, boolean transparent, SwfLoadHandler handler) {
		return create(width, height, bridgeName, transparent, handler);
	}

	private Widget create(int width, int height, String bridgeName, boolean transparent, final SwfLoadHandler handler) {
		final SWFABridgeWidget swfWidget = new SWFABridgeWidget(path, width, height);
		applyProperties(swfWidget, bridgeName, transparent, handler);
		swfWidget.setVisible(true);
		return swfWidget;

	}

	private Widget create(String width, String height, String bridgeName, boolean transparent, final SwfLoadHandler handler) {
		final SWFABridgeWidget swfWidget = new SWFABridgeWidget(path, width, height);
		applyProperties(swfWidget, bridgeName, transparent, handler);
		return swfWidget;

	}

	private void applyProperties(SWFABridgeWidget swfWidget, String bridgeName, boolean transparent, final SwfLoadHandler handler) {
		swfWidget.addAttribute("bridgeName", bridgeName);
		// swfWidget.addAttribute("name", "swfID_0");
		if (transparent) {
			swfWidget.addAttribute("wmode", "transparent");
		} else {
			swfWidget.addAttribute("wmode", "opaque");
		}
		swfWidget.addParam("bridgeName", bridgeName);
		swfWidget.addParam("allowScriptAccess", "always");
		swfWidget.addParam("allowsfullscreen", "true");
		swfWidget.addParam("allowsfullscreenInteractive", "true");

		swfWidget.addFlashVar("bridgeName", bridgeName);
		swfWidget.setHandler(handler, bridgeName);
		swfWidget.setVisible(true);

	}

}
