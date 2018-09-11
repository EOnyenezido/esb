
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AcctAccessCode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;


/**
 * <p>Java class for ChangeAcctBillCycleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcctBillCycleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RootAccount"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SubAccount" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OldBillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewBillCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAcctBillCycleRequest", propOrder = {
    "account",
    "oldBillCycleType",
    "newBillCycleType",
    "effectiveTime"
})
public class ChangeAcctBillCycleRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "Account", required = true)
    protected ChangeAcctBillCycleRequest.Account account;
    @XmlElement(name = "OldBillCycleType")
    protected String oldBillCycleType;
    @XmlElement(name = "NewBillCycleType", required = true)
    protected String newBillCycleType;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctBillCycleRequest.Account }
     *     
     */
    public ChangeAcctBillCycleRequest.Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctBillCycleRequest.Account }
     *     
     */
    public void setAccount(ChangeAcctBillCycleRequest.Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the oldBillCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBillCycleType() {
        return oldBillCycleType;
    }

    /**
     * Sets the value of the oldBillCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBillCycleType(String value) {
        this.oldBillCycleType = value;
    }

    /**
     * Gets the value of the newBillCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBillCycleType() {
        return newBillCycleType;
    }

    /**
     * Sets the value of the newBillCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBillCycleType(String value) {
        this.newBillCycleType = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RootAccount"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubAccount" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
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
        "rootAccount",
        "subAccount"
    })
    public static class Account
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "RootAccount", required = true)
        protected ChangeAcctBillCycleRequest.Account.RootAccount rootAccount;
        @XmlElement(name = "SubAccount")
        protected List<ChangeAcctBillCycleRequest.Account.SubAccount> subAccount;

        /**
         * Gets the value of the rootAccount property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeAcctBillCycleRequest.Account.RootAccount }
         *     
         */
        public ChangeAcctBillCycleRequest.Account.RootAccount getRootAccount() {
            return rootAccount;
        }

        /**
         * Sets the value of the rootAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeAcctBillCycleRequest.Account.RootAccount }
         *     
         */
        public void setRootAccount(ChangeAcctBillCycleRequest.Account.RootAccount value) {
            this.rootAccount = value;
        }

        /**
         * Gets the value of the subAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeAcctBillCycleRequest.Account.SubAccount }
         * 
         * 
         */
        public List<ChangeAcctBillCycleRequest.Account.SubAccount> getSubAccount() {
            if (subAccount == null) {
                subAccount = new ArrayList<ChangeAcctBillCycleRequest.Account.SubAccount>();
            }
            return this.subAccount;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RootAccount
            extends AcctAccessCode
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SubAccount
            extends AcctAccessCode
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;

        }

    }

}
