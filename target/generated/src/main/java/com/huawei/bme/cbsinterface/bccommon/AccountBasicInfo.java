
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountBasicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBasicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DunningFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LateFeeChargeable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedlistFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Contact" minOccurs="0"/&gt;
 *         &lt;element name="FreeBillMedium" type="{http://www.huawei.com/bme/cbsinterface/bccommon}FreeBillMedium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcctProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBasicInfo", propOrder = {
    "acctName",
    "billLang",
    "dunningFlag",
    "lateFeeChargeable",
    "redlistFlag",
    "contactInfo",
    "freeBillMedium",
    "acctProperty"
})
public class AccountBasicInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "AcctName")
    protected String acctName;
    @XmlElement(name = "BillLang")
    protected String billLang;
    @XmlElement(name = "DunningFlag")
    protected String dunningFlag;
    @XmlElement(name = "LateFeeChargeable")
    protected String lateFeeChargeable;
    @XmlElement(name = "RedlistFlag")
    protected String redlistFlag;
    @XmlElement(name = "ContactInfo")
    protected Contact contactInfo;
    @XmlElement(name = "FreeBillMedium")
    protected List<FreeBillMedium> freeBillMedium;
    @XmlElement(name = "AcctProperty")
    protected List<SimpleProperty> acctProperty;

    /**
     * Gets the value of the acctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Sets the value of the acctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Gets the value of the billLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillLang() {
        return billLang;
    }

    /**
     * Sets the value of the billLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillLang(String value) {
        this.billLang = value;
    }

    /**
     * Gets the value of the dunningFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningFlag() {
        return dunningFlag;
    }

    /**
     * Sets the value of the dunningFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningFlag(String value) {
        this.dunningFlag = value;
    }

    /**
     * Gets the value of the lateFeeChargeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateFeeChargeable() {
        return lateFeeChargeable;
    }

    /**
     * Sets the value of the lateFeeChargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateFeeChargeable(String value) {
        this.lateFeeChargeable = value;
    }

    /**
     * Gets the value of the redlistFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedlistFlag() {
        return redlistFlag;
    }

    /**
     * Sets the value of the redlistFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedlistFlag(String value) {
        this.redlistFlag = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContactInfo(Contact value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the freeBillMedium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeBillMedium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeBillMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeBillMedium }
     * 
     * 
     */
    public List<FreeBillMedium> getFreeBillMedium() {
        if (freeBillMedium == null) {
            freeBillMedium = new ArrayList<FreeBillMedium>();
        }
        return this.freeBillMedium;
    }

    /**
     * Gets the value of the acctProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getAcctProperty() {
        if (acctProperty == null) {
            acctProperty = new ArrayList<SimpleProperty>();
        }
        return this.acctProperty;
    }

}
