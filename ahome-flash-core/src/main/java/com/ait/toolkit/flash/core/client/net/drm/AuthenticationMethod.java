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
package com.ait.toolkit.flash.core.client.net.drm;

/**
 * The Enum AuthenticationMethod.
 */
public enum AuthenticationMethod {

    /** The ANONYMUS. */
    ANONYMUS("anonymus"),
    /** The USERNAM e_ an d_ password. */
    USERNAME_AND_PASSWORD("usernameAndPassword");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new authentication method.
     * 
     * @param method the method
     */
    private AuthenticationMethod(String method) {
        value = method;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the authentication method
     */
    public static native AuthenticationMethod fromValue(String value) /*-{
		switch (value) {
		case 'anonymus':
			return @com.ait.toolkit.flash.core.client.net.drm.AuthenticationMethod::ANONYMUS;
		case 'usernameAndPassword':
			return @com.ait.toolkit.flash.core.client.net.drm.AuthenticationMethod::USERNAME_AND_PASSWORD;
		}
    }-*/;
}
