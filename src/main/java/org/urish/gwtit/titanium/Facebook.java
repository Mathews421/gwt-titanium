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

import org.urish.gwtit.client.EventCallback;
import org.urish.gwtit.titanium.events.LoginHandler;
import org.urish.gwtit.titanium.events.LogoutHandler;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level Facebook module. The Facebook module is used for connecting
 * your application with Facebook through the [Facebook Graph
 * API](http://developers.facebook.com/docs/reference/api/) (see
 * `requestWithGraphPath`) or the deprecated [Facebook REST
 * API](http://developers.facebook.com/docs/reference/rest/) (see `request`).
 * Due to how the facebook login process works on iOS, your app will need to
 * have the following in your tiapp.xml if you target those platforms:
 * 
 * your_app_id_here
 * 
 * You must still set Ti.Facebook.appid within your app itself to use the
 * facebook module. This property is used only for configuring your app to
 * interface with the facebook login process.
 * 
 * <p>
 * Notes: Titanium Mobile SDK 1.6.0 marked a significant change for this module.
 * Older versions of the module were not compatible with the new Graph API.
 * Applications written for the pre-1.6.0 version of this module will **not**
 * work with the 1.6.0 and higher versions. Nor is the code shown in the
 * examples here backwards-compatible with pre-1.6.0 Titanium Mobile SDK.
 * 
 * @since 0.8
 */
public class Facebook extends org.urish.gwtit.titanium.Module {
	protected Facebook() {
	}

	/**
	 * @return OAuth token set after a successful `authorize`.
	 */
	public static native String getAccessToken()
	/*-{
		return Titanium.Facebook.accessToken;
	}-*/;

	public static native void setAccessToken(String value)
	/*-{
		Titanium.Facebook.accessToken = value;
	}-*/;

	/**
	 * @return Your Facebook application id. You need to set this for anything
	 *         to work.
	 */
	public static native String getAppid()
	/*-{
		return Titanium.Facebook.appid;
	}-*/;

	public static native void setAppid(String value)
	/*-{
		Titanium.Facebook.appid = value;
	}-*/;

	/**
	 * @return Time at which the `accessToken` expires.
	 */
	public static native java.util.Date getExpirationDate()
	/*-{
		return Titanium.Facebook.expirationDate;
	}-*/;

	public static native void setExpirationDate(java.util.Date value)
	/*-{
		Titanium.Facebook.expirationDate = value;
	}-*/;

	/**
	 * @return Set to false to enable "Single-Sign-On" in cases where the
	 *         official Facebook app is on the device. Default is true, meaning
	 *         the traditional, dialog-based authentication is used rather than
	 *         Single-Sign-On. See [Facebook Mobile
	 *         Guide](http://developers.facebook.com/docs/guides/mobile) for
	 *         details of their Single-Sign-On schem.
	 */
	public static native boolean getForceDialogAuth()
	/*-{
		return Titanium.Facebook.forceDialogAuth;
	}-*/;

	public static native void setForceDialogAuth(boolean value)
	/*-{
		Titanium.Facebook.forceDialogAuth = value;
	}-*/;

	/**
	 * @return Returns true if the user has logged in
	 */
	public static native boolean getLoggedIn()
	/*-{
		return Titanium.Facebook.loggedIn;
	}-*/;

	public static native void setLoggedIn(boolean value)
	/*-{
		Titanium.Facebook.loggedIn = value;
	}-*/;

	/**
	 * @return Set/return an array of permissions to request for your app. Be
	 *         sure the permissions you want are set before calling `authorize`.
	 */
	public static native JavaScriptObject getPermissions()
	/*-{
		return Titanium.Facebook.permissions;
	}-*/;

	public static native void setPermissions(JavaScriptObject value)
	/*-{
		Titanium.Facebook.permissions = value;
	}-*/;

	/**
	 * @return The unique user id returned from Facebook.
	 */
	public static native String getUid()
	/*-{
		return Titanium.Facebook.uid;
	}-*/;

	public static native void setUid(String value)
	/*-{
		Titanium.Facebook.uid = value;
	}-*/;

	public static native org.urish.gwtit.titanium.facebook.LoginButton createLoginButton()
	/*-{
		return Titanium.Facebook.createLoginButton();
	}-*/;

	/**
	 * Login the user (if not already logged in) and authorize your application.
	 * Be sure to set your desired `permissions` and your `appid` before calling
	 * this.
	 */
	public static native void authorize()
	/*-{
		return Titanium.Facebook.authorize();
	}-*/;

	/**
	 * Open a supported Facebook
	 * [dialog](http://developers.facebook.com/docs/reference/dialogs/). "feed"
	 * is just about the only useful one.
	 * 
	 * @param action
	 *            Specifies which dialog to show, such as "feed".
	 * @param params
	 *            A dictionary object for pre-filling some of the dialog's
	 *            fields. See example.
	 */
	public static native void dialog(String action, JavaScriptObject params,
			EventCallback<org.urish.gwtit.titanium.facebook.DialogCallbackParams> callback)
	/*-{
		return Titanium.Facebook.dialog(action, params, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Clear the OAuth `accessToken` and logout the user.
	 */
	public static native void logout()
	/*-{
		return Titanium.Facebook.logout();
	}-*/;

	/**
	 * Make a request to the deprecated [Facebook REST
	 * API](http://developers.facebook.com/docs/reference/rest/).
	 * 
	 * @param method
	 *            The REST API method to call.
	 * @param params
	 *            A dictionary object for setting parameters required by the
	 *            call, if any. See examples.
	 */
	public static native void request(String method, JavaScriptObject params,
			EventCallback<org.urish.gwtit.titanium.facebook.RequestCallbackParams> callback)
	/*-{
		return Titanium.Facebook.request(method, params, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Make a [Facebook Graph
	 * API](http://developers.facebook.com/docs/reference/api/) request. If the
	 * request requires user authorization, be sure user is already logged-in
	 * and your app is authorized. (You can check `loggedIn` for that.)
	 * 
	 * @param path
	 *            The graph API path to request. For example, "me" requests
	 *            [information about the logged-in
	 *            user](http://developers.facebook
	 *            .com/docs/reference/api/user/).
	 * @param params
	 *            A dictionary object for setting parameters required by the
	 *            call, if any. See examples.
	 * @param httpMethod
	 *            The http method (GET/POST/DELETE) to use for the call.
	 */
	public static native void requestWithGraphPath(String path, JavaScriptObject params, String httpMethod,
			EventCallback<org.urish.gwtit.titanium.facebook.GraphRequestCallbackParams> callback)
	/*-{
		return Titanium.Facebook.requestWithGraphPath(path, params, httpMethod, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Add an event listener for the instance to receive triggered events
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void addEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Facebook.addEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Remove a previously added event listener
	 * 
	 * @param name
	 *            name of the event
	 */
	public static native void removeEventListener(String name, EventCallback<JavaScriptObject> callback)
	/*-{
		return Titanium.Facebook.removeEventListener(name, function(e) { callback.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); });
	}-*/;

	/**
	 * Fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            name of the event.
	 * @param event
	 *            event object
	 */
	public static native void fireEvent(String name, JavaScriptObject event)
	/*-{
		return Titanium.Facebook.fireEvent(name, event);
	}-*/;

	public static native void addLoginHandler(LoginHandler handler)
	/*-{
		return Titanium.Facebook.addEventListener('login', function(e) { handler.@org.urish.gwtit.titanium.events.LoginHandler::onLogin(Lorg/urish/gwtit/titanium/events/LoginEvent;)(e); } );
	}-*/;

	public static native void addLogoutHandler(LogoutHandler handler)
	/*-{
		return Titanium.Facebook.addEventListener('logout', function(e) { handler.@org.urish.gwtit.titanium.events.LogoutHandler::onLogout(Lorg/urish/gwtit/titanium/events/LogoutEvent;)(e); } );
	}-*/;

}
