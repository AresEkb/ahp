/**
 */
package ahp.impl;

import ahp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AHPFactoryImpl extends EFactoryImpl implements AHPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AHPFactory init() {
		try {
			AHPFactory theAHPFactory = (AHPFactory)EPackage.Registry.INSTANCE.getEFactory(AHPPackage.eNS_URI);
			if (theAHPFactory != null) {
				return theAHPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AHPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AHPPackage.HIERARCHY: return createHierarchy();
			case AHPPackage.GOAL: return createGoal();
			case AHPPackage.CRITERION: return createCriterion();
			case AHPPackage.ALTERNATIVE: return createAlternative();
			case AHPPackage.CRITERION_ALTERNATIVE: return createCriterionAlternative();
			case AHPPackage.CRITERION_JUDGMENT: return createCriterionJudgment();
			case AHPPackage.ALTERNATIVE_JUDGMENT: return createAlternativeJudgment();
			case AHPPackage.GOAL_CRITERION_PRIORITY: return createGoalCriterionPriority();
			case AHPPackage.CRITERION_ALTERNATIVE_PRIORITY: return createCriterionAlternativePriority();
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY: return createGoalAlternativePriority();
			case AHPPackage.GOAL_INCONSISTENCY: return createGoalInconsistency();
			case AHPPackage.CRITERION_INCONSISTENCY: return createCriterionInconsistency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AHPPackage.WEIGHT:
				return createWeightFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AHPPackage.WEIGHT:
				return convertWeightToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hierarchy createHierarchy() {
		HierarchyImpl hierarchy = new HierarchyImpl();
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criterion createCriterion() {
		CriterionImpl criterion = new CriterionImpl();
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionAlternative createCriterionAlternative() {
		CriterionAlternativeImpl criterionAlternative = new CriterionAlternativeImpl();
		return criterionAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionJudgment createCriterionJudgment() {
		CriterionJudgmentImpl criterionJudgment = new CriterionJudgmentImpl();
		return criterionJudgment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeJudgment createAlternativeJudgment() {
		AlternativeJudgmentImpl alternativeJudgment = new AlternativeJudgmentImpl();
		return alternativeJudgment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalCriterionPriority createGoalCriterionPriority() {
		GoalCriterionPriorityImpl goalCriterionPriority = new GoalCriterionPriorityImpl();
		return goalCriterionPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionAlternativePriority createCriterionAlternativePriority() {
		CriterionAlternativePriorityImpl criterionAlternativePriority = new CriterionAlternativePriorityImpl();
		return criterionAlternativePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalAlternativePriority createGoalAlternativePriority() {
		GoalAlternativePriorityImpl goalAlternativePriority = new GoalAlternativePriorityImpl();
		return goalAlternativePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalInconsistency createGoalInconsistency() {
		GoalInconsistencyImpl goalInconsistency = new GoalInconsistencyImpl();
		return goalInconsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionInconsistency createCriterionInconsistency() {
		CriterionInconsistencyImpl criterionInconsistency = new CriterionInconsistencyImpl();
		return criterionInconsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int createWeight(final String it) {
		int _xifexpression = (int) 0;
		boolean _matches = it.matches("\\d+");
		if (_matches) {
			_xifexpression = Integer.parseInt(it);
		}
		else {
			int _xifexpression_1 = (int) 0;
			boolean _matches_1 = it.matches("1\\s*/\\s*\\d+");
			if (_matches_1) {
				int _xblockexpression = (int) 0;
				{
					String _replaceFirst = it.replaceFirst("1\\s*/\\s*", "");
					final int result = Integer.parseInt(_replaceFirst);
					int _xifexpression_2 = (int) 0;
					if ((result <= 1)) {
						_xifexpression_2 = 1;
					}
					else {
						_xifexpression_2 = (-result);
					}
					_xblockexpression = _xifexpression_2;
				}
				_xifexpression_1 = _xblockexpression;
			}
			else {
				throw new NumberFormatException("The weight must be either n or 1/n");
			}
			_xifexpression = _xifexpression_1;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createWeightFromString(EDataType eDataType, String initialValue) {
		return createWeight(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeight(final int it) {
		String _xifexpression = null;
		if ((it >= 1)) {
			_xifexpression = Integer.valueOf(it).toString();
		}
		else {
			String _xifexpression_1 = null;
			if ((it >= (-1))) {
				_xifexpression_1 = "1";
			}
			else {
				String _string = Integer.valueOf((-it)).toString();
				_xifexpression_1 = ("1/" + _string);
			}
			_xifexpression = _xifexpression_1;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : convertWeight((Integer)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPPackage getAHPPackage() {
		return (AHPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AHPPackage getPackage() {
		return AHPPackage.eINSTANCE;
	}

} //AHPFactoryImpl
