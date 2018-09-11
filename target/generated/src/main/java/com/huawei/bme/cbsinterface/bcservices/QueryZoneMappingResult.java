
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryZoneMappingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryZoneMappingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zoneDetail" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="zonetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="zoneType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "QueryZoneMappingResult", propOrder = {
    "zoneDetail"
})
public class QueryZoneMappingResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(required = true)
    protected List<QueryZoneMappingResult.ZoneDetail> zoneDetail;

    /**
     * Gets the value of the zoneDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryZoneMappingResult.ZoneDetail }
     * 
     * 
     */
    public List<QueryZoneMappingResult.ZoneDetail> getZoneDetail() {
        if (zoneDetail == null) {
            zoneDetail = new ArrayList<QueryZoneMappingResult.ZoneDetail>();
        }
        return this.zoneDetail;
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
     *         &lt;element name="zonetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="zoneType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "zonetID",
        "zoneType",
        "zoneName"
    })
    public static class ZoneDetail
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        protected long zonetID;
        @XmlElement(required = true)
        protected String zoneType;
        @XmlElement(required = true)
        protected String zoneName;

        /**
         * Gets the value of the zonetID property.
         * 
         */
        public long getZonetID() {
            return zonetID;
        }

        /**
         * Sets the value of the zonetID property.
         * 
         */
        public void setZonetID(long value) {
            this.zonetID = value;
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

    }

}
