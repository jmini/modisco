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
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.modisco.java.PostfixExpressionKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Postfix Expression Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.java.emf.JavaPackage#getPostfixExpressionKind()
 * @model
 * @generated
 */
public enum PostfixExpressionKind implements Enumerator {
	/**
	 * The '<em><b>INCREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INCREMENT(1, "INCREMENT", "++"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DECREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DECREMENT(2, "DECREMENT", "--"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>INCREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCREMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREMENT
	 * @model literal="++"
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENT_VALUE = 1;

	/**
	 * The '<em><b>DECREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECREMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECREMENT
	 * @model literal="--"
	 * @generated
	 * @ordered
	 */
	public static final int DECREMENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Postfix Expression Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PostfixExpressionKind[] VALUES_ARRAY =
		new PostfixExpressionKind[] {
			INCREMENT,
			DECREMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Postfix Expression Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PostfixExpressionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Postfix Expression Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostfixExpressionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostfixExpressionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postfix Expression Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostfixExpressionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostfixExpressionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postfix Expression Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostfixExpressionKind get(int value) {
		switch (value) {
			case INCREMENT_VALUE: return INCREMENT;
			case DECREMENT_VALUE: return DECREMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PostfixExpressionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PostfixExpressionKind
