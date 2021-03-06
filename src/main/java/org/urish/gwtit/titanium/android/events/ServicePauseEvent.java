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

package org.urish.gwtit.titanium.android.events;

import org.urish.gwtit.client.event.AbstractTitaniumEvent;

/**
 * 
 */
public class ServicePauseEvent extends AbstractTitaniumEvent {

	public final static String NATIVE_EVENT_NAME = "pause";

	protected ServicePauseEvent() {
	}

	/**
	 * incrementing integer indicating which iteration of an interval-based
	 * Service is pausing. For example, if you have an interval-based Service
	 * running every 10 seconds, iteration 3 would occur at about 30 seconds
	 * after you start the instance (assuming your service code runs quickly.)
	 */
	public final native int getIteration()
	/*-{
		return this.iteration;
	}-*/;

}
