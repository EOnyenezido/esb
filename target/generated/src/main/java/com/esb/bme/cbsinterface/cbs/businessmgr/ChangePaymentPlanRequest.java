
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePaymentPlanRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePaymentPlanRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentPlan" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DestSubNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="Priority" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="3000"/&gt;
 *                         &lt;maxInclusive value="3999"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Feegroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
 *                   &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePaymentPlanRequest", propOrder = {
    "paymentPlan",
    "custID"
})
public class ChangePaymentPlanRequest
    extends Common
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "PaymentPlan", required = true)
    protected List<ChangePaymentPlanRequest.PaymentPlan> paymentPlan;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the paymentPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangePaymentPlanRequest.PaymentPlan }
     * 
     * 
     */
    public List<ChangePaymentPlanRequest.PaymentPlan> getPaymentPlan() {
        if (paymentPlan == null) {
            paymentPlan = new ArrayList<ChangePaymentPlanRequest.PaymentPlan>();
        }
        return this.paymentPlan;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
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
     *         &lt;element name="DestSubNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="Priority" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="3000"/&gt;
     *               &lt;maxInclusive value="3999"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Feegroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
     *         &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "destSubNo",
        "accountType",
        "limitValue",
        "priority",
        "feegroup",
        "operationType",
        "paymentPlanKey"
    })
    public static class PaymentPlan
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "DestSubNo")
        protected String destSubNo;
        @XmlElement(name = "AccountType")
        protected String accountType;
        @XmlElement(name = "LimitValue")
        protected Integer limitValue;
        @XmlElement(name = "Priority")
        protected Integer priority;
        @XmlElement(name = "Feegroup")
        protected String feegroup;
        @XmlElement(name = "OperationType", required = true)
        protected String operationType;
        @XmlElement(name = "PaymentPlanKey")
        protected Integer paymentPlanKey;

        /**
         * Gets the value of the destSubNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestSubNo() {
            return destSubNo;
        }

        /**
         * Sets the value of the destSubNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestSubNo(String value) {
            this.destSubNo = value;
        }

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
         * Gets the value of the limitValue property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLimitValue() {
            return limitValue;
        }

        /**
         * Sets the value of the limitValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLimitValue(Integer value) {
            this.limitValue = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPriority(Integer value) {
            this.priority = value;
        }

        /**
         * Gets the value of the feegroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeegroup() {
            return feegroup;
        }

        /**
         * Sets the value of the feegroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeegroup(String value) {
            this.feegroup = value;
        }

        /**
         * Gets the value of the operationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationType(String value) {
            this.operationType = value;
        }

        /**
         * Gets the value of the paymentPlanKey property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPaymentPlanKey() {
            return paymentPlanKey;
        }

        /**
         * Sets the value of the paymentPlanKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPaymentPlanKey(Integer value) {
            this.paymentPlanKey = value;
        }

    }

}
