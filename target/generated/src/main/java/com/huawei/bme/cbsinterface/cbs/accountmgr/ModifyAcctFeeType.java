
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyAcctFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyAcctFeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="GLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyAcctFeeType", propOrder = {

})
public class ModifyAcctFeeType
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "CurrAcctChgAmt")
    protected long currAcctChgAmt;
    @XmlElement(name = "GLID")
    protected Integer glid;
    @XmlElement(name = "MinMeasureId")
    protected Integer minMeasureId;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;

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
     * Gets the value of the currAcctChgAmt property.
     * 
     */
    public long getCurrAcctChgAmt() {
        return currAcctChgAmt;
    }

    /**
     * Sets the value of the currAcctChgAmt property.
     * 
     */
    public void setCurrAcctChgAmt(long value) {
        this.currAcctChgAmt = value;
    }

    /**
     * Gets the value of the glid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGLID() {
        return glid;
    }

    /**
     * Sets the value of the glid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGLID(Integer value) {
        this.glid = value;
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

}
