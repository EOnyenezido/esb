
package com.accenture.schemas.topeng.esb_topeng_v_1_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.accenture.schemas.topeng.esb_requestingsystem_v_1_0.RequestHeader;


/**
 * <p>Java class for MMLCommandResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMLCommandResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDtls" type="{http://www.accenture.com/schemas/TOPENG/ESB_TOPENG_V_1_0}ResponseDtlsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMLCommandResponseHeader", propOrder = {
    "requestHeader",
    "responseDtls"
})
public class MMLCommandResponseHeader
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "RequestHeader")
    protected RequestHeader requestHeader;
    @XmlElement(name = "ResponseDtls", required = true)
    protected ResponseDtlsType responseDtls;

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
     * Gets the value of the responseDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDtlsType }
     *     
     */
    public ResponseDtlsType getResponseDtls() {
        return responseDtls;
    }

    /**
     * Sets the value of the responseDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDtlsType }
     *     
     */
    public void setResponseDtls(ResponseDtlsType value) {
        this.responseDtls = value;
    }

}
