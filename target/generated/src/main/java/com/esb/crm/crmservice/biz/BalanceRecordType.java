
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="BalanceDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceRecordType", propOrder = {

})
public class BalanceRecordType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "BalanceDesc")
    protected String balanceDesc;
    @XmlElement(name = "Balance")
    protected long balance;
    @XmlElement(name = "MinMeasureId")
    protected Integer minMeasureId;
    @XmlElement(name = "UnitType")
    protected Integer unitType;
    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "ExpireTime", required = true)
    protected String expireTime;
    @XmlElement(name = "AccountCredit")
    protected Long accountCredit;
    @XmlElement(name = "AccountKey")
    protected Integer accountKey;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "ProductOrderKey")
    protected String productOrderKey;

    /**
     * Gets the value of the balanceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceDesc() {
        return balanceDesc;
    }

    /**
     * Sets the value of the balanceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceDesc(String value) {
        this.balanceDesc = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public long getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(long value) {
        this.balance = value;
    }

    /**
     * Gets the value of the minMeasureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinMeasureId() {
        return minMeasureId;
    }

    /**
     * Sets the value of the minMeasureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinMeasureId(Integer value) {
        this.minMeasureId = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitType(Integer value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

    /**
     * Gets the value of the accountCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the value of the accountCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountCredit(Long value) {
        this.accountCredit = value;
    }

    /**
     * Gets the value of the accountKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountKey() {
        return accountKey;
    }

    /**
     * Sets the value of the accountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountKey(Integer value) {
        this.accountKey = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productOrderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOrderKey() {
        return productOrderKey;
    }

    /**
     * Sets the value of the productOrderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOrderKey(String value) {
        this.productOrderKey = value;
    }

}
