
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckSubscribersGroupResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckSubscribersGroupResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupRelation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserGroup" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ActiveFlg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckSubscribersGroupResult", propOrder = {
    "groupRelation",
    "userGroup"
})
public class CheckSubscribersGroupResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "GroupRelation")
    protected int groupRelation;
    @XmlElement(name = "UserGroup")
    protected List<CheckSubscribersGroupResult.UserGroup> userGroup;

    /**
     * Gets the value of the groupRelation property.
     * 
     */
    public int getGroupRelation() {
        return groupRelation;
    }

    /**
     * Sets the value of the groupRelation property.
     * 
     */
    public void setGroupRelation(int value) {
        this.groupRelation = value;
    }

    /**
     * Gets the value of the userGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckSubscribersGroupResult.UserGroup }
     * 
     * 
     */
    public List<CheckSubscribersGroupResult.UserGroup> getUserGroup() {
        if (userGroup == null) {
            userGroup = new ArrayList<CheckSubscribersGroupResult.UserGroup>();
        }
        return this.userGroup;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ActiveFlg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groupID",
        "groupName",
        "activeFlg"
    })
    public static class UserGroup
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "GroupID", required = true)
        protected String groupID;
        @XmlElement(name = "GroupName", required = true)
        protected String groupName;
        @XmlElement(name = "ActiveFlg")
        protected int activeFlg;

        /**
         * Gets the value of the groupID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupID(String value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the groupName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupName() {
            return groupName;
        }

        /**
         * Sets the value of the groupName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupName(String value) {
            this.groupName = value;
        }

        /**
         * Gets the value of the activeFlg property.
         * 
         */
        public int getActiveFlg() {
            return activeFlg;
        }

        /**
         * Sets the value of the activeFlg property.
         * 
         */
        public void setActiveFlg(int value) {
            this.activeFlg = value;
        }

    }

}
