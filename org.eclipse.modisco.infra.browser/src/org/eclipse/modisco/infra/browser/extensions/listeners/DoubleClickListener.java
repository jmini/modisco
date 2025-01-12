/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Code Synchronization
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.extensions.listeners;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IStatusLineManager;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface DoubleClickListener {

	public abstract void synchronizeEObject(EObject eObjet, IStatusLineManager statusLineManager);

}
