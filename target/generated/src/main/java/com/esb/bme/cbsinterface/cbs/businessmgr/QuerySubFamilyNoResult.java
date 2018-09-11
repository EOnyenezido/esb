
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubFamilyNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubFamilyNoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyNoInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FamilyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "QuerySubFamilyNoResult", propOrder = {
    "familyNoInfo"
})
public class QuerySubFamilyNoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "FamilyNoInfo")
    protected List<QuerySubFamilyNoResult.FamilyNoInfo> familyNoInfo;

    /**
     * Gets the value of the familyNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubFamilyNoResult.FamilyNoInfo }
     * 
     * 
     */
    public List<QuerySubFamilyNoResult.FamilyNoInfo> getFamilyNoInfo() {
        if (familyNoInfo == null) {
            familyNoInfo = new ArrayList<QuerySubFamilyNoResult.FamilyNoInfo>();
        }
        return this.familyNoInfo;
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
     *         &lt;element name="FamilyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "familyNo",
        "effectiveDate",
        "expireDate",
        "groupType"
    })
    public static class FamilyNoInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FamilyNo", required = true)
        protected String familyNo;
        @XmlElement(required = true)
        protected String effectiveDate;
        @XmlElement(required = true)
        protected String expireDate;
        @XmlElement(name = "GroupType", required = true, type = Integer.class, nillable = true)
        protected Integer groupType;

        /**
         * Gets the value of the familyNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyNo() {
            return familyNo;
        }

        /**
         * Sets the value of the familyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyNo(String value) {
            this.familyNo = value;
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
         * Gets the value of the groupType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGroupType() {
            return groupType;
        }

        /**
         * Sets the value of the groupType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGroupType(Integer value) {
            this.groupType = value;
        }

    }

}
