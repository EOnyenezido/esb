
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.PayRelExtRule;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for ChangeSubDFTAcctRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubDFTAcctRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="SubDFTAccount"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OldDFTAcct" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NewDFTAcct"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="DFTPayRelation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
 *                             &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PaymentLimit" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PaymentLimitInfo"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/&gt;
 *         &lt;element name="ControlProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeSubDFTAcctRequest", propOrder = {
    "subAccessCode",
    "subDFTAccount",
    "dftPayRelation",
    "effectiveTime",
    "controlProperty"
})
public class ChangeSubDFTAcctRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "SubDFTAccount", required = true)
    protected ChangeSubDFTAcctRequest.SubDFTAccount subDFTAccount;
    @XmlElement(name = "DFTPayRelation")
    protected ChangeSubDFTAcctRequest.DFTPayRelation dftPayRelation;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;
    @XmlElement(name = "ControlProperty")
    protected List<SimpleProperty> controlProperty;

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
     * Gets the value of the subDFTAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubDFTAcctRequest.SubDFTAccount }
     *     
     */
    public ChangeSubDFTAcctRequest.SubDFTAccount getSubDFTAccount() {
        return subDFTAccount;
    }

    /**
     * Sets the value of the subDFTAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubDFTAcctRequest.SubDFTAccount }
     *     
     */
    public void setSubDFTAccount(ChangeSubDFTAcctRequest.SubDFTAccount value) {
        this.subDFTAccount = value;
    }

    /**
     * Gets the value of the dftPayRelation property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubDFTAcctRequest.DFTPayRelation }
     *     
     */
    public ChangeSubDFTAcctRequest.DFTPayRelation getDFTPayRelation() {
        return dftPayRelation;
    }

    /**
     * Sets the value of the dftPayRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubDFTAcctRequest.DFTPayRelation }
     *     
     */
    public void setDFTPayRelation(ChangeSubDFTAcctRequest.DFTPayRelation value) {
        this.dftPayRelation = value;
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
     * Gets the value of the controlProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getControlProperty() {
        if (controlProperty == null) {
            controlProperty = new ArrayList<SimpleProperty>();
        }
        return this.controlProperty;
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
     *         &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AddPayRelation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
     *                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PaymentLimit" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PaymentLimitInfo"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
     *                         &lt;/extension&gt;
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
        "delPayRelation",
        "addPayRelation",
        "paymentLimit"
    })
    public static class DFTPayRelation
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "DelPayRelation")
        protected List<ChangeSubDFTAcctRequest.DFTPayRelation.DelPayRelation> delPayRelation;
        @XmlElement(name = "AddPayRelation")
        protected List<ChangeSubDFTAcctRequest.DFTPayRelation.AddPayRelation> addPayRelation;
        @XmlElement(name = "PaymentLimit")
        protected ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit paymentLimit;

        /**
         * Gets the value of the delPayRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delPayRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelPayRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubDFTAcctRequest.DFTPayRelation.DelPayRelation }
         * 
         * 
         */
        public List<ChangeSubDFTAcctRequest.DFTPayRelation.DelPayRelation> getDelPayRelation() {
            if (delPayRelation == null) {
                delPayRelation = new ArrayList<ChangeSubDFTAcctRequest.DFTPayRelation.DelPayRelation>();
            }
            return this.delPayRelation;
        }

        /**
         * Gets the value of the addPayRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addPayRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddPayRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubDFTAcctRequest.DFTPayRelation.AddPayRelation }
         * 
         * 
         */
        public List<ChangeSubDFTAcctRequest.DFTPayRelation.AddPayRelation> getAddPayRelation() {
            if (addPayRelation == null) {
                addPayRelation = new ArrayList<ChangeSubDFTAcctRequest.DFTPayRelation.AddPayRelation>();
            }
            return this.addPayRelation;
        }

        /**
         * Gets the value of the paymentLimit property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit }
         *     
         */
        public ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit getPaymentLimit() {
            return paymentLimit;
        }

        /**
         * Sets the value of the paymentLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit }
         *     
         */
        public void setPaymentLimit(ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit value) {
            this.paymentLimit = value;
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
         *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/&gt;
         *         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "payRelationKey",
            "acctKey",
            "priority",
            "payRelExtRule",
            "onlyPayRelFlag",
            "paymentLimitKey"
        })
        public static class AddPayRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PayRelationKey")
            protected String payRelationKey;
            @XmlElement(name = "AcctKey", required = true)
            protected String acctKey;
            @XmlElement(name = "Priority")
            protected BigInteger priority;
            @XmlElement(name = "PayRelExtRule")
            protected PayRelExtRule payRelExtRule;
            @XmlElement(name = "OnlyPayRelFlag")
            protected String onlyPayRelFlag;
            @XmlElement(name = "PaymentLimitKey")
            protected String paymentLimitKey;

            /**
             * Gets the value of the payRelationKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayRelationKey() {
                return payRelationKey;
            }

            /**
             * Sets the value of the payRelationKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayRelationKey(String value) {
                this.payRelationKey = value;
            }

            /**
             * Gets the value of the acctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctKey() {
                return acctKey;
            }

            /**
             * Sets the value of the acctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctKey(String value) {
                this.acctKey = value;
            }

            /**
             * Gets the value of the priority property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPriority() {
                return priority;
            }

            /**
             * Sets the value of the priority property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPriority(BigInteger value) {
                this.priority = value;
            }

            /**
             * Gets the value of the payRelExtRule property.
             * 
             * @return
             *     possible object is
             *     {@link PayRelExtRule }
             *     
             */
            public PayRelExtRule getPayRelExtRule() {
                return payRelExtRule;
            }

            /**
             * Sets the value of the payRelExtRule property.
             * 
             * @param value
             *     allowed object is
             *     {@link PayRelExtRule }
             *     
             */
            public void setPayRelExtRule(PayRelExtRule value) {
                this.payRelExtRule = value;
            }

            /**
             * Gets the value of the onlyPayRelFlag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOnlyPayRelFlag() {
                return onlyPayRelFlag;
            }

            /**
             * Sets the value of the onlyPayRelFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOnlyPayRelFlag(String value) {
                this.onlyPayRelFlag = value;
            }

            /**
             * Gets the value of the paymentLimitKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentLimitKey() {
                return paymentLimitKey;
            }

            /**
             * Sets the value of the paymentLimitKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentLimitKey(String value) {
                this.paymentLimitKey = value;
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
         *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "payRelationKey"
        })
        public static class DelPayRelation
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PayRelationKey")
            protected String payRelationKey;

            /**
             * Gets the value of the payRelationKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayRelationKey() {
                return payRelationKey;
            }

            /**
             * Sets the value of the payRelationKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayRelationKey(String value) {
                this.payRelationKey = value;
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
         *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PaymentLimitInfo"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
         *               &lt;/extension&gt;
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
            "paymentLimitKey",
            "paymentLimitInfo"
        })
        public static class PaymentLimit
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PaymentLimitKey", required = true)
            protected String paymentLimitKey;
            @XmlElement(name = "PaymentLimitInfo", required = true)
            protected ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

            /**
             * Gets the value of the paymentLimitKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentLimitKey() {
                return paymentLimitKey;
            }

            /**
             * Sets the value of the paymentLimitKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentLimitKey(String value) {
                this.paymentLimitKey = value;
            }

            /**
             * Gets the value of the paymentLimitInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit.PaymentLimitInfo }
             *     
             */
            public ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                return paymentLimitInfo;
            }

            /**
             * Sets the value of the paymentLimitInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit.PaymentLimitInfo }
             *     
             */
            public void setPaymentLimitInfo(ChangeSubDFTAcctRequest.DFTPayRelation.PaymentLimit.PaymentLimitInfo value) {
                this.paymentLimitInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentLimitInfo
                extends com.huawei.bme.cbsinterface.bccommon.PaymentLimit
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;

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
     *         &lt;element name="OldDFTAcct" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NewDFTAcct"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "oldDFTAcct",
        "newDFTAcct"
    })
    public static class SubDFTAccount
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OldDFTAcct")
        protected ChangeSubDFTAcctRequest.SubDFTAccount.OldDFTAcct oldDFTAcct;
        @XmlElement(name = "NewDFTAcct", required = true)
        protected ChangeSubDFTAcctRequest.SubDFTAccount.NewDFTAcct newDFTAcct;

        /**
         * Gets the value of the oldDFTAcct property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubDFTAcctRequest.SubDFTAccount.OldDFTAcct }
         *     
         */
        public ChangeSubDFTAcctRequest.SubDFTAccount.OldDFTAcct getOldDFTAcct() {
            return oldDFTAcct;
        }

        /**
         * Sets the value of the oldDFTAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubDFTAcctRequest.SubDFTAccount.OldDFTAcct }
         *     
         */
        public void setOldDFTAcct(ChangeSubDFTAcctRequest.SubDFTAccount.OldDFTAcct value) {
            this.oldDFTAcct = value;
        }

        /**
         * Gets the value of the newDFTAcct property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeSubDFTAcctRequest.SubDFTAccount.NewDFTAcct }
         *     
         */
        public ChangeSubDFTAcctRequest.SubDFTAccount.NewDFTAcct getNewDFTAcct() {
            return newDFTAcct;
        }

        /**
         * Sets the value of the newDFTAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeSubDFTAcctRequest.SubDFTAccount.NewDFTAcct }
         *     
         */
        public void setNewDFTAcct(ChangeSubDFTAcctRequest.SubDFTAccount.NewDFTAcct value) {
            this.newDFTAcct = value;
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
         *         &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "prePaidAcctKey",
            "postPaidAcctKey",
            "dftAcctKey"
        })
        public static class NewDFTAcct
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PrePaidAcctKey")
            protected String prePaidAcctKey;
            @XmlElement(name = "PostPaidAcctKey")
            protected String postPaidAcctKey;
            @XmlElement(name = "DFTAcctKey")
            protected String dftAcctKey;

            /**
             * Gets the value of the prePaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrePaidAcctKey() {
                return prePaidAcctKey;
            }

            /**
             * Sets the value of the prePaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrePaidAcctKey(String value) {
                this.prePaidAcctKey = value;
            }

            /**
             * Gets the value of the postPaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostPaidAcctKey() {
                return postPaidAcctKey;
            }

            /**
             * Sets the value of the postPaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostPaidAcctKey(String value) {
                this.postPaidAcctKey = value;
            }

            /**
             * Gets the value of the dftAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDFTAcctKey() {
                return dftAcctKey;
            }

            /**
             * Sets the value of the dftAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDFTAcctKey(String value) {
                this.dftAcctKey = value;
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
         *         &lt;element name="PrePaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PostPaidAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DFTAcctKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "prePaidAcctKey",
            "postPaidAcctKey",
            "dftAcctKey"
        })
        public static class OldDFTAcct
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "PrePaidAcctKey")
            protected String prePaidAcctKey;
            @XmlElement(name = "PostPaidAcctKey")
            protected String postPaidAcctKey;
            @XmlElement(name = "DFTAcctKey")
            protected String dftAcctKey;

            /**
             * Gets the value of the prePaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrePaidAcctKey() {
                return prePaidAcctKey;
            }

            /**
             * Sets the value of the prePaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrePaidAcctKey(String value) {
                this.prePaidAcctKey = value;
            }

            /**
             * Gets the value of the postPaidAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostPaidAcctKey() {
                return postPaidAcctKey;
            }

            /**
             * Sets the value of the postPaidAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostPaidAcctKey(String value) {
                this.postPaidAcctKey = value;
            }

            /**
             * Gets the value of the dftAcctKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDFTAcctKey() {
                return dftAcctKey;
            }

            /**
             * Sets the value of the dftAcctKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDFTAcctKey(String value) {
                this.dftAcctKey = value;
            }

        }

    }

}
