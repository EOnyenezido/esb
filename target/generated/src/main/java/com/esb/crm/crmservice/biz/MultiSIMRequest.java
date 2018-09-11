
package com.esb.crm.crmservice.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSIMRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSIMRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriberNo" type="{http://www.esb.com/crm/crmservice/biz}Common"/&gt;
 *         &lt;element name="PaymMode" type="{http://www.esb.com/crm/crmservice/biz}Paymode"/&gt;
 *         &lt;element name="OperationType" type="{http://www.esb.com/crm/crmservice/biz}OperationType"/&gt;
 *         &lt;element name="OneOffDeductionRequest" type="{http://www.esb.com/crm/crmservice/biz}OneOffDeductionRequest" minOccurs="0"/&gt;
 *         &lt;element name="MMLCommand" type="{http://www.esb.com/crm/crmservice/biz}MMLCommand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeDeductionRollBackRequest" type="{http://www.esb.com/crm/crmservice/biz}FeeDeductionRollBackRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSIMRequest", propOrder = {
    "subscriberNo",
    "paymMode",
    "operationType",
    "oneOffDeductionRequest",
    "mmlCommand",
    "feeDeductionRollBackRequest"
})
public class MultiSIMRequest
    implements Serializable
{

    private final static long serialVersionUID = 11082015L;
    @XmlElement(name = "SubscriberNo", required = true)
    protected Common subscriberNo;
    @XmlElement(name = "PaymMode", required = true)
    protected String paymMode;
    @XmlElement(name = "OperationType", required = true)
    protected String operationType;
    @XmlElement(name = "OneOffDeductionRequest")
    protected OneOffDeductionRequest oneOffDeductionRequest;
    @XmlElement(name = "MMLCommand")
    protected List<MMLCommand> mmlCommand;
    @XmlElement(name = "FeeDeductionRollBackRequest", required = true)
    protected FeeDeductionRollBackRequest feeDeductionRollBackRequest;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link Common }
     *     
     */
    public Common getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Common }
     *     
     */
    public void setSubscriberNo(Common value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the paymMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymMode() {
        return paymMode;
    }

    /**
     * Sets the value of the paymMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymMode(String value) {
        this.paymMode = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the oneOffDeductionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OneOffDeductionRequest }
     *     
     */
    public OneOffDeductionRequest getOneOffDeductionRequest() {
        return oneOffDeductionRequest;
    }

    /**
     * Sets the value of the oneOffDeductionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneOffDeductionRequest }
     *     
     */
    public void setOneOffDeductionRequest(OneOffDeductionRequest value) {
        this.oneOffDeductionRequest = value;
    }

    /**
     * Gets the value of the mmlCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMMLCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MMLCommand }
     * 
     * 
     */
    public List<MMLCommand> getMMLCommand() {
        if (mmlCommand == null) {
            mmlCommand = new ArrayList<MMLCommand>();
        }
        return this.mmlCommand;
    }

    /**
     * Gets the value of the feeDeductionRollBackRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDeductionRollBackRequest }
     *     
     */
    public FeeDeductionRollBackRequest getFeeDeductionRollBackRequest() {
        return feeDeductionRollBackRequest;
    }

    /**
     * Sets the value of the feeDeductionRollBackRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDeductionRollBackRequest }
     *     
     */
    public void setFeeDeductionRollBackRequest(FeeDeductionRollBackRequest value) {
        this.feeDeductionRollBackRequest = value;
    }

}
