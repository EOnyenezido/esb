
package com.huawei.bme.cbsinterface.cbscommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnershipInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BEID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipInfo", propOrder = {
    "beid",
    "brid"
})
public class OwnershipInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "BEID", required = true)
    protected String beid;
    @XmlElement(name = "BRID")
    protected String brid;

    /**
     * Gets the value of the beid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEID() {
        return beid;
    }

    /**
     * Sets the value of the beid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEID(String value) {
        this.beid = value;
    }

    /**
     * Gets the value of the brid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRID() {
        return brid;
    }

    /**
     * Sets the value of the brid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRID(String value) {
        this.brid = value;
    }

}
