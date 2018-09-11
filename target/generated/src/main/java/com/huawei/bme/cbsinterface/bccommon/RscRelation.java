
package com.huawei.bme.cbsinterface.bccommon;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RscRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RscRelation"&gt;
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
 *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *         &lt;element name="ShareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShareLimit" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "RscRelation", propOrder = {
    "relationObjType",
    "relationDestIdentify",
    "offeringKey",
    "shareRule",
    "shareLimit",
    "startTime",
    "endTime"
})
public class RscRelation
    implements Serializable
{

    private final static long serialVersionUID = 11082017L;
    @XmlElement(name = "RelationObjType", required = true)
    protected String relationObjType;
    @XmlElement(name = "RelationDestIdentify", required = true)
    protected RscRelation.RelationDestIdentify relationDestIdentify;
    @XmlElement(name = "OfferingKey")
    protected OfferingKey offeringKey;
    @XmlElement(name = "ShareRule")
    protected String shareRule;
    @XmlElement(name = "ShareLimit")
    protected RscRelation.ShareLimit shareLimit;
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
     *     {@link RscRelation.RelationDestIdentify }
     *     
     */
    public RscRelation.RelationDestIdentify getRelationDestIdentify() {
        return relationDestIdentify;
    }

    /**
     * Sets the value of the relationDestIdentify property.
     * 
     * @param value
     *     allowed object is
     *     {@link RscRelation.RelationDestIdentify }
     *     
     */
    public void setRelationDestIdentify(RscRelation.RelationDestIdentify value) {
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
     * Gets the value of the shareLimit property.
     * 
     * @return
     *     possible object is
     *     {@link RscRelation.ShareLimit }
     *     
     */
    public RscRelation.ShareLimit getShareLimit() {
        return shareLimit;
    }

    /**
     * Sets the value of the shareLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RscRelation.ShareLimit }
     *     
     */
    public void setShareLimit(RscRelation.ShareLimit value) {
        this.shareLimit = value;
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
     *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
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
        "subIdentify",
        "subGroupAccessCode"
    })
    public static class RelationDestIdentify
        implements Serializable
    {

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "SubIdentify")
        protected SubAccessCode subIdentify;
        @XmlElement(name = "SubGroupAccessCode")
        protected SubGroupAccessCode subGroupAccessCode;

        /**
         * Gets the value of the subIdentify property.
         * 
         * @return
         *     possible object is
         *     {@link SubAccessCode }
         *     
         */
        public SubAccessCode getSubIdentify() {
            return subIdentify;
        }

        /**
         * Sets the value of the subIdentify property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubAccessCode }
         *     
         */
        public void setSubIdentify(SubAccessCode value) {
            this.subIdentify = value;
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
     *         &lt;element name="LimitCycleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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

        private final static long serialVersionUID = 11082017L;
        @XmlElement(name = "LimitCycleType", required = true)
        protected String limitCycleType;
        @XmlElement(name = "LimitValue")
        protected long limitValue;
        @XmlElement(name = "MeasureUnit", required = true)
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
         */
        public long getLimitValue() {
            return limitValue;
        }

        /**
         * Sets the value of the limitValue property.
         * 
         */
        public void setLimitValue(long value) {
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
