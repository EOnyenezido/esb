
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Individual" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer"/&gt;
 *         &lt;element name="Group" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}GroupCustomer"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "individual",
    "group"
})
public class Customer
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Individual")
    protected IndividualCustomer individual;
    @XmlElement(name = "Group")
    protected GroupCustomer group;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomer }
     *     
     */
    public IndividualCustomer getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomer }
     *     
     */
    public void setIndividual(IndividualCustomer value) {
        this.individual = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCustomer }
     *     
     */
    public GroupCustomer getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCustomer }
     *     
     */
    public void setGroup(GroupCustomer value) {
        this.group = value;
    }

}
