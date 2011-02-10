/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.eclipse.core.ui;

import org.drools.eclipse.DroolsPluginImages;
import org.eclipse.jface.action.Action;

/**
 * Action used to enable / disable filter properties
 * 
 * @author <a href="mailto:kris_verlaenen@hotmail.com">kris verlaenen </a>
 */
public class FilterAction extends Action {

	private int filterType;

	private FilterActionGroup filterActionGroup;

	public FilterAction(FilterActionGroup actionGroup, String title,
			int property, boolean initValue, String imageDescriptorKey) {
		super(title);
		filterActionGroup = actionGroup;
		filterType = property;
		setChecked(initValue);
		setImageDescriptor(DroolsPluginImages.getImageDescriptor(imageDescriptorKey));
	}

	public int getFilterType() {
		return filterType;
	}

	public void run() {
		filterActionGroup.setFilter(filterType, isChecked());
	}
	
}
