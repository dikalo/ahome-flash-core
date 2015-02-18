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
import com.google.gwt.user.client.ui.Widget;

/**
 * Common interface to load swf files.
 * 
 * 
 */
public interface SwfLoader {
	/**
	 * Load the SwfWidgetLoader Widget and wrap it into a GWT widget
	 * 
	 * @param width
	 *            , the width of the returned widget
	 * @param height
	 *            , the handler of the returned widget
	 * @param handler
	 *            , the handler to call one the swf is successfully loaded
	 * @return
	 */

	public Widget load(int width, int height, String bridgeName, boolean transparent, SwfLoadHandler handler);

	public Widget load(String width, String height, String bridgeName, boolean transparent, SwfLoadHandler handler);
}
