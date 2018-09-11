
package com.accenture.schemas.topeng.esb_topeng_v_1_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ResponseHeader" type="{http://www.accenture.com/schemas/TOPENG/ESB_TOPENG_V_1_0}MMLCommandResponseHeader"/&gt;
 *         &lt;element name="MMLCommandResDet" type="{http://www.accenture.com/schemas/TOPENG/ESB_TOPENG_V_1_0}MMLCommandResDet"/&gt;
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
    "responseHeader",
    "mmlCommandResDet"
})
@XmlRootElement(name = "MMLCommandResponse")
public class MMLCommandResponse
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "ResponseHeader", required = true)
    protected MMLCommandResponseHeader responseHeader;
    @XmlElement(name = "MMLCommandResDet", required = true)
    protected MMLCommandResDet mmlCommandResDet;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MMLCommandResponseHeader }
     *     
     */
    public MMLCommandResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMLCommandResponseHeader }
     *     
     */
    public void setResponseHeader(MMLCommandResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the mmlCommandResDet property.
     * 
     * @return
     *     possible object is
     *     {@link MMLCommandResDet }
     *     
     */
    public MMLCommandResDet getMMLCommandResDet() {
        return mmlCommandResDet;
    }

    /**
     * Sets the value of the mmlCommandResDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMLCommandResDet }
     *     
     */
    public void setMMLCommandResDet(MMLCommandResDet value) {
        this.mmlCommandResDet = value;
    }

}
