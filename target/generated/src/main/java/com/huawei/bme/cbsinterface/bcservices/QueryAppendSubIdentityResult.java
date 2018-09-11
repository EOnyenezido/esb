
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAppendSubIdentityResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAppendSubIdentityResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubIdentityList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "QueryAppendSubIdentityResult", propOrder = {
    "subIdentityList"
})
public class QueryAppendSubIdentityResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubIdentityList")
    protected List<QueryAppendSubIdentityResult.SubIdentityList> subIdentityList;

    /**
     * Gets the value of the subIdentityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subIdentityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubIdentityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryAppendSubIdentityResult.SubIdentityList }
     * 
     * 
     */
    public List<QueryAppendSubIdentityResult.SubIdentityList> getSubIdentityList() {
        if (subIdentityList == null) {
            subIdentityList = new ArrayList<QueryAppendSubIdentityResult.SubIdentityList>();
        }
        return this.subIdentityList;
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
     *         &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "subIdentity",
        "imsi",
        "subIdentityType"
    })
    public static class SubIdentityList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubIdentity", required = true)
        protected String subIdentity;
        @XmlElement(name = "IMSI")
        protected String imsi;
        @XmlElement(name = "SubIdentityType")
        protected Integer subIdentityType;

        /**
         * Gets the value of the subIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubIdentity() {
            return subIdentity;
        }

        /**
         * Sets the value of the subIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubIdentity(String value) {
            this.subIdentity = value;
        }

        /**
         * Gets the value of the imsi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMSI() {
            return imsi;
        }

        /**
         * Sets the value of the imsi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMSI(String value) {
            this.imsi = value;
        }

        /**
         * Gets the value of the subIdentityType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSubIdentityType() {
            return subIdentityType;
        }

        /**
         * Sets the value of the subIdentityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSubIdentityType(Integer value) {
            this.subIdentityType = value;
        }

    }

}
