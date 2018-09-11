
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubInfoExToCubeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubInfoExToCubeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ObjectIdType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ObjectId"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "QuerySubInfoExToCubeRequest", propOrder = {
    "accessInfo"
})
public class QuerySubInfoExToCubeRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "AccessInfo", required = true)
    protected QuerySubInfoExToCubeRequest.AccessInfo accessInfo;

    /**
     * Gets the value of the accessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubInfoExToCubeRequest.AccessInfo }
     *     
     */
    public QuerySubInfoExToCubeRequest.AccessInfo getAccessInfo() {
        return accessInfo;
    }

    /**
     * Sets the value of the accessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubInfoExToCubeRequest.AccessInfo }
     *     
     */
    public void setAccessInfo(QuerySubInfoExToCubeRequest.AccessInfo value) {
        this.accessInfo = value;
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
     *         &lt;element name="ObjectIdType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ObjectId"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    @XmlType(name = "", propOrder = {
        "objectIdType",
        "objectId"
    })
    public static class AccessInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ObjectIdType", required = true)
        protected String objectIdType;
        @XmlElement(name = "ObjectId", required = true)
        protected String objectId;

        /**
         * Gets the value of the objectIdType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectIdType() {
            return objectIdType;
        }

        /**
         * Sets the value of the objectIdType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectIdType(String value) {
            this.objectIdType = value;
        }

        /**
         * Gets the value of the objectId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectId() {
            return objectId;
        }

        /**
         * Sets the value of the objectId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectId(String value) {
            this.objectId = value;
        }

    }

}
