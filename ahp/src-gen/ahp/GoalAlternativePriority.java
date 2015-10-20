/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Alternative Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.GoalAlternativePriority#getGoal <em>Goal</em>}</li>
 *   <li>{@link ahp.GoalAlternativePriority#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getGoalAlternativePriority()
 * @model
 * @generated
 */
public interface GoalAlternativePriority extends Priority {
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
	 * @see ahp.AHPPackage#getGoalAlternativePriority_Goal()
	 * @model required="true"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link ahp.GoalAlternativePriority#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

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
	 * @see ahp.AHPPackage#getGoalAlternativePriority_Alternative()
	 * @model required="true"
	 * @generated
	 */
	Alternative getAlternative();

	/**
	 * Sets the value of the '{@link ahp.GoalAlternativePriority#getAlternative <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(Alternative value);

} // GoalAlternativePriority
