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
package org.urish.gwtit.client.util;

import com.google.gwt.core.client.GWT;

public final class GwtUtil {
	/**
	 * Checks if we are running in GWT development mode ("hosted mode")
	 * 
	 * @return true if we are running under GWT development mode
	 */
	public static boolean isDevelopmentMode() {
		return !GWT.isScript() && GWT.isClient();
	}
}
