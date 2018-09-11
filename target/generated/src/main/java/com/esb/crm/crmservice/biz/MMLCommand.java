
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMLCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMLCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MMLParamName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MMLParamValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMLCommand", propOrder = {
    "mmlParamName",
    "mmlParamValue"
})
public class MMLCommand
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "MMLParamName", required = true)
    protected String mmlParamName;
    @XmlElement(name = "MMLParamValue", required = true)
    protected String mmlParamValue;

    /**
     * Gets the value of the mmlParamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMLParamName() {
        return mmlParamName;
    }

    /**
     * Sets the value of the mmlParamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMLParamName(String value) {
        this.mmlParamName = value;
    }

    /**
     * Gets the value of the mmlParamValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMLParamValue() {
        return mmlParamValue;
    }

    /**
     * Sets the value of the mmlParamValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMLParamValue(String value) {
        this.mmlParamValue = value;
    }

}
