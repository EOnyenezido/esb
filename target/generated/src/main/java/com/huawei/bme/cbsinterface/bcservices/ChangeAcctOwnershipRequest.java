
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.ActiveMode;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustInfo;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OfferingInst;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;


/**
 * <p>Java class for ChangeAcctOwnershipRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcctOwnershipRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OldOwnership"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Account"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PrepaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PostpaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
 *                   &lt;element name="Account" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PrepaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PostpaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OldAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NewAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                   &lt;element name="Subscriber" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SubPayRelation" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ShiftPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="OldPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NewPayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
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
 *                   &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeAcctOwnershipRequest", propOrder = {
    "oldOwnership",
    "newOwnership"
})
public class ChangeAcctOwnershipRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OldOwnership", required = true)
    protected ChangeAcctOwnershipRequest.OldOwnership oldOwnership;
    @XmlElement(name = "NewOwnership", required = true)
    protected ChangeAcctOwnershipRequest.NewOwnership newOwnership;

    /**
     * Gets the value of the oldOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctOwnershipRequest.OldOwnership }
     *     
     */
    public ChangeAcctOwnershipRequest.OldOwnership getOldOwnership() {
        return oldOwnership;
    }

    /**
     * Sets the value of the oldOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctOwnershipRequest.OldOwnership }
     *     
     */
    public void setOldOwnership(ChangeAcctOwnershipRequest.OldOwnership value) {
        this.oldOwnership = value;
    }

    /**
     * Gets the value of the newOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctOwnershipRequest.NewOwnership }
     *     
     */
    public ChangeAcctOwnershipRequest.NewOwnership getNewOwnership() {
        return newOwnership;
    }

    /**
     * Sets the value of the newOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctOwnershipRequest.NewOwnership }
     *     
     */
    public void setNewOwnership(ChangeAcctOwnershipRequest.NewOwnership value) {
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
     *         &lt;element name="Account" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PrepaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PostpaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OldAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NewAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *         &lt;element name="Subscriber" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SubPayRelation" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
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
     *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "subscriber",
        "primaryOffering",
        "supplementaryOffering",
        "addressInfo",
        "controlProperty"
    })
    public static class NewOwnership
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "RegisterCustomer", required = true)
        protected ChangeAcctOwnershipRequest.NewOwnership.RegisterCustomer registerCustomer;
        @XmlElement(name = "UserCustomer")
        protected ChangeAcctOwnershipRequest.NewOwnership.UserCustomer userCustomer;
        @XmlElement(name = "Account")
        protected ChangeAcctOwnershipRequest.NewOwnership.Account account;
        @XmlElement(name = "Subscriber")
        protected ChangeAcctOwnershipRequest.NewOwnership.Subscriber subscriber;
        @XmlElement(name = "PrimaryOffering")
        protected ChangeAcctOwnershipRequest.NewOwnership.PrimaryOffering primaryOffering;
        @XmlElement(name = "SupplementaryOffering")
        protected ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering supplementaryOffering;
        @XmlElement(name = "AddressInfo")
        protected List<Address> addressInfo;
        @XmlElement(name = "ControlProperty")
        protected List<SimpleProperty> controlProperty;

        /**
         * Gets the value of the registerCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.RegisterCustomer }
         *     
         */
        public ChangeAcctOwnershipRequest.NewOwnership.RegisterCustomer getRegisterCustomer() {
            return registerCustomer;
        }

        /**
         * Sets the value of the registerCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.RegisterCustomer }
         *     
         */
        public void setRegisterCustomer(ChangeAcctOwnershipRequest.NewOwnership.RegisterCustomer value) {
            this.registerCustomer = value;
        }

        /**
         * Gets the value of the userCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.UserCustomer }
         *     
         */
        public ChangeAcctOwnershipRequest.NewOwnership.UserCustomer getUserCustomer() {
            return userCustomer;
        }

        /**
         * Sets the value of the userCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.UserCustomer }
         *     
         */
        public void setUserCustomer(ChangeAcctOwnershipRequest.NewOwnership.UserCustomer value) {
            this.userCustomer = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.Account }
         *     
         */
        public ChangeAcctOwnershipRequest.NewOwnership.Account getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.Account }
         *     
         */
        public void setAccount(ChangeAcctOwnershipRequest.NewOwnership.Account value) {
            this.account = value;
        }

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.Subscriber }
         *     
         */
        public ChangeAcctOwnershipRequest.NewOwnership.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.Subscriber }
         *     
         */
        public void setSubscriber(ChangeAcctOwnershipRequest.NewOwnership.Subscriber value) {
            this.subscriber = value;
        }

        /**
         * Gets the value of the primaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.PrimaryOffering }
         *     
         */
        public ChangeAcctOwnershipRequest.NewOwnership.PrimaryOffering getPrimaryOffering() {
            return primaryOffering;
        }

        /**
         * Sets the value of the primaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.PrimaryOffering }
         *     
         */
        public void setPrimaryOffering(ChangeAcctOwnershipRequest.NewOwnership.PrimaryOffering value) {
            this.primaryOffering = value;
        }

        /**
         * Gets the value of the supplementaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering }
         *     
         */
        public ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering getSupplementaryOffering() {
            return supplementaryOffering;
        }

        /**
         * Sets the value of the supplementaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering }
         *     
         */
        public void setSupplementaryOffering(ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering value) {
            this.supplementaryOffering = value;
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
         *         &lt;element name="PrepaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PostpaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OldAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NewAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "prepaidAcctKey",
            "postpaidAcctKey",
            "autoPayChannel"
        })
        public static class Account
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PrepaidAcctKey")
            protected String prepaidAcctKey;
            @XmlElement(name = "PostpaidAcctKey")
            protected String postpaidAcctKey;
            @XmlElement(name = "AutoPayChannel")
            protected List<ChangeAcctOwnershipRequest.NewOwnership.Account.AutoPayChannel> autoPayChannel;

            /**
             * Gets the value of the prepaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrepaidAcctKey() {
                return prepaidAcctKey;
            }

            /**
             * Sets the value of the prepaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrepaidAcctKey(String value) {
                this.prepaidAcctKey = value;
            }

            /**
             * Gets the value of the postpaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostpaidAcctKey() {
                return postpaidAcctKey;
            }

            /**
             * Sets the value of the postpaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostpaidAcctKey(String value) {
                this.postpaidAcctKey = value;
            }

            /**
             * Gets the value of the autoPayChannel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the autoPayChannel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAutoPayChannel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeAcctOwnershipRequest.NewOwnership.Account.AutoPayChannel }
             * 
             * 
             */
            public List<ChangeAcctOwnershipRequest.NewOwnership.Account.AutoPayChannel> getAutoPayChannel() {
                if (autoPayChannel == null) {
                    autoPayChannel = new ArrayList<ChangeAcctOwnershipRequest.NewOwnership.Account.AutoPayChannel>();
                }
                return this.autoPayChannel;
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
             *         &lt;element name="OldAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NewAutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "oldAutoPayChannelKey",
                "newAutoPayChannelKey"
            })
            public static class AutoPayChannel
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OldAutoPayChannelKey", required = true)
                protected String oldAutoPayChannelKey;
                @XmlElement(name = "NewAutoPayChannelKey", required = true)
                protected String newAutoPayChannelKey;

                /**
                 * Gets the value of the oldAutoPayChannelKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOldAutoPayChannelKey() {
                    return oldAutoPayChannelKey;
                }

                /**
                 * Sets the value of the oldAutoPayChannelKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOldAutoPayChannelKey(String value) {
                    this.oldAutoPayChannelKey = value;
                }

                /**
                 * Gets the value of the newAutoPayChannelKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNewAutoPayChannelKey() {
                    return newAutoPayChannelKey;
                }

                /**
                 * Sets the value of the newAutoPayChannelKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNewAutoPayChannelKey(String value) {
                    this.newAutoPayChannelKey = value;
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
         *         &lt;element name="SubPayRelation" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
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
            "subPayRelation"
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
            @XmlElement(name = "SubPayRelation")
            protected ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation subPayRelation;

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
             * Gets the value of the subPayRelation property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation }
             *     
             */
            public ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation getSubPayRelation() {
                return subPayRelation;
            }

            /**
             * Sets the value of the subPayRelation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation }
             *     
             */
            public void setSubPayRelation(ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation value) {
                this.subPayRelation = value;
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
                "shiftPayRelation"
            })
            public static class SubPayRelation
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "ShiftPayRelation")
                protected List<ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation.ShiftPayRelation> shiftPayRelation;

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
                 * {@link ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation.ShiftPayRelation }
                 * 
                 * 
                 */
                public List<ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation.ShiftPayRelation> getShiftPayRelation() {
                    if (shiftPayRelation == null) {
                        shiftPayRelation = new ArrayList<ChangeAcctOwnershipRequest.NewOwnership.Subscriber.SubPayRelation.ShiftPayRelation>();
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
            protected List<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering> shiftOffering;
            @XmlElement(name = "DelOffering")
            protected List<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering> delOffering;
            @XmlElement(name = "AddOffering")
            protected List<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering> addOffering;

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
             * {@link ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering }
             * 
             * 
             */
            public List<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering> getShiftOffering() {
                if (shiftOffering == null) {
                    shiftOffering = new ArrayList<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.ShiftOffering>();
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
             * {@link ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering }
             * 
             * 
             */
            public List<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering> getDelOffering() {
                if (delOffering == null) {
                    delOffering = new ArrayList<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.DelOffering>();
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
             * {@link ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering }
             * 
             * 
             */
            public List<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering> getAddOffering() {
                if (addOffering == null) {
                    addOffering = new ArrayList<ChangeAcctOwnershipRequest.NewOwnership.SupplementaryOffering.AddOffering>();
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
     *         &lt;element name="Account"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PrepaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PostpaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "account",
        "subscriberKey"
    })
    public static class OldOwnership
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "Account", required = true)
        protected ChangeAcctOwnershipRequest.OldOwnership.Account account;
        @XmlElement(name = "SubscriberKey", required = true)
        protected String subscriberKey;

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctOwnershipRequest.OldOwnership.Account }
         *     
         */
        public ChangeAcctOwnershipRequest.OldOwnership.Account getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctOwnershipRequest.OldOwnership.Account }
         *     
         */
        public void setAccount(ChangeAcctOwnershipRequest.OldOwnership.Account value) {
            this.account = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PrepaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PostpaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "prepaidAcctKey",
            "postpaidAcctKey"
        })
        public static class Account
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PrepaidAcctKey")
            protected String prepaidAcctKey;
            @XmlElement(name = "PostpaidAcctKey")
            protected String postpaidAcctKey;

            /**
             * Gets the value of the prepaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrepaidAcctKey() {
                return prepaidAcctKey;
            }

            /**
             * Sets the value of the prepaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrepaidAcctKey(String value) {
                this.prepaidAcctKey = value;
            }

            /**
             * Gets the value of the postpaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostpaidAcctKey() {
                return postpaidAcctKey;
            }

            /**
             * Sets the value of the postpaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostpaidAcctKey(String value) {
                this.postpaidAcctKey = value;
            }

        }

    }

}
