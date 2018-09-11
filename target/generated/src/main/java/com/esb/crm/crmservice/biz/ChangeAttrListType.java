
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAttrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAttrListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttrItem" type="{http://www.esb.com/crm/crmservice/biz}AttrItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAttrListType", propOrder = {
    "attrItem"
})
public class ChangeAttrListType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "AttrItem", required = true)
    protected List<AttrItemType> attrItem;

    /**
     * Gets the value of the attrItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrItemType }
     * 
     * 
     */
    public List<AttrItemType> getAttrItem() {
        if (attrItem == null) {
            attrItem = new ArrayList<AttrItemType>();
        }
        return this.attrItem;
    }

}
