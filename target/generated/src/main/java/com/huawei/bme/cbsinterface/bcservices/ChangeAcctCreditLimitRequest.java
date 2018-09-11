
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;


/**
 * <p>Java class for ChangeAcctCreditLimitRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcctCreditLimitRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctAccessCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccountCredit" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="CommonCreditLimit"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="NewLimitAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                               &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="TmpCreditLimit"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                               &lt;element name="NewTmpLimitAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                               &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
 *                               &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddAccountCredit" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DelAccountCredit" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeAcctCreditLimitRequest", propOrder = {
    "acctAccessCode",
    "accountCredit",
    "addAccountCredit",
    "delAccountCredit"
})
public class ChangeAcctCreditLimitRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "AcctAccessCode", required = true)
    protected ChangeAcctCreditLimitRequest.AcctAccessCode acctAccessCode;
    @XmlElement(name = "AccountCredit")
    protected List<ChangeAcctCreditLimitRequest.AccountCredit> accountCredit;
    @XmlElement(name = "AddAccountCredit")
    protected ChangeAcctCreditLimitRequest.AddAccountCredit addAccountCredit;
    @XmlElement(name = "DelAccountCredit")
    protected ChangeAcctCreditLimitRequest.DelAccountCredit delAccountCredit;

    /**
     * Gets the value of the acctAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctCreditLimitRequest.AcctAccessCode }
     *     
     */
    public ChangeAcctCreditLimitRequest.AcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Sets the value of the acctAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctCreditLimitRequest.AcctAccessCode }
     *     
     */
    public void setAcctAccessCode(ChangeAcctCreditLimitRequest.AcctAccessCode value) {
        this.acctAccessCode = value;
    }

    /**
     * Gets the value of the accountCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeAcctCreditLimitRequest.AccountCredit }
     * 
     * 
     */
    public List<ChangeAcctCreditLimitRequest.AccountCredit> getAccountCredit() {
        if (accountCredit == null) {
            accountCredit = new ArrayList<ChangeAcctCreditLimitRequest.AccountCredit>();
        }
        return this.accountCredit;
    }

    /**
     * Gets the value of the addAccountCredit property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctCreditLimitRequest.AddAccountCredit }
     *     
     */
    public ChangeAcctCreditLimitRequest.AddAccountCredit getAddAccountCredit() {
        return addAccountCredit;
    }

    /**
     * Sets the value of the addAccountCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctCreditLimitRequest.AddAccountCredit }
     *     
     */
    public void setAddAccountCredit(ChangeAcctCreditLimitRequest.AddAccountCredit value) {
        this.addAccountCredit = value;
    }

    /**
     * Gets the value of the delAccountCredit property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctCreditLimitRequest.DelAccountCredit }
     *     
     */
    public ChangeAcctCreditLimitRequest.DelAccountCredit getDelAccountCredit() {
        return delAccountCredit;
    }

    /**
     * Sets the value of the delAccountCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctCreditLimitRequest.DelAccountCredit }
     *     
     */
    public void setDelAccountCredit(ChangeAcctCreditLimitRequest.DelAccountCredit value) {
        this.delAccountCredit = value;
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
     *         &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="CommonCreditLimit"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="NewLimitAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                     &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="TmpCreditLimit"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="NewTmpLimitAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                     &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
     *                     &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
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
        "creditLimitType",
        "commonCreditLimit",
        "tmpCreditLimit"
    })
    public static class AccountCredit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CreditLimitType")
        protected String creditLimitType;
        @XmlElement(name = "CommonCreditLimit")
        protected ChangeAcctCreditLimitRequest.AccountCredit.CommonCreditLimit commonCreditLimit;
        @XmlElement(name = "TmpCreditLimit")
        protected ChangeAcctCreditLimitRequest.AccountCredit.TmpCreditLimit tmpCreditLimit;

        /**
         * Gets the value of the creditLimitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditLimitType() {
            return creditLimitType;
        }

        /**
         * Sets the value of the creditLimitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditLimitType(String value) {
            this.creditLimitType = value;
        }

        /**
         * Gets the value of the commonCreditLimit property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctCreditLimitRequest.AccountCredit.CommonCreditLimit }
         *     
         */
        public ChangeAcctCreditLimitRequest.AccountCredit.CommonCreditLimit getCommonCreditLimit() {
            return commonCreditLimit;
        }

        /**
         * Sets the value of the commonCreditLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctCreditLimitRequest.AccountCredit.CommonCreditLimit }
         *     
         */
        public void setCommonCreditLimit(ChangeAcctCreditLimitRequest.AccountCredit.CommonCreditLimit value) {
            this.commonCreditLimit = value;
        }

        /**
         * Gets the value of the tmpCreditLimit property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctCreditLimitRequest.AccountCredit.TmpCreditLimit }
         *     
         */
        public ChangeAcctCreditLimitRequest.AccountCredit.TmpCreditLimit getTmpCreditLimit() {
            return tmpCreditLimit;
        }

        /**
         * Sets the value of the tmpCreditLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctCreditLimitRequest.AccountCredit.TmpCreditLimit }
         *     
         */
        public void setTmpCreditLimit(ChangeAcctCreditLimitRequest.AccountCredit.TmpCreditLimit value) {
            this.tmpCreditLimit = value;
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
         *         &lt;element name="NewLimitAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
            "newLimitAmount",
            "effectiveTime"
        })
        public static class CommonCreditLimit
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "NewLimitAmount")
            protected long newLimitAmount;
            @XmlElement(name = "EffectiveTime", required = true)
            protected EffectMode effectiveTime;

            /**
             * Gets the value of the newLimitAmount property.
             * 
             */
            public long getNewLimitAmount() {
                return newLimitAmount;
            }

            /**
             * Sets the value of the newLimitAmount property.
             * 
             */
            public void setNewLimitAmount(long value) {
                this.newLimitAmount = value;
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
         *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="NewTmpLimitAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
            "opType",
            "creditInstID",
            "newTmpLimitAmount",
            "effectiveTime",
            "expirationTime"
        })
        public static class TmpCreditLimit
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OpType")
            protected String opType;
            @XmlElement(name = "CreditInstID")
            protected Long creditInstID;
            @XmlElement(name = "NewTmpLimitAmount")
            protected Long newTmpLimitAmount;
            @XmlElement(name = "EffectiveTime")
            protected EffectMode effectiveTime;
            @XmlElement(name = "ExpirationTime")
            protected String expirationTime;

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
             * Gets the value of the creditInstID property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCreditInstID() {
                return creditInstID;
            }

            /**
             * Sets the value of the creditInstID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCreditInstID(Long value) {
                this.creditInstID = value;
            }

            /**
             * Gets the value of the newTmpLimitAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNewTmpLimitAmount() {
                return newTmpLimitAmount;
            }

            /**
             * Sets the value of the newTmpLimitAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNewTmpLimitAmount(Long value) {
                this.newTmpLimitAmount = value;
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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "payType"
    })
    public static class AcctAccessCode
        extends com.huawei.bme.cbsinterface.bccommon.AcctAccessCode
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PayType")
        protected String payType;

        /**
         * Gets the value of the payType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayType() {
            return payType;
        }

        /**
         * Sets the value of the payType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayType(String value) {
            this.payType = value;
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
     *         &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
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
        "creditLimitType",
        "limitAmount",
        "effectiveTime"
    })
    public static class AddAccountCredit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CreditLimitType", required = true)
        protected String creditLimitType;
        @XmlElement(name = "LimitAmount")
        protected long limitAmount;
        @XmlElement(name = "EffectiveTime")
        protected EffectMode effectiveTime;

        /**
         * Gets the value of the creditLimitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditLimitType() {
            return creditLimitType;
        }

        /**
         * Sets the value of the creditLimitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditLimitType(String value) {
            this.creditLimitType = value;
        }

        /**
         * Gets the value of the limitAmount property.
         * 
         */
        public long getLimitAmount() {
            return limitAmount;
        }

        /**
         * Sets the value of the limitAmount property.
         * 
         */
        public void setLimitAmount(long value) {
            this.limitAmount = value;
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
     *         &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "creditLimitType",
        "expirationTime"
    })
    public static class DelAccountCredit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CreditLimitType", required = true)
        protected String creditLimitType;
        @XmlElement(name = "ExpirationTime")
        protected String expirationTime;

        /**
         * Gets the value of the creditLimitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditLimitType() {
            return creditLimitType;
        }

        /**
         * Sets the value of the creditLimitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditLimitType(String value) {
            this.creditLimitType = value;
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

    }

}
