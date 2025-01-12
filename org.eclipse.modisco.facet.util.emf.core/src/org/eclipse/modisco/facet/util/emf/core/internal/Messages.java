/*******************************************************************************
 * Copyright (c) 2017, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 516701 - Command factory to add content to resource
 *******************************************************************************/

package org.eclipse.modisco.facet.util.emf.core.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.facet.util.emf.core.internal.messages"; //$NON-NLS-1$
	public static String AddResourceContentCommand_Description;
	public static String AddResourceContentCommand_Label;
	public static String SetResourceContentCommand_Description;
	public static String SetResourceContentCommand_Label;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
