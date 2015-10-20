/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion Judgment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.CriterionJudgment#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getCriterionJudgment()
 * @model
 * @generated
 */
public interface CriterionJudgment extends Judgment<Criterion> {
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
	 * @see ahp.AHPPackage#getCriterionJudgment_Goal()
	 * @model required="true"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link ahp.CriterionJudgment#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Judgment%><?>> _judgments = _hierarchy.getJudgments();\n<%java.lang.Iterable%><<%ahp.CriterionJudgment%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.CriterionJudgment%>>filter(_judgments, <%ahp.CriterionJudgment%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionJudgment%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionJudgment%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.CriterionJudgment%> j)\n\t{\n\t\tboolean _and = false;\n\t\tboolean _and_1 = false;\n\t\t<%ahp.Goal%> _goal = j.getGoal();\n\t\t<%ahp.Goal%> _goal_1 = <%this%>.getGoal();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_goal, _goal_1);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and_1 = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Criterion%> _first = j.getFirst();\n\t\t\t<%ahp.Criterion%> _second = <%this%>.getSecond();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_first, _second);\n\t\t\t_and_1 = _equals_1;\n\t\t}\n\t\tif (!_and_1)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Criterion%> _second_1 = j.getSecond();\n\t\t\t<%ahp.Criterion%> _first_1 = <%this%>.getFirst();\n\t\t\tboolean _equals_2 = <%com.google.common.base.Objects%>.equal(_second_1, _first_1);\n\t\t\t_and = _equals_2;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.CriterionJudgment%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	CriterionJudgment getInverseJudgment();

} // CriterionJudgment
