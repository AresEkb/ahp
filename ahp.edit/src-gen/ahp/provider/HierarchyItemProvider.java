/**
 */
package ahp.provider;


import ahp.AHPFactory;
import ahp.AHPPackage;
import ahp.Hierarchy;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ahp.Hierarchy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchyItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AHPPackage.Literals.HIERARCHY__GOAL);
			childrenFeatures.add(AHPPackage.Literals.HIERARCHY__CRITERIA);
			childrenFeatures.add(AHPPackage.Literals.HIERARCHY__ALTERNATIVES);
			childrenFeatures.add(AHPPackage.Literals.HIERARCHY__JUDGMENTS);
			childrenFeatures.add(AHPPackage.Literals.HIERARCHY__PRIORITIES);
			childrenFeatures.add(AHPPackage.Literals.HIERARCHY__INCONSISTENCIES);
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
	 * This returns Hierarchy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hierarchy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Hierarchy_type");
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

		switch (notification.getFeatureID(Hierarchy.class)) {
			case AHPPackage.HIERARCHY__GOAL:
			case AHPPackage.HIERARCHY__CRITERIA:
			case AHPPackage.HIERARCHY__ALTERNATIVES:
			case AHPPackage.HIERARCHY__JUDGMENTS:
			case AHPPackage.HIERARCHY__PRIORITIES:
			case AHPPackage.HIERARCHY__INCONSISTENCIES:
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
				(AHPPackage.Literals.HIERARCHY__GOAL,
				 AHPFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__CRITERIA,
				 AHPFactory.eINSTANCE.createCriterion()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__ALTERNATIVES,
				 AHPFactory.eINSTANCE.createAlternative()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__JUDGMENTS,
				 AHPFactory.eINSTANCE.createCriterionJudgment()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__JUDGMENTS,
				 AHPFactory.eINSTANCE.createAlternativeJudgment()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__PRIORITIES,
				 AHPFactory.eINSTANCE.createGoalCriterionPriority()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__PRIORITIES,
				 AHPFactory.eINSTANCE.createCriterionAlternativePriority()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__PRIORITIES,
				 AHPFactory.eINSTANCE.createGoalAlternativePriority()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__INCONSISTENCIES,
				 AHPFactory.eINSTANCE.createGoalInconsistency()));

		newChildDescriptors.add
			(createChildParameter
				(AHPPackage.Literals.HIERARCHY__INCONSISTENCIES,
				 AHPFactory.eINSTANCE.createCriterionInconsistency()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AHPEditPlugin.INSTANCE;
	}

}
