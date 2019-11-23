/**
 *  Copyright (c) 2012, 2019 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.modisco.facet.util.emf.core.command;

import org.eclipse.emf.common.command.Command;

/**
 * @since 0.2
 */
public interface ICommandFactoryResult<T> {
	Command getCommand();
	T getResult();
	
}
