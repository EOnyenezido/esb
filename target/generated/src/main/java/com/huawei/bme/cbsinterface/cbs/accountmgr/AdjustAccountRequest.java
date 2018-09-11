
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifyAcctFeeList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ModifyAcctFee" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModifyAcctFeeType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustAccountRequest", propOrder = {

})
public class AdjustAccountRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "LogID")
    protected String logID;
    @XmlElement(name = "OldLogID")
    protected String oldLogID;
    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OperateType")
    protected int operateType;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "SPCode")
    protected String spCode;
    @XmlElement(name = "ModifyAcctFeeList", required = true)
    protected AdjustAccountRequest.ModifyAcctFeeList modifyAcctFeeList;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the logID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogID() {
        return logID;
    }

    /**
     * Sets the value of the logID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogID(String value) {
        this.logID = value;
    }

    /**
     * Gets the value of the oldLogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldLogID() {
        return oldLogID;
    }

    /**
     * Sets the value of the oldLogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldLogID(String value) {
        this.oldLogID = value;
    }

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the operateType property.
     * 
     */
    public int getOperateType() {
        return operateType;
    }

    /**
     * Sets the value of the operateType property.
     * 
     */
    public void setOperateType(int value) {
        this.operateType = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the spCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPCode() {
        return spCode;
    }

    /**
     * Sets the value of the spCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPCode(String value) {
        this.spCode = value;
    }

    /**
     * Gets the value of the modifyAcctFeeList property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustAccountRequest.ModifyAcctFeeList }
     *     
     */
    public AdjustAccountRequest.ModifyAcctFeeList getModifyAcctFeeList() {
        return modifyAcctFeeList;
    }

    /**
     * Sets the value of the modifyAcctFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustAccountRequest.ModifyAcctFeeList }
     *     
     */
    public void setModifyAcctFeeList(AdjustAccountRequest.ModifyAcctFeeList value) {
        this.modifyAcctFeeList = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
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
     *         &lt;element name="ModifyAcctFee" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModifyAcctFeeType" maxOccurs="unbounded"/&gt;
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
        "modifyAcctFee"
    })
    public static class ModifyAcctFeeList
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElement(name = "ModifyAcctFee", required = true)
        protected List<ModifyAcctFeeType> modifyAcctFee;

        /**
         * Gets the value of the modifyAcctFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyAcctFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyAcctFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModifyAcctFeeType }
         * 
         * 
         */
        public List<ModifyAcctFeeType> getModifyAcctFee() {
            if (modifyAcctFee == null) {
                modifyAcctFee = new ArrayList<ModifyAcctFeeType>();
            }
            return this.modifyAcctFee;
        }

    }

}
