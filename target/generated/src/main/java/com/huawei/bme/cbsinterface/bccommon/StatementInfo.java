
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Contact" minOccurs="0"/&gt;
 *         &lt;element name="SmtMedium" type="{http://www.huawei.com/bme/cbsinterface/bccommon}StatementMedium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SmtLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementInfo", propOrder = {
    "contactInfo",
    "smtMedium",
    "smtLang"
})
public class StatementInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "ContactInfo")
    protected Contact contactInfo;
    @XmlElement(name = "SmtMedium")
    protected List<StatementMedium> smtMedium;
    @XmlElement(name = "SmtLang")
    protected String smtLang;

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
     * Gets the value of the smtMedium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smtMedium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmtMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementMedium }
     * 
     * 
     */
    public List<StatementMedium> getSmtMedium() {
        if (smtMedium == null) {
            smtMedium = new ArrayList<StatementMedium>();
        }
        return this.smtMedium;
    }

    /**
     * Gets the value of the smtLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtLang() {
        return smtLang;
    }

    /**
     * Sets the value of the smtLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtLang(String value) {
        this.smtLang = value;
    }

}
