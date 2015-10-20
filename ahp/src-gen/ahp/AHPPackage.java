/**
 */
package ahp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ahp.AHPFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='AHP' prefix='AHP' editDirectory='/ahp.edit/src-gen' editorDirectory='/ahp.editor/src-gen' testsDirectory='/ahp.tests/src-gen'"
 * @generated
 */
public interface AHPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ahp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ahp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ahp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AHPPackage eINSTANCE = ahp.impl.AHPPackageImpl.init();

	/**
	 * The meta object id for the '{@link ahp.impl.HierarchyImpl <em>Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.HierarchyImpl
	 * @see ahp.impl.AHPPackageImpl#getHierarchy()
	 * @generated
	 */
	int HIERARCHY = 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__GOAL = 0;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__CRITERIA = 1;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__ALTERNATIVES = 2;

	/**
	 * The feature id for the '<em><b>Judgments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__JUDGMENTS = 3;

	/**
	 * The feature id for the '<em><b>Priorities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__PRIORITIES = 4;

	/**
	 * The feature id for the '<em><b>Inconsistencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY__INCONSISTENCIES = 5;

	/**
	 * The number of structural features of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Find Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY___FIND_JUDGMENT__GOAL_CRITERION_CRITERION = 0;

	/**
	 * The operation id for the '<em>Find Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY___FIND_JUDGMENT__CRITERION_ALTERNATIVE_ALTERNATIVE = 1;

	/**
	 * The operation id for the '<em>Update Priorities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY___UPDATE_PRIORITIES = 2;

	/**
	 * The number of operations of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ahp.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.Named
	 * @see ahp.impl.AHPPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ahp.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.GoalImpl
	 * @see ahp.impl.AHPPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HIERARCHY = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Inconsistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___GET_INCONSISTENCY = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ahp.impl.CriterionImpl <em>Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.CriterionImpl
	 * @see ahp.impl.AHPPackageImpl#getCriterion()
	 * @generated
	 */
	int CRITERION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__HIERARCHY = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION___GET_PRIORITY = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inconsistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION___GET_INCONSISTENCY = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ahp.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.AlternativeImpl
	 * @see ahp.impl.AHPPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__HIERARCHY = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE___GET_PRIORITY = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE___GET_PRIORITY__CRITERION = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ahp.impl.CriterionAlternativeImpl <em>Criterion Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.CriterionAlternativeImpl
	 * @see ahp.impl.AHPPackageImpl#getCriterionAlternative()
	 * @generated
	 */
	int CRITERION_ALTERNATIVE = 5;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE__CRITERION = 0;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE__ALTERNATIVE = 1;

	/**
	 * The number of structural features of the '<em>Criterion Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Criterion Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ahp.impl.JudgmentImpl <em>Judgment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.JudgmentImpl
	 * @see ahp.impl.AHPPackageImpl#getJudgment()
	 * @generated
	 */
	int JUDGMENT = 6;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__HIERARCHY = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__FIRST = 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__SECOND = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT__WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Check Operands Are Different</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Check Inverse Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Get Inverse Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT___GET_INVERSE_JUDGMENT = 2;

	/**
	 * The number of operations of the '<em>Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ahp.impl.CriterionJudgmentImpl <em>Criterion Judgment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.CriterionJudgmentImpl
	 * @see ahp.impl.AHPPackageImpl#getCriterionJudgment()
	 * @generated
	 */
	int CRITERION_JUDGMENT = 7;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT__HIERARCHY = JUDGMENT__HIERARCHY;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT__FIRST = JUDGMENT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT__SECOND = JUDGMENT__SECOND;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT__WEIGHT = JUDGMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT__GOAL = JUDGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Criterion Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT_FEATURE_COUNT = JUDGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Operands Are Different</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP = JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Check Inverse Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP = JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Inverse Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT___GET_INVERSE_JUDGMENT = JUDGMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Criterion Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_JUDGMENT_OPERATION_COUNT = JUDGMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ahp.impl.AlternativeJudgmentImpl <em>Alternative Judgment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.AlternativeJudgmentImpl
	 * @see ahp.impl.AHPPackageImpl#getAlternativeJudgment()
	 * @generated
	 */
	int ALTERNATIVE_JUDGMENT = 8;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT__HIERARCHY = JUDGMENT__HIERARCHY;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT__FIRST = JUDGMENT__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT__SECOND = JUDGMENT__SECOND;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT__WEIGHT = JUDGMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT__CRITERION = JUDGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT_FEATURE_COUNT = JUDGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Operands Are Different</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP = JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Check Inverse Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP = JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Inverse Judgment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT___GET_INVERSE_JUDGMENT = JUDGMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternative Judgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_JUDGMENT_OPERATION_COUNT = JUDGMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ahp.impl.PriorityImpl <em>Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.PriorityImpl
	 * @see ahp.impl.AHPPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ahp.impl.GoalCriterionPriorityImpl <em>Goal Criterion Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.GoalCriterionPriorityImpl
	 * @see ahp.impl.AHPPackageImpl#getGoalCriterionPriority()
	 * @generated
	 */
	int GOAL_CRITERION_PRIORITY = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_CRITERION_PRIORITY__VALUE = PRIORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_CRITERION_PRIORITY__GOAL = PRIORITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_CRITERION_PRIORITY__CRITERION = PRIORITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal Criterion Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_CRITERION_PRIORITY_FEATURE_COUNT = PRIORITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal Criterion Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_CRITERION_PRIORITY_OPERATION_COUNT = PRIORITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ahp.impl.CriterionAlternativePriorityImpl <em>Criterion Alternative Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.CriterionAlternativePriorityImpl
	 * @see ahp.impl.AHPPackageImpl#getCriterionAlternativePriority()
	 * @generated
	 */
	int CRITERION_ALTERNATIVE_PRIORITY = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_PRIORITY__VALUE = PRIORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_PRIORITY__CRITERION = PRIORITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_PRIORITY__ALTERNATIVE = PRIORITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Criterion Alternative Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_PRIORITY_FEATURE_COUNT = PRIORITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Criterion Alternative Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_ALTERNATIVE_PRIORITY_OPERATION_COUNT = PRIORITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ahp.impl.GoalAlternativePriorityImpl <em>Goal Alternative Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.GoalAlternativePriorityImpl
	 * @see ahp.impl.AHPPackageImpl#getGoalAlternativePriority()
	 * @generated
	 */
	int GOAL_ALTERNATIVE_PRIORITY = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ALTERNATIVE_PRIORITY__VALUE = PRIORITY__VALUE;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ALTERNATIVE_PRIORITY__GOAL = PRIORITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE = PRIORITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal Alternative Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ALTERNATIVE_PRIORITY_FEATURE_COUNT = PRIORITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal Alternative Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_ALTERNATIVE_PRIORITY_OPERATION_COUNT = PRIORITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ahp.impl.InconsistencyImpl <em>Inconsistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.InconsistencyImpl
	 * @see ahp.impl.AHPPackageImpl#getInconsistency()
	 * @generated
	 */
	int INCONSISTENCY = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ahp.impl.GoalInconsistencyImpl <em>Goal Inconsistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.GoalInconsistencyImpl
	 * @see ahp.impl.AHPPackageImpl#getGoalInconsistency()
	 * @generated
	 */
	int GOAL_INCONSISTENCY = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_INCONSISTENCY__VALUE = INCONSISTENCY__VALUE;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_INCONSISTENCY__GOAL = INCONSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_INCONSISTENCY_FEATURE_COUNT = INCONSISTENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Goal Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_INCONSISTENCY_OPERATION_COUNT = INCONSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ahp.impl.CriterionInconsistencyImpl <em>Criterion Inconsistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.CriterionInconsistencyImpl
	 * @see ahp.impl.AHPPackageImpl#getCriterionInconsistency()
	 * @generated
	 */
	int CRITERION_INCONSISTENCY = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_INCONSISTENCY__VALUE = INCONSISTENCY__VALUE;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_INCONSISTENCY__CRITERION = INCONSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Criterion Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_INCONSISTENCY_FEATURE_COUNT = INCONSISTENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Criterion Inconsistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_INCONSISTENCY_OPERATION_COUNT = INCONSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Weight</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ahp.impl.AHPPackageImpl#getWeight()
	 * @generated
	 */
	int WEIGHT = 16;


	/**
	 * Returns the meta object for class '{@link ahp.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy</em>'.
	 * @see ahp.Hierarchy
	 * @generated
	 */
	EClass getHierarchy();

	/**
	 * Returns the meta object for the containment reference '{@link ahp.Hierarchy#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal</em>'.
	 * @see ahp.Hierarchy#getGoal()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link ahp.Hierarchy#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see ahp.Hierarchy#getCriteria()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link ahp.Hierarchy#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see ahp.Hierarchy#getAlternatives()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link ahp.Hierarchy#getJudgments <em>Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Judgments</em>'.
	 * @see ahp.Hierarchy#getJudgments()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Judgments();

	/**
	 * Returns the meta object for the containment reference list '{@link ahp.Hierarchy#getPriorities <em>Priorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Priorities</em>'.
	 * @see ahp.Hierarchy#getPriorities()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Priorities();

	/**
	 * Returns the meta object for the containment reference list '{@link ahp.Hierarchy#getInconsistencies <em>Inconsistencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inconsistencies</em>'.
	 * @see ahp.Hierarchy#getInconsistencies()
	 * @see #getHierarchy()
	 * @generated
	 */
	EReference getHierarchy_Inconsistencies();

	/**
	 * Returns the meta object for the '{@link ahp.Hierarchy#findJudgment(ahp.Goal, ahp.Criterion, ahp.Criterion) <em>Find Judgment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Judgment</em>' operation.
	 * @see ahp.Hierarchy#findJudgment(ahp.Goal, ahp.Criterion, ahp.Criterion)
	 * @generated
	 */
	EOperation getHierarchy__FindJudgment__Goal_Criterion_Criterion();

	/**
	 * Returns the meta object for the '{@link ahp.Hierarchy#findJudgment(ahp.Criterion, ahp.Alternative, ahp.Alternative) <em>Find Judgment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Judgment</em>' operation.
	 * @see ahp.Hierarchy#findJudgment(ahp.Criterion, ahp.Alternative, ahp.Alternative)
	 * @generated
	 */
	EOperation getHierarchy__FindJudgment__Criterion_Alternative_Alternative();

	/**
	 * Returns the meta object for the '{@link ahp.Hierarchy#updatePriorities() <em>Update Priorities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Priorities</em>' operation.
	 * @see ahp.Hierarchy#updatePriorities()
	 * @generated
	 */
	EOperation getHierarchy__UpdatePriorities();

	/**
	 * Returns the meta object for class '{@link ahp.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see ahp.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link ahp.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ahp.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link ahp.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see ahp.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the container reference '{@link ahp.Goal#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hierarchy</em>'.
	 * @see ahp.Goal#getHierarchy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Hierarchy();

	/**
	 * Returns the meta object for the '{@link ahp.Goal#getInconsistency() <em>Get Inconsistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inconsistency</em>' operation.
	 * @see ahp.Goal#getInconsistency()
	 * @generated
	 */
	EOperation getGoal__GetInconsistency();

	/**
	 * Returns the meta object for class '{@link ahp.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see ahp.Criterion
	 * @generated
	 */
	EClass getCriterion();

	/**
	 * Returns the meta object for the container reference '{@link ahp.Criterion#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hierarchy</em>'.
	 * @see ahp.Criterion#getHierarchy()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_Hierarchy();

	/**
	 * Returns the meta object for the '{@link ahp.Criterion#getPriority() <em>Get Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Priority</em>' operation.
	 * @see ahp.Criterion#getPriority()
	 * @generated
	 */
	EOperation getCriterion__GetPriority();

	/**
	 * Returns the meta object for the '{@link ahp.Criterion#getInconsistency() <em>Get Inconsistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inconsistency</em>' operation.
	 * @see ahp.Criterion#getInconsistency()
	 * @generated
	 */
	EOperation getCriterion__GetInconsistency();

	/**
	 * Returns the meta object for class '{@link ahp.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see ahp.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the container reference '{@link ahp.Alternative#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hierarchy</em>'.
	 * @see ahp.Alternative#getHierarchy()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Hierarchy();

	/**
	 * Returns the meta object for the '{@link ahp.Alternative#getPriority() <em>Get Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Priority</em>' operation.
	 * @see ahp.Alternative#getPriority()
	 * @generated
	 */
	EOperation getAlternative__GetPriority();

	/**
	 * Returns the meta object for the '{@link ahp.Alternative#getPriority(ahp.Criterion) <em>Get Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Priority</em>' operation.
	 * @see ahp.Alternative#getPriority(ahp.Criterion)
	 * @generated
	 */
	EOperation getAlternative__GetPriority__Criterion();

	/**
	 * Returns the meta object for class '{@link ahp.CriterionAlternative <em>Criterion Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion Alternative</em>'.
	 * @see ahp.CriterionAlternative
	 * @generated
	 */
	EClass getCriterionAlternative();

	/**
	 * Returns the meta object for the reference '{@link ahp.CriterionAlternative#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see ahp.CriterionAlternative#getCriterion()
	 * @see #getCriterionAlternative()
	 * @generated
	 */
	EReference getCriterionAlternative_Criterion();

	/**
	 * Returns the meta object for the reference '{@link ahp.CriterionAlternative#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alternative</em>'.
	 * @see ahp.CriterionAlternative#getAlternative()
	 * @see #getCriterionAlternative()
	 * @generated
	 */
	EReference getCriterionAlternative_Alternative();

	/**
	 * Returns the meta object for class '{@link ahp.Judgment <em>Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judgment</em>'.
	 * @see ahp.Judgment
	 * @generated
	 */
	EClass getJudgment();

	/**
	 * Returns the meta object for the container reference '{@link ahp.Judgment#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hierarchy</em>'.
	 * @see ahp.Judgment#getHierarchy()
	 * @see #getJudgment()
	 * @generated
	 */
	EReference getJudgment_Hierarchy();

	/**
	 * Returns the meta object for the reference '{@link ahp.Judgment#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see ahp.Judgment#getFirst()
	 * @see #getJudgment()
	 * @generated
	 */
	EReference getJudgment_First();

	/**
	 * Returns the meta object for the reference '{@link ahp.Judgment#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see ahp.Judgment#getSecond()
	 * @see #getJudgment()
	 * @generated
	 */
	EReference getJudgment_Second();

	/**
	 * Returns the meta object for the attribute '{@link ahp.Judgment#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see ahp.Judgment#getWeight()
	 * @see #getJudgment()
	 * @generated
	 */
	EAttribute getJudgment_Weight();

	/**
	 * Returns the meta object for the '{@link ahp.Judgment#checkOperandsAreDifferent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Operands Are Different</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Operands Are Different</em>' operation.
	 * @see ahp.Judgment#checkOperandsAreDifferent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJudgment__CheckOperandsAreDifferent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ahp.Judgment#checkInverseJudgment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Inverse Judgment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Inverse Judgment</em>' operation.
	 * @see ahp.Judgment#checkInverseJudgment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getJudgment__CheckInverseJudgment__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ahp.Judgment#getInverseJudgment() <em>Get Inverse Judgment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inverse Judgment</em>' operation.
	 * @see ahp.Judgment#getInverseJudgment()
	 * @generated
	 */
	EOperation getJudgment__GetInverseJudgment();

	/**
	 * Returns the meta object for class '{@link ahp.CriterionJudgment <em>Criterion Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion Judgment</em>'.
	 * @see ahp.CriterionJudgment
	 * @generated
	 */
	EClass getCriterionJudgment();

	/**
	 * Returns the meta object for the reference '{@link ahp.CriterionJudgment#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see ahp.CriterionJudgment#getGoal()
	 * @see #getCriterionJudgment()
	 * @generated
	 */
	EReference getCriterionJudgment_Goal();

	/**
	 * Returns the meta object for the '{@link ahp.CriterionJudgment#getInverseJudgment() <em>Get Inverse Judgment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inverse Judgment</em>' operation.
	 * @see ahp.CriterionJudgment#getInverseJudgment()
	 * @generated
	 */
	EOperation getCriterionJudgment__GetInverseJudgment();

	/**
	 * Returns the meta object for class '{@link ahp.AlternativeJudgment <em>Alternative Judgment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Judgment</em>'.
	 * @see ahp.AlternativeJudgment
	 * @generated
	 */
	EClass getAlternativeJudgment();

	/**
	 * Returns the meta object for the reference '{@link ahp.AlternativeJudgment#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see ahp.AlternativeJudgment#getCriterion()
	 * @see #getAlternativeJudgment()
	 * @generated
	 */
	EReference getAlternativeJudgment_Criterion();

	/**
	 * Returns the meta object for the '{@link ahp.AlternativeJudgment#getInverseJudgment() <em>Get Inverse Judgment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inverse Judgment</em>' operation.
	 * @see ahp.AlternativeJudgment#getInverseJudgment()
	 * @generated
	 */
	EOperation getAlternativeJudgment__GetInverseJudgment();

	/**
	 * Returns the meta object for class '{@link ahp.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority</em>'.
	 * @see ahp.Priority
	 * @generated
	 */
	EClass getPriority();

	/**
	 * Returns the meta object for the attribute '{@link ahp.Priority#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ahp.Priority#getValue()
	 * @see #getPriority()
	 * @generated
	 */
	EAttribute getPriority_Value();

	/**
	 * Returns the meta object for class '{@link ahp.GoalCriterionPriority <em>Goal Criterion Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Criterion Priority</em>'.
	 * @see ahp.GoalCriterionPriority
	 * @generated
	 */
	EClass getGoalCriterionPriority();

	/**
	 * Returns the meta object for the reference '{@link ahp.GoalCriterionPriority#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see ahp.GoalCriterionPriority#getGoal()
	 * @see #getGoalCriterionPriority()
	 * @generated
	 */
	EReference getGoalCriterionPriority_Goal();

	/**
	 * Returns the meta object for the reference '{@link ahp.GoalCriterionPriority#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see ahp.GoalCriterionPriority#getCriterion()
	 * @see #getGoalCriterionPriority()
	 * @generated
	 */
	EReference getGoalCriterionPriority_Criterion();

	/**
	 * Returns the meta object for class '{@link ahp.CriterionAlternativePriority <em>Criterion Alternative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion Alternative Priority</em>'.
	 * @see ahp.CriterionAlternativePriority
	 * @generated
	 */
	EClass getCriterionAlternativePriority();

	/**
	 * Returns the meta object for the reference '{@link ahp.CriterionAlternativePriority#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see ahp.CriterionAlternativePriority#getCriterion()
	 * @see #getCriterionAlternativePriority()
	 * @generated
	 */
	EReference getCriterionAlternativePriority_Criterion();

	/**
	 * Returns the meta object for the reference '{@link ahp.CriterionAlternativePriority#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alternative</em>'.
	 * @see ahp.CriterionAlternativePriority#getAlternative()
	 * @see #getCriterionAlternativePriority()
	 * @generated
	 */
	EReference getCriterionAlternativePriority_Alternative();

	/**
	 * Returns the meta object for class '{@link ahp.GoalAlternativePriority <em>Goal Alternative Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Alternative Priority</em>'.
	 * @see ahp.GoalAlternativePriority
	 * @generated
	 */
	EClass getGoalAlternativePriority();

	/**
	 * Returns the meta object for the reference '{@link ahp.GoalAlternativePriority#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see ahp.GoalAlternativePriority#getGoal()
	 * @see #getGoalAlternativePriority()
	 * @generated
	 */
	EReference getGoalAlternativePriority_Goal();

	/**
	 * Returns the meta object for the reference '{@link ahp.GoalAlternativePriority#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alternative</em>'.
	 * @see ahp.GoalAlternativePriority#getAlternative()
	 * @see #getGoalAlternativePriority()
	 * @generated
	 */
	EReference getGoalAlternativePriority_Alternative();

	/**
	 * Returns the meta object for class '{@link ahp.Inconsistency <em>Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inconsistency</em>'.
	 * @see ahp.Inconsistency
	 * @generated
	 */
	EClass getInconsistency();

	/**
	 * Returns the meta object for the attribute '{@link ahp.Inconsistency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ahp.Inconsistency#getValue()
	 * @see #getInconsistency()
	 * @generated
	 */
	EAttribute getInconsistency_Value();

	/**
	 * Returns the meta object for class '{@link ahp.GoalInconsistency <em>Goal Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Inconsistency</em>'.
	 * @see ahp.GoalInconsistency
	 * @generated
	 */
	EClass getGoalInconsistency();

	/**
	 * Returns the meta object for the reference '{@link ahp.GoalInconsistency#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see ahp.GoalInconsistency#getGoal()
	 * @see #getGoalInconsistency()
	 * @generated
	 */
	EReference getGoalInconsistency_Goal();

	/**
	 * Returns the meta object for class '{@link ahp.CriterionInconsistency <em>Criterion Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion Inconsistency</em>'.
	 * @see ahp.CriterionInconsistency
	 * @generated
	 */
	EClass getCriterionInconsistency();

	/**
	 * Returns the meta object for the reference '{@link ahp.CriterionInconsistency#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see ahp.CriterionInconsistency#getCriterion()
	 * @see #getCriterionInconsistency()
	 * @generated
	 */
	EReference getCriterionInconsistency_Criterion();

	/**
	 * Returns the meta object for data type '<em>Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weight</em>'.
	 * @model instanceClass="int"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='int _xifexpression = (int) 0;\nboolean _matches = it.matches(\"\\\\d+\");\nif (_matches)\n{\n\t_xifexpression = <%java.lang.Integer%>.parseInt(it);\n}\nelse\n{\n\tint _xifexpression_1 = (int) 0;\n\tboolean _matches_1 = it.matches(\"1\\\\s\052/\\\\s*\\\\d+\");\n\tif (_matches_1)\n\t{\n\t\tint _xblockexpression = (int) 0;\n\t\t{\n\t\t\t<%java.lang.String%> _replaceFirst = it.replaceFirst(\"1\\\\s\052/\\\\s*\", \"\");\n\t\t\tfinal int result = <%java.lang.Integer%>.parseInt(_replaceFirst);\n\t\t\tint _xifexpression_2 = (int) 0;\n\t\t\tif ((result <= 1))\n\t\t\t{\n\t\t\t\t_xifexpression_2 = 1;\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\t_xifexpression_2 = (-result);\n\t\t\t}\n\t\t\t_xblockexpression = _xifexpression_2;\n\t\t}\n\t\t_xifexpression_1 = _xblockexpression;\n\t}\n\telse\n\t{\n\t\tthrow new <%java.lang.NumberFormatException%>(\"The weight must be either n or 1/n\");\n\t}\n\t_xifexpression = _xifexpression_1;\n}\nreturn _xifexpression;' convert='<%java.lang.String%> _xifexpression = null;\nif ((it >= 1))\n{\n\t_xifexpression = <%java.lang.Integer%>.valueOf(it).toString();\n}\nelse\n{\n\t<%java.lang.String%> _xifexpression_1 = null;\n\tif ((it >= (-1)))\n\t{\n\t\t_xifexpression_1 = \"1\";\n\t}\n\telse\n\t{\n\t\t<%java.lang.String%> _string = <%java.lang.Integer%>.valueOf((-it)).toString();\n\t\t_xifexpression_1 = (\"1/\" + _string);\n\t}\n\t_xifexpression = _xifexpression_1;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	EDataType getWeight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AHPFactory getAHPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ahp.impl.HierarchyImpl <em>Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.HierarchyImpl
		 * @see ahp.impl.AHPPackageImpl#getHierarchy()
		 * @generated
		 */
		EClass HIERARCHY = eINSTANCE.getHierarchy();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__GOAL = eINSTANCE.getHierarchy_Goal();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__CRITERIA = eINSTANCE.getHierarchy_Criteria();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__ALTERNATIVES = eINSTANCE.getHierarchy_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Judgments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__JUDGMENTS = eINSTANCE.getHierarchy_Judgments();

		/**
		 * The meta object literal for the '<em><b>Priorities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__PRIORITIES = eINSTANCE.getHierarchy_Priorities();

		/**
		 * The meta object literal for the '<em><b>Inconsistencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY__INCONSISTENCIES = eINSTANCE.getHierarchy_Inconsistencies();

		/**
		 * The meta object literal for the '<em><b>Find Judgment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIERARCHY___FIND_JUDGMENT__GOAL_CRITERION_CRITERION = eINSTANCE.getHierarchy__FindJudgment__Goal_Criterion_Criterion();

		/**
		 * The meta object literal for the '<em><b>Find Judgment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIERARCHY___FIND_JUDGMENT__CRITERION_ALTERNATIVE_ALTERNATIVE = eINSTANCE.getHierarchy__FindJudgment__Criterion_Alternative_Alternative();

		/**
		 * The meta object literal for the '<em><b>Update Priorities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIERARCHY___UPDATE_PRIORITIES = eINSTANCE.getHierarchy__UpdatePriorities();

		/**
		 * The meta object literal for the '{@link ahp.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.Named
		 * @see ahp.impl.AHPPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link ahp.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.GoalImpl
		 * @see ahp.impl.AHPPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__HIERARCHY = eINSTANCE.getGoal_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Get Inconsistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GOAL___GET_INCONSISTENCY = eINSTANCE.getGoal__GetInconsistency();

		/**
		 * The meta object literal for the '{@link ahp.impl.CriterionImpl <em>Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.CriterionImpl
		 * @see ahp.impl.AHPPackageImpl#getCriterion()
		 * @generated
		 */
		EClass CRITERION = eINSTANCE.getCriterion();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION__HIERARCHY = eINSTANCE.getCriterion_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Get Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRITERION___GET_PRIORITY = eINSTANCE.getCriterion__GetPriority();

		/**
		 * The meta object literal for the '<em><b>Get Inconsistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRITERION___GET_INCONSISTENCY = eINSTANCE.getCriterion__GetInconsistency();

		/**
		 * The meta object literal for the '{@link ahp.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.AlternativeImpl
		 * @see ahp.impl.AHPPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__HIERARCHY = eINSTANCE.getAlternative_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Get Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALTERNATIVE___GET_PRIORITY = eINSTANCE.getAlternative__GetPriority();

		/**
		 * The meta object literal for the '<em><b>Get Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALTERNATIVE___GET_PRIORITY__CRITERION = eINSTANCE.getAlternative__GetPriority__Criterion();

		/**
		 * The meta object literal for the '{@link ahp.impl.CriterionAlternativeImpl <em>Criterion Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.CriterionAlternativeImpl
		 * @see ahp.impl.AHPPackageImpl#getCriterionAlternative()
		 * @generated
		 */
		EClass CRITERION_ALTERNATIVE = eINSTANCE.getCriterionAlternative();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_ALTERNATIVE__CRITERION = eINSTANCE.getCriterionAlternative_Criterion();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_ALTERNATIVE__ALTERNATIVE = eINSTANCE.getCriterionAlternative_Alternative();

		/**
		 * The meta object literal for the '{@link ahp.impl.JudgmentImpl <em>Judgment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.JudgmentImpl
		 * @see ahp.impl.AHPPackageImpl#getJudgment()
		 * @generated
		 */
		EClass JUDGMENT = eINSTANCE.getJudgment();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUDGMENT__HIERARCHY = eINSTANCE.getJudgment_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUDGMENT__FIRST = eINSTANCE.getJudgment_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUDGMENT__SECOND = eINSTANCE.getJudgment_Second();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGMENT__WEIGHT = eINSTANCE.getJudgment_Weight();

		/**
		 * The meta object literal for the '<em><b>Check Operands Are Different</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getJudgment__CheckOperandsAreDifferent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Check Inverse Judgment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getJudgment__CheckInverseJudgment__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get Inverse Judgment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JUDGMENT___GET_INVERSE_JUDGMENT = eINSTANCE.getJudgment__GetInverseJudgment();

		/**
		 * The meta object literal for the '{@link ahp.impl.CriterionJudgmentImpl <em>Criterion Judgment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.CriterionJudgmentImpl
		 * @see ahp.impl.AHPPackageImpl#getCriterionJudgment()
		 * @generated
		 */
		EClass CRITERION_JUDGMENT = eINSTANCE.getCriterionJudgment();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_JUDGMENT__GOAL = eINSTANCE.getCriterionJudgment_Goal();

		/**
		 * The meta object literal for the '<em><b>Get Inverse Judgment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRITERION_JUDGMENT___GET_INVERSE_JUDGMENT = eINSTANCE.getCriterionJudgment__GetInverseJudgment();

		/**
		 * The meta object literal for the '{@link ahp.impl.AlternativeJudgmentImpl <em>Alternative Judgment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.AlternativeJudgmentImpl
		 * @see ahp.impl.AHPPackageImpl#getAlternativeJudgment()
		 * @generated
		 */
		EClass ALTERNATIVE_JUDGMENT = eINSTANCE.getAlternativeJudgment();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_JUDGMENT__CRITERION = eINSTANCE.getAlternativeJudgment_Criterion();

		/**
		 * The meta object literal for the '<em><b>Get Inverse Judgment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALTERNATIVE_JUDGMENT___GET_INVERSE_JUDGMENT = eINSTANCE.getAlternativeJudgment__GetInverseJudgment();

		/**
		 * The meta object literal for the '{@link ahp.impl.PriorityImpl <em>Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.PriorityImpl
		 * @see ahp.impl.AHPPackageImpl#getPriority()
		 * @generated
		 */
		EClass PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY__VALUE = eINSTANCE.getPriority_Value();

		/**
		 * The meta object literal for the '{@link ahp.impl.GoalCriterionPriorityImpl <em>Goal Criterion Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.GoalCriterionPriorityImpl
		 * @see ahp.impl.AHPPackageImpl#getGoalCriterionPriority()
		 * @generated
		 */
		EClass GOAL_CRITERION_PRIORITY = eINSTANCE.getGoalCriterionPriority();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_CRITERION_PRIORITY__GOAL = eINSTANCE.getGoalCriterionPriority_Goal();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_CRITERION_PRIORITY__CRITERION = eINSTANCE.getGoalCriterionPriority_Criterion();

		/**
		 * The meta object literal for the '{@link ahp.impl.CriterionAlternativePriorityImpl <em>Criterion Alternative Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.CriterionAlternativePriorityImpl
		 * @see ahp.impl.AHPPackageImpl#getCriterionAlternativePriority()
		 * @generated
		 */
		EClass CRITERION_ALTERNATIVE_PRIORITY = eINSTANCE.getCriterionAlternativePriority();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_ALTERNATIVE_PRIORITY__CRITERION = eINSTANCE.getCriterionAlternativePriority_Criterion();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_ALTERNATIVE_PRIORITY__ALTERNATIVE = eINSTANCE.getCriterionAlternativePriority_Alternative();

		/**
		 * The meta object literal for the '{@link ahp.impl.GoalAlternativePriorityImpl <em>Goal Alternative Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.GoalAlternativePriorityImpl
		 * @see ahp.impl.AHPPackageImpl#getGoalAlternativePriority()
		 * @generated
		 */
		EClass GOAL_ALTERNATIVE_PRIORITY = eINSTANCE.getGoalAlternativePriority();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ALTERNATIVE_PRIORITY__GOAL = eINSTANCE.getGoalAlternativePriority_Goal();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE = eINSTANCE.getGoalAlternativePriority_Alternative();

		/**
		 * The meta object literal for the '{@link ahp.impl.InconsistencyImpl <em>Inconsistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.InconsistencyImpl
		 * @see ahp.impl.AHPPackageImpl#getInconsistency()
		 * @generated
		 */
		EClass INCONSISTENCY = eINSTANCE.getInconsistency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCONSISTENCY__VALUE = eINSTANCE.getInconsistency_Value();

		/**
		 * The meta object literal for the '{@link ahp.impl.GoalInconsistencyImpl <em>Goal Inconsistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.GoalInconsistencyImpl
		 * @see ahp.impl.AHPPackageImpl#getGoalInconsistency()
		 * @generated
		 */
		EClass GOAL_INCONSISTENCY = eINSTANCE.getGoalInconsistency();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_INCONSISTENCY__GOAL = eINSTANCE.getGoalInconsistency_Goal();

		/**
		 * The meta object literal for the '{@link ahp.impl.CriterionInconsistencyImpl <em>Criterion Inconsistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.CriterionInconsistencyImpl
		 * @see ahp.impl.AHPPackageImpl#getCriterionInconsistency()
		 * @generated
		 */
		EClass CRITERION_INCONSISTENCY = eINSTANCE.getCriterionInconsistency();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION_INCONSISTENCY__CRITERION = eINSTANCE.getCriterionInconsistency_Criterion();

		/**
		 * The meta object literal for the '<em>Weight</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ahp.impl.AHPPackageImpl#getWeight()
		 * @generated
		 */
		EDataType WEIGHT = eINSTANCE.getWeight();

	}

} //AHPPackage
