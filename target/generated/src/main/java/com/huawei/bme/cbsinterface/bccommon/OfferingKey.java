
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferingKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferingKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="OfferingCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PurchaseSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingKey", propOrder = {
    "offeringID",
    "offeringCode",
    "purchaseSeq"
})
public class OfferingKey
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElementRef(name = "OfferingID", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> offeringID;
    @XmlElement(name = "OfferingCode")
    protected String offeringCode;
    @XmlElement(name = "PurchaseSeq")
    protected String purchaseSeq;

    /**
     * Gets the value of the offeringID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getOfferingID() {
        return offeringID;
    }

    /**
     * Sets the value of the offeringID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setOfferingID(JAXBElement<BigInteger> value) {
        this.offeringID = value;
    }

    /**
     * Gets the value of the offeringCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingCode() {
        return offeringCode;
    }

    /**
     * Sets the value of the offeringCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingCode(String value) {
        this.offeringCode = value;
    }

    /**
     * Gets the value of the purchaseSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseSeq() {
        return purchaseSeq;
    }

    /**
     * Sets the value of the purchaseSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseSeq(String value) {
        this.purchaseSeq = value;
    }

}
