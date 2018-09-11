
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.CustBasicInfo;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;


/**
 * <p>Java class for ChangeCustInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="CustInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustBasicInfo" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Individual" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
 *                     &lt;element name="Organization" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
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
@XmlType(name = "ChangeCustInfoRequest", propOrder = {
    "custAccessCode",
    "custInfo",
    "addressInfo"
})
public class ChangeCustInfoRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CustAccessCode", required = true)
    protected CustAccessCode custAccessCode;
    @XmlElement(name = "CustInfo", required = true)
    protected ChangeCustInfoRequest.CustInfo custInfo;
    @XmlElement(name = "AddressInfo")
    protected Address addressInfo;

    /**
     * Gets the value of the custAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getCustAccessCode() {
        return custAccessCode;
    }

    /**
     * Sets the value of the custAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setCustAccessCode(CustAccessCode value) {
        this.custAccessCode = value;
    }

    /**
     * Gets the value of the custInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustInfoRequest.CustInfo }
     *     
     */
    public ChangeCustInfoRequest.CustInfo getCustInfo() {
        return custInfo;
    }

    /**
     * Sets the value of the custInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustInfoRequest.CustInfo }
     *     
     */
    public void setCustInfo(ChangeCustInfoRequest.CustInfo value) {
        this.custInfo = value;
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
     *         &lt;element name="CustBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustBasicInfo" minOccurs="0"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="Individual" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
     *           &lt;element name="Organization" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
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
        "custBasicInfo",
        "individual",
        "organization"
    })
    public static class CustInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CustBasicInfo")
        protected CustBasicInfo custBasicInfo;
        @XmlElement(name = "Individual")
        protected IndividualInfo individual;
        @XmlElement(name = "Organization")
        protected OrgInfo organization;

        /**
         * Gets the value of the custBasicInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustBasicInfo }
         *     
         */
        public CustBasicInfo getCustBasicInfo() {
            return custBasicInfo;
        }

        /**
         * Sets the value of the custBasicInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustBasicInfo }
         *     
         */
        public void setCustBasicInfo(CustBasicInfo value) {
            this.custBasicInfo = value;
        }

        /**
         * Gets the value of the individual property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualInfo }
         *     
         */
        public IndividualInfo getIndividual() {
            return individual;
        }

        /**
         * Sets the value of the individual property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualInfo }
         *     
         */
        public void setIndividual(IndividualInfo value) {
            this.individual = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link OrgInfo }
         *     
         */
        public OrgInfo getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgInfo }
         *     
         */
        public void setOrganization(OrgInfo value) {
            this.organization = value;
        }

    }

}
