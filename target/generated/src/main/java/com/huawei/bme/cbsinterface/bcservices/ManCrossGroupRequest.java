
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ManCrossGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManCrossGroupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCodeA" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;element name="SubGroupAccessCodeB" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
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
@XmlType(name = "ManCrossGroupRequest", propOrder = {
    "subGroupAccessCodeA",
    "subGroupAccessCodeB",
    "operationType"
})
public class ManCrossGroupRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCodeA", required = true)
    protected SubGroupAccessCode subGroupAccessCodeA;
    @XmlElement(name = "SubGroupAccessCodeB", required = true)
    protected SubGroupAccessCode subGroupAccessCodeB;
    @XmlElement(name = "OperationType", required = true)
    protected BigInteger operationType;

    /**
     * Gets the value of the subGroupAccessCodeA property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public SubGroupAccessCode getSubGroupAccessCodeA() {
        return subGroupAccessCodeA;
    }

    /**
     * Sets the value of the subGroupAccessCodeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public void setSubGroupAccessCodeA(SubGroupAccessCode value) {
        this.subGroupAccessCodeA = value;
    }

    /**
     * Gets the value of the subGroupAccessCodeB property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public SubGroupAccessCode getSubGroupAccessCodeB() {
        return subGroupAccessCodeB;
    }

    /**
     * Sets the value of the subGroupAccessCodeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public void setSubGroupAccessCodeB(SubGroupAccessCode value) {
        this.subGroupAccessCodeB = value;
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
