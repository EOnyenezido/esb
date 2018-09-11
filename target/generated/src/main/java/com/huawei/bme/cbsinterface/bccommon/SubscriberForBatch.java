
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberForBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberForBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubBasicInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DunningFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SubProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberForBatch", propOrder = {
    "subBasicInfo",
    "brand",
    "networkType",
    "status",
    "paymentMode",
    "subPassword",
    "activeTimeLimit",
    "primaryIdentityType"
})
public class SubscriberForBatch
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "SubBasicInfo")
    protected SubscriberForBatch.SubBasicInfo subBasicInfo;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "NetworkType")
    protected String networkType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "PaymentMode", required = true, nillable = true)
    protected String paymentMode;
    @XmlElement(name = "SubPassword")
    protected String subPassword;
    @XmlElement(name = "ActiveTimeLimit")
    protected String activeTimeLimit;
    @XmlElement(name = "PrimaryIdentityType")
    protected String primaryIdentityType;

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberForBatch.SubBasicInfo }
     *     
     */
    public SubscriberForBatch.SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberForBatch.SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(SubscriberForBatch.SubBasicInfo value) {
        this.subBasicInfo = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the subPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPassword() {
        return subPassword;
    }

    /**
     * Sets the value of the subPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPassword(String value) {
        this.subPassword = value;
    }

    /**
     * Gets the value of the activeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveTimeLimit() {
        return activeTimeLimit;
    }

    /**
     * Sets the value of the activeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveTimeLimit(String value) {
        this.activeTimeLimit = value;
    }

    /**
     * Gets the value of the primaryIdentityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentityType() {
        return primaryIdentityType;
    }

    /**
     * Sets the value of the primaryIdentityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentityType(String value) {
        this.primaryIdentityType = value;
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
     *         &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DunningFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SubProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "writtenLang",
        "ivrLang",
        "subLevel",
        "dunningFlag",
        "subProperty"
    })
    public static class SubBasicInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "WrittenLang", required = true)
        protected String writtenLang;
        @XmlElement(name = "IVRLang", required = true)
        protected String ivrLang;
        @XmlElement(name = "SubLevel")
        protected String subLevel;
        @XmlElement(name = "DunningFlag")
        protected String dunningFlag;
        @XmlElement(name = "SubProperty")
        protected List<SimpleProperty> subProperty;

        /**
         * Gets the value of the writtenLang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWrittenLang() {
            return writtenLang;
        }

        /**
         * Sets the value of the writtenLang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWrittenLang(String value) {
            this.writtenLang = value;
        }

        /**
         * Gets the value of the ivrLang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIVRLang() {
            return ivrLang;
        }

        /**
         * Sets the value of the ivrLang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIVRLang(String value) {
            this.ivrLang = value;
        }

        /**
         * Gets the value of the subLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubLevel() {
            return subLevel;
        }

        /**
         * Sets the value of the subLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubLevel(String value) {
            this.subLevel = value;
        }

        /**
         * Gets the value of the dunningFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDunningFlag() {
            return dunningFlag;
        }

        /**
         * Sets the value of the dunningFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDunningFlag(String value) {
            this.dunningFlag = value;
        }

        /**
         * Gets the value of the subProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getSubProperty() {
            if (subProperty == null) {
                subProperty = new ArrayList<SimpleProperty>();
            }
            return this.subProperty;
        }

    }

}
