
package ws.its.tabs.webservices.tabs_tibco_callback.tabs_tibco_callback_wsdl.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Errordetailtbl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Errordetailtbl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="array" type="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}ErrordetailobjUser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Errordetailtbl", propOrder = {
    "array"
})
public class Errordetailtbl
    implements Serializable
{

    private final static long serialVersionUID = 11082014L;
    @XmlElement(nillable = true)
    protected List<ErrordetailobjUser> array;

    /**
     * Gets the value of the array property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the array property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrordetailobjUser }
     * 
     * 
     */
    public List<ErrordetailobjUser> getArray() {
        if (array == null) {
            array = new ArrayList<ErrordetailobjUser>();
        }
        return this.array;
    }

}
