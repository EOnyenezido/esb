
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransInPpsPosResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransInPpsPosResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
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
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransInPpsPosResult", propOrder = {

})
public class TransInPpsPosResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElement(name = "TransfereeAcctChgList")
    protected TransInPpsPosResult.TransfereeAcctChgList transfereeAcctChgList;
    @XmlElement(name = "TransferorAcctChgList")
    protected TransInPpsPosResult.TransferorAcctChgList transferorAcctChgList;

    /**
     * Gets the value of the transfereeAcctChgList property.
     * 
     * @return
     *     possible object is
     *     {@link TransInPpsPosResult.TransfereeAcctChgList }
     *     
     */
    public TransInPpsPosResult.TransfereeAcctChgList getTransfereeAcctChgList() {
        return transfereeAcctChgList;
    }

    /**
     * Sets the value of the transfereeAcctChgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransInPpsPosResult.TransfereeAcctChgList }
     *     
     */
    public void setTransfereeAcctChgList(TransInPpsPosResult.TransfereeAcctChgList value) {
        this.transfereeAcctChgList = value;
    }

    /**
     * Gets the value of the transferorAcctChgList property.
     * 
     * @return
     *     possible object is
     *     {@link TransInPpsPosResult.TransferorAcctChgList }
     *     
     */
    public TransInPpsPosResult.TransferorAcctChgList getTransferorAcctChgList() {
        return transferorAcctChgList;
    }

    /**
     * Sets the value of the transferorAcctChgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransInPpsPosResult.TransferorAcctChgList }
     *     
     */
    public void setTransferorAcctChgList(TransInPpsPosResult.TransferorAcctChgList value) {
        this.transferorAcctChgList = value;
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
