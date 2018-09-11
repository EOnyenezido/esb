
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;


/**
 * <p>Java class for ChangeCustHierachyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustHierachyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode" minOccurs="0"/&gt;
 *         &lt;element name="NewParentCust" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode" minOccurs="0"/&gt;
 *         &lt;element name="AcctAccessCode" minOccurs="0"&gt;
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
 *         &lt;element name="NewParentAcct" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCustHierachyRequest", propOrder = {
    "custAccessCode",
    "newParentCust",
    "acctAccessCode",
    "newParentAcct"
})
public class ChangeCustHierachyRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CustAccessCode")
    protected CustAccessCode custAccessCode;
    @XmlElement(name = "NewParentCust")
    protected CustAccessCode newParentCust;
    @XmlElement(name = "AcctAccessCode")
    protected ChangeCustHierachyRequest.AcctAccessCode acctAccessCode;
    @XmlElement(name = "NewParentAcct")
    protected ChangeCustHierachyRequest.NewParentAcct newParentAcct;

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
     * Gets the value of the newParentCust property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCode }
     *     
     */
    public CustAccessCode getNewParentCust() {
        return newParentCust;
    }

    /**
     * Sets the value of the newParentCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCode }
     *     
     */
    public void setNewParentCust(CustAccessCode value) {
        this.newParentCust = value;
    }

    /**
     * Gets the value of the acctAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustHierachyRequest.AcctAccessCode }
     *     
     */
    public ChangeCustHierachyRequest.AcctAccessCode getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Sets the value of the acctAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustHierachyRequest.AcctAccessCode }
     *     
     */
    public void setAcctAccessCode(ChangeCustHierachyRequest.AcctAccessCode value) {
        this.acctAccessCode = value;
    }

    /**
     * Gets the value of the newParentAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustHierachyRequest.NewParentAcct }
     *     
     */
    public ChangeCustHierachyRequest.NewParentAcct getNewParentAcct() {
        return newParentAcct;
    }

    /**
     * Sets the value of the newParentAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustHierachyRequest.NewParentAcct }
     *     
     */
    public void setNewParentAcct(ChangeCustHierachyRequest.NewParentAcct value) {
        this.newParentAcct = value;
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
    public static class NewParentAcct
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
