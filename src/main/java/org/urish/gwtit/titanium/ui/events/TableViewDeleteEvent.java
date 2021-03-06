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

package org.urish.gwtit.titanium.ui.events;

import org.urish.gwtit.client.event.TouchEvent;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class TableViewDeleteEvent extends TouchEvent {

	public final static String NATIVE_EVENT_NAME = "delete";

	protected TableViewDeleteEvent() {
	}

	/**
	 * table view row index
	 */
	public final native int getIndex()
	/*-{
		return this.index;
	}-*/;

	/**
	 * table view section object
	 */
	public final native org.urish.gwtit.titanium.ui.TableViewSection getSection()
	/*-{
		return this.section;
	}-*/;

	/**
	 * boolean to indicate if the right area was clicked
	 */
	public final native boolean getDetail()
	/*-{
		return this.detail;
	}-*/;

	/**
	 * boolean to indicate if the table is in search mode
	 */
	public final native boolean getSearchMode()
	/*-{
		return this.searchMode;
	}-*/;

	/**
	 * table view row data object
	 */
	public final native JavaScriptObject getRowData()
	/*-{
		return this.rowData;
	}-*/;

	/**
	 * table view row object
	 */
	public final native org.urish.gwtit.titanium.ui.TableViewRow getRow()
	/*-{
		return this.row;
	}-*/;

}
