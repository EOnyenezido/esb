
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ChangeMemberStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMemberStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;element name="GroupMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OldStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMemberStatusRequest", propOrder = {
    "subGroupAccessCode",
    "groupMember",
    "opType",
    "oldStatus",
    "newStatus"
})
public class ChangeMemberStatusRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "GroupMember", required = true)
    protected SubAccessCode groupMember;
    @XmlElement(name = "OpType", required = true)
    protected String opType;
    @XmlElement(name = "OldStatus")
    protected String oldStatus;
    @XmlElement(name = "NewStatus")
    protected String newStatus;

    /**
     * Gets the value of the subGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }

    /**
     * Sets the value of the subGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public void setSubGroupAccessCode(SubGroupAccessCode value) {
        this.subGroupAccessCode = value;
    }

    /**
     * Gets the value of the groupMember property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getGroupMember() {
        return groupMember;
    }

    /**
     * Sets the value of the groupMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setGroupMember(SubAccessCode value) {
        this.groupMember = value;
    }

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the oldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldStatus() {
        return oldStatus;
    }

    /**
     * Sets the value of the oldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldStatus(String value) {
        this.oldStatus = value;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatus(String value) {
        this.newStatus = value;
    }

}
