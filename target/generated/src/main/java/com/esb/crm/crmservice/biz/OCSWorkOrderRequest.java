
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCSWorkOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCSWorkOrderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChangeReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferInfo" type="{http://www.esb.com/crm/crmservice/biz}OfferInfoType"/&gt;
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originRelam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productEffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserve3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserve4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserve5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CategoryIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeAttrList" type="{http://www.esb.com/crm/crmservice/biz}ChangeAttrListType" minOccurs="0"/&gt;
 *         &lt;element name="ParaList" type="{http://www.esb.com/crm/crmservice/biz}ParaListType" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRecList" type="{http://www.esb.com/crm/crmservice/biz}BalanceRecListType" minOccurs="0"/&gt;
 *         &lt;element name="ProductFeeList" type="{http://www.esb.com/crm/crmservice/biz}ProductFeeListType" minOccurs="0"/&gt;
 *         &lt;element name="ProductOrderInfoList" type="{http://www.esb.com/crm/crmservice/biz}ProductOrderInfoListType" minOccurs="0"/&gt;
 *         &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSWorkOrderRequest", propOrder = {
    "msisdn",
    "changeType",
    "changeReason",
    "offerInfo",
    "eventDate",
    "originHost",
    "originRelam",
    "productEffectiveTime",
    "reserve2",
    "reserve3",
    "reserve4",
    "reserve5",
    "workOrderType",
    "imsi",
    "balance",
    "categoryIDs",
    "changeAttrList",
    "paraList",
    "balanceRecList",
    "productFeeList",
    "productOrderInfoList",
    "accessMode"
})
public class OCSWorkOrderRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "Msisdn")
    protected String msisdn;
    @XmlElement(name = "ChangeType", required = true)
    protected String changeType;
    @XmlElement(name = "ChangeReason", required = true)
    protected String changeReason;
    @XmlElement(name = "OfferInfo", required = true)
    protected OfferInfoType offerInfo;
    protected String eventDate;
    protected String originHost;
    protected String originRelam;
    protected String productEffectiveTime;
    protected String reserve2;
    protected String reserve3;
    protected String reserve4;
    protected String reserve5;
    protected String workOrderType;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "Balance")
    protected String balance;
    @XmlElement(name = "CategoryIDs")
    protected String categoryIDs;
    @XmlElement(name = "ChangeAttrList")
    protected ChangeAttrListType changeAttrList;
    @XmlElement(name = "ParaList")
    protected ParaListType paraList;
    @XmlElement(name = "BalanceRecList")
    protected BalanceRecListType balanceRecList;
    @XmlElement(name = "ProductFeeList")
    protected ProductFeeListType productFeeList;
    @XmlElement(name = "ProductOrderInfoList")
    protected ProductOrderInfoListType productOrderInfoList;
    @XmlElement(name = "AccessMode")
    protected Integer accessMode;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReason(String value) {
        this.changeReason = value;
    }

    /**
     * Gets the value of the offerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OfferInfoType }
     *     
     */
    public OfferInfoType getOfferInfo() {
        return offerInfo;
    }

    /**
     * Sets the value of the offerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferInfoType }
     *     
     */
    public void setOfferInfo(OfferInfoType value) {
        this.offerInfo = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDate(String value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the originHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginHost() {
        return originHost;
    }

    /**
     * Sets the value of the originHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginHost(String value) {
        this.originHost = value;
    }

    /**
     * Gets the value of the originRelam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginRelam() {
        return originRelam;
    }

    /**
     * Sets the value of the originRelam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginRelam(String value) {
        this.originRelam = value;
    }

    /**
     * Gets the value of the productEffectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductEffectiveTime() {
        return productEffectiveTime;
    }

    /**
     * Sets the value of the productEffectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductEffectiveTime(String value) {
        this.productEffectiveTime = value;
    }

    /**
     * Gets the value of the reserve2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * Sets the value of the reserve2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve2(String value) {
        this.reserve2 = value;
    }

    /**
     * Gets the value of the reserve3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * Sets the value of the reserve3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve3(String value) {
        this.reserve3 = value;
    }

    /**
     * Gets the value of the reserve4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * Sets the value of the reserve4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve4(String value) {
        this.reserve4 = value;
    }

    /**
     * Gets the value of the reserve5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * Sets the value of the reserve5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve5(String value) {
        this.reserve5 = value;
    }

    /**
     * Gets the value of the workOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderType() {
        return workOrderType;
    }

    /**
     * Sets the value of the workOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderType(String value) {
        this.workOrderType = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the categoryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryIDs() {
        return categoryIDs;
    }

    /**
     * Sets the value of the categoryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryIDs(String value) {
        this.categoryIDs = value;
    }

    /**
     * Gets the value of the changeAttrList property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAttrListType }
     *     
     */
    public ChangeAttrListType getChangeAttrList() {
        return changeAttrList;
    }

    /**
     * Sets the value of the changeAttrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAttrListType }
     *     
     */
    public void setChangeAttrList(ChangeAttrListType value) {
        this.changeAttrList = value;
    }

    /**
     * Gets the value of the paraList property.
     * 
     * @return
     *     possible object is
     *     {@link ParaListType }
     *     
     */
    public ParaListType getParaList() {
        return paraList;
    }

    /**
     * Sets the value of the paraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParaListType }
     *     
     */
    public void setParaList(ParaListType value) {
        this.paraList = value;
    }

    /**
     * Gets the value of the balanceRecList property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceRecListType }
     *     
     */
    public BalanceRecListType getBalanceRecList() {
        return balanceRecList;
    }

    /**
     * Sets the value of the balanceRecList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceRecListType }
     *     
     */
    public void setBalanceRecList(BalanceRecListType value) {
        this.balanceRecList = value;
    }

    /**
     * Gets the value of the productFeeList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFeeListType }
     *     
     */
    public ProductFeeListType getProductFeeList() {
        return productFeeList;
    }

    /**
     * Sets the value of the productFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFeeListType }
     *     
     */
    public void setProductFeeList(ProductFeeListType value) {
        this.productFeeList = value;
    }

    /**
     * Gets the value of the productOrderInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderInfoListType }
     *     
     */
    public ProductOrderInfoListType getProductOrderInfoList() {
        return productOrderInfoList;
    }

    /**
     * Sets the value of the productOrderInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderInfoListType }
     *     
     */
    public void setProductOrderInfoList(ProductOrderInfoListType value) {
        this.productOrderInfoList = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessMode(Integer value) {
        this.accessMode = value;
    }

}
