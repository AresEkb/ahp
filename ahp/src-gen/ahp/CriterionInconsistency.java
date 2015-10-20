/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion Inconsistency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.CriterionInconsistency#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getCriterionInconsistency()
 * @model
 * @generated
 */
public interface CriterionInconsistency extends Inconsistency {
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
	 * @see ahp.AHPPackage#getCriterionInconsistency_Criterion()
	 * @model required="true"
	 * @generated
	 */
	Criterion getCriterion();

	/**
	 * Sets the value of the '{@link ahp.CriterionInconsistency#getCriterion <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(Criterion value);

} // CriterionInconsistency
