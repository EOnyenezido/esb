
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
 * <p>Java class for QueryExpireSubToMicroResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpireSubToMicroResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpireSubscriber" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ServiceNum"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ExpireTime"&gt;
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
 *         &lt;element name="PagingInfo" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpireSubToMicroResult", propOrder = {
    "expireSubscriber",
    "pagingInfo"
})
public class QueryExpireSubToMicroResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ExpireSubscriber")
    protected List<QueryExpireSubToMicroResult.ExpireSubscriber> expireSubscriber;
    @XmlElement(name = "PagingInfo")
    protected QueryExpireSubToMicroResult.PagingInfo pagingInfo;

    /**
     * Gets the value of the expireSubscriber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expireSubscriber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpireSubscriber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryExpireSubToMicroResult.ExpireSubscriber }
     * 
     * 
     */
    public List<QueryExpireSubToMicroResult.ExpireSubscriber> getExpireSubscriber() {
        if (expireSubscriber == null) {
            expireSubscriber = new ArrayList<QueryExpireSubToMicroResult.ExpireSubscriber>();
        }
        return this.expireSubscriber;
    }

    /**
     * Gets the value of the pagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpireSubToMicroResult.PagingInfo }
     *     
     */
    public QueryExpireSubToMicroResult.PagingInfo getPagingInfo() {
        return pagingInfo;
    }

    /**
     * Sets the value of the pagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpireSubToMicroResult.PagingInfo }
     *     
     */
    public void setPagingInfo(QueryExpireSubToMicroResult.PagingInfo value) {
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
     *         &lt;element name="ServiceNum"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ExpireTime"&gt;
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
    public static class ExpireSubscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ServiceNum", required = true, nillable = true)
        protected String serviceNum;
        @XmlElement(name = "ExpireTime", required = true)
        protected String expireTime;

        /**
         * Gets the value of the serviceNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceNum() {
            return serviceNum;
        }

        /**
         * Sets the value of the serviceNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceNum(String value) {
            this.serviceNum = value;
        }

        /**
         * Gets the value of the expireTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireTime() {
            return expireTime;
        }

        /**
         * Sets the value of the expireTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireTime(String value) {
            this.expireTime = value;
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

}
