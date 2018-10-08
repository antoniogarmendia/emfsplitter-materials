/**
 */
package WT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WT.Connector#getInPort <em>In Port</em>}</li>
 *   <li>{@link WT.Connector#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see WT.WTPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' reference.
	 * @see #setInPort(InPort)
	 * @see WT.WTPackage#getConnector_InPort()
	 * @model
	 * @generated
	 */
	InPort getInPort();

	/**
	 * Sets the value of the '{@link WT.Connector#getInPort <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(InPort value);

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' reference.
	 * @see #setOutPort(OutPort)
	 * @see WT.WTPackage#getConnector_OutPort()
	 * @model
	 * @generated
	 */
	OutPort getOutPort();

	/**
	 * Sets the value of the '{@link WT.Connector#getOutPort <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(OutPort value);

} // Connector
