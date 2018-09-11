
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBasicInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBasicInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubscriberAccount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Account"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Account"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "QueryBasicInfoResult", propOrder = {
    "customer",
    "subscriberAccount",
    "account"
})
public class QueryBasicInfoResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Customer")
    protected QueryBasicInfoResult.Customer customer;
    @XmlElement(name = "SubscriberAccount")
    protected QueryBasicInfoResult.SubscriberAccount subscriberAccount;
    @XmlElement(name = "Account")
    protected List<QueryBasicInfoResult.Account> account;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBasicInfoResult.Customer }
     *     
     */
    public QueryBasicInfoResult.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBasicInfoResult.Customer }
     *     
     */
    public void setCustomer(QueryBasicInfoResult.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the subscriberAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBasicInfoResult.SubscriberAccount }
     *     
     */
    public QueryBasicInfoResult.SubscriberAccount getSubscriberAccount() {
        return subscriberAccount;
    }

    /**
     * Sets the value of the subscriberAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBasicInfoResult.SubscriberAccount }
     *     
     */
    public void setSubscriberAccount(QueryBasicInfoResult.SubscriberAccount value) {
        this.subscriberAccount = value;
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
     * {@link QueryBasicInfoResult.Account }
     * 
     * 
     */
    public List<QueryBasicInfoResult.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<QueryBasicInfoResult.Account>();
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
     *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Account"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "subscriberNo"
    })
    public static class Account
        extends com.esb.bme.cbsinterface.cbs.businessmgr.Account
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "SubscriberNo")
        protected List<String> subscriberNo;

        /**
         * Gets the value of the subscriberNo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriberNo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriberNo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubscriberNo() {
            if (subscriberNo == null) {
                subscriberNo = new ArrayList<String>();
            }
            return this.subscriberNo;
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
     *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Customer
        extends IndividualCustomer
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
     *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Account"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "subscriberNo"
    })
    public static class SubscriberAccount
        extends com.esb.bme.cbsinterface.cbs.businessmgr.Account
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "SubscriberNo")
        protected List<String> subscriberNo;

        /**
         * Gets the value of the subscriberNo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriberNo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriberNo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubscriberNo() {
            if (subscriberNo == null) {
                subscriberNo = new ArrayList<String>();
            }
            return this.subscriberNo;
        }

    }

}
