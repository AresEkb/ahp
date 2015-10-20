/**
 */
package ahp.tests;

import ahp.AHPFactory;
import ahp.GoalCriterionPriority;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goal Criterion Priority</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalCriterionPriorityTest extends PriorityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoalCriterionPriorityTest.class);
	}

	/**
	 * Constructs a new Goal Criterion Priority test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalCriterionPriorityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Goal Criterion Priority test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GoalCriterionPriority getFixture() {
		return (GoalCriterionPriority)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AHPFactory.eINSTANCE.createGoalCriterionPriority());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GoalCriterionPriorityTest
