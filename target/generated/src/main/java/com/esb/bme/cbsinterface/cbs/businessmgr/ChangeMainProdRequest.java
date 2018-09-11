
package com.esb.bme.cbsinterface.cbs.businessmgr;

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
 *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewMainProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValidMode" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RemovedProduct" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "newMainProductId",
    "handlingChargeFlag",
    "validMode",
    "effectiveDate",
    "product",
    "removedProduct",
    "custID",
    "ppsAcctCredit",
    "posAcctCredit",
    "ppsAcctInitBal",
    "posAcctInitBal",
    "newBillcycleType"
})
public class ChangeMainProdRequest
    extends Common
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "NewBrandId")
    protected String newBrandId;
    @XmlElement(name = "NewMainProductId", required = true)
    protected String newMainProductId;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "ValidMode", required = true)
    protected String validMode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "Product")
    protected List<ChangeMainProdRequest.Product> product;
    @XmlElement(name = "RemovedProduct")
    protected List<ChangeMainProdRequest.RemovedProduct> removedProduct;
    @XmlElement(name = "CustID")
    protected String custID;
    protected Long ppsAcctCredit;
    protected Long posAcctCredit;
    protected Long ppsAcctInitBal;
    protected Long posAcctInitBal;
    protected Integer newBillcycleType;

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
     * Gets the value of the newMainProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMainProductId() {
        return newMainProductId;
    }

    /**
     * Sets the value of the newMainProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMainProductId(String value) {
        this.newMainProductId = value;
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
     * {@link ChangeMainProdRequest.Product }
     * 
     * 
     */
    public List<ChangeMainProdRequest.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<ChangeMainProdRequest.Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the removedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeMainProdRequest.RemovedProduct }
     * 
     * 
     */
    public List<ChangeMainProdRequest.RemovedProduct> getRemovedProduct() {
        if (removedProduct == null) {
            removedProduct = new ArrayList<ChangeMainProdRequest.RemovedProduct>();
        }
        return this.removedProduct;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Product
        extends com.esb.bme.cbsinterface.cbs.businessmgr.Product
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;

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
        "productOrderKey"
    })
    public static class RemovedProduct
        extends com.esb.bme.cbsinterface.cbs.businessmgr.Product
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "ProductOrderKey")
        protected String productOrderKey;

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

    }

}
