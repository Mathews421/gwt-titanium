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

import org.urish.gwtit.titanium.events.UpdateHandler;

/**
 * The top level Accelerometer module. The Accelerometer modules contains
 * methods and properties for using the device accelerometer.
 * <p>
 * Notes: You'll want to be selective about turning on and off the device
 * accelerometer. It's recommended you turn off the accelerometer when you're
 * not using it. You can turn off the accelerometer by simply removing your
 * event listener function.
 * 
 * Titanium.Accelerometer.removeEventListener('update',myFunction);
 * 
 * You can turn it back on by re-adding the same function with
 * `addEventListener`.
 * 
 * @since 0.1
 */
public class Accelerometer extends org.urish.gwtit.titanium.Module {
	protected Accelerometer() {
	}

	public static native void addUpdateHandler(UpdateHandler handler)
	/*-{
		return Titanium.Accelerometer.addEventListener('update', function(e) { handler.@org.urish.gwtit.titanium.events.UpdateHandler::onUpdate(Lorg/urish/gwtit/titanium/events/UpdateEvent;)(e); } );
	}-*/;

}
