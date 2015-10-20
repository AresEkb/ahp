/**
 */
package ahp.tests;

import ahp.AHPFactory;
import ahp.CriterionInconsistency;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Criterion Inconsistency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriterionInconsistencyTest extends InconsistencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CriterionInconsistencyTest.class);
	}

	/**
	 * Constructs a new Criterion Inconsistency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionInconsistencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Criterion Inconsistency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CriterionInconsistency getFixture() {
		return (CriterionInconsistency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AHPFactory.eINSTANCE.createCriterionInconsistency());
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

} //CriterionInconsistencyTest
