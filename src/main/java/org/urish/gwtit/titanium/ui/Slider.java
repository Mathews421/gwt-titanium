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

import org.urish.gwtit.titanium.ui.events.SliderChangeHandler;

/**
 * A Slider is created by the method
 * {@link org.urish.gwtit.titanium.ui.createSlider}.
 * 
 * @since 0.8
 */
public class Slider extends org.urish.gwtit.titanium.ui.View {
	protected Slider() {
	}

	/**
	 * @return The image url of the slider left track when in the disabled state
	 */
	public final native String getDisabledLeftTrackImage()
	/*-{
		return this.disabledLeftTrackImage;
	}-*/;

	public final native void setDisabledLeftTrackImage(String value)
	/*-{
		this.disabledLeftTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider right track when in the disabled
	 *         state
	 */
	public final native String getDisabledRightTrackImage()
	/*-{
		return this.disabledRightTrackImage;
	}-*/;

	public final native void setDisabledRightTrackImage(String value)
	/*-{
		this.disabledRightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider thumb when in the disabled state
	 */
	public final native String getDisabledThumbImage()
	/*-{
		return this.disabledThumbImage;
	}-*/;

	public final native void setDisabledThumbImage(String value)
	/*-{
		this.disabledThumbImage = value;
	}-*/;

	/**
	 * @return Boolean to indicate the enabled state of the slider
	 */
	public final native boolean getEnabled()
	/*-{
		return this.enabled;
	}-*/;

	public final native void setEnabled(boolean value)
	/*-{
		this.enabled = value;
	}-*/;

	/**
	 * @return The image url of the slider left track when in the highlighted
	 *         state
	 */
	public final native String getHighlightedLeftTrackImage()
	/*-{
		return this.highlightedLeftTrackImage;
	}-*/;

	public final native void setHighlightedLeftTrackImage(String value)
	/*-{
		this.highlightedLeftTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider right track when in the highlighted
	 *         state
	 */
	public final native String getHighlightedRightTrackImage()
	/*-{
		return this.highlightedRightTrackImage;
	}-*/;

	public final native void setHighlightedRightTrackImage(String value)
	/*-{
		this.highlightedRightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider thumb when in the highlighted state
	 */
	public final native String getHighlightedThumbImage()
	/*-{
		return this.highlightedThumbImage;
	}-*/;

	public final native void setHighlightedThumbImage(String value)
	/*-{
		this.highlightedThumbImage = value;
	}-*/;

	/**
	 * @return The image url of the slider left track
	 */
	public final native String getLeftTrackImage()
	/*-{
		return this.leftTrackImage;
	}-*/;

	public final native void setLeftTrackImage(String value)
	/*-{
		this.leftTrackImage = value;
	}-*/;

	/**
	 * @return The maximum slider value
	 */
	public final native float getMax()
	/*-{
		return this.max;
	}-*/;

	public final native void setMax(float value)
	/*-{
		this.max = value;
	}-*/;

	/**
	 * @return Value can't be moved higher than maxRange. maxRange equals max by
	 *         default. (Android)
	 * @platforms android
	 */
	public final native int getMaxRange()
	/*-{
		return this.maxRange;
	}-*/;

	public final native void setMaxRange(int value)
	/*-{
		this.maxRange = value;
	}-*/;

	/**
	 * @return The minimum slider value
	 */
	public final native float getMin()
	/*-{
		return this.min;
	}-*/;

	public final native void setMin(float value)
	/*-{
		this.min = value;
	}-*/;

	/**
	 * @return Value can't be moved lower than minRange. minRange equals min by
	 *         default. (Android)
	 * @platforms android
	 */
	public final native int getMinRange()
	/*-{
		return this.minRange;
	}-*/;

	public final native void setMinRange(int value)
	/*-{
		this.minRange = value;
	}-*/;

	/**
	 * @return The image url of the slider right track
	 */
	public final native String getRightTrackImage()
	/*-{
		return this.rightTrackImage;
	}-*/;

	public final native void setRightTrackImage(String value)
	/*-{
		this.rightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider left track when in the selected state
	 */
	public final native String getSelectedLeftTrackImage()
	/*-{
		return this.selectedLeftTrackImage;
	}-*/;

	public final native void setSelectedLeftTrackImage(String value)
	/*-{
		this.selectedLeftTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider right track when in the selected
	 *         state
	 */
	public final native String getSelectedRightTrackImage()
	/*-{
		return this.selectedRightTrackImage;
	}-*/;

	public final native void setSelectedRightTrackImage(String value)
	/*-{
		this.selectedRightTrackImage = value;
	}-*/;

	/**
	 * @return The image url of the slider thumb when in the selected state
	 */
	public final native String getSelectedThumbImage()
	/*-{
		return this.selectedThumbImage;
	}-*/;

	public final native void setSelectedThumbImage(String value)
	/*-{
		this.selectedThumbImage = value;
	}-*/;

	/**
	 * @return The image url to the slider thumb
	 */
	public final native String getThumbImage()
	/*-{
		return this.thumbImage;
	}-*/;

	public final native void setThumbImage(String value)
	/*-{
		this.thumbImage = value;
	}-*/;

	/**
	 * @return The value of the slider
	 */
	public final native String getValue()
	/*-{
		return this.value;
	}-*/;

	public final native void setValue(String value)
	/*-{
		this.value = value;
	}-*/;

	public final native void addChangeHandler(SliderChangeHandler handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.ui.events.SliderChangeHandler::onSliderChange(Lorg/urish/gwtit/titanium/ui/events/SliderChangeEvent;)(e); } );
	}-*/;

}
