/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.Goal#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Named {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ahp.Hierarchy#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' container reference.
	 * @see #setHierarchy(Hierarchy)
	 * @see ahp.AHPPackage#getGoal_Hierarchy()
	 * @see ahp.Hierarchy#getGoal
	 * @model opposite="goal" required="true"
	 * @generated
	 */
	Hierarchy getHierarchy();

	/**
	 * Sets the value of the '{@link ahp.Goal#getHierarchy <em>Hierarchy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy</em>' container reference.
	 * @see #getHierarchy()
	 * @generated
	 */
	void setHierarchy(Hierarchy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Inconsistency%>> _inconsistencies = _hierarchy.getInconsistencies();\n<%java.lang.Iterable%><<%ahp.GoalInconsistency%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.GoalInconsistency%>>filter(_inconsistencies, <%ahp.GoalInconsistency%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.GoalInconsistency%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.GoalInconsistency%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.GoalInconsistency%> p)\n\t{\n\t\t<%ahp.Goal%> _goal = p.getGoal();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_goal, <%this%>));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.GoalInconsistency%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	GoalInconsistency getInconsistency();

} // Goal
