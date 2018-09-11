
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
 * <p>Java class for QuerySubInfoExToCubeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubInfoExToCubeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subscriber"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceNum"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PaymentType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="PrimaryOfferName"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PrimaryOfferKey" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="LifeCycleStatus" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ManagementSatus" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BlacklistStatus" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Code"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Value"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PaymentLimitUsage" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="UsedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "QuerySubInfoExToCubeResult", propOrder = {
    "subscriber"
})
public class QuerySubInfoExToCubeResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "Subscriber", required = true)
    protected QuerySubInfoExToCubeResult.Subscriber subscriber;

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubInfoExToCubeResult.Subscriber }
     *     
     */
    public QuerySubInfoExToCubeResult.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubInfoExToCubeResult.Subscriber }
     *     
     */
    public void setSubscriber(QuerySubInfoExToCubeResult.Subscriber value) {
        this.subscriber = value;
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
     *         &lt;element name="ServiceNum"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PaymentType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="PrimaryOfferName"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PrimaryOfferKey" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="LifeCycleStatus" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ManagementSatus" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BlacklistStatus" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Code"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Value"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PaymentLimitUsage" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="UsedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "serviceNum",
        "paymentType",
        "balanceAmount",
        "primaryOfferName",
        "primaryOfferKey",
        "lifeCycleStatus",
        "managementSatus",
        "blacklistStatus",
        "additionalProperty",
        "paymentLimitUsage"
    })
    public static class Subscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ServiceNum", required = true)
        protected String serviceNum;
        @XmlElement(name = "PaymentType", required = true, nillable = true)
        protected String paymentType;
        @XmlElement(name = "BalanceAmount")
        protected long balanceAmount;
        @XmlElement(name = "PrimaryOfferName", required = true)
        protected String primaryOfferName;
        @XmlElement(name = "PrimaryOfferKey", required = true)
        protected BigInteger primaryOfferKey;
        @XmlElement(name = "LifeCycleStatus")
        protected String lifeCycleStatus;
        @XmlElement(name = "ManagementSatus")
        protected String managementSatus;
        @XmlElement(name = "BlacklistStatus")
        protected String blacklistStatus;
        @XmlElement(name = "AdditionalProperty")
        protected List<QuerySubInfoExToCubeResult.Subscriber.AdditionalProperty> additionalProperty;
        @XmlElement(name = "PaymentLimitUsage")
        protected QuerySubInfoExToCubeResult.Subscriber.PaymentLimitUsage paymentLimitUsage;

        /**
         * Gets the value of the serviceNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceNum() {
            return serviceNum;
        }

        /**
         * Sets the value of the serviceNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceNum(String value) {
            this.serviceNum = value;
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
         * Gets the value of the balanceAmount property.
         * 
         */
        public long getBalanceAmount() {
            return balanceAmount;
        }

        /**
         * Sets the value of the balanceAmount property.
         * 
         */
        public void setBalanceAmount(long value) {
            this.balanceAmount = value;
        }

        /**
         * Gets the value of the primaryOfferName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryOfferName() {
            return primaryOfferName;
        }

        /**
         * Sets the value of the primaryOfferName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryOfferName(String value) {
            this.primaryOfferName = value;
        }

        /**
         * Gets the value of the primaryOfferKey property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPrimaryOfferKey() {
            return primaryOfferKey;
        }

        /**
         * Sets the value of the primaryOfferKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPrimaryOfferKey(BigInteger value) {
            this.primaryOfferKey = value;
        }

        /**
         * Gets the value of the lifeCycleStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLifeCycleStatus() {
            return lifeCycleStatus;
        }

        /**
         * Sets the value of the lifeCycleStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLifeCycleStatus(String value) {
            this.lifeCycleStatus = value;
        }

        /**
         * Gets the value of the managementSatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManagementSatus() {
            return managementSatus;
        }

        /**
         * Sets the value of the managementSatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManagementSatus(String value) {
            this.managementSatus = value;
        }

        /**
         * Gets the value of the blacklistStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlacklistStatus() {
            return blacklistStatus;
        }

        /**
         * Sets the value of the blacklistStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlacklistStatus(String value) {
            this.blacklistStatus = value;
        }

        /**
         * Gets the value of the additionalProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuerySubInfoExToCubeResult.Subscriber.AdditionalProperty }
         * 
         * 
         */
        public List<QuerySubInfoExToCubeResult.Subscriber.AdditionalProperty> getAdditionalProperty() {
            if (additionalProperty == null) {
                additionalProperty = new ArrayList<QuerySubInfoExToCubeResult.Subscriber.AdditionalProperty>();
            }
            return this.additionalProperty;
        }

        /**
         * Gets the value of the paymentLimitUsage property.
         * 
         * @return
         *     possible object is
         *     {@link QuerySubInfoExToCubeResult.Subscriber.PaymentLimitUsage }
         *     
         */
        public QuerySubInfoExToCubeResult.Subscriber.PaymentLimitUsage getPaymentLimitUsage() {
            return paymentLimitUsage;
        }

        /**
         * Sets the value of the paymentLimitUsage property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuerySubInfoExToCubeResult.Subscriber.PaymentLimitUsage }
         *     
         */
        public void setPaymentLimitUsage(QuerySubInfoExToCubeResult.Subscriber.PaymentLimitUsage value) {
            this.paymentLimitUsage = value;
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
         *         &lt;element name="Code"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Value"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
            "code",
            "value"
        })
        public static class AdditionalProperty
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="UsedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "amount",
            "usedAmount",
            "limitType"
        })
        public static class PaymentLimitUsage
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "Amount")
            protected long amount;
            @XmlElement(name = "UsedAmount")
            protected long usedAmount;
            @XmlElement(name = "LimitType", required = true)
            protected String limitType;

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
             * Gets the value of the usedAmount property.
             * 
             */
            public long getUsedAmount() {
                return usedAmount;
            }

            /**
             * Sets the value of the usedAmount property.
             * 
             */
            public void setUsedAmount(long value) {
                this.usedAmount = value;
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

        }

    }

}
