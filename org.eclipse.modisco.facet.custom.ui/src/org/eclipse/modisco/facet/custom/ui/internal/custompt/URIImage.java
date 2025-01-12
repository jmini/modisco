/**
 *  Copyright (c) 2013, 2019 Soft-Maint.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 * 		David Couvrand (Soft-Maint) - Bug 402725 - Need a query to get an image from an URI
 *  	Nicolas Rault (Soft-Maint) - Bug 402725 - Need a query to get an image from an URI
 */
package org.eclipse.modisco.facet.custom.ui.internal.custompt;

import java.io.InputStream;

import org.eclipse.modisco.facet.custom.metamodel.custompt.IImage;

public class URIImage implements IImage {
	
	private static final long serialVersionUID = 6801140731857137834L;
	private String uri;
	
	public URIImage(final String uri) {
		this.uri = uri;
	}

	public InputStream getInputStream() {
		return null;
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(final String uri) {
		this.uri = uri;
	}

}
