/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.facet.core.exception;

/**
 * @author Gregoire DUPE (Mia-Software) {@inheritDoc}
 */
public class StructuralConstraintViolationException extends ModiscoFacetException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4130168457242723140L;

	/**
	 * 
	 */
	public StructuralConstraintViolationException() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public StructuralConstraintViolationException(final String message) {
		super(message);
	}

	/**
	 * {@inheritDoc}
	 */
	public StructuralConstraintViolationException(final Throwable cause) {
		super(cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public StructuralConstraintViolationException(final String message, final Throwable cause) {
		super(message, cause);
	}

}