
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;


/**
 * \u6279\u91cf\u6fc0\u6d3b\u4e00\u6279\u53f7\u6bb5\u53f7\u7801
 * 
 * <p>Java class for BatchSubActivationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchSubActivationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubBasicInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SubProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfferingInst" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ActiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSubActivationRequest", propOrder = {
    "subBasicInfo",
    "offeringInst",
    "fileName"
})
public class BatchSubActivationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubBasicInfo")
    protected BatchSubActivationRequest.SubBasicInfo subBasicInfo;
    @XmlElement(name = "OfferingInst")
    protected List<BatchSubActivationRequest.OfferingInst> offeringInst;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BatchSubActivationRequest.SubBasicInfo }
     *     
     */
    public BatchSubActivationRequest.SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchSubActivationRequest.SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(BatchSubActivationRequest.SubBasicInfo value) {
        this.subBasicInfo = value;
    }

    /**
     * Gets the value of the offeringInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offeringInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchSubActivationRequest.OfferingInst }
     * 
     * 
     */
    public List<BatchSubActivationRequest.OfferingInst> getOfferingInst() {
        if (offeringInst == null) {
            offeringInst = new ArrayList<BatchSubActivationRequest.OfferingInst>();
        }
        return this.offeringInst;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     *         &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ActiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "offeringID",
        "ownerType",
        "activeTime",
        "activeTimeLimit",
        "trialStartTime",
        "trialEndTime",
        "expirationTime"
    })
    public static class OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingID", required = true, nillable = true)
        protected BigInteger offeringID;
        @XmlElement(name = "OwnerType")
        protected String ownerType;
        @XmlElement(name = "ActiveTime")
        protected String activeTime;
        @XmlElement(name = "ActiveTimeLimit")
        protected String activeTimeLimit;
        @XmlElement(name = "TrialStartTime")
        protected String trialStartTime;
        @XmlElement(name = "TrialEndTime")
        protected String trialEndTime;
        @XmlElement(name = "ExpirationTime")
        protected String expirationTime;

        /**
         * Gets the value of the offeringID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOfferingID() {
            return offeringID;
        }

        /**
         * Sets the value of the offeringID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOfferingID(BigInteger value) {
            this.offeringID = value;
        }

        /**
         * Gets the value of the ownerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerType() {
            return ownerType;
        }

        /**
         * Sets the value of the ownerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerType(String value) {
            this.ownerType = value;
        }

        /**
         * Gets the value of the activeTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActiveTime() {
            return activeTime;
        }

        /**
         * Sets the value of the activeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActiveTime(String value) {
            this.activeTime = value;
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
     *         &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "subPassword",
        "subProperty"
    })
    public static class SubBasicInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "WrittenLang")
        protected String writtenLang;
        @XmlElement(name = "IVRLang")
        protected String ivrLang;
        @XmlElement(name = "SubPassword")
        protected String subPassword;
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
