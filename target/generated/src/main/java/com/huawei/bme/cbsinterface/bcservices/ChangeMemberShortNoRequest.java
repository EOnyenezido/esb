
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ChangeMemberShortNoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMemberShortNoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;element name="GroupMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="OldMemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewMemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMemberShortNoRequest", propOrder = {
    "subGroupAccessCode",
    "groupMember",
    "oldMemberShortNo",
    "newMemberShortNo"
})
public class ChangeMemberShortNoRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "GroupMember", required = true)
    protected SubAccessCode groupMember;
    @XmlElement(name = "OldMemberShortNo")
    protected String oldMemberShortNo;
    @XmlElement(name = "NewMemberShortNo", required = true)
    protected String newMemberShortNo;

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
     * Gets the value of the oldMemberShortNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMemberShortNo() {
        return oldMemberShortNo;
    }

    /**
     * Sets the value of the oldMemberShortNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMemberShortNo(String value) {
        this.oldMemberShortNo = value;
    }

    /**
     * Gets the value of the newMemberShortNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMemberShortNo() {
        return newMemberShortNo;
    }

    /**
     * Sets the value of the newMemberShortNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMemberShortNo(String value) {
        this.newMemberShortNo = value;
    }

}
