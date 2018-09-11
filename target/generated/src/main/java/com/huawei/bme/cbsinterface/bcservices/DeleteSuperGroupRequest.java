
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u5220\u9664\u4e00\u4e2a\u8d85\u7ea7\u7fa4\u65f6\uff0c\u81ea\u52a8\u5c06\u4e0e\u8d85\u7ea7\u7fa4\u4e0e\u8d85\u7ea7\u7fa4\u6210\u5458\u4e4b\u95f4\u7684\u5173\u7cfb\u89e3\u9664
 * 
 * <p>Java class for DeleteSuperGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSuperGroupRequest"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSuperGroupRequest", propOrder = {
    "superGroupAccess"
})
public class DeleteSuperGroupRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SuperGroupAccess", required = true)
    protected DeleteSuperGroupRequest.SuperGroupAccess superGroupAccess;

    /**
     * Gets the value of the superGroupAccess property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteSuperGroupRequest.SuperGroupAccess }
     *     
     */
    public DeleteSuperGroupRequest.SuperGroupAccess getSuperGroupAccess() {
        return superGroupAccess;
    }

    /**
     * Sets the value of the superGroupAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSuperGroupRequest.SuperGroupAccess }
     *     
     */
    public void setSuperGroupAccess(DeleteSuperGroupRequest.SuperGroupAccess value) {
        this.superGroupAccess = value;
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
