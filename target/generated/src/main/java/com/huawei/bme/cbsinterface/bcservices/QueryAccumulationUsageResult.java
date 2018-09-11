
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
 * <p>Java class for QueryAccumulationUsageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAccumulationUsageResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccmUsageList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AccmType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AccmTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                     &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="BeginDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="EndDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
@XmlType(name = "QueryAccumulationUsageResult", propOrder = {
    "accmUsageList"
})
public class QueryAccumulationUsageResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "AccmUsageList")
    protected List<QueryAccumulationUsageResult.AccmUsageList> accmUsageList;

    /**
     * Gets the value of the accmUsageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accmUsageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccmUsageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryAccumulationUsageResult.AccmUsageList }
     * 
     * 
     */
    public List<QueryAccumulationUsageResult.AccmUsageList> getAccmUsageList() {
        if (accmUsageList == null) {
            accmUsageList = new ArrayList<QueryAccumulationUsageResult.AccmUsageList>();
        }
        return this.accmUsageList;
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
     *         &lt;element name="AccmType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AccmTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *           &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="BeginDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *         &lt;element name="EndDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "accmType",
        "accmTypeName",
        "amount",
        "unitType",
        "currencyID",
        "measureID",
        "beginDate",
        "endDate"
    })
    public static class AccmUsageList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AccmType", required = true)
        protected String accmType;
        @XmlElement(name = "AccmTypeName", required = true)
        protected String accmTypeName;
        @XmlElement(name = "Amount")
        protected long amount;
        @XmlElement(name = "UnitType", required = true)
        protected String unitType;
        @XmlElement(name = "CurrencyID")
        protected BigInteger currencyID;
        @XmlElement(name = "MeasureID")
        protected BigInteger measureID;
        @XmlElement(name = "BeginDate", required = true)
        protected String beginDate;
        @XmlElement(name = "EndDate", required = true)
        protected String endDate;

        /**
         * Gets the value of the accmType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccmType() {
            return accmType;
        }

        /**
         * Sets the value of the accmType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccmType(String value) {
            this.accmType = value;
        }

        /**
         * Gets the value of the accmTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccmTypeName() {
            return accmTypeName;
        }

        /**
         * Sets the value of the accmTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccmTypeName(String value) {
            this.accmTypeName = value;
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
         * Gets the value of the unitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitType() {
            return unitType;
        }

        /**
         * Sets the value of the unitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitType(String value) {
            this.unitType = value;
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
         * Gets the value of the measureID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeasureID() {
            return measureID;
        }

        /**
         * Sets the value of the measureID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeasureID(BigInteger value) {
            this.measureID = value;
        }

        /**
         * Gets the value of the beginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeginDate() {
            return beginDate;
        }

        /**
         * Sets the value of the beginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeginDate(String value) {
            this.beginDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

    }

}
