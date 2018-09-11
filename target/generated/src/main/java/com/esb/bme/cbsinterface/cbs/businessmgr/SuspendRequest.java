
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspendRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuspendRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuspendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitiateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuspendRequest", propOrder = {
    "suspendDays",
    "initiateType",
    "handlingChargeFlag"
})
public class SuspendRequest
    extends Common
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "SuspendDays")
    protected Integer suspendDays;
    @XmlElement(name = "InitiateType")
    protected Integer initiateType;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;

    /**
     * Gets the value of the suspendDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspendDays() {
        return suspendDays;
    }

    /**
     * Sets the value of the suspendDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspendDays(Integer value) {
        this.suspendDays = value;
    }

    /**
     * Gets the value of the initiateType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitiateType() {
        return initiateType;
    }

    /**
     * Sets the value of the initiateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitiateType(Integer value) {
        this.initiateType = value;
    }

    /**
     * Gets the value of the handlingChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }

    /**
     * Sets the value of the handlingChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingChargeFlag(Integer value) {
        this.handlingChargeFlag = value;
    }

}
