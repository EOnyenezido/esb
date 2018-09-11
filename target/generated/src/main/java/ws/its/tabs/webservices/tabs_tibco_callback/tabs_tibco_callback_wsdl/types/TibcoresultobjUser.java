
package ws.its.tabs.webservices.tabs_tibco_callback.tabs_tibco_callback_wsdl.types;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TibcoresultobjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TibcoresultobjUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws/its/tabs/webservices/tabs_tibco_callback/TABS_TIBCO_CALLBACK.wsdl/types/}TibcoresultobjBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultmsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TibcoresultobjUser", propOrder = {
    "resultcode",
    "resultmsg"
})
public class TibcoresultobjUser
    extends TibcoresultobjBase
    implements Serializable
{

    private final static long serialVersionUID = 11082014L;
    @XmlElement(required = true, nillable = true)
    protected String resultcode;
    @XmlElement(required = true, nillable = true)
    protected String resultmsg;

    /**
     * Gets the value of the resultcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultcode() {
        return resultcode;
    }

    /**
     * Sets the value of the resultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultcode(String value) {
        this.resultcode = value;
    }

    /**
     * Gets the value of the resultmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultmsg() {
        return resultmsg;
    }

    /**
     * Sets the value of the resultmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultmsg(String value) {
        this.resultmsg = value;
    }

}
