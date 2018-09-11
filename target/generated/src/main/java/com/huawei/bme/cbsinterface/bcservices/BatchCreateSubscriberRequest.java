
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountForBatch;
import com.huawei.bme.cbsinterface.bccommon.ActiveMode;
import com.huawei.bme.cbsinterface.bccommon.CustomerForBatch;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.OfferingInst;
import com.huawei.bme.cbsinterface.bccommon.POfferingInst;
import com.huawei.bme.cbsinterface.bccommon.SalesInfo;
import com.huawei.bme.cbsinterface.bccommon.SubscriberForBatch;


/**
 * <p>Java class for BatchCreateSubscriberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchCreateSubscriberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustomerForBatch" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountForBatch" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="Subscriber"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubscriberForBatch"&gt;
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
 *                   &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AcctPaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SalesInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SalesInfo" minOccurs="0"/&gt;
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
@XmlType(name = "BatchCreateSubscriberRequest", propOrder = {
    "customer",
    "account",
    "subscriber",
    "primaryOffering",
    "supplementaryOffering",
    "salesInfo",
    "fileName"
})
public class BatchCreateSubscriberRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "Customer")
    protected CustomerForBatch customer;
    @XmlElement(name = "Account")
    protected List<AccountForBatch> account;
    @XmlElement(name = "Subscriber", required = true)
    protected BatchCreateSubscriberRequest.Subscriber subscriber;
    @XmlElement(name = "PrimaryOffering", required = true)
    protected POfferingInst primaryOffering;
    @XmlElement(name = "SupplementaryOffering")
    protected List<BatchCreateSubscriberRequest.SupplementaryOffering> supplementaryOffering;
    @XmlElement(name = "SalesInfo")
    protected SalesInfo salesInfo;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerForBatch }
     *     
     */
    public CustomerForBatch getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerForBatch }
     *     
     */
    public void setCustomer(CustomerForBatch value) {
        this.customer = value;
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
     * {@link AccountForBatch }
     * 
     * 
     */
    public List<AccountForBatch> getAccount() {
        if (account == null) {
            account = new ArrayList<AccountForBatch>();
        }
        return this.account;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCreateSubscriberRequest.Subscriber }
     *     
     */
    public BatchCreateSubscriberRequest.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCreateSubscriberRequest.Subscriber }
     *     
     */
    public void setSubscriber(BatchCreateSubscriberRequest.Subscriber value) {
        this.subscriber = value;
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
     * {@link BatchCreateSubscriberRequest.SupplementaryOffering }
     * 
     * 
     */
    public List<BatchCreateSubscriberRequest.SupplementaryOffering> getSupplementaryOffering() {
        if (supplementaryOffering == null) {
            supplementaryOffering = new ArrayList<BatchCreateSubscriberRequest.SupplementaryOffering>();
        }
        return this.supplementaryOffering;
    }

    /**
     * Gets the value of the salesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInfo }
     *     
     */
    public SalesInfo getSalesInfo() {
        return salesInfo;
    }

    /**
     * Sets the value of the salesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInfo }
     *     
     */
    public void setSalesInfo(SalesInfo value) {
        this.salesInfo = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubscriberForBatch"&gt;
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
        extends SubscriberForBatch
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;

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
     *         &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AcctPaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
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
        "ownerType",
        "acctPaymentMode",
        "effectiveTime",
        "expirationTime",
        "activationTime"
    })
    public static class SupplementaryOffering
        extends OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OwnerType")
        protected String ownerType;
        @XmlElement(name = "AcctPaymentMode")
        protected String acctPaymentMode;
        @XmlElement(name = "EffectiveTime", required = true)
        protected EffectMode effectiveTime;
        @XmlElement(name = "ExpirationTime", required = true)
        protected String expirationTime;
        @XmlElement(name = "ActivationTime")
        protected ActiveMode activationTime;

        /**
         * Gets the value of the ownerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerType() {
            return ownerType;
        }

        /**
         * Sets the value of the ownerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerType(String value) {
            this.ownerType = value;
        }

        /**
         * Gets the value of the acctPaymentMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctPaymentMode() {
            return acctPaymentMode;
        }

        /**
         * Sets the value of the acctPaymentMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctPaymentMode(String value) {
            this.acctPaymentMode = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link EffectMode }
         *     
         */
        public EffectMode getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link EffectMode }
         *     
         */
        public void setEffectiveTime(EffectMode value) {
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
         * Gets the value of the activationTime property.
         * 
         * @return
         *     possible object is
         *     {@link ActiveMode }
         *     
         */
        public ActiveMode getActivationTime() {
            return activationTime;
        }

        /**
         * Sets the value of the activationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActiveMode }
         *     
         */
        public void setActivationTime(ActiveMode value) {
            this.activationTime = value;
        }

    }

}
