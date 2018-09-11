
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.SubGroupAccessCode;


/**
 * <p>Java class for ChangeGroupOffNetNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeGroupOffNetNumberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/&gt;
 *         &lt;element name="GroupOffNetNumber" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetNumberGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OffNetShortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeGroupOffNetNumberRequest", propOrder = {
    "subGroupAccessCode",
    "groupOffNetNumber"
})
public class ChangeGroupOffNetNumberRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "GroupOffNetNumber", required = true)
    protected List<ChangeGroupOffNetNumberRequest.GroupOffNetNumber> groupOffNetNumber;

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

    /**
     * Gets the value of the groupOffNetNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOffNetNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOffNetNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeGroupOffNetNumberRequest.GroupOffNetNumber }
     * 
     * 
     */
    public List<ChangeGroupOffNetNumberRequest.GroupOffNetNumber> getGroupOffNetNumber() {
        if (groupOffNetNumber == null) {
            groupOffNetNumber = new ArrayList<ChangeGroupOffNetNumberRequest.GroupOffNetNumber>();
        }
        return this.groupOffNetNumber;
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
     *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OffNetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OffNetNumberGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OffNetShortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode" minOccurs="0"/&gt;
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/&gt;
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
        "opType",
        "offNetNumber",
        "offNetNumberGroupID",
        "numberType",
        "offNetShortNumber",
        "effectiveTime",
        "expirationTime"
    })
    public static class GroupOffNetNumber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OpType", required = true)
        protected String opType;
        @XmlElement(name = "OffNetNumber", required = true)
        protected String offNetNumber;
        @XmlElement(name = "OffNetNumberGroupID")
        protected String offNetNumberGroupID;
        @XmlElement(name = "NumberType")
        protected String numberType;
        @XmlElement(name = "OffNetShortNumber")
        protected String offNetShortNumber;
        @XmlElement(name = "EffectiveTime")
        protected EffectMode effectiveTime;
        @XmlElement(name = "ExpirationTime")
        protected String expirationTime;

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
         * Gets the value of the offNetNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffNetNumber() {
            return offNetNumber;
        }

        /**
         * Sets the value of the offNetNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffNetNumber(String value) {
            this.offNetNumber = value;
        }

        /**
         * Gets the value of the offNetNumberGroupID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffNetNumberGroupID() {
            return offNetNumberGroupID;
        }

        /**
         * Sets the value of the offNetNumberGroupID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffNetNumberGroupID(String value) {
            this.offNetNumberGroupID = value;
        }

        /**
         * Gets the value of the numberType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberType() {
            return numberType;
        }

        /**
         * Sets the value of the numberType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberType(String value) {
            this.numberType = value;
        }

        /**
         * Gets the value of the offNetShortNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffNetShortNumber() {
            return offNetShortNumber;
        }

        /**
         * Sets the value of the offNetShortNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffNetShortNumber(String value) {
            this.offNetShortNumber = value;
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
         * Gets the value of the expirationTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationTime() {
            return expirationTime;
        }

        /**
         * Sets the value of the expirationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationTime(String value) {
            this.expirationTime = value;
        }

    }

}
