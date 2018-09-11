
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.InstProperty;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ChangeOfferingPropertyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOfferingPropertyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingInst" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferingOwner"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                             &lt;element name="AcctAccessCode"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                             &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                   &lt;element name="OfferingInstProperty" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AddProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
 *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DelProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AddProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
 *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DelProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOfferingPropertyRequest", propOrder = {
    "offeringInst"
})
public class ChangeOfferingPropertyRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OfferingInst", required = true)
    protected List<ChangeOfferingPropertyRequest.OfferingInst> offeringInst;

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
     * {@link ChangeOfferingPropertyRequest.OfferingInst }
     * 
     * 
     */
    public List<ChangeOfferingPropertyRequest.OfferingInst> getOfferingInst() {
        if (offeringInst == null) {
            offeringInst = new ArrayList<ChangeOfferingPropertyRequest.OfferingInst>();
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
     *         &lt;element name="OfferingOwner"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *                   &lt;element name="AcctAccessCode"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
     *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *         &lt;element name="OfferingInstProperty" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AddProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
     *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DelProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AddProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
     *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DelProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "offeringOwner",
        "offeringKey",
        "offeringInstProperty",
        "productInst"
    })
    public static class OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingOwner", required = true)
        protected ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner offeringOwner;
        @XmlElement(name = "OfferingKey", required = true)
        protected OfferingKey offeringKey;
        @XmlElement(name = "OfferingInstProperty")
        protected ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty offeringInstProperty;
        @XmlElement(name = "ProductInst")
        protected List<ChangeOfferingPropertyRequest.OfferingInst.ProductInst> productInst;

        /**
         * Gets the value of the offeringOwner property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner }
         *     
         */
        public ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner getOfferingOwner() {
            return offeringOwner;
        }

        /**
         * Sets the value of the offeringOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner }
         *     
         */
        public void setOfferingOwner(ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner value) {
            this.offeringOwner = value;
        }

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
         * Gets the value of the offeringInstProperty property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty }
         *     
         */
        public ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty getOfferingInstProperty() {
            return offeringInstProperty;
        }

        /**
         * Sets the value of the offeringInstProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty }
         *     
         */
        public void setOfferingInstProperty(ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty value) {
            this.offeringInstProperty = value;
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
         * {@link ChangeOfferingPropertyRequest.OfferingInst.ProductInst }
         * 
         * 
         */
        public List<ChangeOfferingPropertyRequest.OfferingInst.ProductInst> getProductInst() {
            if (productInst == null) {
                productInst = new ArrayList<ChangeOfferingPropertyRequest.OfferingInst.ProductInst>();
            }
            return this.productInst;
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
         *         &lt;element name="AddProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
         *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DelProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
        @XmlType(name = "", propOrder = {
            "addProperty",
            "delProperty"
        })
        public static class OfferingInstProperty
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AddProperty")
            protected List<ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty> addProperty;
            @XmlElement(name = "DelProperty")
            protected List<ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty> delProperty;

            /**
             * Gets the value of the addProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty }
             * 
             * 
             */
            public List<ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty> getAddProperty() {
                if (addProperty == null) {
                    addProperty = new ArrayList<ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty>();
                }
                return this.addProperty;
            }

            /**
             * Gets the value of the delProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty }
             * 
             * 
             */
            public List<ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty> getDelProperty() {
                if (delProperty == null) {
                    delProperty = new ArrayList<ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty>();
                }
                return this.delProperty;
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
             *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
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
            public static class AddProperty
                extends InstProperty
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "EffectiveTime")
                protected EffectMode effectiveTime;
                @XmlElement(name = "ExpirationTime")
                protected String expirationTime;

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
             *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
                "expirationTime"
            })
            public static class DelProperty
                extends InstProperty
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "ExpirationTime", required = true)
                protected EffectMode expirationTime;

                /**
                 * Gets the value of the expirationTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EffectMode }
                 *     
                 */
                public EffectMode getExpirationTime() {
                    return expirationTime;
                }

                /**
                 * Sets the value of the expirationTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EffectMode }
                 *     
                 */
                public void setExpirationTime(EffectMode value) {
                    this.expirationTime = value;
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
         *       &lt;choice&gt;
         *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
         *         &lt;element name="AcctAccessCode"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
         *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subAccessCode",
            "acctAccessCode",
            "custAccessCode",
            "subGroupAccessCode"
        })
        public static class OfferingOwner
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "SubAccessCode")
            protected SubAccessCode subAccessCode;
            @XmlElement(name = "AcctAccessCode")
            protected ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode acctAccessCode;
            @XmlElement(name = "CustAccessCode")
            protected CustAccessCode custAccessCode;
            @XmlElement(name = "SubGroupAccessCode")
            protected SubGroupAccessCode subGroupAccessCode;

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
             * Gets the value of the acctAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode }
             *     
             */
            public ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode getAcctAccessCode() {
                return acctAccessCode;
            }

            /**
             * Sets the value of the acctAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode }
             *     
             */
            public void setAcctAccessCode(ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode value) {
                this.acctAccessCode = value;
            }

            /**
             * Gets the value of the custAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link CustAccessCode }
             *     
             */
            public CustAccessCode getCustAccessCode() {
                return custAccessCode;
            }

            /**
             * Sets the value of the custAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustAccessCode }
             *     
             */
            public void setCustAccessCode(CustAccessCode value) {
                this.custAccessCode = value;
            }

            /**
             * Gets the value of the subGroupAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link SubGroupAccessCode }
             *     
             */
            public SubGroupAccessCode getSubGroupAccessCode() {
                return subGroupAccessCode;
            }

            /**
             * Sets the value of the subGroupAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubGroupAccessCode }
             *     
             */
            public void setSubGroupAccessCode(SubGroupAccessCode value) {
                this.subGroupAccessCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "payType"
            })
            public static class AcctAccessCode
                extends com.huawei.bme.cbsinterface.bccommon.AcctAccessCode
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "PayType")
                protected String payType;

                /**
                 * Gets the value of the payType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPayType() {
                    return payType;
                }

                /**
                 * Sets the value of the payType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPayType(String value) {
                    this.payType = value;
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
         *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AddProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
         *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DelProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
        @XmlType(name = "", propOrder = {
            "productID",
            "addProperty",
            "delProperty"
        })
        public static class ProductInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ProductID", required = true)
            protected String productID;
            @XmlElement(name = "AddProperty")
            protected List<ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty> addProperty;
            @XmlElement(name = "DelProperty")
            protected List<ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty> delProperty;

            /**
             * Gets the value of the productID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * Sets the value of the productID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * Gets the value of the addProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty }
             * 
             * 
             */
            public List<ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty> getAddProperty() {
                if (addProperty == null) {
                    addProperty = new ArrayList<ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty>();
                }
                return this.addProperty;
            }

            /**
             * Gets the value of the delProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty }
             * 
             * 
             */
            public List<ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty> getDelProperty() {
                if (delProperty == null) {
                    delProperty = new ArrayList<ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty>();
                }
                return this.delProperty;
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
             *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
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
            public static class AddProperty
                extends InstProperty
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "EffectiveTime")
                protected EffectMode effectiveTime;
                @XmlElement(name = "ExpirationTime")
                protected String expirationTime;

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
             *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
                "expirationTime"
            })
            public static class DelProperty
                extends InstProperty
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "ExpirationTime", required = true)
                protected EffectMode expirationTime;

                /**
                 * Gets the value of the expirationTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EffectMode }
                 *     
                 */
                public EffectMode getExpirationTime() {
                    return expirationTime;
                }

                /**
                 * Sets the value of the expirationTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EffectMode }
                 *     
                 */
                public void setExpirationTime(EffectMode value) {
                    this.expirationTime = value;
                }

            }

        }

    }

}
