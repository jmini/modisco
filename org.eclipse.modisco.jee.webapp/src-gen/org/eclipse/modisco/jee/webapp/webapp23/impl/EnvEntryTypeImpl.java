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
package org.eclipse.modisco.jee.webapp.webapp23.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryNameType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryValueType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.EnvEntryTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvEntryTypeImpl extends EObjectImpl implements EnvEntryType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getEnvEntryName() <em>Env Entry Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntryName()
	 * @generated
	 * @ordered
	 */
	protected EnvEntryNameType envEntryName;

	/**
	 * The cached value of the '{@link #getEnvEntryValue() <em>Env Entry Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntryValue()
	 * @generated
	 * @ordered
	 */
	protected EnvEntryValueType envEntryValue;

	/**
	 * The cached value of the '{@link #getEnvEntryType() <em>Env Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntryType()
	 * @generated
	 * @ordered
	 */
	protected EnvEntryTypeType envEntryType;

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
	protected EnvEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.ENV_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryNameType getEnvEntryName() {
		return envEntryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryName(EnvEntryNameType newEnvEntryName, NotificationChain msgs) {
		EnvEntryNameType oldEnvEntryName = envEntryName;
		envEntryName = newEnvEntryName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, oldEnvEntryName, newEnvEntryName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryName(EnvEntryNameType newEnvEntryName) {
		if (newEnvEntryName != envEntryName) {
			NotificationChain msgs = null;
			if (envEntryName != null)
				msgs = ((InternalEObject)envEntryName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, null, msgs);
			if (newEnvEntryName != null)
				msgs = ((InternalEObject)newEnvEntryName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, null, msgs);
			msgs = basicSetEnvEntryName(newEnvEntryName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, newEnvEntryName, newEnvEntryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryValueType getEnvEntryValue() {
		return envEntryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryValue(EnvEntryValueType newEnvEntryValue, NotificationChain msgs) {
		EnvEntryValueType oldEnvEntryValue = envEntryValue;
		envEntryValue = newEnvEntryValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, oldEnvEntryValue, newEnvEntryValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryValue(EnvEntryValueType newEnvEntryValue) {
		if (newEnvEntryValue != envEntryValue) {
			NotificationChain msgs = null;
			if (envEntryValue != null)
				msgs = ((InternalEObject)envEntryValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, null, msgs);
			if (newEnvEntryValue != null)
				msgs = ((InternalEObject)newEnvEntryValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, null, msgs);
			msgs = basicSetEnvEntryValue(newEnvEntryValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, newEnvEntryValue, newEnvEntryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeType getEnvEntryType() {
		return envEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryType(EnvEntryTypeType newEnvEntryType, NotificationChain msgs) {
		EnvEntryTypeType oldEnvEntryType = envEntryType;
		envEntryType = newEnvEntryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, oldEnvEntryType, newEnvEntryType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryType(EnvEntryTypeType newEnvEntryType) {
		if (newEnvEntryType != envEntryType) {
			NotificationChain msgs = null;
			if (envEntryType != null)
				msgs = ((InternalEObject)envEntryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, null, msgs);
			if (newEnvEntryType != null)
				msgs = ((InternalEObject)newEnvEntryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, null, msgs);
			msgs = basicSetEnvEntryType(newEnvEntryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, newEnvEntryType, newEnvEntryType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ENV_ENTRY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				return basicSetEnvEntryName(null, msgs);
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				return basicSetEnvEntryValue(null, msgs);
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				return basicSetEnvEntryType(null, msgs);
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
			case Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				return getEnvEntryName();
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				return getEnvEntryValue();
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				return getEnvEntryType();
			case Webapp23Package.ENV_ENTRY_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)newValue);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)newValue);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)newValue);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ID:
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
			case Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)null);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)null);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)null);
				return;
			case Webapp23Package.ENV_ENTRY_TYPE__ID:
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
			case Webapp23Package.ENV_ENTRY_TYPE__DESCRIPTION:
				return description != null;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				return envEntryName != null;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				return envEntryValue != null;
			case Webapp23Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				return envEntryType != null;
			case Webapp23Package.ENV_ENTRY_TYPE__ID:
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

} //EnvEntryTypeImpl
