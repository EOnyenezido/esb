
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountInfo;
import com.huawei.bme.cbsinterface.bccommon.ActiveMode;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.OfferingExpireMode;
import com.huawei.bme.cbsinterface.bccommon.OfferingInst;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.OfferingOwner;
import com.huawei.bme.cbsinterface.bccommon.POfferingInst;
import com.huawei.bme.cbsinterface.bccommon.PayRelExtRule;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for ChangeSubPaymentModeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubPaymentModeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentModeChange"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PrimaryOffering" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                             &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
 *                             &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SubDFTAccount" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OldDFTAcct" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NewDFTAcct" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                   &lt;element name="DFTPayRelation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
 *                                       &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="PaymentLimitInfo"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
 *                                             &lt;/extension&gt;
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
 *                   &lt;element name="Account" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AccountInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AddressInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Address"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
 *                   &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                             &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                             &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
 *                             &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeSubPaymentModeRequest", propOrder = {
    "subAccessCode",
    "opType",
    "paymentModeChange",
    "supplementaryOffering",
    "controlProperty"
})
public class ChangeSubPaymentModeRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "OpType", required = true)
    protected String opType;
    @XmlElement(name = "PaymentModeChange", required = true)
    protected ChangeSubPaymentModeRequest.PaymentModeChange paymentModeChange;
    @XmlElement(name = "SupplementaryOffering")
    protected ChangeSubPaymentModeRequest.SupplementaryOffering supplementaryOffering;
    @XmlElement(name = "ControlProperty")
    protected List<SimpleProperty> controlProperty;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setSubAccessCode(SubAccessCode value) {
        this.subAccessCode = value;
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

    /**
     * Gets the value of the paymentModeChange property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubPaymentModeRequest.PaymentModeChange }
     *     
     */
    public ChangeSubPaymentModeRequest.PaymentModeChange getPaymentModeChange() {
        return paymentModeChange;
    }

    /**
     * Sets the value of the paymentModeChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubPaymentModeRequest.PaymentModeChange }
     *     
     */
    public void setPaymentModeChange(ChangeSubPaymentModeRequest.PaymentModeChange value) {
        this.paymentModeChange = value;
    }

    /**
     * Gets the value of the supplementaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubPaymentModeRequest.SupplementaryOffering }
     *     
     */
    public ChangeSubPaymentModeRequest.SupplementaryOffering getSupplementaryOffering() {
        return supplementaryOffering;
    }

    /**
     * Sets the value of the supplementaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubPaymentModeRequest.SupplementaryOffering }
     *     
     */
    public void setSupplementaryOffering(ChangeSubPaymentModeRequest.SupplementaryOffering value) {
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
     *         &lt;element name="PrimaryOffering" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *                   &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
     *                   &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubDFTAccount" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OldDFTAcct" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NewDFTAcct" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *         &lt;element name="DFTPayRelation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
     *                             &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="PaymentLimitInfo"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
     *                                   &lt;/extension&gt;
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
     *         &lt;element name="Account" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AccountInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AddressInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Address"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
        "primaryOffering",
        "subDFTAccount",
        "dftPayRelation",
        "account",
        "addressInfo",
        "effectiveTime"
    })
    public static class PaymentModeChange
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PrimaryOffering")
        protected ChangeSubPaymentModeRequest.PaymentModeChange.PrimaryOffering primaryOffering;
        @XmlElement(name = "SubDFTAccount")
        protected ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount subDFTAccount;
        @XmlElement(name = "DFTPayRelation")
        protected ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation dftPayRelation;
        @XmlElement(name = "Account")
        protected ChangeSubPaymentModeRequest.PaymentModeChange.Account account;
        @XmlElement(name = "AddressInfo")
        protected ChangeSubPaymentModeRequest.PaymentModeChange.AddressInfo addressInfo;
        @XmlElement(name = "EffectiveTime", required = true)
        protected EffectMode effectiveTime;

        /**
         * Gets the value of the primaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.PrimaryOffering }
         *     
         */
        public ChangeSubPaymentModeRequest.PaymentModeChange.PrimaryOffering getPrimaryOffering() {
            return primaryOffering;
        }

        /**
         * Sets the value of the primaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.PrimaryOffering }
         *     
         */
        public void setPrimaryOffering(ChangeSubPaymentModeRequest.PaymentModeChange.PrimaryOffering value) {
            this.primaryOffering = value;
        }

        /**
         * Gets the value of the subDFTAccount property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount }
         *     
         */
        public ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount getSubDFTAccount() {
            return subDFTAccount;
        }

        /**
         * Sets the value of the subDFTAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount }
         *     
         */
        public void setSubDFTAccount(ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount value) {
            this.subDFTAccount = value;
        }

        /**
         * Gets the value of the dftPayRelation property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation }
         *     
         */
        public ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation getDFTPayRelation() {
            return dftPayRelation;
        }

        /**
         * Sets the value of the dftPayRelation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation }
         *     
         */
        public void setDFTPayRelation(ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation value) {
            this.dftPayRelation = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.Account }
         *     
         */
        public ChangeSubPaymentModeRequest.PaymentModeChange.Account getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.Account }
         *     
         */
        public void setAccount(ChangeSubPaymentModeRequest.PaymentModeChange.Account value) {
            this.account = value;
        }

        /**
         * Gets the value of the addressInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.AddressInfo }
         *     
         */
        public ChangeSubPaymentModeRequest.PaymentModeChange.AddressInfo getAddressInfo() {
            return addressInfo;
        }

        /**
         * Sets the value of the addressInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.AddressInfo }
         *     
         */
        public void setAddressInfo(ChangeSubPaymentModeRequest.PaymentModeChange.AddressInfo value) {
            this.addressInfo = value;
        }

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
         *         &lt;element name="AccountInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
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
            "accountInfo"
        })
        public static class Account
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AcctKey", required = true)
            protected String acctKey;
            @XmlElement(name = "AccountInfo")
            protected AccountInfo accountInfo;

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
             * Gets the value of the accountInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AccountInfo }
             *     
             */
            public AccountInfo getAccountInfo() {
                return accountInfo;
            }

            /**
             * Sets the value of the accountInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccountInfo }
             *     
             */
            public void setAccountInfo(AccountInfo value) {
                this.accountInfo = value;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Address"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AddressInfo
            extends Address
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;

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
         *         &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
         *                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="PaymentLimitInfo"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
         *                         &lt;/extension&gt;
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
            "delPayRelation",
            "addPayRelation",
            "paymentLimit"
        })
        public static class DFTPayRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "DelPayRelation")
            protected List<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.DelPayRelation> delPayRelation;
            @XmlElement(name = "AddPayRelation")
            protected List<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.AddPayRelation> addPayRelation;
            @XmlElement(name = "PaymentLimit")
            protected List<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit> paymentLimit;

            /**
             * Gets the value of the delPayRelation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delPayRelation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelPayRelation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.DelPayRelation }
             * 
             * 
             */
            public List<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.DelPayRelation> getDelPayRelation() {
                if (delPayRelation == null) {
                    delPayRelation = new ArrayList<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.DelPayRelation>();
                }
                return this.delPayRelation;
            }

            /**
             * Gets the value of the addPayRelation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addPayRelation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddPayRelation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.AddPayRelation }
             * 
             * 
             */
            public List<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.AddPayRelation> getAddPayRelation() {
                if (addPayRelation == null) {
                    addPayRelation = new ArrayList<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.AddPayRelation>();
                }
                return this.addPayRelation;
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
             * {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit }
             * 
             * 
             */
            public List<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit> getPaymentLimit() {
                if (paymentLimit == null) {
                    paymentLimit = new ArrayList<ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit>();
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
             *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            public static class AddPayRelation
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "PayRelationKey", required = true)
                protected String payRelationKey;
                @XmlElement(name = "AcctKey", required = true)
                protected String acctKey;
                @XmlElement(name = "Priority")
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
             *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "payRelationKey"
            })
            public static class DelPayRelation
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "PayRelationKey", required = true)
                protected String payRelationKey;

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
                protected ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

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
                 *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                    return paymentLimitInfo;
                }

                /**
                 * Sets the value of the paymentLimitInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public void setPaymentLimitInfo(ChangeSubPaymentModeRequest.PaymentModeChange.DFTPayRelation.PaymentLimit.PaymentLimitInfo value) {
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
         *         &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
         *         &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
         *         &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "oldPrimaryOffering",
            "newPrimaryOffering",
            "newBrand"
        })
        public static class PrimaryOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OldPrimaryOffering")
            protected OfferingKey oldPrimaryOffering;
            @XmlElement(name = "NewPrimaryOffering", required = true)
            protected POfferingInst newPrimaryOffering;
            @XmlElement(name = "NewBrand")
            protected String newBrand;

            /**
             * Gets the value of the oldPrimaryOffering property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingKey }
             *     
             */
            public OfferingKey getOldPrimaryOffering() {
                return oldPrimaryOffering;
            }

            /**
             * Sets the value of the oldPrimaryOffering property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingKey }
             *     
             */
            public void setOldPrimaryOffering(OfferingKey value) {
                this.oldPrimaryOffering = value;
            }

            /**
             * Gets the value of the newPrimaryOffering property.
             * 
             * @return
             *     possible object is
             *     {@link POfferingInst }
             *     
             */
            public POfferingInst getNewPrimaryOffering() {
                return newPrimaryOffering;
            }

            /**
             * Sets the value of the newPrimaryOffering property.
             * 
             * @param value
             *     allowed object is
             *     {@link POfferingInst }
             *     
             */
            public void setNewPrimaryOffering(POfferingInst value) {
                this.newPrimaryOffering = value;
            }

            /**
             * Gets the value of the newBrand property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewBrand() {
                return newBrand;
            }

            /**
             * Sets the value of the newBrand property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewBrand(String value) {
                this.newBrand = value;
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
         *         &lt;element name="OldDFTAcct" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NewDFTAcct" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "oldDFTAcct",
            "newDFTAcct"
        })
        public static class SubDFTAccount
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OldDFTAcct")
            protected ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.OldDFTAcct oldDFTAcct;
            @XmlElement(name = "NewDFTAcct")
            protected ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.NewDFTAcct newDFTAcct;

            /**
             * Gets the value of the oldDFTAcct property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.OldDFTAcct }
             *     
             */
            public ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.OldDFTAcct getOldDFTAcct() {
                return oldDFTAcct;
            }

            /**
             * Sets the value of the oldDFTAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.OldDFTAcct }
             *     
             */
            public void setOldDFTAcct(ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.OldDFTAcct value) {
                this.oldDFTAcct = value;
            }

            /**
             * Gets the value of the newDFTAcct property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.NewDFTAcct }
             *     
             */
            public ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.NewDFTAcct getNewDFTAcct() {
                return newDFTAcct;
            }

            /**
             * Sets the value of the newDFTAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.NewDFTAcct }
             *     
             */
            public void setNewDFTAcct(ChangeSubPaymentModeRequest.PaymentModeChange.SubDFTAccount.NewDFTAcct value) {
                this.newDFTAcct = value;
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
             *         &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "prePaidAcctKey",
                "postPaidAcctKey",
                "dftAcctKey"
            })
            public static class NewDFTAcct
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "PrePaidAcctKey")
                protected String prePaidAcctKey;
                @XmlElement(name = "PostPaidAcctKey")
                protected String postPaidAcctKey;
                @XmlElement(name = "DFTAcctKey")
                protected String dftAcctKey;

                /**
                 * Gets the value of the prePaidAcctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrePaidAcctKey() {
                    return prePaidAcctKey;
                }

                /**
                 * Sets the value of the prePaidAcctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrePaidAcctKey(String value) {
                    this.prePaidAcctKey = value;
                }

                /**
                 * Gets the value of the postPaidAcctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPostPaidAcctKey() {
                    return postPaidAcctKey;
                }

                /**
                 * Sets the value of the postPaidAcctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPostPaidAcctKey(String value) {
                    this.postPaidAcctKey = value;
                }

                /**
                 * Gets the value of the dftAcctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDFTAcctKey() {
                    return dftAcctKey;
                }

                /**
                 * Sets the value of the dftAcctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDFTAcctKey(String value) {
                    this.dftAcctKey = value;
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
             *         &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "prePaidAcctKey",
                "postPaidAcctKey",
                "dftAcctKey"
            })
            public static class OldDFTAcct
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "PrePaidAcctKey")
                protected String prePaidAcctKey;
                @XmlElement(name = "PostPaidAcctKey")
                protected String postPaidAcctKey;
                @XmlElement(name = "DFTAcctKey")
                protected String dftAcctKey;

                /**
                 * Gets the value of the prePaidAcctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrePaidAcctKey() {
                    return prePaidAcctKey;
                }

                /**
                 * Sets the value of the prePaidAcctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrePaidAcctKey(String value) {
                    this.prePaidAcctKey = value;
                }

                /**
                 * Gets the value of the postPaidAcctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPostPaidAcctKey() {
                    return postPaidAcctKey;
                }

                /**
                 * Sets the value of the postPaidAcctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPostPaidAcctKey(String value) {
                    this.postPaidAcctKey = value;
                }

                /**
                 * Gets the value of the dftAcctKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDFTAcctKey() {
                    return dftAcctKey;
                }

                /**
                 * Sets the value of the dftAcctKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDFTAcctKey(String value) {
                    this.dftAcctKey = value;
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
     *         &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                   &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                   &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
     *                   &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/&gt;
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
        "addOffering",
        "delOffering",
        "modifyOffering"
    })
    public static class SupplementaryOffering
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AddOffering")
        protected List<ChangeSubPaymentModeRequest.SupplementaryOffering.AddOffering> addOffering;
        @XmlElement(name = "DelOffering")
        protected List<ChangeSubPaymentModeRequest.SupplementaryOffering.DelOffering> delOffering;
        @XmlElement(name = "ModifyOffering")
        protected List<ChangeSubPaymentModeRequest.SupplementaryOffering.ModifyOffering> modifyOffering;

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
         * {@link ChangeSubPaymentModeRequest.SupplementaryOffering.AddOffering }
         * 
         * 
         */
        public List<ChangeSubPaymentModeRequest.SupplementaryOffering.AddOffering> getAddOffering() {
            if (addOffering == null) {
                addOffering = new ArrayList<ChangeSubPaymentModeRequest.SupplementaryOffering.AddOffering>();
            }
            return this.addOffering;
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
         * {@link ChangeSubPaymentModeRequest.SupplementaryOffering.DelOffering }
         * 
         * 
         */
        public List<ChangeSubPaymentModeRequest.SupplementaryOffering.DelOffering> getDelOffering() {
            if (delOffering == null) {
                delOffering = new ArrayList<ChangeSubPaymentModeRequest.SupplementaryOffering.DelOffering>();
            }
            return this.delOffering;
        }

        /**
         * Gets the value of the modifyOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubPaymentModeRequest.SupplementaryOffering.ModifyOffering }
         * 
         * 
         */
        public List<ChangeSubPaymentModeRequest.SupplementaryOffering.ModifyOffering> getModifyOffering() {
            if (modifyOffering == null) {
                modifyOffering = new ArrayList<ChangeSubPaymentModeRequest.SupplementaryOffering.ModifyOffering>();
            }
            return this.modifyOffering;
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
         *         &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
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
            "offeringOwner",
            "effectiveTime",
            "expirationTime",
            "activationTime"
        })
        public static class AddOffering
            extends OfferingInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OfferingOwner")
            protected OfferingOwner offeringOwner;
            @XmlElement(name = "EffectiveTime", required = true)
            protected EffectMode effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationTime")
            protected ActiveMode activationTime;

            /**
             * Gets the value of the offeringOwner property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingOwner }
             *     
             */
            public OfferingOwner getOfferingOwner() {
                return offeringOwner;
            }

            /**
             * Sets the value of the offeringOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingOwner }
             *     
             */
            public void setOfferingOwner(OfferingOwner value) {
                this.offeringOwner = value;
            }

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
         *         &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
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
            "offeringKey",
            "offeringOwner"
        })
        public static class DelOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OfferingKey", required = true)
            protected OfferingKey offeringKey;
            @XmlElement(name = "OfferingOwner")
            protected OfferingOwner offeringOwner;

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

            /**
             * Gets the value of the offeringOwner property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingOwner }
             *     
             */
            public OfferingOwner getOfferingOwner() {
                return offeringOwner;
            }

            /**
             * Sets the value of the offeringOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingOwner }
             *     
             */
            public void setOfferingOwner(OfferingOwner value) {
                this.offeringOwner = value;
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
         *         &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
         *         &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/&gt;
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
            "offeringKey",
            "offeringOwner",
            "newEffectiveTime",
            "newExpirationTime"
        })
        public static class ModifyOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OfferingKey", required = true)
            protected OfferingKey offeringKey;
            @XmlElement(name = "OfferingOwner")
            protected OfferingOwner offeringOwner;
            @XmlElement(name = "NewEffectiveTime")
            protected String newEffectiveTime;
            @XmlElement(name = "NewExpirationTime")
            protected OfferingExpireMode newExpirationTime;

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

            /**
             * Gets the value of the offeringOwner property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingOwner }
             *     
             */
            public OfferingOwner getOfferingOwner() {
                return offeringOwner;
            }

            /**
             * Sets the value of the offeringOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingOwner }
             *     
             */
            public void setOfferingOwner(OfferingOwner value) {
                this.offeringOwner = value;
            }

            /**
             * Gets the value of the newEffectiveTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewEffectiveTime() {
                return newEffectiveTime;
            }

            /**
             * Sets the value of the newEffectiveTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewEffectiveTime(String value) {
                this.newEffectiveTime = value;
            }

            /**
             * Gets the value of the newExpirationTime property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingExpireMode }
             *     
             */
            public OfferingExpireMode getNewExpirationTime() {
                return newExpirationTime;
            }

            /**
             * Sets the value of the newExpirationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingExpireMode }
             *     
             */
            public void setNewExpirationTime(OfferingExpireMode value) {
                this.newExpirationTime = value;
            }

        }

    }

}
