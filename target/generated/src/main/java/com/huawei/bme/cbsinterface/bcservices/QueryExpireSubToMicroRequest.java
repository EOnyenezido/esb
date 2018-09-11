
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryExpireSubToMicroRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpireSubToMicroRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TimePeriod"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="StartTime"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EndTime"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PagingInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="TotalRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="BeginRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="FetchRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpireSubToMicroRequest", propOrder = {

})
public class QueryExpireSubToMicroRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "TimePeriod", required = true)
    protected QueryExpireSubToMicroRequest.TimePeriod timePeriod;
    @XmlElement(name = "PagingInfo", required = true)
    protected QueryExpireSubToMicroRequest.PagingInfo pagingInfo;

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpireSubToMicroRequest.TimePeriod }
     *     
     */
    public QueryExpireSubToMicroRequest.TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpireSubToMicroRequest.TimePeriod }
     *     
     */
    public void setTimePeriod(QueryExpireSubToMicroRequest.TimePeriod value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the pagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpireSubToMicroRequest.PagingInfo }
     *     
     */
    public QueryExpireSubToMicroRequest.PagingInfo getPagingInfo() {
        return pagingInfo;
    }

    /**
     * Sets the value of the pagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpireSubToMicroRequest.PagingInfo }
     *     
     */
    public void setPagingInfo(QueryExpireSubToMicroRequest.PagingInfo value) {
        this.pagingInfo = value;
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
     *         &lt;element name="TotalRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="BeginRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="FetchRowNum" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    public static class PagingInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "TotalRowNum", required = true)
        protected BigInteger totalRowNum;
        @XmlElement(name = "BeginRowNum", required = true)
        protected BigInteger beginRowNum;
        @XmlElement(name = "FetchRowNum", required = true)
        protected BigInteger fetchRowNum;

        /**
         * Gets the value of the totalRowNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalRowNum() {
            return totalRowNum;
        }

        /**
         * Sets the value of the totalRowNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalRowNum(BigInteger value) {
            this.totalRowNum = value;
        }

        /**
         * Gets the value of the beginRowNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBeginRowNum() {
            return beginRowNum;
        }

        /**
         * Sets the value of the beginRowNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBeginRowNum(BigInteger value) {
            this.beginRowNum = value;
        }

        /**
         * Gets the value of the fetchRowNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFetchRowNum() {
            return fetchRowNum;
        }

        /**
         * Sets the value of the fetchRowNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFetchRowNum(BigInteger value) {
            this.fetchRowNum = value;
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
     *         &lt;element name="StartTime"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EndTime"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
    public static class TimePeriod
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "StartTime", required = true)
        protected String startTime;
        @XmlElement(name = "EndTime", required = true)
        protected String endTime;

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartTime(String value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the endTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndTime() {
            return endTime;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndTime(String value) {
            this.endTime = value;
        }

    }

}
