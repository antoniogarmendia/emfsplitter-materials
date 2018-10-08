/**
 */
package WT.impl;

import WT.Connector;
import WT.InPort;
import WT.OutPort;
import WT.WTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WT.impl.ConnectorImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link WT.impl.ConnectorImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected InPort inPort;

	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected OutPort outPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getInPort() {
		if (inPort != null && inPort.eIsProxy()) {
			InternalEObject oldInPort = (InternalEObject)inPort;
			inPort = (InPort)eResolveProxy(oldInPort);
			if (inPort != oldInPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTPackage.CONNECTOR__IN_PORT, oldInPort, inPort));
			}
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort basicGetInPort() {
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(InPort newInPort) {
		InPort oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTPackage.CONNECTOR__IN_PORT, oldInPort, inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getOutPort() {
		if (outPort != null && outPort.eIsProxy()) {
			InternalEObject oldOutPort = (InternalEObject)outPort;
			outPort = (OutPort)eResolveProxy(oldOutPort);
			if (outPort != oldOutPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTPackage.CONNECTOR__OUT_PORT, oldOutPort, outPort));
			}
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetOutPort() {
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPort(OutPort newOutPort) {
		OutPort oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTPackage.CONNECTOR__OUT_PORT, oldOutPort, outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTPackage.CONNECTOR__IN_PORT:
				if (resolve) return getInPort();
				return basicGetInPort();
			case WTPackage.CONNECTOR__OUT_PORT:
				if (resolve) return getOutPort();
				return basicGetOutPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTPackage.CONNECTOR__IN_PORT:
				setInPort((InPort)newValue);
				return;
			case WTPackage.CONNECTOR__OUT_PORT:
				setOutPort((OutPort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WTPackage.CONNECTOR__IN_PORT:
				setInPort((InPort)null);
				return;
			case WTPackage.CONNECTOR__OUT_PORT:
				setOutPort((OutPort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WTPackage.CONNECTOR__IN_PORT:
				return inPort != null;
			case WTPackage.CONNECTOR__OUT_PORT:
				return outPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
