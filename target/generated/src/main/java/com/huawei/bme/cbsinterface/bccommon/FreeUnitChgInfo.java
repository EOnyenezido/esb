
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeUnitChgInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitChgInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FreeUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MeasureUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NewAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitChgInfo", propOrder = {
    "freeUnitInstanceID",
    "freeUnitType",
    "freeUnitTypeName",
    "measureUnit",
    "measureUnitName",
    "oldAmt",
    "newAmt"
})
public class FreeUnitChgInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "FreeUnitInstanceID")
    protected Long freeUnitInstanceID;
    @XmlElement(name = "FreeUnitType", required = true)
    protected String freeUnitType;
    @XmlElement(name = "FreeUnitTypeName")
    protected String freeUnitTypeName;
    @XmlElement(name = "MeasureUnit", required = true)
    protected BigInteger measureUnit;
    @XmlElement(name = "MeasureUnitName")
    protected String measureUnitName;
    @XmlElement(name = "OldAmt")
    protected long oldAmt;
    @XmlElement(name = "NewAmt")
    protected long newAmt;

    /**
     * Gets the value of the freeUnitInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }

    /**
     * Sets the value of the freeUnitInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeUnitInstanceID(Long value) {
        this.freeUnitInstanceID = value;
    }

    /**
     * Gets the value of the freeUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitType() {
        return freeUnitType;
    }

    /**
     * Sets the value of the freeUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitType(String value) {
        this.freeUnitType = value;
    }

    /**
     * Gets the value of the freeUnitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }

    /**
     * Sets the value of the freeUnitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitTypeName(String value) {
        this.freeUnitTypeName = value;
    }

    /**
     * Gets the value of the measureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the measureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasureUnit(BigInteger value) {
        this.measureUnit = value;
    }

    /**
     * Gets the value of the measureUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnitName() {
        return measureUnitName;
    }

    /**
     * Sets the value of the measureUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnitName(String value) {
        this.measureUnitName = value;
    }

    /**
     * Gets the value of the oldAmt property.
     * 
     */
    public long getOldAmt() {
        return oldAmt;
    }

    /**
     * Sets the value of the oldAmt property.
     * 
     */
    public void setOldAmt(long value) {
        this.oldAmt = value;
    }

    /**
     * Gets the value of the newAmt property.
     * 
     */
    public long getNewAmt() {
        return newAmt;
    }

    /**
     * Sets the value of the newAmt property.
     * 
     */
    public void setNewAmt(long value) {
        this.newAmt = value;
    }

}
