
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferingOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferingOwner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OwnerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingOwner", propOrder = {
    "ownerType",
    "ownerKey"
})
public class OfferingOwner
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "OwnerType", required = true)
    protected String ownerType;
    @XmlElement(name = "OwnerKey", required = true)
    protected String ownerKey;

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the ownerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerKey() {
        return ownerKey;
    }

    /**
     * Sets the value of the ownerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerKey(String value) {
        this.ownerKey = value;
    }

}
