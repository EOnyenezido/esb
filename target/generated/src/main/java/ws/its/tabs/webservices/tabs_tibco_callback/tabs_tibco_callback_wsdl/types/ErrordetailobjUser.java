
package ws.its.tabs.webservices.tabs_tibco_callback.tabs_tibco_callback_wsdl.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrordetailobjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrordetailobjUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}ErrordetailobjBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errortype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errordescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrordetailobjUser", propOrder = {
    "errortype",
    "errorcode",
    "errordescription"
})
public class ErrordetailobjUser
    extends ErrordetailobjBase
    implements Serializable
{

    private final static long serialVersionUID = 11082014L;
    @XmlElement(required = true, nillable = true)
    protected String errortype;
    @XmlElement(required = true, nillable = true)
    protected String errorcode;
    @XmlElement(required = true, nillable = true)
    protected String errordescription;

    /**
     * Gets the value of the errortype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrortype() {
        return errortype;
    }

    /**
     * Sets the value of the errortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrortype(String value) {
        this.errortype = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorcode(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the errordescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrordescription() {
        return errordescription;
    }

    /**
     * Sets the value of the errordescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrordescription(String value) {
        this.errordescription = value;
    }

}
