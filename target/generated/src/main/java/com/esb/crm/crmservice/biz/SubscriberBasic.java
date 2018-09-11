
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SMSLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USSDLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaidMode" type="{http://www.esb.com/crm/crmservice/biz}Paymode"/&gt;
 *         &lt;element name="InitialCredit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BelToAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainPackageId" type="{http://www.esb.com/crm/crmservice/biz}MainPackage"/&gt;
 *         &lt;element name="SimpleProperty" type="{http://www.esb.com/crm/crmservice/biz}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberBasic", propOrder = {
    "code",
    "brandId",
    "registrationTime",
    "lang",
    "smsLang",
    "ussdLang",
    "paidMode",
    "initialCredit",
    "belToAreaID",
    "mainPackageId",
    "simpleProperty"
})
@XmlSeeAlso({
    Subscriber.class
})
public class SubscriberBasic
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "BrandId")
    protected String brandId;
    @XmlElement(name = "RegistrationTime")
    protected String registrationTime;
    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "SMSLang")
    protected String smsLang;
    @XmlElement(name = "USSDLang")
    protected String ussdLang;
    @XmlElement(name = "PaidMode", required = true, nillable = true)
    protected String paidMode;
    @XmlElementRef(name = "InitialCredit", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialCredit;
    @XmlElement(name = "BelToAreaID")
    protected String belToAreaID;
    @XmlElement(name = "MainPackageId", required = true, nillable = true)
    protected MainPackage mainPackageId;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the registrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationTime() {
        return registrationTime;
    }

    /**
     * Sets the value of the registrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationTime(String value) {
        this.registrationTime = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the smsLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSLang() {
        return smsLang;
    }

    /**
     * Sets the value of the smsLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSLang(String value) {
        this.smsLang = value;
    }

    /**
     * Gets the value of the ussdLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSSDLang() {
        return ussdLang;
    }

    /**
     * Sets the value of the ussdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSSDLang(String value) {
        this.ussdLang = value;
    }

    /**
     * Gets the value of the paidMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidMode() {
        return paidMode;
    }

    /**
     * Sets the value of the paidMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidMode(String value) {
        this.paidMode = value;
    }

    /**
     * Gets the value of the initialCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialCredit() {
        return initialCredit;
    }

    /**
     * Sets the value of the initialCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialCredit(JAXBElement<Integer> value) {
        this.initialCredit = value;
    }

    /**
     * Gets the value of the belToAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelToAreaID() {
        return belToAreaID;
    }

    /**
     * Sets the value of the belToAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelToAreaID(String value) {
        this.belToAreaID = value;
    }

    /**
     * Gets the value of the mainPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link MainPackage }
     *     
     */
    public MainPackage getMainPackageId() {
        return mainPackageId;
    }

    /**
     * Sets the value of the mainPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPackage }
     *     
     */
    public void setMainPackageId(MainPackage value) {
        this.mainPackageId = value;
    }

    /**
     * Gets the value of the simpleProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getSimpleProperty() {
        if (simpleProperty == null) {
            simpleProperty = new ArrayList<SimpleProperty>();
        }
        return this.simpleProperty;
    }

}
