
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
 * <p>Java class for QueryZoneInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryZoneInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZoneList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ZoneType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "QueryZoneInfoResult", propOrder = {
    "zoneList"
})
public class QueryZoneInfoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ZoneList")
    protected List<QueryZoneInfoResult.ZoneList> zoneList;

    /**
     * Gets the value of the zoneList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryZoneInfoResult.ZoneList }
     * 
     * 
     */
    public List<QueryZoneInfoResult.ZoneList> getZoneList() {
        if (zoneList == null) {
            zoneList = new ArrayList<QueryZoneInfoResult.ZoneList>();
        }
        return this.zoneList;
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
     *         &lt;element name="ZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ZoneType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "zoneID",
        "zoneName",
        "zoneType"
    })
    public static class ZoneList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ZoneID", required = true)
        protected BigInteger zoneID;
        @XmlElement(name = "ZoneName", required = true)
        protected String zoneName;
        @XmlElement(name = "ZoneType", required = true)
        protected String zoneType;

        /**
         * Gets the value of the zoneID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getZoneID() {
            return zoneID;
        }

        /**
         * Sets the value of the zoneID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setZoneID(BigInteger value) {
            this.zoneID = value;
        }

        /**
         * Gets the value of the zoneName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneName() {
            return zoneName;
        }

        /**
         * Sets the value of the zoneName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneName(String value) {
            this.zoneName = value;
        }

        /**
         * Gets the value of the zoneType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneType() {
            return zoneType;
        }

        /**
         * Sets the value of the zoneType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneType(String value) {
            this.zoneType = value;
        }

    }

}
