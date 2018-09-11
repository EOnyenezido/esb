
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeAccountResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ExchangeHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OriAcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType"/&gt;
 *         &lt;element name="DesAcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeAccountResult", propOrder = {

})
public class ExchangeAccountResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "ExchangeHandlingCharge")
    protected Long exchangeHandlingCharge;
    @XmlElement(name = "OriAcctChgRec", required = true)
    protected AcctChgRecType oriAcctChgRec;
    @XmlElement(name = "DesAcctChgRec", required = true)
    protected AcctChgRecType desAcctChgRec;

    /**
     * Gets the value of the exchangeHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeHandlingCharge() {
        return exchangeHandlingCharge;
    }

    /**
     * Sets the value of the exchangeHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeHandlingCharge(Long value) {
        this.exchangeHandlingCharge = value;
    }

    /**
     * Gets the value of the oriAcctChgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChgRecType }
     *     
     */
    public AcctChgRecType getOriAcctChgRec() {
        return oriAcctChgRec;
    }

    /**
     * Sets the value of the oriAcctChgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChgRecType }
     *     
     */
    public void setOriAcctChgRec(AcctChgRecType value) {
        this.oriAcctChgRec = value;
    }

    /**
     * Gets the value of the desAcctChgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChgRecType }
     *     
     */
    public AcctChgRecType getDesAcctChgRec() {
        return desAcctChgRec;
    }

    /**
     * Sets the value of the desAcctChgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChgRecType }
     *     
     */
    public void setDesAcctChgRec(AcctChgRecType value) {
        this.desAcctChgRec = value;
    }

}
