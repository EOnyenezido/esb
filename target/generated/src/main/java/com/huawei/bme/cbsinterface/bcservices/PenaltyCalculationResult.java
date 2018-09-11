
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.Tax;


/**
 * <p>Java class for PenaltyCalculationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyCalculationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PenaltyChargeList" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="Tax" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PenaltyCalculationResult", propOrder = {
    "penaltyChargeList"
})
public class PenaltyCalculationResult
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "PenaltyChargeList", required = true)
    protected List<PenaltyCalculationResult.PenaltyChargeList> penaltyChargeList;

    /**
     * Gets the value of the penaltyChargeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyChargeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyChargeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyCalculationResult.PenaltyChargeList }
     * 
     * 
     */
    public List<PenaltyCalculationResult.PenaltyChargeList> getPenaltyChargeList() {
        if (penaltyChargeList == null) {
            penaltyChargeList = new ArrayList<PenaltyCalculationResult.PenaltyChargeList>();
        }
        return this.penaltyChargeList;
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
     *         &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="Tax" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "chargeAmt",
        "tax"
    })
    public static class PenaltyChargeList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "ChargeAmt")
        protected Long chargeAmt;
        @XmlElement(name = "Tax")
        protected List<Tax> tax;

        /**
         * Gets the value of the chargeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getChargeAmt() {
            return chargeAmt;
        }

        /**
         * Sets the value of the chargeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setChargeAmt(Long value) {
            this.chargeAmt = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tax }
         * 
         * 
         */
        public List<Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<Tax>();
            }
            return this.tax;
        }

    }

}
