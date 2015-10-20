/**
 */
package ahp.util;

import ahp.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ahp.AHPPackage
 * @generated
 */
public class AHPValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AHPValidator INSTANCE = new AHPValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ahp";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Operands Are Different' of 'Judgment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JUDGMENT__CHECK_OPERANDS_ARE_DIFFERENT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Inverse Judgment' of 'Judgment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JUDGMENT__CHECK_INVERSE_JUDGMENT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AHPPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AHPPackage.HIERARCHY:
				return validateHierarchy((Hierarchy)value, diagnostics, context);
			case AHPPackage.NAMED:
				return validateNamed((Named)value, diagnostics, context);
			case AHPPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case AHPPackage.CRITERION:
				return validateCriterion((Criterion)value, diagnostics, context);
			case AHPPackage.ALTERNATIVE:
				return validateAlternative((Alternative)value, diagnostics, context);
			case AHPPackage.CRITERION_ALTERNATIVE:
				return validateCriterionAlternative((CriterionAlternative)value, diagnostics, context);
			case AHPPackage.JUDGMENT:
				return validateJudgment((Judgment<?>)value, diagnostics, context);
			case AHPPackage.CRITERION_JUDGMENT:
				return validateCriterionJudgment((CriterionJudgment)value, diagnostics, context);
			case AHPPackage.ALTERNATIVE_JUDGMENT:
				return validateAlternativeJudgment((AlternativeJudgment)value, diagnostics, context);
			case AHPPackage.PRIORITY:
				return validatePriority((Priority)value, diagnostics, context);
			case AHPPackage.GOAL_CRITERION_PRIORITY:
				return validateGoalCriterionPriority((GoalCriterionPriority)value, diagnostics, context);
			case AHPPackage.CRITERION_ALTERNATIVE_PRIORITY:
				return validateCriterionAlternativePriority((CriterionAlternativePriority)value, diagnostics, context);
			case AHPPackage.GOAL_ALTERNATIVE_PRIORITY:
				return validateGoalAlternativePriority((GoalAlternativePriority)value, diagnostics, context);
			case AHPPackage.INCONSISTENCY:
				return validateInconsistency((Inconsistency)value, diagnostics, context);
			case AHPPackage.GOAL_INCONSISTENCY:
				return validateGoalInconsistency((GoalInconsistency)value, diagnostics, context);
			case AHPPackage.CRITERION_INCONSISTENCY:
				return validateCriterionInconsistency((CriterionInconsistency)value, diagnostics, context);
			case AHPPackage.WEIGHT:
				return validateWeight((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchy(Hierarchy hierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierarchy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(named, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternative(Alternative alternative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionAlternative(CriterionAlternative criterionAlternative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterionAlternative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJudgment(Judgment<?> judgment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(judgment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validateJudgment_checkOperandsAreDifferent(judgment, diagnostics, context);
		if (result || diagnostics != null) result &= validateJudgment_checkInverseJudgment(judgment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkOperandsAreDifferent constraint of '<em>Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJudgment_checkOperandsAreDifferent(Judgment<?> judgment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return judgment.checkOperandsAreDifferent(diagnostics, context);
	}

	/**
	 * Validates the checkInverseJudgment constraint of '<em>Judgment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJudgment_checkInverseJudgment(Judgment<?> judgment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return judgment.checkInverseJudgment(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionJudgment(CriterionJudgment criterionJudgment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(criterionJudgment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validateJudgment_checkOperandsAreDifferent(criterionJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validateJudgment_checkInverseJudgment(criterionJudgment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternativeJudgment(AlternativeJudgment alternativeJudgment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alternativeJudgment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validateJudgment_checkOperandsAreDifferent(alternativeJudgment, diagnostics, context);
		if (result || diagnostics != null) result &= validateJudgment_checkInverseJudgment(alternativeJudgment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority(Priority priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalCriterionPriority(GoalCriterionPriority goalCriterionPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalCriterionPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionAlternativePriority(CriterionAlternativePriority criterionAlternativePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterionAlternativePriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalAlternativePriority(GoalAlternativePriority goalAlternativePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalAlternativePriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInconsistency(Inconsistency inconsistency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inconsistency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalInconsistency(GoalInconsistency goalInconsistency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalInconsistency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionInconsistency(CriterionInconsistency criterionInconsistency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterionInconsistency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeight(int weight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AHPValidator
