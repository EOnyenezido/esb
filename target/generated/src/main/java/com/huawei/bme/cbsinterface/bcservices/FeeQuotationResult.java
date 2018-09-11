
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
import com.huawei.bme.cbsinterface.bccommon.Tax;


/**
 * <p>Java class for FeeQuotationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeQuotationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceSufficientFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="ChargeAmountList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Tax" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="ConsumptionLimitChangeList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LimitCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitOwnerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitOwnerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "FeeQuotationResult", propOrder = {
    "balanceSufficientFlag",
    "acctBalanceChangeList",
    "freeUnitChangeList",
    "chargeAmountList",
    "creditLimitChangeList",
    "consumptionLimitChangeList"
})
public class FeeQuotationResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "BalanceSufficientFlag", required = true, nillable = true)
    protected String balanceSufficientFlag;
    @XmlElement(name = "AcctBalanceChangeList")
    protected List<FeeQuotationResult.AcctBalanceChangeList> acctBalanceChangeList;
    @XmlElement(name = "FreeUnitChangeList", nillable = true)
    protected List<FeeQuotationResult.FreeUnitChangeList> freeUnitChangeList;
    @XmlElement(name = "ChargeAmountList")
    protected List<FeeQuotationResult.ChargeAmountList> chargeAmountList;
    @XmlElement(name = "CreditLimitChangeList")
    protected List<FeeQuotationResult.CreditLimitChangeList> creditLimitChangeList;
    @XmlElement(name = "ConsumptionLimitChangeList")
    protected List<FeeQuotationResult.ConsumptionLimitChangeList> consumptionLimitChangeList;

    /**
     * Gets the value of the balanceSufficientFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceSufficientFlag() {
        return balanceSufficientFlag;
    }

    /**
     * Sets the value of the balanceSufficientFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceSufficientFlag(String value) {
        this.balanceSufficientFlag = value;
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
     * {@link FeeQuotationResult.AcctBalanceChangeList }
     * 
     * 
     */
    public List<FeeQuotationResult.AcctBalanceChangeList> getAcctBalanceChangeList() {
        if (acctBalanceChangeList == null) {
            acctBalanceChangeList = new ArrayList<FeeQuotationResult.AcctBalanceChangeList>();
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
     * {@link FeeQuotationResult.FreeUnitChangeList }
     * 
     * 
     */
    public List<FeeQuotationResult.FreeUnitChangeList> getFreeUnitChangeList() {
        if (freeUnitChangeList == null) {
            freeUnitChangeList = new ArrayList<FeeQuotationResult.FreeUnitChangeList>();
        }
        return this.freeUnitChangeList;
    }

    /**
     * Gets the value of the chargeAmountList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeAmountList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeAmountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeQuotationResult.ChargeAmountList }
     * 
     * 
     */
    public List<FeeQuotationResult.ChargeAmountList> getChargeAmountList() {
        if (chargeAmountList == null) {
            chargeAmountList = new ArrayList<FeeQuotationResult.ChargeAmountList>();
        }
        return this.chargeAmountList;
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
     * {@link FeeQuotationResult.CreditLimitChangeList }
     * 
     * 
     */
    public List<FeeQuotationResult.CreditLimitChangeList> getCreditLimitChangeList() {
        if (creditLimitChangeList == null) {
            creditLimitChangeList = new ArrayList<FeeQuotationResult.CreditLimitChangeList>();
        }
        return this.creditLimitChangeList;
    }

    /**
     * Gets the value of the consumptionLimitChangeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionLimitChangeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionLimitChangeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeQuotationResult.ConsumptionLimitChangeList }
     * 
     * 
     */
    public List<FeeQuotationResult.ConsumptionLimitChangeList> getConsumptionLimitChangeList() {
        if (consumptionLimitChangeList == null) {
            consumptionLimitChangeList = new ArrayList<FeeQuotationResult.ConsumptionLimitChangeList>();
        }
        return this.consumptionLimitChangeList;
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
     *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Tax" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "chargeCode",
        "chargeAmt",
        "currencyID",
        "tax"
    })
    public static class ChargeAmountList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ChargeCode", required = true)
        protected String chargeCode;
        @XmlElement(name = "ChargeAmt")
        protected long chargeAmt;
        @XmlElement(name = "CurrencyID", required = true)
        protected BigInteger currencyID;
        @XmlElement(name = "Tax")
        protected List<Tax> tax;

        /**
         * Gets the value of the chargeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeCode() {
            return chargeCode;
        }

        /**
         * Sets the value of the chargeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeCode(String value) {
            this.chargeCode = value;
        }

        /**
         * Gets the value of the chargeAmt property.
         * 
         */
        public long getChargeAmt() {
            return chargeAmt;
        }

        /**
         * Sets the value of the chargeAmt property.
         * 
         */
        public void setChargeAmt(long value) {
            this.chargeAmt = value;
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
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tax }
         * 
         * 
         */
        public List<Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<Tax>();
            }
            return this.tax;
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
     *         &lt;element name="LimitCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitOwnerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitOwnerKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
        "limitCategory",
        "limitOwnerType",
        "limitOwnerKey",
        "limitType",
        "limitInstID",
        "originLimitAmt",
        "paidAmt",
        "currentAmt",
        "currencyID",
        "accmBeginDate",
        "accmEndDate"
    })
    public static class ConsumptionLimitChangeList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "LimitCategory", required = true)
        protected String limitCategory;
        @XmlElement(name = "LimitOwnerType", required = true)
        protected String limitOwnerType;
        @XmlElement(name = "LimitOwnerKey", required = true)
        protected String limitOwnerKey;
        @XmlElement(name = "LimitType", required = true)
        protected String limitType;
        @XmlElement(name = "LimitInstID")
        protected long limitInstID;
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
         * Gets the value of the limitCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitCategory() {
            return limitCategory;
        }

        /**
         * Sets the value of the limitCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitCategory(String value) {
            this.limitCategory = value;
        }

        /**
         * Gets the value of the limitOwnerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitOwnerType() {
            return limitOwnerType;
        }

        /**
         * Sets the value of the limitOwnerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitOwnerType(String value) {
            this.limitOwnerType = value;
        }

        /**
         * Gets the value of the limitOwnerKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitOwnerKey() {
            return limitOwnerKey;
        }

        /**
         * Sets the value of the limitOwnerKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitOwnerKey(String value) {
            this.limitOwnerKey = value;
        }

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
         * Gets the value of the limitInstID property.
         * 
         */
        public long getLimitInstID() {
            return limitInstID;
        }

        /**
         * Sets the value of the limitInstID property.
         * 
         */
        public void setLimitInstID(long value) {
            this.limitInstID = value;
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
        @XmlElement(name = "FreeUnitChgInfo", required = true, nillable = true)
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
