
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ManageCallHuntingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageCallHuntingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;element name="HuntingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HuntingMainNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="UserState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageCallHuntingRequest", propOrder = {
    "subGroupAccessCode",
    "huntingNumber",
    "huntingMainNumber",
    "effectiveTime",
    "expireTime",
    "priority",
    "userState",
    "operationType"
})
public class ManageCallHuntingRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "HuntingNumber", required = true)
    protected String huntingNumber;
    @XmlElement(name = "HuntingMainNumber", required = true)
    protected String huntingMainNumber;
    @XmlElement(name = "EffectiveTime", required = true)
    protected String effectiveTime;
    @XmlElement(name = "ExpireTime", required = true)
    protected String expireTime;
    @XmlElement(name = "Priority", required = true)
    protected BigInteger priority;
    @XmlElement(name = "UserState")
    protected String userState;
    @XmlElement(name = "OperationType", required = true)
    protected BigInteger operationType;

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

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the userState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserState() {
        return userState;
    }

    /**
     * Sets the value of the userState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserState(String value) {
        this.userState = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperationType(BigInteger value) {
        this.operationType = value;
    }

}
