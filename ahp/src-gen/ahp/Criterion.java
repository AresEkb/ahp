/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.Criterion#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getCriterion()
 * @model
 * @generated
 */
public interface Criterion extends Named {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ahp.Hierarchy#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' container reference.
	 * @see #setHierarchy(Hierarchy)
	 * @see ahp.AHPPackage#getCriterion_Hierarchy()
	 * @see ahp.Hierarchy#getCriteria
	 * @model opposite="criteria" required="true"
	 * @generated
	 */
	Hierarchy getHierarchy();

	/**
	 * Sets the value of the '{@link ahp.Criterion#getHierarchy <em>Hierarchy</em>}' container reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities = _hierarchy.getPriorities();\n<%java.lang.Iterable%><<%ahp.GoalCriterionPriority%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.GoalCriterionPriority%>>filter(_priorities, <%ahp.GoalCriterionPriority%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.GoalCriterionPriority%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.GoalCriterionPriority%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.GoalCriterionPriority%> p)\n\t{\n\t\tboolean _and = false;\n\t\t<%ahp.Goal%> _goal = p.getGoal();\n\t\t<%ahp.Hierarchy%> _hierarchy = <%this%>.getHierarchy();\n\t\t<%ahp.Goal%> _goal_1 = _hierarchy.getGoal();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_goal, _goal_1);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Criterion%> _criterion = p.getCriterion();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_criterion, <%this%>);\n\t\t\t_and = _equals_1;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.GoalCriterionPriority%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	GoalCriterionPriority getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Inconsistency%>> _inconsistencies = _hierarchy.getInconsistencies();\n<%java.lang.Iterable%><<%ahp.CriterionInconsistency%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.CriterionInconsistency%>>filter(_inconsistencies, <%ahp.CriterionInconsistency%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionInconsistency%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionInconsistency%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.CriterionInconsistency%> p)\n\t{\n\t\t<%ahp.Criterion%> _criterion = p.getCriterion();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_criterion, <%this%>));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.CriterionInconsistency%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	CriterionInconsistency getInconsistency();

} // Criterion
