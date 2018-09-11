
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.StatementInfo;


/**
 * <p>Java class for ModifyStatementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyStatementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisterCust" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="SmtKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatementInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}StatementInfo" minOccurs="0"/&gt;
 *         &lt;element name="StatementScenario" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AddStatementScenario" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DelStatementScenario" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
@XmlType(name = "ModifyStatementRequest", propOrder = {
    "registerCust",
    "smtKey",
    "statementInfo",
    "statementScenario",
    "addressInfo"
})
public class ModifyStatementRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCust", required = true)
    protected CustAccessCode registerCust;
    @XmlElement(name = "SmtKey", required = true)
    protected String smtKey;
    @XmlElement(name = "StatementInfo")
    protected StatementInfo statementInfo;
    @XmlElement(name = "StatementScenario")
    protected ModifyStatementRequest.StatementScenario statementScenario;
    @XmlElement(name = "AddressInfo")
    protected Address addressInfo;

    /**
     * Gets the value of the registerCust property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getRegisterCust() {
        return registerCust;
    }

    /**
     * Sets the value of the registerCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setRegisterCust(CustAccessCode value) {
        this.registerCust = value;
    }

    /**
     * Gets the value of the smtKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtKey() {
        return smtKey;
    }

    /**
     * Sets the value of the smtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtKey(String value) {
        this.smtKey = value;
    }

    /**
     * Gets the value of the statementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getStatementInfo() {
        return statementInfo;
    }

    /**
     * Sets the value of the statementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setStatementInfo(StatementInfo value) {
        this.statementInfo = value;
    }

    /**
     * Gets the value of the statementScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyStatementRequest.StatementScenario }
     *     
     */
    public ModifyStatementRequest.StatementScenario getStatementScenario() {
        return statementScenario;
    }

    /**
     * Sets the value of the statementScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyStatementRequest.StatementScenario }
     *     
     */
    public void setStatementScenario(ModifyStatementRequest.StatementScenario value) {
        this.statementScenario = value;
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
     *         &lt;element name="AddStatementScenario" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DelStatementScenario" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
        "addStatementScenario",
        "delStatementScenario"
    })
    public static class StatementScenario
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AddStatementScenario")
        protected List<ModifyStatementRequest.StatementScenario.AddStatementScenario> addStatementScenario;
        @XmlElement(name = "DelStatementScenario")
        protected List<ModifyStatementRequest.StatementScenario.DelStatementScenario> delStatementScenario;

        /**
         * Gets the value of the addStatementScenario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addStatementScenario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddStatementScenario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModifyStatementRequest.StatementScenario.AddStatementScenario }
         * 
         * 
         */
        public List<ModifyStatementRequest.StatementScenario.AddStatementScenario> getAddStatementScenario() {
            if (addStatementScenario == null) {
                addStatementScenario = new ArrayList<ModifyStatementRequest.StatementScenario.AddStatementScenario>();
            }
            return this.addStatementScenario;
        }

        /**
         * Gets the value of the delStatementScenario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delStatementScenario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelStatementScenario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModifyStatementRequest.StatementScenario.DelStatementScenario }
         * 
         * 
         */
        public List<ModifyStatementRequest.StatementScenario.DelStatementScenario> getDelStatementScenario() {
            if (delStatementScenario == null) {
                delStatementScenario = new ArrayList<ModifyStatementRequest.StatementScenario.DelStatementScenario>();
            }
            return this.delStatementScenario;
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
         *         &lt;choice&gt;
         *           &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *           &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
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
            "accountKey",
            "subscriberKey",
            "effectiveTime",
            "expirationTime"
        })
        public static class AddStatementScenario
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AccountKey")
            protected String accountKey;
            @XmlElement(name = "SubscriberKey")
            protected String subscriberKey;
            @XmlElement(name = "EffectiveTime", required = true)
            protected EffectMode effectiveTime;
            @XmlElement(name = "ExpirationTime", required = true)
            protected String expirationTime;

            /**
             * Gets the value of the accountKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountKey() {
                return accountKey;
            }

            /**
             * Sets the value of the accountKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountKey(String value) {
                this.accountKey = value;
            }

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
         *         &lt;choice&gt;
         *           &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *           &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
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
            "accountKey",
            "subscriberKey",
            "expirationTime"
        })
        public static class DelStatementScenario
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AccountKey")
            protected String accountKey;
            @XmlElement(name = "SubscriberKey")
            protected String subscriberKey;
            @XmlElement(name = "ExpirationTime", required = true)
            protected EffectMode expirationTime;

            /**
             * Gets the value of the accountKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountKey() {
                return accountKey;
            }

            /**
             * Sets the value of the accountKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountKey(String value) {
                this.accountKey = value;
            }

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
             * Gets the value of the expirationTime property.
             * 
             * @return
             *     possible object is
             *     {@link EffectMode }
             *     
             */
            public EffectMode getExpirationTime() {
                return expirationTime;
            }

            /**
             * Sets the value of the expirationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link EffectMode }
             *     
             */
            public void setExpirationTime(EffectMode value) {
                this.expirationTime = value;
            }

        }

    }

}
