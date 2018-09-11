
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManParentChildResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManParentChildResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildSubscriberInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ChildSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ChildSubType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="ChildSubLimitation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ManParentChildResult", propOrder = {
    "childSubscriberInfo"
})
public class ManParentChildResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "ChildSubscriberInfo")
    protected List<ManParentChildResult.ChildSubscriberInfo> childSubscriberInfo;

    /**
     * Gets the value of the childSubscriberInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childSubscriberInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildSubscriberInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManParentChildResult.ChildSubscriberInfo }
     * 
     * 
     */
    public List<ManParentChildResult.ChildSubscriberInfo> getChildSubscriberInfo() {
        if (childSubscriberInfo == null) {
            childSubscriberInfo = new ArrayList<ManParentChildResult.ChildSubscriberInfo>();
        }
        return this.childSubscriberInfo;
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
     *         &lt;element name="ChildSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ChildSubType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="ChildSubLimitation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class ChildSubscriberInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "ChildSubNo", required = true)
        protected String childSubNo;
        @XmlElement(name = "ChildSubType")
        protected int childSubType;
        @XmlElement(name = "ChildSubLimitation")
        protected int childSubLimitation;
        @XmlElement(name = "EffectiveTime", required = true)
        protected String effectiveTime;
        @XmlElement(name = "ExpireTime", required = true)
        protected String expireTime;

        /**
         * Gets the value of the childSubNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChildSubNo() {
            return childSubNo;
        }

        /**
         * Sets the value of the childSubNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChildSubNo(String value) {
            this.childSubNo = value;
        }

        /**
         * Gets the value of the childSubType property.
         * 
         */
        public int getChildSubType() {
            return childSubType;
        }

        /**
         * Sets the value of the childSubType property.
         * 
         */
        public void setChildSubType(int value) {
            this.childSubType = value;
        }

        /**
         * Gets the value of the childSubLimitation property.
         * 
         */
        public int getChildSubLimitation() {
            return childSubLimitation;
        }

        /**
         * Sets the value of the childSubLimitation property.
         * 
         */
        public void setChildSubLimitation(int value) {
            this.childSubLimitation = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
        }

        /**
         * Gets the value of the expireTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireTime() {
            return expireTime;
        }

        /**
         * Sets the value of the expireTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireTime(String value) {
            this.expireTime = value;
        }

    }

}
