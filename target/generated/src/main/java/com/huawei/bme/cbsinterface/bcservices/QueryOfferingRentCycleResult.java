
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for QueryOfferingRentCycleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOfferingRentCycleResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingRentCycle" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferingOwner"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                             &lt;element name="AcctAccessCode"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                             &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                   &lt;element name="OpenDay" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="EndDay" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="RentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="ProcessedCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="SuccessCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "QueryOfferingRentCycleResult", propOrder = {
    "offeringRentCycle"
})
public class QueryOfferingRentCycleResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OfferingRentCycle")
    protected List<QueryOfferingRentCycleResult.OfferingRentCycle> offeringRentCycle;

    /**
     * Gets the value of the offeringRentCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offeringRentCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingRentCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOfferingRentCycleResult.OfferingRentCycle }
     * 
     * 
     */
    public List<QueryOfferingRentCycleResult.OfferingRentCycle> getOfferingRentCycle() {
        if (offeringRentCycle == null) {
            offeringRentCycle = new ArrayList<QueryOfferingRentCycleResult.OfferingRentCycle>();
        }
        return this.offeringRentCycle;
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
     *         &lt;element name="OfferingOwner"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *                   &lt;element name="AcctAccessCode"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
     *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *         &lt;element name="OpenDay" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="EndDay" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="RentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="ProcessedCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="SuccessCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "offeringOwner",
        "offeringKey",
        "openDay",
        "endDay",
        "rentAmount",
        "currencyID",
        "processedCycleNum",
        "successCycleNum"
    })
    public static class OfferingRentCycle
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingOwner", required = true)
        protected QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner offeringOwner;
        @XmlElement(name = "OfferingKey", required = true)
        protected OfferingKey offeringKey;
        @XmlElement(name = "OpenDay")
        protected String openDay;
        @XmlElement(name = "EndDay")
        protected String endDay;
        @XmlElement(name = "RentAmount")
        protected Long rentAmount;
        @XmlElement(name = "CurrencyID")
        protected BigInteger currencyID;
        @XmlElement(name = "ProcessedCycleNum")
        protected BigInteger processedCycleNum;
        @XmlElement(name = "SuccessCycleNum")
        protected BigInteger successCycleNum;

        /**
         * Gets the value of the offeringOwner property.
         * 
         * @return
         *     possible object is
         *     {@link QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner }
         *     
         */
        public QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner getOfferingOwner() {
            return offeringOwner;
        }

        /**
         * Sets the value of the offeringOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner }
         *     
         */
        public void setOfferingOwner(QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner value) {
            this.offeringOwner = value;
        }

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
         * Gets the value of the openDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenDay() {
            return openDay;
        }

        /**
         * Sets the value of the openDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenDay(String value) {
            this.openDay = value;
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
         * Gets the value of the rentAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRentAmount() {
            return rentAmount;
        }

        /**
         * Sets the value of the rentAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRentAmount(Long value) {
            this.rentAmount = value;
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
         * Gets the value of the processedCycleNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProcessedCycleNum() {
            return processedCycleNum;
        }

        /**
         * Sets the value of the processedCycleNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProcessedCycleNum(BigInteger value) {
            this.processedCycleNum = value;
        }

        /**
         * Gets the value of the successCycleNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSuccessCycleNum() {
            return successCycleNum;
        }

        /**
         * Sets the value of the successCycleNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSuccessCycleNum(BigInteger value) {
            this.successCycleNum = value;
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
         *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
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
         *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
         *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
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
            "subAccessCode",
            "acctAccessCode",
            "custAccessCode",
            "subGroupAccessCode"
        })
        public static class OfferingOwner
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "SubAccessCode")
            protected SubAccessCode subAccessCode;
            @XmlElement(name = "AcctAccessCode")
            protected QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner.AcctAccessCode acctAccessCode;
            @XmlElement(name = "CustAccessCode")
            protected CustAccessCode custAccessCode;
            @XmlElement(name = "SubGroupAccessCode")
            protected SubGroupAccessCode subGroupAccessCode;

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
             * Gets the value of the acctAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner.AcctAccessCode }
             *     
             */
            public QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner.AcctAccessCode getAcctAccessCode() {
                return acctAccessCode;
            }

            /**
             * Sets the value of the acctAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner.AcctAccessCode }
             *     
             */
            public void setAcctAccessCode(QueryOfferingRentCycleResult.OfferingRentCycle.OfferingOwner.AcctAccessCode value) {
                this.acctAccessCode = value;
            }

            /**
             * Gets the value of the custAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link CustAccessCode }
             *     
             */
            public CustAccessCode getCustAccessCode() {
                return custAccessCode;
            }

            /**
             * Sets the value of the custAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustAccessCode }
             *     
             */
            public void setCustAccessCode(CustAccessCode value) {
                this.custAccessCode = value;
            }

            /**
             * Gets the value of the subGroupAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link SubGroupAccessCode }
             *     
             */
            public SubGroupAccessCode getSubGroupAccessCode() {
                return subGroupAccessCode;
            }

            /**
             * Sets the value of the subGroupAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubGroupAccessCode }
             *     
             */
            public void setSubGroupAccessCode(SubGroupAccessCode value) {
                this.subGroupAccessCode = value;
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

        }

    }

}
