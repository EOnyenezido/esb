
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoPaymentPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoPaymentPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoPayType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentObjectID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LimitTimes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoPaymentPlan", propOrder = {
    "autoPayType",
    "paymentObjectType",
    "paymentObjectID",
    "paymentDate",
    "amount",
    "limitTimes"
})
public class AutoPaymentPlan
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "AutoPayType", required = true)
    protected String autoPayType;
    @XmlElement(name = "PaymentObjectType", required = true)
    protected String paymentObjectType;
    @XmlElement(name = "PaymentObjectID", required = true)
    protected String paymentObjectID;
    @XmlElement(name = "PaymentDate")
    protected String paymentDate;
    @XmlElement(name = "Amount")
    protected Long amount;
    @XmlElement(name = "LimitTimes")
    protected BigInteger limitTimes;

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
     * Gets the value of the paymentObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentObjectType() {
        return paymentObjectType;
    }

    /**
     * Sets the value of the paymentObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentObjectType(String value) {
        this.paymentObjectType = value;
    }

    /**
     * Gets the value of the paymentObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentObjectID() {
        return paymentObjectID;
    }

    /**
     * Sets the value of the paymentObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentObjectID(String value) {
        this.paymentObjectID = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the limitTimes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitTimes() {
        return limitTimes;
    }

    /**
     * Sets the value of the limitTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitTimes(BigInteger value) {
        this.limitTimes = value;
    }

}
