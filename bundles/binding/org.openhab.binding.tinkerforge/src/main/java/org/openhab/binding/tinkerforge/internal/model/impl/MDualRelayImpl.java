/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openhab.binding.tinkerforge.internal.LoggerConstants;
import org.openhab.binding.tinkerforge.internal.TinkerforgeErrorHandler;
import org.openhab.binding.tinkerforge.internal.model.MBaseDevice;
import org.openhab.binding.tinkerforge.internal.model.MDualRelay;
import org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet;
import org.openhab.binding.tinkerforge.internal.model.MSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;
import org.openhab.binding.tinkerforge.internal.types.OnOffValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerforge.BrickletDualRelay.State;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MDual Relay</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.3.0
 *        <!-- end-user-doc -->
 *        <p>
 *        The following features are implemented:
 *        <ul>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getSwitchState
 *        <em>Switch State</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getLogger <em>Logger</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getUid <em>Uid</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#isPoll <em>Poll</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getEnabledA <em>Enabled A</em>}
 *        </li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getSubId <em>Sub Id</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getMbrick <em>Mbrick</em>}</li>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl#getDeviceType
 *        <em>Device Type</em>}</li>
 *        </ul>
 *        </p>
 *
 * @generated
 */
public class MDualRelayImpl extends MinimalEObjectImpl.Container implements MDualRelay {
    /**
     * The default value of the '{@link #getSwitchState() <em>Switch State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSwitchState()
     * @generated
     * @ordered
     */
    protected static final OnOffValue SWITCH_STATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchState() <em>Switch State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSwitchState()
     * @generated
     * @ordered
     */
    protected OnOffValue switchState = SWITCH_STATE_EDEFAULT;

    /**
     * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected static final Logger LOGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected Logger logger = LOGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected static final String UID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected String uid = UID_EDEFAULT;

    /**
     * The default value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected static final boolean POLL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected boolean poll = POLL_EDEFAULT;

    /**
     * The default value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected static final AtomicBoolean ENABLED_A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected AtomicBoolean enabledA = ENABLED_A_EDEFAULT;

    /**
     * The default value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSubId()
     * @generated
     * @ordered
     */
    protected static final String SUB_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSubId()
     * @generated
     * @ordered
     */
    protected String subId = SUB_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected static final String DEVICE_TYPE_EDEFAULT = "dual_relay";

