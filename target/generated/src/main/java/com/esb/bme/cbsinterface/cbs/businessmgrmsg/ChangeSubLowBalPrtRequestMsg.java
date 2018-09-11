
package com.esb.bme.cbsinterface.cbs.businessmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.esb.bme.cbsinterface.cbs.businessmgr.ChangeSubLowBalPrtRequest;
import com.esb.bme.cbsinterface.common.RequestHeader;


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
 *         &lt;element name="RequestHeader" type="{http://www.esb.com/bme/cbsinterface/common}RequestHeader" form="unqualified"/&gt;
 *         &lt;element name="ChangeSubLowBalPrtRequest" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ChangeSubLowBalPrtRequest" form="unqualified"/&gt;
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
    "changeSubLowBalPrtRequest"
})
@XmlRootElement(name = "ChangeSubLowBalPrtRequestMsg")
public class ChangeSubLowBalPrtRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeSubLowBalPrtRequest", required = true)
    protected ChangeSubLowBalPrtRequest changeSubLowBalPrtRequest;

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
     * Gets the value of the changeSubLowBalPrtRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubLowBalPrtRequest }
     *     
     */
    public ChangeSubLowBalPrtRequest getChangeSubLowBalPrtRequest() {
        return changeSubLowBalPrtRequest;
    }

    /**
     * Sets the value of the changeSubLowBalPrtRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubLowBalPrtRequest }
     *     
     */
    public void setChangeSubLowBalPrtRequest(ChangeSubLowBalPrtRequest value) {
        this.changeSubLowBalPrtRequest = value;
    }

}
