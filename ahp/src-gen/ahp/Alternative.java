/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.Alternative#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Named {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ahp.Hierarchy#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' container reference.
	 * @see #setHierarchy(Hierarchy)
	 * @see ahp.AHPPackage#getAlternative_Hierarchy()
	 * @see ahp.Hierarchy#getAlternatives
	 * @model opposite="alternatives" required="true"
	 * @generated
	 */
	Hierarchy getHierarchy();

	/**
	 * Sets the value of the '{@link ahp.Alternative#getHierarchy <em>Hierarchy</em>}' container reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities = _hierarchy.getPriorities();\n<%java.lang.Iterable%><<%ahp.GoalAlternativePriority%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.GoalAlternativePriority%>>filter(_priorities, <%ahp.GoalAlternativePriority%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.GoalAlternativePriority%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.GoalAlternativePriority%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.GoalAlternativePriority%> p)\n\t{\n\t\tboolean _and = false;\n\t\t<%ahp.Goal%> _goal = p.getGoal();\n\t\t<%ahp.Hierarchy%> _hierarchy = <%this%>.getHierarchy();\n\t\t<%ahp.Goal%> _goal_1 = _hierarchy.getGoal();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_goal, _goal_1);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Alternative%> _alternative = p.getAlternative();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_alternative, <%this%>);\n\t\t\t_and = _equals_1;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.GoalAlternativePriority%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	GoalAlternativePriority getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" criterionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities = _hierarchy.getPriorities();\n<%java.lang.Iterable%><<%ahp.CriterionAlternativePriority%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.CriterionAlternativePriority%>>filter(_priorities, <%ahp.CriterionAlternativePriority%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionAlternativePriority%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionAlternativePriority%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.CriterionAlternativePriority%> p)\n\t{\n\t\tboolean _and = false;\n\t\t<%ahp.Criterion%> _criterion = p.getCriterion();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_criterion, criterion);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Alternative%> _alternative = p.getAlternative();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_alternative, <%this%>);\n\t\t\t_and = _equals_1;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.CriterionAlternativePriority%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	CriterionAlternativePriority getPriority(Criterion criterion);

} // Alternative
