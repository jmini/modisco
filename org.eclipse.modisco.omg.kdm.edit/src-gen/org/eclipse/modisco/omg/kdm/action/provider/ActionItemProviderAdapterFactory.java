/**
 * Copyright (c) 2009 Hatha Systems, and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 */
package org.eclipse.modisco.omg.kdm.action.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.modisco.omg.kdm.action.util.ActionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionItemProviderAdapterFactory extends ActionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.ActionElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionElementItemProvider actionElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.ActionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionElementAdapter() {
		if (actionElementItemProvider == null) {
			actionElementItemProvider = new ActionElementItemProvider(this);
		}

		return actionElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.BlockUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockUnitItemProvider blockUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.BlockUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockUnitAdapter() {
		if (blockUnitItemProvider == null) {
			blockUnitItemProvider = new BlockUnitItemProvider(this);
		}

		return blockUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.ControlFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowItemProvider controlFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowAdapter() {
		if (controlFlowItemProvider == null) {
			controlFlowItemProvider = new ControlFlowItemProvider(this);
		}

		return controlFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.EntryFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryFlowItemProvider entryFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.EntryFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryFlowAdapter() {
		if (entryFlowItemProvider == null) {
			entryFlowItemProvider = new EntryFlowItemProvider(this);
		}

		return entryFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.TrueFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueFlowItemProvider trueFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.TrueFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrueFlowAdapter() {
		if (trueFlowItemProvider == null) {
			trueFlowItemProvider = new TrueFlowItemProvider(this);
		}

		return trueFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.FalseFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FalseFlowItemProvider falseFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.FalseFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFalseFlowAdapter() {
		if (falseFlowItemProvider == null) {
			falseFlowItemProvider = new FalseFlowItemProvider(this);
		}

		return falseFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.GuardedFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardedFlowItemProvider guardedFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.GuardedFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGuardedFlowAdapter() {
		if (guardedFlowItemProvider == null) {
			guardedFlowItemProvider = new GuardedFlowItemProvider(this);
		}

		return guardedFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Calls} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallsItemProvider callsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Calls}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallsAdapter() {
		if (callsItemProvider == null) {
			callsItemProvider = new CallsItemProvider(this);
		}

		return callsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Dispatches} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchesItemProvider dispatchesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Dispatches}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDispatchesAdapter() {
		if (dispatchesItemProvider == null) {
			dispatchesItemProvider = new DispatchesItemProvider(this);
		}

		return dispatchesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Reads} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadsItemProvider readsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Reads}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadsAdapter() {
		if (readsItemProvider == null) {
			readsItemProvider = new ReadsItemProvider(this);
		}

		return readsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Writes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WritesItemProvider writesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Writes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWritesAdapter() {
		if (writesItemProvider == null) {
			writesItemProvider = new WritesItemProvider(this);
		}

		return writesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Addresses} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressesItemProvider addressesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Addresses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressesAdapter() {
		if (addressesItemProvider == null) {
			addressesItemProvider = new AddressesItemProvider(this);
		}

		return addressesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Creates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatesItemProvider createsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Creates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreatesAdapter() {
		if (createsItemProvider == null) {
			createsItemProvider = new CreatesItemProvider(this);
		}

		return createsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.ExceptionUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionUnitItemProvider exceptionUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.ExceptionUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExceptionUnitAdapter() {
		if (exceptionUnitItemProvider == null) {
			exceptionUnitItemProvider = new ExceptionUnitItemProvider(this);
		}

		return exceptionUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.TryUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryUnitItemProvider tryUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.TryUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTryUnitAdapter() {
		if (tryUnitItemProvider == null) {
			tryUnitItemProvider = new TryUnitItemProvider(this);
		}

		return tryUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.CatchUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchUnitItemProvider catchUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.CatchUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCatchUnitAdapter() {
		if (catchUnitItemProvider == null) {
			catchUnitItemProvider = new CatchUnitItemProvider(this);
		}

		return catchUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.FinallyUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinallyUnitItemProvider finallyUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.FinallyUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinallyUnitAdapter() {
		if (finallyUnitItemProvider == null) {
			finallyUnitItemProvider = new FinallyUnitItemProvider(this);
		}

		return finallyUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.ExitFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitFlowItemProvider exitFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.ExitFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitFlowAdapter() {
		if (exitFlowItemProvider == null) {
			exitFlowItemProvider = new ExitFlowItemProvider(this);
		}

		return exitFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.ExceptionFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionFlowItemProvider exceptionFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.ExceptionFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExceptionFlowAdapter() {
		if (exceptionFlowItemProvider == null) {
			exceptionFlowItemProvider = new ExceptionFlowItemProvider(this);
		}

		return exceptionFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.Throws} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowsItemProvider throwsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.Throws}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThrowsAdapter() {
		if (throwsItemProvider == null) {
			throwsItemProvider = new ThrowsItemProvider(this);
		}

		return throwsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.CompliesTo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompliesToItemProvider compliesToItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.CompliesTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompliesToAdapter() {
		if (compliesToItemProvider == null) {
			compliesToItemProvider = new CompliesToItemProvider(this);
		}

		return compliesToItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.UsesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesTypeItemProvider usesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.UsesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsesTypeAdapter() {
		if (usesTypeItemProvider == null) {
			usesTypeItemProvider = new UsesTypeItemProvider(this);
		}

		return usesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.action.ActionRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionRelationshipItemProvider actionRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.action.ActionRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionRelationshipAdapter() {
		if (actionRelationshipItemProvider == null) {
			actionRelationshipItemProvider = new ActionRelationshipItemProvider(this);
		}

		return actionRelationshipItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (actionElementItemProvider != null) actionElementItemProvider.dispose();
		if (blockUnitItemProvider != null) blockUnitItemProvider.dispose();
		if (controlFlowItemProvider != null) controlFlowItemProvider.dispose();
		if (entryFlowItemProvider != null) entryFlowItemProvider.dispose();
		if (flowItemProvider != null) flowItemProvider.dispose();
		if (trueFlowItemProvider != null) trueFlowItemProvider.dispose();
		if (falseFlowItemProvider != null) falseFlowItemProvider.dispose();
		if (guardedFlowItemProvider != null) guardedFlowItemProvider.dispose();
		if (callsItemProvider != null) callsItemProvider.dispose();
		if (dispatchesItemProvider != null) dispatchesItemProvider.dispose();
		if (readsItemProvider != null) readsItemProvider.dispose();
		if (writesItemProvider != null) writesItemProvider.dispose();
		if (addressesItemProvider != null) addressesItemProvider.dispose();
		if (createsItemProvider != null) createsItemProvider.dispose();
		if (exceptionUnitItemProvider != null) exceptionUnitItemProvider.dispose();
		if (tryUnitItemProvider != null) tryUnitItemProvider.dispose();
		if (catchUnitItemProvider != null) catchUnitItemProvider.dispose();
		if (finallyUnitItemProvider != null) finallyUnitItemProvider.dispose();
		if (exitFlowItemProvider != null) exitFlowItemProvider.dispose();
		if (exceptionFlowItemProvider != null) exceptionFlowItemProvider.dispose();
		if (throwsItemProvider != null) throwsItemProvider.dispose();
		if (compliesToItemProvider != null) compliesToItemProvider.dispose();
		if (usesTypeItemProvider != null) usesTypeItemProvider.dispose();
		if (actionRelationshipItemProvider != null) actionRelationshipItemProvider.dispose();
	}

}
