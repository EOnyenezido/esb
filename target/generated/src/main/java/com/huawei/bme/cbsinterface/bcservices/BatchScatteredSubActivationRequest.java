
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;


/**
 * \u6279\u91cf\u6fc0\u6d3b\u6563\u53f7\u53f7\u7801
 * 
 * <p>Java class for BatchScatteredSubActivationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchScatteredSubActivationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubBasicInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SubProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchScatteredSubActivationRequest", propOrder = {
    "subBasicInfo",
    "fileName"
})
public class BatchScatteredSubActivationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubBasicInfo")
    protected BatchScatteredSubActivationRequest.SubBasicInfo subBasicInfo;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BatchScatteredSubActivationRequest.SubBasicInfo }
     *     
     */
    public BatchScatteredSubActivationRequest.SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchScatteredSubActivationRequest.SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(BatchScatteredSubActivationRequest.SubBasicInfo value) {
        this.subBasicInfo = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     *         &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SubProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "writtenLang",
        "ivrLang",
        "subPassword",
        "subProperty"
    })
    public static class SubBasicInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "WrittenLang")
        protected String writtenLang;
        @XmlElement(name = "IVRLang")
        protected String ivrLang;
        @XmlElement(name = "SubPassword")
        protected String subPassword;
        @XmlElement(name = "SubProperty")
        protected List<SimpleProperty> subProperty;

        /**
         * Gets the value of the writtenLang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWrittenLang() {
            return writtenLang;
        }

        /**
         * Sets the value of the writtenLang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWrittenLang(String value) {
            this.writtenLang = value;
        }

        /**
         * Gets the value of the ivrLang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIVRLang() {
            return ivrLang;
        }

        /**
         * Sets the value of the ivrLang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIVRLang(String value) {
            this.ivrLang = value;
        }

        /**
         * Gets the value of the subPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubPassword() {
            return subPassword;
        }

        /**
         * Sets the value of the subPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubPassword(String value) {
            this.subPassword = value;
        }

        /**
         * Gets the value of the subProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getSubProperty() {
            if (subProperty == null) {
                subProperty = new ArrayList<SimpleProperty>();
            }
            return this.subProperty;
        }

    }

}
