/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.platform.DeployedResource;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.platform.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.DeployedResourceImpl#getPlatformElement <em>Platform Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployedResourceImpl extends AbstractPlatformElementImpl implements DeployedResource {
	/**
	 * The cached value of the '{@link #getPlatformElement() <em>Platform Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> platformElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DEPLOYED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getPlatformElement() {
		if (platformElement == null) {
			platformElement = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, PlatformPackage.DEPLOYED_RESOURCE__PLATFORM_ELEMENT);
		}
		return platformElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_RESOURCE__PLATFORM_ELEMENT:
				return ((InternalEList<?>)getPlatformElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_RESOURCE__PLATFORM_ELEMENT:
				return getPlatformElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_RESOURCE__PLATFORM_ELEMENT:
				getPlatformElement().clear();
				getPlatformElement().addAll((Collection<? extends ResourceType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_RESOURCE__PLATFORM_ELEMENT:
				getPlatformElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_RESOURCE__PLATFORM_ELEMENT:
				return platformElement != null && !platformElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeployedResourceImpl
