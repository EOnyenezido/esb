
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDValidity" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgAddressKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgWebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgInfo", propOrder = {
    "idType",
    "idNumber",
    "idValidity",
    "orgType",
    "orgName",
    "orgShortName",
    "orgLevel",
    "orgAddressKey",
    "orgSize",
    "industry",
    "subIndustry",
    "orgPhoneNumber",
    "orgFaxNumber",
    "orgEmail",
    "orgWebSite",
    "orgProperty"
})
public class OrgInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElementRef(name = "IDType", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idType;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "IDValidity")
    protected String idValidity;
    @XmlElement(name = "OrgType")
    protected String orgType;
    @XmlElement(name = "OrgName")
    protected String orgName;
    @XmlElement(name = "OrgShortName")
    protected String orgShortName;
    @XmlElement(name = "OrgLevel")
    protected String orgLevel;
    @XmlElement(name = "OrgAddressKey")
    protected String orgAddressKey;
    @XmlElement(name = "OrgSize")
    protected String orgSize;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "SubIndustry")
    protected String subIndustry;
    @XmlElement(name = "OrgPhoneNumber")
    protected String orgPhoneNumber;
    @XmlElement(name = "OrgFaxNumber")
    protected String orgFaxNumber;
    @XmlElement(name = "OrgEmail")
    protected String orgEmail;
    @XmlElement(name = "OrgWebSite")
    protected String orgWebSite;
    @XmlElement(name = "OrgProperty")
    protected List<SimpleProperty> orgProperty;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDType(JAXBElement<String> value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDValidity() {
        return idValidity;
    }

    /**
     * Sets the value of the idValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDValidity(String value) {
        this.idValidity = value;
    }

    /**
     * Gets the value of the orgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * Sets the value of the orgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgType(String value) {
        this.orgType = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgShortName() {
        return orgShortName;
    }

    /**
     * Sets the value of the orgShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgShortName(String value) {
        this.orgShortName = value;
    }

    /**
     * Gets the value of the orgLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLevel() {
        return orgLevel;
    }

    /**
     * Sets the value of the orgLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLevel(String value) {
        this.orgLevel = value;
    }

    /**
     * Gets the value of the orgAddressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAddressKey() {
        return orgAddressKey;
    }

    /**
     * Sets the value of the orgAddressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAddressKey(String value) {
        this.orgAddressKey = value;
    }

    /**
     * Gets the value of the orgSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSize() {
        return orgSize;
    }

    /**
     * Sets the value of the orgSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSize(String value) {
        this.orgSize = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the subIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubIndustry() {
        return subIndustry;
    }

    /**
     * Sets the value of the subIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIndustry(String value) {
        this.subIndustry = value;
    }

    /**
     * Gets the value of the orgPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPhoneNumber() {
        return orgPhoneNumber;
    }

    /**
     * Sets the value of the orgPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPhoneNumber(String value) {
        this.orgPhoneNumber = value;
    }

    /**
     * Gets the value of the orgFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgFaxNumber() {
        return orgFaxNumber;
    }

    /**
     * Sets the value of the orgFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgFaxNumber(String value) {
        this.orgFaxNumber = value;
    }

    /**
     * Gets the value of the orgEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgEmail() {
        return orgEmail;
    }

    /**
     * Sets the value of the orgEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgEmail(String value) {
        this.orgEmail = value;
    }

    /**
     * Gets the value of the orgWebSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgWebSite() {
        return orgWebSite;
    }

    /**
     * Sets the value of the orgWebSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgWebSite(String value) {
        this.orgWebSite = value;
    }

    /**
     * Gets the value of the orgProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getOrgProperty() {
        if (orgProperty == null) {
            orgProperty = new ArrayList<SimpleProperty>();
        }
        return this.orgProperty;
    }

}
