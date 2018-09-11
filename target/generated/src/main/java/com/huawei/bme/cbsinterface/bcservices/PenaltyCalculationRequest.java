
package com.huawei.bme.cbsinterface.bcservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.bccommon.SubAccessCode;


/**
 * <p>Java class for PenaltyCalculationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyCalculationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/&gt;
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyOfferingInstInfoList" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CancelOfferingInst" type="{http://www.huawei.com/bme/cbsinterface/bcservices}OfferingInstInfo"/&gt;
 *                   &lt;element name="DowngradeOfferingInst" type="{http://www.huawei.com/bme/cbsinterface/bcservices}OfferingInstInfo" minOccurs="0"/&gt;
 *                   &lt;element name="PromotionOfferingInst" type="{http://www.huawei.com/bme/cbsinterface/bcservices}OfferingInstInfo" minOccurs="0"/&gt;
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
@XmlType(name = "PenaltyCalculationRequest", propOrder = {
    "subAccessCode",
    "opType",
    "penaltyOfferingInstInfoList"
})
public class PenaltyCalculationRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082012L;
    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "OpType")
    protected Long opType;
    @XmlElement(name = "PenaltyOfferingInstInfoList", required = true)
    protected List<PenaltyCalculationRequest.PenaltyOfferingInstInfoList> penaltyOfferingInstInfoList;

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
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpType(Long value) {
        this.opType = value;
    }

    /**
     * Gets the value of the penaltyOfferingInstInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyOfferingInstInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyOfferingInstInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyCalculationRequest.PenaltyOfferingInstInfoList }
     * 
     * 
     */
    public List<PenaltyCalculationRequest.PenaltyOfferingInstInfoList> getPenaltyOfferingInstInfoList() {
        if (penaltyOfferingInstInfoList == null) {
            penaltyOfferingInstInfoList = new ArrayList<PenaltyCalculationRequest.PenaltyOfferingInstInfoList>();
        }
        return this.penaltyOfferingInstInfoList;
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
     *         &lt;element name="CancelOfferingInst" type="{http://www.huawei.com/bme/cbsinterface/bcservices}OfferingInstInfo"/&gt;
     *         &lt;element name="DowngradeOfferingInst" type="{http://www.huawei.com/bme/cbsinterface/bcservices}OfferingInstInfo" minOccurs="0"/&gt;
     *         &lt;element name="PromotionOfferingInst" type="{http://www.huawei.com/bme/cbsinterface/bcservices}OfferingInstInfo" minOccurs="0"/&gt;
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
        "cancelOfferingInst",
        "downgradeOfferingInst",
        "promotionOfferingInst"
    })
    public static class PenaltyOfferingInstInfoList
        implements Serializable
    {

        private final static long serialVersionUID = 11082012L;
        @XmlElement(name = "CancelOfferingInst", required = true)
        protected OfferingInstInfo cancelOfferingInst;
        @XmlElement(name = "DowngradeOfferingInst")
        protected OfferingInstInfo downgradeOfferingInst;
        @XmlElement(name = "PromotionOfferingInst")
        protected OfferingInstInfo promotionOfferingInst;

        /**
         * Gets the value of the cancelOfferingInst property.
         * 
         * @return
         *     possible object is
         *     {@link OfferingInstInfo }
         *     
         */
        public OfferingInstInfo getCancelOfferingInst() {
            return cancelOfferingInst;
        }

        /**
         * Sets the value of the cancelOfferingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferingInstInfo }
         *     
         */
        public void setCancelOfferingInst(OfferingInstInfo value) {
            this.cancelOfferingInst = value;
        }

        /**
         * Gets the value of the downgradeOfferingInst property.
         * 
         * @return
         *     possible object is
         *     {@link OfferingInstInfo }
         *     
         */
        public OfferingInstInfo getDowngradeOfferingInst() {
            return downgradeOfferingInst;
        }

        /**
         * Sets the value of the downgradeOfferingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferingInstInfo }
         *     
         */
        public void setDowngradeOfferingInst(OfferingInstInfo value) {
            this.downgradeOfferingInst = value;
        }

        /**
         * Gets the value of the promotionOfferingInst property.
         * 
         * @return
         *     possible object is
         *     {@link OfferingInstInfo }
         *     
         */
        public OfferingInstInfo getPromotionOfferingInst() {
            return promotionOfferingInst;
        }

        /**
         * Sets the value of the promotionOfferingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferingInstInfo }
         *     
         */
        public void setPromotionOfferingInst(OfferingInstInfo value) {
            this.promotionOfferingInst = value;
        }

    }

}
