/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.ui.internal.exported.dialog;


/**
 * A callback used to return a dialog's result asynchronously.
 * 
 * @since 0.3
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IDialogWithoutResultCallback {

	/**
	 * The user commit his action.
	 */
	void commited();

	/**
	 * The user cancel his action.
	 */
	void canceled();
}
