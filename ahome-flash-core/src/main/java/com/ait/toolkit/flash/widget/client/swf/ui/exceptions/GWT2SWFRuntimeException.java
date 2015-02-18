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

package com.ait.toolkit.flash.widget.client.swf.ui.exceptions;

/**
 * The Class GWT2SWFRuntimeException.
 */
public class GWT2SWFRuntimeException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3894636978597293493L;

	/**
	 * Instantiates a new gW t2 swf runtime exception.
	 */
	public GWT2SWFRuntimeException() {
	}

	/**
	 * Instantiates a new gW t2 swf runtime exception.
	 * 
	 * @param message
	 *            the message
	 */
	public GWT2SWFRuntimeException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new gW t2 swf runtime exception.
	 * 
	 * @param couse
	 *            the couse
	 */
	public GWT2SWFRuntimeException(Throwable couse) {
		super(couse);
	}

	/**
	 * Instantiates a new gW t2 swf runtime exception.
	 * 
	 * @param message
	 *            the message
	 * @param couse
	 *            the couse
	 */
	public GWT2SWFRuntimeException(String message, Throwable couse) {
		super(message, couse);
	}

}
