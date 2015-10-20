/**
 */
package ahp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Judgment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.AlternativeJudgment#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getAlternativeJudgment()
 * @model
 * @generated
 */
public interface AlternativeJudgment extends Judgment<Alternative> {
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
	 * @see ahp.AHPPackage#getAlternativeJudgment_Criterion()
	 * @model required="true"
	 * @generated
	 */
	Criterion getCriterion();

	/**
	 * Sets the value of the '{@link ahp.AlternativeJudgment#getCriterion <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(Criterion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ahp.Hierarchy%> _hierarchy = this.getHierarchy();\n<%org.eclipse.emf.common.util.EList%><<%ahp.Judgment%><?>> _judgments = _hierarchy.getJudgments();\n<%java.lang.Iterable%><<%ahp.AlternativeJudgment%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.AlternativeJudgment%>>filter(_judgments, <%ahp.AlternativeJudgment%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.AlternativeJudgment%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.AlternativeJudgment%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.AlternativeJudgment%> j)\n\t{\n\t\tboolean _and = false;\n\t\tboolean _and_1 = false;\n\t\t<%ahp.Criterion%> _criterion = j.getCriterion();\n\t\t<%ahp.Criterion%> _criterion_1 = <%this%>.getCriterion();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_criterion, _criterion_1);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and_1 = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Alternative%> _first = j.getFirst();\n\t\t\t<%ahp.Alternative%> _second = <%this%>.getSecond();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_first, _second);\n\t\t\t_and_1 = _equals_1;\n\t\t}\n\t\tif (!_and_1)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Alternative%> _second_1 = j.getSecond();\n\t\t\t<%ahp.Alternative%> _first_1 = <%this%>.getFirst();\n\t\t\tboolean _equals_2 = <%com.google.common.base.Objects%>.equal(_second_1, _first_1);\n\t\t\t_and = _equals_2;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.AlternativeJudgment%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	AlternativeJudgment getInverseJudgment();

} // AlternativeJudgment
