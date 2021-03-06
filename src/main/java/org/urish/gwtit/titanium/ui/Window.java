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

import org.urish.gwtit.titanium.ui.events.AndroidBackHandler;
import org.urish.gwtit.titanium.ui.events.AndroidCameraHandler;
import org.urish.gwtit.titanium.ui.events.AndroidFocusHandler;
import org.urish.gwtit.titanium.ui.events.AndroidSearchHandler;
import org.urish.gwtit.titanium.ui.events.AndroidVolumeDownHandler;
import org.urish.gwtit.titanium.ui.events.AndroidVolumeUpHandler;
import org.urish.gwtit.titanium.ui.events.CloseHandler;
import org.urish.gwtit.titanium.ui.events.OpenHandler;
import org.urish.gwtit.titanium.ui.events.WindowBlurHandler;
import org.urish.gwtit.titanium.ui.events.WindowFocusHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Window is an empty drawing surface or container. The Window is created by
 * the method {@link org.urish.gwtit.titanium.ui.createWindow}. Unlike
 * [Views](Titanium.UI.View-object), Windows can be opened and closed and can
 * have special display properties such as `fullscreen` or `modal`.
 * <p>
 * Notes: ### Sub-contexts
 * 
 * Windows can be loaded from another Javascript file by specifying the property
 * `url` and reference a file relative to your application `Resources` folder.
 * It's important to note that Titanium will refuse to load Javascript files
 * from a remote URL. Loading remote Javascript from a URL and providing it with
 * the full capabilities of the Titanium API would be very dangerous.
 * 
 * When you Window is loaded from a separate Javascript file, the code will be
 * executed in a separate Javascript context (called a "sub-context") than your
 * `app.js` global context. It will also execute in its own separate thread.
 * 
 * The special property <Titanium.UI.currentWindow> is available inside a
 * sub-context that points to the Javascript instance by reference in the global
 * context.
 * 
 * 
 * ### Passing Data
 * 
 * By default, sub-context variables cannot access Javascript references in the
 * global context. However, the global context can allow its sub-contexts the
 * ability to have access to properties and functions in the global context by
 * reference assignment. An example best illustrates how to do this.
 * 
 * In `app.js`, you could define a function and a property.
 * 
 * var a = 1; function b() { return "hello"; }
 * 
 * Now, you can create a new Window - let's call it `foo.js` - in your `app.js`.
 * 
 * var w = Titanium.UI.createWindow({ url:'foo.js' });
 * 
 * To _give_ your new window access to both `a` and `b`, you would need to
 * assign them to the new window reference `w`.
 * 
 * w.a = a; w.b = b;
 * 
 * Of course, you could give them a different name than their original names.
 * However, what name you give them in your `app.js` is how you will reference
 * them in `foo.js`. Now, let's look at the code for `foo.js`.
 * 
 * alert("b() = "+Titanium.UI.currentWindow.b());
 * 
 * In the above code, the `foo.js` will execute the function `b` in the global
 * context and return the result. Since `b` is a reference (vs. a copy by
 * value), any changes made to these Javascript references will be immediately
 * available in all sub-contexts.
 * 
 * ### Events
 * 
 * If you'd like to send events to a window from the global context and vice
 * versa, you could use the built-in event mechanism. For example, you could
 * define a custom event called `foo`. The window could listen for this event
 * and then respond with some action. For example, in your sub-context you might
 * define:
 * 
 * Titanium.UI.currentWindow.addEventListener('foo',function(e) {
 * Titanium.API.info("foo event received = "+JSON.stringify(e)); });
 * 
 * You could now fire the event from `app.js` like this:
 * 
 * var window = Titanium.UI.createWindow({ url:'bar.js' }); window.open();
 * window.fireEvent('foo',{a:'b'});
 * 
 * It's worth noting two important limitations of the example above:
 * 
 * You must open the window before you can send events to it. You also may have
 * to fire the event after a specified amount of time if you intend to
 * immediately send data to the window. This is because windows are opened
 * asynchronously and on a separate thread than the caller thread. You can only
 * send JSON-serializable data in a fireEvent. If you attempt to send objects
 * that have function references, they will be null.
 * 
 * 
 * ### Animations
 * 
 * Windows can be animated like any normal [View](Titanium.UI.View). To
 * transition between 2 windows, you can use the `transition` property on an
 * animation. For example, to flip right-to-left between two windows, you could
 * do the following:
 * 
 * var window2 = Titanium.UI.createWindow({url:'foo.js'}); var t =
 * Ti.UI.iPhone.AnimationStyle.FLIP_FROM_LEFT;
 * window1.animate({view:window2,transition:t});
 * 
 * In the above example, the `window2` view will be animated from the
 * right-to-left over `window1`.
 * 
 * Windows can be opened or closed with animation. In the example below, we
 * create a window that will open from small to large with a bounce effect. This
 * is done by applying a transformation at initialization time that scales the
 * original size of the window to 0. When the window is opened, a new 2D
 * transformation is applied that will scale the window size from 0 to 110% of
 * it's original size and then, after 1/20th of a second, will scale it back to
 * it's original size at 100%. This gives the bounce effect during animation.
 * 
 * var t = Titanium.UI.create2DMatrix().scale(0);
 * 
 * // create a window with the initial transform scaled to 0 var w =
 * Titanium.UI.createWindow({ backgroundColor:'#336699', borderWidth:8,
 * borderColor:'#999', height:400, width:300, borderRadius:10, opacity:0.92,
 * transform:t });
 * 
 * // create first transform to go beyond normal size var t1 =
 * Titanium.UI.create2DMatrix().scale(1.1);
 * 
 * var a = Titanium.UI.createAnimation(); a.transform = t1; a.duration = 200;
 * 
 * // when this animation completes, scale to normal size
 * a.addEventListener('complete', function() { // we can use the identity
 * transform to take it back to it's real size var t2 =
 * Titanium.UI.create2DMatrix(); w.animate({transform:t2, duration:200}); });
 * 
 * ### iPad Modal Windows
 * 
 * For iPad, iPhone SDK 3.2 and Titanium 1.2 introduced several new ways of
 * presenting modal windows.
 * 
 * The example below is a modal window.
 * 
 * ![modal](http://img.skitch.com/20100406-bqb3f8pb6e4ger7wkcdcw5mbar.png)
 * 
 * You can create this type of modal window on iPad with the following code
 * snippet:
 * 
 * var window = Titanium.UI.createWindow(); window.open({ modal:true,
 * modalTransitionStyle: Ti.UI.iPhone.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL,
 * modalStyle: Ti.UI.iPhone.MODAL_PRESENTATION_FORMSHEET })
 * 
 * ### Android "root" Windows
 * 
 * In Android, you may wish to specify that a window which you create (such as
 * the first window) should be considered the root window and that the
 * application should exit when the back button is pressed from that window.
 * This is particularly useful if your application is not using a Tab Group and
 * therefore the splash screen window is appearing whenever you press the back
 * button from your lowest window on the stack.
 * 
 * To indicate that a particular window should cause an application to exit when
 * the back button is pressed, pass `exitOnClose: true` as one of the creation
 * arguments, as shown here:
 * 
 * var win = Titanium.UI.createWindow({ title: 'My Root Window', exitOnClose:
 * true });
 * 
 * @since 0.9
 */
public class Window extends org.urish.gwtit.titanium.ui.View {
	protected Window() {
	}

	/**
	 * @return For heavyweight windows, this property contains a reference to
	 *         the Android Activity object associated with this window.
	 * 
	 * @platforms android
	 */
	public final native org.urish.gwtit.titanium.android.Activity getActivity()
	/*-{
		return this.activity;
	}-*/;

	public final native void setActivity(org.urish.gwtit.titanium.android.Activity value)
	/*-{
		this.activity = value;
	}-*/;

	/**
	 * @return Title for the back button. This is only valid when the window is
	 *         a child of a tab.
	 * @platforms iphone, ipad
	 */
	public final native String getBackButtonTitle()
	/*-{
		return this.backButtonTitle;
	}-*/;

	public final native void setBackButtonTitle(String value)
	/*-{
		this.backButtonTitle = value;
	}-*/;

	/**
	 * @return Url to an image to show as the back button.This is only valid
	 *         when the window is a child of a tab.
	 * @platforms iphone, ipad
	 */
	public final native String getBackButtonTitleImage()
	/*-{
		return this.backButtonTitleImage;
	}-*/;

	public final native void setBackButtonTitleImage(String value)
	/*-{
		this.backButtonTitleImage = value;
	}-*/;

	/**
	 * @return Web named color or hex value for the color of the nav bar.
	 * @platforms iphone, ipad
	 */
	public final native String getBarColor()
	/*-{
		return this.barColor;
	}-*/;

	public final native void setBarColor(String value)
	/*-{
		this.barColor = value;
	}-*/;

	/**
	 * @return Url to a local image to place as the background of the nav bar.
	 * @platforms iphone, ipad
	 */
	public final native String getBarImage()
	/*-{
		return this.barImage;
	}-*/;

	public final native void setBarImage(String value)
	/*-{
		this.barImage = value;
	}-*/;

	/**
	 * @default False
	 * @return Boolean indicates if the application should exit when the Android
	 *         back button is pressed while the window is being shown. You can
	 *         only set this as a createWindow({...}) option. Setting it after
	 *         window creation will no effect.
	 * @platforms android
	 */
	public final native boolean getExitOnClose()
	/*-{
		return this.exitOnClose;
	}-*/;

	public final native void setExitOnClose(boolean value)
	/*-{
		this.exitOnClose = value;
	}-*/;

	/**
	 * @return Boolean indicates if the window is fullscreen (no device chrome)
	 */
	public final native boolean getFullscreen()
	/*-{
		return this.fullscreen;
	}-*/;

	public final native void setFullscreen(boolean value)
	/*-{
		this.fullscreen = value;
	}-*/;

	/**
	 * @return View to show in the left nav bar area.
	 * @platforms iphone, ipad
	 */
	public final native JavaScriptObject getLeftNavButton()
	/*-{
		return this.leftNavButton;
	}-*/;

	public final native void setLeftNavButton(JavaScriptObject value)
	/*-{
		this.leftNavButton = value;
	}-*/;

	/**
	 * @default False
	 * @return Boolean to indicate if the window should be opened modal in front
	 *         of other windows. Android note: the combination of
	 *         `fullscreen:true` and `modal:true` will not work as expected.
	 *         Android modal windows are translucent, and, in Android, the
	 *         contents of a translucent window cannot appear above the status
	 *         bar. I.e., even though you say `fullscreen:true`, the status bar
	 *         will still be visible *if* it was visible in the previous window.
	 *         `navBarHidden` and `modal` do work fine together, however.
	 */
	public final native boolean getModal()
	/*-{
		return this.modal;
	}-*/;

	public final native void setModal(boolean value)
	/*-{
		this.modal = value;
	}-*/;

	/**
	 * @default False
	 * @return For modal windows, hide the nav bar (true) or show the nav bar
	 *         (false, default).
	 */
	public final native boolean getNavBarHidden()
	/*-{
		return this.navBarHidden;
	}-*/;

	public final native void setNavBarHidden(boolean value)
	/*-{
		this.navBarHidden = value;
	}-*/;

	/**
	 * @return Array of orientation mode constants defined in {@link
	 *         org.urish.gwtit..Titanium.UI}. On Android, orientation modes that
	 *         can be set are dependant on the Android SDK level of the device
	 *         itself. It should be noted that, the definition of portrait or
	 *         landscape mode can vary based on the physical orientation of the
	 *         device. For example, on some devices
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_LEFT} represents the
	 *         top of the device being at the 270 degree position but other
	 *         devices may (based on camera position for example) treat this
	 *         position as {@link org.urish.gwtit.titanium.UI.LANDSCAPE_RIGHT}.
	 *         In general, applications for Android that need to be aware of
	 *         orientation should try and limit their orientation logic to
	 *         handling either portrait or landscape rather than worrying about
	 *         the reverse modes. This approach will allow the orientation modes
	 *         to adopt a more natural feel for the specific device.
	 * 
	 *         The following list breaks down the orientation behavior on
	 *         Android: 1) ({@link org.urish.gwtit.titanium.UI.PORTRAIT} OR
	 *         {@link org.urish.gwtit.titanium.UI.UPSIDE_PORTRAIT}) AND (
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_LEFT} OR
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_RIGHT}) - Enables
	 *         full sensor which lets the operating system control the
	 *         orientation of the screen based on the sensor inside the device.
	 *         2) {@link org.urish.gwtit.titanium.UI.PORTRAIT} OR
	 *         {@link org.urish.gwtit.titanium.UI.UPSIDE_PORTRAIT} - Enables
	 *         sensor portrait mode on Android 2.3 and above. Sensor portrait
	 *         mode on Android means the screen will shift between both portrait
	 *         modes according to the sensor inside the device. If the Android
	 *         version is less than 2.3, then normal portrait mode is locked. 3)
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_LEFT} OR
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE_RIGHT} - Enables
	 *         sensor landscape mode on Android 2.3 and above. Sensor landscape
	 *         mode on Android means the screen will shift between both
	 *         landscape modes according to the sensor inside the device. If the
	 *         Android version is less than 2.3, then normal landscape mode is
	 *         locked. 4) {@link org.urish.gwtit.titanium.UI.PORTRAIT} - Locks
	 *         screen orientation to portrait mode 5)
	 *         {@link org.urish.gwtit.titanium.UI.LANDSCAPE} - Locks screen
	 *         orientation to landscape mode 6) empty array - resets the
	 *         orientation to default sensor control
	 */
	public final native int[] getOrientationModes()
	/*-{
		return this.orientationModes;
	}-*/;

	public final native void setOrientationModes(int[] value)
	/*-{
		this.orientationModes = value;
	}-*/;

	/**
	 * @return Current orientation of the window. Value will be one of the
	 *         orientation constants defined in {@link
	 *         org.urish.gwtit..Titanium.UI}.
	 */
	public final native int getOrientation()
	/*-{
		return this.orientation;
	}-*/;

	public final native void setOrientation(int value)
	/*-{
		this.orientation = value;
	}-*/;

	/**
	 * @return View to show in the right nav bar area.
	 * @platforms iphone, ipad
	 */
	public final native org.urish.gwtit.titanium.ui.View getRightNavButton()
	/*-{
		return this.rightNavButton;
	}-*/;

	public final native void setRightNavButton(org.urish.gwtit.titanium.ui.View value)
	/*-{
		this.rightNavButton = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the tab bar should be hidden. this is only
	 *         valid when the window is a child of a tab.
	 */
	public final native boolean getTabBarHidden()
	/*-{
		return this.tabBarHidden;
	}-*/;

	public final native void setTabBarHidden(boolean value)
	/*-{
		this.tabBarHidden = value;
	}-*/;

	/**
	 * @return Title of the window.
	 */
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.title = value;
	}-*/;

	/**
	 * @return View to show in the title area.
	 * @platforms iphone, ipad
	 */
	public final native org.urish.gwtit.titanium.ui.View getTitleControl()
	/*-{
		return this.titleControl;
	}-*/;

	public final native void setTitleControl(org.urish.gwtit.titanium.ui.View value)
	/*-{
		this.titleControl = value;
	}-*/;

	/**
	 * @return Url to a image that show in the title area.
	 * @platforms iphone, ipad
	 */
	public final native String getTitleImage()
	/*-{
		return this.titleImage;
	}-*/;

	public final native void setTitleImage(String value)
	/*-{
		this.titleImage = value;
	}-*/;

	/**
	 * @return Title prompt for the window.
	 */
	public final native String getTitlePrompt()
	/*-{
		return this.titlePrompt;
	}-*/;

	public final native void setTitlePrompt(String value)
	/*-{
		this.titlePrompt = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the title property
	 */
	public final native String getTitleid()
	/*-{
		return this.titleid;
	}-*/;

	public final native void setTitleid(String value)
	/*-{
		this.titleid = value;
	}-*/;

	/**
	 * @return The key in the locale file to use for the titlePrompt property
	 */
	public final native String getTitlepromptid()
	/*-{
		return this.titlepromptid;
	}-*/;

	public final native void setTitlepromptid(String value)
	/*-{
		this.titlepromptid = value;
	}-*/;

	/**
	 * @return Array of button objects to show in the toolbar of the window.
	 *         This is only valid when the window is a child of a tab.
	 * @platforms iphone, ipad
	 */
	public final native JavaScriptObject[] getToolbar()
	/*-{
		return this.toolbar;
	}-*/;

	public final native void setToolbar(JavaScriptObject[] value)
	/*-{
		this.toolbar = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the nav bar is translucent.
	 * @platforms iphone, ipad
	 */
	public final native boolean getTranslucent()
	/*-{
		return this.translucent;
	}-*/;

	public final native void setTranslucent(boolean value)
	/*-{
		this.translucent = value;
	}-*/;

	/**
	 * @return Url to a JavaScript file with the windows instructions. this
	 *         window will create a new JavaScript sub-context that will run in
	 *         its own thread and global variable space.
	 */
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native void setUrl(String value)
	/*-{
		this.url = value;
	}-*/;

	/**
	 * @return One of
	 *         {@link org.urish.gwtit.titanium.ui.Android.SOFT_INPUT_ADJUST_PAN}
	 *         ,
	 *         {@link org.urish.gwtit.titanium.ui.Android.SOFT_INPUT_ADJUST_RESIZE}
	 *         , or
	 *         {@link org.urish.gwtit.titanium.ui.Android.SOFT_INPUT_ADJUST_UNSPECIFIED}
	 *         . Note: MUST be passed in the creation options. (Android Only)
	 *         [Android Doc:
	 *         Window.setSoftInputMode](http://developer.android.com
	 *         /reference/android/view/Window.html#setSoftInputMode(int))
	 * 
	 * @platforms android
	 */
	public final native int getWindowSoftInputMode()
	/*-{
		return this.windowSoftInputMode;
	}-*/;

	public final native void setWindowSoftInputMode(int value)
	/*-{
		this.windowSoftInputMode = value;
	}-*/;

	/**
	 * @return Set the pixel format for the Activity's Window. The property is
	 *         ignored on a Titanium "lightweight" Window. Use one of the
	 *         {@link org.urish.gwtit.titanium.ui.Android}.PIXEL_FORMAT
	 *         constants to set the format. See [Android SDK
	 *         Window.setFormat](http
	 *         ://developer.android.com/reference/android/view
	 *         /Window.html#setFormat(int))
	 * 
	 * @platforms android
	 * @since 1.8.0
	 */
	public final native float getWindowPixelFormat()
	/*-{
		return this.windowPixelFormat;
	}-*/;

	public final native void setWindowPixelFormat(float value)
	/*-{
		this.windowPixelFormat = value;
	}-*/;

	/**
	 * Close the window
	 */
	public final native void close()
	/*-{
		return this.close();
	}-*/;

	/**
	 * Close the window
	 * 
	 * @param options
	 *            close the window with optional animation or display properties
	 */
	public final native void close(JavaScriptObject options)
	/*-{
		return this.close(options);
	}-*/;

	/**
	 * Open the window
	 */
	public final native void open()
	/*-{
		return this.open();
	}-*/;

	/**
	 * Open the window
	 * 
	 * @param options
	 *            open the window with optional animation or display properties
	 */
	public final native void open(JavaScriptObject options)
	/*-{
		return this.open(options);
	}-*/;

	public final native void addAndroidBackHandler(AndroidBackHandler handler)
	/*-{
		return this.addEventListener('android:back', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AndroidBackHandler::onAndroidBack(Lorg/urish/gwtit/titanium/ui/events/AndroidBackEvent;)(e); } );
	}-*/;

	public final native void addAndroidCameraHandler(AndroidCameraHandler handler)
	/*-{
		return this.addEventListener('android:camera', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AndroidCameraHandler::onAndroidCamera(Lorg/urish/gwtit/titanium/ui/events/AndroidCameraEvent;)(e); } );
	}-*/;

	public final native void addAndroidFocusHandler(AndroidFocusHandler handler)
	/*-{
		return this.addEventListener('android:focus', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AndroidFocusHandler::onAndroidFocus(Lorg/urish/gwtit/titanium/ui/events/AndroidFocusEvent;)(e); } );
	}-*/;

	public final native void addAndroidSearchHandler(AndroidSearchHandler handler)
	/*-{
		return this.addEventListener('android:search', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AndroidSearchHandler::onAndroidSearch(Lorg/urish/gwtit/titanium/ui/events/AndroidSearchEvent;)(e); } );
	}-*/;

	public final native void addAndroidVolumeDownHandler(AndroidVolumeDownHandler handler)
	/*-{
		return this.addEventListener('android:voldown', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AndroidVolumeDownHandler::onAndroidVolumeDown(Lorg/urish/gwtit/titanium/ui/events/AndroidVolumeDownEvent;)(e); } );
	}-*/;

	public final native void addAndroidVolumeUpHandler(AndroidVolumeUpHandler handler)
	/*-{
		return this.addEventListener('android:volup', function(e) { handler.@org.urish.gwtit.titanium.ui.events.AndroidVolumeUpHandler::onAndroidVolumeUp(Lorg/urish/gwtit/titanium/ui/events/AndroidVolumeUpEvent;)(e); } );
	}-*/;

	public final native void addBlurHandler(WindowBlurHandler handler)
	/*-{
		return this.addEventListener('blur', function(e) { handler.@org.urish.gwtit.titanium.ui.events.WindowBlurHandler::onWindowBlur(Lorg/urish/gwtit/titanium/ui/events/WindowBlurEvent;)(e); } );
	}-*/;

	public final native void addCloseHandler(CloseHandler handler)
	/*-{
		return this.addEventListener('close', function(e) { handler.@org.urish.gwtit.titanium.ui.events.CloseHandler::onClose(Lorg/urish/gwtit/titanium/ui/events/CloseEvent;)(e); } );
	}-*/;

	public final native void addFocusHandler(WindowFocusHandler handler)
	/*-{
		return this.addEventListener('focus', function(e) { handler.@org.urish.gwtit.titanium.ui.events.WindowFocusHandler::onWindowFocus(Lorg/urish/gwtit/titanium/ui/events/WindowFocusEvent;)(e); } );
	}-*/;

	public final native void addOpenHandler(OpenHandler handler)
	/*-{
		return this.addEventListener('open', function(e) { handler.@org.urish.gwtit.titanium.ui.events.OpenHandler::onOpen(Lorg/urish/gwtit/titanium/ui/events/OpenEvent;)(e); } );
	}-*/;

}
