/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.cdo.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.AnonymousClassDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.AnonymousClassDeclarationImpl#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnonymousClassDeclarationImpl extends ASTNodeImpl implements AnonymousClassDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getAnonymousClassDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> getBodyDeclarations() {
		return (EList<BodyDeclaration>)eGet(JavaPackage.eINSTANCE.getAnonymousClassDeclaration_BodyDeclarations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInstanceCreation getClassInstanceCreation() {
		return (ClassInstanceCreation)eGet(JavaPackage.eINSTANCE.getAnonymousClassDeclaration_ClassInstanceCreation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassInstanceCreation(ClassInstanceCreation newClassInstanceCreation) {
		eSet(JavaPackage.eINSTANCE.getAnonymousClassDeclaration_ClassInstanceCreation(), newClassInstanceCreation);
	}

} //AnonymousClassDeclarationImpl