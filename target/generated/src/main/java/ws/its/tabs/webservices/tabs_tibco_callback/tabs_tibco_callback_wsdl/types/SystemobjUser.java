
package ws.its.tabs.webservices.tabs_tibco_callback.tabs_tibco_callback_wsdl.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemobjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemobjUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}SystemobjBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errordetails" type="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}Errordetailtbl"/&gt;
 *         &lt;element name="systemname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "SystemobjUser", propOrder = {
    "errordetails",
    "systemname",
    "status"
})
public class SystemobjUser
    extends SystemobjBase
    implements Serializable
{

    private final static long serialVersionUID = 11082014L;
    @XmlElement(required = true, nillable = true)
    protected Errordetailtbl errordetails;
    @XmlElement(required = true, nillable = true)
    protected String systemname;
    @XmlElement(required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the errordetails property.
     * 
     * @return
     *     possible object is
     *     {@link Errordetailtbl }
     *     
     */
    public Errordetailtbl getErrordetails() {
        return errordetails;
    }

    /**
     * Sets the value of the errordetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errordetailtbl }
     *     
     */
    public void setErrordetails(Errordetailtbl value) {
        this.errordetails = value;
    }

    /**
     * Gets the value of the systemname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemname() {
        return systemname;
    }

    /**
     * Sets the value of the systemname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemname(String value) {
        this.systemname = value;
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
