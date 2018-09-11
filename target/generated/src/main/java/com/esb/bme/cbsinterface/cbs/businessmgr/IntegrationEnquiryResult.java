
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
 * <p>Java class for IntegrationEnquiryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationEnquiryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceRecordList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BalanceRecord" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}BalanceRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubscriberState" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="FirstActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ActiveCAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SuspendStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DisableStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="DPFlag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FraudState"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LossFlag" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="LockedFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="DPEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillingCycleDate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="BillCycleOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BillCycleEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubscriberInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Subscriber"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Subscriber"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="CurCycleStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CurCycleEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Service" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CumulativeItemList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CumulativeItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserGroupList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserGroup" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubAttachedInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
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
@XmlType(name = "IntegrationEnquiryResult", propOrder = {
    "balanceRecordList",
    "subscriberState",
    "billingCycleDate",
    "subscriberInfo",
    "cumulativeItemList",
    "userGroupList",
    "subAttachedInfo"
})
public class IntegrationEnquiryResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "BalanceRecordList")
    protected IntegrationEnquiryResult.BalanceRecordList balanceRecordList;
    @XmlElement(name = "SubscriberState")
    protected IntegrationEnquiryResult.SubscriberState subscriberState;
    @XmlElement(name = "BillingCycleDate")
    protected IntegrationEnquiryResult.BillingCycleDate billingCycleDate;
    @XmlElement(name = "SubscriberInfo")
    protected IntegrationEnquiryResult.SubscriberInfo subscriberInfo;
    @XmlElement(name = "CumulativeItemList")
    protected IntegrationEnquiryResult.CumulativeItemList cumulativeItemList;
    @XmlElement(name = "UserGroupList")
    protected IntegrationEnquiryResult.UserGroupList userGroupList;
    @XmlElement(name = "SubAttachedInfo")
    protected IntegrationEnquiryResult.SubAttachedInfo subAttachedInfo;

    /**
     * Gets the value of the balanceRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.BalanceRecordList }
     *     
     */
    public IntegrationEnquiryResult.BalanceRecordList getBalanceRecordList() {
        return balanceRecordList;
    }

    /**
     * Sets the value of the balanceRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.BalanceRecordList }
     *     
     */
    public void setBalanceRecordList(IntegrationEnquiryResult.BalanceRecordList value) {
        this.balanceRecordList = value;
    }

    /**
     * Gets the value of the subscriberState property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.SubscriberState }
     *     
     */
    public IntegrationEnquiryResult.SubscriberState getSubscriberState() {
        return subscriberState;
    }

    /**
     * Sets the value of the subscriberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.SubscriberState }
     *     
     */
    public void setSubscriberState(IntegrationEnquiryResult.SubscriberState value) {
        this.subscriberState = value;
    }

    /**
     * Gets the value of the billingCycleDate property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.BillingCycleDate }
     *     
     */
    public IntegrationEnquiryResult.BillingCycleDate getBillingCycleDate() {
        return billingCycleDate;
    }

    /**
     * Sets the value of the billingCycleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.BillingCycleDate }
     *     
     */
    public void setBillingCycleDate(IntegrationEnquiryResult.BillingCycleDate value) {
        this.billingCycleDate = value;
    }

    /**
     * Gets the value of the subscriberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.SubscriberInfo }
     *     
     */
    public IntegrationEnquiryResult.SubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Sets the value of the subscriberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.SubscriberInfo }
     *     
     */
    public void setSubscriberInfo(IntegrationEnquiryResult.SubscriberInfo value) {
        this.subscriberInfo = value;
    }

    /**
     * Gets the value of the cumulativeItemList property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.CumulativeItemList }
     *     
     */
    public IntegrationEnquiryResult.CumulativeItemList getCumulativeItemList() {
        return cumulativeItemList;
    }

    /**
     * Sets the value of the cumulativeItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.CumulativeItemList }
     *     
     */
    public void setCumulativeItemList(IntegrationEnquiryResult.CumulativeItemList value) {
        this.cumulativeItemList = value;
    }

    /**
     * Gets the value of the userGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.UserGroupList }
     *     
     */
    public IntegrationEnquiryResult.UserGroupList getUserGroupList() {
        return userGroupList;
    }

    /**
     * Sets the value of the userGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.UserGroupList }
     *     
     */
    public void setUserGroupList(IntegrationEnquiryResult.UserGroupList value) {
        this.userGroupList = value;
    }

    /**
     * Gets the value of the subAttachedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationEnquiryResult.SubAttachedInfo }
     *     
     */
    public IntegrationEnquiryResult.SubAttachedInfo getSubAttachedInfo() {
        return subAttachedInfo;
    }

    /**
     * Sets the value of the subAttachedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationEnquiryResult.SubAttachedInfo }
     *     
     */
    public void setSubAttachedInfo(IntegrationEnquiryResult.SubAttachedInfo value) {
        this.subAttachedInfo = value;
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
     *         &lt;element name="BalanceRecord" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}BalanceRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "balanceRecord"
    })
    public static class BalanceRecordList
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "BalanceRecord")
        protected List<BalanceRecordType> balanceRecord;

        /**
         * Gets the value of the balanceRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalanceRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BalanceRecordType }
         * 
         * 
         */
        public List<BalanceRecordType> getBalanceRecord() {
            if (balanceRecord == null) {
                balanceRecord = new ArrayList<BalanceRecordType>();
            }
            return this.balanceRecord;
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
     *       &lt;all&gt;
     *         &lt;element name="BillCycleOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BillCycleEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class BillingCycleDate
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "BillCycleOpenDate")
        protected String billCycleOpenDate;
        @XmlElement(name = "BillCycleEndDate")
        protected String billCycleEndDate;
        @XmlElementRef(name = "BillCycleType", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> billCycleType;

        /**
         * Gets the value of the billCycleOpenDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillCycleOpenDate() {
            return billCycleOpenDate;
        }

        /**
         * Sets the value of the billCycleOpenDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillCycleOpenDate(String value) {
            this.billCycleOpenDate = value;
        }

        /**
         * Gets the value of the billCycleEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillCycleEndDate() {
            return billCycleEndDate;
        }

        /**
         * Sets the value of the billCycleEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillCycleEndDate(String value) {
            this.billCycleEndDate = value;
        }

        /**
         * Gets the value of the billCycleType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getBillCycleType() {
            return billCycleType;
        }

        /**
         * Sets the value of the billCycleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setBillCycleType(JAXBElement<Integer> value) {
            this.billCycleType = value;
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
     *         &lt;element name="CumulativeItem" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                 &lt;/all&gt;
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
        "cumulativeItem"
    })
    public static class CumulativeItemList
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "CumulativeItem")
        protected List<IntegrationEnquiryResult.CumulativeItemList.CumulativeItem> cumulativeItem;

        /**
         * Gets the value of the cumulativeItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cumulativeItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCumulativeItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntegrationEnquiryResult.CumulativeItemList.CumulativeItem }
         * 
         * 
         */
        public List<IntegrationEnquiryResult.CumulativeItemList.CumulativeItem> getCumulativeItem() {
            if (cumulativeItem == null) {
                cumulativeItem = new ArrayList<IntegrationEnquiryResult.CumulativeItemList.CumulativeItem>();
            }
            return this.cumulativeItem;
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
         *       &lt;all&gt;
         *         &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class CumulativeItem
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;
            @XmlElement(name = "CumulateID", required = true, type = Integer.class, nillable = true)
            protected Integer cumulateID;
            @XmlElement(name = "CumulateBeginTime", required = true)
            protected String cumulateBeginTime;
            @XmlElement(name = "CumulateEndTime", required = true)
            protected String cumulateEndTime;
            @XmlElement(name = "CumulativeAmt", required = true, type = Integer.class, nillable = true)
            protected Integer cumulativeAmt;

            /**
             * Gets the value of the cumulateID property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCumulateID() {
                return cumulateID;
            }

            /**
             * Sets the value of the cumulateID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCumulateID(Integer value) {
                this.cumulateID = value;
            }

            /**
             * Gets the value of the cumulateBeginTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCumulateBeginTime() {
                return cumulateBeginTime;
            }

            /**
             * Sets the value of the cumulateBeginTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCumulateBeginTime(String value) {
                this.cumulateBeginTime = value;
            }

            /**
             * Gets the value of the cumulateEndTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCumulateEndTime() {
                return cumulateEndTime;
            }

            /**
             * Sets the value of the cumulateEndTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCumulateEndTime(String value) {
                this.cumulateEndTime = value;
            }

            /**
             * Gets the value of the cumulativeAmt property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCumulativeAmt() {
                return cumulativeAmt;
            }

            /**
             * Sets the value of the cumulativeAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCumulativeAmt(Integer value) {
                this.cumulativeAmt = value;
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
     *       &lt;all&gt;
     *         &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SubAttachedInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElementRef(name = "ChgMainProductTimes", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> chgMainProductTimes;
        @XmlElementRef(name = "ChgMainPackageTimes", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> chgMainPackageTimes;

        /**
         * Gets the value of the chgMainProductTimes property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getChgMainProductTimes() {
            return chgMainProductTimes;
        }

        /**
         * Sets the value of the chgMainProductTimes property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setChgMainProductTimes(JAXBElement<Integer> value) {
            this.chgMainProductTimes = value;
        }

        /**
         * Gets the value of the chgMainPackageTimes property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getChgMainPackageTimes() {
            return chgMainPackageTimes;
        }

        /**
         * Sets the value of the chgMainPackageTimes property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setChgMainPackageTimes(JAXBElement<Integer> value) {
            this.chgMainPackageTimes = value;
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
     *         &lt;element name="Subscriber"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Subscriber"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Product"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    @XmlType(name = "", propOrder = {
        "subscriber",
        "product",
        "service"
    })
    public static class SubscriberInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "Subscriber", required = true)
        protected IntegrationEnquiryResult.SubscriberInfo.Subscriber subscriber;
        @XmlElement(name = "Product")
        protected List<IntegrationEnquiryResult.SubscriberInfo.Product> product;
        @XmlElement(name = "Service")
        protected List<Service> service;

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link IntegrationEnquiryResult.SubscriberInfo.Subscriber }
         *     
         */
        public IntegrationEnquiryResult.SubscriberInfo.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntegrationEnquiryResult.SubscriberInfo.Subscriber }
         *     
         */
        public void setSubscriber(IntegrationEnquiryResult.SubscriberInfo.Subscriber value) {
            this.subscriber = value;
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
         * {@link IntegrationEnquiryResult.SubscriberInfo.Product }
         * 
         * 
         */
        public List<IntegrationEnquiryResult.SubscriberInfo.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<IntegrationEnquiryResult.SubscriberInfo.Product>();
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
         *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            @XmlElement(name = "EffectiveDate", required = true)
            protected String effectiveDate;
            @XmlElement(name = "ExpiredDate", required = true)
            protected String expiredDate;
            @XmlElement(name = "Status", required = true, type = Integer.class, nillable = true)
            protected Integer status;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Subscriber"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Subscriber
            extends com.esb.bme.cbsinterface.cbs.businessmgr.Subscriber
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;

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
     *       &lt;all&gt;
     *         &lt;element name="FirstActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ActiveCAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SuspendStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DisableStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="DPFlag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FraudState"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LossFlag" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="LockedFlag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="DPEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SubscriberState
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "FirstActiveDate")
        protected String firstActiveDate;
        @XmlElement(name = "ActiveCAC")
        protected String activeCAC;
        @XmlElement(name = "ActiveStop")
        protected String activeStop;
        @XmlElement(name = "SuspendStop")
        protected String suspendStop;
        @XmlElement(name = "DisableStop")
        protected String disableStop;
        @XmlElementRef(name = "LifeCycleState", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> lifeCycleState;
        @XmlElement(name = "DPFlag", required = true, type = Integer.class, nillable = true)
        protected Integer dpFlag;
        @XmlElement(name = "FraudState", required = true, type = Integer.class, nillable = true)
        protected Integer fraudState;
        @XmlElementRef(name = "LossFlag", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> lossFlag;
        @XmlElementRef(name = "POSUserState", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> posUserState;
        @XmlElement(name = "LockedFlag", required = true, type = Integer.class, nillable = true)
        protected Integer lockedFlag;
        @XmlElement(name = "DPEndDate")
        protected String dpEndDate;

        /**
         * Gets the value of the firstActiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstActiveDate() {
            return firstActiveDate;
        }

        /**
         * Sets the value of the firstActiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstActiveDate(String value) {
            this.firstActiveDate = value;
        }

        /**
         * Gets the value of the activeCAC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActiveCAC() {
            return activeCAC;
        }

        /**
         * Sets the value of the activeCAC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActiveCAC(String value) {
            this.activeCAC = value;
        }

        /**
         * Gets the value of the activeStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActiveStop() {
            return activeStop;
        }

        /**
         * Sets the value of the activeStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActiveStop(String value) {
            this.activeStop = value;
        }

        /**
         * Gets the value of the suspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuspendStop() {
            return suspendStop;
        }

        /**
         * Sets the value of the suspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuspendStop(String value) {
            this.suspendStop = value;
        }

        /**
         * Gets the value of the disableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisableStop() {
            return disableStop;
        }

        /**
         * Sets the value of the disableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisableStop(String value) {
            this.disableStop = value;
        }

        /**
         * Gets the value of the lifeCycleState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getLifeCycleState() {
            return lifeCycleState;
        }

        /**
         * Sets the value of the lifeCycleState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setLifeCycleState(JAXBElement<Integer> value) {
            this.lifeCycleState = value;
        }

        /**
         * Gets the value of the dpFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDPFlag() {
            return dpFlag;
        }

        /**
         * Sets the value of the dpFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDPFlag(Integer value) {
            this.dpFlag = value;
        }

        /**
         * Gets the value of the fraudState property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFraudState() {
            return fraudState;
        }

        /**
         * Sets the value of the fraudState property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFraudState(Integer value) {
            this.fraudState = value;
        }

        /**
         * Gets the value of the lossFlag property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getLossFlag() {
            return lossFlag;
        }

        /**
         * Sets the value of the lossFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setLossFlag(JAXBElement<Integer> value) {
            this.lossFlag = value;
        }

        /**
         * Gets the value of the posUserState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getPOSUserState() {
            return posUserState;
        }

        /**
         * Sets the value of the posUserState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setPOSUserState(JAXBElement<Integer> value) {
            this.posUserState = value;
        }

        /**
         * Gets the value of the lockedFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLockedFlag() {
            return lockedFlag;
        }

        /**
         * Sets the value of the lockedFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLockedFlag(Integer value) {
            this.lockedFlag = value;
        }

        /**
         * Gets the value of the dpEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDPEndDate() {
            return dpEndDate;
        }

        /**
         * Sets the value of the dpEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDPEndDate(String value) {
            this.dpEndDate = value;
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
     *         &lt;element name="UserGroup" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/all&gt;
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
        "userGroup"
    })
    public static class UserGroupList
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "UserGroup")
        protected List<IntegrationEnquiryResult.UserGroupList.UserGroup> userGroup;

        /**
         * Gets the value of the userGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntegrationEnquiryResult.UserGroupList.UserGroup }
         * 
         * 
         */
        public List<IntegrationEnquiryResult.UserGroupList.UserGroup> getUserGroup() {
            if (userGroup == null) {
                userGroup = new ArrayList<IntegrationEnquiryResult.UserGroupList.UserGroup>();
            }
            return this.userGroup;
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
         *       &lt;all&gt;
         *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class UserGroup
            implements Serializable
        {

            private final static long serialVersionUID = 11082013L;
            @XmlElement(name = "GroupID", required = true)
            protected String groupID;
            @XmlElement(name = "GroupName", required = true)
            protected String groupName;

            /**
             * Gets the value of the groupID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupID() {
                return groupID;
            }

            /**
             * Sets the value of the groupID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupID(String value) {
                this.groupID = value;
            }

            /**
             * Gets the value of the groupName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupName() {
                return groupName;
            }

            /**
             * Sets the value of the groupName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupName(String value) {
                this.groupName = value;
            }

        }

    }

}
