/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *     Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.view;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.modisco.facet.efacet.ui.internal.ImageProvider;
import org.eclipse.modisco.facet.efacet.ui.internal.view.NavigationView.ContextInfo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

@SuppressWarnings("synthetic-access")
//Copied from org.eclipse.modisco.facet.infra.query.ui.views.queryExecution.internal.ContextPaneMenuManager
public class ContextPaneMenuManager extends MenuManager implements IMenuListener {

	private final EditableContext context;
	private final NavigationView queryExecutionView;

	public ContextPaneMenuManager(final NavigationView queryExecutionView,
			final EditableContext context, final TreeViewer treeViewer) {
		this.queryExecutionView = queryExecutionView;
		this.context = context;
		addMenuActions();
		addMenuListener(this);
		addKeyShortcuts(treeViewer);
	}

	private void addKeyShortcuts(final TreeViewer treeViewer) {
		treeViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					ContextPaneMenuManager.this.removeSelectedElementsAction.run();
				}
			}
		});
	}

	private void addMenuActions() {
		this.add(this.removeSelectedElementsAction);
		this.add(this.removeAllAction);
	}

	/** This action removes all model elements from the context */
	private final IAction removeAllAction = new Action("Remove all") {
		{
			setImageDescriptor(ImageProvider.getInstance().getRemoveAllImageDescriptor());
		}

		@Override
		public void run() {
			ContextPaneMenuManager.this.context.clear();
			ContextPaneMenuManager.this.context.done();
		}
	};

	/** This action removes selected model elements from the context */
	private final IAction removeSelectedElementsAction = new Action("Remove") {
		{
			setImageDescriptor(ImageProvider.getInstance().getRemoveImageDescriptor());
		}

		@Override
		public void run() {
			ContextInfo contextInfo = ContextPaneMenuManager.this.queryExecutionView
					.getContextInfo();
			for (EObject eObject : contextInfo.getSelectedEObjects()) {
				ContextPaneMenuManager.this.context.remove(eObject);
			}
			ContextPaneMenuManager.this.context.done();
		}
	};

	public void menuAboutToShow(final IMenuManager manager) {
		ContextInfo contextInfo = ContextPaneMenuManager.this.queryExecutionView.getContextInfo();
		this.removeAllAction.setEnabled(contextInfo.getEObjects().size() > 0);
		this.removeSelectedElementsAction.setEnabled(contextInfo.getSelectedEObjects().size() > 0);
	}
}