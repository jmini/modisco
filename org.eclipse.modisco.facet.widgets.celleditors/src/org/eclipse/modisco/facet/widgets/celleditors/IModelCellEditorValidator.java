/*******************************************************************************
 * Copyright (c) 2010, 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors;

/** Allows validating a cell editor's value before it is committed */
public interface IModelCellEditorValidator {
	/** @return whether the given value is valid for this cell editor */
	boolean isValid(Object newValue);
}
