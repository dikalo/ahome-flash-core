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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Class ResponderResult.
 */
public abstract class ResponderResult {

    /** The jso peer. */
    public final JavaScriptObject jsoPeer = createPeer(this);

    /**
     * Creates the peer.
     * 
     * @param r the r
     * @return the java script object
     */
    private static native JavaScriptObject createPeer(ResponderResult r)/*-{
		return function() {
			listener.@com.ait.toolkit.flash.core.client.net.ResponderResult::onResult()();
		};
    }-*/;

    /**
     * On result.
     */
    public abstract void onResult();
}
