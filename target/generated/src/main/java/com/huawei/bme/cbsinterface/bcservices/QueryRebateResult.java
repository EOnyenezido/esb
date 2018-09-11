
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
 * <p>Java class for QueryRebateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRebateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rebate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                   &lt;element name="ProcessedCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="SuccessCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LastRebateDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
@XmlType(name = "QueryRebateResult", propOrder = {
    "rebate"
})
public class QueryRebateResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "Rebate")
    protected List<QueryRebateResult.Rebate> rebate;

    /**
     * Gets the value of the rebate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryRebateResult.Rebate }
     * 
     * 
     */
    public List<QueryRebateResult.Rebate> getRebate() {
        if (rebate == null) {
            rebate = new ArrayList<QueryRebateResult.Rebate>();
        }
        return this.rebate;
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
     *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *         &lt;element name="ProcessedCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="SuccessCycleNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LastRebateDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "offeringKey",
        "processedCycleNum",
        "successCycleNum",
        "lastRebateDate"
    })
    public static class Rebate
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingKey", required = true)
        protected OfferingKey offeringKey;
        @XmlElement(name = "ProcessedCycleNum")
        protected BigInteger processedCycleNum;
        @XmlElement(name = "SuccessCycleNum")
        protected BigInteger successCycleNum;
        @XmlElement(name = "LastRebateDate")
        protected String lastRebateDate;

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
         * Gets the value of the processedCycleNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProcessedCycleNum() {
            return processedCycleNum;
        }

        /**
         * Sets the value of the processedCycleNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProcessedCycleNum(BigInteger value) {
            this.processedCycleNum = value;
        }

        /**
         * Gets the value of the successCycleNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSuccessCycleNum() {
            return successCycleNum;
        }

        /**
         * Sets the value of the successCycleNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSuccessCycleNum(BigInteger value) {
            this.successCycleNum = value;
        }

        /**
         * Gets the value of the lastRebateDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRebateDate() {
            return lastRebateDate;
        }

        /**
         * Sets the value of the lastRebateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRebateDate(String value) {
            this.lastRebateDate = value;
        }

    }

}
