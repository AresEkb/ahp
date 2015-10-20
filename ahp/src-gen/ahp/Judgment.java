/**
 */
package ahp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Judgment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ahp.Judgment#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link ahp.Judgment#getFirst <em>First</em>}</li>
 *   <li>{@link ahp.Judgment#getSecond <em>Second</em>}</li>
 *   <li>{@link ahp.Judgment#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see ahp.AHPPackage#getJudgment()
 * @model abstract="true"
 * @generated
 */
public interface Judgment<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ahp.Hierarchy#getJudgments <em>Judgments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' container reference.
	 * @see #setHierarchy(Hierarchy)
	 * @see ahp.AHPPackage#getJudgment_Hierarchy()
	 * @see ahp.Hierarchy#getJudgments
	 * @model opposite="judgments" required="true"
	 * @generated
	 */
	Hierarchy getHierarchy();

	/**
	 * Sets the value of the '{@link ahp.Judgment#getHierarchy <em>Hierarchy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy</em>' container reference.
	 * @see #getHierarchy()
	 * @generated
	 */
	void setHierarchy(Hierarchy value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Object)
	 * @see ahp.AHPPackage#getJudgment_First()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	T getFirst();

	/**
	 * Sets the value of the '{@link ahp.Judgment#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(T value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(Object)
	 * @see ahp.AHPPackage#getJudgment_Second()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	T getSecond();

	/**
	 * Sets the value of the '{@link ahp.Judgment#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(T value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see ahp.AHPPackage#getJudgment_Weight()
	 * @model default="1" unique="false" dataType="ahp.Weight" required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link ahp.Judgment#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\nT _first = this.getFirst();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_first, null));\nif (!_notEquals)\n{\n\t_and_1 = false;\n} else\n{\n\tT _first_1 = this.getFirst();\n\tT _second = this.getSecond();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_first_1, _second);\n\t_and_1 = _equals;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\tint _weight = this.getWeight();\n\tboolean _notEquals_1 = (_weight != 1);\n\t_and = _notEquals_1;\n}\nif (_and)\n{\n\tboolean _notEquals_2 = (!<%com.google.common.base.Objects%>.equal(diagnostics, null));\n\tif (_notEquals_2)\n\t{\n\t\t<%org.eclipse.emf.common.util.BasicDiagnostic%> _basicDiagnostic = new <%org.eclipse.emf.common.util.BasicDiagnostic%>(\n\t\t\t<%org.eclipse.emf.common.util.Diagnostic%>.ERROR, \n\t\t\t\"DIAGNOSTIC_SOURCE\", \n\t\t\t0, \n\t\t\t\"First and second must not be equal\", \n\t\t\tnull);\n\t\tdiagnostics.add(_basicDiagnostic);\n\t}\n\treturn false;\n}\nreturn true;'"
	 * @generated
	 */
	boolean checkOperandsAreDifferent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\n<%ahp.Judgment%><?> _inverseJudgment = this.getInverseJudgment();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_inverseJudgment, null));\nif (!_notEquals)\n{\n\t_and = false;\n} else\n{\n\t<%ahp.Judgment%><?> _inverseJudgment_1 = this.getInverseJudgment();\n\tint _weight = _inverseJudgment_1.getWeight();\n\tint _weight_1 = this.getWeight();\n\tint _minus = (-_weight_1);\n\tboolean _notEquals_1 = (_weight != _minus);\n\t_and = _notEquals_1;\n}\nif (_and)\n{\n\tboolean _notEquals_2 = (!<%com.google.common.base.Objects%>.equal(diagnostics, null));\n\tif (_notEquals_2)\n\t{\n\t\t<%org.eclipse.emf.common.util.BasicDiagnostic%> _basicDiagnostic = new <%org.eclipse.emf.common.util.BasicDiagnostic%>(\n\t\t\t<%org.eclipse.emf.common.util.Diagnostic%>.ERROR, \n\t\t\t\"DIAGNOSTIC_SOURCE\", \n\t\t\t0, \n\t\t\t\"Wrong inverse judgment\", \n\t\t\tnull);\n\t\tdiagnostics.add(_basicDiagnostic);\n\t}\n\treturn false;\n}\nreturn true;'"
	 * @generated
	 */
	boolean checkInverseJudgment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Judgment<?> getInverseJudgment();

} // Judgment
