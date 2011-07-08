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

package org.urish.gwtit.titanium.map;

import org.urish.gwtit.client.EventCallback;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The mapview is an object created by
 * {@link org.urish.gwtit.titanium.map.createmapview} and is used for embedding
 * native mapping capabilities as a view in your application. with native maps,
 * you can control the mapping location, the type of map, the zoom level and you
 * can add custom annotations directly to the map.
 * <p>
 * Notes: For Android, you will need to <a
 * href="http://code.google.com/android/maps-api-signup.html">obtain a map key
 * from Google</a> to use maps in your application. On iPhone, you cannot call
 * any methods on a map view until it has been added to a view.
 * 
 * @since 0.8
 */
public class MapView extends org.urish.gwtit.titanium.ui.View {
	protected MapView() {
	}

	/**
	 * @return Boolean is mapping actions should be animated
	 */
	public native boolean getAnimate()
	/*-{
		return this.animate;
	}-*/;

	public native void setAnimate(boolean value)
	/*-{
		this.animate = value;
	}-*/;

	/**
	 * @return An array of annotations to add to the map
	 */
	public native Object[] getAnnotations()
	/*-{
		return this.annotations;
	}-*/;

	public native void setAnnotations(Object[] value)
	/*-{
		this.annotations = value;
	}-*/;

	/**
	 * @return The map type constant of either
	 *         {@link org.urish.gwtit.titanium.map.standard_type},
	 *         {@link org.urish.gwtit.titanium.map.satellite_type} or
	 *         {@link org.urish.gwtit.titanium.map.hybrid_type}.
	 */
	public native float getMapType()
	/*-{
		return this.mapType;
	}-*/;

	public native void setMapType(float value)
	/*-{
		this.mapType = value;
	}-*/;

	/**
	 * @return A dictionary that specifies the following properties specifying
	 *         the region location to set the map: `latitudedelta`,
	 *         `longitudedelta`, `latitude`, `longitude`.
	 */
	public native Object getRegion()
	/*-{
		return this.region;
	}-*/;

	public native void setRegion(Object value)
	/*-{
		this.region = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the map should attempt to fit the map view
	 *         into the region in the visible view
	 */
	public native boolean getRegionFit()
	/*-{
		return this.regionFit;
	}-*/;

	public native void setRegionFit(boolean value)
	/*-{
		this.regionFit = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the map should show the user's current
	 *         device location as a pin on the map
	 */
	public native boolean getUserLocation()
	/*-{
		return this.userLocation;
	}-*/;

	public native void setUserLocation(boolean value)
	/*-{
		this.userLocation = value;
	}-*/;

	/**
	 * Add a new annotation to the map
	 * 
	 * @param annotation
	 *            either a dictionary of properties for the annotation or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} instance.
	 */
	public native void addAnnotation(Object annotation)
	/*-{
		return this.addAnnotation(annotation);
	}-*/;

	/**
	 * Add one or more new annotation to the map
	 * 
	 * @param annotations
	 *            an array of either a dictionary of properties for the
	 *            annotation or a
	 *            [Titanium.Map.Annotation](Titanium.Map.Annotation) instance.
	 */
	public native void addAnnotations(Object annotations)
	/*-{
		return this.addAnnotations(annotations);
	}-*/;

	/**
	 * Add a route. currently only supported on iphone
	 * 
	 * @param route
	 *            dictionary with the properties: `name` route name, `points`
	 *            dictionary of values with longitude and latitude keys, `color`
	 *            for the line color and `width` for the line width.
	 */
	public native void addRoute(Object route)
	/*-{
		return this.addRoute(route);
	}-*/;

	/**
	 * Cause the annotation to be deselected (hidden).
	 * 
	 * @param annotation
	 *            either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public native void deselectAnnotation(Object annotation)
	/*-{
		return this.deselectAnnotation(annotation);
	}-*/;

	/**
	 * Removes all annotations added to the map
	 */
	public native void removeAllAnnotations()
	/*-{
		return this.removeAllAnnotations();
	}-*/;

	/**
	 * Remove an existing annotation from the map
	 * 
	 * @param annotation
	 *            either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public native void removeAnnotation(Object annotation)
	/*-{
		return this.removeAnnotation(annotation);
	}-*/;

	/**
	 * Remove one or more existing annotations from the map
	 * 
	 * @param annotation
	 *            an array of either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public native void removeAnnotations(Object annotation)
	/*-{
		return this.removeAnnotations(annotation);
	}-*/;

	/**
	 * Remove a previously added route. currently only supported on iphone
	 * 
	 * @param route
	 *            same route object used during addRoute
	 */
	public native void removeRoute(Object route)
	/*-{
		return this.removeRoute(route);
	}-*/;

	/**
	 * Cause the annotation to be selected (shown).
	 * 
	 * @param annotation
	 *            either a string of the annotation title or a
	 *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
	 */
	public native void selectAnnotation(Object annotation)
	/*-{
		return this.selectAnnotation(annotation);
	}-*/;

	/**
	 * Set and center the map location.
	 * 
	 * @param location
	 *            a dictionary that specifies the following properties
	 *            specifying the location to set the map: `latitudeDelta`,
	 *            `longitudeDelta`, `latitude`, `longitude`.
	 */
	public native void setLocation(Object location)
	/*-{
		return this.setLocation(location);
	}-*/;

	/**
	 * Zoom in or out of the map
	 * 
	 * @param level
	 *            zoom level (can be positive or negative)
	 */
	public native void zoom(float level)
	/*-{
		return this.zoom(level);
	}-*/;

	public native void addClickHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('click', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addCompleteHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('complete', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addErrorHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('error', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addLoadingHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('loading', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

	public native void addRegionChangedHandler(EventCallback<JavaScriptObject> handler)
	/*-{
		return this.addEventListener('regionChanged', function(e) { handler.@org.urish.gwtit.client.EventCallback::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(e); } );
	}-*/;

}
