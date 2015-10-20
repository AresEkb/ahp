/**
 */
package ahp.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ahp</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AHPTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AHPTests("ahp Tests");
		suite.addTestSuite(HierarchyTest.class);
		suite.addTestSuite(GoalTest.class);
		suite.addTestSuite(CriterionTest.class);
		suite.addTestSuite(AlternativeTest.class);
		suite.addTestSuite(CriterionJudgmentTest.class);
		suite.addTestSuite(AlternativeJudgmentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AHPTests(String name) {
		super(name);
	}

} //AHPTests
