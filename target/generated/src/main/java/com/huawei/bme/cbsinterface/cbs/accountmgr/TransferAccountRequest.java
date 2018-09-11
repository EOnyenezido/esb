
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAccountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransfereeNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransferorNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransferType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransferHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "TransferAccountRequest", propOrder = {

})
public class TransferAccountRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "LogID")
    protected String logID;
    @XmlElement(name = "TransfereeNo", required = true)
    protected String transfereeNo;
    @XmlElement(name = "TransferorNo", required = true)
    protected String transferorNo;
    @XmlElement(name = "TransferType")
    protected Integer transferType;
    @XmlElement(name = "TransferHandlingCharge")
    protected Long transferHandlingCharge;
    @XmlElement(name = "ModifyAcctFeeList", required = true)
    protected TransferAccountRequest.ModifyAcctFeeList modifyAcctFeeList;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
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
     * Gets the value of the transfereeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeNo() {
        return transfereeNo;
    }

    /**
     * Sets the value of the transfereeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeNo(String value) {
        this.transfereeNo = value;
    }

    /**
     * Gets the value of the transferorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorNo() {
        return transferorNo;
    }

    /**
     * Sets the value of the transferorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorNo(String value) {
        this.transferorNo = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferType(Integer value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the transferHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferHandlingCharge() {
        return transferHandlingCharge;
    }

    /**
     * Sets the value of the transferHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferHandlingCharge(Long value) {
        this.transferHandlingCharge = value;
    }

    /**
     * Gets the value of the modifyAcctFeeList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountRequest.ModifyAcctFeeList }
     *     
     */
    public TransferAccountRequest.ModifyAcctFeeList getModifyAcctFeeList() {
        return modifyAcctFeeList;
    }

    /**
     * Sets the value of the modifyAcctFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountRequest.ModifyAcctFeeList }
     *     
     */
    public void setModifyAcctFeeList(TransferAccountRequest.ModifyAcctFeeList value) {
        this.modifyAcctFeeList = value;
    }

    /**
     * Gets the value of the handlingChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }

    /**
     * Sets the value of the handlingChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingChargeFlag(Integer value) {
        this.handlingChargeFlag = value;
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
