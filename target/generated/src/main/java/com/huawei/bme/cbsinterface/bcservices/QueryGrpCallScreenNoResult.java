
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
 * <p>Java class for QueryGrpCallScreenNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryGrpCallScreenNoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallScreenNoInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CallScreenNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ScreenNoType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ExpireDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="WeekStart" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="WeekStop" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="TimeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TimeStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RouteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "QueryGrpCallScreenNoResult", propOrder = {
    "callScreenNoInfo"
})
public class QueryGrpCallScreenNoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CallScreenNoInfo")
    protected List<QueryGrpCallScreenNoResult.CallScreenNoInfo> callScreenNoInfo;

    /**
     * Gets the value of the callScreenNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callScreenNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallScreenNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryGrpCallScreenNoResult.CallScreenNoInfo }
     * 
     * 
     */
    public List<QueryGrpCallScreenNoResult.CallScreenNoInfo> getCallScreenNoInfo() {
        if (callScreenNoInfo == null) {
            callScreenNoInfo = new ArrayList<QueryGrpCallScreenNoResult.CallScreenNoInfo>();
        }
        return this.callScreenNoInfo;
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
     *         &lt;element name="CallScreenNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ScreenNoType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ExpireDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="WeekStart" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="WeekStop" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="TimeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TimeStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RouteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "callScreenNo",
        "screenNoType",
        "effectiveDate",
        "expireDate",
        "weekStart",
        "weekStop",
        "timeStart",
        "timeStop",
        "routeNumber",
        "routingMethod"
    })
    public static class CallScreenNoInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CallScreenNo", required = true)
        protected String callScreenNo;
        @XmlElement(name = "ScreenNoType")
        protected BigInteger screenNoType;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "WeekStart")
        protected BigInteger weekStart;
        @XmlElement(name = "WeekStop")
        protected BigInteger weekStop;
        @XmlElement(name = "TimeStart")
        protected String timeStart;
        @XmlElement(name = "TimeStop")
        protected String timeStop;
        @XmlElement(name = "RouteNumber")
        protected String routeNumber;
        @XmlElement(name = "RoutingMethod")
        protected BigInteger routingMethod;

        /**
         * Gets the value of the callScreenNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallScreenNo() {
            return callScreenNo;
        }

        /**
         * Sets the value of the callScreenNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallScreenNo(String value) {
            this.callScreenNo = value;
        }

        /**
         * Gets the value of the screenNoType property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getScreenNoType() {
            return screenNoType;
        }

        /**
         * Sets the value of the screenNoType property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setScreenNoType(BigInteger value) {
            this.screenNoType = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the weekStart property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWeekStart() {
            return weekStart;
        }

        /**
         * Sets the value of the weekStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWeekStart(BigInteger value) {
            this.weekStart = value;
        }

        /**
         * Gets the value of the weekStop property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWeekStop() {
            return weekStop;
        }

        /**
         * Sets the value of the weekStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWeekStop(BigInteger value) {
            this.weekStop = value;
        }

        /**
         * Gets the value of the timeStart property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeStart() {
            return timeStart;
        }

        /**
         * Sets the value of the timeStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeStart(String value) {
            this.timeStart = value;
        }

        /**
         * Gets the value of the timeStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeStop() {
            return timeStop;
        }

        /**
         * Sets the value of the timeStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeStop(String value) {
            this.timeStop = value;
        }

        /**
         * Gets the value of the routeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteNumber() {
            return routeNumber;
        }

        /**
         * Sets the value of the routeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteNumber(String value) {
            this.routeNumber = value;
        }

        /**
         * Gets the value of the routingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRoutingMethod() {
            return routingMethod;
        }

        /**
         * Sets the value of the routingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRoutingMethod(BigInteger value) {
            this.routingMethod = value;
        }

    }

}
