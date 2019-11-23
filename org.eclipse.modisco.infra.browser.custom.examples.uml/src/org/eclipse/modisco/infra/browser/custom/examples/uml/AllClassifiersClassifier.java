/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.uml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class AllClassifiersClassifier implements
		IJavaModelQuery<Classifier, List<Classifier>> {

	public List<Classifier> evaluate(final Classifier context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		List<Classifier> allClassifiers = new ArrayList<Classifier>();
		List<Classifier> classifiers = new ArrayList<Classifier>();
		for (Element element : context.getOwnedElements()) {
			if (element instanceof Classifier) {
				Classifier classifier = (Classifier) element;
				classifiers.add(classifier);
			}
		}
		allClassifiers.addAll(classifiers);
		for (Classifier ownedClassifier : classifiers) {
			allClassifiers.addAll(evaluate(ownedClassifier, null));
		}
		return allClassifiers;
	}

}
