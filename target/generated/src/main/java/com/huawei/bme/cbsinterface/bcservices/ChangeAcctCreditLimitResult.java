
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAcctCreditLimitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcctCreditLimitResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditLimit" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="LimitClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ChangeAcctCreditLimitResult", propOrder = {
    "creditLimit"
})
public class ChangeAcctCreditLimitResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CreditLimit", required = true)
    protected List<ChangeAcctCreditLimitResult.CreditLimit> creditLimit;

    /**
     * Gets the value of the creditLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeAcctCreditLimitResult.CreditLimit }
     * 
     * 
     */
    public List<ChangeAcctCreditLimitResult.CreditLimit> getCreditLimit() {
        if (creditLimit == null) {
            creditLimit = new ArrayList<ChangeAcctCreditLimitResult.CreditLimit>();
        }
        return this.creditLimit;
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
     *         &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="LimitClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "creditInstID",
        "limitClass",
        "amount",
        "effectiveTime",
        "expireTime"
    })
    public static class CreditLimit
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CreditInstID")
        protected long creditInstID;
        @XmlElement(name = "LimitClass", required = true)
        protected String limitClass;
        @XmlElement(name = "Amount")
        protected long amount;
        @XmlElement(name = "EffectiveTime", required = true)
        protected String effectiveTime;
        @XmlElement(name = "ExpireTime", required = true)
        protected String expireTime;

        /**
         * Gets the value of the creditInstID property.
         * 
         */
        public long getCreditInstID() {
            return creditInstID;
        }

        /**
         * Sets the value of the creditInstID property.
         * 
         */
        public void setCreditInstID(long value) {
            this.creditInstID = value;
        }

        /**
         * Gets the value of the limitClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimitClass() {
            return limitClass;
        }

        /**
         * Sets the value of the limitClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimitClass(String value) {
            this.limitClass = value;
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
         * Gets the value of the expireTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireTime() {
            return expireTime;
        }

        /**
         * Sets the value of the expireTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireTime(String value) {
            this.expireTime = value;
        }

    }

}
