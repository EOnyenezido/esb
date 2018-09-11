
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriAccountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OriAccountKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DesAccountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DesAccountKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Ammount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeAccountRequest", propOrder = {
    "logId",
    "subscriberNo",
    "oriAccountType",
    "oriAccountKey",
    "desAccountType",
    "desAccountKey",
    "ammount",
    "handlingChargeFlag",
    "custID"
})
public class ExchangeAccountRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "LogId")
    protected String logId;
    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OriAccountType")
    protected int oriAccountType;
    @XmlElement(name = "OriAccountKey")
    protected Long oriAccountKey;
    @XmlElement(name = "DesAccountType")
    protected int desAccountType;
    @XmlElement(name = "DesAccountKey")
    protected Long desAccountKey;
    @XmlElement(name = "Ammount")
    protected int ammount;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the logId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogId() {
        return logId;
    }

    /**
     * Sets the value of the logId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogId(String value) {
        this.logId = value;
    }

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the oriAccountType property.
     * 
     */
    public int getOriAccountType() {
        return oriAccountType;
    }

    /**
     * Sets the value of the oriAccountType property.
     * 
     */
    public void setOriAccountType(int value) {
        this.oriAccountType = value;
    }

    /**
     * Gets the value of the oriAccountKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriAccountKey() {
        return oriAccountKey;
    }

    /**
     * Sets the value of the oriAccountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriAccountKey(Long value) {
        this.oriAccountKey = value;
    }

    /**
     * Gets the value of the desAccountType property.
     * 
     */
    public int getDesAccountType() {
        return desAccountType;
    }

    /**
     * Sets the value of the desAccountType property.
     * 
     */
    public void setDesAccountType(int value) {
        this.desAccountType = value;
    }

    /**
     * Gets the value of the desAccountKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDesAccountKey() {
        return desAccountKey;
    }

    /**
     * Sets the value of the desAccountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDesAccountKey(Long value) {
        this.desAccountKey = value;
    }

    /**
     * Gets the value of the ammount property.
     * 
     */
    public int getAmmount() {
        return ammount;
    }

    /**
     * Sets the value of the ammount property.
     * 
     */
    public void setAmmount(int value) {
        this.ammount = value;
    }

    /**
     * Gets the value of the handlingChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }

    /**
     * Sets the value of the handlingChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingChargeFlag(Integer value) {
        this.handlingChargeFlag = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

}
