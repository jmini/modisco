/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 334615 - Java Query for EMF Facet
 *    Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *    Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 */
package org.eclipse.modisco.facet.query.java.core;

import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.modisco.facet.query.java.core.internal.ParameterValueListFactoryImpl2;

/**
 * @since 0.2
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IParameterValueListFactory2 {
	/** Factory singleton */
	public static final IParameterValueListFactory2 INSTANCE = new ParameterValueListFactoryImpl2();

	/**
	 * This method has to be used to get a new instance of {@link IParameterValueList2}
	 *
	 * @param values
	 *            the list of parameters
	 * @return an {@link IParameterValueList2} instance containing the provided
	 *         parameter values
	 */
	public IParameterValueList2 createParameterValueList(
			final ParameterValue... values);
}
