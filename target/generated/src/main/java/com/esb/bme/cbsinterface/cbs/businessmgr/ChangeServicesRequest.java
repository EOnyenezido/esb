
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeServicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeServicesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeServicesRequest", propOrder = {
    "service",
    "custID"
})
public class ChangeServicesRequest
    extends Common
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "Service", required = true)
    protected List<ChangeServicesRequest.Service> service;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeServicesRequest.Service }
     * 
     * 
     */
    public List<ChangeServicesRequest.Service> getService() {
        if (service == null) {
            service = new ArrayList<ChangeServicesRequest.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Service"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OperationType" type="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}OperationType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operationType"
    })
    public static class Service
        extends com.esb.bme.cbsinterface.cbs.businessmgr.Service
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "OperationType", required = true)
        protected String operationType;

        /**
         * Gets the value of the operationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationType(String value) {
            this.operationType = value;
        }

    }

}
