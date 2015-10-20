/**
 */
package ahp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inconsistency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.Inconsistency#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getInconsistency()
 * @model abstract="true"
 * @generated
 */
public interface Inconsistency extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see ahp.AHPPackage#getInconsistency_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link ahp.Inconsistency#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Inconsistency
