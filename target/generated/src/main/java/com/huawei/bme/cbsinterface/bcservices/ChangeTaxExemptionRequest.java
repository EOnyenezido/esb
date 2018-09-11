
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;


/**
 * <p>Java class for ChangeTaxExemptionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeTaxExemptionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisterCust" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="AddExemption" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExptPlanCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DelExemption" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExptPlanCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeTaxExemptionRequest", propOrder = {
    "registerCust",
    "addExemption",
    "delExemption"
})
public class ChangeTaxExemptionRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "RegisterCust", required = true)
    protected CustAccessCode registerCust;
    @XmlElement(name = "AddExemption")
    protected List<ChangeTaxExemptionRequest.AddExemption> addExemption;
    @XmlElement(name = "DelExemption")
    protected List<ChangeTaxExemptionRequest.DelExemption> delExemption;

    /**
     * Gets the value of the registerCust property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getRegisterCust() {
        return registerCust;
    }

    /**
     * Sets the value of the registerCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setRegisterCust(CustAccessCode value) {
        this.registerCust = value;
    }

    /**
     * Gets the value of the addExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeTaxExemptionRequest.AddExemption }
     * 
     * 
     */
    public List<ChangeTaxExemptionRequest.AddExemption> getAddExemption() {
        if (addExemption == null) {
            addExemption = new ArrayList<ChangeTaxExemptionRequest.AddExemption>();
        }
        return this.addExemption;
    }

    /**
     * Gets the value of the delExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeTaxExemptionRequest.DelExemption }
     * 
     * 
     */
    public List<ChangeTaxExemptionRequest.DelExemption> getDelExemption() {
        if (delExemption == null) {
            delExemption = new ArrayList<ChangeTaxExemptionRequest.DelExemption>();
        }
        return this.delExemption;
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
     *         &lt;element name="ExptPlanCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "exptPlanCODE",
        "objType",
        "objKey"
    })
    public static class AddExemption
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ExptPlanCODE", required = true)
        protected String exptPlanCODE;
        @XmlElement(name = "ObjType")
        protected String objType;
        @XmlElement(name = "ObjKey")
        protected String objKey;

        /**
         * Gets the value of the exptPlanCODE property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExptPlanCODE() {
            return exptPlanCODE;
        }

        /**
         * Sets the value of the exptPlanCODE property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExptPlanCODE(String value) {
            this.exptPlanCODE = value;
        }

        /**
         * Gets the value of the objType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjType() {
            return objType;
        }

        /**
         * Sets the value of the objType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjType(String value) {
            this.objType = value;
        }

        /**
         * Gets the value of the objKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjKey() {
            return objKey;
        }

        /**
         * Sets the value of the objKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjKey(String value) {
            this.objKey = value;
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
     *         &lt;element name="ExptPlanCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "exptPlanCODE",
        "objType",
        "objKey"
    })
    public static class DelExemption
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ExptPlanCODE", required = true)
        protected String exptPlanCODE;
        @XmlElement(name = "ObjType")
        protected String objType;
        @XmlElement(name = "ObjKey")
        protected String objKey;

        /**
         * Gets the value of the exptPlanCODE property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExptPlanCODE() {
            return exptPlanCODE;
        }

        /**
         * Sets the value of the exptPlanCODE property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExptPlanCODE(String value) {
            this.exptPlanCODE = value;
        }

        /**
         * Gets the value of the objType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjType() {
            return objType;
        }

        /**
         * Sets the value of the objType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjType(String value) {
            this.objType = value;
        }

        /**
         * Gets the value of the objKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjKey() {
            return objKey;
        }

        /**
         * Sets the value of the objKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjKey(String value) {
            this.objKey = value;
        }

    }

}
