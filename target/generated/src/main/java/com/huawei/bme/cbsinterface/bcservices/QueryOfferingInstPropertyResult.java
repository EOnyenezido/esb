
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.InstProperty;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;


/**
 * <p>Java class for QueryOfferingInstPropertyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOfferingInstPropertyResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingInst" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *                   &lt;element name="OfferingInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ProductInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
@XmlType(name = "QueryOfferingInstPropertyResult", propOrder = {
    "offeringInst"
})
public class QueryOfferingInstPropertyResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OfferingInst", required = true)
    protected List<QueryOfferingInstPropertyResult.OfferingInst> offeringInst;

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
     * {@link QueryOfferingInstPropertyResult.OfferingInst }
     * 
     * 
     */
    public List<QueryOfferingInstPropertyResult.OfferingInst> getOfferingInst() {
        if (offeringInst == null) {
            offeringInst = new ArrayList<QueryOfferingInstPropertyResult.OfferingInst>();
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
     *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
     *         &lt;element name="OfferingInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ProductInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "offeringKey",
        "offeringInstProperty",
        "productInst"
    })
    public static class OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingKey", required = true)
        protected OfferingKey offeringKey;
        @XmlElement(name = "OfferingInstProperty")
        protected List<QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty> offeringInstProperty;
        @XmlElement(name = "ProductInst")
        protected List<QueryOfferingInstPropertyResult.OfferingInst.ProductInst> productInst;

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
         * {@link QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty }
         * 
         * 
         */
        public List<QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty> getOfferingInstProperty() {
            if (offeringInstProperty == null) {
                offeringInstProperty = new ArrayList<QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty>();
            }
            return this.offeringInstProperty;
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
         * {@link QueryOfferingInstPropertyResult.OfferingInst.ProductInst }
         * 
         * 
         */
        public List<QueryOfferingInstPropertyResult.OfferingInst.ProductInst> getProductInst() {
            if (productInst == null) {
                productInst = new ArrayList<QueryOfferingInstPropertyResult.OfferingInst.ProductInst>();
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "EffectiveTime", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
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
         *         &lt;element name="ProductInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "productInstProperty"
        })
        public static class ProductInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ProductID", required = true)
            protected String productID;
            @XmlElement(name = "ProductInstProperty")
            protected List<QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty> productInstProperty;

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
             * Gets the value of the productInstProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the productInstProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProductInstProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty }
             * 
             * 
             */
            public List<QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty> getProductInstProperty() {
                if (productInstProperty == null) {
                    productInstProperty = new ArrayList<QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty>();
                }
                return this.productInstProperty;
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
             *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
             *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            public static class ProductInstProperty
                extends InstProperty
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "EffectiveTime", required = true)
                protected String effectiveTime;
                @XmlElement(name = "ExpirationTime", required = true)
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

    }

}
