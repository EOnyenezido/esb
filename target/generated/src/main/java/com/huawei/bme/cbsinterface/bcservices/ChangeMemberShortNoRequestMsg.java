
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
 *         &lt;element name="ChangeMemberShortNoRequest" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ChangeMemberShortNoRequest" form="unqualified"/&gt;
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
    "changeMemberShortNoRequest"
})
@XmlRootElement(name = "ChangeMemberShortNoRequestMsg")
public class ChangeMemberShortNoRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeMemberShortNoRequest", namespace = "", required = true)
    protected ChangeMemberShortNoRequest changeMemberShortNoRequest;

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
     * Gets the value of the changeMemberShortNoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeMemberShortNoRequest }
     *     
     */
    public ChangeMemberShortNoRequest getChangeMemberShortNoRequest() {
        return changeMemberShortNoRequest;
    }

    /**
     * Sets the value of the changeMemberShortNoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeMemberShortNoRequest }
     *     
     */
    public void setChangeMemberShortNoRequest(ChangeMemberShortNoRequest value) {
        this.changeMemberShortNoRequest = value;
    }

}
