
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


/**
 * <p>Java class for ApplyInstallmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplyInstallmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyObj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalCycle" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CycleLength" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CycleRefDate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InatallmentPlan"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PlanType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FirstCycleAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="FinalCycleAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "ApplyInstallmentRequest", propOrder = {
    "applyObj",
    "contractID",
    "totalAmount",
    "currencyID",
    "totalCycle",
    "cycleType",
    "cycleLength",
    "cycleRefDate",
    "chargeCode",
    "inatallmentPlan",
    "additionalProperty"
})
public class ApplyInstallmentRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ApplyObj", required = true)
    protected ApplyInstallmentRequest.ApplyObj applyObj;
    @XmlElement(name = "ContractID", required = true)
    protected String contractID;
    @XmlElement(name = "TotalAmount")
    protected long totalAmount;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;
    @XmlElement(name = "TotalCycle", required = true)
    protected BigInteger totalCycle;
    @XmlElement(name = "CycleType", required = true)
    protected String cycleType;
    @XmlElement(name = "CycleLength", required = true)
    protected BigInteger cycleLength;
    @XmlElement(name = "CycleRefDate")
    protected BigInteger cycleRefDate;
    @XmlElement(name = "ChargeCode")
    protected String chargeCode;
    @XmlElement(name = "InatallmentPlan", required = true)
    protected ApplyInstallmentRequest.InatallmentPlan inatallmentPlan;
    @XmlElement(name = "AdditionalProperty")
    protected List<SimpleProperty> additionalProperty;

    /**
     * Gets the value of the applyObj property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyInstallmentRequest.ApplyObj }
     *     
     */
    public ApplyInstallmentRequest.ApplyObj getApplyObj() {
        return applyObj;
    }

    /**
     * Sets the value of the applyObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyInstallmentRequest.ApplyObj }
     *     
     */
    public void setApplyObj(ApplyInstallmentRequest.ApplyObj value) {
        this.applyObj = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(long value) {
        this.totalAmount = value;
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
     * Gets the value of the totalCycle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCycle() {
        return totalCycle;
    }

    /**
     * Sets the value of the totalCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCycle(BigInteger value) {
        this.totalCycle = value;
    }

    /**
     * Gets the value of the cycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleType() {
        return cycleType;
    }

    /**
     * Sets the value of the cycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleType(String value) {
        this.cycleType = value;
    }

    /**
     * Gets the value of the cycleLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCycleLength() {
        return cycleLength;
    }

    /**
     * Sets the value of the cycleLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCycleLength(BigInteger value) {
        this.cycleLength = value;
    }

    /**
     * Gets the value of the cycleRefDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCycleRefDate() {
        return cycleRefDate;
    }

    /**
     * Sets the value of the cycleRefDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCycleRefDate(BigInteger value) {
        this.cycleRefDate = value;
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
     * Gets the value of the inatallmentPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyInstallmentRequest.InatallmentPlan }
     *     
     */
    public ApplyInstallmentRequest.InatallmentPlan getInatallmentPlan() {
        return inatallmentPlan;
    }

    /**
     * Sets the value of the inatallmentPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyInstallmentRequest.InatallmentPlan }
     *     
     */
    public void setInatallmentPlan(ApplyInstallmentRequest.InatallmentPlan value) {
        this.inatallmentPlan = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
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
        "custAccessCode",
        "subGroupAccessCode"
    })
    public static class ApplyObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
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
     *         &lt;element name="PlanType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FirstCycleAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="FinalCycleAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
        "planType",
        "firstCycleAmount",
        "finalCycleAmount"
    })
    public static class InatallmentPlan
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PlanType", required = true)
        protected String planType;
        @XmlElement(name = "FirstCycleAmount")
        protected Long firstCycleAmount;
        @XmlElement(name = "FinalCycleAmount")
        protected Long finalCycleAmount;

        /**
         * Gets the value of the planType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanType() {
            return planType;
        }

        /**
         * Sets the value of the planType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanType(String value) {
            this.planType = value;
        }

        /**
         * Gets the value of the firstCycleAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFirstCycleAmount() {
            return firstCycleAmount;
        }

        /**
         * Sets the value of the firstCycleAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFirstCycleAmount(Long value) {
            this.firstCycleAmount = value;
        }

        /**
         * Gets the value of the finalCycleAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFinalCycleAmount() {
            return finalCycleAmount;
        }

        /**
         * Sets the value of the finalCycleAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFinalCycleAmount(Long value) {
            this.finalCycleAmount = value;
        }

    }

}
