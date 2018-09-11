
package com.esb.crm.crmservice.bizmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.esb.crm.crmservice.biz.DeleteSubscriberRequest;
import com.esb.crm.crmservice.common.RequestHeader;


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
 *         &lt;element name="RequestHeader" type="{http://www.esb.com/crm/crmservice/common}RequestHeader"/&gt;
 *         &lt;element name="DeleteSubscriberRequest" type="{http://www.esb.com/crm/crmservice/biz}DeleteSubscriberRequest"/&gt;
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
    "deleteSubscriberRequest"
})
@XmlRootElement(name = "DeleteSubscriberRequestMsg")
public class DeleteSubscriberRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "DeleteSubscriberRequest", required = true)
    protected DeleteSubscriberRequest deleteSubscriberRequest;

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
     * Gets the value of the deleteSubscriberRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteSubscriberRequest }
     *     
     */
    public DeleteSubscriberRequest getDeleteSubscriberRequest() {
        return deleteSubscriberRequest;
    }

    /**
     * Sets the value of the deleteSubscriberRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSubscriberRequest }
     *     
     */
    public void setDeleteSubscriberRequest(DeleteSubscriberRequest value) {
        this.deleteSubscriberRequest = value;
    }

}
