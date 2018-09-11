
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
 * <p>Java class for QueryPaymentRelationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPaymentRelationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentRelationList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DefaultPayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PayObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PayObjKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PayObjCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
 *                             &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OriginKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPaymentRelationResult", propOrder = {
    "paymentRelationList"
})
public class QueryPaymentRelationResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "PaymentRelationList")
    protected QueryPaymentRelationResult.PaymentRelationList paymentRelationList;

    /**
     * Gets the value of the paymentRelationList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPaymentRelationResult.PaymentRelationList }
     *     
     */
    public QueryPaymentRelationResult.PaymentRelationList getPaymentRelationList() {
        return paymentRelationList;
    }

    /**
     * Sets the value of the paymentRelationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPaymentRelationResult.PaymentRelationList }
     *     
     */
    public void setPaymentRelationList(QueryPaymentRelationResult.PaymentRelationList value) {
        this.paymentRelationList = value;
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
     *         &lt;element name="PayRelation" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DefaultPayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PayObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PayObjKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PayObjCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
     *                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OriginKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "payRelation",
        "paymentLimit"
    })
    public static class PaymentRelationList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PayRelation", required = true)
        protected List<QueryPaymentRelationResult.PaymentRelationList.PayRelation> payRelation;
        @XmlElement(name = "PaymentLimit")
        protected List<QueryPaymentRelationResult.PaymentRelationList.PaymentLimit> paymentLimit;

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
         * {@link QueryPaymentRelationResult.PaymentRelationList.PayRelation }
         * 
         * 
         */
        public List<QueryPaymentRelationResult.PaymentRelationList.PayRelation> getPayRelation() {
            if (payRelation == null) {
                payRelation = new ArrayList<QueryPaymentRelationResult.PaymentRelationList.PayRelation>();
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
         * {@link QueryPaymentRelationResult.PaymentRelationList.PaymentLimit }
         * 
         * 
         */
        public List<QueryPaymentRelationResult.PaymentRelationList.PaymentLimit> getPaymentLimit() {
            if (paymentLimit == null) {
                paymentLimit = new ArrayList<QueryPaymentRelationResult.PaymentRelationList.PaymentLimit>();
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
         *         &lt;element name="DefaultPayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PayObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PayObjKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PayObjCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
         *         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OriginKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "defaultPayFlag",
            "acctKey",
            "payObjType",
            "payObjKey",
            "payObjCode",
            "priority",
            "payRelExtRule",
            "onlyPayRelFlag",
            "paymentLimitKey",
            "originType",
            "originKey",
            "effectiveTime",
            "expirationTime"
        })
        public static class PayRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PayRelationKey", required = true)
            protected String payRelationKey;
            @XmlElement(name = "DefaultPayFlag", required = true)
            protected String defaultPayFlag;
            @XmlElement(name = "AcctKey", required = true)
            protected String acctKey;
            @XmlElement(name = "PayObjType", required = true)
            protected String payObjType;
            @XmlElement(name = "PayObjKey", required = true)
            protected String payObjKey;
            @XmlElement(name = "PayObjCode", required = true)
            protected String payObjCode;
            @XmlElement(name = "Priority", required = true)
            protected BigInteger priority;
            @XmlElement(name = "PayRelExtRule")
            protected PayRelExtRule payRelExtRule;
            @XmlElement(name = "OnlyPayRelFlag")
            protected String onlyPayRelFlag;
            @XmlElement(name = "PaymentLimitKey")
            protected String paymentLimitKey;
            @XmlElement(name = "OriginType")
            protected String originType;
            @XmlElement(name = "OriginKey")
            protected String originKey;
            @XmlElement(name = "EffectiveTime", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;

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
             * Gets the value of the defaultPayFlag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefaultPayFlag() {
                return defaultPayFlag;
            }

            /**
             * Sets the value of the defaultPayFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefaultPayFlag(String value) {
                this.defaultPayFlag = value;
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
             * Gets the value of the payObjType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayObjType() {
                return payObjType;
            }

            /**
             * Sets the value of the payObjType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayObjType(String value) {
                this.payObjType = value;
            }

            /**
             * Gets the value of the payObjKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayObjKey() {
                return payObjKey;
            }

            /**
             * Sets the value of the payObjKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayObjKey(String value) {
                this.payObjKey = value;
            }

            /**
             * Gets the value of the payObjCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayObjCode() {
                return payObjCode;
            }

            /**
             * Sets the value of the payObjCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayObjCode(String value) {
                this.payObjCode = value;
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

            /**
             * Gets the value of the originType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginType() {
                return originType;
            }

            /**
             * Sets the value of the originType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginType(String value) {
                this.originType = value;
            }

            /**
             * Gets the value of the originKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginKey() {
                return originKey;
            }

            /**
             * Sets the value of the originKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginKey(String value) {
                this.originKey = value;
            }

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
            protected QueryPaymentRelationResult.PaymentRelationList.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

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
             *     {@link QueryPaymentRelationResult.PaymentRelationList.PaymentLimit.PaymentLimitInfo }
             *     
             */
            public QueryPaymentRelationResult.PaymentRelationList.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                return paymentLimitInfo;
            }

            /**
             * Sets the value of the paymentLimitInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryPaymentRelationResult.PaymentRelationList.PaymentLimit.PaymentLimitInfo }
             *     
             */
            public void setPaymentLimitInfo(QueryPaymentRelationResult.PaymentRelationList.PaymentLimit.PaymentLimitInfo value) {
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
