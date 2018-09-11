
package com.accenture.schemas.topeng.esb_topeng_v_1_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMLCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMLCommandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExtParamList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParameterInfo" type="{http://www.accenture.com/schemas/TOPENG/ESB_TOPENG_V_1_0}AdditionalParam" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MMLCommandType", propOrder = {
    "operationType",
    "extParamList"
})
public class MMLCommandType
    implements Serializable
{

    private final static long serialVersionUID = 11082016L;
    @XmlElement(name = "OperationType", required = true)
    protected String operationType;
    @XmlElement(name = "ExtParamList")
    protected MMLCommandType.ExtParamList extParamList;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the extParamList property.
     * 
     * @return
     *     possible object is
     *     {@link MMLCommandType.ExtParamList }
     *     
     */
    public MMLCommandType.ExtParamList getExtParamList() {
        return extParamList;
    }

    /**
     * Sets the value of the extParamList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMLCommandType.ExtParamList }
     *     
     */
    public void setExtParamList(MMLCommandType.ExtParamList value) {
        this.extParamList = value;
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
     *         &lt;element name="ParameterInfo" type="{http://www.accenture.com/schemas/TOPENG/ESB_TOPENG_V_1_0}AdditionalParam" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "parameterInfo"
    })
    public static class ExtParamList
        implements Serializable
    {

        private final static long serialVersionUID = 11082016L;
        @XmlElement(name = "ParameterInfo")
        protected List<AdditionalParam> parameterInfo;

        /**
         * Gets the value of the parameterInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalParam }
         * 
         * 
         */
        public List<AdditionalParam> getParameterInfo() {
            if (parameterInfo == null) {
                parameterInfo = new ArrayList<AdditionalParam>();
            }
            return this.parameterInfo;
        }

    }

}
