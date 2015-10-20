/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Alternative;
import ahp.Goal;
import ahp.GoalAlternativePriority;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Alternative Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.GoalAlternativePriorityImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link ahp.impl.GoalAlternativePriorityImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalAlternativePriorityImpl extends PriorityImpl implements GoalAlternativePriority {
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
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected Alternative alternative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalAlternativePriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.GOAL_ALTERNATIVE_PRIORITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.GOAL_ALTERNATIVE_PRIORITY__GOAL, oldGoal, goal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.GOAL_ALTERNATIVE_PRIORITY__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative getAlternative() {
		if (alternative != null && alternative.eIsProxy()) {
			InternalEObject oldAlternative = (InternalEObject)alternative;
			alternative = (Alternative)eResolveProxy(oldAlternative);
			if (alternative != oldAlternative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE, oldAlternative, alternative));
			}
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative basicGetAlternative() {
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternative(Alternative newAlternative) {
		Alternative oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE:
				if (resolve) return getAlternative();
				return basicGetAlternative();
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
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__GOAL:
				setGoal((Goal)newValue);
				return;
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE:
				setAlternative((Alternative)newValue);
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
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__GOAL:
				setGoal((Goal)null);
				return;
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE:
				setAlternative((Alternative)null);
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
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__GOAL:
				return goal != null;
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE:
				return alternative != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalAlternativePriorityImpl
