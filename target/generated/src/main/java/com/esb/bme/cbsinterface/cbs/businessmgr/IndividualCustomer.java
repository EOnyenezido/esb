
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>Java class for IndividualCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}IDType" minOccurs="0"/&gt;
 *         &lt;element name="IdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Gender" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}CustomerGrade" minOccurs="0"/&gt;
 *         &lt;element name="BelToAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SimpleProperty" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NativePlace" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NationType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="JobType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Education" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CreditGrade" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CustomerState" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Skill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCustomer", propOrder = {
    "name",
    "code",
    "idType",
    "idCode",
    "gender",
    "birthday",
    "address",
    "grade",
    "belToAreaID",
    "email",
    "zipCode",
    "registrationTime",
    "simpleProperty",
    "customerType",
    "country",
    "nativePlace",
    "nationType",
    "jobType",
    "education",
    "creditGrade",
    "creditAmount",
    "customerState",
    "maritalStatus",
    "skill",
    "socialNo"
})
@XmlSeeAlso({
    com.esb.bme.cbsinterface.cbs.businessmgr.QueryBasicInfoResult.Customer.class
})
public class IndividualCustomer
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElementRef(name = "IdType", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idType;
    @XmlElement(name = "IdCode")
    protected String idCode;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Birthday")
    protected String birthday;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Grade")
    protected String grade;
    @XmlElement(name = "BelToAreaID")
    protected String belToAreaID;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "RegistrationTime")
    protected String registrationTime;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;
    @XmlElementRef(name = "CustomerType", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> customerType;
    @XmlElementRef(name = "Country", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> country;
    @XmlElementRef(name = "NativePlace", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> nativePlace;
    @XmlElementRef(name = "NationType", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> nationType;
    @XmlElementRef(name = "JobType", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> jobType;
    @XmlElementRef(name = "Education", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> education;
    @XmlElementRef(name = "CreditGrade", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> creditGrade;
    @XmlElementRef(name = "CreditAmount", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> creditAmount;
    @XmlElementRef(name = "CustomerState", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> customerState;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://www.esb.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> maritalStatus;
    @XmlElement(name = "Skill")
    protected String skill;
    @XmlElement(name = "SocialNo")
    protected String socialNo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdType() {
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
    public void setIdType(JAXBElement<String> value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * Sets the value of the idCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCode(String value) {
        this.idCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
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

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCustomerType(JAXBElement<BigInteger> value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCountry(JAXBElement<BigInteger> value) {
        this.country = value;
    }

    /**
     * Gets the value of the nativePlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNativePlace() {
        return nativePlace;
    }

    /**
     * Sets the value of the nativePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNativePlace(JAXBElement<BigInteger> value) {
        this.nativePlace = value;
    }

    /**
     * Gets the value of the nationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNationType() {
        return nationType;
    }

    /**
     * Sets the value of the nationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNationType(JAXBElement<BigInteger> value) {
        this.nationType = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setJobType(JAXBElement<BigInteger> value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setEducation(JAXBElement<BigInteger> value) {
        this.education = value;
    }

    /**
     * Gets the value of the creditGrade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCreditGrade() {
        return creditGrade;
    }

    /**
     * Sets the value of the creditGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCreditGrade(JAXBElement<BigInteger> value) {
        this.creditGrade = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCreditAmount(JAXBElement<BigInteger> value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the customerState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCustomerState() {
        return customerState;
    }

    /**
     * Sets the value of the customerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCustomerState(JAXBElement<BigInteger> value) {
        this.customerState = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<BigInteger> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the skill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkill() {
        return skill;
    }

    /**
     * Sets the value of the skill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkill(String value) {
        this.skill = value;
    }

    /**
     * Gets the value of the socialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialNo() {
        return socialNo;
    }

    /**
     * Sets the value of the socialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialNo(String value) {
        this.socialNo = value;
    }

}
