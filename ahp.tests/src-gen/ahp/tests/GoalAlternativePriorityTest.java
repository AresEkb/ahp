/**
 */
package ahp.tests;

import ahp.AHPFactory;
import ahp.GoalAlternativePriority;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goal Alternative Priority</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalAlternativePriorityTest extends PriorityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoalAlternativePriorityTest.class);
	}

	/**
	 * Constructs a new Goal Alternative Priority test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalAlternativePriorityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Goal Alternative Priority test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GoalAlternativePriority getFixture() {
		return (GoalAlternativePriority)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AHPFactory.eINSTANCE.createGoalAlternativePriority());
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

} //GoalAlternativePriorityTest
