
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;


/**
 * <p>Java class for DelStatementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelStatementRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisterCust" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="SmtKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelStatementRequest", propOrder = {
    "registerCust",
    "smtKey"
})
public class DelStatementRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCust", required = true)
    protected CustAccessCode registerCust;
    @XmlElement(name = "SmtKey", required = true)
    protected String smtKey;

    /**
     * Gets the value of the registerCust property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getRegisterCust() {
        return registerCust;
    }

    /**
     * Sets the value of the registerCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setRegisterCust(CustAccessCode value) {
        this.registerCust = value;
    }

    /**
     * Gets the value of the smtKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtKey() {
        return smtKey;
    }

    /**
     * Sets the value of the smtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtKey(String value) {
        this.smtKey = value;
    }

}
