/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Inconsistency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.GoalInconsistency#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getGoalInconsistency()
 * @model
 * @generated
 */
public interface GoalInconsistency extends Inconsistency {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see ahp.AHPPackage#getGoalInconsistency_Goal()
	 * @model required="true"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link ahp.GoalInconsistency#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

} // GoalInconsistency
