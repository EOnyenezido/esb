
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParaListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParaListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParaItem" type="{http://www.esb.com/crm/crmservice/biz}ParaItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParaListType", propOrder = {
    "paraItem"
})
public class ParaListType
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "ParaItem", required = true)
    protected List<ParaItemType> paraItem;

    /**
     * Gets the value of the paraItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParaItemType }
     * 
     * 
     */
    public List<ParaItemType> getParaItem() {
        if (paraItem == null) {
            paraItem = new ArrayList<ParaItemType>();
        }
        return this.paraItem;
    }

}
