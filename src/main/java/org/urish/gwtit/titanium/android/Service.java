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

import org.urish.gwtit.client.EventCallback;

/**
 * The titanium binding of an [android
 * service](http://developer.android.com/reference/android/app/service.html).
 * can be used to start/stop the service directly and listen for
 * service-specific events. in the javascript-based services you write, this can
 * be referenced with {@link org.urish.gwtit.titanium.android.currentservice}.
 * you can create an instance of the service with
 * {@link org.urish.gwtit.titanium.android.createservice}.
 * 
 * @platforms android
 * @since 1.5
 */
public class Service extends org.urish.gwtit.titanium.Proxy {
	protected Service() {
	}

	/**
	 * @return (read-only) the {@link org.urish.gwtit.titanium.android.intent}
	 *         used to start or bind to the service.
	 */
	public final native org.urish.gwtit.titanium.android.Intent getIntent()
	/*-{
		return this.intent;
	}-*/;

	public final native void setIntent(org.urish.gwtit.titanium.android.Intent value)
	/*-{
		this.intent = value;
	}-*/;

	/**
	 * @return (read-only) a service can be started more than once -- this
	 *         number (based on an incrementing integer) indicates which
	 *         "start number" in the sequence the current service instance is.
	 */
	public final native float getServiceInstanceId()
	/*-{
		return this.serviceInstanceId;
	}-*/;

	public final native void setServiceInstanceId(float value)
	/*-{
		this.serviceInstanceId = value;
	}-*/;

	/**
	 * Start the service. effective only if this instance of
	 * {@link org.urish.gwtit.titanium.android.service} was created with
	 * {@link org.urish.gwtit.titanium.android.createservice}.
	 */
	public final native void start()
	/*-{
		return this.start();
	}-*/;

	/**
	 * Stop this running instance of the service.
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

	public final class PauseEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "pause";

		/**
		 * incrementing integer indicating which iteration of an interval-based
		 * Service is pausing. For example, if you have an interval-based
		 * Service running every 10 seconds, iteration 3 would occur at about 30
		 * seconds after you start the instance (assuming your service code runs
		 * quickly.)
		 */
		public final native Object getIteration()
		/*-{
			return this.iteration;
		}-*/;

	}

	public final native void addPauseHandler(EventCallback<PauseEvent> handler)
	/*-{
		return this.addEventListener('pause', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class ResumeEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "resume";

		/**
		 * incrementing integer indicating which iteration of an interval-based
		 * Service is resuming. For example, if you have an interval-based
		 * Service running every 10 seconds, iteration 3 would occur at about 30
		 * seconds after you start the instance (assuming your service code runs
		 * quickly.)
		 */
		public final native Object getIteration()
		/*-{
			return this.iteration;
		}-*/;

	}

	public final native void addResumeHandler(EventCallback<ResumeEvent> handler)
	/*-{
		return this.addEventListener('resume', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class StartEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "start";

	}

	public final native void addStartHandler(EventCallback<StartEvent> handler)
	/*-{
		return this.addEventListener('start', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public final class StopEvent extends org.urish.gwtit.client.event.AbstractTitaniumEvent {
		public final static String EVENT_NAME = "stop";

	}

	public final native void addStopHandler(EventCallback<StopEvent> handler)
	/*-{
		return this.addEventListener('stop', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
