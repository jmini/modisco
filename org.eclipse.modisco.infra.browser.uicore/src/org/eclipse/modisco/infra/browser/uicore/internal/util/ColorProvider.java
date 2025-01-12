/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore.internal.util;

import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Returns SWT {@link Color}s used in the model browser, and caches them to optimize system
 * resources usage.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class ColorProvider {

	private static ColorProvider instance;

	public static ColorProvider getInstance() {
		if (ColorProvider.instance == null) {
			ColorProvider.instance = new ColorProvider();
		}
		return ColorProvider.instance;
	}

	/** The color used for elements that are empty or not used */
	private final Color gray;
	/** The color used for elements that are not part of the first resource */
	private final Color externalResourceColor;
	/** The color used for elements that are not in any resource */
	private final Color nullResourceColor;

	private ColorProvider() {
		final Display display = Display.getCurrent();

		final RGB rgbGray = new RGB(128, 128, 128);
		this.gray = new Color(display, rgbGray);

		final RGB rgbBlue = new RGB(0, 0, 255);
		this.externalResourceColor = new Color(display, rgbBlue);

		final RGB rgbDarkRed = new RGB(192, 0, 0);
		this.nullResourceColor = new Color(display, rgbDarkRed);
	}

	public Color getGray() {
		return this.gray;
	}

	public Color getExternalResourceColor() {
		return this.externalResourceColor;
	}

	public Color getNullResourceColor() {
		return this.nullResourceColor;
	}

	public Color getUnresolvedProxyColor() {
		return JFaceColors.getErrorText(Display.getCurrent());
	}
}
