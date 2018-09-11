
package com.esb.bme.cbsinterface.cbs.businessmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.esb.bme.cbsinterface.cbs.businessmgr.QuerySubFamilyNoRequest;
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
 *         &lt;element name="QuerySubFamilyNoRequest" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}QuerySubFamilyNoRequest" form="unqualified"/&gt;
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
    "querySubFamilyNoRequest"
})
@XmlRootElement(name = "QuerySubFamilyNoRequestMsg")
public class QuerySubFamilyNoRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QuerySubFamilyNoRequest", required = true)
    protected QuerySubFamilyNoRequest querySubFamilyNoRequest;

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
     * Gets the value of the querySubFamilyNoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubFamilyNoRequest }
     *     
     */
    public QuerySubFamilyNoRequest getQuerySubFamilyNoRequest() {
        return querySubFamilyNoRequest;
    }

    /**
     * Sets the value of the querySubFamilyNoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubFamilyNoRequest }
     *     
     */
    public void setQuerySubFamilyNoRequest(QuerySubFamilyNoRequest value) {
        this.querySubFamilyNoRequest = value;
    }

}
