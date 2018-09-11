
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POfferingInst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POfferingInst"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *         &lt;element name="BundledFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProductInst" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ProductInst" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OfferingInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "POfferingInst", propOrder = {
    "offeringKey",
    "bundledFlag",
    "offeringClass",
    "parentOfferingKey",
    "status",
    "trialStartTime",
    "trialEndTime",
    "productInst",
    "offeringInstProperty"
})
public class POfferingInst
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "OfferingKey", required = true, nillable = true)
    protected OfferingKey offeringKey;
    @XmlElement(name = "BundledFlag")
    protected String bundledFlag;
    @XmlElement(name = "OfferingClass")
    protected String offeringClass;
    @XmlElement(name = "ParentOfferingKey")
    protected OfferingKey parentOfferingKey;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TrialStartTime")
    protected String trialStartTime;
    @XmlElement(name = "TrialEndTime")
    protected String trialEndTime;
    @XmlElement(name = "ProductInst")
    protected List<ProductInst> productInst;
    @XmlElement(name = "OfferingInstProperty")
    protected List<POfferingInst.OfferingInstProperty> offeringInstProperty;

    /**
     * Gets the value of the offeringKey property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingKey }
     *     
     */
    public OfferingKey getOfferingKey() {
        return offeringKey;
    }

    /**
     * Sets the value of the offeringKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingKey }
     *     
     */
    public void setOfferingKey(OfferingKey value) {
        this.offeringKey = value;
    }

    /**
     * Gets the value of the bundledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundledFlag() {
        return bundledFlag;
    }

    /**
     * Sets the value of the bundledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundledFlag(String value) {
        this.bundledFlag = value;
    }

    /**
     * Gets the value of the offeringClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingClass() {
        return offeringClass;
    }

    /**
     * Sets the value of the offeringClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingClass(String value) {
        this.offeringClass = value;
    }

    /**
     * Gets the value of the parentOfferingKey property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingKey }
     *     
     */
    public OfferingKey getParentOfferingKey() {
        return parentOfferingKey;
    }

    /**
     * Sets the value of the parentOfferingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingKey }
     *     
     */
    public void setParentOfferingKey(OfferingKey value) {
        this.parentOfferingKey = value;
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
     * Gets the value of the trialStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrialStartTime() {
        return trialStartTime;
    }

    /**
     * Sets the value of the trialStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialStartTime(String value) {
        this.trialStartTime = value;
    }

    /**
     * Gets the value of the trialEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrialEndTime() {
        return trialEndTime;
    }

    /**
     * Sets the value of the trialEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialEndTime(String value) {
        this.trialEndTime = value;
    }

    /**
     * Gets the value of the productInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInst }
     * 
     * 
     */
    public List<ProductInst> getProductInst() {
        if (productInst == null) {
            productInst = new ArrayList<ProductInst>();
        }
        return this.productInst;
    }

    /**
     * Gets the value of the offeringInstProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offeringInstProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingInstProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POfferingInst.OfferingInstProperty }
     * 
     * 
     */
    public List<POfferingInst.OfferingInstProperty> getOfferingInstProperty() {
        if (offeringInstProperty == null) {
            offeringInstProperty = new ArrayList<POfferingInst.OfferingInstProperty>();
        }
        return this.offeringInstProperty;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "effectiveTime",
        "expirationTime"
    })
    public static class OfferingInstProperty
        extends InstProperty
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "EffectiveTime")
        protected String effectiveTime;
        @XmlElement(name = "ExpirationTime")
        protected String expirationTime;

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
