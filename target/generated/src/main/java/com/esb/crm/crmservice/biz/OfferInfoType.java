
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingID" type="{http://www.esb.com/crm/crmservice/biz}OfferingIDType"/&gt;
 *         &lt;element name="OfferingOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferInfoType", propOrder = {
    "offeringID",
    "offeringOrderKey",
    "expireTime"
})
public class OfferInfoType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "OfferingID", required = true)
    protected OfferingIDType offeringID;
    @XmlElement(name = "OfferingOrderKey")
    protected String offeringOrderKey;
    @XmlElement(name = "ExpireTime", required = true)
    protected String expireTime;

    /**
     * Gets the value of the offeringID property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingIDType }
     *     
     */
    public OfferingIDType getOfferingID() {
        return offeringID;
    }

    /**
     * Sets the value of the offeringID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingIDType }
     *     
     */
    public void setOfferingID(OfferingIDType value) {
        this.offeringID = value;
    }

    /**
     * Gets the value of the offeringOrderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingOrderKey() {
        return offeringOrderKey;
    }

    /**
     * Sets the value of the offeringOrderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingOrderKey(String value) {
        this.offeringOrderKey = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

}
