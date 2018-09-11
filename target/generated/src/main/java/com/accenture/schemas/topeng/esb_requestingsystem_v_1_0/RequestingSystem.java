
package com.accenture.schemas.topeng.esb_requestingsystem_v_1_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestingSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestingSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestingApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestingServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceContext" type="{http://www.accenture.com/schemas/TOPENG/ESB_RequestingSystem_V_1_0}serviceContext" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestingSystem", propOrder = {
    "correlationID",
    "requestingApplicationName",
    "requestingServer",
    "serviceContext"
})
public class RequestingSystem
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    protected String correlationID;
    protected String requestingApplicationName;
    protected String requestingServer;
    protected ServiceContext serviceContext;

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the requestingApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingApplicationName() {
        return requestingApplicationName;
    }

    /**
     * Sets the value of the requestingApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingApplicationName(String value) {
        this.requestingApplicationName = value;
    }

    /**
     * Gets the value of the requestingServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingServer() {
        return requestingServer;
    }

    /**
     * Sets the value of the requestingServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingServer(String value) {
        this.requestingServer = value;
    }

    /**
     * Gets the value of the serviceContext property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContext }
     *     
     */
    public ServiceContext getServiceContext() {
        return serviceContext;
    }

    /**
     * Sets the value of the serviceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContext }
     *     
     */
    public void setServiceContext(ServiceContext value) {
        this.serviceContext = value;
    }

}
