
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.CustAccessCode;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.SimpleProperty;


/**
 * <p>Java class for ChangeCustDFTAcctRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustDFTAcctRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustAccessCode"/&gt;
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewDFTAcct"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ChangeCustDFTAcctRequest", propOrder = {
    "custAccessCode",
    "opType",
    "newDFTAcct",
    "effectiveTime",
    "controlProperty"
})
public class ChangeCustDFTAcctRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "CustAccessCode", required = true)
    protected CustAccessCode custAccessCode;
    @XmlElement(name = "OpType", required = true)
    protected String opType;
    @XmlElement(name = "NewDFTAcct", required = true)
    protected ChangeCustDFTAcctRequest.NewDFTAcct newDFTAcct;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;
    @XmlElement(name = "ControlProperty")
    protected List<SimpleProperty> controlProperty;

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
     * Gets the value of the newDFTAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCustDFTAcctRequest.NewDFTAcct }
     *     
     */
    public ChangeCustDFTAcctRequest.NewDFTAcct getNewDFTAcct() {
        return newDFTAcct;
    }

    /**
     * Sets the value of the newDFTAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCustDFTAcctRequest.NewDFTAcct }
     *     
     */
    public void setNewDFTAcct(ChangeCustDFTAcctRequest.NewDFTAcct value) {
        this.newDFTAcct = value;
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
     *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "acctKey"
    })
    public static class NewDFTAcct
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "PayRelationKey", required = true)
        protected String payRelationKey;
        @XmlElement(name = "AcctKey", required = true)
        protected String acctKey;

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

    }

}
