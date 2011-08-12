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

package org.urish.gwtit.titanium.android;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The titanium binding of
 * [android.r](http://developer.android.com/reference/android/r.html). note that
 * this accesses android system-wide resources, not your application's
 * resources. to access your application's resources, you want
 * {@link org.urish.gwtit.titanium.app.android.r}.
 * <p>
 * Notes: These properties and sub-properties are queried directly against the
 * `android.R` class, and should have the same syntax. For example, to retrieve
 * the "OK" string in Android:
 * 
 * <Ti.Android.currentActivity.getString(Ti.Android.R.string.ok);>
 * 
 * @platforms android
 * @since 1.5
 */
public class R extends org.urish.gwtit.titanium.Proxy {
	protected R() {
	}

	/**
	 * @return Animation resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.anim.html](http:
	 *         //developer.android.com/reference/android/r.anim.html)
	 */
	public final native JavaScriptObject getAnim()
	/*-{
		return this.anim;
	}-*/;

	public final native void setAnim(JavaScriptObject value)
	/*-{
		this.anim = value;
	}-*/;

	/**
	 * @return Array resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.array.html](http
	 *         ://developer.android.com/reference/android/r.array.html)
	 */
	public final native JavaScriptObject getArray()
	/*-{
		return this.array;
	}-*/;

	public final native void setArray(JavaScriptObject value)
	/*-{
		this.array = value;
	}-*/;

	/**
	 * @return Attribute resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.attr.html](http:
	 *         //developer.android.com/reference/android/r.attr.html)
	 */
	public final native JavaScriptObject getAttr()
	/*-{
		return this.attr;
	}-*/;

	public final native void setAttr(JavaScriptObject value)
	/*-{
		this.attr = value;
	}-*/;

	/**
	 * @return Color resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.color.html](http
	 *         ://developer.android.com/reference/android/r.color.html)
	 */
	public final native JavaScriptObject getColor()
	/*-{
		return this.color;
	}-*/;

	public final native void setColor(JavaScriptObject value)
	/*-{
		this.color = value;
	}-*/;

	/**
	 * @return Dimension resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.dimen.html](http
	 *         ://developer.android.com/reference/android/r.dimen.html)
	 */
	public final native JavaScriptObject getDimen()
	/*-{
		return this.dimen;
	}-*/;

	public final native void setDimen(JavaScriptObject value)
	/*-{
		this.dimen = value;
	}-*/;

	/**
	 * @return Drawable resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.drawable.html](http
	 *         ://developer.android.com/reference/android/r.drawable.html)
	 */
	public final native JavaScriptObject getDrawable()
	/*-{
		return this.drawable;
	}-*/;

	public final native void setDrawable(JavaScriptObject value)
	/*-{
		this.drawable = value;
	}-*/;

	/**
	 * @return Id resources, see
	 *         [http://developer.android.com/reference/android/
	 *         r.id.html](http://
	 *         developer.android.com/reference/android/r.id.html)
	 */
	public final native JavaScriptObject getId()
	/*-{
		return this.id;
	}-*/;

	public final native void setId(JavaScriptObject value)
	/*-{
		this.id = value;
	}-*/;

	/**
	 * @return Integer resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.integer.html](http
	 *         ://developer.android.com/reference/android/r.integer.html)
	 */
	public final native JavaScriptObject getInteger()
	/*-{
		return this.integer;
	}-*/;

	public final native void setInteger(JavaScriptObject value)
	/*-{
		this.integer = value;
	}-*/;

	/**
	 * @return Layout resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.layout.html](http
	 *         ://developer.android.com/reference/android/r.layout.html)
	 */
	public final native JavaScriptObject getLayout()
	/*-{
		return this.layout;
	}-*/;

	public final native void setLayout(JavaScriptObject value)
	/*-{
		this.layout = value;
	}-*/;

	/**
	 * @return String resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.string.html](http
	 *         ://developer.android.com/reference/android/r.string.html)
	 */
	public final native JavaScriptObject getString()
	/*-{
		return this.string;
	}-*/;

	public final native void setString(JavaScriptObject value)
	/*-{
		this.string = value;
	}-*/;

	/**
	 * @return Style resources, see
	 *         [http://developer.android.com/reference/android
	 *         /r.style.html](http
	 *         ://developer.android.com/reference/android/r.style.html)
	 */
	public final native JavaScriptObject getStyle()
	/*-{
		return this.style;
	}-*/;

	public final native void setStyle(JavaScriptObject value)
	/*-{
		this.style = value;
	}-*/;

	/**
	 * @return Styleable reosurces, see
	 *         [http://developer.android.com/reference/android
	 *         /r.styleable.html](
	 *         http://developer.android.com/reference/android/r.styleable.html)
	 */
	public final native JavaScriptObject getStyleable()
	/*-{
		return this.styleable;
	}-*/;

	public final native void setStyleable(JavaScriptObject value)
	/*-{
		this.styleable = value;
	}-*/;

}
