
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryUserGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryUserGroupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UserGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryUserGroupRequest", propOrder = {
    "userGroupID",
    "userGroupName"
})
public class QueryUserGroupRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "UserGroupID")
    protected String userGroupID;
    @XmlElement(name = "UserGroupName")
    protected String userGroupName;

    /**
     * Gets the value of the userGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroupID() {
        return userGroupID;
    }

    /**
     * Sets the value of the userGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroupID(String value) {
        this.userGroupID = value;
    }

    /**
     * Gets the value of the userGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    /**
     * Sets the value of the userGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroupName(String value) {
        this.userGroupName = value;
    }

}
