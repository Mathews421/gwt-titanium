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

package org.urish.gwtit.titanium.media;

import org.urish.gwtit.titanium.media.events.ChangeHandler;
import org.urish.gwtit.titanium.media.events.ProgressHandler;

/**
 * The AudioPlayer object is returned by
 * {@link org.urish.gwtit.titanium.media.createAudioPlayer} and is used for
 * streaming audio to the device and low-level control of the audio playback.
 * 
 * @since 0.9
 */
public class AudioPlayer extends org.urish.gwtit.titanium.Proxy {
	protected AudioPlayer() {
	}

	private static native final int value_STATE_BUFFERING()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_BUFFERING;
	}-*/;

	public static final int STATE_BUFFERING = value_STATE_BUFFERING();

	private static native final int value_STATE_INITIALIZED()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_INITIALIZED;
	}-*/;

	public static final int STATE_INITIALIZED = value_STATE_INITIALIZED();

	private static native final int value_STATE_PAUSED()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_PAUSED;
	}-*/;

	public static final int STATE_PAUSED = value_STATE_PAUSED();

	private static native final int value_STATE_PLAYING()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_PLAYING;
	}-*/;

	public static final int STATE_PLAYING = value_STATE_PLAYING();

	private static native final int value_STATE_STARTING()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_STARTING;
	}-*/;

	public static final int STATE_STARTING = value_STATE_STARTING();

	private static native final int value_STATE_STOPPED()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_STOPPED;
	}-*/;

	public static final int STATE_STOPPED = value_STATE_STOPPED();

	private static native final int value_STATE_STOPPING()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_STOPPING;
	}-*/;

	public static final int STATE_STOPPING = value_STATE_STOPPING();

	private static native final int value_STATE_WAITING_FOR_DATA()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_WAITING_FOR_DATA;
	}-*/;

	public static final int STATE_WAITING_FOR_DATA = value_STATE_WAITING_FOR_DATA();

	private static native final int value_STATE_WAITING_FOR_QUEUE()
	/*-{
		return Titanium.Media.AudioPlayer.STATE_WAITING_FOR_QUEUE;
	}-*/;

	public static final int STATE_WAITING_FOR_QUEUE = value_STATE_WAITING_FOR_QUEUE();

	/**
	 * @return Boolean to indicate if audio should continue playing even if
	 *         Activity is paused
	 * @platforms android
	 */
	public final native boolean getAllowBackground()
	/*-{
		return this.allowBackground;
	}-*/;

	public final native void setAllowBackground(boolean value)
	/*-{
		this.allowBackground = value;
	}-*/;

	/**
	 * @return Bit rate of the current playback stream
	 */
	public final native double getBitRate()
	/*-{
		return this.bitRate;
	}-*/;

	public final native void setBitRate(double value)
	/*-{
		this.bitRate = value;
	}-*/;

	/**
	 * @return Returns boolean indicating if the playback is idle
	 */
	public final native boolean getIdle()
	/*-{
		return this.idle;
	}-*/;

	public final native void setIdle(boolean value)
	/*-{
		this.idle = value;
	}-*/;

	/**
	 * @return Returns boolean indicating if the playback is paused
	 */
	public final native boolean getPaused()
	/*-{
		return this.paused;
	}-*/;

	public final native void setPaused(boolean value)
	/*-{
		this.paused = value;
	}-*/;

	/**
	 * @return Returns boolean indicating if the playback is streaming audio
	 */
	public final native boolean getPlaying()
	/*-{
		return this.playing;
	}-*/;

	public final native void setPlaying(boolean value)
	/*-{
		this.playing = value;
	}-*/;

	/**
	 * @return Returns the current playback progress. Will return zero if
	 *         sampleRate has not yet been detected
	 */
	public final native double getProgress()
	/*-{
		return this.progress;
	}-*/;

	public final native void setProgress(double value)
	/*-{
		this.progress = value;
	}-*/;

	/**
	 * @return Returns int for the current state of playback
	 */
	public final native int getState()
	/*-{
		return this.state;
	}-*/;

	public final native void setState(int value)
	/*-{
		this.state = value;
	}-*/;

	/**
	 * @return Returns the url for the current playback
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
	 * @return Returns boolean indicating if the playback is waiting for audio
	 *         data from the network
	 */
	public final native boolean getWaiting()
	/*-{
		return this.waiting;
	}-*/;

	public final native void setWaiting(boolean value)
	/*-{
		this.waiting = value;
	}-*/;

	/**
	 * @return The size of the buffer used for streaming, in bytes
	 * @platforms iphone, ipad
	 */
	public final native float getBufferSize()
	/*-{
		return this.bufferSize;
	}-*/;

	public final native void setBufferSize(float value)
	/*-{
		this.bufferSize = value;
	}-*/;

	/**
	 * Pause playback
	 */
	public final native void pause()
	/*-{
		return this.pause();
	}-*/;

	/**
	 * Start playback
	 */
	public final native void start()
	/*-{
		return this.start();
	}-*/;

	/**
	 * Convert a state into a textual description suitable for display
	 */
	public final native String stateDescription()
	/*-{
		return this.stateDescription();
	}-*/;

	/**
	 * Stop playback
	 */
	public final native void stop()
	/*-{
		return this.stop();
	}-*/;

	public final native void addChangeHandler(ChangeHandler handler)
	/*-{
		return this.addEventListener('change', function(e) { handler.@org.urish.gwtit.titanium.media.events.ChangeHandler::onChange(Lorg/urish/gwtit/titanium/media/events/ChangeEvent;)(e); } );
	}-*/;

	public final native void addProgressHandler(ProgressHandler handler)
	/*-{
		return this.addEventListener('progress', function(e) { handler.@org.urish.gwtit.titanium.media.events.ProgressHandler::onProgress(Lorg/urish/gwtit/titanium/media/events/ProgressEvent;)(e); } );
	}-*/;

}
