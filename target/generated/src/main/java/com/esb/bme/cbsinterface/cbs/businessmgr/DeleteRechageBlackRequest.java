
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteRechageBlackRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteRechageBlackRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.esb.com/bme/cbsinterface/cbs/businessmgr}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRechageBlackRequest", propOrder = {
    "operationType"
})
public class DeleteRechageBlackRequest
    extends Common
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "OperationType")
    protected Integer operationType;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationType(Integer value) {
        this.operationType = value;
    }

}
