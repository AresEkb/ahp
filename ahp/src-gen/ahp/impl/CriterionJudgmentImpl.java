/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Criterion;
import ahp.CriterionJudgment;
import ahp.Goal;
import ahp.Hierarchy;
import ahp.Judgment;

import com.google.common.base.Objects;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion Judgment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.CriterionJudgmentImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriterionJudgmentImpl extends JudgmentImpl<Criterion> implements CriterionJudgment {
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
	protected CriterionJudgmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.CRITERION_JUDGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setFirst(Criterion newFirst) {
		super.setFirst(newFirst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSecond(Criterion newSecond) {
		super.setSecond(newSecond);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.CRITERION_JUDGMENT__GOAL, oldGoal, goal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.CRITERION_JUDGMENT__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionJudgment getInverseJudgment() {
		Hierarchy _hierarchy = this.getHierarchy();
		EList<Judgment<?>> _judgments = _hierarchy.getJudgments();
		Iterable<CriterionJudgment> _filter = Iterables.<CriterionJudgment>filter(_judgments, CriterionJudgment.class);
		final Function1<CriterionJudgment, Boolean> _function = new Function1<CriterionJudgment, Boolean>() {
			public Boolean apply(final CriterionJudgment j) {
				boolean _and = false;
				boolean _and_1 = false;
				Goal _goal = j.getGoal();
				Goal _goal_1 = CriterionJudgmentImpl.this.getGoal();
				boolean _equals = Objects.equal(_goal, _goal_1);
				if (!_equals) {
					_and_1 = false;
				} else {
					Criterion _first = j.getFirst();
					Criterion _second = CriterionJudgmentImpl.this.getSecond();
					boolean _equals_1 = Objects.equal(_first, _second);
					_and_1 = _equals_1;
				}
				if (!_and_1) {
					_and = false;
				} else {
					Criterion _second_1 = j.getSecond();
					Criterion _first_1 = CriterionJudgmentImpl.this.getFirst();
					boolean _equals_2 = Objects.equal(_second_1, _first_1);
					_and = _equals_2;
				}
				return Boolean.valueOf(_and);
			}
		};
		return IterableExtensions.<CriterionJudgment>findFirst(_filter, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.CRITERION_JUDGMENT__GOAL:
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
			case AHPPackage.CRITERION_JUDGMENT__GOAL:
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
			case AHPPackage.CRITERION_JUDGMENT__GOAL:
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
			case AHPPackage.CRITERION_JUDGMENT__GOAL:
				return goal != null;
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
			case AHPPackage.CRITERION_JUDGMENT___GET_INVERSE_JUDGMENT:
				return getInverseJudgment();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CriterionJudgmentImpl