    /**
     * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected String deviceType = DEVICE_TYPE_EDEFAULT;

    private short relayNum;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MDualRelayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.MDUAL_RELAY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public OnOffValue getSwitchState() {
        return switchState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Logger getLogger() {
        return logger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLogger(Logger newLogger) {
        Logger oldLogger = logger;
        logger = newLogger;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__LOGGER, oldLogger, logger));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getUid() {
        return uid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUid(String newUid) {
        String oldUid = uid;
        uid = newUid;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__UID, oldUid, uid));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isPoll() {
        return poll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPoll(boolean newPoll) {
        boolean oldPoll = poll;
        poll = newPoll;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__POLL, oldPoll, poll));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AtomicBoolean getEnabledA() {
        return enabledA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setEnabledA(AtomicBoolean newEnabledA) {
        AtomicBoolean oldEnabledA = enabledA;
        enabledA = newEnabledA;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__ENABLED_A, oldEnabledA,
                    enabledA));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getSubId() {
        return subId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSubId(String newSubId) {
        String oldSubId = subId;
        subId = newSubId;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__SUB_ID, oldSubId, subId));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MDualRelayBricklet getMbrick() {
        if (eContainerFeatureID() != ModelPackage.MDUAL_RELAY__MBRICK) {
            return null;
        }
        return (MDualRelayBricklet) eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMbrick(MDualRelayBricklet newMbrick, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newMbrick, ModelPackage.MDUAL_RELAY__MBRICK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMbrick(MDualRelayBricklet newMbrick) {
        if (newMbrick != eInternalContainer()
                || (eContainerFeatureID() != ModelPackage.MDUAL_RELAY__MBRICK && newMbrick != null)) {
            if (EcoreUtil.isAncestor(this, newMbrick)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            }
            NotificationChain msgs = null;
            if (eInternalContainer() != null) {
                msgs = eBasicRemoveFromContainer(msgs);
            }
            if (newMbrick != null) {
                msgs = ((InternalEObject) newMbrick).eInverseAdd(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES,
                        MSubDeviceHolder.class, msgs);
            }
            msgs = basicSetMbrick(newMbrick, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__MBRICK, newMbrick,
                    newMbrick));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY__MBRICK:
                if (eInternalContainer() != null) {
                    msgs = eBasicRemoveFromContainer(msgs);
                }
                return basicSetMbrick((MDualRelayBricklet) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY__MBRICK:
                return basicSetMbrick(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ModelPackage.MDUAL_RELAY__MBRICK:
                return eInternalContainer().eInverseRemove(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES,
                        MSubDeviceHolder.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY__SWITCH_STATE:
                return getSwitchState();
            case ModelPackage.MDUAL_RELAY__LOGGER:
                return getLogger();
            case ModelPackage.MDUAL_RELAY__UID:
                return getUid();
            case ModelPackage.MDUAL_RELAY__POLL:
                return isPoll();
            case ModelPackage.MDUAL_RELAY__ENABLED_A:
                return getEnabledA();
            case ModelPackage.MDUAL_RELAY__SUB_ID:
                return getSubId();
            case ModelPackage.MDUAL_RELAY__MBRICK:
                return getMbrick();
            case ModelPackage.MDUAL_RELAY__DEVICE_TYPE:
                return getDeviceType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY__SWITCH_STATE:
                setSwitchState((OnOffValue) newValue);
                return;
            case ModelPackage.MDUAL_RELAY__LOGGER:
                setLogger((Logger) newValue);
                return;
            case ModelPackage.MDUAL_RELAY__UID:
                setUid((String) newValue);
                return;
            case ModelPackage.MDUAL_RELAY__POLL:
                setPoll((Boolean) newValue);
                return;
            case ModelPackage.MDUAL_RELAY__ENABLED_A:
                setEnabledA((AtomicBoolean) newValue);
                return;
            case ModelPackage.MDUAL_RELAY__SUB_ID:
                setSubId((String) newValue);
                return;
            case ModelPackage.MDUAL_RELAY__MBRICK:
                setMbrick((MDualRelayBricklet) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY__SWITCH_STATE:
                setSwitchState(SWITCH_STATE_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY__LOGGER:
                setLogger(LOGGER_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY__UID:
                setUid(UID_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY__POLL:
                setPoll(POLL_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY__ENABLED_A:
                setEnabledA(ENABLED_A_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY__SUB_ID:
                setSubId(SUB_ID_EDEFAULT);
                return;
            case ModelPackage.MDUAL_RELAY__MBRICK:
                setMbrick((MDualRelayBricklet) null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.MDUAL_RELAY__SWITCH_STATE:
                return SWITCH_STATE_EDEFAULT == null ? switchState != null : !SWITCH_STATE_EDEFAULT.equals(switchState);
            case ModelPackage.MDUAL_RELAY__LOGGER:
                return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
            case ModelPackage.MDUAL_RELAY__UID:
                return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
            case ModelPackage.MDUAL_RELAY__POLL:
                return poll != POLL_EDEFAULT;
            case ModelPackage.MDUAL_RELAY__ENABLED_A:
                return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
            case ModelPackage.MDUAL_RELAY__SUB_ID:
                return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
            case ModelPackage.MDUAL_RELAY__MBRICK:
                return getMbrick() != null;
            case ModelPackage.MDUAL_RELAY__DEVICE_TYPE:
                return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MBaseDevice.class) {
            switch (derivedFeatureID) {
                case ModelPackage.MDUAL_RELAY__LOGGER:
                    return ModelPackage.MBASE_DEVICE__LOGGER;
                case ModelPackage.MDUAL_RELAY__UID:
                    return ModelPackage.MBASE_DEVICE__UID;
                case ModelPackage.MDUAL_RELAY__POLL:
                    return ModelPackage.MBASE_DEVICE__POLL;
                case ModelPackage.MDUAL_RELAY__ENABLED_A:
                    return ModelPackage.MBASE_DEVICE__ENABLED_A;
                default:
                    return -1;
            }
        }
        if (baseClass == MSubDevice.class) {
            switch (derivedFeatureID) {
                case ModelPackage.MDUAL_RELAY__SUB_ID:
                    return ModelPackage.MSUB_DEVICE__SUB_ID;
                case ModelPackage.MDUAL_RELAY__MBRICK:
                    return ModelPackage.MSUB_DEVICE__MBRICK;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MBaseDevice.class) {
            switch (baseFeatureID) {
                case ModelPackage.MBASE_DEVICE__LOGGER:
                    return ModelPackage.MDUAL_RELAY__LOGGER;
                case ModelPackage.MBASE_DEVICE__UID:
                    return ModelPackage.MDUAL_RELAY__UID;
                case ModelPackage.MBASE_DEVICE__POLL:
                    return ModelPackage.MDUAL_RELAY__POLL;
                case ModelPackage.MBASE_DEVICE__ENABLED_A:
                    return ModelPackage.MDUAL_RELAY__ENABLED_A;
                default:
                    return -1;
            }
        }
        if (baseClass == MSubDevice.class) {
            switch (baseFeatureID) {
                case ModelPackage.MSUB_DEVICE__SUB_ID:
                    return ModelPackage.MDUAL_RELAY__SUB_ID;
                case ModelPackage.MSUB_DEVICE__MBRICK:
                    return ModelPackage.MDUAL_RELAY__MBRICK;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == MBaseDevice.class) {
            switch (baseOperationID) {
                case ModelPackage.MBASE_DEVICE___INIT:
                    return ModelPackage.MDUAL_RELAY___INIT;
                case ModelPackage.MBASE_DEVICE___ENABLE:
                    return ModelPackage.MDUAL_RELAY___ENABLE;
                case ModelPackage.MBASE_DEVICE___DISABLE:
                    return ModelPackage.MDUAL_RELAY___DISABLE;
                default:
                    return -1;
            }
        }
        if (baseClass == MSubDevice.class) {
            switch (baseOperationID) {
                default:
                    return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.MDUAL_RELAY___INIT:
                init();
                return null;
            case ModelPackage.MDUAL_RELAY___ENABLE:
                enable();
                return null;
            case ModelPackage.MDUAL_RELAY___DISABLE:
                disable();
                return null;
            case ModelPackage.MDUAL_RELAY___TURN_SWITCH__ONOFFVALUE:
                turnSwitch((OnOffValue) arguments.get(0));
                return null;
            case ModelPackage.MDUAL_RELAY___FETCH_SWITCH_STATE:
                fetchSwitchState();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (switchState: ");
        result.append(switchState);
        result.append(", logger: ");
        result.append(logger);
        result.append(", uid: ");
        result.append(uid);
        result.append(", poll: ");
        result.append(poll);
        result.append(", enabledA: ");
        result.append(enabledA);
        result.append(", subId: ");
        result.append(subId);
        result.append(", deviceType: ");
        result.append(deviceType);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void init() {
        setEnabledA(new AtomicBoolean());
        poll = true; // don't use the setter to prevent notification
        logger = LoggerFactory.getLogger(MDualRelayBrickletImpl.class);
        relayNum = Short.parseShort(String.valueOf(subId.charAt(subId.length() - 1)));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void enable() {
        logger.debug("enable called on MDualRelayImpl");
        fetchSwitchState();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void disable() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void turnSwitch(OnOffValue state) {
        logger.debug("setSwitchState called on: {}", MDualRelayImpl.class);
        try {
            if (state == OnOffValue.OFF) {
                logger.debug("setSwitchState off");
                getMbrick().getTinkerforgeDevice().setSelectedState(relayNum, false);
            } else if (state == OnOffValue.ON) {
                logger.debug("setSwitchState on");
                getMbrick().getTinkerforgeDevice().setSelectedState(relayNum, true);
            } else {
                logger.error("{} unkown switchstate {}", LoggerConstants.TFMODELUPDATE, state);
            }
            setSwitchState(state);
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void fetchSwitchState() {
        OnOffValue switchValue = OnOffValue.UNDEF;
        try {
            State state = getMbrick().getTinkerforgeDevice().getState();
            if (relayNum == 1) {
                switchValue = (state.relay1) ? OnOffValue.ON : OnOffValue.OFF;
            } else {
                switchValue = (state.relay2) ? OnOffValue.ON : OnOffValue.OFF;
            }
            setSwitchState(switchValue);
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
        setSwitchState(switchValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSwitchState(OnOffValue newSwitchState) {
        OnOffValue oldSwitchState = switchState;
        switchState = newSwitchState;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MDUAL_RELAY__SWITCH_STATE,
                    oldSwitchState, switchState));
        }
    }

} // MDualRelayImpl
