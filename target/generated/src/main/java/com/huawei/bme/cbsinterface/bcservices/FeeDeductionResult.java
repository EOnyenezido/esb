
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.BalanceChgInfo;
import com.huawei.bme.cbsinterface.bccommon.FreeUnitChgInfo;


/**
 * <p>Java class for FeeDeductionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDeductionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeductSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AcctBalanceChangeList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="BalanceChgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}BalanceChgInfo" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FreeUnitChangeList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OwnerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FreeUnitChgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}FreeUnitChgInfo" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreditLimitChangeList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="OriginLimitAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="PaidAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="CurrentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="AccmBeginDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AccmEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDeductionResult", propOrder = {
    "deductSerialNo",
    "acctBalanceChangeList",
    "freeUnitChangeList",
    "creditLimitChangeList"
})
public class FeeDeductionResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "DeductSerialNo", required = true)
    protected String deductSerialNo;
    @XmlElement(name = "AcctBalanceChangeList")
    protected List<FeeDeductionResult.AcctBalanceChangeList> acctBalanceChangeList;
    @XmlElement(name = "FreeUnitChangeList")
    protected List<FeeDeductionResult.FreeUnitChangeList> freeUnitChangeList;
    @XmlElement(name = "CreditLimitChangeList")
    protected List<FeeDeductionResult.CreditLimitChangeList> creditLimitChangeList;

    /**
     * Gets the value of the deductSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductSerialNo() {
        return deductSerialNo;
    }

    /**
     * Sets the value of the deductSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductSerialNo(String value) {
        this.deductSerialNo = value;
    }

    /**
     * Gets the value of the acctBalanceChangeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBalanceChangeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBalanceChangeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDeductionResult.AcctBalanceChangeList }
     * 
     * 
     */
    public List<FeeDeductionResult.AcctBalanceChangeList> getAcctBalanceChangeList() {
        if (acctBalanceChangeList == null) {
            acctBalanceChangeList = new ArrayList<FeeDeductionResult.AcctBalanceChangeList>();
        }
        return this.acctBalanceChangeList;
    }

    /**
     * Gets the value of the freeUnitChangeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitChangeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitChangeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDeductionResult.FreeUnitChangeList }
     * 
     * 
     */
    public List<FeeDeductionResult.FreeUnitChangeList> getFreeUnitChangeList() {
        if (freeUnitChangeList == null) {
            freeUnitChangeList = new ArrayList<FeeDeductionResult.FreeUnitChangeList>();
        }
        return this.freeUnitChangeList;
    }

    /**
     * Gets the value of the creditLimitChangeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimitChangeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimitChangeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDeductionResult.CreditLimitChangeList }
     * 
     * 
     */
    public List<FeeDeductionResult.CreditLimitChangeList> getCreditLimitChangeList() {
        if (creditLimitChangeList == null) {
            creditLimitChangeList = new ArrayList<FeeDeductionResult.CreditLimitChangeList>();
        }
        return this.creditLimitChangeList;
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
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BalanceChgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}BalanceChgInfo" maxOccurs="unbounded"/&gt;
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
        "acctKey",
        "balanceChgInfo"
    })
    public static class AcctBalanceChangeList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "BalanceChgInfo", required = true, nillable = true)
        protected List<BalanceChgInfo> balanceChgInfo;

        /**
         * Gets the value of the acctKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctKey() {
            return acctKey;
        }

        /**
         * Sets the value of the acctKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctKey(String value) {
            this.acctKey = value;
        }

        /**
         * Gets the value of the balanceChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalanceChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BalanceChgInfo }
         * 
         * 
         */
        public List<BalanceChgInfo> getBalanceChgInfo() {
            if (balanceChgInfo == null) {
                balanceChgInfo = new ArrayList<BalanceChgInfo>();
            }
            return this.balanceChgInfo;
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
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="OriginLimitAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="PaidAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="CurrentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="AccmBeginDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AccmEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "acctKey",
        "creditLimitType",
        "creditInstID",
        "originLimitAmt",
        "paidAmt",
        "currentAmt",
        "currencyID",
        "accmBeginDate",
        "accmEndDate"
    })
    public static class CreditLimitChangeList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "CreditLimitType", required = true)
        protected String creditLimitType;
        @XmlElement(name = "CreditInstID")
        protected long creditInstID;
        @XmlElement(name = "OriginLimitAmt")
        protected long originLimitAmt;
        @XmlElement(name = "PaidAmt")
        protected long paidAmt;
        @XmlElement(name = "CurrentAmt")
        protected long currentAmt;
        @XmlElement(name = "CurrencyID", required = true)
        protected BigInteger currencyID;
        @XmlElement(name = "AccmBeginDate", required = true)
        protected String accmBeginDate;
        @XmlElement(name = "AccmEndDate", required = true)
        protected String accmEndDate;

        /**
         * Gets the value of the acctKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctKey() {
            return acctKey;
        }

        /**
         * Sets the value of the acctKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctKey(String value) {
            this.acctKey = value;
        }

        /**
         * Gets the value of the creditLimitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditLimitType() {
            return creditLimitType;
        }

        /**
         * Sets the value of the creditLimitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditLimitType(String value) {
            this.creditLimitType = value;
        }

        /**
         * Gets the value of the creditInstID property.
         * 
         */
        public long getCreditInstID() {
            return creditInstID;
        }

        /**
         * Sets the value of the creditInstID property.
         * 
         */
        public void setCreditInstID(long value) {
            this.creditInstID = value;
        }

        /**
         * Gets the value of the originLimitAmt property.
         * 
         */
        public long getOriginLimitAmt() {
            return originLimitAmt;
        }

        /**
         * Sets the value of the originLimitAmt property.
         * 
         */
        public void setOriginLimitAmt(long value) {
            this.originLimitAmt = value;
        }

        /**
         * Gets the value of the paidAmt property.
         * 
         */
        public long getPaidAmt() {
            return paidAmt;
        }

        /**
         * Sets the value of the paidAmt property.
         * 
         */
        public void setPaidAmt(long value) {
            this.paidAmt = value;
        }

        /**
         * Gets the value of the currentAmt property.
         * 
         */
        public long getCurrentAmt() {
            return currentAmt;
        }

        /**
         * Sets the value of the currentAmt property.
         * 
         */
        public void setCurrentAmt(long value) {
            this.currentAmt = value;
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
         * Gets the value of the accmBeginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccmBeginDate() {
            return accmBeginDate;
        }

        /**
         * Sets the value of the accmBeginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccmBeginDate(String value) {
            this.accmBeginDate = value;
        }

        /**
         * Gets the value of the accmEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccmEndDate() {
            return accmEndDate;
        }

        /**
         * Sets the value of the accmEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccmEndDate(String value) {
            this.accmEndDate = value;
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
     *         &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OwnerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FreeUnitChgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}FreeUnitChgInfo" maxOccurs="unbounded"/&gt;
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
        "ownerType",
        "ownerKey",
        "freeUnitChgInfo"
    })
    public static class FreeUnitChangeList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OwnerType", required = true)
        protected String ownerType;
        @XmlElement(name = "OwnerKey", required = true)
        protected String ownerKey;
        @XmlElement(name = "FreeUnitChgInfo", required = true)
        protected List<FreeUnitChgInfo> freeUnitChgInfo;

        /**
         * Gets the value of the ownerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerType() {
            return ownerType;
        }

        /**
         * Sets the value of the ownerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerType(String value) {
            this.ownerType = value;
        }

        /**
         * Gets the value of the ownerKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerKey() {
            return ownerKey;
        }

        /**
         * Sets the value of the ownerKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerKey(String value) {
            this.ownerKey = value;
        }

        /**
         * Gets the value of the freeUnitChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeUnitChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeUnitChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeUnitChgInfo }
         * 
         * 
         */
        public List<FreeUnitChgInfo> getFreeUnitChgInfo() {
            if (freeUnitChgInfo == null) {
                freeUnitChgInfo = new ArrayList<FreeUnitChgInfo>();
            }
            return this.freeUnitChgInfo;
        }

    }

}
