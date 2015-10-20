/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion Alternative Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.CriterionAlternativePriority#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link ahp.CriterionAlternativePriority#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getCriterionAlternativePriority()
 * @model
 * @generated
 */
public interface CriterionAlternativePriority extends Priority {
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
	 * @see ahp.AHPPackage#getCriterionAlternativePriority_Criterion()
	 * @model required="true"
	 * @generated
	 */
	Criterion getCriterion();

	/**
	 * Sets the value of the '{@link ahp.CriterionAlternativePriority#getCriterion <em>Criterion</em>}' reference.
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
	 * @see ahp.AHPPackage#getCriterionAlternativePriority_Alternative()
	 * @model required="true"
	 * @generated
	 */
	Alternative getAlternative();

	/**
	 * Sets the value of the '{@link ahp.CriterionAlternativePriority#getAlternative <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(Alternative value);

} // CriterionAlternativePriority
