
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
 * <p>Java class for ChangeProductStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeProductStatusRequest"&gt;
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
 *                   &lt;element name="ProductInst" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="OldStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NewStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ChangeProductStatusRequest", propOrder = {
    "offeringInst"
})
public class ChangeProductStatusRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "OfferingInst", required = true)
    protected List<ChangeProductStatusRequest.OfferingInst> offeringInst;

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
     * {@link ChangeProductStatusRequest.OfferingInst }
     * 
     * 
     */
    public List<ChangeProductStatusRequest.OfferingInst> getOfferingInst() {
        if (offeringInst == null) {
            offeringInst = new ArrayList<ChangeProductStatusRequest.OfferingInst>();
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
     *         &lt;element name="ProductInst" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="OldStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NewStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "offeringOwner",
        "offeringKey",
        "productInst"
    })
    public static class OfferingInst
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OfferingOwner", required = true)
        protected ChangeProductStatusRequest.OfferingInst.OfferingOwner offeringOwner;
        @XmlElement(name = "OfferingKey", required = true)
        protected OfferingKey offeringKey;
        @XmlElement(name = "ProductInst", required = true)
        protected List<ChangeProductStatusRequest.OfferingInst.ProductInst> productInst;

        /**
         * Gets the value of the offeringOwner property.
         * 
         * @return
         *     possible object is
         *     {@link ChangeProductStatusRequest.OfferingInst.OfferingOwner }
         *     
         */
        public ChangeProductStatusRequest.OfferingInst.OfferingOwner getOfferingOwner() {
            return offeringOwner;
        }

        /**
         * Sets the value of the offeringOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeProductStatusRequest.OfferingInst.OfferingOwner }
         *     
         */
        public void setOfferingOwner(ChangeProductStatusRequest.OfferingInst.OfferingOwner value) {
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
         * {@link ChangeProductStatusRequest.OfferingInst.ProductInst }
         * 
         * 
         */
        public List<ChangeProductStatusRequest.OfferingInst.ProductInst> getProductInst() {
            if (productInst == null) {
                productInst = new ArrayList<ChangeProductStatusRequest.OfferingInst.ProductInst>();
            }
            return this.productInst;
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
            protected ChangeProductStatusRequest.OfferingInst.OfferingOwner.AcctAccessCode acctAccessCode;
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
             *     {@link ChangeProductStatusRequest.OfferingInst.OfferingOwner.AcctAccessCode }
             *     
             */
            public ChangeProductStatusRequest.OfferingInst.OfferingOwner.AcctAccessCode getAcctAccessCode() {
                return acctAccessCode;
            }

            /**
             * Sets the value of the acctAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangeProductStatusRequest.OfferingInst.OfferingOwner.AcctAccessCode }
             *     
             */
            public void setAcctAccessCode(ChangeProductStatusRequest.OfferingInst.OfferingOwner.AcctAccessCode value) {
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
         *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="OldStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NewStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "opType",
            "oldStatus",
            "newStatus"
        })
        public static class ProductInst
            implements Serializable
        {

            private final static long serialVersionUID = 11082012L;
            @XmlElement(name = "ProductID", required = true)
            protected String productID;
            @XmlElement(name = "OpType", required = true)
            protected String opType;
            @XmlElement(name = "OldStatus", required = true)
            protected String oldStatus;
            @XmlElement(name = "NewStatus", required = true)
            protected String newStatus;

            /**
             * Gets the value of the productID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * Sets the value of the productID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
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
             * Gets the value of the oldStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOldStatus() {
                return oldStatus;
            }

            /**
             * Sets the value of the oldStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOldStatus(String value) {
                this.oldStatus = value;
            }

            /**
             * Gets the value of the newStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewStatus() {
                return newStatus;
            }

            /**
             * Sets the value of the newStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewStatus(String value) {
                this.newStatus = value;
            }

        }

    }

}
