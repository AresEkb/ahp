/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Criterion;
import ahp.CriterionInconsistency;
import ahp.Goal;
import ahp.GoalCriterionPriority;
import ahp.Hierarchy;
import ahp.Inconsistency;
import ahp.Priority;

import com.google.common.base.Objects;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.CriterionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ahp.impl.CriterionImpl#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriterionImpl extends MinimalEObjectImpl.Container implements Criterion {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.CRITERION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hierarchy getHierarchy() {
		if (eContainerFeatureID() != AHPPackage.CRITERION__HIERARCHY) return null;
		return (Hierarchy)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hierarchy basicGetHierarchy() {
		if (eContainerFeatureID() != AHPPackage.CRITERION__HIERARCHY) return null;
		return (Hierarchy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchy(Hierarchy newHierarchy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHierarchy, AHPPackage.CRITERION__HIERARCHY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchy(Hierarchy newHierarchy) {
		if (newHierarchy != eInternalContainer() || (eContainerFeatureID() != AHPPackage.CRITERION__HIERARCHY && newHierarchy != null)) {
			if (EcoreUtil.isAncestor(this, newHierarchy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHierarchy != null)
				msgs = ((InternalEObject)newHierarchy).eInverseAdd(this, AHPPackage.HIERARCHY__CRITERIA, Hierarchy.class, msgs);
			msgs = basicSetHierarchy(newHierarchy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.CRITERION__HIERARCHY, newHierarchy, newHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalCriterionPriority getPriority() {
		Hierarchy _hierarchy = this.getHierarchy();
		EList<Priority> _priorities = _hierarchy.getPriorities();
		Iterable<GoalCriterionPriority> _filter = Iterables.<GoalCriterionPriority>filter(_priorities, GoalCriterionPriority.class);
		final Function1<GoalCriterionPriority, Boolean> _function = new Function1<GoalCriterionPriority, Boolean>() {
			public Boolean apply(final GoalCriterionPriority p) {
				boolean _and = false;
				Goal _goal = p.getGoal();
				Hierarchy _hierarchy = CriterionImpl.this.getHierarchy();
				Goal _goal_1 = _hierarchy.getGoal();
				boolean _equals = Objects.equal(_goal, _goal_1);
				if (!_equals) {
					_and = false;
				} else {
					Criterion _criterion = p.getCriterion();
					boolean _equals_1 = Objects.equal(_criterion, CriterionImpl.this);
					_and = _equals_1;
				}
				return Boolean.valueOf(_and);
			}
		};
		return IterableExtensions.<GoalCriterionPriority>findFirst(_filter, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionInconsistency getInconsistency() {
		Hierarchy _hierarchy = this.getHierarchy();
		EList<Inconsistency> _inconsistencies = _hierarchy.getInconsistencies();
		Iterable<CriterionInconsistency> _filter = Iterables.<CriterionInconsistency>filter(_inconsistencies, CriterionInconsistency.class);
		final Function1<CriterionInconsistency, Boolean> _function = new Function1<CriterionInconsistency, Boolean>() {
			public Boolean apply(final CriterionInconsistency p) {
				Criterion _criterion = p.getCriterion();
				return Boolean.valueOf(Objects.equal(_criterion, CriterionImpl.this));
			}
		};
		return IterableExtensions.<CriterionInconsistency>findFirst(_filter, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AHPPackage.CRITERION__HIERARCHY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHierarchy((Hierarchy)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AHPPackage.CRITERION__HIERARCHY:
				return basicSetHierarchy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AHPPackage.CRITERION__HIERARCHY:
				return eInternalContainer().eInverseRemove(this, AHPPackage.HIERARCHY__CRITERIA, Hierarchy.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.CRITERION__NAME:
				return getName();
			case AHPPackage.CRITERION__HIERARCHY:
				if (resolve) return getHierarchy();
				return basicGetHierarchy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AHPPackage.CRITERION__NAME:
				setName((String)newValue);
				return;
			case AHPPackage.CRITERION__HIERARCHY:
				setHierarchy((Hierarchy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AHPPackage.CRITERION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AHPPackage.CRITERION__HIERARCHY:
				setHierarchy((Hierarchy)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AHPPackage.CRITERION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AHPPackage.CRITERION__HIERARCHY:
				return basicGetHierarchy() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AHPPackage.CRITERION___GET_PRIORITY:
				return getPriority();
			case AHPPackage.CRITERION___GET_INCONSISTENCY:
				return getInconsistency();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CriterionImpl
