
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.PayRelExtRule;


/**
 * <p>Java class for QueryPaymentLimitUsageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPaymentLimitUsageResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitUsageList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
 *                   &lt;element name="LimitInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="UsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "QueryPaymentLimitUsageResult", propOrder = {
    "limitUsageList"
})
public class QueryPaymentLimitUsageResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "LimitUsageList")
    protected List<QueryPaymentLimitUsageResult.LimitUsageList> limitUsageList;

    /**
     * Gets the value of the limitUsageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitUsageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitUsageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPaymentLimitUsageResult.LimitUsageList }
     * 
     * 
     */
    public List<QueryPaymentLimitUsageResult.LimitUsageList> getLimitUsageList() {
        if (limitUsageList == null) {
            limitUsageList = new ArrayList<QueryPaymentLimitUsageResult.LimitUsageList>();
        }
        return this.limitUsageList;
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
     *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
     *         &lt;element name="LimitInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="UsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "priority",
        "payRelExtRule",
        "limitInstID",
        "amount",
        "usageAmount",
        "limitType",
        "currencyID",
        "measureID"
    })
    public static class LimitUsageList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PayRelationKey", required = true)
        protected String payRelationKey;
        @XmlElement(name = "Priority", required = true)
        protected BigInteger priority;
        @XmlElement(name = "PayRelExtRule")
        protected PayRelExtRule payRelExtRule;
        @XmlElement(name = "LimitInstID")
        protected long limitInstID;
        @XmlElement(name = "Amount")
        protected long amount;
        @XmlElement(name = "UsageAmount")
        protected long usageAmount;
        @XmlElement(name = "LimitType", required = true)
        protected String limitType;
        @XmlElement(name = "CurrencyID")
        protected BigInteger currencyID;
        @XmlElement(name = "MeasureID")
        protected BigInteger measureID;

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
         * Gets the value of the limitInstID property.
         * 
         */
        public long getLimitInstID() {
            return limitInstID;
        }

        /**
         * Sets the value of the limitInstID property.
         * 
         */
        public void setLimitInstID(long value) {
            this.limitInstID = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         */
        public long getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         */
        public void setAmount(long value) {
            this.amount = value;
        }

        /**
         * Gets the value of the usageAmount property.
         * 
         */
        public long getUsageAmount() {
            return usageAmount;
        }

        /**
         * Sets the value of the usageAmount property.
         * 
         */
        public void setUsageAmount(long value) {
            this.usageAmount = value;
        }

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
         * Gets the value of the measureID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeasureID() {
            return measureID;
        }

        /**
         * Sets the value of the measureID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeasureID(BigInteger value) {
            this.measureID = value;
        }

    }

}
