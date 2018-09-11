
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;
import com.huawei.bme.cbsinterface.bccommon.Tax;


/**
 * <p>Java class for FeeDeductionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDeductionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeductSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeductObj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                   &lt;element name="AcctAccessCode"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OperationInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OperationProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeductInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChargeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SalesTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="InvoiceTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="WaiveAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Tax" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdditionalProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDeductionRequest", propOrder = {
    "deductSerialNo",
    "deductObj",
    "operationInfo",
    "deductInfo",
    "additionalProperty"
})
public class FeeDeductionRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "DeductSerialNo")
    protected String deductSerialNo;
    @XmlElement(name = "DeductObj", required = true)
    protected FeeDeductionRequest.DeductObj deductObj;
    @XmlElement(name = "OperationInfo")
    protected FeeDeductionRequest.OperationInfo operationInfo;
    @XmlElement(name = "DeductInfo")
    protected List<FeeDeductionRequest.DeductInfo> deductInfo;
    @XmlElement(name = "AdditionalProperty")
    protected List<SimpleProperty> additionalProperty;

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
     * Gets the value of the deductObj property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDeductionRequest.DeductObj }
     *     
     */
    public FeeDeductionRequest.DeductObj getDeductObj() {
        return deductObj;
    }

    /**
     * Sets the value of the deductObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDeductionRequest.DeductObj }
     *     
     */
    public void setDeductObj(FeeDeductionRequest.DeductObj value) {
        this.deductObj = value;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDeductionRequest.OperationInfo }
     *     
     */
    public FeeDeductionRequest.OperationInfo getOperationInfo() {
        return operationInfo;
    }

    /**
     * Sets the value of the operationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDeductionRequest.OperationInfo }
     *     
     */
    public void setOperationInfo(FeeDeductionRequest.OperationInfo value) {
        this.operationInfo = value;
    }

    /**
     * Gets the value of the deductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDeductionRequest.DeductInfo }
     * 
     * 
     */
    public List<FeeDeductionRequest.DeductInfo> getDeductInfo() {
        if (deductInfo == null) {
            deductInfo = new ArrayList<FeeDeductionRequest.DeductInfo>();
        }
        return this.deductInfo;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimpleProperty>();
        }
        return this.additionalProperty;
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
     *         &lt;element name="ChargeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SalesTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="InvoiceTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="WaiveAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Tax" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdditionalProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "chargeSeq",
        "chargeCode",
        "salesTime",
        "invoiceTime",
        "chargeAmt",
        "discountAmt",
        "waiveAmt",
        "currencyID",
        "tax",
        "additionalInfo",
        "additionalProperty"
    })
    public static class DeductInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ChargeSeq")
        protected String chargeSeq;
        @XmlElement(name = "ChargeCode", required = true)
        protected String chargeCode;
        @XmlElement(name = "SalesTime")
        protected String salesTime;
        @XmlElement(name = "InvoiceTime")
        protected String invoiceTime;
        @XmlElement(name = "ChargeAmt")
        protected long chargeAmt;
        @XmlElement(name = "DiscountAmt")
        protected Long discountAmt;
        @XmlElement(name = "WaiveAmt")
        protected Long waiveAmt;
        @XmlElement(name = "CurrencyID", required = true)
        protected BigInteger currencyID;
        @XmlElement(name = "Tax")
        protected List<Tax> tax;
        @XmlElement(name = "AdditionalInfo")
        protected String additionalInfo;
        @XmlElement(name = "AdditionalProperty")
        protected List<SimpleProperty> additionalProperty;

        /**
         * Gets the value of the chargeSeq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeSeq() {
            return chargeSeq;
        }

        /**
         * Sets the value of the chargeSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeSeq(String value) {
            this.chargeSeq = value;
        }

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
         * Gets the value of the salesTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSalesTime() {
            return salesTime;
        }

        /**
         * Sets the value of the salesTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSalesTime(String value) {
            this.salesTime = value;
        }

        /**
         * Gets the value of the invoiceTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceTime() {
            return invoiceTime;
        }

        /**
         * Sets the value of the invoiceTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceTime(String value) {
            this.invoiceTime = value;
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
         * Gets the value of the discountAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDiscountAmt() {
            return discountAmt;
        }

        /**
         * Sets the value of the discountAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDiscountAmt(Long value) {
            this.discountAmt = value;
        }

        /**
         * Gets the value of the waiveAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getWaiveAmt() {
            return waiveAmt;
        }

        /**
         * Sets the value of the waiveAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setWaiveAmt(Long value) {
            this.waiveAmt = value;
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

        /**
         * Gets the value of the additionalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfo() {
            return additionalInfo;
        }

        /**
         * Sets the value of the additionalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalInfo(String value) {
            this.additionalInfo = value;
        }

        /**
         * Gets the value of the additionalProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getAdditionalProperty() {
            if (additionalProperty == null) {
                additionalProperty = new ArrayList<SimpleProperty>();
            }
            return this.additionalProperty;
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
     *       &lt;choice&gt;
     *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *         &lt;element name="AcctAccessCode"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
     *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subAccessCode",
        "acctAccessCode",
        "custAccessCode",
        "subGroupAccessCode"
    })
    public static class DeductObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "AcctAccessCode")
        protected FeeDeductionRequest.DeductObj.AcctAccessCode acctAccessCode;
        @XmlElement(name = "CustAccessCode")
        protected CustAccessCode custAccessCode;
        @XmlElement(name = "SubGroupAccessCode")
        protected SubGroupAccessCode subGroupAccessCode;

        /**
         * Gets the value of the subAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubAccessCode }
         *     
         */
        public SubAccessCode getSubAccessCode() {
            return subAccessCode;
        }

        /**
         * Sets the value of the subAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubAccessCode }
         *     
         */
        public void setSubAccessCode(SubAccessCode value) {
            this.subAccessCode = value;
        }

        /**
         * Gets the value of the acctAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link FeeDeductionRequest.DeductObj.AcctAccessCode }
         *     
         */
        public FeeDeductionRequest.DeductObj.AcctAccessCode getAcctAccessCode() {
            return acctAccessCode;
        }

        /**
         * Sets the value of the acctAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeDeductionRequest.DeductObj.AcctAccessCode }
         *     
         */
        public void setAcctAccessCode(FeeDeductionRequest.DeductObj.AcctAccessCode value) {
            this.acctAccessCode = value;
        }

        /**
         * Gets the value of the custAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccessCode }
         *     
         */
        public CustAccessCode getCustAccessCode() {
            return custAccessCode;
        }

        /**
         * Sets the value of the custAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccessCode }
         *     
         */
        public void setCustAccessCode(CustAccessCode value) {
            this.custAccessCode = value;
        }

        /**
         * Gets the value of the subGroupAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public SubGroupAccessCode getSubGroupAccessCode() {
            return subGroupAccessCode;
        }

        /**
         * Sets the value of the subGroupAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public void setSubGroupAccessCode(SubGroupAccessCode value) {
            this.subGroupAccessCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "payType"
        })
        public static class AcctAccessCode
            extends com.huawei.bme.cbsinterface.bccommon.AcctAccessCode
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PayType")
            protected String payType;

            /**
             * Gets the value of the payType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayType() {
                return payType;
            }

            /**
             * Sets the value of the payType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayType(String value) {
                this.payType = value;
            }

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
     *         &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OperationProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "operationCode",
        "operationProperty"
    })
    public static class OperationInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OperationCode", required = true)
        protected String operationCode;
        @XmlElement(name = "OperationProperty")
        protected List<SimpleProperty> operationProperty;

        /**
         * Gets the value of the operationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationCode() {
            return operationCode;
        }

        /**
         * Sets the value of the operationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationCode(String value) {
            this.operationCode = value;
        }

        /**
         * Gets the value of the operationProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getOperationProperty() {
            if (operationProperty == null) {
                operationProperty = new ArrayList<SimpleProperty>();
            }
            return this.operationProperty;
        }

    }

}
