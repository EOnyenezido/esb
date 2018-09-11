
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManParentChildRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManParentChildRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChildSubscriberInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ChildSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ChildSubType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="ChildSubLimitAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ManParentChildRequest", propOrder = {
    "subscriberNo",
    "operationType",
    "childSubscriberInfo"
})
public class ManParentChildRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OperationType")
    protected int operationType;
    @XmlElement(name = "ChildSubscriberInfo")
    protected ManParentChildRequest.ChildSubscriberInfo childSubscriberInfo;

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
     * Gets the value of the operationType property.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the childSubscriberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ManParentChildRequest.ChildSubscriberInfo }
     *     
     */
    public ManParentChildRequest.ChildSubscriberInfo getChildSubscriberInfo() {
        return childSubscriberInfo;
    }

    /**
     * Sets the value of the childSubscriberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManParentChildRequest.ChildSubscriberInfo }
     *     
     */
    public void setChildSubscriberInfo(ManParentChildRequest.ChildSubscriberInfo value) {
        this.childSubscriberInfo = value;
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
     *         &lt;element name="ChildSubType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="ChildSubLimitAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        protected Integer childSubType;
        @XmlElement(name = "ChildSubLimitAmt")
        protected Integer childSubLimitAmt;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;

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
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChildSubType() {
            return childSubType;
        }

        /**
         * Sets the value of the childSubType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChildSubType(Integer value) {
            this.childSubType = value;
        }

        /**
         * Gets the value of the childSubLimitAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChildSubLimitAmt() {
            return childSubLimitAmt;
        }

        /**
         * Sets the value of the childSubLimitAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChildSubLimitAmt(Integer value) {
            this.childSubLimitAmt = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

    }

}
