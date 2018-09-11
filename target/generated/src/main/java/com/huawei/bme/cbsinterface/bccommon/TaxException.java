
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxChargeCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ExceptionRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxException", propOrder = {
    "taxChargeCode",
    "exceptionRate"
})
public class TaxException
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "TaxChargeCode", required = true)
    protected BigInteger taxChargeCode;
    @XmlElement(name = "ExceptionRate", required = true)
    protected BigInteger exceptionRate;

    /**
     * Gets the value of the taxChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxChargeCode() {
        return taxChargeCode;
    }

    /**
     * Sets the value of the taxChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxChargeCode(BigInteger value) {
        this.taxChargeCode = value;
    }

    /**
     * Gets the value of the exceptionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExceptionRate() {
        return exceptionRate;
    }

    /**
     * Sets the value of the exceptionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExceptionRate(BigInteger value) {
        this.exceptionRate = value;
    }

}
