
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubscriberProductInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubscriberProductInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="CurCycleStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CurCycleEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Service" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubscriberProductInfoResult", propOrder = {
    "product",
    "service"
})
public class QuerySubscriberProductInfoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Product")
    protected List<QuerySubscriberProductInfoResult.Product> product;
    @XmlElement(name = "Service")
    protected List<Service> service;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubscriberProductInfoResult.Product }
     * 
     * 
     */
    public List<QuerySubscriberProductInfoResult.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<QuerySubscriberProductInfoResult.Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getService() {
        if (service == null) {
            service = new ArrayList<Service>();
        }
        return this.service;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="CurCycleStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CurCycleEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "productOrderKey",
        "effectiveDate",
        "expiredDate",
        "status",
        "curCycleStartTime",
        "curCycleEndTime",
        "billStatus"
    })
    public static class Product
        extends com.esb.bme.cbsinterface.cbs.businessmgr.Product
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElementRef(name = "ProductOrderKey", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> productOrderKey;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpiredDate")
        protected String expiredDate;
        @XmlElementRef(name = "status", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> status;
        @XmlElement(name = "CurCycleStartTime")
        protected String curCycleStartTime;
        @XmlElement(name = "CurCycleEndTime")
        protected String curCycleEndTime;
        @XmlElement(name = "BillStatus")
        protected Integer billStatus;

        /**
         * Gets the value of the productOrderKey property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getProductOrderKey() {
            return productOrderKey;
        }

        /**
         * Sets the value of the productOrderKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setProductOrderKey(JAXBElement<String> value) {
            this.productOrderKey = value;
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
         * Gets the value of the expiredDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpiredDate() {
            return expiredDate;
        }

        /**
         * Sets the value of the expiredDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpiredDate(String value) {
            this.expiredDate = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setStatus(JAXBElement<Integer> value) {
            this.status = value;
        }

        /**
         * Gets the value of the curCycleStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurCycleStartTime() {
            return curCycleStartTime;
        }

        /**
         * Sets the value of the curCycleStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurCycleStartTime(String value) {
            this.curCycleStartTime = value;
        }

        /**
         * Gets the value of the curCycleEndTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurCycleEndTime() {
            return curCycleEndTime;
        }

        /**
         * Sets the value of the curCycleEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurCycleEndTime(String value) {
            this.curCycleEndTime = value;
        }

        /**
         * Gets the value of the billStatus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBillStatus() {
            return billStatus;
        }

        /**
         * Sets the value of the billStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBillStatus(Integer value) {
            this.billStatus = value;
        }

    }

}
