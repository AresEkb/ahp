/**
 */
package ahp.util;

import ahp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ahp.AHPPackage
 * @generated
 */
public class AHPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AHPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AHPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AHPSwitch<Adapter> modelSwitch =
		new AHPSwitch<Adapter>() {
			@Override
			public Adapter caseHierarchy(Hierarchy object) {
				return createHierarchyAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseCriterion(Criterion object) {
				return createCriterionAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseCriterionAlternative(CriterionAlternative object) {
				return createCriterionAlternativeAdapter();
			}
			@Override
			public <T> Adapter caseJudgment(Judgment<T> object) {
				return createJudgmentAdapter();
			}
			@Override
			public Adapter caseCriterionJudgment(CriterionJudgment object) {
				return createCriterionJudgmentAdapter();
			}
			@Override
			public Adapter caseAlternativeJudgment(AlternativeJudgment object) {
				return createAlternativeJudgmentAdapter();
			}
			@Override
			public Adapter casePriority(Priority object) {
				return createPriorityAdapter();
			}
			@Override
			public Adapter caseGoalCriterionPriority(GoalCriterionPriority object) {
				return createGoalCriterionPriorityAdapter();
			}
			@Override
			public Adapter caseCriterionAlternativePriority(CriterionAlternativePriority object) {
				return createCriterionAlternativePriorityAdapter();
			}
			@Override
			public Adapter caseGoalAlternativePriority(GoalAlternativePriority object) {
				return createGoalAlternativePriorityAdapter();
			}
			@Override
			public Adapter caseInconsistency(Inconsistency object) {
				return createInconsistencyAdapter();
			}
			@Override
			public Adapter caseGoalInconsistency(GoalInconsistency object) {
				return createGoalInconsistencyAdapter();
			}
			@Override
			public Adapter caseCriterionInconsistency(CriterionInconsistency object) {
				return createCriterionInconsistencyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ahp.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Hierarchy
	 * @generated
	 */
	public Adapter createHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Criterion
	 * @generated
	 */
	public Adapter createCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.CriterionAlternative <em>Criterion Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.CriterionAlternative
	 * @generated
	 */
	public Adapter createCriterionAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Judgment <em>Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Judgment
	 * @generated
	 */
	public Adapter createJudgmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.CriterionJudgment <em>Criterion Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.CriterionJudgment
	 * @generated
	 */
	public Adapter createCriterionJudgmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.AlternativeJudgment <em>Alternative Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.AlternativeJudgment
	 * @generated
	 */
	public Adapter createAlternativeJudgmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Priority
	 * @generated
	 */
	public Adapter createPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.GoalCriterionPriority <em>Goal Criterion Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.GoalCriterionPriority
	 * @generated
	 */
	public Adapter createGoalCriterionPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.CriterionAlternativePriority <em>Criterion Alternative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.CriterionAlternativePriority
	 * @generated
	 */
	public Adapter createCriterionAlternativePriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.GoalAlternativePriority <em>Goal Alternative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.GoalAlternativePriority
	 * @generated
	 */
	public Adapter createGoalAlternativePriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.Inconsistency <em>Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.Inconsistency
	 * @generated
	 */
	public Adapter createInconsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.GoalInconsistency <em>Goal Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.GoalInconsistency
	 * @generated
	 */
	public Adapter createGoalInconsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ahp.CriterionInconsistency <em>Criterion Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ahp.CriterionInconsistency
	 * @generated
	 */
	public Adapter createCriterionInconsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AHPAdapterFactory
