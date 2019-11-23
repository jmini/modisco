/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
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
package org.eclipse.modisco.omg.kdm.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.code.CodeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.RelationalSchema#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getRelationalSchema()
 * @model
 * @generated
 */
public interface RelationalSchema extends DataContainer {
	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.code.CodeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.data.DataPackage#getRelationalSchema_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CodeItem> getCodeElement();

} // RelationalSchema
