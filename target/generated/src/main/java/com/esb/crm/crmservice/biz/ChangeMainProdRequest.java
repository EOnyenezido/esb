
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeMainProdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMainProdRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.esb.com/crm/crmservice/biz}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewPackageId" type="{http://www.esb.com/crm/crmservice/biz}MainPackage"/&gt;
 *         &lt;element name="RemovePackageId" type="{http://www.esb.com/crm/crmservice/biz}MainPackage"/&gt;
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValidMode" type="{http://www.esb.com/crm/crmservice/biz}ValidMode"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddProductApp" maxOccurs="unbounded"&gt;
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
 *         &lt;element name="RemovedProductApp" maxOccurs="unbounded"&gt;
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
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ppsAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="posAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ppsAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="posAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="newBillcycleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BCChangeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMainProdRequest", propOrder = {
    "newBrandId",
    "newPackageId",
    "removePackageId",
    "handlingChargeFlag",
    "validMode",
    "effectiveDate",
    "addProductApp",
    "removedProductApp",
    "custID",
    "ppsAcctCredit",
    "posAcctCredit",
    "ppsAcctInitBal",
    "posAcctInitBal",
    "newBillcycleType",
    "bcChangeMode"
})
public class ChangeMainProdRequest
    extends Common
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "NewBrandId")
    protected String newBrandId;
    @XmlElement(name = "NewPackageId", required = true)
    protected MainPackage newPackageId;
    @XmlElement(name = "RemovePackageId", required = true)
    protected MainPackage removePackageId;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "ValidMode", required = true)
    protected String validMode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "AddProductApp", required = true)
    protected List<ChangeMainProdRequest.AddProductApp> addProductApp;
    @XmlElement(name = "RemovedProductApp", required = true)
    protected List<ChangeMainProdRequest.RemovedProductApp> removedProductApp;
    @XmlElement(name = "CustID")
    protected String custID;
    protected Long ppsAcctCredit;
    protected Long posAcctCredit;
    protected Long ppsAcctInitBal;
    protected Long posAcctInitBal;
    protected Integer newBillcycleType;
    @XmlElement(name = "BCChangeMode")
    protected Integer bcChangeMode;

    /**
     * Gets the value of the newBrandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBrandId() {
        return newBrandId;
    }

    /**
     * Sets the value of the newBrandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBrandId(String value) {
        this.newBrandId = value;
    }

    /**
     * Gets the value of the newPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link MainPackage }
     *     
     */
    public MainPackage getNewPackageId() {
        return newPackageId;
    }

    /**
     * Sets the value of the newPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPackage }
     *     
     */
    public void setNewPackageId(MainPackage value) {
        this.newPackageId = value;
    }

    /**
     * Gets the value of the removePackageId property.
     * 
     * @return
     *     possible object is
     *     {@link MainPackage }
     *     
     */
    public MainPackage getRemovePackageId() {
        return removePackageId;
    }

    /**
     * Sets the value of the removePackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPackage }
     *     
     */
    public void setRemovePackageId(MainPackage value) {
        this.removePackageId = value;
    }

    /**
     * Gets the value of the handlingChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }

    /**
     * Sets the value of the handlingChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingChargeFlag(Integer value) {
        this.handlingChargeFlag = value;
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
     * Gets the value of the addProductApp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addProductApp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddProductApp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeMainProdRequest.AddProductApp }
     * 
     * 
     */
    public List<ChangeMainProdRequest.AddProductApp> getAddProductApp() {
        if (addProductApp == null) {
            addProductApp = new ArrayList<ChangeMainProdRequest.AddProductApp>();
        }
        return this.addProductApp;
    }

    /**
     * Gets the value of the removedProductApp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedProductApp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedProductApp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeMainProdRequest.RemovedProductApp }
     * 
     * 
     */
    public List<ChangeMainProdRequest.RemovedProductApp> getRemovedProductApp() {
        if (removedProductApp == null) {
            removedProductApp = new ArrayList<ChangeMainProdRequest.RemovedProductApp>();
        }
        return this.removedProductApp;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the ppsAcctCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPpsAcctCredit() {
        return ppsAcctCredit;
    }

    /**
     * Sets the value of the ppsAcctCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPpsAcctCredit(Long value) {
        this.ppsAcctCredit = value;
    }

    /**
     * Gets the value of the posAcctCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosAcctCredit() {
        return posAcctCredit;
    }

    /**
     * Sets the value of the posAcctCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosAcctCredit(Long value) {
        this.posAcctCredit = value;
    }

    /**
     * Gets the value of the ppsAcctInitBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPpsAcctInitBal() {
        return ppsAcctInitBal;
    }

    /**
     * Sets the value of the ppsAcctInitBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPpsAcctInitBal(Long value) {
        this.ppsAcctInitBal = value;
    }

    /**
     * Gets the value of the posAcctInitBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosAcctInitBal() {
        return posAcctInitBal;
    }

    /**
     * Sets the value of the posAcctInitBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosAcctInitBal(Long value) {
        this.posAcctInitBal = value;
    }

    /**
     * Gets the value of the newBillcycleType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewBillcycleType() {
        return newBillcycleType;
    }

    /**
     * Sets the value of the newBillcycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewBillcycleType(Integer value) {
        this.newBillcycleType = value;
    }

    /**
     * Gets the value of the bcChangeMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBCChangeMode() {
        return bcChangeMode;
    }

    /**
     * Sets the value of the bcChangeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBCChangeMode(Integer value) {
        this.bcChangeMode = value;
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
    public static class AddProductApp
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
    public static class RemovedProductApp
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
