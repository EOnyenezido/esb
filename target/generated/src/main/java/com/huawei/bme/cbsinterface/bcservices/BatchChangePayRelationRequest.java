
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
 * <p>Java class for BatchChangePayRelationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchChangePayRelationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentAcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayRelation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ControlRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PayLimit" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Limit"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="LimitValueType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="LimitMeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                                 &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
 *                   &lt;element name="ModPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ControlRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchChangePayRelationRequest", propOrder = {
    "paymentAcctKey",
    "payRelation",
    "fileName"
})
public class BatchChangePayRelationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "PaymentAcctKey", required = true)
    protected String paymentAcctKey;
    @XmlElement(name = "PayRelation")
    protected BatchChangePayRelationRequest.PayRelation payRelation;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;

    /**
     * Gets the value of the paymentAcctKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAcctKey() {
        return paymentAcctKey;
    }

    /**
     * Sets the value of the paymentAcctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAcctKey(String value) {
        this.paymentAcctKey = value;
    }

    /**
     * Gets the value of the payRelation property.
     * 
     * @return
     *     possible object is
     *     {@link BatchChangePayRelationRequest.PayRelation }
     *     
     */
    public BatchChangePayRelationRequest.PayRelation getPayRelation() {
        return payRelation;
    }

    /**
     * Sets the value of the payRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchChangePayRelationRequest.PayRelation }
     *     
     */
    public void setPayRelation(BatchChangePayRelationRequest.PayRelation value) {
        this.payRelation = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     *         &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ControlRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PayLimit" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Limit"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="LimitValueType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="LimitMeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                                       &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
     *         &lt;element name="ModPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ControlRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
        "addPayRelation",
        "modPayRelation"
    })
    public static class PayRelation
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AddPayRelation")
        protected List<BatchChangePayRelationRequest.PayRelation.AddPayRelation> addPayRelation;
        @XmlElement(name = "ModPayRelation")
        protected List<BatchChangePayRelationRequest.PayRelation.ModPayRelation> modPayRelation;

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
         * {@link BatchChangePayRelationRequest.PayRelation.AddPayRelation }
         * 
         * 
         */
        public List<BatchChangePayRelationRequest.PayRelation.AddPayRelation> getAddPayRelation() {
            if (addPayRelation == null) {
                addPayRelation = new ArrayList<BatchChangePayRelationRequest.PayRelation.AddPayRelation>();
            }
            return this.addPayRelation;
        }

        /**
         * Gets the value of the modPayRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modPayRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModPayRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchChangePayRelationRequest.PayRelation.ModPayRelation }
         * 
         * 
         */
        public List<BatchChangePayRelationRequest.PayRelation.ModPayRelation> getModPayRelation() {
            if (modPayRelation == null) {
                modPayRelation = new ArrayList<BatchChangePayRelationRequest.PayRelation.ModPayRelation>();
            }
            return this.modPayRelation;
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
         *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ControlRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PayLimit" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Limit"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="LimitValueType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="LimitMeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "priority",
            "onlyPayRelFlag",
            "chargeCode",
            "controlRule",
            "payLimit"
        })
        public static class AddPayRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "Priority")
            protected BigInteger priority;
            @XmlElement(name = "OnlyPayRelFlag")
            protected String onlyPayRelFlag;
            @XmlElement(name = "ChargeCode")
            protected String chargeCode;
            @XmlElement(name = "ControlRule")
            protected String controlRule;
            @XmlElement(name = "PayLimit")
            protected BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit payLimit;

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
             * Gets the value of the chargeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeCode() {
                return chargeCode;
            }

            /**
             * Sets the value of the chargeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeCode(String value) {
                this.chargeCode = value;
            }

            /**
             * Gets the value of the controlRule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlRule() {
                return controlRule;
            }

            /**
             * Sets the value of the controlRule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlRule(String value) {
                this.controlRule = value;
            }

            /**
             * Gets the value of the payLimit property.
             * 
             * @return
             *     possible object is
             *     {@link BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit }
             *     
             */
            public BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit getPayLimit() {
                return payLimit;
            }

            /**
             * Sets the value of the payLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit }
             *     
             */
            public void setPayLimit(BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit value) {
                this.payLimit = value;
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
             *         &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Limit"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="LimitValueType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="LimitMeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                "limitCycleType",
                "limit",
                "currencyID"
            })
            public static class PayLimit
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "LimitCycleType", required = true)
                protected String limitCycleType;
                @XmlElement(name = "Limit", required = true)
                protected BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit.Limit limit;
                @XmlElement(name = "CurrencyID")
                protected BigInteger currencyID;

                /**
                 * Gets the value of the limitCycleType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLimitCycleType() {
                    return limitCycleType;
                }

                /**
                 * Sets the value of the limitCycleType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLimitCycleType(String value) {
                    this.limitCycleType = value;
                }

                /**
                 * Gets the value of the limit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit.Limit }
                 *     
                 */
                public BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit.Limit getLimit() {
                    return limit;
                }

                /**
                 * Sets the value of the limit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit.Limit }
                 *     
                 */
                public void setLimit(BatchChangePayRelationRequest.PayRelation.AddPayRelation.PayLimit.Limit value) {
                    this.limit = value;
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
                 *         &lt;element name="LimitValueType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="LimitMeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                    "limitValueType",
                    "limitMeasureUnit",
                    "limitValue"
                })
                public static class Limit
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "LimitType", required = true)
                    protected String limitType;
                    @XmlElement(name = "LimitValueType", required = true)
                    protected String limitValueType;
                    @XmlElement(name = "LimitMeasureUnit")
                    protected BigInteger limitMeasureUnit;
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
                     * Gets the value of the limitValueType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLimitValueType() {
                        return limitValueType;
                    }

                    /**
                     * Sets the value of the limitValueType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLimitValueType(String value) {
                        this.limitValueType = value;
                    }

                    /**
                     * Gets the value of the limitMeasureUnit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getLimitMeasureUnit() {
                        return limitMeasureUnit;
                    }

                    /**
                     * Sets the value of the limitMeasureUnit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setLimitMeasureUnit(BigInteger value) {
                        this.limitMeasureUnit = value;
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
         *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ControlRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
            "priority",
            "onlyPayRelFlag",
            "chargeCode",
            "controlRule",
            "limitValue"
        })
        public static class ModPayRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "Priority")
            protected BigInteger priority;
            @XmlElement(name = "OnlyPayRelFlag")
            protected String onlyPayRelFlag;
            @XmlElement(name = "ChargeCode")
            protected String chargeCode;
            @XmlElement(name = "ControlRule")
            protected String controlRule;
            @XmlElement(name = "LimitValue")
            protected Long limitValue;

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
             * Gets the value of the chargeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeCode() {
                return chargeCode;
            }

            /**
             * Sets the value of the chargeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeCode(String value) {
                this.chargeCode = value;
            }

            /**
             * Gets the value of the controlRule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlRule() {
                return controlRule;
            }

            /**
             * Sets the value of the controlRule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlRule(String value) {
                this.controlRule = value;
            }

            /**
             * Gets the value of the limitValue property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLimitValue() {
                return limitValue;
            }

            /**
             * Sets the value of the limitValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLimitValue(Long value) {
                this.limitValue = value;
            }

        }

    }

}
