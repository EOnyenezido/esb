
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;


/**
 * <p>Java class for QueryInstallmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInstallmentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstallmentInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalCycle" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *         &lt;element name="InatallmentDetail" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CycleSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="CycleClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CycleDueDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="RealRepayDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="DelayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "QueryInstallmentResult", propOrder = {
    "installmentInstID",
    "totalAmount",
    "currencyID",
    "totalCycle",
    "contractID",
    "offeringKey",
    "inatallmentDetail"
})
public class QueryInstallmentResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "InstallmentInstID")
    protected long installmentInstID;
    @XmlElement(name = "TotalAmount")
    protected long totalAmount;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;
    @XmlElement(name = "TotalCycle", required = true)
    protected BigInteger totalCycle;
    @XmlElement(name = "ContractID", required = true)
    protected String contractID;
    @XmlElement(name = "OfferingKey")
    protected OfferingKey offeringKey;
    @XmlElement(name = "InatallmentDetail", required = true)
    protected List<QueryInstallmentResult.InatallmentDetail> inatallmentDetail;

    /**
     * Gets the value of the installmentInstID property.
     * 
     */
    public long getInstallmentInstID() {
        return installmentInstID;
    }

    /**
     * Sets the value of the installmentInstID property.
     * 
     */
    public void setInstallmentInstID(long value) {
        this.installmentInstID = value;
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
     * Gets the value of the offeringKey property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingKey }
     *     
     */
    public OfferingKey getOfferingKey() {
        return offeringKey;
    }

    /**
     * Sets the value of the offeringKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingKey }
     *     
     */
    public void setOfferingKey(OfferingKey value) {
        this.offeringKey = value;
    }

    /**
     * Gets the value of the inatallmentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inatallmentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInatallmentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryInstallmentResult.InatallmentDetail }
     * 
     * 
     */
    public List<QueryInstallmentResult.InatallmentDetail> getInatallmentDetail() {
        if (inatallmentDetail == null) {
            inatallmentDetail = new ArrayList<QueryInstallmentResult.InatallmentDetail>();
        }
        return this.inatallmentDetail;
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
     *         &lt;element name="CycleSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="CycleClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CycleDueDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *         &lt;element name="RealRepayDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *         &lt;element name="DelayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cycleSequence",
        "initialAmount",
        "amount",
        "currencyID",
        "cycleClass",
        "status",
        "cycleDueDate",
        "realRepayDate",
        "delayFlag"
    })
    public static class InatallmentDetail
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CycleSequence", required = true)
        protected BigInteger cycleSequence;
        @XmlElement(name = "InitialAmount")
        protected long initialAmount;
        @XmlElement(name = "Amount")
        protected long amount;
        @XmlElement(name = "CurrencyID", required = true)
        protected BigInteger currencyID;
        @XmlElement(name = "CycleClass", required = true)
        protected String cycleClass;
        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "CycleDueDate", required = true)
        protected String cycleDueDate;
        @XmlElement(name = "RealRepayDate", required = true)
        protected String realRepayDate;
        @XmlElement(name = "DelayFlag", required = true)
        protected String delayFlag;

        /**
         * Gets the value of the cycleSequence property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCycleSequence() {
            return cycleSequence;
        }

        /**
         * Sets the value of the cycleSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCycleSequence(BigInteger value) {
            this.cycleSequence = value;
        }

        /**
         * Gets the value of the initialAmount property.
         * 
         */
        public long getInitialAmount() {
            return initialAmount;
        }

        /**
         * Sets the value of the initialAmount property.
         * 
         */
        public void setInitialAmount(long value) {
            this.initialAmount = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         */
        public long getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         */
        public void setAmount(long value) {
            this.amount = value;
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
         * Gets the value of the cycleClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCycleClass() {
            return cycleClass;
        }

        /**
         * Sets the value of the cycleClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCycleClass(String value) {
            this.cycleClass = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the cycleDueDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCycleDueDate() {
            return cycleDueDate;
        }

        /**
         * Sets the value of the cycleDueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCycleDueDate(String value) {
            this.cycleDueDate = value;
        }

        /**
         * Gets the value of the realRepayDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealRepayDate() {
            return realRepayDate;
        }

        /**
         * Sets the value of the realRepayDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealRepayDate(String value) {
            this.realRepayDate = value;
        }

        /**
         * Gets the value of the delayFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDelayFlag() {
            return delayFlag;
        }

        /**
         * Sets the value of the delayFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDelayFlag(String value) {
            this.delayFlag = value;
        }

    }

}
