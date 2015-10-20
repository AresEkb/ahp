/**
 */
package ahp.util;

import ahp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ahp.AHPPackage
 * @generated
 */
public class AHPSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AHPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPSwitch() {
		if (modelPackage == null) {
			modelPackage = AHPPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AHPPackage.HIERARCHY: {
				Hierarchy hierarchy = (Hierarchy)theEObject;
				T1 result = caseHierarchy(hierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.NAMED: {
				Named named = (Named)theEObject;
				T1 result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T1 result = caseGoal(goal);
				if (result == null) result = caseNamed(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.CRITERION: {
				Criterion criterion = (Criterion)theEObject;
				T1 result = caseCriterion(criterion);
				if (result == null) result = caseNamed(criterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T1 result = caseAlternative(alternative);
				if (result == null) result = caseNamed(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.CRITERION_ALTERNATIVE: {
				CriterionAlternative criterionAlternative = (CriterionAlternative)theEObject;
				T1 result = caseCriterionAlternative(criterionAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.JUDGMENT: {
				Judgment<?> judgment = (Judgment<?>)theEObject;
				T1 result = caseJudgment(judgment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.CRITERION_JUDGMENT: {
				CriterionJudgment criterionJudgment = (CriterionJudgment)theEObject;
				T1 result = caseCriterionJudgment(criterionJudgment);
				if (result == null) result = caseJudgment(criterionJudgment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.ALTERNATIVE_JUDGMENT: {
				AlternativeJudgment alternativeJudgment = (AlternativeJudgment)theEObject;
				T1 result = caseAlternativeJudgment(alternativeJudgment);
				if (result == null) result = caseJudgment(alternativeJudgment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.PRIORITY: {
				Priority priority = (Priority)theEObject;
				T1 result = casePriority(priority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.GOAL_CRITERION_PRIORITY: {
				GoalCriterionPriority goalCriterionPriority = (GoalCriterionPriority)theEObject;
				T1 result = caseGoalCriterionPriority(goalCriterionPriority);
				if (result == null) result = casePriority(goalCriterionPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.CRITERION_ALTERNATIVE_PRIORITY: {
				CriterionAlternativePriority criterionAlternativePriority = (CriterionAlternativePriority)theEObject;
				T1 result = caseCriterionAlternativePriority(criterionAlternativePriority);
				if (result == null) result = casePriority(criterionAlternativePriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY: {
				GoalAlternativePriority goalAlternativePriority = (GoalAlternativePriority)theEObject;
				T1 result = caseGoalAlternativePriority(goalAlternativePriority);
				if (result == null) result = casePriority(goalAlternativePriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.INCONSISTENCY: {
				Inconsistency inconsistency = (Inconsistency)theEObject;
				T1 result = caseInconsistency(inconsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.GOAL_INCONSISTENCY: {
				GoalInconsistency goalInconsistency = (GoalInconsistency)theEObject;
				T1 result = caseGoalInconsistency(goalInconsistency);
				if (result == null) result = caseInconsistency(goalInconsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AHPPackage.CRITERION_INCONSISTENCY: {
				CriterionInconsistency criterionInconsistency = (CriterionInconsistency)theEObject;
				T1 result = caseCriterionInconsistency(criterionInconsistency);
				if (result == null) result = caseInconsistency(criterionInconsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHierarchy(Hierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCriterion(Criterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCriterionAlternative(CriterionAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Judgment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseJudgment(Judgment<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion Judgment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCriterionJudgment(CriterionJudgment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Judgment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAlternativeJudgment(AlternativeJudgment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePriority(Priority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Criterion Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Criterion Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGoalCriterionPriority(GoalCriterionPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion Alternative Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion Alternative Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCriterionAlternativePriority(CriterionAlternativePriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Alternative Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Alternative Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGoalAlternativePriority(GoalAlternativePriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inconsistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inconsistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInconsistency(Inconsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Inconsistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Inconsistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGoalInconsistency(GoalInconsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion Inconsistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion Inconsistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCriterionInconsistency(CriterionInconsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //AHPSwitch
