/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.common.core.internal.messages"; //$NON-NLS-1$
	public static String StringUtils_ellipsis;

	public static String AbstractMoDiscoCatalog_brokenRef;
	public static String AbstractMoDiscoCatalog_nameConflict;
	public static String AbstractMoDiscoCatalog_oneRootOnly;
	public static String AbstractMoDiscoCatalog_waitingCatalogJobName;
	public static String AbstractMoDiscoCatalog_wrontKindOfRoot;
	public static String AbstractRegistry_colon;
	public static String AbstractRegistry_id;
	public static String AbstractRegistry_pluginExtension;
	public static String AbstractRegistry_requiredAttributeNotDefined;
	public static String AbstractRegistry_unknownExtensionTag;
	public static String CatalogJob_catalogNotificationsJobName;
	public static String EcoreCatalog_uriConflict;
	public static String NotificationJob_notificationJobName;
	public static String ProjectUtils_0;
	public static String ProjectUtils_1;
	public static String ProjectUtils_2;

	public static String ValidationJob_creatingValidationMarkersJobName;
	public static String ValidationJob_validationJobName;

	public static String ValidationUtils_shouldBeInBin;
	public static String ValidationUtils_shouldBeRegistered;

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
