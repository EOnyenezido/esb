
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AccountInfo;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustInfo;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.SalesInfo;


/**
 * This interface is used to create a node of customer hierarchy, including Root Register Customer and User Customer (Org Unit or Person).
 * 
 * <p>Java class for CreateCustomerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisterCustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Customer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
 *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DFTAccount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SalesInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomerRequest", propOrder = {
    "registerCustKey",
    "customer",
    "dftAccount",
    "addressInfo",
    "salesInfo"
})
public class CreateCustomerRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCustKey", required = true)
    protected String registerCustKey;
    @XmlElement(name = "Customer", required = true)
    protected CreateCustomerRequest.Customer customer;
    @XmlElement(name = "DFTAccount")
    protected CreateCustomerRequest.DFTAccount dftAccount;
    @XmlElement(name = "AddressInfo")
    protected List<Address> addressInfo;
    @XmlElement(name = "SalesInfo")
    protected SalesInfo salesInfo;

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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomerRequest.Customer }
     *     
     */
    public CreateCustomerRequest.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomerRequest.Customer }
     *     
     */
    public void setCustomer(CreateCustomerRequest.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the dftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomerRequest.DFTAccount }
     *     
     */
    public CreateCustomerRequest.DFTAccount getDFTAccount() {
        return dftAccount;
    }

    /**
     * Sets the value of the dftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomerRequest.DFTAccount }
     *     
     */
    public void setDFTAccount(CreateCustomerRequest.DFTAccount value) {
        this.dftAccount = value;
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
     *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
     *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
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
     *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/&gt;
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
        "payRelationKey",
        "acctKey",
        "acctInfo"
    })
    public static class DFTAccount
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PayRelationKey", required = true)
        protected String payRelationKey;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "AcctInfo")
        protected AccountInfo acctInfo;

        /**
         * Gets the value of the payRelationKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayRelationKey() {
            return payRelationKey;
        }

        /**
         * Sets the value of the payRelationKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayRelationKey(String value) {
            this.payRelationKey = value;
        }

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

}
