/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *******************************************************************************/
package parameterizedtypeinmethoddecl;

import java.util.HashMap;

public class Class1 {
	public <R, P> R accept(HashMap<R, P> v, P p)
	{
		return v.keySet().iterator().next();
	}
}
