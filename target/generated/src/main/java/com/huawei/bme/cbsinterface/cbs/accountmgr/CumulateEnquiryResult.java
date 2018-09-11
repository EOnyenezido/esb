
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CumulateEnquiryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CumulateEnquiryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CumulativeItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "CumulateEnquiryResult", propOrder = {
    "cumulativeItem"
})
public class CumulateEnquiryResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "CumulativeItem")
    protected List<CumulateEnquiryResult.CumulativeItem> cumulativeItem;

    /**
     * Gets the value of the cumulativeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CumulateEnquiryResult.CumulativeItem }
     * 
     * 
     */
    public List<CumulateEnquiryResult.CumulativeItem> getCumulativeItem() {
        if (cumulativeItem == null) {
            cumulativeItem = new ArrayList<CumulateEnquiryResult.CumulativeItem>();
        }
        return this.cumulativeItem;
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
     *         &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    public static class CumulativeItem
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElement(name = "CumulateID")
        protected int cumulateID;
        @XmlElement(name = "CumulateBeginTime", required = true)
        protected String cumulateBeginTime;
        @XmlElement(name = "CumulateEndTime", required = true)
        protected String cumulateEndTime;
        @XmlElement(name = "CumulativeAmt")
        protected int cumulativeAmt;

        /**
         * Gets the value of the cumulateID property.
         * 
         */
        public int getCumulateID() {
            return cumulateID;
        }

        /**
         * Sets the value of the cumulateID property.
         * 
         */
        public void setCumulateID(int value) {
            this.cumulateID = value;
        }

        /**
         * Gets the value of the cumulateBeginTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCumulateBeginTime() {
            return cumulateBeginTime;
        }

        /**
         * Sets the value of the cumulateBeginTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCumulateBeginTime(String value) {
            this.cumulateBeginTime = value;
        }

        /**
         * Gets the value of the cumulateEndTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCumulateEndTime() {
            return cumulateEndTime;
        }

        /**
         * Sets the value of the cumulateEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCumulateEndTime(String value) {
            this.cumulateEndTime = value;
        }

        /**
         * Gets the value of the cumulativeAmt property.
         * 
         */
        public int getCumulativeAmt() {
            return cumulativeAmt;
        }

        /**
         * Sets the value of the cumulativeAmt property.
         * 
         */
        public void setCumulativeAmt(int value) {
            this.cumulativeAmt = value;
        }

    }

}
