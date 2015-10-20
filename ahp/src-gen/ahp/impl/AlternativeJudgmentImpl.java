/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Alternative;
import ahp.AlternativeJudgment;
import ahp.Criterion;
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
 * An implementation of the model object '<em><b>Alternative Judgment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.AlternativeJudgmentImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeJudgmentImpl extends JudgmentImpl<Alternative> implements AlternativeJudgment {
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
	protected AlternativeJudgmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.ALTERNATIVE_JUDGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setFirst(Alternative newFirst) {
		super.setFirst(newFirst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSecond(Alternative newSecond) {
		super.setSecond(newSecond);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.ALTERNATIVE_JUDGMENT__CRITERION, oldCriterion, criterion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.ALTERNATIVE_JUDGMENT__CRITERION, oldCriterion, criterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeJudgment getInverseJudgment() {
		Hierarchy _hierarchy = this.getHierarchy();
		EList<Judgment<?>> _judgments = _hierarchy.getJudgments();
		Iterable<AlternativeJudgment> _filter = Iterables.<AlternativeJudgment>filter(_judgments, AlternativeJudgment.class);
		final Function1<AlternativeJudgment, Boolean> _function = new Function1<AlternativeJudgment, Boolean>() {
			public Boolean apply(final AlternativeJudgment j) {
				boolean _and = false;
				boolean _and_1 = false;
				Criterion _criterion = j.getCriterion();
				Criterion _criterion_1 = AlternativeJudgmentImpl.this.getCriterion();
				boolean _equals = Objects.equal(_criterion, _criterion_1);
				if (!_equals) {
					_and_1 = false;
				} else {
					Alternative _first = j.getFirst();
					Alternative _second = AlternativeJudgmentImpl.this.getSecond();
					boolean _equals_1 = Objects.equal(_first, _second);
					_and_1 = _equals_1;
				}
				if (!_and_1) {
					_and = false;
				} else {
					Alternative _second_1 = j.getSecond();
					Alternative _first_1 = AlternativeJudgmentImpl.this.getFirst();
					boolean _equals_2 = Objects.equal(_second_1, _first_1);
					_and = _equals_2;
				}
				return Boolean.valueOf(_and);
			}
		};
		return IterableExtensions.<AlternativeJudgment>findFirst(_filter, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.ALTERNATIVE_JUDGMENT__CRITERION:
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
			case AHPPackage.ALTERNATIVE_JUDGMENT__CRITERION:
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
			case AHPPackage.ALTERNATIVE_JUDGMENT__CRITERION:
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
			case AHPPackage.ALTERNATIVE_JUDGMENT__CRITERION:
				return criterion != null;
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
			case AHPPackage.ALTERNATIVE_JUDGMENT___GET_INVERSE_JUDGMENT:
				return getInverseJudgment();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AlternativeJudgmentImpl
