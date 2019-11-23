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
package org.eclipse.modisco.omg.kdm.source;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Inventory Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement#getInventoryRelationship <em>Inventory Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#getAbstractInventoryElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInventoryElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Inventory Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.source.AbstractInventoryRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Relationship</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#getAbstractInventoryElement_InventoryRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractInventoryRelationship> getInventoryRelationship();

} // AbstractInventoryElement
