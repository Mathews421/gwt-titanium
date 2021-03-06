/*
 * Copyright 2011 Uri Shaked
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/* Automatically generated code, don't edit ! */

package org.urish.gwtit.titanium;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Arguments to be passed to createStream
 * 
 * @since 1.7
 */
public class CreateStreamArgs extends JavaScriptObject {
	protected CreateStreamArgs() {
	}

	/**
	 * Creates a new, empty instance of CreateStreamArgs
	 */
	public static final native CreateStreamArgs createCreateStreamArgs()
	/*-{
		return {};
	}-*/;

	public final native void setSource(org.urish.gwtit.titanium.Blob value)
	/*-{
		this.source = value;
	}-*/;

	public final native void setSource(org.urish.gwtit.titanium.Buffer value)
	/*-{
		this.source = value;
	}-*/;

	/**
	 * @return Object to create stream around
	 */
	public final native JavaScriptObject getSource()
	/*-{
		return this.source;
	}-*/;

	/**
	 * @return Mode for the stream to be opened in. Can be
	 *         `Titanium.Stream.MODE_READ`, `Titanium.Stream.MODE_WRITE` or
	 *         `Titanium.Stream.MODE_APPEND`
	 */
	public final native float getMode()
	/*-{
		return this.mode;
	}-*/;

	public final native void setMode(float value)
	/*-{
		this.mode = value;
	}-*/;

}
