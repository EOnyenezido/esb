
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for ChangeConsumptionLimitRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeConsumptionLimitRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitObj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddLimit" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;choice&gt;
 *                       &lt;sequence&gt;
 *                         &lt;element name="MesureType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                         &lt;element name="MesureID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                       &lt;/sequence&gt;
 *                       &lt;sequence&gt;
 *                         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/choice&gt;
 *                     &lt;element name="LimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                     &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="DelLimit" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ModifyLimit" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="OldAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                     &lt;element name="NewAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                     &lt;element name="LimitParam" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="AddLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="DelLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ModifyLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="OldParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                         &lt;element name="NewParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
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
@XmlType(name = "ChangeConsumptionLimitRequest", propOrder = {
    "limitObj",
    "addLimit",
    "delLimit",
    "modifyLimit"
})
public class ChangeConsumptionLimitRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "LimitObj", required = true)
    protected ChangeConsumptionLimitRequest.LimitObj limitObj;
    @XmlElement(name = "AddLimit")
    protected List<ChangeConsumptionLimitRequest.AddLimit> addLimit;
    @XmlElement(name = "DelLimit")
    protected List<ChangeConsumptionLimitRequest.DelLimit> delLimit;
    @XmlElement(name = "ModifyLimit")
    protected List<ChangeConsumptionLimitRequest.ModifyLimit> modifyLimit;

    /**
     * Gets the value of the limitObj property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeConsumptionLimitRequest.LimitObj }
     *     
     */
    public ChangeConsumptionLimitRequest.LimitObj getLimitObj() {
        return limitObj;
    }

    /**
     * Sets the value of the limitObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeConsumptionLimitRequest.LimitObj }
     *     
     */
    public void setLimitObj(ChangeConsumptionLimitRequest.LimitObj value) {
        this.limitObj = value;
    }

    /**
     * Gets the value of the addLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeConsumptionLimitRequest.AddLimit }
     * 
     * 
     */
    public List<ChangeConsumptionLimitRequest.AddLimit> getAddLimit() {
        if (addLimit == null) {
            addLimit = new ArrayList<ChangeConsumptionLimitRequest.AddLimit>();
        }
        return this.addLimit;
    }

    /**
     * Gets the value of the delLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeConsumptionLimitRequest.DelLimit }
     * 
     * 
     */
    public List<ChangeConsumptionLimitRequest.DelLimit> getDelLimit() {
        if (delLimit == null) {
            delLimit = new ArrayList<ChangeConsumptionLimitRequest.DelLimit>();
        }
        return this.delLimit;
    }

    /**
     * Gets the value of the modifyLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeConsumptionLimitRequest.ModifyLimit }
     * 
     * 
     */
    public List<ChangeConsumptionLimitRequest.ModifyLimit> getModifyLimit() {
        if (modifyLimit == null) {
            modifyLimit = new ArrayList<ChangeConsumptionLimitRequest.ModifyLimit>();
        }
        return this.modifyLimit;
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
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;choice&gt;
     *           &lt;sequence&gt;
     *             &lt;element name="MesureType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *             &lt;element name="MesureID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *           &lt;/sequence&gt;
     *           &lt;sequence&gt;
     *             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *           &lt;/sequence&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="LimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "content"
    })
    public static class AddLimit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElementRefs({
            @XmlElementRef(name = "UnitType", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LimitParam", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MesureID", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LimitType", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MesureType", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ExpirationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CurrencyID", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LimitValue", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends Serializable>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "LimitValue" is used by two different parts of a schema. See: 
         * line 32 of file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/schema/CBSInterface_BC_ChangeConsumptionLimit.xsd
         * line 28 of file:/C:/Users/o00440392/eclipse-workspace/esb/src/main/resources/schema/CBSInterface_BC_ChangeConsumptionLimit.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link ChangeConsumptionLimitRequest.AddLimit.LimitParam }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link Long }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends Serializable>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<? extends Serializable>>();
            }
            return this.content;
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
         *         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
            "paramCode",
            "paramValue"
        })
        public static class LimitParam implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ParamCode", required = true)
            protected String paramCode;
            @XmlElement(name = "ParamValue")
            protected long paramValue;

            /**
             * Gets the value of the paramCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamCode() {
                return paramCode;
            }

            /**
             * Sets the value of the paramCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamCode(String value) {
                this.paramCode = value;
            }

            /**
             * Gets the value of the paramValue property.
             * 
             */
            public long getParamValue() {
                return paramValue;
            }

            /**
             * Sets the value of the paramValue property.
             * 
             */
            public void setParamValue(long value) {
                this.paramValue = value;
            }

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
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "limitType"
    })
    public static class DelLimit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "LimitType", required = true)
        protected String limitType;

        /**
         * Gets the value of the limitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitType() {
            return limitType;
        }

        /**
         * Sets the value of the limitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitType(String value) {
            this.limitType = value;
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
     *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
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
        "subAccessCode",
        "custAccessCode"
    })
    public static class LimitObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "CustAccessCode")
        protected CustAccessCode custAccessCode;

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
         * Gets the value of the custAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccessCode }
         *     
         */
        public CustAccessCode getCustAccessCode() {
            return custAccessCode;
        }

        /**
         * Sets the value of the custAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccessCode }
         *     
         */
        public void setCustAccessCode(CustAccessCode value) {
            this.custAccessCode = value;
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
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="NewAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="LimitParam" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AddLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DelLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ModifyLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="OldParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                             &lt;element name="NewParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "limitType",
        "oldAmount",
        "newAmount",
        "limitParam"
    })
    public static class ModifyLimit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "LimitType", required = true)
        protected String limitType;
        @XmlElement(name = "OldAmount")
        protected Long oldAmount;
        @XmlElement(name = "NewAmount")
        protected Long newAmount;
        @XmlElement(name = "LimitParam")
        protected ChangeConsumptionLimitRequest.ModifyLimit.LimitParam limitParam;

        /**
         * Gets the value of the limitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitType() {
            return limitType;
        }

        /**
         * Sets the value of the limitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitType(String value) {
            this.limitType = value;
        }

        /**
         * Gets the value of the oldAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOldAmount() {
            return oldAmount;
        }

        /**
         * Sets the value of the oldAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOldAmount(Long value) {
            this.oldAmount = value;
        }

        /**
         * Gets the value of the newAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNewAmount() {
            return newAmount;
        }

        /**
         * Sets the value of the newAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNewAmount(Long value) {
            this.newAmount = value;
        }

        /**
         * Gets the value of the limitParam property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeConsumptionLimitRequest.ModifyLimit.LimitParam }
         *     
         */
        public ChangeConsumptionLimitRequest.ModifyLimit.LimitParam getLimitParam() {
            return limitParam;
        }

        /**
         * Sets the value of the limitParam property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeConsumptionLimitRequest.ModifyLimit.LimitParam }
         *     
         */
        public void setLimitParam(ChangeConsumptionLimitRequest.ModifyLimit.LimitParam value) {
            this.limitParam = value;
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
         *         &lt;element name="AddLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DelLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ModifyLimitParam" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="OldParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *                   &lt;element name="NewParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
        @XmlType(name = "", propOrder = {
            "addLimitParam",
            "delLimitParam",
            "modifyLimitParam"
        })
        public static class LimitParam
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AddLimitParam")
            protected List<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.AddLimitParam> addLimitParam;
            @XmlElement(name = "DelLimitParam")
            protected List<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.DelLimitParam> delLimitParam;
            @XmlElement(name = "ModifyLimitParam")
            protected List<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.ModifyLimitParam> modifyLimitParam;

            /**
             * Gets the value of the addLimitParam property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addLimitParam property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddLimitParam().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.AddLimitParam }
             * 
             * 
             */
            public List<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.AddLimitParam> getAddLimitParam() {
                if (addLimitParam == null) {
                    addLimitParam = new ArrayList<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.AddLimitParam>();
                }
                return this.addLimitParam;
            }

            /**
             * Gets the value of the delLimitParam property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delLimitParam property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelLimitParam().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.DelLimitParam }
             * 
             * 
             */
            public List<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.DelLimitParam> getDelLimitParam() {
                if (delLimitParam == null) {
                    delLimitParam = new ArrayList<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.DelLimitParam>();
                }
                return this.delLimitParam;
            }

            /**
             * Gets the value of the modifyLimitParam property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the modifyLimitParam property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getModifyLimitParam().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.ModifyLimitParam }
             * 
             * 
             */
            public List<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.ModifyLimitParam> getModifyLimitParam() {
                if (modifyLimitParam == null) {
                    modifyLimitParam = new ArrayList<ChangeConsumptionLimitRequest.ModifyLimit.LimitParam.ModifyLimitParam>();
                }
                return this.modifyLimitParam;
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
             *         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
                "paramCode",
                "paramValue"
            })
            public static class AddLimitParam
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "ParamCode", required = true)
                protected String paramCode;
                @XmlElement(name = "ParamValue")
                protected long paramValue;

                /**
                 * Gets the value of the paramCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParamCode() {
                    return paramCode;
                }

                /**
                 * Sets the value of the paramCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParamCode(String value) {
                    this.paramCode = value;
                }

                /**
                 * Gets the value of the paramValue property.
                 * 
                 */
                public long getParamValue() {
                    return paramValue;
                }

                /**
                 * Sets the value of the paramValue property.
                 * 
                 */
                public void setParamValue(long value) {
                    this.paramValue = value;
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
             *         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "paramCode"
            })
            public static class DelLimitParam
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "ParamCode", required = true)
                protected String paramCode;

                /**
                 * Gets the value of the paramCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParamCode() {
                    return paramCode;
                }

                /**
                 * Sets the value of the paramCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParamCode(String value) {
                    this.paramCode = value;
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
             *         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="OldParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
             *         &lt;element name="NewParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
                "paramCode",
                "oldParamValue",
                "newParamValue"
            })
            public static class ModifyLimitParam
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "ParamCode", required = true)
                protected String paramCode;
                @XmlElement(name = "OldParamValue")
                protected long oldParamValue;
                @XmlElement(name = "NewParamValue")
                protected long newParamValue;

                /**
                 * Gets the value of the paramCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParamCode() {
                    return paramCode;
                }

                /**
                 * Sets the value of the paramCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParamCode(String value) {
                    this.paramCode = value;
                }

                /**
                 * Gets the value of the oldParamValue property.
                 * 
                 */
                public long getOldParamValue() {
                    return oldParamValue;
                }

                /**
                 * Sets the value of the oldParamValue property.
                 * 
                 */
                public void setOldParamValue(long value) {
                    this.oldParamValue = value;
                }

                /**
                 * Gets the value of the newParamValue property.
                 * 
                 */
                public long getNewParamValue() {
                    return newParamValue;
                }

                /**
                 * Sets the value of the newParamValue property.
                 * 
                 */
                public void setNewParamValue(long value) {
                    this.newParamValue = value;
                }

            }

        }

    }

}
