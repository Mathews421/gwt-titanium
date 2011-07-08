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
 * Specification for {@link org.urish.gwtit.titanium.codec.encodenumber}
 */
public class EncodeNumberSpec extends JavaScriptObject {
	protected EncodeNumberSpec() {
	}

	/**
	 * @return The source number to encode
	 */
	public native float getSource()
	/*-{
		return this.source;
	}-*/;

	public native void setSource(float value)
	/*-{
		this.source = value;
	}-*/;

	/**
	 * @return The destination buffer
	 */
	public native org.urish.gwtit.titanium.Buffer getDest()
	/*-{
		return this.dest;
	}-*/;

	public native void setDest(org.urish.gwtit.titanium.Buffer value)
	/*-{
		this.dest = value;
	}-*/;

	/**
	 * @return The encoding type to use. must be one of
	 *         {@link org.urish.gwtit.titanium.codec.type_byte},
	 *         {@link org.urish.gwtit.titanium.codec.type_short},
	 *         {@link org.urish.gwtit.titanium.codec.type_int},
	 *         {@link org.urish.gwtit.titanium.codec.type_float},
	 *         {@link org.urish.gwtit.titanium.codec.type_long}, or
	 *         {@link org.urish.gwtit.titanium.codec.type_double}
	 */
	public native String getType()
	/*-{
		return this.type;
	}-*/;

	public native void setType(String value)
	/*-{
		this.type = value;
	}-*/;

	/**
	 * @return The position in dest to set the encoded data
	 */
	public native float getPosition()
	/*-{
		return this.position;
	}-*/;

	public native void setPosition(float value)
	/*-{
		this.position = value;
	}-*/;

	/**
	 * @return The byte order to encode with
	 */
	public native float getByteOrder()
	/*-{
		return this.byteOrder;
	}-*/;

	public native void setByteOrder(float value)
	/*-{
		this.byteOrder = value;
	}-*/;

}
