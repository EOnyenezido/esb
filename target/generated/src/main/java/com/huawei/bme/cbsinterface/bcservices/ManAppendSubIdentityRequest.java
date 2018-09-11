
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManAppendSubIdentityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManAppendSubIdentityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AppendSubIdentityList" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="RelatedSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NewSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ManAppendSubIdentityRequest", propOrder = {
    "primaryIdentity",
    "operateType",
    "appendSubIdentityList"
})
public class ManAppendSubIdentityRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "PrimaryIdentity", required = true)
    protected String primaryIdentity;
    @XmlElement(name = "OperateType")
    protected int operateType;
    @XmlElement(name = "AppendSubIdentityList", required = true)
    protected List<ManAppendSubIdentityRequest.AppendSubIdentityList> appendSubIdentityList;

    /**
     * Gets the value of the primaryIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    /**
     * Sets the value of the primaryIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentity(String value) {
        this.primaryIdentity = value;
    }

    /**
     * Gets the value of the operateType property.
     * 
     */
    public int getOperateType() {
        return operateType;
    }

    /**
     * Sets the value of the operateType property.
     * 
     */
    public void setOperateType(int value) {
        this.operateType = value;
    }

    /**
     * Gets the value of the appendSubIdentityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendSubIdentityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendSubIdentityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManAppendSubIdentityRequest.AppendSubIdentityList }
     * 
     * 
     */
    public List<ManAppendSubIdentityRequest.AppendSubIdentityList> getAppendSubIdentityList() {
        if (appendSubIdentityList == null) {
            appendSubIdentityList = new ArrayList<ManAppendSubIdentityRequest.AppendSubIdentityList>();
        }
        return this.appendSubIdentityList;
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
     *         &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="RelatedSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NewSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "subIdentityType",
        "relatedSubIdentity",
        "newSubIdentity"
    })
    public static class AppendSubIdentityList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubIdentity", required = true)
        protected String subIdentity;
        @XmlElement(name = "SubIdentityType")
        protected Integer subIdentityType;
        @XmlElement(name = "RelatedSubIdentity")
        protected String relatedSubIdentity;
        @XmlElement(name = "NewSubIdentity")
        protected String newSubIdentity;

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

        /**
         * Gets the value of the relatedSubIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelatedSubIdentity() {
            return relatedSubIdentity;
        }

        /**
         * Sets the value of the relatedSubIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelatedSubIdentity(String value) {
            this.relatedSubIdentity = value;
        }

        /**
         * Gets the value of the newSubIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewSubIdentity() {
            return newSubIdentity;
        }

        /**
         * Sets the value of the newSubIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewSubIdentity(String value) {
            this.newSubIdentity = value;
        }

    }

}
