
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerForBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerForBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFTPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFTWrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFTIVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFTBillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFTCurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CustLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustLoyalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DunningFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerForBatch", propOrder = {
    "custType",
    "custSegment",
    "dftPwd",
    "dftWrittenLang",
    "dftivrLang",
    "dftBillCycleType",
    "dftCurrencyID",
    "custLevel",
    "custLoyalty",
    "dunningFlag",
    "custProperty"
})
public class CustomerForBatch
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "CustSegment")
    protected String custSegment;
    @XmlElement(name = "DFTPwd")
    protected String dftPwd;
    @XmlElement(name = "DFTWrittenLang")
    protected String dftWrittenLang;
    @XmlElement(name = "DFTIVRLang")
    protected String dftivrLang;
    @XmlElement(name = "DFTBillCycleType")
    protected String dftBillCycleType;
    @XmlElement(name = "DFTCurrencyID")
    protected BigInteger dftCurrencyID;
    @XmlElementRef(name = "CustLevel", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custLevel;
    @XmlElement(name = "CustLoyalty")
    protected String custLoyalty;
    @XmlElement(name = "DunningFlag")
    protected String dunningFlag;
    @XmlElement(name = "CustProperty")
    protected List<SimpleProperty> custProperty;

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the custSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSegment() {
        return custSegment;
    }

    /**
     * Sets the value of the custSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSegment(String value) {
        this.custSegment = value;
    }

    /**
     * Gets the value of the dftPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFTPwd() {
        return dftPwd;
    }

    /**
     * Sets the value of the dftPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFTPwd(String value) {
        this.dftPwd = value;
    }

    /**
     * Gets the value of the dftWrittenLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFTWrittenLang() {
        return dftWrittenLang;
    }

    /**
     * Sets the value of the dftWrittenLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFTWrittenLang(String value) {
        this.dftWrittenLang = value;
    }

    /**
     * Gets the value of the dftivrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFTIVRLang() {
        return dftivrLang;
    }

    /**
     * Sets the value of the dftivrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFTIVRLang(String value) {
        this.dftivrLang = value;
    }

    /**
     * Gets the value of the dftBillCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFTBillCycleType() {
        return dftBillCycleType;
    }

    /**
     * Sets the value of the dftBillCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFTBillCycleType(String value) {
        this.dftBillCycleType = value;
    }

    /**
     * Gets the value of the dftCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDFTCurrencyID() {
        return dftCurrencyID;
    }

    /**
     * Sets the value of the dftCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDFTCurrencyID(BigInteger value) {
        this.dftCurrencyID = value;
    }

    /**
     * Gets the value of the custLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustLevel() {
        return custLevel;
    }

    /**
     * Sets the value of the custLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustLevel(JAXBElement<String> value) {
        this.custLevel = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLoyalty() {
        return custLoyalty;
    }

    /**
     * Sets the value of the custLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLoyalty(String value) {
        this.custLoyalty = value;
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
     * Gets the value of the custProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getCustProperty() {
        if (custProperty == null) {
            custProperty = new ArrayList<SimpleProperty>();
        }
        return this.custProperty;
    }

}
