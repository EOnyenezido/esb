
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySubscriberValidityResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySubscriberValidityResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySubscriberValidityResult", propOrder = {
    "lifeCycleState",
    "activeStop",
    "suspendStop",
    "disableStop"
})
public class ModifySubscriberValidityResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "LifeCycleState", required = true, nillable = true)
    protected String lifeCycleState;
    @XmlElement(name = "ActiveStop", required = true)
    protected String activeStop;
    @XmlElement(name = "SuspendStop", required = true)
    protected String suspendStop;
    @XmlElement(name = "DisableStop", required = true)
    protected String disableStop;

    /**
     * Gets the value of the lifeCycleState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * Sets the value of the lifeCycleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleState(String value) {
        this.lifeCycleState = value;
    }

    /**
     * Gets the value of the activeStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStop() {
        return activeStop;
    }

    /**
     * Sets the value of the activeStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStop(String value) {
        this.activeStop = value;
    }

    /**
     * Gets the value of the suspendStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendStop() {
        return suspendStop;
    }

    /**
     * Sets the value of the suspendStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendStop(String value) {
        this.suspendStop = value;
    }

    /**
     * Gets the value of the disableStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableStop() {
        return disableStop;
    }

    /**
     * Sets the value of the disableStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableStop(String value) {
        this.disableStop = value;
    }

}
