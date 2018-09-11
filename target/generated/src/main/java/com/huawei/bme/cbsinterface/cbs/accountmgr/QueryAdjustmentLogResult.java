
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAdjustmentLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAdjustmentLogResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustmentLog" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AdjustmentItem" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="CurrBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                           &lt;/all&gt;
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
@XmlType(name = "QueryAdjustmentLogResult", propOrder = {
    "adjustmentLog"
})
public class QueryAdjustmentLogResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "AdjustmentLog")
    protected List<QueryAdjustmentLogResult.AdjustmentLog> adjustmentLog;

    /**
     * Gets the value of the adjustmentLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryAdjustmentLogResult.AdjustmentLog }
     * 
     * 
     */
    public List<QueryAdjustmentLogResult.AdjustmentLog> getAdjustmentLog() {
        if (adjustmentLog == null) {
            adjustmentLog = new ArrayList<QueryAdjustmentLogResult.AdjustmentLog>();
        }
        return this.adjustmentLog;
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
     *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AdjustmentItem" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="CurrBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                 &lt;/all&gt;
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
        "logID",
        "internalSerialNo",
        "tradeTime",
        "operatorID",
        "oldActiveStop",
        "newActiveStop",
        "oldSuspendStop",
        "newSuspendStop",
        "oldDisableStop",
        "newDisableStop",
        "operationDes",
        "adjustmentItem"
    })
    public static class AdjustmentLog
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElement(name = "LogID", required = true)
        protected String logID;
        @XmlElement(name = "InternalSerialNo")
        protected String internalSerialNo;
        @XmlElement(name = "TradeTime", required = true)
        protected String tradeTime;
        @XmlElement(name = "OperatorID")
        protected String operatorID;
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
        @XmlElement(name = "OperationDes")
        protected String operationDes;
        @XmlElement(name = "AdjustmentItem", required = true)
        protected List<QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem> adjustmentItem;

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
         * Gets the value of the adjustmentItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adjustmentItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdjustmentItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem }
         * 
         * 
         */
        public List<QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem> getAdjustmentItem() {
            if (adjustmentItem == null) {
                adjustmentItem = new ArrayList<QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem>();
            }
            return this.adjustmentItem;
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
         *       &lt;all&gt;
         *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="CurrBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class AdjustmentItem
            implements Serializable
        {

            private final static long serialVersionUID = 11082011L;
            @XmlElement(name = "AccountType", required = true)
            protected String accountType;
            @XmlElement(name = "AdjustmentAmt")
            protected long adjustmentAmt;
            @XmlElement(name = "CurrBalance")
            protected long currBalance;

            /**
             * Gets the value of the accountType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountType() {
                return accountType;
            }

            /**
             * Sets the value of the accountType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountType(String value) {
                this.accountType = value;
            }

            /**
             * Gets the value of the adjustmentAmt property.
             * 
             */
            public long getAdjustmentAmt() {
                return adjustmentAmt;
            }

            /**
             * Sets the value of the adjustmentAmt property.
             * 
             */
            public void setAdjustmentAmt(long value) {
                this.adjustmentAmt = value;
            }

            /**
             * Gets the value of the currBalance property.
             * 
             */
            public long getCurrBalance() {
                return currBalance;
            }

            /**
             * Sets the value of the currBalance property.
             * 
             */
            public void setCurrBalance(long value) {
                this.currBalance = value;
            }

        }

    }

}
