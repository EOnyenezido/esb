
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for ChangeRedFlagRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRedFlagRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeObj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                   &lt;element name="AcctAccessCode"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DunningRedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditLimitRedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRedFlagRequest", propOrder = {
    "changeObj",
    "opType",
    "dunningRedFlag",
    "creditLimitRedFlag",
    "effectiveTime",
    "expirationTime"
})
public class ChangeRedFlagRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ChangeObj", required = true)
    protected ChangeRedFlagRequest.ChangeObj changeObj;
    @XmlElement(name = "OpType", required = true)
    protected String opType;
    @XmlElement(name = "DunningRedFlag")
    protected String dunningRedFlag;
    @XmlElement(name = "CreditLimitRedFlag")
    protected String creditLimitRedFlag;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;
    @XmlElement(name = "ExpirationTime", required = true)
    protected String expirationTime;

    /**
     * Gets the value of the changeObj property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeRedFlagRequest.ChangeObj }
     *     
     */
    public ChangeRedFlagRequest.ChangeObj getChangeObj() {
        return changeObj;
    }

    /**
     * Sets the value of the changeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeRedFlagRequest.ChangeObj }
     *     
     */
    public void setChangeObj(ChangeRedFlagRequest.ChangeObj value) {
        this.changeObj = value;
    }

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the dunningRedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningRedFlag() {
        return dunningRedFlag;
    }

    /**
     * Sets the value of the dunningRedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningRedFlag(String value) {
        this.dunningRedFlag = value;
    }

    /**
     * Gets the value of the creditLimitRedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitRedFlag() {
        return creditLimitRedFlag;
    }

    /**
     * Sets the value of the creditLimitRedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitRedFlag(String value) {
        this.creditLimitRedFlag = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link EffectMode }
     *     
     */
    public EffectMode getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectMode }
     *     
     */
    public void setEffectiveTime(EffectMode value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTime(String value) {
        this.expirationTime = value;
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
     *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
     *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
     *         &lt;element name="AcctAccessCode"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "custAccessCode",
        "subAccessCode",
        "acctAccessCode"
    })
    public static class ChangeObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CustAccessCode")
        protected CustAccessCode custAccessCode;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "AcctAccessCode")
        protected ChangeRedFlagRequest.ChangeObj.AcctAccessCode acctAccessCode;

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
         * Gets the value of the acctAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeRedFlagRequest.ChangeObj.AcctAccessCode }
         *     
         */
        public ChangeRedFlagRequest.ChangeObj.AcctAccessCode getAcctAccessCode() {
            return acctAccessCode;
        }

        /**
         * Sets the value of the acctAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeRedFlagRequest.ChangeObj.AcctAccessCode }
         *     
         */
        public void setAcctAccessCode(ChangeRedFlagRequest.ChangeObj.AcctAccessCode value) {
            this.acctAccessCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "payType"
        })
        public static class AcctAccessCode
            extends com.huawei.bme.cbsinterface.bccommon.AcctAccessCode
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PayType")
            protected String payType;

            /**
             * Gets the value of the payType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayType() {
                return payType;
            }

            /**
             * Sets the value of the payType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayType(String value) {
                this.payType = value;
            }

        }

    }

}
