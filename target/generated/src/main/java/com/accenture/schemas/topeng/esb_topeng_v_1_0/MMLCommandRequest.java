
package com.accenture.schemas.topeng.esb_topeng_v_1_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.accenture.schemas.topeng.esb_requestingsystem_v_1_0.RequestHeader;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}RequestHeader"/&gt;
 *         &lt;element name="MMLCommandDet" type="{http://www.accenture.com/schemas/TOPENG/ESB_TOPENG_V_1_0}MMLCommandType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestHeader",
    "mmlCommandDet"
})
@XmlRootElement(name = "MMLCommandRequest")
public class MMLCommandRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "MMLCommandDet", required = true)
    protected MMLCommandType mmlCommandDet;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the mmlCommandDet property.
     * 
     * @return
     *     possible object is
     *     {@link MMLCommandType }
     *     
     */
    public MMLCommandType getMMLCommandDet() {
        return mmlCommandDet;
    }

    /**
     * Sets the value of the mmlCommandDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMLCommandType }
     *     
     */
    public void setMMLCommandDet(MMLCommandType value) {
        this.mmlCommandDet = value;
    }

}
