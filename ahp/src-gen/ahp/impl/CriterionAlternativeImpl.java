/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Alternative;
import ahp.Criterion;
import ahp.CriterionAlternative;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.CriterionAlternativeImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link ahp.impl.CriterionAlternativeImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriterionAlternativeImpl extends MinimalEObjectImpl.Container implements CriterionAlternative {
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
	protected CriterionAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.CRITERION_ALTERNATIVE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.CRITERION_ALTERNATIVE__CRITERION, oldCriterion, criterion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.CRITERION_ALTERNATIVE__CRITERION, oldCriterion, criterion));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.CRITERION_ALTERNATIVE__ALTERNATIVE, oldAlternative, alternative));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.CRITERION_ALTERNATIVE__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.CRITERION_ALTERNATIVE__CRITERION:
				if (resolve) return getCriterion();
				return basicGetCriterion();
			case AHPPackage.CRITERION_ALTERNATIVE__ALTERNATIVE:
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
			case AHPPackage.CRITERION_ALTERNATIVE__CRITERION:
				setCriterion((Criterion)newValue);
				return;
			case AHPPackage.CRITERION_ALTERNATIVE__ALTERNATIVE:
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
			case AHPPackage.CRITERION_ALTERNATIVE__CRITERION:
				setCriterion((Criterion)null);
				return;
			case AHPPackage.CRITERION_ALTERNATIVE__ALTERNATIVE:
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
			case AHPPackage.CRITERION_ALTERNATIVE__CRITERION:
				return criterion != null;
			case AHPPackage.CRITERION_ALTERNATIVE__ALTERNATIVE:
				return alternative != null;
		}
		return super.eIsSet(featureID);
	}

} //CriterionAlternativeImpl
