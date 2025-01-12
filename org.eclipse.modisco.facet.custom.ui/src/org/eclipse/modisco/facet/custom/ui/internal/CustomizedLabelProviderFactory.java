/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *      David Couvrand (Soft-Maint) - Bug 418418 - [Customization] Overlay icons not implemented
 */
package org.eclipse.modisco.facet.custom.ui.internal;

import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.modisco.facet.custom.ui.ICustomizedLabelProviderFactory;

public class CustomizedLabelProviderFactory implements
		ICustomizedLabelProviderFactory {

	public ICustomizedLabelProvider createCustomizedLabelProvider(
			final ICustomizationManager customizationMgr) {
		return new DecoratingCustomizedLabelProvider(
				customizationMgr);
	}

}
