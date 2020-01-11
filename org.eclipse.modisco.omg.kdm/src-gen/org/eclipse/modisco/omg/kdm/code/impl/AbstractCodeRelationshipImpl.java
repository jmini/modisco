/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.code.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.core.impl.KDMRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Code Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCodeRelationshipImpl extends KDMRelationshipImpl implements AbstractCodeRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCodeRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.ABSTRACT_CODE_RELATIONSHIP;
	}

} //AbstractCodeRelationshipImpl