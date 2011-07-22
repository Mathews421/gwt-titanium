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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level gestures module. the gesture module is responsible for high
 * level device gestures that are device-wide.
 * 
 * @since 0.8
 */
public class Gesture extends org.urish.gwtit.titanium.Module {
	protected Gesture() {
	}

	public static native void addOrientationchangeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Gesture.addEventListener('orientationchange', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public static native void addShakeHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return Titanium.Gesture.addEventListener('shake', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}