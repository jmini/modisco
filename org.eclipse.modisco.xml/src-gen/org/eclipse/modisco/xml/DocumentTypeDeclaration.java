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
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.xml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.xml.DocumentTypeDeclaration#getPublicID <em>Public ID</em>}</li>
 *   <li>{@link org.eclipse.modisco.xml.DocumentTypeDeclaration#getSystemID <em>System ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.xml.emf.MoDiscoXMLPackage#getDocumentTypeDeclaration()
 * @model
 * @generated
 */
public interface DocumentTypeDeclaration extends Node {
	/**
	 * Returns the value of the '<em><b>Public ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public ID</em>' attribute.
	 * @see #setPublicID(String)
	 * @see org.eclipse.modisco.xml.emf.MoDiscoXMLPackage#getDocumentTypeDeclaration_PublicID()
	 * @model
	 * @generated
	 */
	String getPublicID();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.xml.DocumentTypeDeclaration#getPublicID <em>Public ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public ID</em>' attribute.
	 * @see #getPublicID()
	 * @generated
	 */
	void setPublicID(String value);

	/**
	 * Returns the value of the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System ID</em>' attribute.
	 * @see #setSystemID(String)
	 * @see org.eclipse.modisco.xml.emf.MoDiscoXMLPackage#getDocumentTypeDeclaration_SystemID()
	 * @model
	 * @generated
	 */
	String getSystemID();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.xml.DocumentTypeDeclaration#getSystemID <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System ID</em>' attribute.
	 * @see #getSystemID()
	 * @generated
	 */
	void setSystemID(String value);

} // DocumentTypeDeclaration
