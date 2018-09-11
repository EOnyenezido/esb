
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "addressKey",
    "address1",
    "address2",
    "address3",
    "address4",
    "address5",
    "address6",
    "address7",
    "address8",
    "address9",
    "address10",
    "address11",
    "address12",
    "postCode"
})
public class Address
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "AddressKey", required = true)
    protected String addressKey;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "Address4")
    protected String address4;
    @XmlElement(name = "Address5")
    protected String address5;
    @XmlElement(name = "Address6")
    protected String address6;
    @XmlElement(name = "Address7")
    protected String address7;
    @XmlElement(name = "Address8")
    protected String address8;
    @XmlElement(name = "Address9")
    protected String address9;
    @XmlElement(name = "Address10")
    protected String address10;
    @XmlElement(name = "Address11")
    protected String address11;
    @XmlElement(name = "Address12")
    protected String address12;
    @XmlElement(name = "PostCode")
    protected String postCode;

    /**
     * Gets the value of the addressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressKey() {
        return addressKey;
    }

    /**
     * Sets the value of the addressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressKey(String value) {
        this.addressKey = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the address5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * Sets the value of the address5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress5(String value) {
        this.address5 = value;
    }

    /**
     * Gets the value of the address6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress6() {
        return address6;
    }

    /**
     * Sets the value of the address6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress6(String value) {
        this.address6 = value;
    }

    /**
     * Gets the value of the address7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress7() {
        return address7;
    }

    /**
     * Sets the value of the address7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress7(String value) {
        this.address7 = value;
    }

    /**
     * Gets the value of the address8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress8() {
        return address8;
    }

    /**
     * Sets the value of the address8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress8(String value) {
        this.address8 = value;
    }

    /**
     * Gets the value of the address9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress9() {
        return address9;
    }

    /**
     * Sets the value of the address9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress9(String value) {
        this.address9 = value;
    }

    /**
     * Gets the value of the address10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress10() {
        return address10;
    }

    /**
     * Sets the value of the address10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress10(String value) {
        this.address10 = value;
    }

    /**
     * Gets the value of the address11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress11() {
        return address11;
    }

    /**
     * Sets the value of the address11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress11(String value) {
        this.address11 = value;
    }

    /**
     * Gets the value of the address12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress12() {
        return address12;
    }

    /**
     * Sets the value of the address12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress12(String value) {
        this.address12 = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

}
