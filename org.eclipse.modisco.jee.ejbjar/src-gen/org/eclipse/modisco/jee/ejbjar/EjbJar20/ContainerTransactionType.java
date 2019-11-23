/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getContainerTransactionType()
 * @model extendedMetaData="name='container-transaction_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainerTransactionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getContainerTransactionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getContainerTransactionType_Method()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodType> getMethod();

	/**
	 * Returns the value of the '<em><b>Trans Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Attribute</em>' containment reference.
	 * @see #setTransAttribute(TransAttributeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getContainerTransactionType_TransAttribute()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trans-attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	TransAttributeType getTransAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Attribute</em>' containment reference.
	 * @see #getTransAttribute()
	 * @generated
	 */
	void setTransAttribute(TransAttributeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getContainerTransactionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ContainerTransactionType
