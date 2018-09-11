
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubDeactivationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubDeactivationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctBalance" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AmountList" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "SubDeactivationResult", propOrder = {
    "acctBalance"
})
public class SubDeactivationResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "AcctBalance")
    protected SubDeactivationResult.AcctBalance acctBalance;

    /**
     * Gets the value of the acctBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SubDeactivationResult.AcctBalance }
     *     
     */
    public SubDeactivationResult.AcctBalance getAcctBalance() {
        return acctBalance;
    }

    /**
     * Sets the value of the acctBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubDeactivationResult.AcctBalance }
     *     
     */
    public void setAcctBalance(SubDeactivationResult.AcctBalance value) {
        this.acctBalance = value;
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
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AmountList" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "acctKey",
        "amountList"
    })
    public static class AcctBalance
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;
        @XmlElement(name = "AmountList", required = true)
        protected List<SubDeactivationResult.AcctBalance.AmountList> amountList;

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
         * Gets the value of the amountList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amountList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmountList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubDeactivationResult.AcctBalance.AmountList }
         * 
         * 
         */
        public List<SubDeactivationResult.AcctBalance.AmountList> getAmountList() {
            if (amountList == null) {
                amountList = new ArrayList<SubDeactivationResult.AcctBalance.AmountList>();
            }
            return this.amountList;
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
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
            "amount",
            "currencyID"
        })
        public static class AmountList
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "Amount")
            protected long amount;
            @XmlElement(name = "CurrencyID", required = true)
            protected BigInteger currencyID;

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

        }

    }

}
