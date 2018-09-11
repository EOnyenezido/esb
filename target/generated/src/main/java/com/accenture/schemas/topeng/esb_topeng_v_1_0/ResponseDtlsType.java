
package com.accenture.schemas.topeng.esb_topeng_v_1_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseDtlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDtlsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RetDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDtlsType", propOrder = {
    "retCode",
    "retDesc"
})
public class ResponseDtlsType
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "RetCode", required = true)
    protected String retCode;
    @XmlElement(name = "RetDesc")
    protected String retDesc;

    /**
     * Gets the value of the retCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * Sets the value of the retCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
        this.retCode = value;
    }

    /**
     * Gets the value of the retDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetDesc() {
        return retDesc;
    }

    /**
     * Sets the value of the retDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetDesc(String value) {
        this.retDesc = value;
    }

}
