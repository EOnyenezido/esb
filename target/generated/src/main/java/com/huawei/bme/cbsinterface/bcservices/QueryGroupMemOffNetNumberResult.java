
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryGroupMemOffNetNumberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryGroupMemOffNetNumberResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupMemOffNetNumber" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OffNetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetNumberGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "QueryGroupMemOffNetNumberResult", propOrder = {
    "groupMemOffNetNumber"
})
public class QueryGroupMemOffNetNumberResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "GroupMemOffNetNumber")
    protected List<QueryGroupMemOffNetNumberResult.GroupMemOffNetNumber> groupMemOffNetNumber;

    /**
     * Gets the value of the groupMemOffNetNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupMemOffNetNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupMemOffNetNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryGroupMemOffNetNumberResult.GroupMemOffNetNumber }
     * 
     * 
     */
    public List<QueryGroupMemOffNetNumberResult.GroupMemOffNetNumber> getGroupMemOffNetNumber() {
        if (groupMemOffNetNumber == null) {
            groupMemOffNetNumber = new ArrayList<QueryGroupMemOffNetNumberResult.GroupMemOffNetNumber>();
        }
        return this.groupMemOffNetNumber;
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
        "effectiveTime",
        "expirationTime"
    })
    public static class GroupMemOffNetNumber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OffNetNumber", required = true)
        protected String offNetNumber;
        @XmlElement(name = "OffNetNumberGroupID", required = true)
        protected String offNetNumberGroupID;
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
