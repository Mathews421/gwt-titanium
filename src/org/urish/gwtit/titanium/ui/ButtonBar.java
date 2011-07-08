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

package org.urish.gwtit.titanium.ui;


/**
 * A button bar is created by the method
 * {@link org.urish.gwtit.titanium.ui.createbuttonbar}.
 * <p>
 * Notes: For iPhone, the style constants are available in the constants defined
 * in <Titanium.UI.iPhone.SystemButtonStyle>.
 * 
 * @since 0.8
 */
public class ButtonBar extends org.urish.gwtit.titanium.ui.View {
	protected ButtonBar() {
	}

	/**
	 * @return The selected index
	 */
	public native float getIndex()
	/*-{
		return this.index;
	}-*/;

	public native void setIndex(float value)
	/*-{
		this.index = value;
	}-*/;

	/**
	 * @return The array of labels for the button bar. each object should have
	 *         the properties `title`, `image`, `width` and `enabled`.
	 */
	public native Object[] getLabels()
	/*-{
		return this.labels;
	}-*/;

	public native void setLabels(Object[] value)
	/*-{
		this.labels = value;
	}-*/;

	/**
	 * @return The style of the button bar
	 */
	public native float getStyle()
	/*-{
		return this.style;
	}-*/;

	public native void setStyle(float value)
	/*-{
		this.style = value;
	}-*/;

}
