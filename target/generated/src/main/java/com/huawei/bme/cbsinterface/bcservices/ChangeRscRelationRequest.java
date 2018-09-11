
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ChangeRscRelationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRscRelationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SubAccessCode"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="RscRelation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AddRelation" type="{http://www.huawei.com/bme/cbsinterface/bccommon}RscRelation" minOccurs="0"/&gt;
 *                   &lt;element name="DelRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RelationObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RelationDestIdentify"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                             &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="StartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                             &lt;element name="EndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ModRelation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RelationObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RelationDestIdentify"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OldRelation" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                                       &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NewRelation" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                                       &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ShareLimit" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                                                 &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NewDestIdentify" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="EffTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeRscRelationRequest", propOrder = {
    "subAccessCode",
    "subGroupAccessCode",
    "rscRelation"
})
public class ChangeRscRelationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode")
    protected ChangeRscRelationRequest.SubAccessCode subAccessCode;
    @XmlElement(name = "SubGroupAccessCode")
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "RscRelation", required = true)
    protected ChangeRscRelationRequest.RscRelation rscRelation;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeRscRelationRequest.SubAccessCode }
     *     
     */
    public ChangeRscRelationRequest.SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeRscRelationRequest.SubAccessCode }
     *     
     */
    public void setSubAccessCode(ChangeRscRelationRequest.SubAccessCode value) {
        this.subAccessCode = value;
    }

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

    /**
     * Gets the value of the rscRelation property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeRscRelationRequest.RscRelation }
     *     
     */
    public ChangeRscRelationRequest.RscRelation getRscRelation() {
        return rscRelation;
    }

    /**
     * Sets the value of the rscRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeRscRelationRequest.RscRelation }
     *     
     */
    public void setRscRelation(ChangeRscRelationRequest.RscRelation value) {
        this.rscRelation = value;
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
     *         &lt;element name="AddRelation" type="{http://www.huawei.com/bme/cbsinterface/bccommon}RscRelation" minOccurs="0"/&gt;
     *         &lt;element name="DelRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RelationObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="RelationDestIdentify"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *                   &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="StartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                   &lt;element name="EndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ModRelation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RelationObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="RelationDestIdentify"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OldRelation" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *                             &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NewRelation" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *                             &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ShareLimit" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *                                       &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NewDestIdentify" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="EffTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "addRelation",
        "delRelation",
        "modRelation"
    })
    public static class RscRelation
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AddRelation")
        protected com.huawei.bme.cbsinterface.bccommon.RscRelation addRelation;
        @XmlElement(name = "DelRelation")
        protected List<ChangeRscRelationRequest.RscRelation.DelRelation> delRelation;
        @XmlElement(name = "ModRelation")
        protected ChangeRscRelationRequest.RscRelation.ModRelation modRelation;

        /**
         * Gets the value of the addRelation property.
         * 
         * @return
         *     possible object is
         *     {@link com.huawei.bme.cbsinterface.bccommon.RscRelation }
         *     
         */
        public com.huawei.bme.cbsinterface.bccommon.RscRelation getAddRelation() {
            return addRelation;
        }

        /**
         * Sets the value of the addRelation property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.huawei.bme.cbsinterface.bccommon.RscRelation }
         *     
         */
        public void setAddRelation(com.huawei.bme.cbsinterface.bccommon.RscRelation value) {
            this.addRelation = value;
        }

        /**
         * Gets the value of the delRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeRscRelationRequest.RscRelation.DelRelation }
         * 
         * 
         */
        public List<ChangeRscRelationRequest.RscRelation.DelRelation> getDelRelation() {
            if (delRelation == null) {
                delRelation = new ArrayList<ChangeRscRelationRequest.RscRelation.DelRelation>();
            }
            return this.delRelation;
        }

        /**
         * Gets the value of the modRelation property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeRscRelationRequest.RscRelation.ModRelation }
         *     
         */
        public ChangeRscRelationRequest.RscRelation.ModRelation getModRelation() {
            return modRelation;
        }

        /**
         * Sets the value of the modRelation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeRscRelationRequest.RscRelation.ModRelation }
         *     
         */
        public void setModRelation(ChangeRscRelationRequest.RscRelation.ModRelation value) {
            this.modRelation = value;
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
         *         &lt;element name="RelationObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="RelationDestIdentify"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
         *         &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="StartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *         &lt;element name="EndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
            "relationObjType",
            "relationDestIdentify",
            "offeringKey",
            "shareRule",
            "startTime",
            "endTime"
        })
        public static class DelRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "RelationObjType", required = true)
            protected String relationObjType;
            @XmlElement(name = "RelationDestIdentify", required = true)
            protected ChangeRscRelationRequest.RscRelation.DelRelation.RelationDestIdentify relationDestIdentify;
            @XmlElement(name = "OfferingKey")
            protected OfferingKey offeringKey;
            @XmlElement(name = "ShareRule")
            protected String shareRule;
            @XmlElement(name = "StartTime")
            protected String startTime;
            @XmlElement(name = "EndTime")
            protected String endTime;

            /**
             * Gets the value of the relationObjType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationObjType() {
                return relationObjType;
            }

            /**
             * Sets the value of the relationObjType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationObjType(String value) {
                this.relationObjType = value;
            }

            /**
             * Gets the value of the relationDestIdentify property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeRscRelationRequest.RscRelation.DelRelation.RelationDestIdentify }
             *     
             */
            public ChangeRscRelationRequest.RscRelation.DelRelation.RelationDestIdentify getRelationDestIdentify() {
                return relationDestIdentify;
            }

            /**
             * Sets the value of the relationDestIdentify property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeRscRelationRequest.RscRelation.DelRelation.RelationDestIdentify }
             *     
             */
            public void setRelationDestIdentify(ChangeRscRelationRequest.RscRelation.DelRelation.RelationDestIdentify value) {
                this.relationDestIdentify = value;
            }

            /**
             * Gets the value of the offeringKey property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingKey }
             *     
             */
            public OfferingKey getOfferingKey() {
                return offeringKey;
            }

            /**
             * Sets the value of the offeringKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingKey }
             *     
             */
            public void setOfferingKey(OfferingKey value) {
                this.offeringKey = value;
            }

            /**
             * Gets the value of the shareRule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShareRule() {
                return shareRule;
            }

            /**
             * Sets the value of the shareRule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShareRule(String value) {
                this.shareRule = value;
            }

            /**
             * Gets the value of the startTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartTime() {
                return startTime;
            }

            /**
             * Sets the value of the startTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartTime(String value) {
                this.startTime = value;
            }

            /**
             * Gets the value of the endTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndTime() {
                return endTime;
            }

            /**
             * Sets the value of the endTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndTime(String value) {
                this.endTime = value;
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
             *         &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
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
                "subIdentify"
            })
            public static class RelationDestIdentify
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "SubIdentify")
                protected com.huawei.bme.cbsinterface.bccommon.SubAccessCode subIdentify;

                /**
                 * Gets the value of the subIdentify property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link com.huawei.bme.cbsinterface.bccommon.SubAccessCode }
                 *     
                 */
                public com.huawei.bme.cbsinterface.bccommon.SubAccessCode getSubIdentify() {
                    return subIdentify;
                }

                /**
                 * Sets the value of the subIdentify property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link com.huawei.bme.cbsinterface.bccommon.SubAccessCode }
                 *     
                 */
                public void setSubIdentify(com.huawei.bme.cbsinterface.bccommon.SubAccessCode value) {
                    this.subIdentify = value;
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
         *         &lt;element name="RelationObjType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="RelationDestIdentify"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OldRelation" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
         *                   &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NewRelation" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
         *                   &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ShareLimit" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
         *                             &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
         *         &lt;element name="NewDestIdentify" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="EffTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
            "relationObjType",
            "relationDestIdentify",
            "oldRelation",
            "newRelation",
            "newDestIdentify",
            "effTime"
        })
        public static class ModRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "RelationObjType", required = true)
            protected String relationObjType;
            @XmlElement(name = "RelationDestIdentify", required = true)
            protected ChangeRscRelationRequest.RscRelation.ModRelation.RelationDestIdentify relationDestIdentify;
            @XmlElement(name = "OldRelation")
            protected ChangeRscRelationRequest.RscRelation.ModRelation.OldRelation oldRelation;
            @XmlElement(name = "NewRelation")
            protected ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation newRelation;
            @XmlElement(name = "NewDestIdentify")
            protected ChangeRscRelationRequest.RscRelation.ModRelation.NewDestIdentify newDestIdentify;
            @XmlElement(name = "EffTime")
            protected String effTime;

            /**
             * Gets the value of the relationObjType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationObjType() {
                return relationObjType;
            }

            /**
             * Sets the value of the relationObjType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationObjType(String value) {
                this.relationObjType = value;
            }

            /**
             * Gets the value of the relationDestIdentify property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.RelationDestIdentify }
             *     
             */
            public ChangeRscRelationRequest.RscRelation.ModRelation.RelationDestIdentify getRelationDestIdentify() {
                return relationDestIdentify;
            }

            /**
             * Sets the value of the relationDestIdentify property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.RelationDestIdentify }
             *     
             */
            public void setRelationDestIdentify(ChangeRscRelationRequest.RscRelation.ModRelation.RelationDestIdentify value) {
                this.relationDestIdentify = value;
            }

            /**
             * Gets the value of the oldRelation property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.OldRelation }
             *     
             */
            public ChangeRscRelationRequest.RscRelation.ModRelation.OldRelation getOldRelation() {
                return oldRelation;
            }

            /**
             * Sets the value of the oldRelation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.OldRelation }
             *     
             */
            public void setOldRelation(ChangeRscRelationRequest.RscRelation.ModRelation.OldRelation value) {
                this.oldRelation = value;
            }

            /**
             * Gets the value of the newRelation property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation }
             *     
             */
            public ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation getNewRelation() {
                return newRelation;
            }

            /**
             * Sets the value of the newRelation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation }
             *     
             */
            public void setNewRelation(ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation value) {
                this.newRelation = value;
            }

            /**
             * Gets the value of the newDestIdentify property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.NewDestIdentify }
             *     
             */
            public ChangeRscRelationRequest.RscRelation.ModRelation.NewDestIdentify getNewDestIdentify() {
                return newDestIdentify;
            }

            /**
             * Sets the value of the newDestIdentify property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.NewDestIdentify }
             *     
             */
            public void setNewDestIdentify(ChangeRscRelationRequest.RscRelation.ModRelation.NewDestIdentify value) {
                this.newDestIdentify = value;
            }

            /**
             * Gets the value of the effTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffTime() {
                return effTime;
            }

            /**
             * Sets the value of the effTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffTime(String value) {
                this.effTime = value;
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
             *         &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
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
                "subIdentify"
            })
            public static class NewDestIdentify
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "SubIdentify")
                protected com.huawei.bme.cbsinterface.bccommon.SubAccessCode subIdentify;

                /**
                 * Gets the value of the subIdentify property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link com.huawei.bme.cbsinterface.bccommon.SubAccessCode }
                 *     
                 */
                public com.huawei.bme.cbsinterface.bccommon.SubAccessCode getSubIdentify() {
                    return subIdentify;
                }

                /**
                 * Sets the value of the subIdentify property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link com.huawei.bme.cbsinterface.bccommon.SubAccessCode }
                 *     
                 */
                public void setSubIdentify(com.huawei.bme.cbsinterface.bccommon.SubAccessCode value) {
                    this.subIdentify = value;
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
             *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
             *         &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ShareLimit" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
             *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                "offeringKey",
                "shareRule",
                "shareLimit"
            })
            public static class NewRelation
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OfferingKey")
                protected OfferingKey offeringKey;
                @XmlElement(name = "ShareRule")
                protected String shareRule;
                @XmlElement(name = "ShareLimit")
                protected ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation.ShareLimit shareLimit;

                /**
                 * Gets the value of the offeringKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferingKey }
                 *     
                 */
                public OfferingKey getOfferingKey() {
                    return offeringKey;
                }

                /**
                 * Sets the value of the offeringKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferingKey }
                 *     
                 */
                public void setOfferingKey(OfferingKey value) {
                    this.offeringKey = value;
                }

                /**
                 * Gets the value of the shareRule property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShareRule() {
                    return shareRule;
                }

                /**
                 * Sets the value of the shareRule property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShareRule(String value) {
                    this.shareRule = value;
                }

                /**
                 * Gets the value of the shareLimit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation.ShareLimit }
                 *     
                 */
                public ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation.ShareLimit getShareLimit() {
                    return shareLimit;
                }

                /**
                 * Sets the value of the shareLimit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation.ShareLimit }
                 *     
                 */
                public void setShareLimit(ChangeRscRelationRequest.RscRelation.ModRelation.NewRelation.ShareLimit value) {
                    this.shareLimit = value;
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
                 *         &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
                 *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                    "limitCycleType",
                    "limitValue",
                    "measureUnit"
                })
                public static class ShareLimit
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "LimitCycleType")
                    protected String limitCycleType;
                    @XmlElement(name = "LimitValue")
                    protected Long limitValue;
                    @XmlElement(name = "MeasureUnit")
                    protected BigInteger measureUnit;

                    /**
                     * Gets the value of the limitCycleType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLimitCycleType() {
                        return limitCycleType;
                    }

                    /**
                     * Sets the value of the limitCycleType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLimitCycleType(String value) {
                        this.limitCycleType = value;
                    }

                    /**
                     * Gets the value of the limitValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getLimitValue() {
                        return limitValue;
                    }

                    /**
                     * Sets the value of the limitValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setLimitValue(Long value) {
                        this.limitValue = value;
                    }

                    /**
                     * Gets the value of the measureUnit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMeasureUnit() {
                        return measureUnit;
                    }

                    /**
                     * Sets the value of the measureUnit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMeasureUnit(BigInteger value) {
                        this.measureUnit = value;
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
             *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
             *         &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "offeringKey",
                "shareRule"
            })
            public static class OldRelation
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OfferingKey")
                protected OfferingKey offeringKey;
                @XmlElement(name = "ShareRule")
                protected String shareRule;

                /**
                 * Gets the value of the offeringKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferingKey }
                 *     
                 */
                public OfferingKey getOfferingKey() {
                    return offeringKey;
                }

                /**
                 * Sets the value of the offeringKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferingKey }
                 *     
                 */
                public void setOfferingKey(OfferingKey value) {
                    this.offeringKey = value;
                }

                /**
                 * Gets the value of the shareRule property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShareRule() {
                    return shareRule;
                }

                /**
                 * Sets the value of the shareRule property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShareRule(String value) {
                    this.shareRule = value;
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
             *         &lt;element name="SubIdentify" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
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
                "subIdentify"
            })
            public static class RelationDestIdentify
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "SubIdentify")
                protected com.huawei.bme.cbsinterface.bccommon.SubAccessCode subIdentify;

                /**
                 * Gets the value of the subIdentify property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link com.huawei.bme.cbsinterface.bccommon.SubAccessCode }
                 *     
                 */
                public com.huawei.bme.cbsinterface.bccommon.SubAccessCode getSubIdentify() {
                    return subIdentify;
                }

                /**
                 * Sets the value of the subIdentify property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link com.huawei.bme.cbsinterface.bccommon.SubAccessCode }
                 *     
                 */
                public void setSubIdentify(com.huawei.bme.cbsinterface.bccommon.SubAccessCode value) {
                    this.subIdentify = value;
                }

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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SubAccessCode
        extends com.huawei.bme.cbsinterface.bccommon.SubAccessCode
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;

    }

}
