
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttrItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttrItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttrID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttrItemType", propOrder = {
    "attrID",
    "oldValue",
    "newValue"
})
public class AttrItemType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "AttrID", required = true)
    protected String attrID;
    @XmlElement(name = "OldValue", required = true)
    protected String oldValue;
    @XmlElement(name = "NewValue", required = true)
    protected String newValue;

    /**
     * Gets the value of the attrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrID() {
        return attrID;
    }

    /**
     * Sets the value of the attrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrID(String value) {
        this.attrID = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

}
