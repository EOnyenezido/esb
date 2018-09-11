
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.OfferingKey;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for QueryOfferingRentCycleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOfferingRentCycleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferingInst" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferingOwner"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *                             &lt;element name="AcctAccessCode"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}AcctAccessCode"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *                             &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "QueryOfferingRentCycleRequest", propOrder = {
    "offeringInst"
})
public class QueryOfferingRentCycleRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OfferingInst", required = true)
    protected List<QueryOfferingRentCycleRequest.OfferingInst> offeringInst;

    /**
     * Gets the value of the offeringInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offeringInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOfferingRentCycleRequest.OfferingInst }
     * 
     * 
     */
    public List<QueryOfferingRentCycleRequest.OfferingInst> getOfferingInst() {
        if (offeringInst == null) {
            offeringInst = new ArrayList<QueryOfferingRentCycleRequest.OfferingInst>();
        }
        return this.offeringInst;
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
     *         &lt;element name="OfferingOwner"&gt;
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
        "offeringOwner",
        "offeringKey"
    })
    public static class OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingOwner", required = true)
        protected QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner offeringOwner;
        @XmlElement(name = "OfferingKey", required = true)
        protected OfferingKey offeringKey;

        /**
         * Gets the value of the offeringOwner property.
         * 
         * @return
         *     possible object is
         *     {@link QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner }
         *     
         */
        public QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner getOfferingOwner() {
            return offeringOwner;
        }

        /**
         * Sets the value of the offeringOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner }
         *     
         */
        public void setOfferingOwner(QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner value) {
            this.offeringOwner = value;
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
        public static class OfferingOwner
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "SubAccessCode")
            protected SubAccessCode subAccessCode;
            @XmlElement(name = "AcctAccessCode")
            protected QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner.AcctAccessCode acctAccessCode;
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
             *     {@link QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner.AcctAccessCode }
             *     
             */
            public QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner.AcctAccessCode getAcctAccessCode() {
                return acctAccessCode;
            }

            /**
             * Sets the value of the acctAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner.AcctAccessCode }
             *     
             */
            public void setAcctAccessCode(QueryOfferingRentCycleRequest.OfferingInst.OfferingOwner.AcctAccessCode value) {
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

}
