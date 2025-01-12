/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 */
package org.eclipse.modisco.facet.efacet.ui;

import java.util.List;

import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;
import org.eclipse.ui.IWorkbenchPart;


/**
 * This method must be implemented and referenced by the extension point org.eclipse.modisco.facet.efacet.ui.displayeropener
 * 
 * This is a new version of the org.eclipse.modisco.facet.infra.query.ui.views.queryExecution.QueryResultDisplayer.
 * @author Gregoire Dupe
 *
 */
public interface IETypedElementResultDisplayerOpener {
	IWorkbenchPart open(List<ETypedElementResult> results);
}
