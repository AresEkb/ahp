/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Goal;
import ahp.GoalInconsistency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Inconsistency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.GoalInconsistencyImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalInconsistencyImpl extends InconsistencyImpl implements GoalInconsistency {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalInconsistencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.GOAL_INCONSISTENCY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.GOAL_INCONSISTENCY__GOAL, oldGoal, goal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.GOAL_INCONSISTENCY__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.GOAL_INCONSISTENCY__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
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
			case AHPPackage.GOAL_INCONSISTENCY__GOAL:
				setGoal((Goal)newValue);
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
			case AHPPackage.GOAL_INCONSISTENCY__GOAL:
				setGoal((Goal)null);
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
			case AHPPackage.GOAL_INCONSISTENCY__GOAL:
				return goal != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalInconsistencyImpl
