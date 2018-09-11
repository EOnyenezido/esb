
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubRelationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubRelationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubRelationInfo", propOrder = {
    "subscriberKey",
    "relType"
})
public class SubRelationInfo
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "SubscriberKey", required = true)
    protected String subscriberKey;
    @XmlElement(name = "RelType", required = true)
    protected String relType;

    /**
     * Gets the value of the subscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    /**
     * Sets the value of the subscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberKey(String value) {
        this.subscriberKey = value;
    }

    /**
     * Gets the value of the relType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelType() {
        return relType;
    }

    /**
     * Sets the value of the relType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelType(String value) {
        this.relType = value;
    }

}
