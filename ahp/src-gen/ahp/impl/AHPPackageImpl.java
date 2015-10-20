/**
 */
package ahp.impl;

import ahp.AHPFactory;
import ahp.AHPPackage;
import ahp.Alternative;
import ahp.AlternativeJudgment;
import ahp.Criterion;
import ahp.CriterionAlternative;
import ahp.CriterionAlternativePriority;
import ahp.CriterionInconsistency;
import ahp.CriterionJudgment;
import ahp.Goal;
import ahp.GoalAlternativePriority;
import ahp.GoalCriterionPriority;
import ahp.GoalInconsistency;
import ahp.Hierarchy;
import ahp.Inconsistency;
import ahp.Judgment;
import ahp.Named;
import ahp.Priority;

import ahp.util.AHPValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AHPPackageImpl extends EPackageImpl implements AHPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass judgmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionJudgmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeJudgmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalCriterionPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionAlternativePriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalAlternativePriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inconsistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalInconsistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionInconsistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weightEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ahp.AHPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AHPPackageImpl() {
		super(eNS_URI, AHPFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AHPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AHPPackage init() {
		if (isInited) return (AHPPackage)EPackage.Registry.INSTANCE.getEPackage(AHPPackage.eNS_URI);

		// Obtain or create and register package
		AHPPackageImpl theAHPPackage = (AHPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AHPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AHPPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAHPPackage.createPackageContents();

		// Initialize created meta-data
		theAHPPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAHPPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AHPValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAHPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AHPPackage.eNS_URI, theAHPPackage);
		return theAHPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchy() {
		return hierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Goal() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Criteria() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Alternatives() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Judgments() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Priorities() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Inconsistencies() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHierarchy__FindJudgment__Goal_Criterion_Criterion() {
		return hierarchyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHierarchy__FindJudgment__Criterion_Alternative_Alternative() {
		return hierarchyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHierarchy__UpdatePriorities() {
		return hierarchyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Hierarchy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGoal__GetInconsistency() {
		return goalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterion() {
		return criterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterion_Hierarchy() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCriterion__GetPriority() {
		return criterionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCriterion__GetInconsistency() {
		return criterionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_Hierarchy() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAlternative__GetPriority() {
		return alternativeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAlternative__GetPriority__Criterion() {
		return alternativeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterionAlternative() {
		return criterionAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterionAlternative_Criterion() {
		return (EReference)criterionAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterionAlternative_Alternative() {
		return (EReference)criterionAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJudgment() {
		return judgmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJudgment_Hierarchy() {
		return (EReference)judgmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJudgment_First() {
		return (EReference)judgmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJudgment_Second() {
		return (EReference)judgmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJudgment_Weight() {
		return (EAttribute)judgmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJudgment__CheckOperandsAreDifferent__DiagnosticChain_Map() {
		return judgmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJudgment__CheckInverseJudgment__DiagnosticChain_Map() {
		return judgmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJudgment__GetInverseJudgment() {
		return judgmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterionJudgment() {
		return criterionJudgmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterionJudgment_Goal() {
		return (EReference)criterionJudgmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCriterionJudgment__GetInverseJudgment() {
		return criterionJudgmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeJudgment() {
		return alternativeJudgmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeJudgment_Criterion() {
		return (EReference)alternativeJudgmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAlternativeJudgment__GetInverseJudgment() {
		return alternativeJudgmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriority() {
		return priorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriority_Value() {
		return (EAttribute)priorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalCriterionPriority() {
		return goalCriterionPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalCriterionPriority_Goal() {
		return (EReference)goalCriterionPriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalCriterionPriority_Criterion() {
		return (EReference)goalCriterionPriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterionAlternativePriority() {
		return criterionAlternativePriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterionAlternativePriority_Criterion() {
		return (EReference)criterionAlternativePriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterionAlternativePriority_Alternative() {
		return (EReference)criterionAlternativePriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalAlternativePriority() {
		return goalAlternativePriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalAlternativePriority_Goal() {
		return (EReference)goalAlternativePriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalAlternativePriority_Alternative() {
		return (EReference)goalAlternativePriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInconsistency() {
		return inconsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInconsistency_Value() {
		return (EAttribute)inconsistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalInconsistency() {
		return goalInconsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalInconsistency_Goal() {
		return (EReference)goalInconsistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterionInconsistency() {
		return criterionInconsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriterionInconsistency_Criterion() {
		return (EReference)criterionInconsistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWeight() {
		return weightEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPFactory getAHPFactory() {
		return (AHPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hierarchyEClass = createEClass(HIERARCHY);
		createEReference(hierarchyEClass, HIERARCHY__GOAL);
		createEReference(hierarchyEClass, HIERARCHY__CRITERIA);
		createEReference(hierarchyEClass, HIERARCHY__ALTERNATIVES);
		createEReference(hierarchyEClass, HIERARCHY__JUDGMENTS);
		createEReference(hierarchyEClass, HIERARCHY__PRIORITIES);
		createEReference(hierarchyEClass, HIERARCHY__INCONSISTENCIES);
		createEOperation(hierarchyEClass, HIERARCHY___FIND_JUDGMENT__GOAL_CRITERION_CRITERION);
		createEOperation(hierarchyEClass, HIERARCHY___FIND_JUDGMENT__CRITERION_ALTERNATIVE_ALTERNATIVE);
		createEOperation(hierarchyEClass, HIERARCHY___UPDATE_PRIORITIES);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__HIERARCHY);
		createEOperation(goalEClass, GOAL___GET_INCONSISTENCY);

		criterionEClass = createEClass(CRITERION);
		createEReference(criterionEClass, CRITERION__HIERARCHY);
		createEOperation(criterionEClass, CRITERION___GET_PRIORITY);
		createEOperation(criterionEClass, CRITERION___GET_INCONSISTENCY);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__HIERARCHY);
		createEOperation(alternativeEClass, ALTERNATIVE___GET_PRIORITY);
		createEOperation(alternativeEClass, ALTERNATIVE___GET_PRIORITY__CRITERION);

		criterionAlternativeEClass = createEClass(CRITERION_ALTERNATIVE);
		createEReference(criterionAlternativeEClass, CRITERION_ALTERNATIVE__CRITERION);
		createEReference(criterionAlternativeEClass, CRITERION_ALTERNATIVE__ALTERNATIVE);

		judgmentEClass = createEClass(JUDGMENT);
		createEReference(judgmentEClass, JUDGMENT__HIERARCHY);
		createEReference(judgmentEClass, JUDGMENT__FIRST);
		createEReference(judgmentEClass, JUDGMENT__SECOND);
		createEAttribute(judgmentEClass, JUDGMENT__WEIGHT);
		createEOperation(judgmentEClass, JUDGMENT___CHECK_OPERANDS_ARE_DIFFERENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(judgmentEClass, JUDGMENT___CHECK_INVERSE_JUDGMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(judgmentEClass, JUDGMENT___GET_INVERSE_JUDGMENT);

		criterionJudgmentEClass = createEClass(CRITERION_JUDGMENT);
		createEReference(criterionJudgmentEClass, CRITERION_JUDGMENT__GOAL);
		createEOperation(criterionJudgmentEClass, CRITERION_JUDGMENT___GET_INVERSE_JUDGMENT);

		alternativeJudgmentEClass = createEClass(ALTERNATIVE_JUDGMENT);
		createEReference(alternativeJudgmentEClass, ALTERNATIVE_JUDGMENT__CRITERION);
		createEOperation(alternativeJudgmentEClass, ALTERNATIVE_JUDGMENT___GET_INVERSE_JUDGMENT);

		priorityEClass = createEClass(PRIORITY);
		createEAttribute(priorityEClass, PRIORITY__VALUE);

		goalCriterionPriorityEClass = createEClass(GOAL_CRITERION_PRIORITY);
		createEReference(goalCriterionPriorityEClass, GOAL_CRITERION_PRIORITY__GOAL);
		createEReference(goalCriterionPriorityEClass, GOAL_CRITERION_PRIORITY__CRITERION);

		criterionAlternativePriorityEClass = createEClass(CRITERION_ALTERNATIVE_PRIORITY);
		createEReference(criterionAlternativePriorityEClass, CRITERION_ALTERNATIVE_PRIORITY__CRITERION);
		createEReference(criterionAlternativePriorityEClass, CRITERION_ALTERNATIVE_PRIORITY__ALTERNATIVE);

		goalAlternativePriorityEClass = createEClass(GOAL_ALTERNATIVE_PRIORITY);
		createEReference(goalAlternativePriorityEClass, GOAL_ALTERNATIVE_PRIORITY__GOAL);
		createEReference(goalAlternativePriorityEClass, GOAL_ALTERNATIVE_PRIORITY__ALTERNATIVE);

		inconsistencyEClass = createEClass(INCONSISTENCY);
		createEAttribute(inconsistencyEClass, INCONSISTENCY__VALUE);

		goalInconsistencyEClass = createEClass(GOAL_INCONSISTENCY);
		createEReference(goalInconsistencyEClass, GOAL_INCONSISTENCY__GOAL);

		criterionInconsistencyEClass = createEClass(CRITERION_INCONSISTENCY);
		createEReference(criterionInconsistencyEClass, CRITERION_INCONSISTENCY__CRITERION);

		// Create data types
		weightEDataType = createEDataType(WEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter judgmentEClass_T = addETypeParameter(judgmentEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		goalEClass.getESuperTypes().add(this.getNamed());
		criterionEClass.getESuperTypes().add(this.getNamed());
		alternativeEClass.getESuperTypes().add(this.getNamed());
		EGenericType g1 = createEGenericType(this.getJudgment());
		EGenericType g2 = createEGenericType(this.getCriterion());
		g1.getETypeArguments().add(g2);
		criterionJudgmentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getJudgment());
		g2 = createEGenericType(this.getAlternative());
		g1.getETypeArguments().add(g2);
		alternativeJudgmentEClass.getEGenericSuperTypes().add(g1);
		goalCriterionPriorityEClass.getESuperTypes().add(this.getPriority());
		criterionAlternativePriorityEClass.getESuperTypes().add(this.getPriority());
		goalAlternativePriorityEClass.getESuperTypes().add(this.getPriority());
		goalInconsistencyEClass.getESuperTypes().add(this.getInconsistency());
		criterionInconsistencyEClass.getESuperTypes().add(this.getInconsistency());

		// Initialize classes, features, and operations; add parameters
		initEClass(hierarchyEClass, Hierarchy.class, "Hierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHierarchy_Goal(), this.getGoal(), this.getGoal_Hierarchy(), "goal", null, 1, 1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHierarchy_Criteria(), this.getCriterion(), this.getCriterion_Hierarchy(), "criteria", null, 1, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHierarchy_Alternatives(), this.getAlternative(), this.getAlternative_Hierarchy(), "alternatives", null, 2, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getJudgment());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getHierarchy_Judgments(), g1, this.getJudgment_Hierarchy(), "judgments", null, 0, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHierarchy_Priorities(), this.getPriority(), null, "priorities", null, 0, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHierarchy_Inconsistencies(), this.getInconsistency(), null, "inconsistencies", null, 0, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getHierarchy__FindJudgment__Goal_Criterion_Criterion(), this.getCriterionJudgment(), "findJudgment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoal(), "goal", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCriterion(), "first", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCriterion(), "second", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHierarchy__FindJudgment__Criterion_Alternative_Alternative(), this.getAlternativeJudgment(), "findJudgment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCriterion(), "criterion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlternative(), "first", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlternative(), "second", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getHierarchy__UpdatePriorities(), null, "updatePriorities", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Hierarchy(), this.getHierarchy(), this.getHierarchy_Goal(), "hierarchy", null, 1, 1, Goal.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGoal__GetInconsistency(), this.getGoalInconsistency(), "getInconsistency", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(criterionEClass, Criterion.class, "Criterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterion_Hierarchy(), this.getHierarchy(), this.getHierarchy_Criteria(), "hierarchy", null, 1, 1, Criterion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCriterion__GetPriority(), this.getGoalCriterionPriority(), "getPriority", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCriterion__GetInconsistency(), this.getCriterionInconsistency(), "getInconsistency", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_Hierarchy(), this.getHierarchy(), this.getHierarchy_Alternatives(), "hierarchy", null, 1, 1, Alternative.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAlternative__GetPriority(), this.getGoalAlternativePriority(), "getPriority", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAlternative__GetPriority__Criterion(), this.getCriterionAlternativePriority(), "getPriority", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCriterion(), "criterion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(criterionAlternativeEClass, CriterionAlternative.class, "CriterionAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterionAlternative_Criterion(), this.getCriterion(), null, "criterion", null, 1, 1, CriterionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterionAlternative_Alternative(), this.getAlternative(), null, "alternative", null, 1, 1, CriterionAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(judgmentEClass, Judgment.class, "Judgment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJudgment_Hierarchy(), this.getHierarchy(), this.getHierarchy_Judgments(), "hierarchy", null, 1, 1, Judgment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(judgmentEClass_T);
		initEReference(getJudgment_First(), g1, null, "first", null, 1, 1, Judgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(judgmentEClass_T);
		initEReference(getJudgment_Second(), g1, null, "second", null, 1, 1, Judgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJudgment_Weight(), this.getWeight(), "weight", "1", 1, 1, Judgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJudgment__CheckOperandsAreDifferent__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "checkOperandsAreDifferent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJudgment__CheckInverseJudgment__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "checkInverseJudgment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJudgment__GetInverseJudgment(), null, "getInverseJudgment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getJudgment());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(criterionJudgmentEClass, CriterionJudgment.class, "CriterionJudgment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterionJudgment_Goal(), this.getGoal(), null, "goal", null, 1, 1, CriterionJudgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCriterionJudgment__GetInverseJudgment(), this.getCriterionJudgment(), "getInverseJudgment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alternativeJudgmentEClass, AlternativeJudgment.class, "AlternativeJudgment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeJudgment_Criterion(), this.getCriterion(), null, "criterion", null, 1, 1, AlternativeJudgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAlternativeJudgment__GetInverseJudgment(), this.getAlternativeJudgment(), "getInverseJudgment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(priorityEClass, Priority.class, "Priority", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriority_Value(), theEcorePackage.getEDouble(), "value", null, 1, 1, Priority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalCriterionPriorityEClass, GoalCriterionPriority.class, "GoalCriterionPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalCriterionPriority_Goal(), this.getGoal(), null, "goal", null, 1, 1, GoalCriterionPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalCriterionPriority_Criterion(), this.getCriterion(), null, "criterion", null, 1, 1, GoalCriterionPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criterionAlternativePriorityEClass, CriterionAlternativePriority.class, "CriterionAlternativePriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterionAlternativePriority_Criterion(), this.getCriterion(), null, "criterion", null, 1, 1, CriterionAlternativePriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCriterionAlternativePriority_Alternative(), this.getAlternative(), null, "alternative", null, 1, 1, CriterionAlternativePriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalAlternativePriorityEClass, GoalAlternativePriority.class, "GoalAlternativePriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalAlternativePriority_Goal(), this.getGoal(), null, "goal", null, 1, 1, GoalAlternativePriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalAlternativePriority_Alternative(), this.getAlternative(), null, "alternative", null, 1, 1, GoalAlternativePriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inconsistencyEClass, Inconsistency.class, "Inconsistency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInconsistency_Value(), theEcorePackage.getEDouble(), "value", null, 1, 1, Inconsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalInconsistencyEClass, GoalInconsistency.class, "GoalInconsistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalInconsistency_Goal(), this.getGoal(), null, "goal", null, 1, 1, GoalInconsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criterionInconsistencyEClass, CriterionInconsistency.class, "CriterionInconsistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterionInconsistency_Criterion(), this.getCriterion(), null, "criterion", null, 1, 1, CriterionInconsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(weightEDataType, int.class, "Weight", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AHPPackageImpl
