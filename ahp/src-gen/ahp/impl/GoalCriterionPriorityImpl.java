/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Criterion;
import ahp.Goal;
import ahp.GoalCriterionPriority;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Criterion Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.GoalCriterionPriorityImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link ahp.impl.GoalCriterionPriorityImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalCriterionPriorityImpl extends PriorityImpl implements GoalCriterionPriority {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal;

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected Criterion criterion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalCriterionPriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.GOAL_CRITERION_PRIORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject)goal;
			goal = (Goal)eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.GOAL_CRITERION_PRIORITY__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		Goal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.GOAL_CRITERION_PRIORITY__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criterion getCriterion() {
		if (criterion != null && criterion.eIsProxy()) {
			InternalEObject oldCriterion = (InternalEObject)criterion;
			criterion = (Criterion)eResolveProxy(oldCriterion);
			if (criterion != oldCriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.GOAL_CRITERION_PRIORITY__CRITERION, oldCriterion, criterion));
			}
		}
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criterion basicGetCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(Criterion newCriterion) {
		Criterion oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.GOAL_CRITERION_PRIORITY__CRITERION, oldCriterion, criterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.GOAL_CRITERION_PRIORITY__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
			case AHPPackage.GOAL_CRITERION_PRIORITY__CRITERION:
				if (resolve) return getCriterion();
				return basicGetCriterion();
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
			case AHPPackage.GOAL_CRITERION_PRIORITY__GOAL:
				setGoal((Goal)newValue);
				return;
			case AHPPackage.GOAL_CRITERION_PRIORITY__CRITERION:
				setCriterion((Criterion)newValue);
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
			case AHPPackage.GOAL_CRITERION_PRIORITY__GOAL:
				setGoal((Goal)null);
				return;
			case AHPPackage.GOAL_CRITERION_PRIORITY__CRITERION:
				setCriterion((Criterion)null);
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
			case AHPPackage.GOAL_CRITERION_PRIORITY__GOAL:
				return goal != null;
			case AHPPackage.GOAL_CRITERION_PRIORITY__CRITERION:
				return criterion != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalCriterionPriorityImpl
