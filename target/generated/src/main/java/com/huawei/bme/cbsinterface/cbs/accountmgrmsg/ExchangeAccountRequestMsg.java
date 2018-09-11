
package com.huawei.bme.cbsinterface.cbs.accountmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbs.accountmgr.ExchangeAccountRequest;
import com.huawei.bme.cbsinterface.common.RequestHeader;


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
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/common}RequestHeader" form="unqualified"/&gt;
 *         &lt;element name="ExchangeAccountRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ExchangeAccountRequest" form="unqualified"/&gt;
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
    "exchangeAccountRequest"
})
@XmlRootElement(name = "ExchangeAccountRequestMsg")
public class ExchangeAccountRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ExchangeAccountRequest", required = true)
    protected ExchangeAccountRequest exchangeAccountRequest;

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
     * Gets the value of the exchangeAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeAccountRequest }
     *     
     */
    public ExchangeAccountRequest getExchangeAccountRequest() {
        return exchangeAccountRequest;
    }

    /**
     * Sets the value of the exchangeAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeAccountRequest }
     *     
     */
    public void setExchangeAccountRequest(ExchangeAccountRequest value) {
        this.exchangeAccountRequest = value;
    }

}
