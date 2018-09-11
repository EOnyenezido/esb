
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteSubscriberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSubscriberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriberNo" type="{http://www.esb.com/crm/crmservice/biz}Common"/&gt;
 *         &lt;element name="MMLCommand" type="{http://www.esb.com/crm/crmservice/biz}MMLCommand" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PackageId" type="{http://www.esb.com/crm/crmservice/biz}MainPackage"/&gt;
 *         &lt;element name="Product_Appendant" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/crm/crmservice/biz}Product"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OperationType" type="{http://www.esb.com/crm/crmservice/biz}ProductOperationType"/&gt;
 *                   &lt;element name="Service" type="{http://www.esb.com/crm/crmservice/biz}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ValidMode" type="{http://www.esb.com/crm/crmservice/biz}ValidMode"/&gt;
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="BindSubscriberNo" type="{http://www.esb.com/crm/crmservice/biz}BindSubscriberNo"/&gt;
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
@XmlType(name = "DeleteSubscriberRequest", propOrder = {
    "subscriberNo",
    "mmlCommand",
    "packageId",
    "productAppendant"
})
public class DeleteSubscriberRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "SubscriberNo", required = true)
    protected Common subscriberNo;
    @XmlElement(name = "MMLCommand", required = true)
    protected List<MMLCommand> mmlCommand;
    @XmlElement(name = "PackageId", required = true)
    protected MainPackage packageId;
    @XmlElement(name = "Product_Appendant", required = true)
    protected List<DeleteSubscriberRequest.ProductAppendant> productAppendant;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link Common }
     *     
     */
    public Common getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Common }
     *     
     */
    public void setSubscriberNo(Common value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the mmlCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMMLCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MMLCommand }
     * 
     * 
     */
    public List<MMLCommand> getMMLCommand() {
        if (mmlCommand == null) {
            mmlCommand = new ArrayList<MMLCommand>();
        }
        return this.mmlCommand;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link MainPackage }
     *     
     */
    public MainPackage getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPackage }
     *     
     */
    public void setPackageId(MainPackage value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the productAppendant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAppendant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAppendant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteSubscriberRequest.ProductAppendant }
     * 
     * 
     */
    public List<DeleteSubscriberRequest.ProductAppendant> getProductAppendant() {
        if (productAppendant == null) {
            productAppendant = new ArrayList<DeleteSubscriberRequest.ProductAppendant>();
        }
        return this.productAppendant;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.esb.com/crm/crmservice/biz}Product"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OperationType" type="{http://www.esb.com/crm/crmservice/biz}ProductOperationType"/&gt;
     *         &lt;element name="Service" type="{http://www.esb.com/crm/crmservice/biz}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ValidMode" type="{http://www.esb.com/crm/crmservice/biz}ValidMode"/&gt;
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="BindSubscriberNo" type="{http://www.esb.com/crm/crmservice/biz}BindSubscriberNo"/&gt;
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
        "operationType",
        "service",
        "productOrderKey",
        "validMode",
        "effectiveDate",
        "expireDate",
        "status",
        "bindSubscriberNo"
    })
    public static class ProductAppendant
        extends Product
        implements Serializable
    {

        private final static long serialVersionUID = 11082015L;
        @XmlElement(name = "OperationType", required = true)
        protected String operationType;
        @XmlElement(name = "Service")
        protected List<Service> service;
        @XmlElement(name = "ProductOrderKey")
        protected String productOrderKey;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "Status")
        protected Integer status;
        @XmlElement(name = "BindSubscriberNo", required = true)
        protected BindSubscriberNo bindSubscriberNo;

        /**
         * Gets the value of the operationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationType(String value) {
            this.operationType = value;
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
         * Gets the value of the productOrderKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductOrderKey() {
            return productOrderKey;
        }

        /**
         * Sets the value of the productOrderKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductOrderKey(String value) {
            this.productOrderKey = value;
        }

        /**
         * Gets the value of the validMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidMode() {
            return validMode;
        }

        /**
         * Sets the value of the validMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidMode(String value) {
            this.validMode = value;
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
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setStatus(Integer value) {
            this.status = value;
        }

        /**
         * Gets the value of the bindSubscriberNo property.
         * 
         * @return
         *     possible object is
         *     {@link BindSubscriberNo }
         *     
         */
        public BindSubscriberNo getBindSubscriberNo() {
            return bindSubscriberNo;
        }

        /**
         * Sets the value of the bindSubscriberNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BindSubscriberNo }
         *     
         */
        public void setBindSubscriberNo(BindSubscriberNo value) {
            this.bindSubscriberNo = value;
        }

    }

}
