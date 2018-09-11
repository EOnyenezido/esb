
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for QueryCallHuntingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCallHuntingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode" minOccurs="0"/&gt;
 *         &lt;element name="HuntingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HuntingMainNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCallHuntingRequest", propOrder = {
    "subGroupAccessCode",
    "huntingNumber",
    "huntingMainNumber",
    "effectiveTime",
    "expireTime"
})
public class QueryCallHuntingRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCode")
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "HuntingNumber", required = true)
    protected String huntingNumber;
    @XmlElement(name = "HuntingMainNumber", required = true)
    protected String huntingMainNumber;
    @XmlElement(name = "EffectiveTime")
    protected String effectiveTime;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;

    /**
     * Gets the value of the subGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }

    /**
     * Sets the value of the subGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public void setSubGroupAccessCode(SubGroupAccessCode value) {
        this.subGroupAccessCode = value;
    }

    /**
     * Gets the value of the huntingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingNumber() {
        return huntingNumber;
    }

    /**
     * Sets the value of the huntingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingNumber(String value) {
        this.huntingNumber = value;
    }

    /**
     * Gets the value of the huntingMainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingMainNumber() {
        return huntingMainNumber;
    }

    /**
     * Sets the value of the huntingMainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingMainNumber(String value) {
        this.huntingMainNumber = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
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
