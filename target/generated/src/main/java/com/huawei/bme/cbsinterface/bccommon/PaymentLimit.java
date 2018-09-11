
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentLimit"&gt;
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
 *         &lt;element name="LimitRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CBonusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentLimit", propOrder = {
    "limitCycleType",
    "limit",
    "limitRule",
    "cBonusFlag",
    "currencyID"
})
public class PaymentLimit
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "LimitCycleType", required = true)
    protected String limitCycleType;
    @XmlElement(name = "Limit", required = true)
    protected PaymentLimit.Limit limit;
    @XmlElement(name = "LimitRule")
    protected String limitRule;
    @XmlElement(name = "CBonusFlag")
    protected String cBonusFlag;
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
     *     {@link PaymentLimit.Limit }
     *     
     */
    public PaymentLimit.Limit getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLimit.Limit }
     *     
     */
    public void setLimit(PaymentLimit.Limit value) {
        this.limit = value;
    }

    /**
     * Gets the value of the limitRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRule() {
        return limitRule;
    }

    /**
     * Sets the value of the limitRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRule(String value) {
        this.limitRule = value;
    }

    /**
     * Gets the value of the cBonusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBonusFlag() {
        return cBonusFlag;
    }

    /**
     * Sets the value of the cBonusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBonusFlag(String value) {
        this.cBonusFlag = value;
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

        private final static long serialVersionUID = 11082017L;
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
