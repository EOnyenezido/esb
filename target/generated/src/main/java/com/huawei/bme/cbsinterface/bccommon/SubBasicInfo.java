
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubBasicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubBasicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DunningFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBasicInfo", propOrder = {
    "writtenLang",
    "ivrLang",
    "subLevel",
    "dunningFlag",
    "subProperty"
})
public class SubBasicInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "WrittenLang")
    protected String writtenLang;
    @XmlElement(name = "IVRLang")
    protected String ivrLang;
    @XmlElement(name = "SubLevel")
    protected String subLevel;
    @XmlElement(name = "DunningFlag")
    protected String dunningFlag;
    @XmlElement(name = "SubProperty")
    protected List<SimpleProperty> subProperty;

    /**
     * Gets the value of the writtenLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenLang() {
        return writtenLang;
    }

    /**
     * Sets the value of the writtenLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenLang(String value) {
        this.writtenLang = value;
    }

    /**
     * Gets the value of the ivrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRLang() {
        return ivrLang;
    }

    /**
     * Sets the value of the ivrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRLang(String value) {
        this.ivrLang = value;
    }

    /**
     * Gets the value of the subLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLevel() {
        return subLevel;
    }

    /**
     * Sets the value of the subLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLevel(String value) {
        this.subLevel = value;
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
     * Gets the value of the subProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getSubProperty() {
        if (subProperty == null) {
            subProperty = new ArrayList<SimpleProperty>();
        }
        return this.subProperty;
    }

}
