
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for FeeDeductionRollBackRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDeductionRollBackRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeductSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeductObj"&gt;
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
 *         &lt;element name="RollBackFeeValues" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChargeSeq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FeeDeductionRollBackRequest", propOrder = {
    "deductSerialNo",
    "deductObj",
    "rollBackFeeValues"
})
public class FeeDeductionRollBackRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "DeductSerialNo", required = true)
    protected String deductSerialNo;
    @XmlElement(name = "DeductObj", required = true)
    protected FeeDeductionRollBackRequest.DeductObj deductObj;
    @XmlElement(name = "RollBackFeeValues")
    protected List<FeeDeductionRollBackRequest.RollBackFeeValues> rollBackFeeValues;

    /**
     * Gets the value of the deductSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductSerialNo() {
        return deductSerialNo;
    }

    /**
     * Sets the value of the deductSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductSerialNo(String value) {
        this.deductSerialNo = value;
    }

    /**
     * Gets the value of the deductObj property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDeductionRollBackRequest.DeductObj }
     *     
     */
    public FeeDeductionRollBackRequest.DeductObj getDeductObj() {
        return deductObj;
    }

    /**
     * Sets the value of the deductObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDeductionRollBackRequest.DeductObj }
     *     
     */
    public void setDeductObj(FeeDeductionRollBackRequest.DeductObj value) {
        this.deductObj = value;
    }

    /**
     * Gets the value of the rollBackFeeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rollBackFeeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollBackFeeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDeductionRollBackRequest.RollBackFeeValues }
     * 
     * 
     */
    public List<FeeDeductionRollBackRequest.RollBackFeeValues> getRollBackFeeValues() {
        if (rollBackFeeValues == null) {
            rollBackFeeValues = new ArrayList<FeeDeductionRollBackRequest.RollBackFeeValues>();
        }
        return this.rollBackFeeValues;
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
    public static class DeductObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "AcctAccessCode")
        protected FeeDeductionRollBackRequest.DeductObj.AcctAccessCode acctAccessCode;
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
         *     {@link FeeDeductionRollBackRequest.DeductObj.AcctAccessCode }
         *     
         */
        public FeeDeductionRollBackRequest.DeductObj.AcctAccessCode getAcctAccessCode() {
            return acctAccessCode;
        }

        /**
         * Sets the value of the acctAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeDeductionRollBackRequest.DeductObj.AcctAccessCode }
         *     
         */
        public void setAcctAccessCode(FeeDeductionRollBackRequest.DeductObj.AcctAccessCode value) {
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
     *         &lt;element name="ChargeSeq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "chargeSeq"
    })
    public static class RollBackFeeValues
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ChargeSeq", required = true)
        protected String chargeSeq;

        /**
         * Gets the value of the chargeSeq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeSeq() {
            return chargeSeq;
        }

        /**
         * Sets the value of the chargeSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeSeq(String value) {
            this.chargeSeq = value;
        }

    }

}
