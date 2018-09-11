
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
import com.huawei.bme.cbsinterface.bccommon.OfferingOwner;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.POfferingInst;
import com.huawei.bme.cbsinterface.bccommon.PayRelExtRule;
import com.huawei.bme.cbsinterface.bccommon.SalesInfo;


/**
 * <p>Java class for CreateSubscriberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSubscriberRequest"&gt;
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
 *         &lt;element name="Subscriber"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubscriberInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Subscriber"/&gt;
 *                   &lt;element name="SubPaymentMode"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;choice&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                 &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="AcctList" maxOccurs="2"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                           &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                           &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                           &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                           &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
 *                                           &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                           &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                           &lt;element name="PaymentLimitInfo"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/choice&gt;
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
 *         &lt;element name="PrimaryOffering"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplementaryOffering" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SalesInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSubscriberRequest", propOrder = {
    "registerCustomer",
    "userCustomer",
    "account",
    "subscriber",
    "primaryOffering",
    "supplementaryOffering",
    "addressInfo",
    "salesInfo"
})
public class CreateSubscriberRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCustomer", required = true)
    protected CreateSubscriberRequest.RegisterCustomer registerCustomer;
    @XmlElement(name = "UserCustomer")
    protected CreateSubscriberRequest.UserCustomer userCustomer;
    @XmlElement(name = "Account")
    protected List<CreateSubscriberRequest.Account> account;
    @XmlElement(name = "Subscriber", required = true)
    protected CreateSubscriberRequest.Subscriber subscriber;
    @XmlElement(name = "PrimaryOffering", required = true)
    protected CreateSubscriberRequest.PrimaryOffering primaryOffering;
    @XmlElement(name = "SupplementaryOffering")
    protected List<CreateSubscriberRequest.SupplementaryOffering> supplementaryOffering;
    @XmlElement(name = "AddressInfo")
    protected List<Address> addressInfo;
    @XmlElement(name = "SalesInfo")
    protected SalesInfo salesInfo;

    /**
     * Gets the value of the registerCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriberRequest.RegisterCustomer }
     *     
     */
    public CreateSubscriberRequest.RegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }

    /**
     * Sets the value of the registerCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriberRequest.RegisterCustomer }
     *     
     */
    public void setRegisterCustomer(CreateSubscriberRequest.RegisterCustomer value) {
        this.registerCustomer = value;
    }

    /**
     * Gets the value of the userCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriberRequest.UserCustomer }
     *     
     */
    public CreateSubscriberRequest.UserCustomer getUserCustomer() {
        return userCustomer;
    }

    /**
     * Sets the value of the userCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriberRequest.UserCustomer }
     *     
     */
    public void setUserCustomer(CreateSubscriberRequest.UserCustomer value) {
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
     * {@link CreateSubscriberRequest.Account }
     * 
     * 
     */
    public List<CreateSubscriberRequest.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<CreateSubscriberRequest.Account>();
        }
        return this.account;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriberRequest.Subscriber }
     *     
     */
    public CreateSubscriberRequest.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriberRequest.Subscriber }
     *     
     */
    public void setSubscriber(CreateSubscriberRequest.Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the primaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriberRequest.PrimaryOffering }
     *     
     */
    public CreateSubscriberRequest.PrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }

    /**
     * Sets the value of the primaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriberRequest.PrimaryOffering }
     *     
     */
    public void setPrimaryOffering(CreateSubscriberRequest.PrimaryOffering value) {
        this.primaryOffering = value;
    }

    /**
     * Gets the value of the supplementaryOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementaryOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementaryOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateSubscriberRequest.SupplementaryOffering }
     * 
     * 
     */
    public List<CreateSubscriberRequest.SupplementaryOffering> getSupplementaryOffering() {
        if (supplementaryOffering == null) {
            supplementaryOffering = new ArrayList<CreateSubscriberRequest.SupplementaryOffering>();
        }
        return this.supplementaryOffering;
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
     * Gets the value of the salesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInfo }
     *     
     */
    public SalesInfo getSalesInfo() {
        return salesInfo;
    }

    /**
     * Sets the value of the salesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInfo }
     *     
     */
    public void setSalesInfo(SalesInfo value) {
        this.salesInfo = value;
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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "effectiveTime"
    })
    public static class PrimaryOffering
        extends POfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "EffectiveTime")
        protected String effectiveTime;

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
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
     *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubscriberInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Subscriber"/&gt;
     *         &lt;element name="SubPaymentMode"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;choice&gt;
     *                     &lt;sequence&gt;
     *                       &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                       &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;/sequence&gt;
     *                     &lt;sequence&gt;
     *                       &lt;element name="AcctList" maxOccurs="2"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                 &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;/sequence&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                       &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                 &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                 &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                 &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
     *                                 &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                 &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                               &lt;/sequence&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                       &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                 &lt;element name="PaymentLimitInfo"&gt;
     *                                   &lt;complexType&gt;
     *                                     &lt;complexContent&gt;
     *                                       &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
     *                                       &lt;/extension&gt;
     *                                     &lt;/complexContent&gt;
     *                                   &lt;/complexType&gt;
     *                                 &lt;/element&gt;
     *                               &lt;/sequence&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                     &lt;/sequence&gt;
     *                   &lt;/choice&gt;
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
        "subscriberInfo",
        "subPaymentMode"
    })
    public static class Subscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubscriberKey", required = true)
        protected String subscriberKey;
        @XmlElement(name = "SubscriberInfo", required = true)
        protected com.huawei.bme.cbsinterface.bccommon.Subscriber subscriberInfo;
        @XmlElement(name = "SubPaymentMode", required = true)
        protected CreateSubscriberRequest.Subscriber.SubPaymentMode subPaymentMode;

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
         * Gets the value of the subscriberInfo property.
         * 
         * @return
         *     possible object is
         *     {@link com.huawei.bme.cbsinterface.bccommon.Subscriber }
         *     
         */
        public com.huawei.bme.cbsinterface.bccommon.Subscriber getSubscriberInfo() {
            return subscriberInfo;
        }

        /**
         * Sets the value of the subscriberInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.huawei.bme.cbsinterface.bccommon.Subscriber }
         *     
         */
        public void setSubscriberInfo(com.huawei.bme.cbsinterface.bccommon.Subscriber value) {
            this.subscriberInfo = value;
        }

        /**
         * Gets the value of the subPaymentMode property.
         * 
         * @return
         *     possible object is
         *     {@link CreateSubscriberRequest.Subscriber.SubPaymentMode }
         *     
         */
        public CreateSubscriberRequest.Subscriber.SubPaymentMode getSubPaymentMode() {
            return subPaymentMode;
        }

        /**
         * Sets the value of the subPaymentMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateSubscriberRequest.Subscriber.SubPaymentMode }
         *     
         */
        public void setSubPaymentMode(CreateSubscriberRequest.Subscriber.SubPaymentMode value) {
            this.subPaymentMode = value;
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
         *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;choice&gt;
         *           &lt;sequence&gt;
         *             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *           &lt;/sequence&gt;
         *           &lt;sequence&gt;
         *             &lt;element name="AcctList" maxOccurs="2"&gt;
         *               &lt;complexType&gt;
         *                 &lt;complexContent&gt;
         *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                     &lt;sequence&gt;
         *                       &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                       &lt;element name="DEFAcctFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;/sequence&gt;
         *                   &lt;/restriction&gt;
         *                 &lt;/complexContent&gt;
         *               &lt;/complexType&gt;
         *             &lt;/element&gt;
         *             &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
         *               &lt;complexType&gt;
         *                 &lt;complexContent&gt;
         *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                     &lt;sequence&gt;
         *                       &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                       &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                       &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                       &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
         *                       &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                     &lt;/sequence&gt;
         *                   &lt;/restriction&gt;
         *                 &lt;/complexContent&gt;
         *               &lt;/complexType&gt;
         *             &lt;/element&gt;
         *             &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0"&gt;
         *               &lt;complexType&gt;
         *                 &lt;complexContent&gt;
         *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                     &lt;sequence&gt;
         *                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                       &lt;element name="PaymentLimitInfo"&gt;
         *                         &lt;complexType&gt;
         *                           &lt;complexContent&gt;
         *                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
         *                             &lt;/extension&gt;
         *                           &lt;/complexContent&gt;
         *                         &lt;/complexType&gt;
         *                       &lt;/element&gt;
         *                     &lt;/sequence&gt;
         *                   &lt;/restriction&gt;
         *                 &lt;/complexContent&gt;
         *               &lt;/complexType&gt;
         *             &lt;/element&gt;
         *           &lt;/sequence&gt;
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
            "paymentMode",
            "payRelationKey",
            "acctKey",
            "acctList",
            "payRelation",
            "paymentLimit"
        })
        public static class SubPaymentMode
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PaymentMode", required = true, nillable = true)
            protected String paymentMode;
            @XmlElement(name = "PayRelationKey")
            protected String payRelationKey;
            @XmlElement(name = "AcctKey")
            protected String acctKey;
            @XmlElement(name = "AcctList")
            protected List<CreateSubscriberRequest.Subscriber.SubPaymentMode.AcctList> acctList;
            @XmlElement(name = "PayRelation")
            protected List<CreateSubscriberRequest.Subscriber.SubPaymentMode.PayRelation> payRelation;
            @XmlElement(name = "PaymentLimit")
            protected List<CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit> paymentLimit;

            /**
             * Gets the value of the paymentMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentMode() {
                return paymentMode;
            }

            /**
             * Sets the value of the paymentMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentMode(String value) {
                this.paymentMode = value;
            }

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
             * {@link CreateSubscriberRequest.Subscriber.SubPaymentMode.AcctList }
             * 
             * 
             */
            public List<CreateSubscriberRequest.Subscriber.SubPaymentMode.AcctList> getAcctList() {
                if (acctList == null) {
                    acctList = new ArrayList<CreateSubscriberRequest.Subscriber.SubPaymentMode.AcctList>();
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
             * {@link CreateSubscriberRequest.Subscriber.SubPaymentMode.PayRelation }
             * 
             * 
             */
            public List<CreateSubscriberRequest.Subscriber.SubPaymentMode.PayRelation> getPayRelation() {
                if (payRelation == null) {
                    payRelation = new ArrayList<CreateSubscriberRequest.Subscriber.SubPaymentMode.PayRelation>();
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
             * {@link CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit }
             * 
             * 
             */
            public List<CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit> getPaymentLimit() {
                if (paymentLimit == null) {
                    paymentLimit = new ArrayList<CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit>();
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
                protected CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

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
                 *     {@link CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                    return paymentLimitInfo;
                }

                /**
                 * Sets the value of the paymentLimitInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public void setPaymentLimitInfo(CreateSubscriberRequest.Subscriber.SubPaymentMode.PaymentLimit.PaymentLimitInfo value) {
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
    public static class SupplementaryOffering
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
