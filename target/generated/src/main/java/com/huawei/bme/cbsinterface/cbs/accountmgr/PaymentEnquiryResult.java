
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentEnquiryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentEnquiryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentLog" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubCosID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="PaymentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="PrmValidity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="PaymentBonus" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CanceledFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="CancelLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdditiontalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentTax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentPenalty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OldPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="NewPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentEnquiryResult", propOrder = {
    "paymentLog"
})
public class PaymentEnquiryResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "PaymentLog", required = true)
    protected List<PaymentEnquiryResult.PaymentLog> paymentLog;

    /**
     * Gets the value of the paymentLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentEnquiryResult.PaymentLog }
     * 
     * 
     */
    public List<PaymentEnquiryResult.PaymentLog> getPaymentLog() {
        if (paymentLog == null) {
            paymentLog = new ArrayList<PaymentEnquiryResult.PaymentLog>();
        }
        return this.paymentLog;
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
     *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubCosID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="PaymentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="PrmValidity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="PaymentBonus" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CanceledFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="CancelLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdditiontalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PaymentTax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="PaymentPenalty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OldPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="NewPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "logID",
        "internalSerialNo",
        "subscriberNo",
        "subCosID",
        "tradeTime",
        "errorType",
        "paymentMode",
        "oldActiveStop",
        "newActiveStop",
        "oldSuspendStop",
        "newSuspendStop",
        "oldDisableStop",
        "newDisableStop",
        "oldBalance",
        "newBalance",
        "paymentAmt",
        "currency",
        "validity",
        "prmValidity",
        "paymentBonus",
        "canceledFlag",
        "cancelLogID",
        "additiontalInfo",
        "operatorID",
        "paymentTax",
        "paymentPenalty",
        "operationDes",
        "bankCode",
        "oldPOSBalance",
        "newPOSBalance",
        "location",
        "agentName"
    })
    public static class PaymentLog
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElement(name = "LogID", required = true)
        protected String logID;
        @XmlElement(name = "InternalSerialNo", required = true)
        protected String internalSerialNo;
        @XmlElement(name = "SubscriberNo", required = true)
        protected String subscriberNo;
        @XmlElement(name = "SubCosID")
        protected int subCosID;
        @XmlElement(name = "TradeTime", required = true)
        protected String tradeTime;
        @XmlElement(name = "ErrorType", required = true)
        protected String errorType;
        @XmlElement(name = "PaymentMode", required = true)
        protected String paymentMode;
        @XmlElement(name = "OldActiveStop", required = true)
        protected String oldActiveStop;
        @XmlElement(name = "NewActiveStop", required = true)
        protected String newActiveStop;
        @XmlElement(name = "OldSuspendStop", required = true)
        protected String oldSuspendStop;
        @XmlElement(name = "NewSuspendStop", required = true)
        protected String newSuspendStop;
        @XmlElement(name = "OldDisableStop", required = true)
        protected String oldDisableStop;
        @XmlElement(name = "NewDisableStop", required = true)
        protected String newDisableStop;
        @XmlElement(name = "OldBalance")
        protected long oldBalance;
        @XmlElement(name = "NewBalance")
        protected long newBalance;
        @XmlElement(name = "PaymentAmt")
        protected long paymentAmt;
        @XmlElement(name = "Currency")
        protected String currency;
        @XmlElement(name = "Validity")
        protected int validity;
        @XmlElement(name = "PrmValidity")
        protected int prmValidity;
        @XmlElement(name = "PaymentBonus")
        protected List<PaymentEnquiryResult.PaymentLog.PaymentBonus> paymentBonus;
        @XmlElement(name = "CanceledFlag")
        protected int canceledFlag;
        @XmlElement(name = "CancelLogID")
        protected String cancelLogID;
        @XmlElement(name = "AdditiontalInfo", required = true)
        protected String additiontalInfo;
        @XmlElement(name = "OperatorID")
        protected String operatorID;
        @XmlElement(name = "PaymentTax")
        protected Integer paymentTax;
        @XmlElement(name = "PaymentPenalty")
        protected Integer paymentPenalty;
        @XmlElement(name = "OperationDes")
        protected String operationDes;
        @XmlElement(name = "BankCode")
        protected String bankCode;
        @XmlElement(name = "OldPOSBalance")
        protected Long oldPOSBalance;
        @XmlElement(name = "NewPOSBalance")
        protected Long newPOSBalance;
        @XmlElement(name = "Location")
        protected String location;
        @XmlElement(name = "AgentName")
        protected String agentName;

        /**
         * Gets the value of the logID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogID() {
            return logID;
        }

        /**
         * Sets the value of the logID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogID(String value) {
            this.logID = value;
        }

        /**
         * Gets the value of the internalSerialNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalSerialNo() {
            return internalSerialNo;
        }

        /**
         * Sets the value of the internalSerialNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalSerialNo(String value) {
            this.internalSerialNo = value;
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
         * Gets the value of the subCosID property.
         * 
         */
        public int getSubCosID() {
            return subCosID;
        }

        /**
         * Sets the value of the subCosID property.
         * 
         */
        public void setSubCosID(int value) {
            this.subCosID = value;
        }

        /**
         * Gets the value of the tradeTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeTime() {
            return tradeTime;
        }

        /**
         * Sets the value of the tradeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeTime(String value) {
            this.tradeTime = value;
        }

        /**
         * Gets the value of the errorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorType() {
            return errorType;
        }

        /**
         * Sets the value of the errorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorType(String value) {
            this.errorType = value;
        }

        /**
         * Gets the value of the paymentMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentMode() {
            return paymentMode;
        }

        /**
         * Sets the value of the paymentMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentMode(String value) {
            this.paymentMode = value;
        }

        /**
         * Gets the value of the oldActiveStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldActiveStop() {
            return oldActiveStop;
        }

        /**
         * Sets the value of the oldActiveStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldActiveStop(String value) {
            this.oldActiveStop = value;
        }

        /**
         * Gets the value of the newActiveStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewActiveStop() {
            return newActiveStop;
        }

        /**
         * Sets the value of the newActiveStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewActiveStop(String value) {
            this.newActiveStop = value;
        }

        /**
         * Gets the value of the oldSuspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldSuspendStop() {
            return oldSuspendStop;
        }

        /**
         * Sets the value of the oldSuspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldSuspendStop(String value) {
            this.oldSuspendStop = value;
        }

        /**
         * Gets the value of the newSuspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewSuspendStop() {
            return newSuspendStop;
        }

        /**
         * Sets the value of the newSuspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewSuspendStop(String value) {
            this.newSuspendStop = value;
        }

        /**
         * Gets the value of the oldDisableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldDisableStop() {
            return oldDisableStop;
        }

        /**
         * Sets the value of the oldDisableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldDisableStop(String value) {
            this.oldDisableStop = value;
        }

        /**
         * Gets the value of the newDisableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewDisableStop() {
            return newDisableStop;
        }

        /**
         * Sets the value of the newDisableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewDisableStop(String value) {
            this.newDisableStop = value;
        }

        /**
         * Gets the value of the oldBalance property.
         * 
         */
        public long getOldBalance() {
            return oldBalance;
        }

        /**
         * Sets the value of the oldBalance property.
         * 
         */
        public void setOldBalance(long value) {
            this.oldBalance = value;
        }

        /**
         * Gets the value of the newBalance property.
         * 
         */
        public long getNewBalance() {
            return newBalance;
        }

        /**
         * Sets the value of the newBalance property.
         * 
         */
        public void setNewBalance(long value) {
            this.newBalance = value;
        }

        /**
         * Gets the value of the paymentAmt property.
         * 
         */
        public long getPaymentAmt() {
            return paymentAmt;
        }

        /**
         * Sets the value of the paymentAmt property.
         * 
         */
        public void setPaymentAmt(long value) {
            this.paymentAmt = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the validity property.
         * 
         */
        public int getValidity() {
            return validity;
        }

        /**
         * Sets the value of the validity property.
         * 
         */
        public void setValidity(int value) {
            this.validity = value;
        }

        /**
         * Gets the value of the prmValidity property.
         * 
         */
        public int getPrmValidity() {
            return prmValidity;
        }

        /**
         * Sets the value of the prmValidity property.
         * 
         */
        public void setPrmValidity(int value) {
            this.prmValidity = value;
        }

        /**
         * Gets the value of the paymentBonus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentBonus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentBonus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentEnquiryResult.PaymentLog.PaymentBonus }
         * 
         * 
         */
        public List<PaymentEnquiryResult.PaymentLog.PaymentBonus> getPaymentBonus() {
            if (paymentBonus == null) {
                paymentBonus = new ArrayList<PaymentEnquiryResult.PaymentLog.PaymentBonus>();
            }
            return this.paymentBonus;
        }

        /**
         * Gets the value of the canceledFlag property.
         * 
         */
        public int getCanceledFlag() {
            return canceledFlag;
        }

        /**
         * Sets the value of the canceledFlag property.
         * 
         */
        public void setCanceledFlag(int value) {
            this.canceledFlag = value;
        }

        /**
         * Gets the value of the cancelLogID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelLogID() {
            return cancelLogID;
        }

        /**
         * Sets the value of the cancelLogID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelLogID(String value) {
            this.cancelLogID = value;
        }

        /**
         * Gets the value of the additiontalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditiontalInfo() {
            return additiontalInfo;
        }

        /**
         * Sets the value of the additiontalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditiontalInfo(String value) {
            this.additiontalInfo = value;
        }

        /**
         * Gets the value of the operatorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorID() {
            return operatorID;
        }

        /**
         * Sets the value of the operatorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorID(String value) {
            this.operatorID = value;
        }

        /**
         * Gets the value of the paymentTax property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPaymentTax() {
            return paymentTax;
        }

        /**
         * Sets the value of the paymentTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPaymentTax(Integer value) {
            this.paymentTax = value;
        }

        /**
         * Gets the value of the paymentPenalty property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPaymentPenalty() {
            return paymentPenalty;
        }

        /**
         * Sets the value of the paymentPenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPaymentPenalty(Integer value) {
            this.paymentPenalty = value;
        }

        /**
         * Gets the value of the operationDes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationDes() {
            return operationDes;
        }

        /**
         * Sets the value of the operationDes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationDes(String value) {
            this.operationDes = value;
        }

        /**
         * Gets the value of the bankCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankCode() {
            return bankCode;
        }

        /**
         * Sets the value of the bankCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankCode(String value) {
            this.bankCode = value;
        }

        /**
         * Gets the value of the oldPOSBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOldPOSBalance() {
            return oldPOSBalance;
        }

        /**
         * Sets the value of the oldPOSBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOldPOSBalance(Long value) {
            this.oldPOSBalance = value;
        }

        /**
         * Gets the value of the newPOSBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNewPOSBalance() {
            return newPOSBalance;
        }

        /**
         * Sets the value of the newPOSBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNewPOSBalance(Long value) {
            this.newPOSBalance = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the agentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentName() {
            return agentName;
        }

        /**
         * Sets the value of the agentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentName(String value) {
            this.agentName = value;
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
         *         &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
            "prmAcctType",
            "prmAmt",
            "currPrmAcctBalance"
        })
        public static class PaymentBonus
            implements Serializable
        {

            private final static long serialVersionUID = 11082011L;
            @XmlElement(name = "PrmAcctType")
            protected int prmAcctType;
            @XmlElement(name = "PrmAmt")
            protected int prmAmt;
            @XmlElement(name = "CurrPrmAcctBalance")
            protected Integer currPrmAcctBalance;

            /**
             * Gets the value of the prmAcctType property.
             * 
             */
            public int getPrmAcctType() {
                return prmAcctType;
            }

            /**
             * Sets the value of the prmAcctType property.
             * 
             */
            public void setPrmAcctType(int value) {
                this.prmAcctType = value;
            }

            /**
             * Gets the value of the prmAmt property.
             * 
             */
            public int getPrmAmt() {
                return prmAmt;
            }

            /**
             * Sets the value of the prmAmt property.
             * 
             */
            public void setPrmAmt(int value) {
                this.prmAmt = value;
            }

            /**
             * Gets the value of the currPrmAcctBalance property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCurrPrmAcctBalance() {
                return currPrmAcctBalance;
            }

            /**
             * Sets the value of the currPrmAcctBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCurrPrmAcctBalance(Integer value) {
                this.currPrmAcctBalance = value;
            }

        }

    }

}
