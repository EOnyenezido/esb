
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscribeAppendantProductResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribeAppendantProductResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductOrderInfo" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}ProductOrderInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeAppendantProductResult", propOrder = {
    "productOrderInfo"
})
public class SubscribeAppendantProductResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "ProductOrderInfo")
    protected List<ProductOrderInfoType> productOrderInfo;

    /**
     * Gets the value of the productOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOrderInfoType }
     * 
     * 
     */
    public List<ProductOrderInfoType> getProductOrderInfo() {
        if (productOrderInfo == null) {
            productOrderInfo = new ArrayList<ProductOrderInfoType>();
        }
        return this.productOrderInfo;
    }

}
