
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbscommon.ResultHeader;


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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}ResultHeader" form="unqualified"/&gt;
 *         &lt;element name="ApplyProdFreeValidityResult" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ApplyProdFreeValidityResult" minOccurs="0" form="unqualified"/&gt;
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
    "applyProdFreeValidityResult"
})
@XmlRootElement(name = "ApplyProdFreeValidityResultMsg")
public class ApplyProdFreeValidityResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "ApplyProdFreeValidityResult", namespace = "")
    protected ApplyProdFreeValidityResult applyProdFreeValidityResult;

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
     * Gets the value of the applyProdFreeValidityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyProdFreeValidityResult }
     *     
     */
    public ApplyProdFreeValidityResult getApplyProdFreeValidityResult() {
        return applyProdFreeValidityResult;
    }

    /**
     * Sets the value of the applyProdFreeValidityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyProdFreeValidityResult }
     *     
     */
    public void setApplyProdFreeValidityResult(ApplyProdFreeValidityResult value) {
        this.applyProdFreeValidityResult = value;
    }

}
