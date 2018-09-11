
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.InstProperty;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;


/**
 * <p>Java class for BatchChangeOfferingPropertyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchChangeOfferingPropertyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
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
 *         &lt;element name="ProductInst" minOccurs="0"&gt;
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
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchChangeOfferingPropertyRequest", propOrder = {
    "offeringKey",
    "offeringInstProperty",
    "productInst",
    "fileName"
})
public class BatchChangeOfferingPropertyRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OfferingKey")
    protected OfferingKey offeringKey;
    @XmlElement(name = "OfferingInstProperty")
    protected BatchChangeOfferingPropertyRequest.OfferingInstProperty offeringInstProperty;
    @XmlElement(name = "ProductInst")
    protected BatchChangeOfferingPropertyRequest.ProductInst productInst;
    @XmlElement(name = "FileName", required = true)
    protected Object fileName;

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
     *     {@link BatchChangeOfferingPropertyRequest.OfferingInstProperty }
     *     
     */
    public BatchChangeOfferingPropertyRequest.OfferingInstProperty getOfferingInstProperty() {
        return offeringInstProperty;
    }

    /**
     * Sets the value of the offeringInstProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchChangeOfferingPropertyRequest.OfferingInstProperty }
     *     
     */
    public void setOfferingInstProperty(BatchChangeOfferingPropertyRequest.OfferingInstProperty value) {
        this.offeringInstProperty = value;
    }

    /**
     * Gets the value of the productInst property.
     * 
     * @return
     *     possible object is
     *     {@link BatchChangeOfferingPropertyRequest.ProductInst }
     *     
     */
    public BatchChangeOfferingPropertyRequest.ProductInst getProductInst() {
        return productInst;
    }

    /**
     * Sets the value of the productInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchChangeOfferingPropertyRequest.ProductInst }
     *     
     */
    public void setProductInst(BatchChangeOfferingPropertyRequest.ProductInst value) {
        this.productInst = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileName(Object value) {
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
        protected List<BatchChangeOfferingPropertyRequest.OfferingInstProperty.AddProperty> addProperty;
        @XmlElement(name = "DelProperty")
        protected List<BatchChangeOfferingPropertyRequest.OfferingInstProperty.DelProperty> delProperty;

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
         * {@link BatchChangeOfferingPropertyRequest.OfferingInstProperty.AddProperty }
         * 
         * 
         */
        public List<BatchChangeOfferingPropertyRequest.OfferingInstProperty.AddProperty> getAddProperty() {
            if (addProperty == null) {
                addProperty = new ArrayList<BatchChangeOfferingPropertyRequest.OfferingInstProperty.AddProperty>();
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
         * {@link BatchChangeOfferingPropertyRequest.OfferingInstProperty.DelProperty }
         * 
         * 
         */
        public List<BatchChangeOfferingPropertyRequest.OfferingInstProperty.DelProperty> getDelProperty() {
            if (delProperty == null) {
                delProperty = new ArrayList<BatchChangeOfferingPropertyRequest.OfferingInstProperty.DelProperty>();
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
        protected List<BatchChangeOfferingPropertyRequest.ProductInst.AddProperty> addProperty;
        @XmlElement(name = "DelProperty")
        protected List<BatchChangeOfferingPropertyRequest.ProductInst.DelProperty> delProperty;

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
         * {@link BatchChangeOfferingPropertyRequest.ProductInst.AddProperty }
         * 
         * 
         */
        public List<BatchChangeOfferingPropertyRequest.ProductInst.AddProperty> getAddProperty() {
            if (addProperty == null) {
                addProperty = new ArrayList<BatchChangeOfferingPropertyRequest.ProductInst.AddProperty>();
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
         * {@link BatchChangeOfferingPropertyRequest.ProductInst.DelProperty }
         * 
         * 
         */
        public List<BatchChangeOfferingPropertyRequest.ProductInst.DelProperty> getDelProperty() {
            if (delProperty == null) {
                delProperty = new ArrayList<BatchChangeOfferingPropertyRequest.ProductInst.DelProperty>();
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
