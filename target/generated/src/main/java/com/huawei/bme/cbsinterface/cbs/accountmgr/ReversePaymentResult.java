
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversePaymentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReversePaymentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AcctChgRecList"&gt;
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
 *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversePaymentResult", propOrder = {

})
public class ReversePaymentResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "NewBalance")
    protected long newBalance;
    @XmlElement(name = "NewActiveStop", required = true)
    protected String newActiveStop;
    @XmlElement(name = "AcctChgRecList", required = true)
    protected ReversePaymentResult.AcctChgRecList acctChgRecList;
    @XmlElement(name = "InternalSerialNo")
    protected String internalSerialNo;

    /**
     * Gets the value of the newBalance property.
     * 
     */
    public long getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     */
    public void setNewBalance(long value) {
        this.newBalance = value;
    }

    /**
     * Gets the value of the newActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewActiveStop() {
        return newActiveStop;
    }

    /**
     * Sets the value of the newActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewActiveStop(String value) {
        this.newActiveStop = value;
    }

    /**
     * Gets the value of the acctChgRecList property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentResult.AcctChgRecList }
     *     
     */
    public ReversePaymentResult.AcctChgRecList getAcctChgRecList() {
        return acctChgRecList;
    }

    /**
     * Sets the value of the acctChgRecList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentResult.AcctChgRecList }
     *     
     */
    public void setAcctChgRecList(ReversePaymentResult.AcctChgRecList value) {
        this.acctChgRecList = value;
    }

    /**
     * Gets the value of the internalSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSerialNo() {
        return internalSerialNo;
    }

    /**
     * Sets the value of the internalSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSerialNo(String value) {
        this.internalSerialNo = value;
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
    public static class AcctChgRecList
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
