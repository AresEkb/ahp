/**
 */
package ahp.tests;

import ahp.AHPFactory;
import ahp.CriterionAlternativePriority;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Criterion Alternative Priority</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriterionAlternativePriorityTest extends PriorityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CriterionAlternativePriorityTest.class);
	}

	/**
	 * Constructs a new Criterion Alternative Priority test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionAlternativePriorityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Criterion Alternative Priority test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CriterionAlternativePriority getFixture() {
		return (CriterionAlternativePriority)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AHPFactory.eINSTANCE.createCriterionAlternativePriority());
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

} //CriterionAlternativePriorityTest
