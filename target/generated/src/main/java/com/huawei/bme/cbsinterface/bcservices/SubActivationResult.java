
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubActivationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubActivationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubActivationResult", propOrder = {
    "activeTime"
})
public class SubActivationResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ActiveTime", required = true)
    protected String activeTime;

    /**
     * Gets the value of the activeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * Sets the value of the activeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveTime(String value) {
        this.activeTime = value;
    }

}
