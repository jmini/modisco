/**
 *  Copyright (c) 2011, 2020 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *     Grégoire Dupé (Mia-Software) - Design
 *     Nicolas Guyomar (Mia-Software) - Implementation
 *     Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non-derived facet structural features and save their values.
 *     Nicolas Bros (Mia-Software) - Bug 370110 - Rename efacetcatalog2.ecore
 *     Grégoire Dupé (Mia-Software) - Bug 361817 - [Restructuring] Dynamic load to the facet catalog
 *     Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacetcatalog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacetcatalog.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@Deprecated
public class EfacetcatalogFactoryImpl extends EFactoryImpl implements EfacetcatalogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EfacetcatalogFactory init() {
		try {
			EfacetcatalogFactory theEfacetcatalogFactory = (EfacetcatalogFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/facet/efacet/0.2.incubation/efacetcatalog"); //$NON-NLS-1$ 
			if (theEfacetcatalogFactory != null) {
				return theEfacetcatalogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EfacetcatalogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EfacetcatalogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EfacetcatalogPackage.FACET_SET_CATALOG: return createFacetSetCatalog();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetSetCatalog createFacetSetCatalog() {
		FacetSetCatalogImpl facetSetCatalog = new FacetSetCatalogImpl();
		return facetSetCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EfacetcatalogPackage getEfacetcatalogPackage() {
		return (EfacetcatalogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EfacetcatalogPackage getPackage() {
		return EfacetcatalogPackage.eINSTANCE;
	}

} //EfacetcatalogFactoryImpl
