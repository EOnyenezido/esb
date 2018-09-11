
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountBasicInfo;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustBasicInfo;
import com.huawei.bme.cbsinterface.bccommon.CustInfo;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubBasicInfo;


/**
 * <p>Java class for SupplementProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementProfileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="NewOwnership" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="RegisterCustomer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustBasicInfo" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
 *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
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
 *                   &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo" minOccurs="0"/&gt;
 *                   &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="InitBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="CreditLimit" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AcctPayMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AutoPayChannelInfo"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
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
 *         &lt;element name="AddressInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Address"&gt;
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
@XmlType(name = "SupplementProfileRequest", propOrder = {
    "subAccessCode",
    "newOwnership",
    "subBasicInfo",
    "registerCustomer",
    "userCustomer",
    "account",
    "addressInfo"
})
public class SupplementProfileRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "NewOwnership")
    protected SupplementProfileRequest.NewOwnership newOwnership;
    @XmlElement(name = "SubBasicInfo")
    protected SubBasicInfo subBasicInfo;
    @XmlElement(name = "RegisterCustomer")
    protected SupplementProfileRequest.RegisterCustomer registerCustomer;
    @XmlElement(name = "UserCustomer")
    protected SupplementProfileRequest.UserCustomer userCustomer;
    @XmlElement(name = "Account")
    protected List<SupplementProfileRequest.Account> account;
    @XmlElement(name = "AddressInfo")
    protected List<SupplementProfileRequest.AddressInfo> addressInfo;

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
     * Gets the value of the newOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementProfileRequest.NewOwnership }
     *     
     */
    public SupplementProfileRequest.NewOwnership getNewOwnership() {
        return newOwnership;
    }

    /**
     * Sets the value of the newOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementProfileRequest.NewOwnership }
     *     
     */
    public void setNewOwnership(SupplementProfileRequest.NewOwnership value) {
        this.newOwnership = value;
    }

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubBasicInfo }
     *     
     */
    public SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(SubBasicInfo value) {
        this.subBasicInfo = value;
    }

    /**
     * Gets the value of the registerCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementProfileRequest.RegisterCustomer }
     *     
     */
    public SupplementProfileRequest.RegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }

    /**
     * Sets the value of the registerCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementProfileRequest.RegisterCustomer }
     *     
     */
    public void setRegisterCustomer(SupplementProfileRequest.RegisterCustomer value) {
        this.registerCustomer = value;
    }

    /**
     * Gets the value of the userCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementProfileRequest.UserCustomer }
     *     
     */
    public SupplementProfileRequest.UserCustomer getUserCustomer() {
        return userCustomer;
    }

    /**
     * Sets the value of the userCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementProfileRequest.UserCustomer }
     *     
     */
    public void setUserCustomer(SupplementProfileRequest.UserCustomer value) {
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
     * {@link SupplementProfileRequest.Account }
     * 
     * 
     */
    public List<SupplementProfileRequest.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<SupplementProfileRequest.Account>();
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
     * {@link SupplementProfileRequest.AddressInfo }
     * 
     * 
     */
    public List<SupplementProfileRequest.AddressInfo> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<SupplementProfileRequest.AddressInfo>();
        }
        return this.addressInfo;
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
     *         &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo" minOccurs="0"/&gt;
     *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="InitBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="CreditLimit" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AcctPayMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AutoPayChannelInfo"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
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
        "acctKey",
        "acctBasicInfo",
        "billCycleType",
        "currencyID",
        "initBalance",
        "creditLimit",
        "acctPayMethod",
        "autoPayChannel"
    })
    public static class Account
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "AcctBasicInfo")
        protected AccountBasicInfo acctBasicInfo;
        @XmlElement(name = "BillCycleType")
        protected String billCycleType;
        @XmlElement(name = "CurrencyID")
        protected BigInteger currencyID;
        @XmlElement(name = "InitBalance")
        protected Long initBalance;
        @XmlElement(name = "CreditLimit")
        protected List<SupplementProfileRequest.Account.CreditLimit> creditLimit;
        @XmlElement(name = "AcctPayMethod")
        protected String acctPayMethod;
        @XmlElement(name = "AutoPayChannel")
        protected List<SupplementProfileRequest.Account.AutoPayChannel> autoPayChannel;

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
         * Gets the value of the acctBasicInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AccountBasicInfo }
         *     
         */
        public AccountBasicInfo getAcctBasicInfo() {
            return acctBasicInfo;
        }

        /**
         * Sets the value of the acctBasicInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountBasicInfo }
         *     
         */
        public void setAcctBasicInfo(AccountBasicInfo value) {
            this.acctBasicInfo = value;
        }

        /**
         * Gets the value of the billCycleType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillCycleType() {
            return billCycleType;
        }

        /**
         * Sets the value of the billCycleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillCycleType(String value) {
            this.billCycleType = value;
        }

        /**
         * Gets the value of the currencyID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCurrencyID() {
            return currencyID;
        }

        /**
         * Sets the value of the currencyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCurrencyID(BigInteger value) {
            this.currencyID = value;
        }

        /**
         * Gets the value of the initBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInitBalance() {
            return initBalance;
        }

        /**
         * Sets the value of the initBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInitBalance(Long value) {
            this.initBalance = value;
        }

        /**
         * Gets the value of the creditLimit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditLimit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditLimit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplementProfileRequest.Account.CreditLimit }
         * 
         * 
         */
        public List<SupplementProfileRequest.Account.CreditLimit> getCreditLimit() {
            if (creditLimit == null) {
                creditLimit = new ArrayList<SupplementProfileRequest.Account.CreditLimit>();
            }
            return this.creditLimit;
        }

        /**
         * Gets the value of the acctPayMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctPayMethod() {
            return acctPayMethod;
        }

        /**
         * Sets the value of the acctPayMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctPayMethod(String value) {
            this.acctPayMethod = value;
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
         * {@link SupplementProfileRequest.Account.AutoPayChannel }
         * 
         * 
         */
        public List<SupplementProfileRequest.Account.AutoPayChannel> getAutoPayChannel() {
            if (autoPayChannel == null) {
                autoPayChannel = new ArrayList<SupplementProfileRequest.Account.AutoPayChannel>();
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
         *         &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AutoPayChannelInfo"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
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
            "autoPayChannelKey",
            "autoPayChannelInfo"
        })
        public static class AutoPayChannel
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AutoPayChannelKey", required = true)
            protected String autoPayChannelKey;
            @XmlElement(name = "AutoPayChannelInfo", required = true)
            protected SupplementProfileRequest.Account.AutoPayChannel.AutoPayChannelInfo autoPayChannelInfo;

            /**
             * Gets the value of the autoPayChannelKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutoPayChannelKey() {
                return autoPayChannelKey;
            }

            /**
             * Sets the value of the autoPayChannelKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutoPayChannelKey(String value) {
                this.autoPayChannelKey = value;
            }

            /**
             * Gets the value of the autoPayChannelInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SupplementProfileRequest.Account.AutoPayChannel.AutoPayChannelInfo }
             *     
             */
            public SupplementProfileRequest.Account.AutoPayChannel.AutoPayChannelInfo getAutoPayChannelInfo() {
                return autoPayChannelInfo;
            }

            /**
             * Sets the value of the autoPayChannelInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SupplementProfileRequest.Account.AutoPayChannel.AutoPayChannelInfo }
             *     
             */
            public void setAutoPayChannelInfo(SupplementProfileRequest.Account.AutoPayChannel.AutoPayChannelInfo value) {
                this.autoPayChannelInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AutoPayChannelInfo
                extends com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;

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
         *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
            "limitType",
            "limitValue"
        })
        public static class CreditLimit
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "LimitType")
            protected String limitType;
            @XmlElement(name = "LimitValue")
            protected long limitValue;

            /**
             * Gets the value of the limitType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitType() {
                return limitType;
            }

            /**
             * Sets the value of the limitType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitType(String value) {
                this.limitType = value;
            }

            /**
             * Gets the value of the limitValue property.
             * 
             */
            public long getLimitValue() {
                return limitValue;
            }

            /**
             * Sets the value of the limitValue property.
             * 
             */
            public void setLimitValue(long value) {
                this.limitValue = value;
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
     *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customerKey",
        "accountKey"
    })
    public static class NewOwnership
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CustomerKey", required = true)
        protected String customerKey;
        @XmlElement(name = "AccountKey")
        protected String accountKey;

        /**
         * Gets the value of the customerKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerKey() {
            return customerKey;
        }

        /**
         * Sets the value of the customerKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerKey(String value) {
            this.customerKey = value;
        }

        /**
         * Gets the value of the accountKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountKey() {
            return accountKey;
        }

        /**
         * Sets the value of the accountKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountKey(String value) {
            this.accountKey = value;
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
     *         &lt;element name="CustBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustBasicInfo" minOccurs="0"/&gt;
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
        "custBasicInfo",
        "individualInfo",
        "orgInfo"
    })
    public static class RegisterCustomer
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CustBasicInfo")
        protected CustBasicInfo custBasicInfo;
        @XmlElement(name = "IndividualInfo")
        protected IndividualInfo individualInfo;
        @XmlElement(name = "OrgInfo")
        protected OrgInfo orgInfo;

        /**
         * Gets the value of the custBasicInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustBasicInfo }
         *     
         */
        public CustBasicInfo getCustBasicInfo() {
            return custBasicInfo;
        }

        /**
         * Sets the value of the custBasicInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustBasicInfo }
         *     
         */
        public void setCustBasicInfo(CustBasicInfo value) {
            this.custBasicInfo = value;
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
