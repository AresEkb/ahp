/**
 */
package ahp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.CriterionAlternative#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link ahp.CriterionAlternative#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getCriterionAlternative()
 * @model
 * @generated
 */
public interface CriterionAlternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' reference.
	 * @see #setCriterion(Criterion)
	 * @see ahp.AHPPackage#getCriterionAlternative_Criterion()
	 * @model required="true"
	 * @generated
	 */
	Criterion getCriterion();

	/**
	 * Sets the value of the '{@link ahp.CriterionAlternative#getCriterion <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(Criterion value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference.
	 * @see #setAlternative(Alternative)
	 * @see ahp.AHPPackage#getCriterionAlternative_Alternative()
	 * @model required="true"
	 * @generated
	 */
	Alternative getAlternative();

	/**
	 * Sets the value of the '{@link ahp.CriterionAlternative#getAlternative <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(Alternative value);

} // CriterionAlternative
