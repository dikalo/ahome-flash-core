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

import com.ait.toolkit.flash.widget.client.SwfLoadHandler;

/**
 * 
 * @author Christian Voigt
 * 
 */
public class SWFABridgeWidget extends SWFWidget {

	private SwfLoadHandler handler;
	private String bm;

	public SWFABridgeWidget(String src) {
		super(src);
	}

	public SWFABridgeWidget(String string, int w, int h) {
		super(string, w, h);
	}

	public SWFABridgeWidget(String string, String w, String h) {
		super(string, w, h);
	}

	@Override
	protected void onAfterSWFInjection() {
		this.registerInitializationListener();
	}

	public void setHandler(SwfLoadHandler handler) {
		this.handler = handler;
	}

	public void setHandler(SwfLoadHandler handler, String bridgeName) {
		this.handler = handler;
		this.bm = bridgeName;
	}

	protected native void registerInitializationListener()/*-{
		if (this.@com.ait.toolkit.flash.widget.client.swf.ui.SWFABridgeWidget::handler != null) {
			//$wnd.console.log('inside handler');
			var listener = this.@com.ait.toolkit.flash.widget.client.swf.ui.SWFABridgeWidget::handler;
			var bn = this.@com.ait.toolkit.flash.widget.client.swf.ui.SWFABridgeWidget::bm;
			if (!bn) {
				bn = @com.ait.toolkit.flash.core.client.framework.Bridge::bridgeName;
			}
			$wnd.FABridge
					.addInitializationCallback(
							bn,
							function(event) {
								//				$wnd.console.log('inside cb : ' + bn);
								listener.@com.ait.toolkit.flash.widget.client.SwfLoadHandler::onSwfLoad()(event);
							});
		}
	}-*/;

}
