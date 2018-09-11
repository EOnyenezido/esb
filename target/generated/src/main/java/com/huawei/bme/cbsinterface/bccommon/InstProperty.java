
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PropType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="SubPropInst" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="SubPropCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "InstProperty", propOrder = {
    "propCode",
    "propType",
    "value",
    "subPropInst"
})
@XmlSeeAlso({
    com.huawei.bme.cbsinterface.bccommon.ProductInst.PInstProperty.class,
    com.huawei.bme.cbsinterface.bccommon.POfferingInst.OfferingInstProperty.class,
    com.huawei.bme.cbsinterface.bccommon.OfferingInst.OInstProperty.class
})
public class InstProperty
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "PropCode", required = true)
    protected String propCode;
    @XmlElement(name = "PropType", required = true)
    protected String propType;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "SubPropInst")
    protected List<InstProperty.SubPropInst> subPropInst;

    /**
     * Gets the value of the propCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropCode() {
        return propCode;
    }

    /**
     * Sets the value of the propCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropCode(String value) {
        this.propCode = value;
    }

    /**
     * Gets the value of the propType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropType() {
        return propType;
    }

    /**
     * Sets the value of the propType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropType(String value) {
        this.propType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the subPropInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPropInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPropInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstProperty.SubPropInst }
     * 
     * 
     */
    public List<InstProperty.SubPropInst> getSubPropInst() {
        if (subPropInst == null) {
            subPropInst = new ArrayList<InstProperty.SubPropInst>();
        }
        return this.subPropInst;
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
     *         &lt;element name="SubPropCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "subPropCode",
        "value"
    })
    public static class SubPropInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "SubPropCode", required = true)
        protected String subPropCode;
        @XmlElement(name = "Value", required = true)
        protected String value;

        /**
         * Gets the value of the subPropCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubPropCode() {
            return subPropCode;
        }

        /**
         * Sets the value of the subPropCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubPropCode(String value) {
            this.subPropCode = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
