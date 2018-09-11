
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceChgInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceChgInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BalanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BalanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldBalanceAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NewBalanceAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceChgInfo", propOrder = {
    "balanceType",
    "balanceID",
    "balanceTypeName",
    "oldBalanceAmt",
    "newBalanceAmt",
    "currencyID"
})
public class BalanceChgInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "BalanceType", required = true)
    protected String balanceType;
    @XmlElement(name = "BalanceID")
    protected Long balanceID;
    @XmlElement(name = "BalanceTypeName")
    protected String balanceTypeName;
    @XmlElement(name = "OldBalanceAmt")
    protected long oldBalanceAmt;
    @XmlElement(name = "NewBalanceAmt")
    protected long newBalanceAmt;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the balanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceID() {
        return balanceID;
    }

    /**
     * Sets the value of the balanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceID(Long value) {
        this.balanceID = value;
    }

    /**
     * Gets the value of the balanceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    /**
     * Sets the value of the balanceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceTypeName(String value) {
        this.balanceTypeName = value;
    }

    /**
     * Gets the value of the oldBalanceAmt property.
     * 
     */
    public long getOldBalanceAmt() {
        return oldBalanceAmt;
    }

    /**
     * Sets the value of the oldBalanceAmt property.
     * 
     */
    public void setOldBalanceAmt(long value) {
        this.oldBalanceAmt = value;
    }

    /**
     * Gets the value of the newBalanceAmt property.
     * 
     */
    public long getNewBalanceAmt() {
        return newBalanceAmt;
    }

    /**
     * Sets the value of the newBalanceAmt property.
     * 
     */
    public void setNewBalanceAmt(long value) {
        this.newBalanceAmt = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyID(BigInteger value) {
        this.currencyID = value;
    }

}
