
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAdjustValidityLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAdjustValidityLogResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustValidityLog" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ModifyType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "QueryAdjustValidityLogResult", propOrder = {
    "adjustValidityLog"
})
public class QueryAdjustValidityLogResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "AdjustValidityLog")
    protected List<QueryAdjustValidityLogResult.AdjustValidityLog> adjustValidityLog;

    /**
     * Gets the value of the adjustValidityLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustValidityLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustValidityLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryAdjustValidityLogResult.AdjustValidityLog }
     * 
     * 
     */
    public List<QueryAdjustValidityLogResult.AdjustValidityLog> getAdjustValidityLog() {
        if (adjustValidityLog == null) {
            adjustValidityLog = new ArrayList<QueryAdjustValidityLogResult.AdjustValidityLog>();
        }
        return this.adjustValidityLog;
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
     *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ModifyType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "tradeTime",
        "modifyType",
        "validityIncrement",
        "operatorID",
        "oldActiveStop",
        "newActiveStop",
        "oldSuspendStop",
        "newSuspendStop",
        "oldDisableStop",
        "newDisableStop"
    })
    public static class AdjustValidityLog
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "TradeTime", required = true)
        protected String tradeTime;
        @XmlElement(name = "ModifyType")
        protected Integer modifyType;
        @XmlElement(name = "ValidityIncrement")
        protected int validityIncrement;
        @XmlElement(name = "OperatorID")
        protected String operatorID;
        @XmlElement(name = "OldActiveStop", required = true)
        protected String oldActiveStop;
        @XmlElement(name = "NewActiveStop", required = true)
        protected String newActiveStop;
        @XmlElement(name = "OldSuspendStop", required = true)
        protected String oldSuspendStop;
        @XmlElement(name = "NewSuspendStop", required = true)
        protected String newSuspendStop;
        @XmlElement(name = "OldDisableStop", required = true)
        protected String oldDisableStop;
        @XmlElement(name = "NewDisableStop", required = true)
        protected String newDisableStop;

        /**
         * Gets the value of the tradeTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeTime() {
            return tradeTime;
        }

        /**
         * Sets the value of the tradeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeTime(String value) {
            this.tradeTime = value;
        }

        /**
         * Gets the value of the modifyType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getModifyType() {
            return modifyType;
        }

        /**
         * Sets the value of the modifyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setModifyType(Integer value) {
            this.modifyType = value;
        }

        /**
         * Gets the value of the validityIncrement property.
         * 
         */
        public int getValidityIncrement() {
            return validityIncrement;
        }

        /**
         * Sets the value of the validityIncrement property.
         * 
         */
        public void setValidityIncrement(int value) {
            this.validityIncrement = value;
        }

        /**
         * Gets the value of the operatorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorID() {
            return operatorID;
        }

        /**
         * Sets the value of the operatorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorID(String value) {
            this.operatorID = value;
        }

        /**
         * Gets the value of the oldActiveStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldActiveStop() {
            return oldActiveStop;
        }

        /**
         * Sets the value of the oldActiveStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldActiveStop(String value) {
            this.oldActiveStop = value;
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
         * Gets the value of the oldSuspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldSuspendStop() {
            return oldSuspendStop;
        }

        /**
         * Sets the value of the oldSuspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldSuspendStop(String value) {
            this.oldSuspendStop = value;
        }

        /**
         * Gets the value of the newSuspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewSuspendStop() {
            return newSuspendStop;
        }

        /**
         * Sets the value of the newSuspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewSuspendStop(String value) {
            this.newSuspendStop = value;
        }

        /**
         * Gets the value of the oldDisableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldDisableStop() {
            return oldDisableStop;
        }

        /**
         * Sets the value of the oldDisableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldDisableStop(String value) {
            this.oldDisableStop = value;
        }

        /**
         * Gets the value of the newDisableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewDisableStop() {
            return newDisableStop;
        }

        /**
         * Sets the value of the newDisableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewDisableStop(String value) {
            this.newDisableStop = value;
        }

    }

}
