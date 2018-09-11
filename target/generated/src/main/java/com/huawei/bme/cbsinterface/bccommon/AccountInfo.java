
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "AccountInfo", propOrder = {
    "acctCode",
    "userCustomerKey",
    "parentAcctKey",
    "acctBasicInfo",
    "billCycleType",
    "acctType",
    "paymentType",
    "acctClass",
    "currencyID",
    "initBalance",
    "creditLimit",
    "acctPayMethod",
    "autoPayChannel"
})
public class AccountInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "AcctCode")
    protected String acctCode;
    @XmlElement(name = "UserCustomerKey")
    protected String userCustomerKey;
    @XmlElement(name = "ParentAcctKey")
    protected String parentAcctKey;
    @XmlElement(name = "AcctBasicInfo")
    protected AccountBasicInfo acctBasicInfo;
    @XmlElement(name = "BillCycleType")
    protected String billCycleType;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "AcctClass")
    protected String acctClass;
    @XmlElement(name = "CurrencyID")
    protected BigInteger currencyID;
    @XmlElement(name = "InitBalance")
    protected Long initBalance;
    @XmlElement(name = "CreditLimit")
    protected List<AccountInfo.CreditLimit> creditLimit;
    @XmlElement(name = "AcctPayMethod")
    protected String acctPayMethod;
    @XmlElement(name = "AutoPayChannel")
    protected List<AccountInfo.AutoPayChannel> autoPayChannel;

    /**
     * Gets the value of the acctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Sets the value of the acctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
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
     * Gets the value of the parentAcctKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAcctKey() {
        return parentAcctKey;
    }

    /**
     * Sets the value of the parentAcctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAcctKey(String value) {
        this.parentAcctKey = value;
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
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the acctClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctClass() {
        return acctClass;
    }

    /**
     * Sets the value of the acctClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctClass(String value) {
        this.acctClass = value;
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
     * {@link AccountInfo.CreditLimit }
     * 
     * 
     */
    public List<AccountInfo.CreditLimit> getCreditLimit() {
        if (creditLimit == null) {
            creditLimit = new ArrayList<AccountInfo.CreditLimit>();
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
     * {@link AccountInfo.AutoPayChannel }
     * 
     * 
     */
    public List<AccountInfo.AutoPayChannel> getAutoPayChannel() {
        if (autoPayChannel == null) {
            autoPayChannel = new ArrayList<AccountInfo.AutoPayChannel>();
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

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "AutoPayChannelKey", required = true)
        protected String autoPayChannelKey;
        @XmlElement(name = "AutoPayChannelInfo", required = true)
        protected AccountInfo.AutoPayChannel.AutoPayChannelInfo autoPayChannelInfo;

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
         *     {@link AccountInfo.AutoPayChannel.AutoPayChannelInfo }
         *     
         */
        public AccountInfo.AutoPayChannel.AutoPayChannelInfo getAutoPayChannelInfo() {
            return autoPayChannelInfo;
        }

        /**
         * Sets the value of the autoPayChannelInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountInfo.AutoPayChannel.AutoPayChannelInfo }
         *     
         */
        public void setAutoPayChannelInfo(AccountInfo.AutoPayChannel.AutoPayChannelInfo value) {
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

            private final static long serialVersionUID = 11082017L;

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

        private final static long serialVersionUID = 11082017L;
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
