
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", propOrder = {
    "imsi"
})
@XmlSeeAlso({
    com.esb.bme.cbsinterface.cbs.businessmgr.NewSubscriberRequest.Subscriber.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.ReNewSubscriberRequest.Subscriber.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResult.SubscriberInfo.Subscriber.class
})
public class Subscriber
    extends SubscriberBasic
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "IMSI")
    protected String imsi;

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

}
