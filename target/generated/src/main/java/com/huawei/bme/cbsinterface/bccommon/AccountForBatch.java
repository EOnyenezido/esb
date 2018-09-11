
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountForBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountForBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BillLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DunningFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LateFeeChargeable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InitBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CreditLimit" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FreeBillMedium" type="{http://www.huawei.com/bme/cbsinterface/bccommon}FreeBillMedium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcctProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountForBatch", propOrder = {
    "billCycleType",
    "paymentType",
    "currencyID",
    "billLang",
    "dunningFlag",
    "lateFeeChargeable",
    "initBalance",
    "creditLimit",
    "freeBillMedium",
    "acctProperty"
})
public class AccountForBatch
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "BillCycleType")
    protected String billCycleType;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "CurrencyID")
    protected BigInteger currencyID;
    @XmlElement(name = "BillLang")
    protected String billLang;
    @XmlElement(name = "DunningFlag")
    protected String dunningFlag;
    @XmlElement(name = "LateFeeChargeable")
    protected String lateFeeChargeable;
    @XmlElement(name = "InitBalance")
    protected Long initBalance;
    @XmlElement(name = "CreditLimit")
    protected List<AccountForBatch.CreditLimit> creditLimit;
    @XmlElement(name = "FreeBillMedium")
    protected List<FreeBillMedium> freeBillMedium;
    @XmlElement(name = "AcctProperty")
    protected List<SimpleProperty> acctProperty;

    /**
     * Gets the value of the billCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleType() {
        return billCycleType;
    }

    /**
     * Sets the value of the billCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleType(String value) {
        this.billCycleType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
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

    /**
     * Gets the value of the billLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillLang() {
        return billLang;
    }

    /**
     * Sets the value of the billLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillLang(String value) {
        this.billLang = value;
    }

    /**
     * Gets the value of the dunningFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningFlag() {
        return dunningFlag;
    }

    /**
     * Sets the value of the dunningFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningFlag(String value) {
        this.dunningFlag = value;
    }

    /**
     * Gets the value of the lateFeeChargeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateFeeChargeable() {
        return lateFeeChargeable;
    }

    /**
     * Sets the value of the lateFeeChargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateFeeChargeable(String value) {
        this.lateFeeChargeable = value;
    }

    /**
     * Gets the value of the initBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitBalance() {
        return initBalance;
    }

    /**
     * Sets the value of the initBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitBalance(Long value) {
        this.initBalance = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountForBatch.CreditLimit }
     * 
     * 
     */
    public List<AccountForBatch.CreditLimit> getCreditLimit() {
        if (creditLimit == null) {
            creditLimit = new ArrayList<AccountForBatch.CreditLimit>();
        }
        return this.creditLimit;
    }

    /**
     * Gets the value of the freeBillMedium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeBillMedium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeBillMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeBillMedium }
     * 
     * 
     */
    public List<FreeBillMedium> getFreeBillMedium() {
        if (freeBillMedium == null) {
            freeBillMedium = new ArrayList<FreeBillMedium>();
        }
        return this.freeBillMedium;
    }

    /**
     * Gets the value of the acctProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getAcctProperty() {
        if (acctProperty == null) {
            acctProperty = new ArrayList<SimpleProperty>();
        }
        return this.acctProperty;
    }


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
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
        "limitType",
        "limitValue"
    })
    public static class CreditLimit
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "LimitType")
        protected String limitType;
        @XmlElement(name = "LimitValue")
        protected long limitValue;

        /**
         * Gets the value of the limitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitType() {
            return limitType;
        }

        /**
         * Sets the value of the limitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitType(String value) {
            this.limitType = value;
        }

        /**
         * Gets the value of the limitValue property.
         * 
         */
        public long getLimitValue() {
            return limitValue;
        }

        /**
         * Sets the value of the limitValue property.
         * 
         */
        public void setLimitValue(long value) {
            this.limitValue = value;
        }

    }

}
