
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MVPPRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MVPPRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MMLCommand_New" type="{http://www.esb.com/crm/crmservice/biz}MMLCommand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://www.esb.com/crm/crmservice/biz}IndividualCustomer" minOccurs="0"/&gt;
 *         &lt;element name="Subscriber"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/crm/crmservice/biz}Subscriber"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Account" type="{http://www.esb.com/crm/crmservice/biz}Account" minOccurs="0"/&gt;
 *         &lt;element name="Product_new" type="{http://www.esb.com/crm/crmservice/biz}Product"/&gt;
 *         &lt;element name="Product_del" type="{http://www.esb.com/crm/crmservice/biz}Product"/&gt;
 *         &lt;element name="MMLCommand_DEL" type="{http://www.esb.com/crm/crmservice/biz}MMLCommand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Product_Appendant_Add" maxOccurs="unbounded"&gt;
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
 *         &lt;element name="Product_Appendant_Del" maxOccurs="unbounded"&gt;
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
@XmlType(name = "MVPPRequest", propOrder = {
    "subscriberNo",
    "mmlCommandNew",
    "customer",
    "subscriber",
    "account",
    "productNew",
    "productDel",
    "mmlCommandDEL",
    "productAppendantAdd",
    "productAppendantDel"
})
public class MVPPRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "MMLCommand_New")
    protected List<MMLCommand> mmlCommandNew;
    @XmlElement(name = "Customer")
    protected IndividualCustomer customer;
    @XmlElement(name = "Subscriber", required = true)
    protected MVPPRequest.Subscriber subscriber;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "Product_new", required = true)
    protected Product productNew;
    @XmlElement(name = "Product_del", required = true)
    protected Product productDel;
    @XmlElement(name = "MMLCommand_DEL")
    protected List<MMLCommand> mmlCommandDEL;
    @XmlElement(name = "Product_Appendant_Add", required = true)
    protected List<MVPPRequest.ProductAppendantAdd> productAppendantAdd;
    @XmlElement(name = "Product_Appendant_Del", required = true)
    protected List<MVPPRequest.ProductAppendantDel> productAppendantDel;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the mmlCommandNew property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlCommandNew property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMMLCommandNew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MMLCommand }
     * 
     * 
     */
    public List<MMLCommand> getMMLCommandNew() {
        if (mmlCommandNew == null) {
            mmlCommandNew = new ArrayList<MMLCommand>();
        }
        return this.mmlCommandNew;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomer }
     *     
     */
    public IndividualCustomer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomer }
     *     
     */
    public void setCustomer(IndividualCustomer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link MVPPRequest.Subscriber }
     *     
     */
    public MVPPRequest.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MVPPRequest.Subscriber }
     *     
     */
    public void setSubscriber(MVPPRequest.Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the productNew property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductNew() {
        return productNew;
    }

    /**
     * Sets the value of the productNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductNew(Product value) {
        this.productNew = value;
    }

    /**
     * Gets the value of the productDel property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductDel() {
        return productDel;
    }

    /**
     * Sets the value of the productDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductDel(Product value) {
        this.productDel = value;
    }

    /**
     * Gets the value of the mmlCommandDEL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlCommandDEL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMMLCommandDEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MMLCommand }
     * 
     * 
     */
    public List<MMLCommand> getMMLCommandDEL() {
        if (mmlCommandDEL == null) {
            mmlCommandDEL = new ArrayList<MMLCommand>();
        }
        return this.mmlCommandDEL;
    }

    /**
     * Gets the value of the productAppendantAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAppendantAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAppendantAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MVPPRequest.ProductAppendantAdd }
     * 
     * 
     */
    public List<MVPPRequest.ProductAppendantAdd> getProductAppendantAdd() {
        if (productAppendantAdd == null) {
            productAppendantAdd = new ArrayList<MVPPRequest.ProductAppendantAdd>();
        }
        return this.productAppendantAdd;
    }

    /**
     * Gets the value of the productAppendantDel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAppendantDel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAppendantDel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MVPPRequest.ProductAppendantDel }
     * 
     * 
     */
    public List<MVPPRequest.ProductAppendantDel> getProductAppendantDel() {
        if (productAppendantDel == null) {
            productAppendantDel = new ArrayList<MVPPRequest.ProductAppendantDel>();
        }
        return this.productAppendantDel;
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
    public static class ProductAppendantAdd
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
    public static class ProductAppendantDel
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.esb.com/crm/crmservice/biz}Subscriber"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "password",
        "scpid",
        "cbpid"
    })
    public static class Subscriber
        extends com.esb.crm.crmservice.biz.Subscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082015L;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "SCPID")
        protected Integer scpid;
        @XmlElement(name = "CBPID")
        protected Integer cbpid;

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the scpid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSCPID() {
            return scpid;
        }

        /**
         * Sets the value of the scpid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSCPID(Integer value) {
            this.scpid = value;
        }

        /**
         * Gets the value of the cbpid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCBPID() {
            return cbpid;
        }

        /**
         * Sets the value of the cbpid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCBPID(Integer value) {
            this.cbpid = value;
        }

    }

}
