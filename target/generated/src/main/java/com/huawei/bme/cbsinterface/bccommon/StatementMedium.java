
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementMedium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementMedium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BMCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BMType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementMedium", propOrder = {
    "bmCode",
    "bmType"
})
public class StatementMedium
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "BMCode", required = true)
    protected String bmCode;
    @XmlElement(name = "BMType", required = true)
    protected String bmType;

    /**
     * Gets the value of the bmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMCode() {
        return bmCode;
    }

    /**
     * Sets the value of the bmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMCode(String value) {
        this.bmCode = value;
    }

    /**
     * Gets the value of the bmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMType() {
        return bmType;
    }

    /**
     * Sets the value of the bmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMType(String value) {
        this.bmType = value;
    }

}
