/**
 */
package ahp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ahp.AHPPackage
 * @generated
 */
public interface AHPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AHPFactory eINSTANCE = ahp.impl.AHPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hierarchy</em>'.
	 * @generated
	 */
	Hierarchy createHierarchy();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion</em>'.
	 * @generated
	 */
	Criterion createCriterion();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Criterion Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion Alternative</em>'.
	 * @generated
	 */
	CriterionAlternative createCriterionAlternative();

	/**
	 * Returns a new object of class '<em>Criterion Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion Judgment</em>'.
	 * @generated
	 */
	CriterionJudgment createCriterionJudgment();

	/**
	 * Returns a new object of class '<em>Alternative Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Judgment</em>'.
	 * @generated
	 */
	AlternativeJudgment createAlternativeJudgment();

	/**
	 * Returns a new object of class '<em>Goal Criterion Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Criterion Priority</em>'.
	 * @generated
	 */
	GoalCriterionPriority createGoalCriterionPriority();

	/**
	 * Returns a new object of class '<em>Criterion Alternative Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion Alternative Priority</em>'.
	 * @generated
	 */
	CriterionAlternativePriority createCriterionAlternativePriority();

	/**
	 * Returns a new object of class '<em>Goal Alternative Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Alternative Priority</em>'.
	 * @generated
	 */
	GoalAlternativePriority createGoalAlternativePriority();

	/**
	 * Returns a new object of class '<em>Goal Inconsistency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Inconsistency</em>'.
	 * @generated
	 */
	GoalInconsistency createGoalInconsistency();

	/**
	 * Returns a new object of class '<em>Criterion Inconsistency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion Inconsistency</em>'.
	 * @generated
	 */
	CriterionInconsistency createCriterionInconsistency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AHPPackage getAHPPackage();

} //AHPFactory
