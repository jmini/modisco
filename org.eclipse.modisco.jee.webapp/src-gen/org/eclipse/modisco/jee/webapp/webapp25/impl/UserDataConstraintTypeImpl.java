/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.TransportGuaranteeType;
import org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Data Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.UserDataConstraintTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.UserDataConstraintTypeImpl#getTransportGuarantee <em>Transport Guarantee</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.UserDataConstraintTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDataConstraintTypeImpl extends EObjectImpl implements UserDataConstraintType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getTransportGuarantee() <em>Transport Guarantee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportGuarantee()
	 * @generated
	 * @ordered
	 */
	protected TransportGuaranteeType transportGuarantee;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDataConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.USER_DATA_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp25Package.USER_DATA_CONSTRAINT_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportGuaranteeType getTransportGuarantee() {
		return transportGuarantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportGuarantee(TransportGuaranteeType newTransportGuarantee, NotificationChain msgs) {
		TransportGuaranteeType oldTransportGuarantee = transportGuarantee;
		transportGuarantee = newTransportGuarantee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE, oldTransportGuarantee, newTransportGuarantee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportGuarantee(TransportGuaranteeType newTransportGuarantee) {
		if (newTransportGuarantee != transportGuarantee) {
			NotificationChain msgs = null;
			if (transportGuarantee != null)
				msgs = ((InternalEObject)transportGuarantee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE, null, msgs);
			if (newTransportGuarantee != null)
				msgs = ((InternalEObject)newTransportGuarantee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE, null, msgs);
			msgs = basicSetTransportGuarantee(newTransportGuarantee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE, newTransportGuarantee, newTransportGuarantee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.USER_DATA_CONSTRAINT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE:
				return basicSetTransportGuarantee(null, msgs);
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
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE:
				return getTransportGuarantee();
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__ID:
				return getId();
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
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE:
				setTransportGuarantee((TransportGuaranteeType)newValue);
				return;
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__ID:
				setId((String)newValue);
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
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE:
				setTransportGuarantee((TransportGuaranteeType)null);
				return;
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__TRANSPORT_GUARANTEE:
				return transportGuarantee != null;
			case Webapp25Package.USER_DATA_CONSTRAINT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UserDataConstraintTypeImpl
