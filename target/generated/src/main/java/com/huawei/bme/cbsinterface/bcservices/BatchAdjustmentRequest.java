
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchAdjustmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchAdjustmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdjustmentInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BalanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExtendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FreeUnitAdjustmentInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExtendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchAdjustmentRequest", propOrder = {
    "opType",
    "fileName",
    "adjustmentInfo",
    "freeUnitAdjustmentInfo",
    "adjustmentReasonCode"
})
public class BatchAdjustmentRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OpType", required = true)
    protected String opType;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "AdjustmentInfo")
    protected List<BatchAdjustmentRequest.AdjustmentInfo> adjustmentInfo;
    @XmlElement(name = "FreeUnitAdjustmentInfo")
    protected List<BatchAdjustmentRequest.FreeUnitAdjustmentInfo> freeUnitAdjustmentInfo;
    @XmlElement(name = "AdjustmentReasonCode")
    protected String adjustmentReasonCode;

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the adjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchAdjustmentRequest.AdjustmentInfo }
     * 
     * 
     */
    public List<BatchAdjustmentRequest.AdjustmentInfo> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<BatchAdjustmentRequest.AdjustmentInfo>();
        }
        return this.adjustmentInfo;
    }

    /**
     * Gets the value of the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchAdjustmentRequest.FreeUnitAdjustmentInfo }
     * 
     * 
     */
    public List<BatchAdjustmentRequest.FreeUnitAdjustmentInfo> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<BatchAdjustmentRequest.FreeUnitAdjustmentInfo>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the adjustmentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReasonCode(String value) {
        this.adjustmentReasonCode = value;
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
     *         &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BalanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExtendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "balanceType",
        "balanceID",
        "adjustmentType",
        "adjustmentAmt",
        "currencyID",
        "effectiveTime",
        "expireTime",
        "extendDays"
    })
    public static class AdjustmentInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "BalanceType")
        protected String balanceType;
        @XmlElement(name = "BalanceID")
        protected Long balanceID;
        @XmlElement(name = "AdjustmentType")
        protected String adjustmentType;
        @XmlElement(name = "AdjustmentAmt")
        protected Long adjustmentAmt;
        @XmlElement(name = "CurrencyID")
        protected BigInteger currencyID;
        @XmlElement(name = "EffectiveTime")
        protected String effectiveTime;
        @XmlElement(name = "ExpireTime")
        protected String expireTime;
        @XmlElement(name = "ExtendDays")
        protected Integer extendDays;

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
         * Gets the value of the adjustmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustmentType() {
            return adjustmentType;
        }

        /**
         * Sets the value of the adjustmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustmentType(String value) {
            this.adjustmentType = value;
        }

        /**
         * Gets the value of the adjustmentAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAdjustmentAmt() {
            return adjustmentAmt;
        }

        /**
         * Sets the value of the adjustmentAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAdjustmentAmt(Long value) {
            this.adjustmentAmt = value;
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
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
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
         * Gets the value of the extendDays property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getExtendDays() {
            return extendDays;
        }

        /**
         * Sets the value of the extendDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setExtendDays(Integer value) {
            this.extendDays = value;
        }

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
     *         &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExtendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "freeUnitInstanceID",
        "freeUnitType",
        "adjustmentType",
        "adjustmentAmt",
        "effectiveTime",
        "expireTime",
        "extendDays"
    })
    public static class FreeUnitAdjustmentInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "FreeUnitInstanceID")
        protected Long freeUnitInstanceID;
        @XmlElement(name = "FreeUnitType")
        protected String freeUnitType;
        @XmlElement(name = "AdjustmentType")
        protected String adjustmentType;
        @XmlElement(name = "AdjustmentAmt")
        protected Long adjustmentAmt;
        @XmlElement(name = "EffectiveTime")
        protected String effectiveTime;
        @XmlElement(name = "ExpireTime")
        protected String expireTime;
        @XmlElement(name = "ExtendDays")
        protected Integer extendDays;

        /**
         * Gets the value of the freeUnitInstanceID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFreeUnitInstanceID() {
            return freeUnitInstanceID;
        }

        /**
         * Sets the value of the freeUnitInstanceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFreeUnitInstanceID(Long value) {
            this.freeUnitInstanceID = value;
        }

        /**
         * Gets the value of the freeUnitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeUnitType() {
            return freeUnitType;
        }

        /**
         * Sets the value of the freeUnitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeUnitType(String value) {
            this.freeUnitType = value;
        }

        /**
         * Gets the value of the adjustmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustmentType() {
            return adjustmentType;
        }

        /**
         * Sets the value of the adjustmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustmentType(String value) {
            this.adjustmentType = value;
        }

        /**
         * Gets the value of the adjustmentAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAdjustmentAmt() {
            return adjustmentAmt;
        }

        /**
         * Sets the value of the adjustmentAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAdjustmentAmt(Long value) {
            this.adjustmentAmt = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
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
         * Gets the value of the extendDays property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getExtendDays() {
            return extendDays;
        }

        /**
         * Sets the value of the extendDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setExtendDays(Integer value) {
            this.extendDays = value;
        }

    }

}
