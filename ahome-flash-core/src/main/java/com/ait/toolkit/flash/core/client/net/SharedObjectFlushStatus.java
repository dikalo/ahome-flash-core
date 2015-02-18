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
/*
 * Copyright 2010 Alain Ekambi
 */
package com.ait.toolkit.flash.core.client.net;

/**
 * The Enum SharedObjectFlushStatus.
 */
public enum SharedObjectFlushStatus {

    /** The FLUSHED. */
    FLUSHED("flushed"),
    /** The PENDING. */
    PENDING("pending");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new shared object flush status.
     * 
     * @param status the status
     */
    private SharedObjectFlushStatus(String status) {
        value = status;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the shared object flush status
     */
    public static native SharedObjectFlushStatus fromValue(String value) /*-{
		switch (value) {
		case 'flushed':
			return @com.ait.toolkit.flash.core.client.net.SharedObjectFlushStatus::FLUSHED;
		case 'pending':
			return @com.ait.toolkit.flash.core.client.net.SharedObjectFlushStatus::PENDING;
		}
    }-*/;

}
