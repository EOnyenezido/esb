
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.InstProperty;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for FeeQuotationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeQuotationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChargeObj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
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
 *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChargeElement"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FeeAmount" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OfferingFee" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="ParentOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *                                       &lt;element name="OInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                                 &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                                 &lt;element name="PInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                                           &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
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
 *                   &lt;element name="OperationFee" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="OperationProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FeeQuotationRequest", propOrder = {
    "chargeObj",
    "chargeElement"
})
public class FeeQuotationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ChargeObj", required = true)
    protected FeeQuotationRequest.ChargeObj chargeObj;
    @XmlElement(name = "ChargeElement", required = true)
    protected FeeQuotationRequest.ChargeElement chargeElement;

    /**
     * Gets the value of the chargeObj property.
     * 
     * @return
     *     possible object is
     *     {@link FeeQuotationRequest.ChargeObj }
     *     
     */
    public FeeQuotationRequest.ChargeObj getChargeObj() {
        return chargeObj;
    }

    /**
     * Sets the value of the chargeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeQuotationRequest.ChargeObj }
     *     
     */
    public void setChargeObj(FeeQuotationRequest.ChargeObj value) {
        this.chargeObj = value;
    }

    /**
     * Gets the value of the chargeElement property.
     * 
     * @return
     *     possible object is
     *     {@link FeeQuotationRequest.ChargeElement }
     *     
     */
    public FeeQuotationRequest.ChargeElement getChargeElement() {
        return chargeElement;
    }

    /**
     * Sets the value of the chargeElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeQuotationRequest.ChargeElement }
     *     
     */
    public void setChargeElement(FeeQuotationRequest.ChargeElement value) {
        this.chargeElement = value;
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
     *         &lt;element name="FeeAmount" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OfferingFee" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="ParentOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
     *                             &lt;element name="OInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                                       &lt;element name="PInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                                                 &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                             &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
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
     *         &lt;element name="OperationFee" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="OperationProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "feeAmount",
        "offeringFee",
        "operationFee"
    })
    public static class ChargeElement
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "FeeAmount")
        protected List<FeeQuotationRequest.ChargeElement.FeeAmount> feeAmount;
        @XmlElement(name = "OfferingFee")
        protected FeeQuotationRequest.ChargeElement.OfferingFee offeringFee;
        @XmlElement(name = "OperationFee")
        protected FeeQuotationRequest.ChargeElement.OperationFee operationFee;

        /**
         * Gets the value of the feeAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeQuotationRequest.ChargeElement.FeeAmount }
         * 
         * 
         */
        public List<FeeQuotationRequest.ChargeElement.FeeAmount> getFeeAmount() {
            if (feeAmount == null) {
                feeAmount = new ArrayList<FeeQuotationRequest.ChargeElement.FeeAmount>();
            }
            return this.feeAmount;
        }

        /**
         * Gets the value of the offeringFee property.
         * 
         * @return
         *     possible object is
         *     {@link FeeQuotationRequest.ChargeElement.OfferingFee }
         *     
         */
        public FeeQuotationRequest.ChargeElement.OfferingFee getOfferingFee() {
            return offeringFee;
        }

        /**
         * Sets the value of the offeringFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeQuotationRequest.ChargeElement.OfferingFee }
         *     
         */
        public void setOfferingFee(FeeQuotationRequest.ChargeElement.OfferingFee value) {
            this.offeringFee = value;
        }

        /**
         * Gets the value of the operationFee property.
         * 
         * @return
         *     possible object is
         *     {@link FeeQuotationRequest.ChargeElement.OperationFee }
         *     
         */
        public FeeQuotationRequest.ChargeElement.OperationFee getOperationFee() {
            return operationFee;
        }

        /**
         * Sets the value of the operationFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeQuotationRequest.ChargeElement.OperationFee }
         *     
         */
        public void setOperationFee(FeeQuotationRequest.ChargeElement.OperationFee value) {
            this.operationFee = value;
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
         *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "chargeCode",
            "chargeAmt",
            "currencyID"
        })
        public static class FeeAmount
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ChargeCode", required = true)
            protected String chargeCode;
            @XmlElement(name = "ChargeAmt")
            protected long chargeAmt;
            @XmlElement(name = "CurrencyID", required = true)
            protected BigInteger currencyID;

            /**
             * Gets the value of the chargeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeCode() {
                return chargeCode;
            }

            /**
             * Sets the value of the chargeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeCode(String value) {
                this.chargeCode = value;
            }

            /**
             * Gets the value of the chargeAmt property.
             * 
             */
            public long getChargeAmt() {
                return chargeAmt;
            }

            /**
             * Sets the value of the chargeAmt property.
             * 
             */
            public void setChargeAmt(long value) {
                this.chargeAmt = value;
            }

            /**
             * Gets the value of the currencyID property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCurrencyID() {
                return currencyID;
            }

            /**
             * Sets the value of the currencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCurrencyID(BigInteger value) {
                this.currencyID = value;
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
         *         &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="ParentOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
         *                   &lt;element name="OInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
         *                             &lt;element name="PInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                                       &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                   &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
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
            "addOffering",
            "delOffering"
        })
        public static class OfferingFee
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "AddOffering")
            protected List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering> addOffering;
            @XmlElement(name = "DelOffering")
            protected List<FeeQuotationRequest.ChargeElement.OfferingFee.DelOffering> delOffering;

            /**
             * Gets the value of the addOffering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addOffering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddOffering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering }
             * 
             * 
             */
            public List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering> getAddOffering() {
                if (addOffering == null) {
                    addOffering = new ArrayList<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering>();
                }
                return this.addOffering;
            }

            /**
             * Gets the value of the delOffering property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the delOffering property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDelOffering().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeQuotationRequest.ChargeElement.OfferingFee.DelOffering }
             * 
             * 
             */
            public List<FeeQuotationRequest.ChargeElement.OfferingFee.DelOffering> getDelOffering() {
                if (delOffering == null) {
                    delOffering = new ArrayList<FeeQuotationRequest.ChargeElement.OfferingFee.DelOffering>();
                }
                return this.delOffering;
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
             *         &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="ParentOfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
             *         &lt;element name="OInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
             *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProductInst" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
             *                   &lt;element name="PInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
             *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TrialStartTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
             *         &lt;element name="TrialEndTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
                "offeringID",
                "parentOfferingKey",
                "oInstProperty",
                "productInst",
                "trialStartTime",
                "trialEndTime"
            })
            public static class AddOffering
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OfferingID", required = true, nillable = true)
                protected BigInteger offeringID;
                @XmlElement(name = "ParentOfferingKey")
                protected OfferingKey parentOfferingKey;
                @XmlElement(name = "OInstProperty")
                protected List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.OInstProperty> oInstProperty;
                @XmlElement(name = "ProductInst")
                protected List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst> productInst;
                @XmlElement(name = "TrialStartTime")
                protected String trialStartTime;
                @XmlElement(name = "TrialEndTime")
                protected String trialEndTime;

                /**
                 * Gets the value of the offeringID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getOfferingID() {
                    return offeringID;
                }

                /**
                 * Sets the value of the offeringID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setOfferingID(BigInteger value) {
                    this.offeringID = value;
                }

                /**
                 * Gets the value of the parentOfferingKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OfferingKey }
                 *     
                 */
                public OfferingKey getParentOfferingKey() {
                    return parentOfferingKey;
                }

                /**
                 * Sets the value of the parentOfferingKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OfferingKey }
                 *     
                 */
                public void setParentOfferingKey(OfferingKey value) {
                    this.parentOfferingKey = value;
                }

                /**
                 * Gets the value of the oInstProperty property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the oInstProperty property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOInstProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.OInstProperty }
                 * 
                 * 
                 */
                public List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.OInstProperty> getOInstProperty() {
                    if (oInstProperty == null) {
                        oInstProperty = new ArrayList<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.OInstProperty>();
                    }
                    return this.oInstProperty;
                }

                /**
                 * Gets the value of the productInst property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the productInst property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProductInst().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst }
                 * 
                 * 
                 */
                public List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst> getProductInst() {
                    if (productInst == null) {
                        productInst = new ArrayList<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst>();
                    }
                    return this.productInst;
                }

                /**
                 * Gets the value of the trialStartTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrialStartTime() {
                    return trialStartTime;
                }

                /**
                 * Sets the value of the trialStartTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrialStartTime(String value) {
                    this.trialStartTime = value;
                }

                /**
                 * Gets the value of the trialEndTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrialEndTime() {
                    return trialEndTime;
                }

                /**
                 * Sets the value of the trialEndTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrialEndTime(String value) {
                    this.trialEndTime = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
                 *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
                    "effectiveTime",
                    "expirationTime"
                })
                public static class OInstProperty
                    extends InstProperty
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "EffectiveTime")
                    protected String effectiveTime;
                    @XmlElement(name = "ExpirationTime")
                    protected String expirationTime;

                    /**
                     * Gets the value of the effectiveTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEffectiveTime() {
                        return effectiveTime;
                    }

                    /**
                     * Sets the value of the effectiveTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEffectiveTime(String value) {
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
                 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
                 *         &lt;element name="PInstProperty" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
                 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
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
                    "productID",
                    "pInstProperty"
                })
                public static class ProductInst
                    implements Serializable
                {

                    private final static long serialVersionUID = 11082012L;
                    @XmlElement(name = "ProductID")
                    protected long productID;
                    @XmlElement(name = "PInstProperty")
                    protected List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst.PInstProperty> pInstProperty;

                    /**
                     * Gets the value of the productID property.
                     * 
                     */
                    public long getProductID() {
                        return productID;
                    }

                    /**
                     * Sets the value of the productID property.
                     * 
                     */
                    public void setProductID(long value) {
                        this.productID = value;
                    }

                    /**
                     * Gets the value of the pInstProperty property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the pInstProperty property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPInstProperty().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst.PInstProperty }
                     * 
                     * 
                     */
                    public List<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst.PInstProperty> getPInstProperty() {
                        if (pInstProperty == null) {
                            pInstProperty = new ArrayList<FeeQuotationRequest.ChargeElement.OfferingFee.AddOffering.ProductInst.PInstProperty>();
                        }
                        return this.pInstProperty;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}InstProperty"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
                     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
                        "effectiveTime",
                        "expirationTime"
                    })
                    public static class PInstProperty
                        extends InstProperty
                        implements Serializable
                    {

                        private final static long serialVersionUID = 11082012L;
                        @XmlElement(name = "EffectiveTime")
                        protected String effectiveTime;
                        @XmlElement(name = "ExpirationTime")
                        protected String expirationTime;

                        /**
                         * Gets the value of the effectiveTime property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEffectiveTime() {
                            return effectiveTime;
                        }

                        /**
                         * Sets the value of the effectiveTime property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEffectiveTime(String value) {
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
             *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/&gt;
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
                "offeringKey"
            })
            public static class DelOffering
                implements Serializable
            {

                private final static long serialVersionUID = 11082012L;
                @XmlElement(name = "OfferingKey", required = true, nillable = true)
                protected OfferingKey offeringKey;

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
         *         &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="OperationProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "operationCode",
            "operationProperty"
        })
        public static class OperationFee
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "OperationCode", required = true)
            protected String operationCode;
            @XmlElement(name = "OperationProperty")
            protected List<SimpleProperty> operationProperty;

            /**
             * Gets the value of the operationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationCode() {
                return operationCode;
            }

            /**
             * Sets the value of the operationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationCode(String value) {
                this.operationCode = value;
            }

            /**
             * Gets the value of the operationProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the operationProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOperationProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleProperty }
             * 
             * 
             */
            public List<SimpleProperty> getOperationProperty() {
                if (operationProperty == null) {
                    operationProperty = new ArrayList<SimpleProperty>();
                }
                return this.operationProperty;
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
     *       &lt;choice&gt;
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
     *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
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
        "subAccessCode",
        "acctAccessCode",
        "custAccessCode",
        "subGroupAccessCode"
    })
    public static class ChargeObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "AcctAccessCode")
        protected FeeQuotationRequest.ChargeObj.AcctAccessCode acctAccessCode;
        @XmlElement(name = "CustAccessCode")
        protected CustAccessCode custAccessCode;
        @XmlElement(name = "SubGroupAccessCode")
        protected SubGroupAccessCode subGroupAccessCode;

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
         *     {@link FeeQuotationRequest.ChargeObj.AcctAccessCode }
         *     
         */
        public FeeQuotationRequest.ChargeObj.AcctAccessCode getAcctAccessCode() {
            return acctAccessCode;
        }

        /**
         * Sets the value of the acctAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeQuotationRequest.ChargeObj.AcctAccessCode }
         *     
         */
        public void setAcctAccessCode(FeeQuotationRequest.ChargeObj.AcctAccessCode value) {
            this.acctAccessCode = value;
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
