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

import org.urish.gwtit.client.Const;
import org.urish.gwtit.client.ConstImpl;

/**
 * The ipad specific ui capabilities. all properties, methods and events in this
 * namespace will only work on the apple ipad related devices. to develop for
 * ipad, you will need the apple iphone sdk 3.2 or later and titanium mobile sdk
 * 1.2 or later. for ipad ui programming guidelines, please review the [ipad
 * human interface
 * guidelines](http://developer.apple.com/iphone/library/documentation
 * /general/conceptual/ipadhig/introduction/introduction.html).
 * <p>
 * Notes: ### Custom Fonts
 * 
 * The iPad supports the ability to embed your own fonts in your iPad
 * application. To add your own fonts, you should add the
 * 
 * @platforms ipad
 * @since 1.2
 */
public class iPad extends org.urish.gwtit.titanium.Module {
	protected iPad() {
	}

	public static final Const POPOVER_ARROW_DIRECTION_ANY = new ConstImpl(
			"Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_ANY");

	public static final Const POPOVER_ARROW_DIRECTION_DOWN = new ConstImpl(
			"Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_DOWN");

	public static final Const POPOVER_ARROW_DIRECTION_LEFT = new ConstImpl(
			"Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_LEFT");

	public static final Const POPOVER_ARROW_DIRECTION_RIGHT = new ConstImpl(
			"Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_RIGHT");

	public static final Const POPOVER_ARROW_DIRECTION_UNKNOWN = new ConstImpl(
			"Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UNKNOWN");

	public static final Const POPOVER_ARROW_DIRECTION_UP = new ConstImpl("Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UP");

	public static native org.urish.gwtit.titanium.ui.ipad.Popover createPopover()
	/*-{
		return Titanium.UI.iPad.createPopover();
	}-*/;

	public static native org.urish.gwtit.titanium.ui.ipad.SplitWindow createSplitWindow()
	/*-{
		return Titanium.UI.iPad.createSplitWindow();
	}-*/;

}
