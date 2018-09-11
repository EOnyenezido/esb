
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountInfo;
import com.huawei.bme.cbsinterface.bccommon.ActiveMode;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.OfferingInst;


/**
 * <p>Java class for CreateAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisterCustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Account"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Offering" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAccountRequest", propOrder = {
    "registerCustKey",
    "account",
    "offering",
    "addressInfo"
})
public class CreateAccountRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCustKey", required = true)
    protected String registerCustKey;
    @XmlElement(name = "Account", required = true)
    protected CreateAccountRequest.Account account;
    @XmlElement(name = "Offering")
    protected List<CreateAccountRequest.Offering> offering;
    @XmlElement(name = "AddressInfo")
    protected Address addressInfo;

    /**
     * Gets the value of the registerCustKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterCustKey() {
        return registerCustKey;
    }

    /**
     * Sets the value of the registerCustKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterCustKey(String value) {
        this.registerCustKey = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAccountRequest.Account }
     *     
     */
    public CreateAccountRequest.Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAccountRequest.Account }
     *     
     */
    public void setAccount(CreateAccountRequest.Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the offering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateAccountRequest.Offering }
     * 
     * 
     */
    public List<CreateAccountRequest.Offering> getOffering() {
        if (offering == null) {
            offering = new ArrayList<CreateAccountRequest.Offering>();
        }
        return this.offering;
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
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo"/&gt;
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
        "acctInfo"
    })
    public static class Account
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "AcctInfo", required = true)
        protected AccountInfo acctInfo;

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
         *     {@link AccountInfo }
         *     
         */
        public AccountInfo getAcctInfo() {
            return acctInfo;
        }

        /**
         * Sets the value of the acctInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountInfo }
         *     
         */
        public void setAcctInfo(AccountInfo value) {
            this.acctInfo = value;
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
        "effectiveTime",
        "expirationTime",
        "activationTime"
    })
    public static class Offering
        extends OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "EffectiveTime", required = true)
        protected EffectMode effectiveTime;
        @XmlElement(name = "ExpirationTime", required = true)
        protected String expirationTime;
        @XmlElement(name = "ActivationTime")
        protected ActiveMode activationTime;

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
