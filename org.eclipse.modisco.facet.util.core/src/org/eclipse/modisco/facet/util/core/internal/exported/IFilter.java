/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *    Nicolas Guyomar (Mia-Software) - Bug 340339 - Need some Utils class for Folder/File/Project management
 *    Gregoire Dupe (Mia-Software) - Bug 340339 - Need some Utils class for Folder/File/Project management
 *******************************************************************************/
package org.eclipse.modisco.facet.util.core.internal.exported;

/**
 * @since 0.2
 */
public interface IFilter<T> {
	// This class has been copied from org.eclipse.modisco.facet.infra.common.core.internal.utils.IFilter
	
	/**
	 * @param object
	 *            an element to be filtered
	 * @return false if the element must be filtered out.
	 */
	public boolean filter(T object);

}
