/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 377866 - selection customization
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal.query;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.modisco.facet.query.java.core.IJavaQuery2;
import org.eclipse.modisco.facet.query.java.core.IParameterValueList2;

/**
 * This is the query that returns the default selection for a given source and feature (i.e. row and column in a table).
 * By default, the selection is the {@link EObject} (or list of {@link EObject}s) returned by evaluating the feature on
 * the source.
 */
public class SelectionQuery implements IJavaQuery2<EObject, List<Object>> {

	// @SuppressWarnings("unchecked") : facet manager is not type safe
	@SuppressWarnings("unchecked")
	public List<Object> evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
			throws DerivedTypedElementException {
		if (parameterValues.size() != 1) {
			throw new DerivedTypedElementException("the selection query expects one argument"); //$NON-NLS-1$
		}
		final Object param1 = parameterValues.get(0).getValue();
		if (!(param1 instanceof ETypedElement)) {
			throw new DerivedTypedElementException("the selection query expects an ETypedElement argument"); //$NON-NLS-1$
		}
		final ETypedElement feature = (ETypedElement) param1;

		final List<Object> result;
		try {
			final Object featureResult = facetManager.getOrInvoke(source, feature, null);
			if (feature.isMany()) {
				result = (List<Object>) featureResult;
			} else {
				result = Collections.singletonList(featureResult);
			}
		} catch (FacetManagerException e) {
			throw new DerivedTypedElementException(e);
		}
		return result;
	}
}
