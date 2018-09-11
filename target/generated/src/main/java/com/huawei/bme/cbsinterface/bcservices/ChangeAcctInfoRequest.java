
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountBasicInfo;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.AutoPayChannelInfo;


/**
 * <p>Java class for ChangeAcctInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcctInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctAccessCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AcctBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" minOccurs="0"/&gt;
 *         &lt;element name="AcctPayMethod" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OldPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AddAutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AutoPayChannelInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DelAutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ChangeAcctInfoRequest", propOrder = {
    "acctAccessCode",
    "acctBasicInfo",
    "addressInfo",
    "acctPayMethod"
})
public class ChangeAcctInfoRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "AcctAccessCode", required = true)
    protected ChangeAcctInfoRequest.AcctAccessCode acctAccessCode;
    @XmlElement(name = "AcctBasicInfo")
    protected AccountBasicInfo acctBasicInfo;
    @XmlElement(name = "AddressInfo")
    protected Address addressInfo;
    @XmlElement(name = "AcctPayMethod")
    protected ChangeAcctInfoRequest.AcctPayMethod acctPayMethod;

    /**
     * Gets the value of the acctAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctInfoRequest.AcctAccessCode }
     *     
     */
    public ChangeAcctInfoRequest.AcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Sets the value of the acctAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctInfoRequest.AcctAccessCode }
     *     
     */
    public void setAcctAccessCode(ChangeAcctInfoRequest.AcctAccessCode value) {
        this.acctAccessCode = value;
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
     * Gets the value of the acctPayMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAcctInfoRequest.AcctPayMethod }
     *     
     */
    public ChangeAcctInfoRequest.AcctPayMethod getAcctPayMethod() {
        return acctPayMethod;
    }

    /**
     * Sets the value of the acctPayMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAcctInfoRequest.AcctPayMethod }
     *     
     */
    public void setAcctPayMethod(ChangeAcctInfoRequest.AcctPayMethod value) {
        this.acctPayMethod = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "payType"
    })
    public static class AcctAccessCode
        extends com.huawei.bme.cbsinterface.bccommon.AcctAccessCode
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PayType")
        protected String payType;

        /**
         * Gets the value of the payType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayType() {
            return payType;
        }

        /**
         * Sets the value of the payType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayType(String value) {
            this.payType = value;
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
     *         &lt;element name="OldPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewPayMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AddAutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AutoPayChannelInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DelAutoPayChannel" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "oldPayMethod",
        "newPayMethod",
        "addAutoPayChannel",
        "delAutoPayChannel"
    })
    public static class AcctPayMethod
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OldPayMethod", required = true)
        protected String oldPayMethod;
        @XmlElement(name = "NewPayMethod", required = true)
        protected String newPayMethod;
        @XmlElement(name = "AddAutoPayChannel")
        protected List<ChangeAcctInfoRequest.AcctPayMethod.AddAutoPayChannel> addAutoPayChannel;
        @XmlElement(name = "DelAutoPayChannel")
        protected List<ChangeAcctInfoRequest.AcctPayMethod.DelAutoPayChannel> delAutoPayChannel;

        /**
         * Gets the value of the oldPayMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldPayMethod() {
            return oldPayMethod;
        }

        /**
         * Sets the value of the oldPayMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldPayMethod(String value) {
            this.oldPayMethod = value;
        }

        /**
         * Gets the value of the newPayMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewPayMethod() {
            return newPayMethod;
        }

        /**
         * Sets the value of the newPayMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewPayMethod(String value) {
            this.newPayMethod = value;
        }

        /**
         * Gets the value of the addAutoPayChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addAutoPayChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddAutoPayChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeAcctInfoRequest.AcctPayMethod.AddAutoPayChannel }
         * 
         * 
         */
        public List<ChangeAcctInfoRequest.AcctPayMethod.AddAutoPayChannel> getAddAutoPayChannel() {
            if (addAutoPayChannel == null) {
                addAutoPayChannel = new ArrayList<ChangeAcctInfoRequest.AcctPayMethod.AddAutoPayChannel>();
            }
            return this.addAutoPayChannel;
        }

        /**
         * Gets the value of the delAutoPayChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delAutoPayChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelAutoPayChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeAcctInfoRequest.AcctPayMethod.DelAutoPayChannel }
         * 
         * 
         */
        public List<ChangeAcctInfoRequest.AcctPayMethod.DelAutoPayChannel> getDelAutoPayChannel() {
            if (delAutoPayChannel == null) {
                delAutoPayChannel = new ArrayList<ChangeAcctInfoRequest.AcctPayMethod.DelAutoPayChannel>();
            }
            return this.delAutoPayChannel;
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
         *         &lt;element name="AutoPayChannelInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AutoPayChannelInfo"/&gt;
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
        public static class AddAutoPayChannel
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AutoPayChannelKey", required = true)
            protected String autoPayChannelKey;
            @XmlElement(name = "AutoPayChannelInfo", required = true)
            protected AutoPayChannelInfo autoPayChannelInfo;

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
             *     {@link AutoPayChannelInfo }
             *     
             */
            public AutoPayChannelInfo getAutoPayChannelInfo() {
                return autoPayChannelInfo;
            }

            /**
             * Sets the value of the autoPayChannelInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AutoPayChannelInfo }
             *     
             */
            public void setAutoPayChannelInfo(AutoPayChannelInfo value) {
                this.autoPayChannelInfo = value;
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
         *         &lt;element name="AutoPayChannelKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "autoPayChannelKey"
        })
        public static class DelAutoPayChannel
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AutoPayChannelKey", required = true)
            protected String autoPayChannelKey;

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

        }

    }

}
