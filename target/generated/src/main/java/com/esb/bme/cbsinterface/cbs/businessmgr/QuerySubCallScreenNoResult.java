
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubCallScreenNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubCallScreenNoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallScreenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallScreenNoInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="callScreenNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="weekStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="weekStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="routeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NonCallScreenNoInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="weekStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="weekStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="routeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "QuerySubCallScreenNoResult", propOrder = {
    "callScreenType",
    "callScreenNoInfo",
    "nonCallScreenNoInfo"
})
public class QuerySubCallScreenNoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "CallScreenType")
    protected String callScreenType;
    @XmlElement(name = "CallScreenNoInfo")
    protected List<QuerySubCallScreenNoResult.CallScreenNoInfo> callScreenNoInfo;
    @XmlElement(name = "NonCallScreenNoInfo")
    protected List<QuerySubCallScreenNoResult.NonCallScreenNoInfo> nonCallScreenNoInfo;

    /**
     * Gets the value of the callScreenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallScreenType() {
        return callScreenType;
    }

    /**
     * Sets the value of the callScreenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallScreenType(String value) {
        this.callScreenType = value;
    }

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
     * {@link QuerySubCallScreenNoResult.CallScreenNoInfo }
     * 
     * 
     */
    public List<QuerySubCallScreenNoResult.CallScreenNoInfo> getCallScreenNoInfo() {
        if (callScreenNoInfo == null) {
            callScreenNoInfo = new ArrayList<QuerySubCallScreenNoResult.CallScreenNoInfo>();
        }
        return this.callScreenNoInfo;
    }

    /**
     * Gets the value of the nonCallScreenNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonCallScreenNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonCallScreenNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubCallScreenNoResult.NonCallScreenNoInfo }
     * 
     * 
     */
    public List<QuerySubCallScreenNoResult.NonCallScreenNoInfo> getNonCallScreenNoInfo() {
        if (nonCallScreenNoInfo == null) {
            nonCallScreenNoInfo = new ArrayList<QuerySubCallScreenNoResult.NonCallScreenNoInfo>();
        }
        return this.nonCallScreenNoInfo;
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
     *         &lt;element name="callScreenNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="weekStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="weekStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="routeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    public static class CallScreenNoInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        protected String callScreenNo;
        protected String effectiveDate;
        protected String expireDate;
        @XmlElementRef(name = "weekStart", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> weekStart;
        @XmlElementRef(name = "weekStop", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> weekStop;
        protected String routeNumber;
        @XmlElementRef(name = "IRRouteFlag", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> irRouteFlag;
        @XmlElement(name = "RoutingMethod")
        protected Integer routingMethod;

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
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getWeekStart() {
            return weekStart;
        }

        /**
         * Sets the value of the weekStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setWeekStart(JAXBElement<String> value) {
            this.weekStart = value;
        }

        /**
         * Gets the value of the weekStop property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getWeekStop() {
            return weekStop;
        }

        /**
         * Sets the value of the weekStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setWeekStop(JAXBElement<String> value) {
            this.weekStop = value;
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
         * Gets the value of the irRouteFlag property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getIRRouteFlag() {
            return irRouteFlag;
        }

        /**
         * Sets the value of the irRouteFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setIRRouteFlag(JAXBElement<Integer> value) {
            this.irRouteFlag = value;
        }

        /**
         * Gets the value of the routingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRoutingMethod() {
            return routingMethod;
        }

        /**
         * Sets the value of the routingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRoutingMethod(Integer value) {
            this.routingMethod = value;
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
     *       &lt;all&gt;
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="weekStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="weekStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="routeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    public static class NonCallScreenNoInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        protected String effectiveDate;
        protected String expireDate;
        @XmlElementRef(name = "weekStart", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> weekStart;
        @XmlElementRef(name = "weekStop", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> weekStop;
        protected String routeNumber;
        @XmlElementRef(name = "IRRouteFlag", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> irRouteFlag;
        @XmlElementRef(name = "RoutingMethod", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> routingMethod;

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
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getWeekStart() {
            return weekStart;
        }

        /**
         * Sets the value of the weekStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setWeekStart(JAXBElement<String> value) {
            this.weekStart = value;
        }

        /**
         * Gets the value of the weekStop property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getWeekStop() {
            return weekStop;
        }

        /**
         * Sets the value of the weekStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setWeekStop(JAXBElement<String> value) {
            this.weekStop = value;
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
         * Gets the value of the irRouteFlag property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getIRRouteFlag() {
            return irRouteFlag;
        }

        /**
         * Sets the value of the irRouteFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setIRRouteFlag(JAXBElement<Integer> value) {
            this.irRouteFlag = value;
        }

        /**
         * Gets the value of the routingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getRoutingMethod() {
            return routingMethod;
        }

        /**
         * Sets the value of the routingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setRoutingMethod(JAXBElement<Integer> value) {
            this.routingMethod = value;
        }

    }

}
