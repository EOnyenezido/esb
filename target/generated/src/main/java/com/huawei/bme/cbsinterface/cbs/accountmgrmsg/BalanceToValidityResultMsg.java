
package com.huawei.bme.cbsinterface.cbs.accountmgrmsg;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.cbs.accountmgr.BalanceToValidityResult;
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
 *         &lt;element name="BalanceToValidityResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}BalanceToValidityResult" minOccurs="0" form="unqualified"/&gt;
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
    "balanceToValidityResult"
})
@XmlRootElement(name = "BalanceToValidityResultMsg")
public class BalanceToValidityResultMsg
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "ResultHeader", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "BalanceToValidityResult")
    protected BalanceToValidityResult balanceToValidityResult;

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
     * Gets the value of the balanceToValidityResult property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceToValidityResult }
     *     
     */
    public BalanceToValidityResult getBalanceToValidityResult() {
        return balanceToValidityResult;
    }

    /**
     * Sets the value of the balanceToValidityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceToValidityResult }
     *     
     */
    public void setBalanceToValidityResult(BalanceToValidityResult value) {
        this.balanceToValidityResult = value;
    }

}
