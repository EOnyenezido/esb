
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbscommon.RequestHeader;


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
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}RequestHeader" form="unqualified"/&gt;
 *         &lt;element name="ChangeCustOfferingRequest" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ChangeCustOfferingRequest" form="unqualified"/&gt;
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
    "changeCustOfferingRequest"
})
@XmlRootElement(name = "ChangeCustOfferingRequestMsg")
public class ChangeCustOfferingRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeCustOfferingRequest", namespace = "", required = true)
    protected ChangeCustOfferingRequest changeCustOfferingRequest;

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
     * Gets the value of the changeCustOfferingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustOfferingRequest }
     *     
     */
    public ChangeCustOfferingRequest getChangeCustOfferingRequest() {
        return changeCustOfferingRequest;
    }

    /**
     * Sets the value of the changeCustOfferingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustOfferingRequest }
     *     
     */
    public void setChangeCustOfferingRequest(ChangeCustOfferingRequest value) {
        this.changeCustOfferingRequest = value;
    }

}
