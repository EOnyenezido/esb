
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
 * <p>Java class for QueryDataPackageUsageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDataPackageUsageResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsageList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="CurrentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="UsedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TodayUsedAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillCycleOpenDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="BillCycleEndDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="BillCycleID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDataPackageUsageResult", propOrder = {
    "usageList",
    "billCycleOpenDate",
    "billCycleEndDate",
    "billCycleID"
})
public class QueryDataPackageUsageResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "UsageList")
    protected List<QueryDataPackageUsageResult.UsageList> usageList;
    @XmlElement(name = "BillCycleOpenDate")
    protected String billCycleOpenDate;
    @XmlElement(name = "BillCycleEndDate")
    protected String billCycleEndDate;
    @XmlElement(name = "BillCycleID")
    protected BigInteger billCycleID;

    /**
     * Gets the value of the usageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryDataPackageUsageResult.UsageList }
     * 
     * 
     */
    public List<QueryDataPackageUsageResult.UsageList> getUsageList() {
        if (usageList == null) {
            usageList = new ArrayList<QueryDataPackageUsageResult.UsageList>();
        }
        return this.usageList;
    }

    /**
     * Gets the value of the billCycleOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleOpenDate() {
        return billCycleOpenDate;
    }

    /**
     * Sets the value of the billCycleOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleOpenDate(String value) {
        this.billCycleOpenDate = value;
    }

    /**
     * Gets the value of the billCycleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleEndDate() {
        return billCycleEndDate;
    }

    /**
     * Sets the value of the billCycleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleEndDate(String value) {
        this.billCycleEndDate = value;
    }

    /**
     * Gets the value of the billCycleID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillCycleID() {
        return billCycleID;
    }

    /**
     * Sets the value of the billCycleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillCycleID(BigInteger value) {
        this.billCycleID = value;
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
     *         &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="CurrentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="UsedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TodayUsedAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
        "freeUnitType",
        "initialAmount",
        "currentAmount",
        "usedAmount",
        "measureUnit",
        "todayUsedAmount"
    })
    public static class UsageList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "FreeUnitType", required = true)
        protected String freeUnitType;
        @XmlElement(name = "InitialAmount")
        protected long initialAmount;
        @XmlElement(name = "CurrentAmount")
        protected long currentAmount;
        @XmlElement(name = "UsedAmount")
        protected long usedAmount;
        @XmlElement(name = "MeasureUnit", required = true)
        protected BigInteger measureUnit;
        @XmlElement(name = "TodayUsedAmount")
        protected Long todayUsedAmount;

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
         * Gets the value of the currentAmount property.
         * 
         */
        public long getCurrentAmount() {
            return currentAmount;
        }

        /**
         * Sets the value of the currentAmount property.
         * 
         */
        public void setCurrentAmount(long value) {
            this.currentAmount = value;
        }

        /**
         * Gets the value of the usedAmount property.
         * 
         */
        public long getUsedAmount() {
            return usedAmount;
        }

        /**
         * Sets the value of the usedAmount property.
         * 
         */
        public void setUsedAmount(long value) {
            this.usedAmount = value;
        }

        /**
         * Gets the value of the measureUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeasureUnit() {
            return measureUnit;
        }

        /**
         * Sets the value of the measureUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeasureUnit(BigInteger value) {
            this.measureUnit = value;
        }

        /**
         * Gets the value of the todayUsedAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTodayUsedAmount() {
            return todayUsedAmount;
        }

        /**
         * Sets the value of the todayUsedAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTodayUsedAmount(Long value) {
            this.todayUsedAmount = value;
        }

    }

}
