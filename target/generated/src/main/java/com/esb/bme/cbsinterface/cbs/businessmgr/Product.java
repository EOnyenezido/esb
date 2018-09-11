
package com.esb.bme.cbsinterface.cbs.businessmgr;

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
 *         &lt;element name="SimpleProperty" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "simpleProperty"
})
@XmlSeeAlso({
    com.esb.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequest.Product.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.ChangeMainProdRequest.RemovedProduct.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.SubscribeAppendantProductRequest.Product.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.ChangeAppendantProductRequest.Product.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.BatchOperationRequest.BatchSubscribe.Product.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.BatchOperationRequest.BatchChangeMainProduct.Product.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.BatchOperationRequest.BatchChangeMainProduct.RemovedProduct.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.IntegrationEnquiryResult.SubscriberInfo.Product.class,
    com.esb.bme.cbsinterface.cbs.businessmgr.QuerySubscriberProductInfoResult.Product.class
})
public class Product
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

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

}
