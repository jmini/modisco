/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar11;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Beans Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEnterpriseBeansType()
 * @model extendedMetaData="name='enterprise-beans_._type' kind='elementOnly'"
 * @generated
 */
public interface EnterpriseBeansType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEnterpriseBeansType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Session</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEnterpriseBeansType_Session()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='session' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<SessionType> getSession();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEnterpriseBeansType_Entity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EntityType> getEntity();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEnterpriseBeansType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EnterpriseBeansType
