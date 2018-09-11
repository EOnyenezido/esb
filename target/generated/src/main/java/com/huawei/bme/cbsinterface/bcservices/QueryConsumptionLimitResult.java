
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryConsumptionLimitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryConsumptionLimitResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitUsageList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="UsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="LimitCtrlType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="MeasureType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="BeginDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="EndDay" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="LimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "QueryConsumptionLimitResult", propOrder = {
    "limitUsageList"
})
public class QueryConsumptionLimitResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "LimitUsageList")
    protected List<QueryConsumptionLimitResult.LimitUsageList> limitUsageList;

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
     * {@link QueryConsumptionLimitResult.LimitUsageList }
     * 
     * 
     */
    public List<QueryConsumptionLimitResult.LimitUsageList> getLimitUsageList() {
        if (limitUsageList == null) {
            limitUsageList = new ArrayList<QueryConsumptionLimitResult.LimitUsageList>();
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
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="UsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="LimitCtrlType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="MeasureType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="BeginDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="EndDay" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="LimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
        "limitType",
        "limitTypeName",
        "amount",
        "usageAmount",
        "limitCtrlType",
        "currencyID",
        "measureType",
        "measureID",
        "beginDate",
        "endDay",
        "limitParam"
    })
    public static class LimitUsageList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "LimitType", required = true)
        protected String limitType;
        @XmlElement(name = "LimitTypeName", required = true)
        protected String limitTypeName;
        @XmlElement(name = "Amount")
        protected long amount;
        @XmlElement(name = "UsageAmount")
        protected long usageAmount;
        @XmlElement(name = "LimitCtrlType", required = true)
        protected String limitCtrlType;
        @XmlElement(name = "CurrencyID")
        protected BigInteger currencyID;
        @XmlElement(name = "MeasureType")
        protected BigInteger measureType;
        @XmlElement(name = "MeasureID")
        protected BigInteger measureID;
        @XmlElement(name = "BeginDate")
        protected String beginDate;
        @XmlElement(name = "EndDay")
        protected String endDay;
        @XmlElement(name = "LimitParam")
        protected List<QueryConsumptionLimitResult.LimitUsageList.LimitParam> limitParam;

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
         * Gets the value of the limitTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitTypeName() {
            return limitTypeName;
        }

        /**
         * Sets the value of the limitTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitTypeName(String value) {
            this.limitTypeName = value;
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
         * Gets the value of the limitCtrlType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitCtrlType() {
            return limitCtrlType;
        }

        /**
         * Sets the value of the limitCtrlType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitCtrlType(String value) {
            this.limitCtrlType = value;
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
         * Gets the value of the measureType property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeasureType() {
            return measureType;
        }

        /**
         * Sets the value of the measureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeasureType(BigInteger value) {
            this.measureType = value;
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

        /**
         * Gets the value of the beginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeginDate() {
            return beginDate;
        }

        /**
         * Sets the value of the beginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeginDate(String value) {
            this.beginDate = value;
        }

        /**
         * Gets the value of the endDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDay() {
            return endDay;
        }

        /**
         * Sets the value of the endDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDay(String value) {
            this.endDay = value;
        }

        /**
         * Gets the value of the limitParam property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the limitParam property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLimitParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryConsumptionLimitResult.LimitUsageList.LimitParam }
         * 
         * 
         */
        public List<QueryConsumptionLimitResult.LimitUsageList.LimitParam> getLimitParam() {
            if (limitParam == null) {
                limitParam = new ArrayList<QueryConsumptionLimitResult.LimitUsageList.LimitParam>();
            }
            return this.limitParam;
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
         *         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
            "paramCode",
            "paramValue"
        })
        public static class LimitParam
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ParamCode", required = true)
            protected String paramCode;
            @XmlElement(name = "ParamValue")
            protected long paramValue;

            /**
             * Gets the value of the paramCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamCode() {
                return paramCode;
            }

            /**
             * Sets the value of the paramCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamCode(String value) {
                this.paramCode = value;
            }

            /**
             * Gets the value of the paramValue property.
             * 
             */
            public long getParamValue() {
                return paramValue;
            }

            /**
             * Sets the value of the paramValue property.
             * 
             */
            public void setParamValue(long value) {
                this.paramValue = value;
            }

        }

    }

}
