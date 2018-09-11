
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountBasicInfo;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustInfo;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.POfferingInst;


/**
 * <p>Java class for QueryCustomerInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
 *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
 *                   &lt;element name="OfferingInst" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
 *         &lt;element name="Subscriber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubscriberInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Subscriber"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="UserCustomer" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
 *                                         &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
 *                                       &lt;/choice&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
 *                   &lt;element name="SupplementaryOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
 *         &lt;element name="SubGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubGroupInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroup"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UserCustomer" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
 *                                         &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
 *                                       &lt;/choice&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
 *                             &lt;element name="RGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
 *                   &lt;element name="SupplementaryOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
 *         &lt;element name="Account" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AcctInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AcctCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UserCustomer" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
 *                                         &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
 *                                       &lt;/choice&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ParentAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RootAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo"/&gt;
 *                             &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AcctClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="AcctPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AutoPayChannelInfo"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="BillCycleOpenDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="BillCycleEndDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OfferingInst" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                             &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
@XmlType(name = "QueryCustomerInfoResult", propOrder = {
    "customer",
    "subscriber",
    "subGroup",
    "account"
})
public class QueryCustomerInfoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "Customer")
    protected QueryCustomerInfoResult.Customer customer;
    @XmlElement(name = "Subscriber")
    protected QueryCustomerInfoResult.Subscriber subscriber;
    @XmlElement(name = "SubGroup")
    protected QueryCustomerInfoResult.SubGroup subGroup;
    @XmlElement(name = "Account")
    protected List<QueryCustomerInfoResult.Account> account;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCustomerInfoResult.Customer }
     *     
     */
    public QueryCustomerInfoResult.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCustomerInfoResult.Customer }
     *     
     */
    public void setCustomer(QueryCustomerInfoResult.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCustomerInfoResult.Subscriber }
     *     
     */
    public QueryCustomerInfoResult.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCustomerInfoResult.Subscriber }
     *     
     */
    public void setSubscriber(QueryCustomerInfoResult.Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the subGroup property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCustomerInfoResult.SubGroup }
     *     
     */
    public QueryCustomerInfoResult.SubGroup getSubGroup() {
        return subGroup;
    }

    /**
     * Sets the value of the subGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCustomerInfoResult.SubGroup }
     *     
     */
    public void setSubGroup(QueryCustomerInfoResult.SubGroup value) {
        this.subGroup = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCustomerInfoResult.Account }
     * 
     * 
     */
    public List<QueryCustomerInfoResult.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<QueryCustomerInfoResult.Account>();
        }
        return this.account;
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
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AcctInfo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AcctCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UserCustomer" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
     *                               &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
     *                             &lt;/choice&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ParentAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RootAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo"/&gt;
     *                   &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AcctClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="AcctPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AutoPayChannelInfo"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="BillCycleOpenDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="BillCycleEndDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OfferingInst" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "acctKey",
        "acctInfo",
        "offeringInst"
    })
    public static class Account
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "AcctInfo", required = true)
        protected QueryCustomerInfoResult.Account.AcctInfo acctInfo;
        @XmlElement(name = "OfferingInst")
        protected List<QueryCustomerInfoResult.Account.OfferingInst> offeringInst;

        /**
         * Gets the value of the acctKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctKey() {
            return acctKey;
        }

        /**
         * Sets the value of the acctKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctKey(String value) {
            this.acctKey = value;
        }

        /**
         * Gets the value of the acctInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerInfoResult.Account.AcctInfo }
         *     
         */
        public QueryCustomerInfoResult.Account.AcctInfo getAcctInfo() {
            return acctInfo;
        }

        /**
         * Sets the value of the acctInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerInfoResult.Account.AcctInfo }
         *     
         */
        public void setAcctInfo(QueryCustomerInfoResult.Account.AcctInfo value) {
            this.acctInfo = value;
        }

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
         * {@link QueryCustomerInfoResult.Account.OfferingInst }
         * 
         * 
         */
        public List<QueryCustomerInfoResult.Account.OfferingInst> getOfferingInst() {
            if (offeringInst == null) {
                offeringInst = new ArrayList<QueryCustomerInfoResult.Account.OfferingInst>();
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
         *         &lt;element name="AcctCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="UserCustomer" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
         *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
         *                   &lt;/choice&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ParentAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RootAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo"/&gt;
         *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AcctClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="AcctPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AutoPayChannelInfo"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="BillCycleOpenDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="BillCycleEndDate" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
            "acctCode",
            "userCustomerKey",
            "userCustomer",
            "parentAcctKey",
            "rootAcctKey",
            "acctBasicInfo",
            "billCycleType",
            "acctType",
            "paymentType",
            "acctClass",
            "currencyID",
            "acctPayMethod",
            "autoPayChannel",
            "addressInfo",
            "billCycleOpenDate",
            "billCycleEndDate"
        })
        public static class AcctInfo
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AcctCode", required = true)
            protected String acctCode;
            @XmlElement(name = "UserCustomerKey")
            protected String userCustomerKey;
            @XmlElement(name = "UserCustomer")
            protected QueryCustomerInfoResult.Account.AcctInfo.UserCustomer userCustomer;
            @XmlElement(name = "ParentAcctKey")
            protected String parentAcctKey;
            @XmlElement(name = "RootAcctKey")
            protected String rootAcctKey;
            @XmlElement(name = "AcctBasicInfo", required = true)
            protected AccountBasicInfo acctBasicInfo;
            @XmlElement(name = "BillCycleType", required = true)
            protected String billCycleType;
            @XmlElement(name = "AcctType", required = true)
            protected String acctType;
            @XmlElement(name = "PaymentType", required = true)
            protected String paymentType;
            @XmlElement(name = "AcctClass", required = true)
            protected String acctClass;
            @XmlElement(name = "CurrencyID", required = true)
            protected BigInteger currencyID;
            @XmlElement(name = "AcctPayMethod", required = true)
            protected String acctPayMethod;
            @XmlElement(name = "AutoPayChannel")
            protected List<QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel> autoPayChannel;
            @XmlElement(name = "AddressInfo")
            protected List<Address> addressInfo;
            @XmlElement(name = "BillCycleOpenDate")
            protected String billCycleOpenDate;
            @XmlElement(name = "BillCycleEndDate")
            protected String billCycleEndDate;

            /**
             * Gets the value of the acctCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctCode() {
                return acctCode;
            }

            /**
             * Sets the value of the acctCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctCode(String value) {
                this.acctCode = value;
            }

            /**
             * Gets the value of the userCustomerKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserCustomerKey() {
                return userCustomerKey;
            }

            /**
             * Sets the value of the userCustomerKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserCustomerKey(String value) {
                this.userCustomerKey = value;
            }

            /**
             * Gets the value of the userCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link QueryCustomerInfoResult.Account.AcctInfo.UserCustomer }
             *     
             */
            public QueryCustomerInfoResult.Account.AcctInfo.UserCustomer getUserCustomer() {
                return userCustomer;
            }

            /**
             * Sets the value of the userCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryCustomerInfoResult.Account.AcctInfo.UserCustomer }
             *     
             */
            public void setUserCustomer(QueryCustomerInfoResult.Account.AcctInfo.UserCustomer value) {
                this.userCustomer = value;
            }

            /**
             * Gets the value of the parentAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentAcctKey() {
                return parentAcctKey;
            }

            /**
             * Sets the value of the parentAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentAcctKey(String value) {
                this.parentAcctKey = value;
            }

            /**
             * Gets the value of the rootAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRootAcctKey() {
                return rootAcctKey;
            }

            /**
             * Sets the value of the rootAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRootAcctKey(String value) {
                this.rootAcctKey = value;
            }

            /**
             * Gets the value of the acctBasicInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AccountBasicInfo }
             *     
             */
            public AccountBasicInfo getAcctBasicInfo() {
                return acctBasicInfo;
            }

            /**
             * Sets the value of the acctBasicInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccountBasicInfo }
             *     
             */
            public void setAcctBasicInfo(AccountBasicInfo value) {
                this.acctBasicInfo = value;
            }

            /**
             * Gets the value of the billCycleType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillCycleType() {
                return billCycleType;
            }

            /**
             * Sets the value of the billCycleType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillCycleType(String value) {
                this.billCycleType = value;
            }

            /**
             * Gets the value of the acctType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctType() {
                return acctType;
            }

            /**
             * Sets the value of the acctType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctType(String value) {
                this.acctType = value;
            }

            /**
             * Gets the value of the paymentType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentType() {
                return paymentType;
            }

            /**
             * Sets the value of the paymentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentType(String value) {
                this.paymentType = value;
            }

            /**
             * Gets the value of the acctClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctClass() {
                return acctClass;
            }

            /**
             * Sets the value of the acctClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctClass(String value) {
                this.acctClass = value;
            }

            /**
             * Gets the value of the currencyID property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCurrencyID() {
                return currencyID;
            }

            /**
             * Sets the value of the currencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCurrencyID(BigInteger value) {
                this.currencyID = value;
            }

            /**
             * Gets the value of the acctPayMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctPayMethod() {
                return acctPayMethod;
            }

            /**
             * Sets the value of the acctPayMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctPayMethod(String value) {
                this.acctPayMethod = value;
            }

            /**
             * Gets the value of the autoPayChannel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the autoPayChannel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAutoPayChannel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel }
             * 
             * 
             */
            public List<QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel> getAutoPayChannel() {
                if (autoPayChannel == null) {
                    autoPayChannel = new ArrayList<QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel>();
                }
                return this.autoPayChannel;
            }

            /**
             * Gets the value of the addressInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddressInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Address }
             * 
             * 
             */
            public List<Address> getAddressInfo() {
                if (addressInfo == null) {
                    addressInfo = new ArrayList<Address>();
                }
                return this.addressInfo;
            }

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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AutoPayChannelInfo"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
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
                "autoPayChannelKey",
                "autoPayChannelInfo"
            })
            public static class AutoPayChannel
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "AutoPayChannelKey", required = true)
                protected String autoPayChannelKey;
                @XmlElement(name = "AutoPayChannelInfo", required = true)
                protected QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo autoPayChannelInfo;

                /**
                 * Gets the value of the autoPayChannelKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAutoPayChannelKey() {
                    return autoPayChannelKey;
                }

                /**
                 * Sets the value of the autoPayChannelKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAutoPayChannelKey(String value) {
                    this.autoPayChannelKey = value;
                }

                /**
                 * Gets the value of the autoPayChannelInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo }
                 *     
                 */
                public QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo getAutoPayChannelInfo() {
                    return autoPayChannelInfo;
                }

                /**
                 * Sets the value of the autoPayChannelInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo }
                 *     
                 */
                public void setAutoPayChannelInfo(QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo value) {
                    this.autoPayChannelInfo = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AutoPayChannelInfo
                    extends com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;

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
             *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
             *         &lt;choice&gt;
             *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
             *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
             *         &lt;/choice&gt;
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
                "custKey",
                "custInfo",
                "individualInfo",
                "orgInfo"
            })
            public static class UserCustomer
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "CustKey", required = true)
                protected String custKey;
                @XmlElement(name = "CustInfo", required = true)
                protected CustInfo custInfo;
                @XmlElement(name = "IndividualInfo")
                protected IndividualInfo individualInfo;
                @XmlElement(name = "OrgInfo")
                protected OrgInfo orgInfo;

                /**
                 * Gets the value of the custKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustKey() {
                    return custKey;
                }

                /**
                 * Sets the value of the custKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustKey(String value) {
                    this.custKey = value;
                }

                /**
                 * Gets the value of the custInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CustInfo }
                 *     
                 */
                public CustInfo getCustInfo() {
                    return custInfo;
                }

                /**
                 * Sets the value of the custInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CustInfo }
                 *     
                 */
                public void setCustInfo(CustInfo value) {
                    this.custInfo = value;
                }

                /**
                 * Gets the value of the individualInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IndividualInfo }
                 *     
                 */
                public IndividualInfo getIndividualInfo() {
                    return individualInfo;
                }

                /**
                 * Sets the value of the individualInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IndividualInfo }
                 *     
                 */
                public void setIndividualInfo(IndividualInfo value) {
                    this.individualInfo = value;
                }

                /**
                 * Gets the value of the orgInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrgInfo }
                 *     
                 */
                public OrgInfo getOrgInfo() {
                    return orgInfo;
                }

                /**
                 * Sets the value of the orgInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrgInfo }
                 *     
                 */
                public void setOrgInfo(OrgInfo value) {
                    this.orgInfo = value;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "expirationTime",
            "activationMode",
            "activationTime",
            "activeTimeLimit"
        })
        public static class OfferingInst
            extends com.huawei.bme.cbsinterface.bccommon.OfferingInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "EffectiveTime", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationMode", required = true)
            protected String activationMode;
            @XmlElement(name = "ActivationTime")
            protected String activationTime;
            @XmlElement(name = "ActiveTimeLimit", required = true)
            protected String activeTimeLimit;

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

            /**
             * Gets the value of the activationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationMode() {
                return activationMode;
            }

            /**
             * Sets the value of the activationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationMode(String value) {
                this.activationMode = value;
            }

            /**
             * Gets the value of the activationTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationTime() {
                return activationTime;
            }

            /**
             * Sets the value of the activationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationTime(String value) {
                this.activationTime = value;
            }

            /**
             * Gets the value of the activeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveTimeLimit() {
                return activeTimeLimit;
            }

            /**
             * Sets the value of the activeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveTimeLimit(String value) {
                this.activeTimeLimit = value;
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
     *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
     *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
     *         &lt;element name="OfferingInst" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "custKey",
        "custInfo",
        "individualInfo",
        "orgInfo",
        "addressInfo",
        "offeringInst"
    })
    public static class Customer
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CustKey", required = true)
        protected String custKey;
        @XmlElement(name = "CustInfo", required = true)
        protected CustInfo custInfo;
        @XmlElement(name = "IndividualInfo")
        protected IndividualInfo individualInfo;
        @XmlElement(name = "OrgInfo")
        protected OrgInfo orgInfo;
        @XmlElement(name = "AddressInfo")
        protected Address addressInfo;
        @XmlElement(name = "OfferingInst")
        protected List<QueryCustomerInfoResult.Customer.OfferingInst> offeringInst;

        /**
         * Gets the value of the custKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustKey() {
            return custKey;
        }

        /**
         * Sets the value of the custKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustKey(String value) {
            this.custKey = value;
        }

        /**
         * Gets the value of the custInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfo }
         *     
         */
        public CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Sets the value of the custInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfo }
         *     
         */
        public void setCustInfo(CustInfo value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the individualInfo property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualInfo }
         *     
         */
        public IndividualInfo getIndividualInfo() {
            return individualInfo;
        }

        /**
         * Sets the value of the individualInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualInfo }
         *     
         */
        public void setIndividualInfo(IndividualInfo value) {
            this.individualInfo = value;
        }

        /**
         * Gets the value of the orgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OrgInfo }
         *     
         */
        public OrgInfo getOrgInfo() {
            return orgInfo;
        }

        /**
         * Sets the value of the orgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgInfo }
         *     
         */
        public void setOrgInfo(OrgInfo value) {
            this.orgInfo = value;
        }

        /**
         * Gets the value of the addressInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Address }
         *     
         */
        public Address getAddressInfo() {
            return addressInfo;
        }

        /**
         * Sets the value of the addressInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Address }
         *     
         */
        public void setAddressInfo(Address value) {
            this.addressInfo = value;
        }

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
         * {@link QueryCustomerInfoResult.Customer.OfferingInst }
         * 
         * 
         */
        public List<QueryCustomerInfoResult.Customer.OfferingInst> getOfferingInst() {
            if (offeringInst == null) {
                offeringInst = new ArrayList<QueryCustomerInfoResult.Customer.OfferingInst>();
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
            "expirationTime",
            "activationMode",
            "activationTime",
            "activeTimeLimit"
        })
        public static class OfferingInst
            extends com.huawei.bme.cbsinterface.bccommon.OfferingInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "EffectiveTime", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationMode", required = true)
            protected String activationMode;
            @XmlElement(name = "ActivationTime")
            protected String activationTime;
            @XmlElement(name = "ActiveTimeLimit")
            protected String activeTimeLimit;

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

            /**
             * Gets the value of the activationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationMode() {
                return activationMode;
            }

            /**
             * Sets the value of the activationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationMode(String value) {
                this.activationMode = value;
            }

            /**
             * Gets the value of the activationTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationTime() {
                return activationTime;
            }

            /**
             * Sets the value of the activationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationTime(String value) {
                this.activationTime = value;
            }

            /**
             * Gets the value of the activeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveTimeLimit() {
                return activeTimeLimit;
            }

            /**
             * Sets the value of the activeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveTimeLimit(String value) {
                this.activeTimeLimit = value;
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
     *         &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubGroupInfo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroup"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UserCustomer" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
     *                               &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
     *                             &lt;/choice&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
     *                   &lt;element name="RGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
     *         &lt;element name="SupplementaryOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "subGroupKey",
        "subGroupInfo",
        "primaryOffering",
        "supplementaryOffering"
    })
    public static class SubGroup
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubGroupKey", required = true)
        protected String subGroupKey;
        @XmlElement(name = "SubGroupInfo", required = true)
        protected QueryCustomerInfoResult.SubGroup.SubGroupInfo subGroupInfo;
        @XmlElement(name = "PrimaryOffering", required = true)
        protected POfferingInst primaryOffering;
        @XmlElement(name = "SupplementaryOffering")
        protected List<QueryCustomerInfoResult.SubGroup.SupplementaryOffering> supplementaryOffering;

        /**
         * Gets the value of the subGroupKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubGroupKey() {
            return subGroupKey;
        }

        /**
         * Sets the value of the subGroupKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubGroupKey(String value) {
            this.subGroupKey = value;
        }

        /**
         * Gets the value of the subGroupInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerInfoResult.SubGroup.SubGroupInfo }
         *     
         */
        public QueryCustomerInfoResult.SubGroup.SubGroupInfo getSubGroupInfo() {
            return subGroupInfo;
        }

        /**
         * Sets the value of the subGroupInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerInfoResult.SubGroup.SubGroupInfo }
         *     
         */
        public void setSubGroupInfo(QueryCustomerInfoResult.SubGroup.SubGroupInfo value) {
            this.subGroupInfo = value;
        }

        /**
         * Gets the value of the primaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link POfferingInst }
         *     
         */
        public POfferingInst getPrimaryOffering() {
            return primaryOffering;
        }

        /**
         * Sets the value of the primaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link POfferingInst }
         *     
         */
        public void setPrimaryOffering(POfferingInst value) {
            this.primaryOffering = value;
        }

        /**
         * Gets the value of the supplementaryOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplementaryOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplementaryOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryCustomerInfoResult.SubGroup.SupplementaryOffering }
         * 
         * 
         */
        public List<QueryCustomerInfoResult.SubGroup.SupplementaryOffering> getSupplementaryOffering() {
            if (supplementaryOffering == null) {
                supplementaryOffering = new ArrayList<QueryCustomerInfoResult.SubGroup.SupplementaryOffering>();
            }
            return this.supplementaryOffering;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroup"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UserCustomer" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
         *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
         *                   &lt;/choice&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
         *         &lt;element name="RGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "groupType",
            "status",
            "statusDetail",
            "userCustomer",
            "addressInfo",
            "rGroupKey"
        })
        public static class SubGroupInfo
            extends com.huawei.bme.cbsinterface.bccommon.SubGroup
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "GroupType", required = true)
            protected String groupType;
            @XmlElement(name = "Status", required = true)
            protected String status;
            @XmlElement(name = "StatusDetail", required = true)
            protected String statusDetail;
            @XmlElement(name = "UserCustomer")
            protected QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer userCustomer;
            @XmlElement(name = "AddressInfo")
            protected Address addressInfo;
            @XmlElement(name = "RGroupKey")
            protected String rGroupKey;

            /**
             * Gets the value of the groupType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupType() {
                return groupType;
            }

            /**
             * Sets the value of the groupType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupType(String value) {
                this.groupType = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the statusDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusDetail() {
                return statusDetail;
            }

            /**
             * Sets the value of the statusDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusDetail(String value) {
                this.statusDetail = value;
            }

            /**
             * Gets the value of the userCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer }
             *     
             */
            public QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer getUserCustomer() {
                return userCustomer;
            }

            /**
             * Sets the value of the userCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer }
             *     
             */
            public void setUserCustomer(QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer value) {
                this.userCustomer = value;
            }

            /**
             * Gets the value of the addressInfo property.
             * 
             * @return
             *     possible object is
             *     {@link Address }
             *     
             */
            public Address getAddressInfo() {
                return addressInfo;
            }

            /**
             * Sets the value of the addressInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Address }
             *     
             */
            public void setAddressInfo(Address value) {
                this.addressInfo = value;
            }

            /**
             * Gets the value of the rGroupKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRGroupKey() {
                return rGroupKey;
            }

            /**
             * Sets the value of the rGroupKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRGroupKey(String value) {
                this.rGroupKey = value;
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
             *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
             *         &lt;choice&gt;
             *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
             *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
             *         &lt;/choice&gt;
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
                "custKey",
                "custInfo",
                "individualInfo",
                "orgInfo"
            })
            public static class UserCustomer
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "CustKey", required = true)
                protected String custKey;
                @XmlElement(name = "CustInfo", required = true)
                protected CustInfo custInfo;
                @XmlElement(name = "IndividualInfo")
                protected IndividualInfo individualInfo;
                @XmlElement(name = "OrgInfo")
                protected OrgInfo orgInfo;

                /**
                 * Gets the value of the custKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustKey() {
                    return custKey;
                }

                /**
                 * Sets the value of the custKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustKey(String value) {
                    this.custKey = value;
                }

                /**
                 * Gets the value of the custInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CustInfo }
                 *     
                 */
                public CustInfo getCustInfo() {
                    return custInfo;
                }

                /**
                 * Sets the value of the custInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CustInfo }
                 *     
                 */
                public void setCustInfo(CustInfo value) {
                    this.custInfo = value;
                }

                /**
                 * Gets the value of the individualInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IndividualInfo }
                 *     
                 */
                public IndividualInfo getIndividualInfo() {
                    return individualInfo;
                }

                /**
                 * Sets the value of the individualInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IndividualInfo }
                 *     
                 */
                public void setIndividualInfo(IndividualInfo value) {
                    this.individualInfo = value;
                }

                /**
                 * Gets the value of the orgInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrgInfo }
                 *     
                 */
                public OrgInfo getOrgInfo() {
                    return orgInfo;
                }

                /**
                 * Sets the value of the orgInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrgInfo }
                 *     
                 */
                public void setOrgInfo(OrgInfo value) {
                    this.orgInfo = value;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "expirationTime",
            "activationMode",
            "activationTime",
            "activeTimeLimit"
        })
        public static class SupplementaryOffering
            extends com.huawei.bme.cbsinterface.bccommon.OfferingInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "EffectiveTime", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationMode", required = true)
            protected String activationMode;
            @XmlElement(name = "ActivationTime")
            protected String activationTime;
            @XmlElement(name = "ActiveTimeLimit", required = true)
            protected String activeTimeLimit;

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

            /**
             * Gets the value of the activationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationMode() {
                return activationMode;
            }

            /**
             * Sets the value of the activationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationMode(String value) {
                this.activationMode = value;
            }

            /**
             * Gets the value of the activationTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationTime() {
                return activationTime;
            }

            /**
             * Sets the value of the activationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationTime(String value) {
                this.activationTime = value;
            }

            /**
             * Gets the value of the activeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveTimeLimit() {
                return activeTimeLimit;
            }

            /**
             * Sets the value of the activeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveTimeLimit(String value) {
                this.activeTimeLimit = value;
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
     *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubscriberInfo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Subscriber"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="UserCustomer" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
     *                               &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
     *                             &lt;/choice&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/&gt;
     *         &lt;element name="SupplementaryOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                   &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
        "subscriberKey",
        "subscriberInfo",
        "paymentMode",
        "primaryOffering",
        "supplementaryOffering"
    })
    public static class Subscriber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubscriberKey", required = true)
        protected String subscriberKey;
        @XmlElement(name = "SubscriberInfo", required = true)
        protected QueryCustomerInfoResult.Subscriber.SubscriberInfo subscriberInfo;
        @XmlElement(name = "PaymentMode", required = true, nillable = true)
        protected String paymentMode;
        @XmlElement(name = "PrimaryOffering", required = true)
        protected POfferingInst primaryOffering;
        @XmlElement(name = "SupplementaryOffering")
        protected List<QueryCustomerInfoResult.Subscriber.SupplementaryOffering> supplementaryOffering;

        /**
         * Gets the value of the subscriberKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberKey() {
            return subscriberKey;
        }

        /**
         * Sets the value of the subscriberKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberKey(String value) {
            this.subscriberKey = value;
        }

        /**
         * Gets the value of the subscriberInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCustomerInfoResult.Subscriber.SubscriberInfo }
         *     
         */
        public QueryCustomerInfoResult.Subscriber.SubscriberInfo getSubscriberInfo() {
            return subscriberInfo;
        }

        /**
         * Sets the value of the subscriberInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCustomerInfoResult.Subscriber.SubscriberInfo }
         *     
         */
        public void setSubscriberInfo(QueryCustomerInfoResult.Subscriber.SubscriberInfo value) {
            this.subscriberInfo = value;
        }

        /**
         * Gets the value of the paymentMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentMode() {
            return paymentMode;
        }

        /**
         * Sets the value of the paymentMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentMode(String value) {
            this.paymentMode = value;
        }

        /**
         * Gets the value of the primaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link POfferingInst }
         *     
         */
        public POfferingInst getPrimaryOffering() {
            return primaryOffering;
        }

        /**
         * Sets the value of the primaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link POfferingInst }
         *     
         */
        public void setPrimaryOffering(POfferingInst value) {
            this.primaryOffering = value;
        }

        /**
         * Gets the value of the supplementaryOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplementaryOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplementaryOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryCustomerInfoResult.Subscriber.SupplementaryOffering }
         * 
         * 
         */
        public List<QueryCustomerInfoResult.Subscriber.SupplementaryOffering> getSupplementaryOffering() {
            if (supplementaryOffering == null) {
                supplementaryOffering = new ArrayList<QueryCustomerInfoResult.Subscriber.SupplementaryOffering>();
            }
            return this.supplementaryOffering;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}Subscriber"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="UserCustomer" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
         *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
         *                   &lt;/choice&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
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
            "statusDetail",
            "activationTime",
            "userCustomer",
            "addressInfo"
        })
        public static class SubscriberInfo
            extends com.huawei.bme.cbsinterface.bccommon.Subscriber
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "StatusDetail", required = true)
            protected String statusDetail;
            @XmlElement(name = "ActivationTime")
            protected String activationTime;
            @XmlElement(name = "UserCustomer")
            protected QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer userCustomer;
            @XmlElement(name = "AddressInfo")
            protected Address addressInfo;

            /**
             * Gets the value of the statusDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusDetail() {
                return statusDetail;
            }

            /**
             * Sets the value of the statusDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusDetail(String value) {
                this.statusDetail = value;
            }

            /**
             * Gets the value of the activationTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationTime() {
                return activationTime;
            }

            /**
             * Sets the value of the activationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationTime(String value) {
                this.activationTime = value;
            }

            /**
             * Gets the value of the userCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer }
             *     
             */
            public QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer getUserCustomer() {
                return userCustomer;
            }

            /**
             * Sets the value of the userCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer }
             *     
             */
            public void setUserCustomer(QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer value) {
                this.userCustomer = value;
            }

            /**
             * Gets the value of the addressInfo property.
             * 
             * @return
             *     possible object is
             *     {@link Address }
             *     
             */
            public Address getAddressInfo() {
                return addressInfo;
            }

            /**
             * Sets the value of the addressInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Address }
             *     
             */
            public void setAddressInfo(Address value) {
                this.addressInfo = value;
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
             *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
             *         &lt;choice&gt;
             *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo"/&gt;
             *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo"/&gt;
             *         &lt;/choice&gt;
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
                "custKey",
                "custInfo",
                "individualInfo",
                "orgInfo"
            })
            public static class UserCustomer
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "CustKey", required = true)
                protected String custKey;
                @XmlElement(name = "CustInfo", required = true)
                protected CustInfo custInfo;
                @XmlElement(name = "IndividualInfo")
                protected IndividualInfo individualInfo;
                @XmlElement(name = "OrgInfo")
                protected OrgInfo orgInfo;

                /**
                 * Gets the value of the custKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustKey() {
                    return custKey;
                }

                /**
                 * Sets the value of the custKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustKey(String value) {
                    this.custKey = value;
                }

                /**
                 * Gets the value of the custInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CustInfo }
                 *     
                 */
                public CustInfo getCustInfo() {
                    return custInfo;
                }

                /**
                 * Sets the value of the custInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CustInfo }
                 *     
                 */
                public void setCustInfo(CustInfo value) {
                    this.custInfo = value;
                }

                /**
                 * Gets the value of the individualInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IndividualInfo }
                 *     
                 */
                public IndividualInfo getIndividualInfo() {
                    return individualInfo;
                }

                /**
                 * Sets the value of the individualInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IndividualInfo }
                 *     
                 */
                public void setIndividualInfo(IndividualInfo value) {
                    this.individualInfo = value;
                }

                /**
                 * Gets the value of the orgInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrgInfo }
                 *     
                 */
                public OrgInfo getOrgInfo() {
                    return orgInfo;
                }

                /**
                 * Sets the value of the orgInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrgInfo }
                 *     
                 */
                public void setOrgInfo(OrgInfo value) {
                    this.orgInfo = value;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
         *         &lt;element name="ActivationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "expirationTime",
            "activationMode",
            "activationTime",
            "activeTimeLimit"
        })
        public static class SupplementaryOffering
            extends com.huawei.bme.cbsinterface.bccommon.OfferingInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "EffectiveTime", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationMode", required = true)
            protected String activationMode;
            @XmlElement(name = "ActivationTime")
            protected String activationTime;
            @XmlElement(name = "ActiveTimeLimit", required = true)
            protected String activeTimeLimit;

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

            /**
             * Gets the value of the activationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationMode() {
                return activationMode;
            }

            /**
             * Sets the value of the activationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationMode(String value) {
                this.activationMode = value;
            }

            /**
             * Gets the value of the activationTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivationTime() {
                return activationTime;
            }

            /**
             * Sets the value of the activationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivationTime(String value) {
                this.activationTime = value;
            }

            /**
             * Gets the value of the activeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveTimeLimit() {
                return activeTimeLimit;
            }

            /**
             * Sets the value of the activeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveTimeLimit(String value) {
                this.activeTimeLimit = value;
            }

        }

    }

}
