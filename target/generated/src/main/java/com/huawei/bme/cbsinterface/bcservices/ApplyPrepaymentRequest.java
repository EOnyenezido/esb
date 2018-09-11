
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
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ApplyPrepaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplyPrepaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyObj"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                   &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                   &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RepayMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdditionalProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyPrepaymentRequest", propOrder = {
    "applyObj",
    "contractID",
    "offeringKey",
    "amount",
    "currencyID",
    "repayMode",
    "additionalProperty"
})
public class ApplyPrepaymentRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "ApplyObj", required = true)
    protected ApplyPrepaymentRequest.ApplyObj applyObj;
    @XmlElement(name = "ContractID")
    protected String contractID;
    @XmlElement(name = "OfferingKey")
    protected OfferingKey offeringKey;
    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;
    @XmlElement(name = "RepayMode", required = true)
    protected String repayMode;
    @XmlElement(name = "AdditionalProperty")
    protected List<SimpleProperty> additionalProperty;

    /**
     * Gets the value of the applyObj property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyPrepaymentRequest.ApplyObj }
     *     
     */
    public ApplyPrepaymentRequest.ApplyObj getApplyObj() {
        return applyObj;
    }

    /**
     * Sets the value of the applyObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyPrepaymentRequest.ApplyObj }
     *     
     */
    public void setApplyObj(ApplyPrepaymentRequest.ApplyObj value) {
        this.applyObj = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
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
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
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

    /**
     * Gets the value of the repayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayMode() {
        return repayMode;
    }

    /**
     * Sets the value of the repayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayMode(String value) {
        this.repayMode = value;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimpleProperty>();
        }
        return this.additionalProperty;
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
        "custAccessCode",
        "subGroupAccessCode"
    })
    public static class ApplyObj
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
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

    }

}
