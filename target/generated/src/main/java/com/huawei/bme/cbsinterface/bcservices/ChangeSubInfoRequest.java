
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.Address;
import com.huawei.bme.cbsinterface.bccommon.CustInfo;
import com.huawei.bme.cbsinterface.bccommon.IndividualInfo;
import com.huawei.bme.cbsinterface.bccommon.OrgInfo;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubBasicInfo;


/**
 * <p>Java class for ChangeSubInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="SubBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="UserCustomer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/&gt;
 *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeSubInfoRequest", propOrder = {
    "subAccessCode",
    "subBasicInfo",
    "userCustomer",
    "addressInfo"
})
public class ChangeSubInfoRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "SubBasicInfo")
    protected SubBasicInfo subBasicInfo;
    @XmlElement(name = "UserCustomer")
    protected ChangeSubInfoRequest.UserCustomer userCustomer;
    @XmlElement(name = "AddressInfo")
    protected Address addressInfo;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setSubAccessCode(SubAccessCode value) {
        this.subAccessCode = value;
    }

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubBasicInfo }
     *     
     */
    public SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(SubBasicInfo value) {
        this.subBasicInfo = value;
    }

    /**
     * Gets the value of the userCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubInfoRequest.UserCustomer }
     *     
     */
    public ChangeSubInfoRequest.UserCustomer getUserCustomer() {
        return userCustomer;
    }

    /**
     * Sets the value of the userCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubInfoRequest.UserCustomer }
     *     
     */
    public void setUserCustomer(ChangeSubInfoRequest.UserCustomer value) {
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
     *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/&gt;
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
    public static class UserCustomer
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CustKey", required = true)
        protected String custKey;
        @XmlElement(name = "CustInfo")
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
