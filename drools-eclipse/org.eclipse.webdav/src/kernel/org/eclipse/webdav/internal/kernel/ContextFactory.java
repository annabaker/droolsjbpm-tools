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

package org.eclipse.webdav.internal.kernel;

import org.eclipse.webdav.IContext;
import org.eclipse.webdav.IContextFactory;

public class ContextFactory implements IContextFactory {

	protected IContext defaults = new Context();

	public ContextFactory() {
		super();
	}

	public IContext newContext() {
		return new Context(defaults);
	}

	public IContext newContext(IContext baseContext) {
		return new Context(baseContext);
	}

	/**
	 * Set the default values on the factory. All contexts created by this
	 * factory will have these defaults.
	 *
	 * @param defaultValues the default values
	 */
	public void setDefaults(IContext defaultValues) {
		defaults = defaultValues;
	}
}
