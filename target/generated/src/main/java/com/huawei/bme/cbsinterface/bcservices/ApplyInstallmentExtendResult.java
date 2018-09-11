
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
 * <p>Java class for ApplyInstallmentExtendResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplyInstallmentExtendResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newInstallmentInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InatallmentDetail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InstallmentInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="CycleSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CycleClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CycleDueDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="RealRepayDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "ApplyInstallmentExtendResult", propOrder = {
    "newInstallmentInfo"
})
public class ApplyInstallmentExtendResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(required = true)
    protected ApplyInstallmentExtendResult.NewInstallmentInfo newInstallmentInfo;

    /**
     * Gets the value of the newInstallmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyInstallmentExtendResult.NewInstallmentInfo }
     *     
     */
    public ApplyInstallmentExtendResult.NewInstallmentInfo getNewInstallmentInfo() {
        return newInstallmentInfo;
    }

    /**
     * Sets the value of the newInstallmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyInstallmentExtendResult.NewInstallmentInfo }
     *     
     */
    public void setNewInstallmentInfo(ApplyInstallmentExtendResult.NewInstallmentInfo value) {
        this.newInstallmentInfo = value;
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
     *         &lt;element name="InatallmentDetail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InstallmentInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="CycleSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CycleClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CycleDueDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="RealRepayDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
    @XmlType(name = "", propOrder = {
        "inatallmentDetail"
    })
    public static class NewInstallmentInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "InatallmentDetail", required = true)
        protected List<ApplyInstallmentExtendResult.NewInstallmentInfo.InatallmentDetail> inatallmentDetail;

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
         * {@link ApplyInstallmentExtendResult.NewInstallmentInfo.InatallmentDetail }
         * 
         * 
         */
        public List<ApplyInstallmentExtendResult.NewInstallmentInfo.InatallmentDetail> getInatallmentDetail() {
            if (inatallmentDetail == null) {
                inatallmentDetail = new ArrayList<ApplyInstallmentExtendResult.NewInstallmentInfo.InatallmentDetail>();
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
         *         &lt;element name="InstallmentInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="CycleSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CycleClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CycleDueDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="RealRepayDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "installmentInstID",
            "cycleSequence",
            "initialAmount",
            "amount",
            "currencyID",
            "cycleClass",
            "status",
            "cycleDueDate",
            "realRepayDate"
        })
        public static class InatallmentDetail
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "InstallmentInstID")
            protected long installmentInstID;
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

        }

    }

}
