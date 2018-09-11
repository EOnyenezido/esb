
package com.esb.bme.cbsinterface.cbs.businessmgr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckUVCPartPinResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckUVCPartPinResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CardPartPin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="HotFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "CheckUVCPartPinResult", propOrder = {
    "cardInfo"
})
public class CheckUVCPartPinResult
    implements Serializable
{

    private final static long serialVersionUID = 11082013L;
    @XmlElement(name = "CardInfo")
    protected List<CheckUVCPartPinResult.CardInfo> cardInfo;

    /**
     * Gets the value of the cardInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckUVCPartPinResult.CardInfo }
     * 
     * 
     */
    public List<CheckUVCPartPinResult.CardInfo> getCardInfo() {
        if (cardInfo == null) {
            cardInfo = new ArrayList<CheckUVCPartPinResult.CardInfo>();
        }
        return this.cardInfo;
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
     *         &lt;element name="CardPartPin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="HotFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class CardInfo
        implements Serializable
    {

        private final static long serialVersionUID = 11082013L;
        @XmlElement(name = "CardPartPin", required = true)
        protected String cardPartPin;
        @XmlElement(name = "HotFlag", required = true)
        protected String hotFlag;

        /**
         * Gets the value of the cardPartPin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardPartPin() {
            return cardPartPin;
        }

        /**
         * Sets the value of the cardPartPin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardPartPin(String value) {
            this.cardPartPin = value;
        }

        /**
         * Gets the value of the hotFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotFlag() {
            return hotFlag;
        }

        /**
         * Sets the value of the hotFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotFlag(String value) {
            this.hotFlag = value;
        }

    }

}
