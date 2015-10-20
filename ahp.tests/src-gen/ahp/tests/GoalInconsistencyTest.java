/**
 */
package ahp.tests;

import ahp.AHPFactory;
import ahp.GoalInconsistency;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goal Inconsistency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalInconsistencyTest extends InconsistencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoalInconsistencyTest.class);
	}

	/**
	 * Constructs a new Goal Inconsistency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalInconsistencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Goal Inconsistency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GoalInconsistency getFixture() {
		return (GoalInconsistency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AHPFactory.eINSTANCE.createGoalInconsistency());
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

} //GoalInconsistencyTest
