
package com.huawei.bme.cbsinterface.cbs.accountmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbs.accountmgr.VoucherEnquiryByPINResult;
import com.huawei.bme.cbsinterface.common.ResultHeader;


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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/common}ResultHeader" form="unqualified"/&gt;
 *         &lt;element name="VoucherEnquiryByPINResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}VoucherEnquiryByPINResult" minOccurs="0" form="unqualified"/&gt;
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
    "resultHeader",
    "voucherEnquiryByPINResult"
})
@XmlRootElement(name = "VoucherEnquiryByPINResultMsg")
public class VoucherEnquiryByPINResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "VoucherEnquiryByPINResult")
    protected VoucherEnquiryByPINResult voucherEnquiryByPINResult;

    /**
     * Gets the value of the resultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResultHeader }
     *     
     */
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    /**
     * Sets the value of the resultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultHeader }
     *     
     */
    public void setResultHeader(ResultHeader value) {
        this.resultHeader = value;
    }

    /**
     * Gets the value of the voucherEnquiryByPINResult property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherEnquiryByPINResult }
     *     
     */
    public VoucherEnquiryByPINResult getVoucherEnquiryByPINResult() {
        return voucherEnquiryByPINResult;
    }

    /**
     * Sets the value of the voucherEnquiryByPINResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherEnquiryByPINResult }
     *     
     */
    public void setVoucherEnquiryByPINResult(VoucherEnquiryByPINResult value) {
        this.voucherEnquiryByPINResult = value;
    }

}
