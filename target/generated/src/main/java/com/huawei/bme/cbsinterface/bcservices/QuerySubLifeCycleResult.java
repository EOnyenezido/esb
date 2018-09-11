
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
 * <p>Java class for QuerySubLifeCycleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubLifeCycleResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentStatusIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatus" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="StatusExpireTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RBlacklistStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FraudTimes" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubLifeCycleResult", propOrder = {
    "currentStatusIndex",
    "lifeCycleStatus",
    "rBlacklistStatus",
    "fraudTimes"
})
public class QuerySubLifeCycleResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CurrentStatusIndex")
    protected String currentStatusIndex;
    @XmlElement(name = "LifeCycleStatus")
    protected List<QuerySubLifeCycleResult.LifeCycleStatus> lifeCycleStatus;
    @XmlElement(name = "RBlacklistStatus", required = true)
    protected String rBlacklistStatus;
    @XmlElement(name = "FraudTimes", required = true)
    protected BigInteger fraudTimes;

    /**
     * Gets the value of the currentStatusIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatusIndex() {
        return currentStatusIndex;
    }

    /**
     * Sets the value of the currentStatusIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatusIndex(String value) {
        this.currentStatusIndex = value;
    }

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubLifeCycleResult.LifeCycleStatus }
     * 
     * 
     */
    public List<QuerySubLifeCycleResult.LifeCycleStatus> getLifeCycleStatus() {
        if (lifeCycleStatus == null) {
            lifeCycleStatus = new ArrayList<QuerySubLifeCycleResult.LifeCycleStatus>();
        }
        return this.lifeCycleStatus;
    }

    /**
     * Gets the value of the rBlacklistStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBlacklistStatus() {
        return rBlacklistStatus;
    }

    /**
     * Sets the value of the rBlacklistStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBlacklistStatus(String value) {
        this.rBlacklistStatus = value;
    }

    /**
     * Gets the value of the fraudTimes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFraudTimes() {
        return fraudTimes;
    }

    /**
     * Sets the value of the fraudTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFraudTimes(BigInteger value) {
        this.fraudTimes = value;
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
     *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="StatusExpireTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *         &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "statusName",
        "statusExpireTime",
        "statusIndex"
    })
    public static class LifeCycleStatus
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "StatusName", required = true)
        protected String statusName;
        @XmlElement(name = "StatusExpireTime", required = true)
        protected String statusExpireTime;
        @XmlElement(name = "StatusIndex", required = true)
        protected String statusIndex;

        /**
         * Gets the value of the statusName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusName() {
            return statusName;
        }

        /**
         * Sets the value of the statusName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusName(String value) {
            this.statusName = value;
        }

        /**
         * Gets the value of the statusExpireTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusExpireTime() {
            return statusExpireTime;
        }

        /**
         * Sets the value of the statusExpireTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusExpireTime(String value) {
            this.statusExpireTime = value;
        }

        /**
         * Gets the value of the statusIndex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusIndex() {
            return statusIndex;
        }

        /**
         * Sets the value of the statusIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusIndex(String value) {
            this.statusIndex = value;
        }

    }

}
