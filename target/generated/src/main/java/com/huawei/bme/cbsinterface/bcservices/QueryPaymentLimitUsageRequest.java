
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.AcctAccessCode;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for QueryPaymentLimitUsageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPaymentLimitUsageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayAccount"&gt;
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
 *         &lt;element name="PayObj"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPaymentLimitUsageRequest", propOrder = {
    "payAccount",
    "payObj"
})
public class QueryPaymentLimitUsageRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "PayAccount", required = true)
    protected QueryPaymentLimitUsageRequest.PayAccount payAccount;
    @XmlElement(name = "PayObj", required = true)
    protected QueryPaymentLimitUsageRequest.PayObj payObj;

    /**
     * Gets the value of the payAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPaymentLimitUsageRequest.PayAccount }
     *     
     */
    public QueryPaymentLimitUsageRequest.PayAccount getPayAccount() {
        return payAccount;
    }

    /**
     * Sets the value of the payAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPaymentLimitUsageRequest.PayAccount }
     *     
     */
    public void setPayAccount(QueryPaymentLimitUsageRequest.PayAccount value) {
        this.payAccount = value;
    }

    /**
     * Gets the value of the payObj property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPaymentLimitUsageRequest.PayObj }
     *     
     */
    public QueryPaymentLimitUsageRequest.PayObj getPayObj() {
        return payObj;
    }

    /**
     * Sets the value of the payObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPaymentLimitUsageRequest.PayObj }
     *     
     */
    public void setPayObj(QueryPaymentLimitUsageRequest.PayObj value) {
        this.payObj = value;
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
    public static class PayAccount
        extends AcctAccessCode
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
    public static class PayObj
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
