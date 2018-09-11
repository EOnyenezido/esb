
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * Comment describing your root element
 * 
 * <p>Java class for ApplyProdFreeValidityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplyProdFreeValidityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
 *         &lt;element name="ExtendDays" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyProdFreeValidityRequest", propOrder = {
    "subAccessCode",
    "offeringKey",
    "extendDays"
})
public class ApplyProdFreeValidityRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "OfferingKey", required = true)
    protected OfferingKey offeringKey;
    @XmlElement(name = "ExtendDays", required = true)
    protected BigInteger extendDays;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setSubAccessCode(SubAccessCode value) {
        this.subAccessCode = value;
    }

    /**
     * Gets the value of the offeringKey property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingKey }
     *     
     */
    public OfferingKey getOfferingKey() {
        return offeringKey;
    }

    /**
     * Sets the value of the offeringKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingKey }
     *     
     */
    public void setOfferingKey(OfferingKey value) {
        this.offeringKey = value;
    }

    /**
     * Gets the value of the extendDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtendDays() {
        return extendDays;
    }

    /**
     * Sets the value of the extendDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtendDays(BigInteger value) {
        this.extendDays = value;
    }

}
