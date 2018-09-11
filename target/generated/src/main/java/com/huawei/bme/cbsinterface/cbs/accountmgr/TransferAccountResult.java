
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAccountResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TransfereeHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TransferorHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TransfereeAcctChgList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransferorAcctChgList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransfereeOldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransfereeNewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferorOldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferorNewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAccountResult", propOrder = {

})
public class TransferAccountResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "TransfereeHandlingCharge")
    protected Long transfereeHandlingCharge;
    @XmlElement(name = "TransferorHandlingCharge")
    protected Long transferorHandlingCharge;
    @XmlElement(name = "TransfereeAcctChgList")
    protected TransferAccountResult.TransfereeAcctChgList transfereeAcctChgList;
    @XmlElement(name = "TransferorAcctChgList")
    protected TransferAccountResult.TransferorAcctChgList transferorAcctChgList;
    @XmlElement(name = "TransfereeOldActiveStop")
    protected String transfereeOldActiveStop;
    @XmlElement(name = "TransfereeNewActiveStop")
    protected String transfereeNewActiveStop;
    @XmlElement(name = "TransferorOldActiveStop")
    protected String transferorOldActiveStop;
    @XmlElement(name = "TransferorNewActiveStop")
    protected String transferorNewActiveStop;

    /**
     * Gets the value of the transfereeHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransfereeHandlingCharge() {
        return transfereeHandlingCharge;
    }

    /**
     * Sets the value of the transfereeHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransfereeHandlingCharge(Long value) {
        this.transfereeHandlingCharge = value;
    }

    /**
     * Gets the value of the transferorHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferorHandlingCharge() {
        return transferorHandlingCharge;
    }

    /**
     * Sets the value of the transferorHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferorHandlingCharge(Long value) {
        this.transferorHandlingCharge = value;
    }

    /**
     * Gets the value of the transfereeAcctChgList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountResult.TransfereeAcctChgList }
     *     
     */
    public TransferAccountResult.TransfereeAcctChgList getTransfereeAcctChgList() {
        return transfereeAcctChgList;
    }

    /**
     * Sets the value of the transfereeAcctChgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountResult.TransfereeAcctChgList }
     *     
     */
    public void setTransfereeAcctChgList(TransferAccountResult.TransfereeAcctChgList value) {
        this.transfereeAcctChgList = value;
    }

    /**
     * Gets the value of the transferorAcctChgList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountResult.TransferorAcctChgList }
     *     
     */
    public TransferAccountResult.TransferorAcctChgList getTransferorAcctChgList() {
        return transferorAcctChgList;
    }

    /**
     * Sets the value of the transferorAcctChgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountResult.TransferorAcctChgList }
     *     
     */
    public void setTransferorAcctChgList(TransferAccountResult.TransferorAcctChgList value) {
        this.transferorAcctChgList = value;
    }

    /**
     * Gets the value of the transfereeOldActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeOldActiveStop() {
        return transfereeOldActiveStop;
    }

    /**
     * Sets the value of the transfereeOldActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeOldActiveStop(String value) {
        this.transfereeOldActiveStop = value;
    }

    /**
     * Gets the value of the transfereeNewActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeNewActiveStop() {
        return transfereeNewActiveStop;
    }

    /**
     * Sets the value of the transfereeNewActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeNewActiveStop(String value) {
        this.transfereeNewActiveStop = value;
    }

    /**
     * Gets the value of the transferorOldActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorOldActiveStop() {
        return transferorOldActiveStop;
    }

    /**
     * Sets the value of the transferorOldActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorOldActiveStop(String value) {
        this.transferorOldActiveStop = value;
    }

    /**
     * Gets the value of the transferorNewActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorNewActiveStop() {
        return transferorNewActiveStop;
    }

    /**
     * Sets the value of the transferorNewActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorNewActiveStop(String value) {
        this.transferorNewActiveStop = value;
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
     *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/&gt;
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
        "acctChgRec"
    })
    public static class TransfereeAcctChgList
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElement(name = "AcctChgRec", required = true)
        protected List<AcctChgRecType> acctChgRec;

        /**
         * Gets the value of the acctChgRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctChgRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcctChgRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcctChgRecType }
         * 
         * 
         */
        public List<AcctChgRecType> getAcctChgRec() {
            if (acctChgRec == null) {
                acctChgRec = new ArrayList<AcctChgRecType>();
            }
            return this.acctChgRec;
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
     *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/&gt;
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
        "acctChgRec"
    })
    public static class TransferorAcctChgList
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElement(name = "AcctChgRec", required = true)
        protected List<AcctChgRecType> acctChgRec;

        /**
         * Gets the value of the acctChgRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctChgRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcctChgRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcctChgRecType }
         * 
         * 
         */
        public List<AcctChgRecType> getAcctChgRec() {
            if (acctChgRec == null) {
                acctChgRec = new ArrayList<AcctChgRecType>();
            }
            return this.acctChgRec;
        }

    }

}
