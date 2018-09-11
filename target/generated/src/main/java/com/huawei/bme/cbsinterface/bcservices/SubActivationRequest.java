
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.OfferingOwner;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for SubActivationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubActivationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
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
 *                   &lt;element name="OfferingKey"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubActivationRequest", propOrder = {
    "subAccessCode",
    "subBasicInfo",
    "offeringInst"
})
public class SubActivationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "SubBasicInfo")
    protected SubActivationRequest.SubBasicInfo subBasicInfo;
    @XmlElement(name = "OfferingInst")
    protected List<SubActivationRequest.OfferingInst> offeringInst;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setSubAccessCode(SubAccessCode value) {
        this.subAccessCode = value;
    }

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubActivationRequest.SubBasicInfo }
     *     
     */
    public SubActivationRequest.SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubActivationRequest.SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(SubActivationRequest.SubBasicInfo value) {
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
     * {@link SubActivationRequest.OfferingInst }
     * 
     * 
     */
    public List<SubActivationRequest.OfferingInst> getOfferingInst() {
        if (offeringInst == null) {
            offeringInst = new ArrayList<SubActivationRequest.OfferingInst>();
        }
        return this.offeringInst;
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
     *         &lt;element name="OfferingKey"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "offeringKey",
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
        @XmlElement(name = "OfferingKey", required = true)
        protected SubActivationRequest.OfferingInst.OfferingKey offeringKey;
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
         * Gets the value of the offeringKey property.
         * 
         * @return
         *     possible object is
         *     {@link SubActivationRequest.OfferingInst.OfferingKey }
         *     
         */
        public SubActivationRequest.OfferingInst.OfferingKey getOfferingKey() {
            return offeringKey;
        }

        /**
         * Sets the value of the offeringKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubActivationRequest.OfferingInst.OfferingKey }
         *     
         */
        public void setOfferingKey(SubActivationRequest.OfferingInst.OfferingKey value) {
            this.offeringKey = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/&gt;
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
            "offeringOwner"
        })
        public static class OfferingKey
            extends com.huawei.bme.cbsinterface.bccommon.OfferingKey
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OfferingOwner")
            protected OfferingOwner offeringOwner;

            /**
             * Gets the value of the offeringOwner property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingOwner }
             *     
             */
            public OfferingOwner getOfferingOwner() {
                return offeringOwner;
            }

            /**
             * Sets the value of the offeringOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingOwner }
             *     
             */
            public void setOfferingOwner(OfferingOwner value) {
                this.offeringOwner = value;
            }

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
