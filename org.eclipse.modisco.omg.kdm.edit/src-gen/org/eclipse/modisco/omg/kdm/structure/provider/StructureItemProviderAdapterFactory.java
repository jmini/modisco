/**
 * Copyright (c) 2009, 2019 Hatha Systems, and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 */
package org.eclipse.modisco.omg.kdm.structure.provider;

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
import org.eclipse.modisco.omg.kdm.structure.util.StructureAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureItemProviderAdapterFactory extends StructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public StructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.Subsystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemItemProvider subsystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubsystemAdapter() {
		if (subsystemItemProvider == null) {
			subsystemItemProvider = new SubsystemItemProvider(this);
		}

		return subsystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.Layer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerItemProvider layerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerAdapter() {
		if (layerItemProvider == null) {
			layerItemProvider = new LayerItemProvider(this);
		}

		return layerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.StructureModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureModelItemProvider structureModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.StructureModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureModelAdapter() {
		if (structureModelItemProvider == null) {
			structureModelItemProvider = new StructureModelItemProvider(this);
		}

		return structureModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.SoftwareSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSystemItemProvider softwareSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.SoftwareSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareSystemAdapter() {
		if (softwareSystemItemProvider == null) {
			softwareSystemItemProvider = new SoftwareSystemItemProvider(this);
		}

		return softwareSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.StructureRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureRelationshipItemProvider structureRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.StructureRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureRelationshipAdapter() {
		if (structureRelationshipItemProvider == null) {
			structureRelationshipItemProvider = new StructureRelationshipItemProvider(this);
		}

		return structureRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.ArchitectureView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureViewItemProvider architectureViewItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.ArchitectureView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchitectureViewAdapter() {
		if (architectureViewItemProvider == null) {
			architectureViewItemProvider = new ArchitectureViewItemProvider(this);
		}

		return architectureViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.structure.StructureElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureElementItemProvider structureElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.structure.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructureElementAdapter() {
		if (structureElementItemProvider == null) {
			structureElementItemProvider = new StructureElementItemProvider(this);
		}

		return structureElementItemProvider;
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
		if (subsystemItemProvider != null) subsystemItemProvider.dispose();
		if (layerItemProvider != null) layerItemProvider.dispose();
		if (structureModelItemProvider != null) structureModelItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (softwareSystemItemProvider != null) softwareSystemItemProvider.dispose();
		if (structureRelationshipItemProvider != null) structureRelationshipItemProvider.dispose();
		if (architectureViewItemProvider != null) architectureViewItemProvider.dispose();
		if (structureElementItemProvider != null) structureElementItemProvider.dispose();
	}

}
