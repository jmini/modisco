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
package org.eclipse.modisco.omg.kdm.build.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.modisco.omg.kdm.build.BuildFactory;
import org.eclipse.modisco.omg.kdm.build.BuildModel;
import org.eclipse.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.modisco.omg.kdm.core.provider.KdmEditPlugin;
import org.eclipse.modisco.omg.kdm.kdm.provider.KDMModelItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.modisco.omg.kdm.build.BuildModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildModelItemProvider extends KDMModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BuildModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BuildModel")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BuildModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BuildModel_type") : //$NON-NLS-1$
			getString("_UI_BuildModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BuildModel.class)) {
			case BuildPackage.BUILD_MODEL__BUILD_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildResource()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createSymbolicLink()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createSupplier()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildElement()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildStep()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD_MODEL__BUILD_ELEMENT,
				 BuildFactory.eINSTANCE.createBuildProduct()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KdmEditPlugin.INSTANCE;
	}

}
