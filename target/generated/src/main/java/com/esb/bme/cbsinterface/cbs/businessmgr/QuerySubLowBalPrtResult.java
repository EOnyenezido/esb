
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubLowBalPrtResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubLowBalPrtResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubLowBalPrt" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CallLowBalType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="BalanceUpGate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="BalanceLowGate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
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
@XmlType(name = "QuerySubLowBalPrtResult", propOrder = {
    "subLowBalPrt"
})
public class QuerySubLowBalPrtResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "SubLowBalPrt", required = true)
    protected List<QuerySubLowBalPrtResult.SubLowBalPrt> subLowBalPrt;

    /**
     * Gets the value of the subLowBalPrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLowBalPrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLowBalPrt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubLowBalPrtResult.SubLowBalPrt }
     * 
     * 
     */
    public List<QuerySubLowBalPrtResult.SubLowBalPrt> getSubLowBalPrt() {
        if (subLowBalPrt == null) {
            subLowBalPrt = new ArrayList<QuerySubLowBalPrtResult.SubLowBalPrt>();
        }
        return this.subLowBalPrt;
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
     *       &lt;all&gt;
     *         &lt;element name="CallLowBalType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="BalanceUpGate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="BalanceLowGate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SubLowBalPrt
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "CallLowBalType")
        protected int callLowBalType;
        @XmlElement(name = "BalanceUpGate")
        protected int balanceUpGate;
        @XmlElement(name = "BalanceLowGate")
        protected int balanceLowGate;
        @XmlElement(name = "Action")
        protected Integer action;
        @XmlElement(name = "MessageID")
        protected Integer messageID;

        /**
         * Gets the value of the callLowBalType property.
         * 
         */
        public int getCallLowBalType() {
            return callLowBalType;
        }

        /**
         * Sets the value of the callLowBalType property.
         * 
         */
        public void setCallLowBalType(int value) {
            this.callLowBalType = value;
        }

        /**
         * Gets the value of the balanceUpGate property.
         * 
         */
        public int getBalanceUpGate() {
            return balanceUpGate;
        }

        /**
         * Sets the value of the balanceUpGate property.
         * 
         */
        public void setBalanceUpGate(int value) {
            this.balanceUpGate = value;
        }

        /**
         * Gets the value of the balanceLowGate property.
         * 
         */
        public int getBalanceLowGate() {
            return balanceLowGate;
        }

        /**
         * Sets the value of the balanceLowGate property.
         * 
         */
        public void setBalanceLowGate(int value) {
            this.balanceLowGate = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAction(Integer value) {
            this.action = value;
        }

        /**
         * Gets the value of the messageID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMessageID() {
            return messageID;
        }

        /**
         * Sets the value of the messageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMessageID(Integer value) {
            this.messageID = value;
        }

    }

}
