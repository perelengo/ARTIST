/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpactImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.PatternImpactImpl#getImpact <em>Impact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpactImpl extends MinimalEObjectImpl.Container implements PatternImpact
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Pattern target;

  /**
   * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpact()
   * @generated
   * @ordered
   */
  protected static final BigDecimal IMPACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImpact() <em>Impact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpact()
   * @generated
   * @ordered
   */
  protected BigDecimal impact = IMPACT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpactImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TslPackage.Literals.PATTERN_IMPACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Pattern)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TslPackage.PATTERN_IMPACT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Pattern newTarget)
  {
    Pattern oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PATTERN_IMPACT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getImpact()
  {
    return impact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpact(BigDecimal newImpact)
  {
    BigDecimal oldImpact = impact;
    impact = newImpact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PATTERN_IMPACT__IMPACT, oldImpact, impact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TslPackage.PATTERN_IMPACT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case TslPackage.PATTERN_IMPACT__IMPACT:
        return getImpact();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TslPackage.PATTERN_IMPACT__TARGET:
        setTarget((Pattern)newValue);
        return;
      case TslPackage.PATTERN_IMPACT__IMPACT:
        setImpact((BigDecimal)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TslPackage.PATTERN_IMPACT__TARGET:
        setTarget((Pattern)null);
        return;
      case TslPackage.PATTERN_IMPACT__IMPACT:
        setImpact(IMPACT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TslPackage.PATTERN_IMPACT__TARGET:
        return target != null;
      case TslPackage.PATTERN_IMPACT__IMPACT:
        return IMPACT_EDEFAULT == null ? impact != null : !IMPACT_EDEFAULT.equals(impact);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (impact: ");
    result.append(impact);
    result.append(')');
    return result.toString();
  }

} //PatternImpactImpl
