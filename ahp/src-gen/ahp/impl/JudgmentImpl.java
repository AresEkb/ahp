/**
 */
package ahp.impl;

import ahp.AHPPackage;
import ahp.Hierarchy;
import ahp.Judgment;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Judgment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.JudgmentImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link ahp.impl.JudgmentImpl#getFirst <em>First</em>}</li>
 *   <li>{@link ahp.impl.JudgmentImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link ahp.impl.JudgmentImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JudgmentImpl<T> extends MinimalEObjectImpl.Container implements Judgment<T> {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected T first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected T second;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JudgmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.JUDGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hierarchy getHierarchy() {
		if (eContainerFeatureID() != AHPPackage.JUDGMENT__HIERARCHY) return null;
		return (Hierarchy)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hierarchy basicGetHierarchy() {
		if (eContainerFeatureID() != AHPPackage.JUDGMENT__HIERARCHY) return null;
		return (Hierarchy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchy(Hierarchy newHierarchy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHierarchy, AHPPackage.JUDGMENT__HIERARCHY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchy(Hierarchy newHierarchy) {
		if (newHierarchy != eInternalContainer() || (eContainerFeatureID() != AHPPackage.JUDGMENT__HIERARCHY && newHierarchy != null)) {
			if (EcoreUtil.isAncestor(this, newHierarchy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHierarchy != null)
				msgs = ((InternalEObject)newHierarchy).eInverseAdd(this, AHPPackage.HIERARCHY__JUDGMENTS, Hierarchy.class, msgs);
			msgs = basicSetHierarchy(newHierarchy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.JUDGMENT__HIERARCHY, newHierarchy, newHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getFirst() {
		if (first != null && ((EObject)first).eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (T)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.JUDGMENT__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(T newFirst) {
		T oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.JUDGMENT__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getSecond() {
		if (second != null && ((EObject)second).eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject)second;
			second = (T)eResolveProxy(oldSecond);
			if (second != oldSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AHPPackage.JUDGMENT__SECOND, oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(T newSecond) {
		T oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.JUDGMENT__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.JUDGMENT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkOperandsAreDifferent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		boolean _and = false;
		boolean _and_1 = false;
		T _first = this.getFirst();
		boolean _notEquals = (!Objects.equal(_first, null));
		if (!_notEquals) {
			_and_1 = false;
		} else {
			T _first_1 = this.getFirst();
			T _second = this.getSecond();
			boolean _equals = Objects.equal(_first_1, _second);
			_and_1 = _equals;
		}
		if (!_and_1) {
			_and = false;
		} else {
			int _weight = this.getWeight();
			boolean _notEquals_1 = (_weight != 1);
			_and = _notEquals_1;
		}
		if (_and) {
			boolean _notEquals_2 = (!Objects.equal(diagnostics, null));
			if (_notEquals_2) {
				BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(
					Diagnostic.ERROR, 
					"DIAGNOSTIC_SOURCE", 
					0, 
					"First and second must not be equal", 
					null);
				diagnostics.add(_basicDiagnostic);
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkInverseJudgment(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		boolean _and = false;
		Judgment<?> _inverseJudgment = this.getInverseJudgment();
		boolean _notEquals = (!Objects.equal(_inverseJudgment, null));
		if (!_notEquals) {
			_and = false;
		} else {
			Judgment<?> _inverseJudgment_1 = this.getInverseJudgment();
			int _weight = _inverseJudgment_1.getWeight();
			int _weight_1 = this.getWeight();
			int _minus = (-_weight_1);
			boolean _notEquals_1 = (_weight != _minus);
			_and = _notEquals_1;
		}
		if (_and) {
			boolean _notEquals_2 = (!Objects.equal(diagnostics, null));
			if (_notEquals_2) {
				BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(
					Diagnostic.ERROR, 
					"DIAGNOSTIC_SOURCE", 
					0, 
					"Wrong inverse judgment", 
					null);
				diagnostics.add(_basicDiagnostic);
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Judgment<?> getInverseJudgment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AHPPackage.JUDGMENT__HIERARCHY:
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
			case AHPPackage.JUDGMENT__HIERARCHY:
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
			case AHPPackage.JUDGMENT__HIERARCHY:
				return eInternalContainer().eInverseRemove(this, AHPPackage.HIERARCHY__JUDGMENTS, Hierarchy.class, msgs);
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
			case AHPPackage.JUDGMENT__HIERARCHY:
				if (resolve) return getHierarchy();
				return basicGetHierarchy();
			case AHPPackage.JUDGMENT__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case AHPPackage.JUDGMENT__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
			case AHPPackage.JUDGMENT__WEIGHT:
				return getWeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AHPPackage.JUDGMENT__HIERARCHY:
				setHierarchy((Hierarchy)newValue);
				return;
			case AHPPackage.JUDGMENT__FIRST:
				setFirst((T)newValue);
				return;
			case AHPPackage.JUDGMENT__SECOND:
				setSecond((T)newValue);
				return;
			case AHPPackage.JUDGMENT__WEIGHT:
				setWeight((Integer)newValue);
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
			case AHPPackage.JUDGMENT__HIERARCHY:
				setHierarchy((Hierarchy)null);
				return;
			case AHPPackage.JUDGMENT__FIRST:
				setFirst((T)null);
				return;
			case AHPPackage.JUDGMENT__SECOND:
				setSecond((T)null);
				return;
			case AHPPackage.JUDGMENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case AHPPackage.JUDGMENT__HIERARCHY:
				return basicGetHierarchy() != null;
			case AHPPackage.JUDGMENT__FIRST:
				return first != null;
			case AHPPackage.JUDGMENT__SECOND:
				return second != null;
			case AHPPackage.JUDGMENT__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AHPPackage.JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP:
				return checkOperandsAreDifferent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AHPPackage.JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP:
				return checkInverseJudgment((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AHPPackage.JUDGMENT___GET_INVERSE_JUDGMENT:
				return getInverseJudgment();
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //JudgmentImpl
