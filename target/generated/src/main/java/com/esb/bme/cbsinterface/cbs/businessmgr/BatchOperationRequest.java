
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchOperationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchOperationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatchNewSubscriber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Customer" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer" minOccurs="0"/&gt;
 *                   &lt;element name="Subscriber"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                             &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                             &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Account" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Account" minOccurs="0"/&gt;
 *                   &lt;element name="Product" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchDeleteSubscriber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchSubscribe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ValidMode" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/&gt;
 *                   &lt;element name="Product" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Service" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchUnSubscribe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ValidMode" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/&gt;
 *                   &lt;element name="Product" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Service" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="SimpleProperty" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
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
 *         &lt;element name="BatchChangeService" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Service" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
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
 *         &lt;element name="BatchChangeMainProduct" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewMainProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ValidMode" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/&gt;
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="RemovedProduct" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ppsAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="posAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ppsAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="PosAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchModifySubValidity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="ModifyType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchModifyVoucherState" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CardFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchReplaceProduct" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchActiveSubscriber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BatchModAcctExt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ModifyMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "BatchOperationRequest", propOrder = {
    "batchNewSubscriber",
    "batchDeleteSubscriber",
    "batchSubscribe",
    "batchUnSubscribe",
    "batchChangeService",
    "batchChangeMainProduct",
    "batchModifySubValidity",
    "batchModifyVoucherState",
    "batchReplaceProduct",
    "batchActiveSubscriber",
    "batchModAcctExt"
})
public class BatchOperationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "BatchNewSubscriber")
    protected BatchOperationRequest.BatchNewSubscriber batchNewSubscriber;
    @XmlElement(name = "BatchDeleteSubscriber")
    protected BatchOperationRequest.BatchDeleteSubscriber batchDeleteSubscriber;
    @XmlElement(name = "BatchSubscribe")
    protected BatchOperationRequest.BatchSubscribe batchSubscribe;
    @XmlElement(name = "BatchUnSubscribe")
    protected BatchOperationRequest.BatchUnSubscribe batchUnSubscribe;
    @XmlElement(name = "BatchChangeService")
    protected BatchOperationRequest.BatchChangeService batchChangeService;
    @XmlElement(name = "BatchChangeMainProduct")
    protected BatchOperationRequest.BatchChangeMainProduct batchChangeMainProduct;
    @XmlElement(name = "BatchModifySubValidity")
    protected BatchOperationRequest.BatchModifySubValidity batchModifySubValidity;
    @XmlElement(name = "BatchModifyVoucherState")
    protected BatchOperationRequest.BatchModifyVoucherState batchModifyVoucherState;
    @XmlElement(name = "BatchReplaceProduct")
    protected BatchOperationRequest.BatchReplaceProduct batchReplaceProduct;
    @XmlElement(name = "BatchActiveSubscriber")
    protected BatchOperationRequest.BatchActiveSubscriber batchActiveSubscriber;
    @XmlElement(name = "BatchModAcctExt")
    protected BatchOperationRequest.BatchModAcctExt batchModAcctExt;

    /**
     * Gets the value of the batchNewSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchNewSubscriber }
     *     
     */
    public BatchOperationRequest.BatchNewSubscriber getBatchNewSubscriber() {
        return batchNewSubscriber;
    }

    /**
     * Sets the value of the batchNewSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchNewSubscriber }
     *     
     */
    public void setBatchNewSubscriber(BatchOperationRequest.BatchNewSubscriber value) {
        this.batchNewSubscriber = value;
    }

    /**
     * Gets the value of the batchDeleteSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchDeleteSubscriber }
     *     
     */
    public BatchOperationRequest.BatchDeleteSubscriber getBatchDeleteSubscriber() {
        return batchDeleteSubscriber;
    }

    /**
     * Sets the value of the batchDeleteSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchDeleteSubscriber }
     *     
     */
    public void setBatchDeleteSubscriber(BatchOperationRequest.BatchDeleteSubscriber value) {
        this.batchDeleteSubscriber = value;
    }

    /**
     * Gets the value of the batchSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchSubscribe }
     *     
     */
    public BatchOperationRequest.BatchSubscribe getBatchSubscribe() {
        return batchSubscribe;
    }

    /**
     * Sets the value of the batchSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchSubscribe }
     *     
     */
    public void setBatchSubscribe(BatchOperationRequest.BatchSubscribe value) {
        this.batchSubscribe = value;
    }

    /**
     * Gets the value of the batchUnSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchUnSubscribe }
     *     
     */
    public BatchOperationRequest.BatchUnSubscribe getBatchUnSubscribe() {
        return batchUnSubscribe;
    }

    /**
     * Sets the value of the batchUnSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchUnSubscribe }
     *     
     */
    public void setBatchUnSubscribe(BatchOperationRequest.BatchUnSubscribe value) {
        this.batchUnSubscribe = value;
    }

    /**
     * Gets the value of the batchChangeService property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchChangeService }
     *     
     */
    public BatchOperationRequest.BatchChangeService getBatchChangeService() {
        return batchChangeService;
    }

    /**
     * Sets the value of the batchChangeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchChangeService }
     *     
     */
    public void setBatchChangeService(BatchOperationRequest.BatchChangeService value) {
        this.batchChangeService = value;
    }

    /**
     * Gets the value of the batchChangeMainProduct property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchChangeMainProduct }
     *     
     */
    public BatchOperationRequest.BatchChangeMainProduct getBatchChangeMainProduct() {
        return batchChangeMainProduct;
    }

    /**
     * Sets the value of the batchChangeMainProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchChangeMainProduct }
     *     
     */
    public void setBatchChangeMainProduct(BatchOperationRequest.BatchChangeMainProduct value) {
        this.batchChangeMainProduct = value;
    }

    /**
     * Gets the value of the batchModifySubValidity property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModifySubValidity }
     *     
     */
    public BatchOperationRequest.BatchModifySubValidity getBatchModifySubValidity() {
        return batchModifySubValidity;
    }

    /**
     * Sets the value of the batchModifySubValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModifySubValidity }
     *     
     */
    public void setBatchModifySubValidity(BatchOperationRequest.BatchModifySubValidity value) {
        this.batchModifySubValidity = value;
    }

    /**
     * Gets the value of the batchModifyVoucherState property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModifyVoucherState }
     *     
     */
    public BatchOperationRequest.BatchModifyVoucherState getBatchModifyVoucherState() {
        return batchModifyVoucherState;
    }

    /**
     * Sets the value of the batchModifyVoucherState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModifyVoucherState }
     *     
     */
    public void setBatchModifyVoucherState(BatchOperationRequest.BatchModifyVoucherState value) {
        this.batchModifyVoucherState = value;
    }

    /**
     * Gets the value of the batchReplaceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchReplaceProduct }
     *     
     */
    public BatchOperationRequest.BatchReplaceProduct getBatchReplaceProduct() {
        return batchReplaceProduct;
    }

    /**
     * Sets the value of the batchReplaceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchReplaceProduct }
     *     
     */
    public void setBatchReplaceProduct(BatchOperationRequest.BatchReplaceProduct value) {
        this.batchReplaceProduct = value;
    }

    /**
     * Gets the value of the batchActiveSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchActiveSubscriber }
     *     
     */
    public BatchOperationRequest.BatchActiveSubscriber getBatchActiveSubscriber() {
        return batchActiveSubscriber;
    }

    /**
     * Sets the value of the batchActiveSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchActiveSubscriber }
     *     
     */
    public void setBatchActiveSubscriber(BatchOperationRequest.BatchActiveSubscriber value) {
        this.batchActiveSubscriber = value;
    }

    /**
     * Gets the value of the batchModAcctExt property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModAcctExt }
     *     
     */
    public BatchOperationRequest.BatchModAcctExt getBatchModAcctExt() {
        return batchModAcctExt;
    }

    /**
     * Sets the value of the batchModAcctExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModAcctExt }
     *     
     */
    public void setBatchModAcctExt(BatchOperationRequest.BatchModAcctExt value) {
        this.batchModAcctExt = value;
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
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchActiveSubscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected Object fileName;

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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewMainProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
     *         &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ppsAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="posAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ppsAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="PosAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
        "fileName",
        "newMainProductId",
        "validMode",
        "effectiveDate",
        "product",
        "handlingChargeFlag",
        "removedProduct",
        "newBrandId",
        "ppsAcctCredit",
        "posAcctCredit",
        "ppsAcctInitBal",
        "posAcctInitBal"
    })
    public static class BatchChangeMainProduct
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "NewMainProductId", required = true)
        protected String newMainProductId;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "Product")
        protected List<BatchOperationRequest.BatchChangeMainProduct.Product> product;
        @XmlElement(name = "HandlingChargeFlag")
        protected Integer handlingChargeFlag;
        @XmlElement(name = "RemovedProduct")
        protected List<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct> removedProduct;
        @XmlElement(name = "NewBrandId")
        protected String newBrandId;
        protected Long ppsAcctCredit;
        protected Long posAcctCredit;
        protected Long ppsAcctInitBal;
        @XmlElement(name = "PosAcctInitBal")
        protected Long posAcctInitBal;

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
         * {@link BatchOperationRequest.BatchChangeMainProduct.Product }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchChangeMainProduct.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<BatchOperationRequest.BatchChangeMainProduct.Product>();
            }
            return this.product;
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
         * {@link BatchOperationRequest.BatchChangeMainProduct.RemovedProduct }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct> getRemovedProduct() {
            if (removedProduct == null) {
                removedProduct = new ArrayList<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct>();
            }
            return this.removedProduct;
        }

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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Service" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
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
        "fileName",
        "service"
    })
    public static class BatchChangeService
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "Service", required = true)
        protected List<BatchOperationRequest.BatchChangeService.Service> service;

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
         * {@link BatchOperationRequest.BatchChangeService.Service }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchChangeService.Service> getService() {
            if (service == null) {
                service = new ArrayList<BatchOperationRequest.BatchChangeService.Service>();
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
         *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
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
            "operationType"
        })
        public static class Service
            extends com.esb.bme.cbsinterface.cbs.businessmgr.Service
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;
            @XmlElement(name = "OperationType", required = true)
            protected String operationType;

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
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchDeleteSubscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;

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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ModifyMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "fileName",
        "modifyMode"
    })
    public static class BatchModAcctExt
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "ModifyMode")
        protected Integer modifyMode;

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
         * Gets the value of the modifyMode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getModifyMode() {
            return modifyMode;
        }

        /**
         * Sets the value of the modifyMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setModifyMode(Integer value) {
            this.modifyMode = value;
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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="ModifyType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "fileName",
        "validityIncrement",
        "modifyType",
        "operationDes"
    })
    public static class BatchModifySubValidity
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "ValidityIncrement")
        protected int validityIncrement;
        @XmlElement(name = "ModifyType")
        protected Integer modifyType;
        @XmlElement(name = "OperationDes")
        protected String operationDes;

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
         * Gets the value of the validityIncrement property.
         * 
         */
        public int getValidityIncrement() {
            return validityIncrement;
        }

        /**
         * Sets the value of the validityIncrement property.
         * 
         */
        public void setValidityIncrement(int value) {
            this.validityIncrement = value;
        }

        /**
         * Gets the value of the modifyType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getModifyType() {
            return modifyType;
        }

        /**
         * Sets the value of the modifyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setModifyType(Integer value) {
            this.modifyType = value;
        }

        /**
         * Gets the value of the operationDes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationDes() {
            return operationDes;
        }

        /**
         * Sets the value of the operationDes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationDes(String value) {
            this.operationDes = value;
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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CardFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "fileName",
        "cardFlag",
        "operationDes"
    })
    public static class BatchModifyVoucherState
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "CardFlag")
        protected int cardFlag;
        @XmlElement(name = "OperationDes")
        protected String operationDes;

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
         * Gets the value of the cardFlag property.
         * 
         */
        public int getCardFlag() {
            return cardFlag;
        }

        /**
         * Sets the value of the cardFlag property.
         * 
         */
        public void setCardFlag(int value) {
            this.cardFlag = value;
        }

        /**
         * Gets the value of the operationDes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationDes() {
            return operationDes;
        }

        /**
         * Sets the value of the operationDes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationDes(String value) {
            this.operationDes = value;
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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Customer" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer" minOccurs="0"/&gt;
     *         &lt;element name="Subscriber"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Account" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Account" minOccurs="0"/&gt;
     *         &lt;element name="Product" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "fileName",
        "customer",
        "subscriber",
        "account",
        "product"
    })
    public static class BatchNewSubscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "Customer")
        protected IndividualCustomer customer;
        @XmlElement(name = "Subscriber", required = true)
        protected BatchOperationRequest.BatchNewSubscriber.Subscriber subscriber;
        @XmlElement(name = "Account")
        protected Account account;
        @XmlElement(name = "Product")
        protected List<com.esb.bme.cbsinterface.cbs.businessmgr.Product> product;

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
         *     {@link BatchOperationRequest.BatchNewSubscriber.Subscriber }
         *     
         */
        public BatchOperationRequest.BatchNewSubscriber.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BatchOperationRequest.BatchNewSubscriber.Subscriber }
         *     
         */
        public void setSubscriber(BatchOperationRequest.BatchNewSubscriber.Subscriber value) {
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
         * {@link com.esb.bme.cbsinterface.cbs.businessmgr.Product }
         * 
         * 
         */
        public List<com.esb.bme.cbsinterface.cbs.businessmgr.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<com.esb.bme.cbsinterface.cbs.businessmgr.Product>();
            }
            return this.product;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "cbpid",
            "scpid",
            "password"
        })
        public static class Subscriber
            extends SubscriberBasic
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;
            @XmlElement(name = "CBPID")
            protected Integer cbpid;
            @XmlElement(name = "SCPID")
            protected Integer scpid;
            @XmlElement(name = "Password")
            protected String password;

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
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchReplaceProduct
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;

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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ValidMode" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/&gt;
     *         &lt;element name="Product" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Service" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "fileName",
        "effectiveDate",
        "expireDate",
        "validMode",
        "product",
        "handlingChargeFlag"
    })
    public static class BatchSubscribe
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "Product", required = true)
        protected List<BatchOperationRequest.BatchSubscribe.Product> product;
        @XmlElement(name = "HandlingChargeFlag")
        protected Integer handlingChargeFlag;

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
         * {@link BatchOperationRequest.BatchSubscribe.Product }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchSubscribe.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<BatchOperationRequest.BatchSubscribe.Product>();
            }
            return this.product;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Service" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "service"
        })
        public static class Product
            extends com.esb.bme.cbsinterface.cbs.businessmgr.Product
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;
            @XmlElement(name = "Service")
            protected List<com.esb.bme.cbsinterface.cbs.businessmgr.Service> service;

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
             * {@link com.esb.bme.cbsinterface.cbs.businessmgr.Service }
             * 
             * 
             */
            public List<com.esb.bme.cbsinterface.cbs.businessmgr.Service> getService() {
                if (service == null) {
                    service = new ArrayList<com.esb.bme.cbsinterface.cbs.businessmgr.Service>();
                }
                return this.service;
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
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ValidMode" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/&gt;
     *         &lt;element name="Product" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Service" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="SimpleProperty" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/&gt;
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
    @XmlType(name = "", propOrder = {
        "fileName",
        "expireDate",
        "validMode",
        "product"
    })
    public static class BatchUnSubscribe
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "Product", required = true)
        protected List<BatchOperationRequest.BatchUnSubscribe.Product> product;

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
         * {@link BatchOperationRequest.BatchUnSubscribe.Product }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchUnSubscribe.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<BatchOperationRequest.BatchUnSubscribe.Product>();
            }
            return this.product;
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
         *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="SimpleProperty" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/&gt;
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
            "productID",
            "productOrderKey",
            "service"
        })
        public static class Product
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;
            @XmlElement(name = "ProductID", required = true)
            protected String productID;
            @XmlElement(name = "ProductOrderKey")
            protected String productOrderKey;
            @XmlElement(name = "Service")
            protected List<BatchOperationRequest.BatchUnSubscribe.Product.Service> service;

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
             * {@link BatchOperationRequest.BatchUnSubscribe.Product.Service }
             * 
             * 
             */
            public List<BatchOperationRequest.BatchUnSubscribe.Product.Service> getService() {
                if (service == null) {
                    service = new ArrayList<BatchOperationRequest.BatchUnSubscribe.Product.Service>();
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="SimpleProperty" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/&gt;
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
                "id",
                "simpleProperty"
            })
            public static class Service
                implements Serializable
            {

                private final static long serialVersionUID = 11082013L;
                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "SimpleProperty", required = true)
                protected List<SimpleProperty> simpleProperty;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the simpleProperty property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSimpleProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SimpleProperty }
                 * 
                 * 
                 */
                public List<SimpleProperty> getSimpleProperty() {
                    if (simpleProperty == null) {
                        simpleProperty = new ArrayList<SimpleProperty>();
                    }
                    return this.simpleProperty;
                }

            }

        }

    }

}
