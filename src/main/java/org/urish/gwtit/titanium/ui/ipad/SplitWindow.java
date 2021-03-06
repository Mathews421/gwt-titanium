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

package org.urish.gwtit.titanium.ui.ipad;

import org.urish.gwtit.titanium.ui.ipad.events.VisibleHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A SplitWindow is a window that manages the presentation of two side-by-side
 * view controllers. You use this class to implement a master-detail interface,
 * in which the left-side view presents a list of items and the right-side
 * presents details of the selected item. The SplitView is for use exclusively
 * on iPad devices. The SplitWindow is created by the method
 * {@link org.urish.gwtit.titanium.ui.ipad.createSplitWindow}.
 * ![splitview](http://img.skitch.com/20100406-1f85bm9cx8t768xgsjqax1ng6y.png)
 * <p>
 * Notes: The SplitWindow inherits its methods and properties from
 * <Titanium.UI.Window>.
 * 
 * The `masterView` and `detailView` properties are required in the constructor
 * of the SplitWindow and cannot be changed once set.
 * 
 * The SplitWindow is a top-level window and cannot be contained within another
 * window or view.
 * 
 * @platforms ipad
 * @since 1.2
 */
public class SplitWindow extends org.urish.gwtit.titanium.ui.View {
	protected SplitWindow() {
	}

	/**
	 * @return View for the detail view section of the SplitWindow
	 */
	public final native JavaScriptObject getDetailView()
	/*-{
		return this.detailView;
	}-*/;

	public final native void setDetailView(JavaScriptObject value)
	/*-{
		this.detailView = value;
	}-*/;

	/**
	 * @return View for the master view section of the SplitWindow
	 */
	public final native JavaScriptObject getMasterView()
	/*-{
		return this.masterView;
	}-*/;

	public final native void setMasterView(JavaScriptObject value)
	/*-{
		this.masterView = value;
	}-*/;

	/**
	 * @return Whether or not to show the master view in portrait. Default is
	 *         'false'.
	 * @since 1.7.2
	 */
	public final native boolean getShowMasterInPortrait()
	/*-{
		return this.showMasterInPortrait;
	}-*/;

	public final native void setShowMasterInPortrait(boolean value)
	/*-{
		this.showMasterInPortrait = value;
	}-*/;

	public final native void addVisibleHandler(VisibleHandler handler)
	/*-{
		return this.addEventListener('visible', function(e) { handler.@org.urish.gwtit.titanium.ui.ipad.events.VisibleHandler::onVisible(Lorg/urish/gwtit/titanium/ui/ipad/events/VisibleEvent;)(e); } );
	}-*/;

}
