
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.EffectMode;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for ChangeGroupMemOffNetNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeGroupMemOffNetNumberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="GroupMemOffNetNumber" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffNetNumberGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeGroupMemOffNetNumberRequest", propOrder = {
    "subAccessCode",
    "groupMemOffNetNumber"
})
public class ChangeGroupMemOffNetNumberRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "GroupMemOffNetNumber", required = true)
    protected List<ChangeGroupMemOffNetNumberRequest.GroupMemOffNetNumber> groupMemOffNetNumber;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setSubAccessCode(SubAccessCode value) {
        this.subAccessCode = value;
    }

    /**
     * Gets the value of the groupMemOffNetNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupMemOffNetNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupMemOffNetNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeGroupMemOffNetNumberRequest.GroupMemOffNetNumber }
     * 
     * 
     */
    public List<ChangeGroupMemOffNetNumberRequest.GroupMemOffNetNumber> getGroupMemOffNetNumber() {
        if (groupMemOffNetNumber == null) {
            groupMemOffNetNumber = new ArrayList<ChangeGroupMemOffNetNumberRequest.GroupMemOffNetNumber>();
        }
        return this.groupMemOffNetNumber;
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
        "effectiveTime",
        "expirationTime"
    })
    public static class GroupMemOffNetNumber
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "OpType", required = true)
        protected String opType;
        @XmlElement(name = "OffNetNumber", required = true)
        protected String offNetNumber;
        @XmlElement(name = "OffNetNumberGroupID")
        protected String offNetNumberGroupID;
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
