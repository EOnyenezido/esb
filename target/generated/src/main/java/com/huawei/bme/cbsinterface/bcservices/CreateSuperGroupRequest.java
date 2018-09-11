
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSuperGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSuperGroupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuperGroupAccessCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SuperGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SuperGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SuperGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSuperGroupRequest", propOrder = {
    "superGroupAccessCode",
    "superGroupName"
})
public class CreateSuperGroupRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SuperGroupAccessCode", required = true)
    protected CreateSuperGroupRequest.SuperGroupAccessCode superGroupAccessCode;
    @XmlElement(name = "SuperGroupName")
    protected String superGroupName;

    /**
     * Gets the value of the superGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSuperGroupRequest.SuperGroupAccessCode }
     *     
     */
    public CreateSuperGroupRequest.SuperGroupAccessCode getSuperGroupAccessCode() {
        return superGroupAccessCode;
    }

    /**
     * Sets the value of the superGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSuperGroupRequest.SuperGroupAccessCode }
     *     
     */
    public void setSuperGroupAccessCode(CreateSuperGroupRequest.SuperGroupAccessCode value) {
        this.superGroupAccessCode = value;
    }

    /**
     * Gets the value of the superGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperGroupName() {
        return superGroupName;
    }

    /**
     * Sets the value of the superGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperGroupName(String value) {
        this.superGroupName = value;
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
     *         &lt;element name="SuperGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SuperGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "superGroupKey",
        "superGroupCode"
    })
    public static class SuperGroupAccessCode
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SuperGroupKey", required = true)
        protected String superGroupKey;
        @XmlElement(name = "SuperGroupCode", required = true)
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
