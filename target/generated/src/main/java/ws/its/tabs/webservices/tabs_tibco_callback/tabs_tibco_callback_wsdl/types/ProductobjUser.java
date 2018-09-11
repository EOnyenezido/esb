
package ws.its.tabs.webservices.tabs_tibco_callback.tabs_tibco_callback_wsdl.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductobjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductobjUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}ProductobjBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="systems" type="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}Systemtbl"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductobjUser", propOrder = {
    "productid",
    "systems",
    "status"
})
public class ProductobjUser
    extends ProductobjBase
    implements Serializable
{

    private final static long serialVersionUID = 11082014L;
    @XmlElement(required = true, nillable = true)
    protected String productid;
    @XmlElement(required = true, nillable = true)
    protected Systemtbl systems;
    @XmlElement(required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the productid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductid() {
        return productid;
    }

    /**
     * Sets the value of the productid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductid(String value) {
        this.productid = value;
    }

    /**
     * Gets the value of the systems property.
     * 
     * @return
     *     possible object is
     *     {@link Systemtbl }
     *     
     */
    public Systemtbl getSystems() {
        return systems;
    }

    /**
     * Sets the value of the systems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Systemtbl }
     *     
     */
    public void setSystems(Systemtbl value) {
        this.systems = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
