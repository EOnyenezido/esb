
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryGroupOffNetNumberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryGroupOffNetNumberResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupOffNetNumber" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OffNetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetNumberGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetShortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
@XmlType(name = "QueryGroupOffNetNumberResult", propOrder = {
    "groupOffNetNumber"
})
public class QueryGroupOffNetNumberResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "GroupOffNetNumber")
    protected List<QueryGroupOffNetNumberResult.GroupOffNetNumber> groupOffNetNumber;

    /**
     * Gets the value of the groupOffNetNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOffNetNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOffNetNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryGroupOffNetNumberResult.GroupOffNetNumber }
     * 
     * 
     */
    public List<QueryGroupOffNetNumberResult.GroupOffNetNumber> getGroupOffNetNumber() {
        if (groupOffNetNumber == null) {
            groupOffNetNumber = new ArrayList<QueryGroupOffNetNumberResult.GroupOffNetNumber>();
        }
        return this.groupOffNetNumber;
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
     *         &lt;element name="OffNetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OffNetNumberGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OffNetShortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "offNetNumber",
        "offNetNumberGroupID",
        "offNetShortNumber",
        "effectiveTime",
        "expirationTime"
    })
    public static class GroupOffNetNumber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OffNetNumber", required = true)
        protected String offNetNumber;
        @XmlElement(name = "OffNetNumberGroupID", required = true)
        protected String offNetNumberGroupID;
        @XmlElement(name = "OffNetShortNumber")
        protected String offNetShortNumber;
        @XmlElement(name = "EffectiveTime", required = true)
        protected String effectiveTime;
        @XmlElement(name = "ExpirationTime", required = true)
        protected String expirationTime;

        /**
         * Gets the value of the offNetNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffNetNumber() {
            return offNetNumber;
        }

        /**
         * Sets the value of the offNetNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffNetNumber(String value) {
            this.offNetNumber = value;
        }

        /**
         * Gets the value of the offNetNumberGroupID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffNetNumberGroupID() {
            return offNetNumberGroupID;
        }

        /**
         * Sets the value of the offNetNumberGroupID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffNetNumberGroupID(String value) {
            this.offNetNumberGroupID = value;
        }

        /**
         * Gets the value of the offNetShortNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffNetShortNumber() {
            return offNetShortNumber;
        }

        /**
         * Sets the value of the offNetShortNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffNetShortNumber(String value) {
            this.offNetShortNumber = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
        }

        /**
         * Gets the value of the expirationTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationTime() {
            return expirationTime;
        }

        /**
         * Sets the value of the expirationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationTime(String value) {
            this.expirationTime = value;
        }

    }

}
