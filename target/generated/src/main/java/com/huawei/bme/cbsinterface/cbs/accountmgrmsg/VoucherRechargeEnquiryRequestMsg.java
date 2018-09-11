
package com.huawei.bme.cbsinterface.cbs.accountmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbs.accountmgr.VoucherRechargeEnquiryRequest;
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
 *         &lt;element name="VoucherRechargeEnquiryRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}VoucherRechargeEnquiryRequest" form="unqualified"/&gt;
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
    "voucherRechargeEnquiryRequest"
})
@XmlRootElement(name = "VoucherRechargeEnquiryRequestMsg")
public class VoucherRechargeEnquiryRequestMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "VoucherRechargeEnquiryRequest", required = true)
    protected VoucherRechargeEnquiryRequest voucherRechargeEnquiryRequest;

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
     * Gets the value of the voucherRechargeEnquiryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherRechargeEnquiryRequest }
     *     
     */
    public VoucherRechargeEnquiryRequest getVoucherRechargeEnquiryRequest() {
        return voucherRechargeEnquiryRequest;
    }

    /**
     * Sets the value of the voucherRechargeEnquiryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherRechargeEnquiryRequest }
     *     
     */
    public void setVoucherRechargeEnquiryRequest(VoucherRechargeEnquiryRequest value) {
        this.voucherRechargeEnquiryRequest = value;
    }

}
