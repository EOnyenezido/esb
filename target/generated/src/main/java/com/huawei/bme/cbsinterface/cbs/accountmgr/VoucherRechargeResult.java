
package com.huawei.bme.cbsinterface.cbs.accountmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherRechargeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherRechargeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaceValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RechargeBonus" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "VoucherRechargeResult", propOrder = {
    "faceValue",
    "newBalance",
    "newActiveStop",
    "validityPeriod",
    "rechargeBonus"
})
public class VoucherRechargeResult
    implements Serializable
{

    private final static long serialVersionUID = 11082011L;
    @XmlElementRef(name = "FaceValue", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> faceValue;
    @XmlElementRef(name = "NewBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> newBalance;
    @XmlElement(name = "NewActiveStop")
    protected String newActiveStop;
    @XmlElementRef(name = "ValidityPeriod", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> validityPeriod;
    @XmlElement(name = "RechargeBonus")
    protected List<VoucherRechargeResult.RechargeBonus> rechargeBonus;

    /**
     * Gets the value of the faceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFaceValue() {
        return faceValue;
    }

    /**
     * Sets the value of the faceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFaceValue(JAXBElement<Long> value) {
        this.faceValue = value;
    }

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNewBalance(JAXBElement<Long> value) {
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
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setValidityPeriod(JAXBElement<Integer> value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the rechargeBonus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechargeBonus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechargeBonus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherRechargeResult.RechargeBonus }
     * 
     * 
     */
    public List<VoucherRechargeResult.RechargeBonus> getRechargeBonus() {
        if (rechargeBonus == null) {
            rechargeBonus = new ArrayList<VoucherRechargeResult.RechargeBonus>();
        }
        return this.rechargeBonus;
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
     *         &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    public static class RechargeBonus
        implements Serializable
    {

        private final static long serialVersionUID = 11082011L;
        @XmlElementRef(name = "PrmAcctType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> prmAcctType;
        @XmlElementRef(name = "PrmAmt", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> prmAmt;

        /**
         * Gets the value of the prmAcctType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getPrmAcctType() {
            return prmAcctType;
        }

        /**
         * Sets the value of the prmAcctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setPrmAcctType(JAXBElement<Integer> value) {
            this.prmAcctType = value;
        }

        /**
         * Gets the value of the prmAmt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getPrmAmt() {
            return prmAmt;
        }

        /**
         * Sets the value of the prmAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setPrmAmt(JAXBElement<Long> value) {
            this.prmAmt = value;
        }

    }

}
