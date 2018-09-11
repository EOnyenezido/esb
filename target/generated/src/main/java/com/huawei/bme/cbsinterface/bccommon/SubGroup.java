
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubGroupBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupBasicInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubGroup", propOrder = {
    "subGroupClass",
    "subGroupCode",
    "userCustomerKey",
    "pGroupKey",
    "password",
    "subGroupBasicInfo"
})
public class SubGroup
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "SubGroupClass")
    protected String subGroupClass;
    @XmlElement(name = "SubGroupCode")
    protected String subGroupCode;
    @XmlElement(name = "UserCustomerKey")
    protected String userCustomerKey;
    @XmlElement(name = "PGroupKey")
    protected String pGroupKey;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "SubGroupBasicInfo")
    protected SubGroupBasicInfo subGroupBasicInfo;

    /**
     * Gets the value of the subGroupClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupClass() {
        return subGroupClass;
    }

    /**
     * Sets the value of the subGroupClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupClass(String value) {
        this.subGroupClass = value;
    }

    /**
     * Gets the value of the subGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupCode() {
        return subGroupCode;
    }

    /**
     * Sets the value of the subGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupCode(String value) {
        this.subGroupCode = value;
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
     * Gets the value of the pGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGroupKey() {
        return pGroupKey;
    }

    /**
     * Sets the value of the pGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGroupKey(String value) {
        this.pGroupKey = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the subGroupBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupBasicInfo }
     *     
     */
    public SubGroupBasicInfo getSubGroupBasicInfo() {
        return subGroupBasicInfo;
    }

    /**
     * Sets the value of the subGroupBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupBasicInfo }
     *     
     */
    public void setSubGroupBasicInfo(SubGroupBasicInfo value) {
        this.subGroupBasicInfo = value;
    }

}
