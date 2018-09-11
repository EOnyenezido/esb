
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for JoinSuperGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JoinSuperGroupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuperGroupAccess"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="SuperGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SuperGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="members" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
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
@XmlType(name = "JoinSuperGroupRequest", propOrder = {
    "superGroupAccess",
    "members"
})
public class JoinSuperGroupRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SuperGroupAccess", required = true)
    protected JoinSuperGroupRequest.SuperGroupAccess superGroupAccess;
    protected List<JoinSuperGroupRequest.Members> members;

    /**
     * Gets the value of the superGroupAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JoinSuperGroupRequest.SuperGroupAccess }
     *     
     */
    public JoinSuperGroupRequest.SuperGroupAccess getSuperGroupAccess() {
        return superGroupAccess;
    }

    /**
     * Sets the value of the superGroupAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinSuperGroupRequest.SuperGroupAccess }
     *     
     */
    public void setSuperGroupAccess(JoinSuperGroupRequest.SuperGroupAccess value) {
        this.superGroupAccess = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the members property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JoinSuperGroupRequest.Members }
     * 
     * 
     */
    public List<JoinSuperGroupRequest.Members> getMembers() {
        if (members == null) {
            members = new ArrayList<JoinSuperGroupRequest.Members>();
        }
        return this.members;
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
     *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
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
        "subGroupAccessCode"
    })
    public static class Members
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubGroupAccessCode", required = true)
        protected SubGroupAccessCode subGroupAccessCode;

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
     *       &lt;choice&gt;
     *         &lt;element name="SuperGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SuperGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "superGroupKey",
        "superGroupCode"
    })
    public static class SuperGroupAccess
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SuperGroupKey")
        protected String superGroupKey;
        @XmlElement(name = "SuperGroupCode")
        protected String superGroupCode;

        /**
         * Gets the value of the superGroupKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperGroupKey() {
            return superGroupKey;
        }

        /**
         * Sets the value of the superGroupKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperGroupKey(String value) {
            this.superGroupKey = value;
        }

        /**
         * Gets the value of the superGroupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperGroupCode() {
            return superGroupCode;
        }

        /**
         * Sets the value of the superGroupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperGroupCode(String value) {
            this.superGroupCode = value;
        }

    }

}
