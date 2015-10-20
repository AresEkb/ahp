/**
 */
package ahp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.Hierarchy#getGoal <em>Goal</em>}</li>
 *   <li>{@link ahp.Hierarchy#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link ahp.Hierarchy#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link ahp.Hierarchy#getJudgments <em>Judgments</em>}</li>
 *   <li>{@link ahp.Hierarchy#getPriorities <em>Priorities</em>}</li>
 *   <li>{@link ahp.Hierarchy#getInconsistencies <em>Inconsistencies</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getHierarchy()
 * @model
 * @generated
 */
public interface Hierarchy extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ahp.Goal#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Goal)
	 * @see ahp.AHPPackage#getHierarchy_Goal()
	 * @see ahp.Goal#getHierarchy
	 * @model opposite="hierarchy" containment="true" required="true"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link ahp.Hierarchy#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link ahp.Criterion}.
	 * It is bidirectional and its opposite is '{@link ahp.Criterion#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see ahp.AHPPackage#getHierarchy_Criteria()
	 * @see ahp.Criterion#getHierarchy
	 * @model opposite="hierarchy" containment="true" required="true"
	 * @generated
	 */
	EList<Criterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link ahp.Alternative}.
	 * It is bidirectional and its opposite is '{@link ahp.Alternative#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see ahp.AHPPackage#getHierarchy_Alternatives()
	 * @see ahp.Alternative#getHierarchy
	 * @model opposite="hierarchy" containment="true" lower="2"
	 * @generated
	 */
	EList<Alternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Judgments</b></em>' containment reference list.
	 * The list contents are of type {@link ahp.Judgment}&lt;?>.
	 * It is bidirectional and its opposite is '{@link ahp.Judgment#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Judgments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Judgments</em>' containment reference list.
	 * @see ahp.AHPPackage#getHierarchy_Judgments()
	 * @see ahp.Judgment#getHierarchy
	 * @model opposite="hierarchy" containment="true"
	 * @generated
	 */
	EList<Judgment<?>> getJudgments();

	/**
	 * Returns the value of the '<em><b>Priorities</b></em>' containment reference list.
	 * The list contents are of type {@link ahp.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorities</em>' containment reference list.
	 * @see ahp.AHPPackage#getHierarchy_Priorities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Priority> getPriorities();

	/**
	 * Returns the value of the '<em><b>Inconsistencies</b></em>' containment reference list.
	 * The list contents are of type {@link ahp.Inconsistency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inconsistencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inconsistencies</em>' containment reference list.
	 * @see ahp.AHPPackage#getHierarchy_Inconsistencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inconsistency> getInconsistencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" goalUnique="false" firstUnique="false" secondUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ahp.Judgment%><?>> _judgments = this.getJudgments();\n<%java.lang.Iterable%><<%ahp.CriterionJudgment%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.CriterionJudgment%>>filter(_judgments, <%ahp.CriterionJudgment%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionJudgment%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionJudgment%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.CriterionJudgment%> j)\n\t{\n\t\tboolean _and = false;\n\t\tboolean _and_1 = false;\n\t\t<%ahp.Goal%> _goal = j.getGoal();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_goal, goal);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and_1 = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Criterion%> _first = j.getFirst();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_first, first);\n\t\t\t_and_1 = _equals_1;\n\t\t}\n\t\tif (!_and_1)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Criterion%> _second = j.getSecond();\n\t\t\tboolean _equals_2 = <%com.google.common.base.Objects%>.equal(_second, second);\n\t\t\t_and = _equals_2;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.CriterionJudgment%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	CriterionJudgment findJudgment(Goal goal, Criterion first, Criterion second);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" criterionUnique="false" firstUnique="false" secondUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ahp.Judgment%><?>> _judgments = this.getJudgments();\n<%java.lang.Iterable%><<%ahp.AlternativeJudgment%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.AlternativeJudgment%>>filter(_judgments, <%ahp.AlternativeJudgment%>.class);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.AlternativeJudgment%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.AlternativeJudgment%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ahp.AlternativeJudgment%> j)\n\t{\n\t\tboolean _and = false;\n\t\tboolean _and_1 = false;\n\t\t<%ahp.Criterion%> _criterion = j.getCriterion();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_criterion, criterion);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and_1 = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Alternative%> _first = j.getFirst();\n\t\t\tboolean _equals_1 = <%com.google.common.base.Objects%>.equal(_first, first);\n\t\t\t_and_1 = _equals_1;\n\t\t}\n\t\tif (!_and_1)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\t<%ahp.Alternative%> _second = j.getSecond();\n\t\t\tboolean _equals_2 = <%com.google.common.base.Objects%>.equal(_second, second);\n\t\t\t_and = _equals_2;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.AlternativeJudgment%>>findFirst(_filter, _function);'"
	 * @generated
	 */
	AlternativeJudgment findJudgment(Criterion criterion, Alternative first, Alternative second);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='try\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities = this.getPriorities();\n\t_priorities.clear();\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Inconsistency%>> _inconsistencies = this.getInconsistencies();\n\t_inconsistencies.clear();\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Criterion%>> _criteria = this.getCriteria();\n\tfinal <%ahp.JudgmentMatrix%><<%ahp.Criterion%>> mat = new <%ahp.JudgmentMatrix%><<%ahp.Criterion%>>(_criteria);\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Judgment%><?>> _judgments = this.getJudgments();\n\t<%java.lang.Iterable%><<%ahp.CriterionJudgment%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.CriterionJudgment%>>filter(_judgments, <%ahp.CriterionJudgment%>.class);\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionJudgment%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.CriterionJudgment%>, <%java.lang.Boolean%>>()\n\t{\n\t\tpublic <%java.lang.Boolean%> apply(final <%ahp.CriterionJudgment%> cj)\n\t\t{\n\t\t\t<%ahp.Goal%> _goal = cj.getGoal();\n\t\t\t<%ahp.Goal%> _goal_1 = <%this%>.getGoal();\n\t\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_goal, _goal_1));\n\t\t}\n\t};\n\tfinal <%java.lang.Iterable%><<%ahp.CriterionJudgment%>> criteriaJudgments = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.CriterionJudgment%>>filter(_filter, _function);\n\tfor (final <%ahp.CriterionJudgment%> judgment : criteriaJudgments)\n\t{\n\t\t<%ahp.Criterion%> _first = judgment.getFirst();\n\t\t<%ahp.Criterion%> _second = judgment.getSecond();\n\t\tint _weight = judgment.getWeight();\n\t\tmat.set(_first, _second, _weight);\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Criterion%>> _criteria_1 = this.getCriteria();\n\tfor (final <%ahp.Criterion%> criterion : _criteria_1)\n\t{\n\t\t{\n\t\t\tfinal <%ahp.GoalCriterionPriority%> priority = <%ahp.AHPFactory%>.eINSTANCE.createGoalCriterionPriority();\n\t\t\t<%ahp.Goal%> _goal = this.getGoal();\n\t\t\tpriority.setGoal(_goal);\n\t\t\tpriority.setCriterion(criterion);\n\t\t\tdouble _findEigenvectorElement = mat.findEigenvectorElement(criterion);\n\t\t\tpriority.setValue(_findEigenvectorElement);\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities_1 = this.getPriorities();\n\t\t\t_priorities_1.add(priority);\n\t\t}\n\t}\n\tfinal <%ahp.GoalInconsistency%> goalInconsistency = <%ahp.AHPFactory%>.eINSTANCE.createGoalInconsistency();\n\t<%ahp.Goal%> _goal = this.getGoal();\n\tgoalInconsistency.setGoal(_goal);\n\tdouble _inconsistency = mat.getInconsistency();\n\tgoalInconsistency.setValue(_inconsistency);\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Inconsistency%>> _inconsistencies_1 = this.getInconsistencies();\n\t_inconsistencies_1.add(goalInconsistency);\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Alternative%>> _alternatives = this.getAlternatives();\n\tint _size = _alternatives.size();\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Criterion%>> _criteria_2 = this.getCriteria();\n\tint _size_1 = _criteria_2.size();\n\tfinal <%ahp.Matrix%> mat2 = new <%ahp.Matrix%>(_size, _size_1);\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Criterion%>> _criteria_3 = this.getCriteria();\n\tfinal <%org.eclipse.xtext.xbase.lib.Procedures.Procedure2%><<%ahp.Criterion%>, <%java.lang.Integer%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Procedures.Procedure2%><<%ahp.Criterion%>, <%java.lang.Integer%>>()\n\t{\n\t\tpublic void apply(final <%ahp.Criterion%> criterion, final <%java.lang.Integer%> j)\n\t\t{\n\t\t\ttry\n\t\t\t{\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Alternative%>> _alternatives = <%this%>.getAlternatives();\n\t\t\t\tfinal <%ahp.JudgmentMatrix%><<%ahp.Alternative%>> mat3 = new <%ahp.JudgmentMatrix%><<%ahp.Alternative%>>(_alternatives);\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Judgment%><?>> _judgments = <%this%>.getJudgments();\n\t\t\t\t<%java.lang.Iterable%><<%ahp.AlternativeJudgment%>> _filter = <%com.google.common.collect.Iterables%>.<<%ahp.AlternativeJudgment%>>filter(_judgments, <%ahp.AlternativeJudgment%>.class);\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.AlternativeJudgment%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ahp.AlternativeJudgment%>, <%java.lang.Boolean%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic <%java.lang.Boolean%> apply(final <%ahp.AlternativeJudgment%> aj)\n\t\t\t\t\t{\n\t\t\t\t\t\t<%ahp.Criterion%> _criterion = aj.getCriterion();\n\t\t\t\t\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_criterion, criterion));\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\tfinal <%java.lang.Iterable%><<%ahp.AlternativeJudgment%>> alternativeJudgments = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.AlternativeJudgment%>>filter(_filter, _function);\n\t\t\t\tfor (final <%ahp.AlternativeJudgment%> judgment : alternativeJudgments)\n\t\t\t\t{\n\t\t\t\t\t<%ahp.Alternative%> _first = judgment.getFirst();\n\t\t\t\t\t<%ahp.Alternative%> _second = judgment.getSecond();\n\t\t\t\t\tint _weight = judgment.getWeight();\n\t\t\t\t\tmat3.set(_first, _second, _weight);\n\t\t\t\t}\n\t\t\t\tfinal <%ahp.CriterionInconsistency%> criterionInconsistency = <%ahp.AHPFactory%>.eINSTANCE.createCriterionInconsistency();\n\t\t\t\tcriterionInconsistency.setCriterion(criterion);\n\t\t\t\tdouble _inconsistency = mat3.getInconsistency();\n\t\t\t\tcriterionInconsistency.setValue(_inconsistency);\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Inconsistency%>> _inconsistencies = <%this%>.getInconsistencies();\n\t\t\t\t_inconsistencies.add(criterionInconsistency);\n\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Alternative%>> _alternatives_1 = <%this%>.getAlternatives();\n\t\t\t\tfinal <%org.eclipse.xtext.xbase.lib.Procedures.Procedure2%><<%ahp.Alternative%>, <%java.lang.Integer%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Procedures.Procedure2%><<%ahp.Alternative%>, <%java.lang.Integer%>>()\n\t\t\t\t{\n\t\t\t\t\tpublic void apply(final <%ahp.Alternative%> alternative, final <%java.lang.Integer%> i)\n\t\t\t\t\t{\n\t\t\t\t\t\ttry\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\tfinal <%ahp.CriterionAlternativePriority%> priority = <%ahp.AHPFactory%>.eINSTANCE.createCriterionAlternativePriority();\n\t\t\t\t\t\t\tpriority.setCriterion(criterion);\n\t\t\t\t\t\t\tpriority.setAlternative(alternative);\n\t\t\t\t\t\t\tdouble _findEigenvectorElement = mat3.findEigenvectorElement(alternative);\n\t\t\t\t\t\t\tpriority.setValue(_findEigenvectorElement);\n\t\t\t\t\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities = <%this%>.getPriorities();\n\t\t\t\t\t\t\t_priorities.add(priority);\n\t\t\t\t\t\t\tdouble _value = priority.getValue();\n\t\t\t\t\t\t\tmat2.set((i).intValue(), (j).intValue(), _value);\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (Throwable _e)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\tthrow org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.Alternative%>>forEach(_alternatives_1, _function_1);\n\t\t\t}\n\t\t\tcatch (Throwable _e)\n\t\t\t{\n\t\t\t\tthrow org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);\n\t\t\t}\n\t\t}\n\t};\n\t<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.Criterion%>>forEach(_criteria_3, _function_1);\n\t<%ahp.Vector%> _eigenvector = mat.getEigenvector();\n\tfinal <%ahp.Vector%> mat4 = mat2.multiply(_eigenvector);\n\t<%org.eclipse.emf.common.util.EList%><<%ahp.Alternative%>> _alternatives_1 = this.getAlternatives();\n\tfinal <%org.eclipse.xtext.xbase.lib.Procedures.Procedure2%><<%ahp.Alternative%>, <%java.lang.Integer%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Procedures.Procedure2%><<%ahp.Alternative%>, <%java.lang.Integer%>>()\n\t{\n\t\tpublic void apply(final <%ahp.Alternative%> alternative, final <%java.lang.Integer%> i)\n\t\t{\n\t\t\tfinal <%ahp.GoalAlternativePriority%> priority = <%ahp.AHPFactory%>.eINSTANCE.createGoalAlternativePriority();\n\t\t\t<%ahp.Goal%> _goal = <%this%>.getGoal();\n\t\t\tpriority.setGoal(_goal);\n\t\t\tpriority.setAlternative(alternative);\n\t\t\tdouble _get = mat4.get((i).intValue());\n\t\t\tpriority.setValue(_get);\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ahp.Priority%>> _priorities = <%this%>.getPriorities();\n\t\t\t_priorities.add(priority);\n\t\t}\n\t};\n\t<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ahp.Alternative%>>forEach(_alternatives_1, _function_2);\n}\ncatch (Throwable _e)\n{\n\tthrow org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);\n}'"
	 * @generated
	 */
	void updatePriorities();

} // Hierarchy
