
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.ActiveMode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.OfferingExpireMode;
import com.huawei.bme.cbsinterface.bccommon.OfferingInst;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.POfferingInst;


/**
 * <p>Java class for BatchChangeSubOfferingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchChangeSubOfferingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryOffering" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                   &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
 *                   &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplementaryOffering" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                             &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "BatchChangeSubOfferingRequest", propOrder = {
    "primaryOffering",
    "supplementaryOffering",
    "fileName"
})
public class BatchChangeSubOfferingRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "PrimaryOffering")
    protected BatchChangeSubOfferingRequest.PrimaryOffering primaryOffering;
    @XmlElement(name = "SupplementaryOffering")
    protected BatchChangeSubOfferingRequest.SupplementaryOffering supplementaryOffering;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;

    /**
     * Gets the value of the primaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link BatchChangeSubOfferingRequest.PrimaryOffering }
     *     
     */
    public BatchChangeSubOfferingRequest.PrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }

    /**
     * Sets the value of the primaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchChangeSubOfferingRequest.PrimaryOffering }
     *     
     */
    public void setPrimaryOffering(BatchChangeSubOfferingRequest.PrimaryOffering value) {
        this.primaryOffering = value;
    }

    /**
     * Gets the value of the supplementaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link BatchChangeSubOfferingRequest.SupplementaryOffering }
     *     
     */
    public BatchChangeSubOfferingRequest.SupplementaryOffering getSupplementaryOffering() {
        return supplementaryOffering;
    }

    /**
     * Sets the value of the supplementaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchChangeSubOfferingRequest.SupplementaryOffering }
     *     
     */
    public void setSupplementaryOffering(BatchChangeSubOfferingRequest.SupplementaryOffering value) {
        this.supplementaryOffering = value;
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
     *         &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *         &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
     *         &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
        "oldPrimaryOffering",
        "newPrimaryOffering",
        "newBrand",
        "effectiveTime"
    })
    public static class PrimaryOffering
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OldPrimaryOffering")
        protected OfferingKey oldPrimaryOffering;
        @XmlElement(name = "NewPrimaryOffering", required = true)
        protected POfferingInst newPrimaryOffering;
        @XmlElement(name = "NewBrand")
        protected String newBrand;
        @XmlElement(name = "EffectiveTime", required = true)
        protected EffectMode effectiveTime;

        /**
         * Gets the value of the oldPrimaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link OfferingKey }
         *     
         */
        public OfferingKey getOldPrimaryOffering() {
            return oldPrimaryOffering;
        }

        /**
         * Sets the value of the oldPrimaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferingKey }
         *     
         */
        public void setOldPrimaryOffering(OfferingKey value) {
            this.oldPrimaryOffering = value;
        }

        /**
         * Gets the value of the newPrimaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link POfferingInst }
         *     
         */
        public POfferingInst getNewPrimaryOffering() {
            return newPrimaryOffering;
        }

        /**
         * Sets the value of the newPrimaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link POfferingInst }
         *     
         */
        public void setNewPrimaryOffering(POfferingInst value) {
            this.newPrimaryOffering = value;
        }

        /**
         * Gets the value of the newBrand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewBrand() {
            return newBrand;
        }

        /**
         * Sets the value of the newBrand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewBrand(String value) {
            this.newBrand = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link EffectMode }
         *     
         */
        public EffectMode getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link EffectMode }
         *     
         */
        public void setEffectiveTime(EffectMode value) {
            this.effectiveTime = value;
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
     *         &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *                   &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "addOffering",
        "delOffering",
        "modifyOffering"
    })
    public static class SupplementaryOffering
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AddOffering")
        protected List<BatchChangeSubOfferingRequest.SupplementaryOffering.AddOffering> addOffering;
        @XmlElement(name = "DelOffering")
        protected List<BatchChangeSubOfferingRequest.SupplementaryOffering.DelOffering> delOffering;
        @XmlElement(name = "ModifyOffering")
        protected List<BatchChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering> modifyOffering;

        /**
         * Gets the value of the addOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchChangeSubOfferingRequest.SupplementaryOffering.AddOffering }
         * 
         * 
         */
        public List<BatchChangeSubOfferingRequest.SupplementaryOffering.AddOffering> getAddOffering() {
            if (addOffering == null) {
                addOffering = new ArrayList<BatchChangeSubOfferingRequest.SupplementaryOffering.AddOffering>();
            }
            return this.addOffering;
        }

        /**
         * Gets the value of the delOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchChangeSubOfferingRequest.SupplementaryOffering.DelOffering }
         * 
         * 
         */
        public List<BatchChangeSubOfferingRequest.SupplementaryOffering.DelOffering> getDelOffering() {
            if (delOffering == null) {
                delOffering = new ArrayList<BatchChangeSubOfferingRequest.SupplementaryOffering.DelOffering>();
            }
            return this.delOffering;
        }

        /**
         * Gets the value of the modifyOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering }
         * 
         * 
         */
        public List<BatchChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering> getModifyOffering() {
            if (modifyOffering == null) {
                modifyOffering = new ArrayList<BatchChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering>();
            }
            return this.modifyOffering;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
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
            "expirationTime",
            "activationTime"
        })
        public static class AddOffering
            extends OfferingInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "EffectiveTime", required = true)
            protected EffectMode effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationTime")
            protected ActiveMode activationTime;

            /**
             * Gets the value of the effectiveTime property.
             * 
             * @return
             *     possible object is
             *     {@link EffectMode }
             *     
             */
            public EffectMode getEffectiveTime() {
                return effectiveTime;
            }

            /**
             * Sets the value of the effectiveTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link EffectMode }
             *     
             */
            public void setEffectiveTime(EffectMode value) {
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

            /**
             * Gets the value of the activationTime property.
             * 
             * @return
             *     possible object is
             *     {@link ActiveMode }
             *     
             */
            public ActiveMode getActivationTime() {
                return activationTime;
            }

            /**
             * Sets the value of the activationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActiveMode }
             *     
             */
            public void setActivationTime(ActiveMode value) {
                this.activationTime = value;
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
         *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
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
            "offeringKey"
        })
        public static class DelOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OfferingKey", required = true)
            protected OfferingKey offeringKey;

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
         *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
         *         &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/&gt;
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
            "newEffectiveTime",
            "newExpirationTime"
        })
        public static class ModifyOffering
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OfferingKey", required = true)
            protected OfferingKey offeringKey;
            @XmlElement(name = "NewEffectiveTime")
            protected String newEffectiveTime;
            @XmlElement(name = "NewExpirationTime")
            protected OfferingExpireMode newExpirationTime;

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
             * Gets the value of the newEffectiveTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewEffectiveTime() {
                return newEffectiveTime;
            }

            /**
             * Sets the value of the newEffectiveTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewEffectiveTime(String value) {
                this.newEffectiveTime = value;
            }

            /**
             * Gets the value of the newExpirationTime property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingExpireMode }
             *     
             */
            public OfferingExpireMode getNewExpirationTime() {
                return newExpirationTime;
            }

            /**
             * Sets the value of the newExpirationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingExpireMode }
             *     
             */
            public void setNewExpirationTime(OfferingExpireMode value) {
                this.newExpirationTime = value;
            }

        }

    }

}
