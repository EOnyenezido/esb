
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for ChangeSubIdentityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubIdentityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddSubIdentity" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="DelSubIdentity" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ModifySubIdentity" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="OldSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="OldSubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="NewSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeSubIdentityRequest", propOrder = {
    "subAccessCode",
    "addSubIdentity",
    "delSubIdentity",
    "modifySubIdentity"
})
public class ChangeSubIdentityRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "AddSubIdentity")
    protected List<ChangeSubIdentityRequest.AddSubIdentity> addSubIdentity;
    @XmlElement(name = "DelSubIdentity")
    protected List<ChangeSubIdentityRequest.DelSubIdentity> delSubIdentity;
    @XmlElement(name = "ModifySubIdentity")
    protected List<ChangeSubIdentityRequest.ModifySubIdentity> modifySubIdentity;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setSubAccessCode(SubAccessCode value) {
        this.subAccessCode = value;
    }

    /**
     * Gets the value of the addSubIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addSubIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddSubIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeSubIdentityRequest.AddSubIdentity }
     * 
     * 
     */
    public List<ChangeSubIdentityRequest.AddSubIdentity> getAddSubIdentity() {
        if (addSubIdentity == null) {
            addSubIdentity = new ArrayList<ChangeSubIdentityRequest.AddSubIdentity>();
        }
        return this.addSubIdentity;
    }

    /**
     * Gets the value of the delSubIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delSubIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelSubIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeSubIdentityRequest.DelSubIdentity }
     * 
     * 
     */
    public List<ChangeSubIdentityRequest.DelSubIdentity> getDelSubIdentity() {
        if (delSubIdentity == null) {
            delSubIdentity = new ArrayList<ChangeSubIdentityRequest.DelSubIdentity>();
        }
        return this.delSubIdentity;
    }

    /**
     * Gets the value of the modifySubIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifySubIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifySubIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeSubIdentityRequest.ModifySubIdentity }
     * 
     * 
     */
    public List<ChangeSubIdentityRequest.ModifySubIdentity> getModifySubIdentity() {
        if (modifySubIdentity == null) {
            modifySubIdentity = new ArrayList<ChangeSubIdentityRequest.ModifySubIdentity>();
        }
        return this.modifySubIdentity;
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
     *         &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "subIdentityType",
        "subIdentity"
    })
    public static class AddSubIdentity
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubIdentityType", required = true)
        protected String subIdentityType;
        @XmlElement(name = "SubIdentity", required = true)
        protected String subIdentity;

        /**
         * Gets the value of the subIdentityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubIdentityType() {
            return subIdentityType;
        }

        /**
         * Sets the value of the subIdentityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubIdentityType(String value) {
            this.subIdentityType = value;
        }

        /**
         * Gets the value of the subIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubIdentity() {
            return subIdentity;
        }

        /**
         * Sets the value of the subIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubIdentity(String value) {
            this.subIdentity = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "subIdentityType",
        "subIdentity"
    })
    public static class DelSubIdentity
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubIdentityType", required = true)
        protected String subIdentityType;
        @XmlElement(name = "SubIdentity", required = true)
        protected String subIdentity;

        /**
         * Gets the value of the subIdentityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubIdentityType() {
            return subIdentityType;
        }

        /**
         * Sets the value of the subIdentityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubIdentityType(String value) {
            this.subIdentityType = value;
        }

        /**
         * Gets the value of the subIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubIdentity() {
            return subIdentity;
        }

        /**
         * Sets the value of the subIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubIdentity(String value) {
            this.subIdentity = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="OldSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldSubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "oldSubIdentity",
        "oldSubIdentityType",
        "newSubIdentity"
    })
    public static class ModifySubIdentity
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OldSubIdentity", required = true)
        protected String oldSubIdentity;
        @XmlElement(name = "OldSubIdentityType", required = true)
        protected String oldSubIdentityType;
        @XmlElement(name = "NewSubIdentity", required = true)
        protected String newSubIdentity;

        /**
         * Gets the value of the oldSubIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldSubIdentity() {
            return oldSubIdentity;
        }

        /**
         * Sets the value of the oldSubIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldSubIdentity(String value) {
            this.oldSubIdentity = value;
        }

        /**
         * Gets the value of the oldSubIdentityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldSubIdentityType() {
            return oldSubIdentityType;
        }

        /**
         * Sets the value of the oldSubIdentityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldSubIdentityType(String value) {
            this.oldSubIdentityType = value;
        }

        /**
         * Gets the value of the newSubIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewSubIdentity() {
            return newSubIdentity;
        }

        /**
         * Sets the value of the newSubIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewSubIdentity(String value) {
            this.newSubIdentity = value;
        }

    }

}
