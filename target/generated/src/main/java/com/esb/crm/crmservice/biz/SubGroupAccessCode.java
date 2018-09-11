
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubGroupAccessCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubGroupAccessCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubGroupAccessCode", propOrder = {
    "subGroupKey",
    "subGroupCode"
})
public class SubGroupAccessCode
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "SubGroupKey")
    protected String subGroupKey;
    @XmlElement(name = "SubGroupCode")
    protected String subGroupCode;

    /**
     * Gets the value of the subGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupKey() {
        return subGroupKey;
    }

    /**
     * Sets the value of the subGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupKey(String value) {
        this.subGroupKey = value;
    }

    /**
     * Gets the value of the subGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupCode() {
        return subGroupCode;
    }

    /**
     * Sets the value of the subGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupCode(String value) {
        this.subGroupCode = value;
    }

}
