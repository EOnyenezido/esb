
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChargedAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FeeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFeeType", propOrder = {
    "chargedAmt",
    "chargeType",
    "minMeasureId",
    "feeID"
})
public class ProductFeeType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "ChargedAmt")
    protected long chargedAmt;
    @XmlElement(name = "ChargeType", required = true)
    protected String chargeType;
    @XmlElement(name = "MinMeasureId")
    protected Integer minMeasureId;
    @XmlElement(name = "FeeID")
    protected Integer feeID;

    /**
     * Gets the value of the chargedAmt property.
     * 
     */
    public long getChargedAmt() {
        return chargedAmt;
    }

    /**
     * Sets the value of the chargedAmt property.
     * 
     */
    public void setChargedAmt(long value) {
        this.chargedAmt = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the minMeasureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinMeasureId() {
        return minMeasureId;
    }

    /**
     * Sets the value of the minMeasureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinMeasureId(Integer value) {
        this.minMeasureId = value;
    }

    /**
     * Gets the value of the feeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeID() {
        return feeID;
    }

    /**
     * Sets the value of the feeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeID(Integer value) {
        this.feeID = value;
    }

}
