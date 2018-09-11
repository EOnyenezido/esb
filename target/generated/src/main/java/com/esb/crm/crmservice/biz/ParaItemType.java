
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParaItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParaItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParaName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParaValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParaItemType", propOrder = {
    "paraName",
    "paraValue"
})
public class ParaItemType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "ParaName", required = true)
    protected String paraName;
    @XmlElement(name = "ParaValue", required = true)
    protected String paraValue;

    /**
     * Gets the value of the paraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaName() {
        return paraName;
    }

    /**
     * Sets the value of the paraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaName(String value) {
        this.paraName = value;
    }

    /**
     * Gets the value of the paraValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaValue() {
        return paraValue;
    }

    /**
     * Sets the value of the paraValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaValue(String value) {
        this.paraValue = value;
    }

}
