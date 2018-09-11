
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoPayChannelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoPayChannelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AcctName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CVVNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentPlan" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AutoPayType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="BillCycleSchema" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="AutoPayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="AutoPayMaxAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="TimeSchema"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="AutoRechargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="AutoRechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="LowBalanceSchema"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="BalanceThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                               &lt;element name="AutoRechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                               &lt;element name="ControlPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="MaxTimes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoPayChannelInfo", propOrder = {
    "bankCode",
    "bankBranchCode",
    "acctType",
    "creditCardType",
    "acctNo",
    "acctName",
    "cvvNumber",
    "expDate",
    "priority",
    "chargeCode",
    "paymentPlan"
})
@XmlSeeAlso({
    com.huawei.bme.cbsinterface.bccommon.AccountInfo.AutoPayChannel.AutoPayChannelInfo.class
})
public class AutoPayChannelInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "BankCode", required = true)
    protected String bankCode;
    @XmlElement(name = "BankBranchCode")
    protected String bankBranchCode;
    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "AcctName", required = true)
    protected String acctName;
    @XmlElement(name = "CVVNumber")
    protected String cvvNumber;
    @XmlElement(name = "ExpDate")
    protected String expDate;
    @XmlElement(name = "Priority")
    protected BigInteger priority;
    @XmlElement(name = "ChargeCode")
    protected List<String> chargeCode;
    @XmlElement(name = "PaymentPlan")
    protected List<AutoPayChannelInfo.PaymentPlan> paymentPlan;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchCode() {
        return bankBranchCode;
    }

    /**
     * Sets the value of the bankBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchCode(String value) {
        this.bankBranchCode = value;
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
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the acctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Gets the value of the acctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Sets the value of the acctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Gets the value of the cvvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVVNumber() {
        return cvvNumber;
    }

    /**
     * Sets the value of the cvvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVVNumber(String value) {
        this.cvvNumber = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
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
     * Gets the value of the chargeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChargeCode() {
        if (chargeCode == null) {
            chargeCode = new ArrayList<String>();
        }
        return this.chargeCode;
    }

    /**
     * Gets the value of the paymentPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoPayChannelInfo.PaymentPlan }
     * 
     * 
     */
    public List<AutoPayChannelInfo.PaymentPlan> getPaymentPlan() {
        if (paymentPlan == null) {
            paymentPlan = new ArrayList<AutoPayChannelInfo.PaymentPlan>();
        }
        return this.paymentPlan;
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
     *         &lt;element name="AutoPayType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="BillCycleSchema" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="AutoPayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="AutoPayMaxAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="TimeSchema"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;element name="AutoRechargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="AutoRechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="LowBalanceSchema"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="BalanceThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                     &lt;element name="AutoRechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                     &lt;element name="ControlPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="MaxTimes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "autoPayType",
        "billCycleSchema",
        "timeSchema",
        "lowBalanceSchema"
    })
    public static class PaymentPlan
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "AutoPayType", required = true)
        protected String autoPayType;
        @XmlElement(name = "BillCycleSchema")
        protected AutoPayChannelInfo.PaymentPlan.BillCycleSchema billCycleSchema;
        @XmlElement(name = "TimeSchema")
        protected AutoPayChannelInfo.PaymentPlan.TimeSchema timeSchema;
        @XmlElement(name = "LowBalanceSchema")
        protected AutoPayChannelInfo.PaymentPlan.LowBalanceSchema lowBalanceSchema;

        /**
         * Gets the value of the autoPayType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutoPayType() {
            return autoPayType;
        }

        /**
         * Sets the value of the autoPayType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutoPayType(String value) {
            this.autoPayType = value;
        }

        /**
         * Gets the value of the billCycleSchema property.
         * 
         * @return
         *     possible object is
         *     {@link AutoPayChannelInfo.PaymentPlan.BillCycleSchema }
         *     
         */
        public AutoPayChannelInfo.PaymentPlan.BillCycleSchema getBillCycleSchema() {
            return billCycleSchema;
        }

        /**
         * Sets the value of the billCycleSchema property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutoPayChannelInfo.PaymentPlan.BillCycleSchema }
         *     
         */
        public void setBillCycleSchema(AutoPayChannelInfo.PaymentPlan.BillCycleSchema value) {
            this.billCycleSchema = value;
        }

        /**
         * Gets the value of the timeSchema property.
         * 
         * @return
         *     possible object is
         *     {@link AutoPayChannelInfo.PaymentPlan.TimeSchema }
         *     
         */
        public AutoPayChannelInfo.PaymentPlan.TimeSchema getTimeSchema() {
            return timeSchema;
        }

        /**
         * Sets the value of the timeSchema property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutoPayChannelInfo.PaymentPlan.TimeSchema }
         *     
         */
        public void setTimeSchema(AutoPayChannelInfo.PaymentPlan.TimeSchema value) {
            this.timeSchema = value;
        }

        /**
         * Gets the value of the lowBalanceSchema property.
         * 
         * @return
         *     possible object is
         *     {@link AutoPayChannelInfo.PaymentPlan.LowBalanceSchema }
         *     
         */
        public AutoPayChannelInfo.PaymentPlan.LowBalanceSchema getLowBalanceSchema() {
            return lowBalanceSchema;
        }

        /**
         * Sets the value of the lowBalanceSchema property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutoPayChannelInfo.PaymentPlan.LowBalanceSchema }
         *     
         */
        public void setLowBalanceSchema(AutoPayChannelInfo.PaymentPlan.LowBalanceSchema value) {
            this.lowBalanceSchema = value;
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
         *         &lt;element name="AutoPayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AutoPayMaxAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
            "autoPayDate",
            "autoPayMaxAmt"
        })
        public static class BillCycleSchema
            implements Serializable
        {

            private final static long serialVersionUID = 11082017L;
            @XmlElement(name = "AutoPayDate")
            protected String autoPayDate;
            @XmlElement(name = "AutoPayMaxAmt")
            protected Long autoPayMaxAmt;

            /**
             * Gets the value of the autoPayDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutoPayDate() {
                return autoPayDate;
            }

            /**
             * Sets the value of the autoPayDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutoPayDate(String value) {
                this.autoPayDate = value;
            }

            /**
             * Gets the value of the autoPayMaxAmt property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAutoPayMaxAmt() {
                return autoPayMaxAmt;
            }

            /**
             * Sets the value of the autoPayMaxAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAutoPayMaxAmt(Long value) {
                this.autoPayMaxAmt = value;
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
         *         &lt;element name="BalanceThreshold" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="AutoRechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="ControlPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MaxTimes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "balanceThreshold",
            "autoRechargeAmt",
            "controlPeriodType",
            "maxTimes"
        })
        public static class LowBalanceSchema
            implements Serializable
        {

            private final static long serialVersionUID = 11082017L;
            @XmlElement(name = "BalanceThreshold")
            protected long balanceThreshold;
            @XmlElement(name = "AutoRechargeAmt")
            protected long autoRechargeAmt;
            @XmlElement(name = "ControlPeriodType")
            protected String controlPeriodType;
            @XmlElement(name = "MaxTimes")
            protected BigInteger maxTimes;

            /**
             * Gets the value of the balanceThreshold property.
             * 
             */
            public long getBalanceThreshold() {
                return balanceThreshold;
            }

            /**
             * Sets the value of the balanceThreshold property.
             * 
             */
            public void setBalanceThreshold(long value) {
                this.balanceThreshold = value;
            }

            /**
             * Gets the value of the autoRechargeAmt property.
             * 
             */
            public long getAutoRechargeAmt() {
                return autoRechargeAmt;
            }

            /**
             * Sets the value of the autoRechargeAmt property.
             * 
             */
            public void setAutoRechargeAmt(long value) {
                this.autoRechargeAmt = value;
            }

            /**
             * Gets the value of the controlPeriodType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlPeriodType() {
                return controlPeriodType;
            }

            /**
             * Sets the value of the controlPeriodType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlPeriodType(String value) {
                this.controlPeriodType = value;
            }

            /**
             * Gets the value of the maxTimes property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxTimes() {
                return maxTimes;
            }

            /**
             * Sets the value of the maxTimes property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxTimes(BigInteger value) {
                this.maxTimes = value;
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
         *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AutoRechargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AutoRechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
            "periodType",
            "autoRechargeDate",
            "autoRechargeAmt"
        })
        public static class TimeSchema
            implements Serializable
        {

            private final static long serialVersionUID = 11082017L;
            @XmlElement(name = "PeriodType", required = true)
            protected String periodType;
            @XmlElement(name = "AutoRechargeDate")
            protected String autoRechargeDate;
            @XmlElement(name = "AutoRechargeAmt")
            protected long autoRechargeAmt;

            /**
             * Gets the value of the periodType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPeriodType() {
                return periodType;
            }

            /**
             * Sets the value of the periodType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPeriodType(String value) {
                this.periodType = value;
            }

            /**
             * Gets the value of the autoRechargeDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutoRechargeDate() {
                return autoRechargeDate;
            }

            /**
             * Sets the value of the autoRechargeDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutoRechargeDate(String value) {
                this.autoRechargeDate = value;
            }

            /**
             * Gets the value of the autoRechargeAmt property.
             * 
             */
            public long getAutoRechargeAmt() {
                return autoRechargeAmt;
            }

            /**
             * Sets the value of the autoRechargeAmt property.
             * 
             */
            public void setAutoRechargeAmt(long value) {
                this.autoRechargeAmt = value;
            }

        }

    }

}
