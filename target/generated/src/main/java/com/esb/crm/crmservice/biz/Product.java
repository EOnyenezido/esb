
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SimpleProperty" type="{http://www.esb.com/crm/crmservice/biz}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MMLCommand" type="{http://www.esb.com/crm/crmservice/biz}MMLCommand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "id",
    "simpleProperty",
    "mmlCommand"
})
@XmlSeeAlso({
    com.esb.crm.crmservice.biz.MVPPRequest.ProductAppendantAdd.class,
    com.esb.crm.crmservice.biz.MVPPRequest.ProductAppendantDel.class,
    com.esb.crm.crmservice.biz.NewSubscriberRequest.ProductAppendant.class,
    com.esb.crm.crmservice.biz.DeleteSubscriberRequest.ProductAppendant.class,
    com.esb.crm.crmservice.biz.ChangeMainProdRequest.AddProductApp.class,
    com.esb.crm.crmservice.biz.ChangeMainProdRequest.RemovedProductApp.class,
    com.esb.crm.crmservice.biz.ChangeAppendantProductRequest.Product.class
})
public class Product
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;
    @XmlElement(name = "MMLCommand")
    protected List<MMLCommand> mmlCommand;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the simpleProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getSimpleProperty() {
        if (simpleProperty == null) {
            simpleProperty = new ArrayList<SimpleProperty>();
        }
        return this.simpleProperty;
    }

    /**
     * Gets the value of the mmlCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMMLCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MMLCommand }
     * 
     * 
     */
    public List<MMLCommand> getMMLCommand() {
        if (mmlCommand == null) {
            mmlCommand = new ArrayList<MMLCommand>();
        }
        return this.mmlCommand;
    }

}
