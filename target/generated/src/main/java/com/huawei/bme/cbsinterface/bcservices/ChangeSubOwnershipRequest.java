
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountInfo;
import com.huawei.bme.cbsinterface.bccommon.ActiveMode;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustInfo;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OfferingInst;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.PayRelExtRule;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;


/**
 * <p>Java class for ChangeSubOwnershipRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubOwnershipRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OldOwnership"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NewOwnership"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RegisterCustomer"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
 *                               &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="OpType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UserCustomer" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
 *                               &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Account" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Subscriber"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubDFTAcct"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="AcctList" maxOccurs="2"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                   &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                   &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
 *                                                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                   &lt;element name="PaymentLimitInfo"&gt;
 *                                                     &lt;complexType&gt;
 *                                                       &lt;complexContent&gt;
 *                                                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
 *                                                         &lt;/extension&gt;
 *                                                       &lt;/complexContent&gt;
 *                                                     &lt;/complexType&gt;
 *                                                   &lt;/element&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShiftPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OldPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NewPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PrimaryOffering" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SupplementaryOffering" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ShiftOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OldOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                                       &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                                       &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ControlProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeSubOwnershipRequest", propOrder = {
    "oldOwnership",
    "newOwnership"
})
public class ChangeSubOwnershipRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OldOwnership", required = true)
    protected ChangeSubOwnershipRequest.OldOwnership oldOwnership;
    @XmlElement(name = "NewOwnership", required = true)
    protected ChangeSubOwnershipRequest.NewOwnership newOwnership;

    /**
     * Gets the value of the oldOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubOwnershipRequest.OldOwnership }
     *     
     */
    public ChangeSubOwnershipRequest.OldOwnership getOldOwnership() {
        return oldOwnership;
    }

    /**
     * Sets the value of the oldOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubOwnershipRequest.OldOwnership }
     *     
     */
    public void setOldOwnership(ChangeSubOwnershipRequest.OldOwnership value) {
        this.oldOwnership = value;
    }

    /**
     * Gets the value of the newOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubOwnershipRequest.NewOwnership }
     *     
     */
    public ChangeSubOwnershipRequest.NewOwnership getNewOwnership() {
        return newOwnership;
    }

    /**
     * Sets the value of the newOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubOwnershipRequest.NewOwnership }
     *     
     */
    public void setNewOwnership(ChangeSubOwnershipRequest.NewOwnership value) {
        this.newOwnership = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RegisterCustomer"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
     *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="OpType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="UserCustomer" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
     *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Account" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Subscriber"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubDFTAcct"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="AcctList" maxOccurs="2"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;sequence&gt;
     *                                         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                         &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;/sequence&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;sequence&gt;
     *                                         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                         &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
     *                                         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;/sequence&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;sequence&gt;
     *                                         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                         &lt;element name="PaymentLimitInfo"&gt;
     *                                           &lt;complexType&gt;
     *                                             &lt;complexContent&gt;
     *                                               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
     *                                               &lt;/extension&gt;
     *                                             &lt;/complexContent&gt;
     *                                           &lt;/complexType&gt;
     *                                         &lt;/element&gt;
     *                                       &lt;/sequence&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShiftPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OldPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NewPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PrimaryOffering" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SupplementaryOffering" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ShiftOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OldOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                             &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ControlProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registerCustomer",
        "userCustomer",
        "account",
        "addressInfo",
        "subscriber",
        "primaryOffering",
        "supplementaryOffering",
        "controlProperty"
    })
    public static class NewOwnership
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "RegisterCustomer", required = true)
        protected ChangeSubOwnershipRequest.NewOwnership.RegisterCustomer registerCustomer;
        @XmlElement(name = "UserCustomer")
        protected ChangeSubOwnershipRequest.NewOwnership.UserCustomer userCustomer;
        @XmlElement(name = "Account")
        protected List<ChangeSubOwnershipRequest.NewOwnership.Account> account;
        @XmlElement(name = "AddressInfo")
        protected List<Address> addressInfo;
        @XmlElement(name = "Subscriber", required = true)
        protected ChangeSubOwnershipRequest.NewOwnership.Subscriber subscriber;
        @XmlElement(name = "PrimaryOffering")
        protected ChangeSubOwnershipRequest.NewOwnership.PrimaryOffering primaryOffering;
        @XmlElement(name = "SupplementaryOffering")
        protected ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering supplementaryOffering;
        @XmlElement(name = "ControlProperty")
        protected List<SimpleProperty> controlProperty;

        /**
         * Gets the value of the registerCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.RegisterCustomer }
         *     
         */
        public ChangeSubOwnershipRequest.NewOwnership.RegisterCustomer getRegisterCustomer() {
            return registerCustomer;
        }

        /**
         * Sets the value of the registerCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.RegisterCustomer }
         *     
         */
        public void setRegisterCustomer(ChangeSubOwnershipRequest.NewOwnership.RegisterCustomer value) {
            this.registerCustomer = value;
        }

        /**
         * Gets the value of the userCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.UserCustomer }
         *     
         */
        public ChangeSubOwnershipRequest.NewOwnership.UserCustomer getUserCustomer() {
            return userCustomer;
        }

        /**
         * Sets the value of the userCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.UserCustomer }
         *     
         */
        public void setUserCustomer(ChangeSubOwnershipRequest.NewOwnership.UserCustomer value) {
            this.userCustomer = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubOwnershipRequest.NewOwnership.Account }
         * 
         * 
         */
        public List<ChangeSubOwnershipRequest.NewOwnership.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.Account>();
            }
            return this.account;
        }

        /**
         * Gets the value of the addressInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         * 
         * 
         */
        public List<Address> getAddressInfo() {
            if (addressInfo == null) {
                addressInfo = new ArrayList<Address>();
            }
            return this.addressInfo;
        }

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber }
         *     
         */
        public ChangeSubOwnershipRequest.NewOwnership.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber }
         *     
         */
        public void setSubscriber(ChangeSubOwnershipRequest.NewOwnership.Subscriber value) {
            this.subscriber = value;
        }

        /**
         * Gets the value of the primaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.PrimaryOffering }
         *     
         */
        public ChangeSubOwnershipRequest.NewOwnership.PrimaryOffering getPrimaryOffering() {
            return primaryOffering;
        }

        /**
         * Sets the value of the primaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.PrimaryOffering }
         *     
         */
        public void setPrimaryOffering(ChangeSubOwnershipRequest.NewOwnership.PrimaryOffering value) {
            this.primaryOffering = value;
        }

        /**
         * Gets the value of the supplementaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering }
         *     
         */
        public ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering getSupplementaryOffering() {
            return supplementaryOffering;
        }

        /**
         * Sets the value of the supplementaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering }
         *     
         */
        public void setSupplementaryOffering(ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering value) {
            this.supplementaryOffering = value;
        }

        /**
         * Gets the value of the controlProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controlProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getControlProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getControlProperty() {
            if (controlProperty == null) {
                controlProperty = new ArrayList<SimpleProperty>();
            }
            return this.controlProperty;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "acctKey",
            "acctInfo"
        })
        public static class Account
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AcctKey", required = true)
            protected String acctKey;
            @XmlElement(name = "AcctInfo")
            protected AccountInfo acctInfo;

            /**
             * Gets the value of the acctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctKey() {
                return acctKey;
            }

            /**
             * Sets the value of the acctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctKey(String value) {
                this.acctKey = value;
            }

            /**
             * Gets the value of the acctInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AccountInfo }
             *     
             */
            public AccountInfo getAcctInfo() {
                return acctInfo;
            }

            /**
             * Sets the value of the acctInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccountInfo }
             *     
             */
            public void setAcctInfo(AccountInfo value) {
                this.acctInfo = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "newOfferingKey"
        })
        public static class PrimaryOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "NewOfferingKey")
            protected OfferingKey newOfferingKey;

            /**
             * Gets the value of the newOfferingKey property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingKey }
             *     
             */
            public OfferingKey getNewOfferingKey() {
                return newOfferingKey;
            }

            /**
             * Sets the value of the newOfferingKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingKey }
             *     
             */
            public void setNewOfferingKey(OfferingKey value) {
                this.newOfferingKey = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
         *         &lt;choice&gt;
         *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
         *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="OpType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "custKey",
            "custInfo",
            "individualInfo",
            "orgInfo"
        })
        public static class RegisterCustomer
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "CustKey", required = true)
            protected String custKey;
            @XmlElement(name = "CustInfo")
            protected CustInfo custInfo;
            @XmlElement(name = "IndividualInfo")
            protected IndividualInfo individualInfo;
            @XmlElement(name = "OrgInfo")
            protected OrgInfo orgInfo;
            @XmlAttribute(name = "OpType", required = true)
            protected String opType;

            /**
             * Gets the value of the custKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustKey() {
                return custKey;
            }

            /**
             * Sets the value of the custKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustKey(String value) {
                this.custKey = value;
            }

            /**
             * Gets the value of the custInfo property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfo }
             *     
             */
            public CustInfo getCustInfo() {
                return custInfo;
            }

            /**
             * Sets the value of the custInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfo }
             *     
             */
            public void setCustInfo(CustInfo value) {
                this.custInfo = value;
            }

            /**
             * Gets the value of the individualInfo property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualInfo }
             *     
             */
            public IndividualInfo getIndividualInfo() {
                return individualInfo;
            }

            /**
             * Sets the value of the individualInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualInfo }
             *     
             */
            public void setIndividualInfo(IndividualInfo value) {
                this.individualInfo = value;
            }

            /**
             * Gets the value of the orgInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OrgInfo }
             *     
             */
            public OrgInfo getOrgInfo() {
                return orgInfo;
            }

            /**
             * Sets the value of the orgInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrgInfo }
             *     
             */
            public void setOrgInfo(OrgInfo value) {
                this.orgInfo = value;
            }

            /**
             * Gets the value of the opType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpType() {
                return opType;
            }

            /**
             * Sets the value of the opType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpType(String value) {
                this.opType = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SubDFTAcct"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="AcctList" maxOccurs="2"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;sequence&gt;
         *                               &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                               &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;/sequence&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;sequence&gt;
         *                               &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                               &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                               &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                               &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
         *                               &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                               &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;/sequence&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;sequence&gt;
         *                               &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                               &lt;element name="PaymentLimitInfo"&gt;
         *                                 &lt;complexType&gt;
         *                                   &lt;complexContent&gt;
         *                                     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
         *                                     &lt;/extension&gt;
         *                                   &lt;/complexContent&gt;
         *                                 &lt;/complexType&gt;
         *                               &lt;/element&gt;
         *                             &lt;/sequence&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShiftPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OldPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NewPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subscriberKey",
            "userCustomerKey",
            "writtenLang",
            "ivrLang",
            "subPassword",
            "subDFTAcct",
            "shiftPayRelation"
        })
        public static class Subscriber
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "SubscriberKey")
            protected String subscriberKey;
            @XmlElement(name = "UserCustomerKey")
            protected String userCustomerKey;
            @XmlElement(name = "WrittenLang")
            protected String writtenLang;
            @XmlElement(name = "IVRLang")
            protected String ivrLang;
            @XmlElement(name = "SubPassword")
            protected String subPassword;
            @XmlElement(name = "SubDFTAcct", required = true)
            protected ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct subDFTAcct;
            @XmlElement(name = "ShiftPayRelation")
            protected List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.ShiftPayRelation> shiftPayRelation;

            /**
             * Gets the value of the subscriberKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubscriberKey() {
                return subscriberKey;
            }

            /**
             * Sets the value of the subscriberKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubscriberKey(String value) {
                this.subscriberKey = value;
            }

            /**
             * Gets the value of the userCustomerKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserCustomerKey() {
                return userCustomerKey;
            }

            /**
             * Sets the value of the userCustomerKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserCustomerKey(String value) {
                this.userCustomerKey = value;
            }

            /**
             * Gets the value of the writtenLang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWrittenLang() {
                return writtenLang;
            }

            /**
             * Sets the value of the writtenLang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWrittenLang(String value) {
                this.writtenLang = value;
            }

            /**
             * Gets the value of the ivrLang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIVRLang() {
                return ivrLang;
            }

            /**
             * Sets the value of the ivrLang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIVRLang(String value) {
                this.ivrLang = value;
            }

            /**
             * Gets the value of the subPassword property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubPassword() {
                return subPassword;
            }

            /**
             * Sets the value of the subPassword property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubPassword(String value) {
                this.subPassword = value;
            }

            /**
             * Gets the value of the subDFTAcct property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct }
             *     
             */
            public ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct getSubDFTAcct() {
                return subDFTAcct;
            }

            /**
             * Sets the value of the subDFTAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct }
             *     
             */
            public void setSubDFTAcct(ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct value) {
                this.subDFTAcct = value;
            }

            /**
             * Gets the value of the shiftPayRelation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shiftPayRelation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShiftPayRelation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.ShiftPayRelation }
             * 
             * 
             */
            public List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.ShiftPayRelation> getShiftPayRelation() {
                if (shiftPayRelation == null) {
                    shiftPayRelation = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.Subscriber.ShiftPayRelation>();
                }
                return this.shiftPayRelation;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="OldPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NewPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "oldPayRelationKey",
                "newPayRelationKey"
            })
            public static class ShiftPayRelation
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OldPayRelationKey", required = true)
                protected String oldPayRelationKey;
                @XmlElement(name = "NewPayRelationKey", required = true)
                protected String newPayRelationKey;

                /**
                 * Gets the value of the oldPayRelationKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOldPayRelationKey() {
                    return oldPayRelationKey;
                }

                /**
                 * Sets the value of the oldPayRelationKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOldPayRelationKey(String value) {
                    this.oldPayRelationKey = value;
                }

                /**
                 * Gets the value of the newPayRelationKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNewPayRelationKey() {
                    return newPayRelationKey;
                }

                /**
                 * Sets the value of the newPayRelationKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNewPayRelationKey(String value) {
                    this.newPayRelationKey = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;choice&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="AcctList" maxOccurs="2"&gt;
             *             &lt;complexType&gt;
             *               &lt;complexContent&gt;
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                   &lt;sequence&gt;
             *                     &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                     &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;/sequence&gt;
             *                 &lt;/restriction&gt;
             *               &lt;/complexContent&gt;
             *             &lt;/complexType&gt;
             *           &lt;/element&gt;
             *           &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
             *             &lt;complexType&gt;
             *               &lt;complexContent&gt;
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                   &lt;sequence&gt;
             *                     &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                     &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                     &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                     &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
             *                     &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                     &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;/sequence&gt;
             *                 &lt;/restriction&gt;
             *               &lt;/complexContent&gt;
             *             &lt;/complexType&gt;
             *           &lt;/element&gt;
             *           &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
             *             &lt;complexType&gt;
             *               &lt;complexContent&gt;
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                   &lt;sequence&gt;
             *                     &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                     &lt;element name="PaymentLimitInfo"&gt;
             *                       &lt;complexType&gt;
             *                         &lt;complexContent&gt;
             *                           &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
             *                           &lt;/extension&gt;
             *                         &lt;/complexContent&gt;
             *                       &lt;/complexType&gt;
             *                     &lt;/element&gt;
             *                   &lt;/sequence&gt;
             *                 &lt;/restriction&gt;
             *               &lt;/complexContent&gt;
             *             &lt;/complexType&gt;
             *           &lt;/element&gt;
             *         &lt;/sequence&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "payRelationKey",
                "acctKey",
                "acctList",
                "payRelation",
                "paymentLimit"
            })
            public static class SubDFTAcct
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "PayRelationKey")
                protected String payRelationKey;
                @XmlElement(name = "AcctKey")
                protected String acctKey;
                @XmlElement(name = "AcctList")
                protected List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.AcctList> acctList;
                @XmlElement(name = "PayRelation")
                protected List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PayRelation> payRelation;
                @XmlElement(name = "PaymentLimit")
                protected List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit> paymentLimit;

                /**
                 * Gets the value of the payRelationKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPayRelationKey() {
                    return payRelationKey;
                }

                /**
                 * Sets the value of the payRelationKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPayRelationKey(String value) {
                    this.payRelationKey = value;
                }

                /**
                 * Gets the value of the acctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAcctKey() {
                    return acctKey;
                }

                /**
                 * Sets the value of the acctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAcctKey(String value) {
                    this.acctKey = value;
                }

                /**
                 * Gets the value of the acctList property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the acctList property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAcctList().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.AcctList }
                 * 
                 * 
                 */
                public List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.AcctList> getAcctList() {
                    if (acctList == null) {
                        acctList = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.AcctList>();
                    }
                    return this.acctList;
                }

                /**
                 * Gets the value of the payRelation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the payRelation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPayRelation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PayRelation }
                 * 
                 * 
                 */
                public List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PayRelation> getPayRelation() {
                    if (payRelation == null) {
                        payRelation = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PayRelation>();
                    }
                    return this.payRelation;
                }

                /**
                 * Gets the value of the paymentLimit property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the paymentLimit property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPaymentLimit().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit }
                 * 
                 * 
                 */
                public List<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit> getPaymentLimit() {
                    if (paymentLimit == null) {
                        paymentLimit = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit>();
                    }
                    return this.paymentLimit;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "acctKey",
                    "defAcctFlag"
                })
                public static class AcctList
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "AcctKey", required = true)
                    protected String acctKey;
                    @XmlElement(name = "DEFAcctFlag", required = true)
                    protected String defAcctFlag;

                    /**
                     * Gets the value of the acctKey property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAcctKey() {
                        return acctKey;
                    }

                    /**
                     * Sets the value of the acctKey property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAcctKey(String value) {
                        this.acctKey = value;
                    }

                    /**
                     * Gets the value of the defAcctFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDEFAcctFlag() {
                        return defAcctFlag;
                    }

                    /**
                     * Sets the value of the defAcctFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDEFAcctFlag(String value) {
                        this.defAcctFlag = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *         &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
                 *         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "payRelationKey",
                    "acctKey",
                    "priority",
                    "payRelExtRule",
                    "onlyPayRelFlag",
                    "paymentLimitKey"
                })
                public static class PayRelation
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "PayRelationKey", required = true)
                    protected String payRelationKey;
                    @XmlElement(name = "AcctKey", required = true)
                    protected String acctKey;
                    @XmlElement(name = "Priority", required = true)
                    protected BigInteger priority;
                    @XmlElement(name = "PayRelExtRule")
                    protected PayRelExtRule payRelExtRule;
                    @XmlElement(name = "OnlyPayRelFlag")
                    protected String onlyPayRelFlag;
                    @XmlElement(name = "PaymentLimitKey")
                    protected String paymentLimitKey;

                    /**
                     * Gets the value of the payRelationKey property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPayRelationKey() {
                        return payRelationKey;
                    }

                    /**
                     * Sets the value of the payRelationKey property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPayRelationKey(String value) {
                        this.payRelationKey = value;
                    }

                    /**
                     * Gets the value of the acctKey property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAcctKey() {
                        return acctKey;
                    }

                    /**
                     * Sets the value of the acctKey property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAcctKey(String value) {
                        this.acctKey = value;
                    }

                    /**
                     * Gets the value of the priority property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getPriority() {
                        return priority;
                    }

                    /**
                     * Sets the value of the priority property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setPriority(BigInteger value) {
                        this.priority = value;
                    }

                    /**
                     * Gets the value of the payRelExtRule property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PayRelExtRule }
                     *     
                     */
                    public PayRelExtRule getPayRelExtRule() {
                        return payRelExtRule;
                    }

                    /**
                     * Sets the value of the payRelExtRule property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PayRelExtRule }
                     *     
                     */
                    public void setPayRelExtRule(PayRelExtRule value) {
                        this.payRelExtRule = value;
                    }

                    /**
                     * Gets the value of the onlyPayRelFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOnlyPayRelFlag() {
                        return onlyPayRelFlag;
                    }

                    /**
                     * Sets the value of the onlyPayRelFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOnlyPayRelFlag(String value) {
                        this.onlyPayRelFlag = value;
                    }

                    /**
                     * Gets the value of the paymentLimitKey property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentLimitKey() {
                        return paymentLimitKey;
                    }

                    /**
                     * Sets the value of the paymentLimitKey property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentLimitKey(String value) {
                        this.paymentLimitKey = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PaymentLimitInfo"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "paymentLimitKey",
                    "paymentLimitInfo"
                })
                public static class PaymentLimit
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "PaymentLimitKey", required = true)
                    protected String paymentLimitKey;
                    @XmlElement(name = "PaymentLimitInfo", required = true)
                    protected ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

                    /**
                     * Gets the value of the paymentLimitKey property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentLimitKey() {
                        return paymentLimitKey;
                    }

                    /**
                     * Sets the value of the paymentLimitKey property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentLimitKey(String value) {
                        this.paymentLimitKey = value;
                    }

                    /**
                     * Gets the value of the paymentLimitInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit.PaymentLimitInfo }
                     *     
                     */
                    public ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                        return paymentLimitInfo;
                    }

                    /**
                     * Sets the value of the paymentLimitInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit.PaymentLimitInfo }
                     *     
                     */
                    public void setPaymentLimitInfo(ChangeSubOwnershipRequest.NewOwnership.Subscriber.SubDFTAcct.PaymentLimit.PaymentLimitInfo value) {
                        this.paymentLimitInfo = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class PaymentLimitInfo
                        extends com.huawei.bme.cbsinterface.bccommon.PaymentLimit
                        implements Serializable
                    {

                        private final static long serialVersionUID = 11082012L;

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ShiftOffering" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OldOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
         *                   &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
         *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "shiftOffering",
            "delOffering",
            "addOffering"
        })
        public static class SupplementaryOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ShiftOffering")
            protected List<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering> shiftOffering;
            @XmlElement(name = "DelOffering")
            protected List<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering> delOffering;
            @XmlElement(name = "AddOffering")
            protected List<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering> addOffering;

            /**
             * Gets the value of the shiftOffering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shiftOffering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShiftOffering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering }
             * 
             * 
             */
            public List<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering> getShiftOffering() {
                if (shiftOffering == null) {
                    shiftOffering = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering>();
                }
                return this.shiftOffering;
            }

            /**
             * Gets the value of the delOffering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delOffering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelOffering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering }
             * 
             * 
             */
            public List<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering> getDelOffering() {
                if (delOffering == null) {
                    delOffering = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering>();
                }
                return this.delOffering;
            }

            /**
             * Gets the value of the addOffering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addOffering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddOffering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering }
             * 
             * 
             */
            public List<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering> getAddOffering() {
                if (addOffering == null) {
                    addOffering = new ArrayList<ChangeSubOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering>();
                }
                return this.addOffering;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
             *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
             *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "effectiveTime",
                "expirationTime",
                "activationTime"
            })
            public static class AddOffering
                extends OfferingInst
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "EffectiveTime", required = true)
                protected EffectMode effectiveTime;
                @XmlElement(name = "ExpirationTime", required = true)
                protected String expirationTime;
                @XmlElement(name = "ActivationTime")
                protected ActiveMode activationTime;

                /**
                 * Gets the value of the effectiveTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EffectMode }
                 *     
                 */
                public EffectMode getEffectiveTime() {
                    return effectiveTime;
                }

                /**
                 * Sets the value of the effectiveTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EffectMode }
                 *     
                 */
                public void setEffectiveTime(EffectMode value) {
                    this.effectiveTime = value;
                }

                /**
                 * Gets the value of the expirationTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExpirationTime() {
                    return expirationTime;
                }

                /**
                 * Sets the value of the expirationTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExpirationTime(String value) {
                    this.expirationTime = value;
                }

                /**
                 * Gets the value of the activationTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ActiveMode }
                 *     
                 */
                public ActiveMode getActivationTime() {
                    return activationTime;
                }

                /**
                 * Sets the value of the activationTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ActiveMode }
                 *     
                 */
                public void setActivationTime(ActiveMode value) {
                    this.activationTime = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "offeringKey"
            })
            public static class DelOffering
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OfferingKey", required = true)
                protected OfferingKey offeringKey;

                /**
                 * Gets the value of the offeringKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferingKey }
                 *     
                 */
                public OfferingKey getOfferingKey() {
                    return offeringKey;
                }

                /**
                 * Sets the value of the offeringKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferingKey }
                 *     
                 */
                public void setOfferingKey(OfferingKey value) {
                    this.offeringKey = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="OldOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
             *         &lt;element name="NewOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "oldOfferingKey",
                "newOfferingKey"
            })
            public static class ShiftOffering
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OldOfferingKey", required = true, nillable = true)
                protected OfferingKey oldOfferingKey;
                @XmlElement(name = "NewOfferingKey", required = true, nillable = true)
                protected OfferingKey newOfferingKey;

                /**
                 * Gets the value of the oldOfferingKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferingKey }
                 *     
                 */
                public OfferingKey getOldOfferingKey() {
                    return oldOfferingKey;
                }

                /**
                 * Sets the value of the oldOfferingKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferingKey }
                 *     
                 */
                public void setOldOfferingKey(OfferingKey value) {
                    this.oldOfferingKey = value;
                }

                /**
                 * Gets the value of the newOfferingKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferingKey }
                 *     
                 */
                public OfferingKey getNewOfferingKey() {
                    return newOfferingKey;
                }

                /**
                 * Sets the value of the newOfferingKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferingKey }
                 *     
                 */
                public void setNewOfferingKey(OfferingKey value) {
                    this.newOfferingKey = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
         *         &lt;choice&gt;
         *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
         *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "custKey",
            "custInfo",
            "individualInfo",
            "orgInfo"
        })
        public static class UserCustomer
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "CustKey", required = true)
            protected String custKey;
            @XmlElement(name = "CustInfo")
            protected CustInfo custInfo;
            @XmlElement(name = "IndividualInfo")
            protected IndividualInfo individualInfo;
            @XmlElement(name = "OrgInfo")
            protected OrgInfo orgInfo;

            /**
             * Gets the value of the custKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustKey() {
                return custKey;
            }

            /**
             * Sets the value of the custKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustKey(String value) {
                this.custKey = value;
            }

            /**
             * Gets the value of the custInfo property.
             * 
             * @return
             *     possible object is
             *     {@link CustInfo }
             *     
             */
            public CustInfo getCustInfo() {
                return custInfo;
            }

            /**
             * Sets the value of the custInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustInfo }
             *     
             */
            public void setCustInfo(CustInfo value) {
                this.custInfo = value;
            }

            /**
             * Gets the value of the individualInfo property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualInfo }
             *     
             */
            public IndividualInfo getIndividualInfo() {
                return individualInfo;
            }

            /**
             * Sets the value of the individualInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualInfo }
             *     
             */
            public void setIndividualInfo(IndividualInfo value) {
                this.individualInfo = value;
            }

            /**
             * Gets the value of the orgInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OrgInfo }
             *     
             */
            public OrgInfo getOrgInfo() {
                return orgInfo;
            }

            /**
             * Sets the value of the orgInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrgInfo }
             *     
             */
            public void setOrgInfo(OrgInfo value) {
                this.orgInfo = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subscriberKey"
    })
    public static class OldOwnership
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubscriberKey", required = true)
        protected String subscriberKey;

        /**
         * Gets the value of the subscriberKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberKey() {
            return subscriberKey;
        }

        /**
         * Sets the value of the subscriberKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberKey(String value) {
            this.subscriberKey = value;
        }

    }

}
