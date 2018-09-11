
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckUVCPartPinRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckUVCPartPinRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardPin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckUVCPartPinRequest", propOrder = {
    "sequence",
    "cardPin"
})
public class CheckUVCPartPinRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Sequence", required = true)
    protected String sequence;
    @XmlElement(name = "CardPin", required = true)
    protected String cardPin;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the cardPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPin() {
        return cardPin;
    }

    /**
     * Sets the value of the cardPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPin(String value) {
        this.cardPin = value;
    }

}
